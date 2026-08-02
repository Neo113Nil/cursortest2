package ru.ok.android.onelog;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.onelog.OneLogErrorHandler;
import ru.ok.android.utils.Logger;
import xsna.e9e0;
import xsna.er;
import xsna.xz3;

/* loaded from: classes11.dex */
public final class OneLogImpl implements OneLogAppender {

    @SuppressLint({"StaticFieldLeak"})
    private static final OneLogImpl INSTANCE = new OneLogImpl();
    private volatile e9e0<ApiClient> apiClient;

    @Nullable
    private volatile OneLogExternalUploader oneLogExternalUploader;

    @Nullable
    private volatile Executor uploadExecutor;
    private volatile int uploadJobId = 15261;
    private volatile boolean batchCollectorsEnabled = false;
    private volatile long defSilenceMillisToUpload = 15000;
    private volatile int defFileLengthToUpload = 100000;
    private volatile int defCountToUpload = 500;
    private final AtomicReference<MaxTimeToUploadRecord> maxTimeToUploadRef = new AtomicReference<>();
    private volatile boolean sendUploadTriggerEnabled = false;
    private volatile Supplier<Boolean> forceFallbackLogs = null;
    private volatile Supplier<Boolean> shouldNeverJson = null;
    private volatile OneLogErrorHandler errorHandler = new OneLogErrorHandler.Default();

    /* loaded from: classes9.dex */
    public static class MaxTimeToUploadRecord {

        @Nullable
        private final String collector;
        private final long maxMillisToUpload;
        private final MaxTimeToUploadRecord next;

        @Nullable
        private final String operation;

        public MaxTimeToUploadRecord(@Nullable String str, @Nullable String str2, long j, @Nullable MaxTimeToUploadRecord maxTimeToUploadRecord) {
            this.collector = str;
            this.operation = str2;
            this.maxMillisToUpload = j;
            this.next = maxTimeToUploadRecord;
        }

        public static long findMaxMillisToUpload(@Nullable MaxTimeToUploadRecord maxTimeToUploadRecord, @NonNull String str, @NonNull String str2) {
            String str3;
            long j = Long.MAX_VALUE;
            while (maxTimeToUploadRecord != null) {
                String str4 = maxTimeToUploadRecord.collector;
                if ((str4 == null || str4.equals(str)) && ((str3 = maxTimeToUploadRecord.operation) == null || str3.equals(str2))) {
                    j = Math.min(j, maxTimeToUploadRecord.maxMillisToUpload);
                }
                maxTimeToUploadRecord = maxTimeToUploadRecord.next;
            }
            return j;
        }
    }

    @NonNull
    public static OneLogImpl getInstance() {
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startUpload$0(String str, OneLogTrigger oneLogTrigger) {
        try {
            upload(str, oneLogTrigger);
        } catch (IOException e) {
            Logger.e(e, "Cannot upload");
        }
    }

    private static long toMillis(long j, @NonNull TimeUnit timeUnit) {
        if (j == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        return timeUnit.toMillis(j);
    }

    @Override // ru.ok.android.onelog.OneLogAppender
    public void append(@NonNull OneLogItem oneLogItem) {
        Collector.getInstance(oneLogItem.collector()).append(oneLogItem);
    }

    public void attachApiClient(@NonNull e9e0<ApiClient> e9e0Var) {
        this.apiClient = e9e0Var;
    }

    public void clearAllMaxTimeToUpload() {
        this.maxTimeToUploadRef.set(null);
    }

    @Override // ru.ok.android.onelog.OneLogAppender, java.io.Flushable
    public void flush() {
        Collector.flushAll();
    }

    @NonNull
    public ApiClient getApiClient() {
        if (this.apiClient == null) {
            throw new IllegalStateException("ApiClient not attached to Collector");
        }
        ApiClient apiClient = this.apiClient.get();
        if (apiClient != null) {
            return apiClient;
        }
        throw new IllegalStateException("ApiClient not attached to Collector");
    }

    @NonNull
    @Deprecated
    public String getApplicationParam() {
        return Uploader.getApplicationParam();
    }

    @Deprecated
    public Context getContext() {
        return ApplicationProvider.getApplication();
    }

    public int getDefCountToUpload() {
        return this.defCountToUpload;
    }

    public int getDefFileLengthToUpload() {
        return this.defFileLengthToUpload;
    }

    public long getDefSilenceMillisToUpload() {
        return this.defSilenceMillisToUpload;
    }

    @NonNull
    public OneLogErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public boolean getForceFallbackLogs() {
        return this.forceFallbackLogs != null && this.forceFallbackLogs.get().booleanValue();
    }

    public long getMaxMillisToUpload(@NonNull String str, @NonNull String str2) {
        return MaxTimeToUploadRecord.findMaxMillisToUpload(this.maxTimeToUploadRef.get(), str, str2);
    }

    @NonNull
    @Deprecated
    public String getPlatformParam() {
        return Uploader.getPlatformParam();
    }

    public boolean getShouldNeverJson() {
        return this.shouldNeverJson != null && this.shouldNeverJson.get().booleanValue();
    }

    public int getUploadJobId() {
        return this.uploadJobId;
    }

    public boolean isBatchCollectorsEnabled() {
        return this.batchCollectorsEnabled;
    }

    public boolean isSendUploadTriggerEnabled() {
        return this.sendUploadTriggerEnabled;
    }

    public void setBatchCollectorsEnabled(boolean z) {
        this.batchCollectorsEnabled = z;
    }

    public void setDefCountToUpload(int i) {
        this.defCountToUpload = i;
    }

    public void setDefFileLengthToUpload(int i) {
        this.defFileLengthToUpload = i;
    }

    public void setDefMaxTimeToUpload(long j, @NonNull TimeUnit timeUnit) {
        setMaxMillisToUpload(null, null, toMillis(j, timeUnit));
    }

    public void setDefSilenceTimeToUpload(long j, @NonNull TimeUnit timeUnit) {
        this.defSilenceMillisToUpload = toMillis(j, timeUnit);
    }

    public void setErrorHandler(@NonNull OneLogErrorHandler oneLogErrorHandler) {
        this.errorHandler = oneLogErrorHandler;
    }

    public void setForceFallbackLogs(@Nullable Supplier<Boolean> supplier) {
        this.forceFallbackLogs = supplier;
    }

    public void setMaxMillisToUpload(@Nullable String str, @Nullable String str2, long j) {
        while (true) {
            MaxTimeToUploadRecord maxTimeToUploadRecord = this.maxTimeToUploadRef.get();
            String str3 = str;
            String str4 = str2;
            long j2 = j;
            if (er.h(this.maxTimeToUploadRef, maxTimeToUploadRecord, new MaxTimeToUploadRecord(str3, str4, j2, maxTimeToUploadRecord))) {
                return;
            }
            str = str3;
            str2 = str4;
            j = j2;
        }
    }

    public void setMaxTimeToUpload(@NonNull String str, @NonNull String str2, long j, @NonNull TimeUnit timeUnit) {
        setMaxMillisToUpload(str, str2, toMillis(j, timeUnit));
    }

    public void setMaxTimeToUploadAny(@NonNull String str, long j, @NonNull TimeUnit timeUnit) {
        setMaxMillisToUpload(str, null, toMillis(j, timeUnit));
    }

    public void setSendUploadTriggerEnabled(boolean z) {
        this.sendUploadTriggerEnabled = z;
    }

    public void setShouldNeverJson(@Nullable Supplier<Boolean> supplier) {
        this.shouldNeverJson = supplier;
    }

    public void setUploadExecutor(@Nullable Executor executor) {
        this.uploadExecutor = executor;
    }

    public void setUploadHandler(@Nullable OneLogExternalUploader oneLogExternalUploader) {
        this.oneLogExternalUploader = oneLogExternalUploader;
    }

    public void setUploadJobId(int i) {
        this.uploadJobId = i;
    }

    public void startUpload(String str, @Nullable OneLogTrigger oneLogTrigger) {
        OneLogExternalUploader oneLogExternalUploader = this.oneLogExternalUploader;
        if (oneLogExternalUploader != null) {
            oneLogExternalUploader.upload(str, oneLogTrigger);
            return;
        }
        Executor executor = this.uploadExecutor;
        if (executor == null) {
            UploadService.startUpload(str, oneLogTrigger);
        } else {
            executor.execute(new xz3(4, str, oneLogTrigger));
        }
    }

    public void upload(@NonNull OneLogItem oneLogItem) throws IOException, ApiException {
        Uploader.execute(getApiClient(), oneLogItem);
    }

    public void upload(@NonNull Collection<OneLogItem> collection) throws IOException, ApiException {
        Uploader.execute(getApiClient(), collection);
    }

    public static void upload(@NonNull String str, @Nullable OneLogTrigger oneLogTrigger) throws IOException {
        Collector.getInstance(str).upload(oneLogTrigger);
    }

    @Deprecated
    public void attachBaseContext(@NonNull Context context) {
    }

    @Deprecated
    public void setApplicationInfo(@NonNull String str, @NonNull String str2, int i) {
    }
}
