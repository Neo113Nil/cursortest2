package ru.ok.android.externcalls.analytics.internal.upload;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.internal.api.StreamingItemsApiValue;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;
import ru.ok.android.util.Files;
import xsna.asp;
import xsna.e9e0;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: AbstractUploader.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public abstract class AbstractUploader implements Uploader {
    private final boolean autoDetectContentCompression;
    private final EventChannel channel;
    private volatile Uploader.IdleStateProvider idleState;
    private final boolean isContentCompressed;
    private final Lock lock;
    private final String logTag;
    private final CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
    private final e9e0<File> storage;
    private final UploadHelper uploadHelper;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractUploader.kt */
    public static final class UploadResult {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UploadResult[] $VALUES;
        public static final UploadResult SUCCESS = new UploadResult("SUCCESS", 0);
        public static final UploadResult SKIP = new UploadResult(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 1);
        public static final UploadResult ERROR = new UploadResult("ERROR", 2);
        public static final UploadResult BAD_CONTENT = new UploadResult("BAD_CONTENT", 3);
        public static final UploadResult RECOVERABLE_ERROR = new UploadResult("RECOVERABLE_ERROR", 4);

        private static final /* synthetic */ UploadResult[] $values() {
            return new UploadResult[]{SUCCESS, SKIP, ERROR, BAD_CONTENT, RECOVERABLE_ERROR};
        }

        static {
            UploadResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private UploadResult(String str, int i) {
        }

        public static zrp<UploadResult> getEntries() {
            return $ENTRIES;
        }

        public static UploadResult valueOf(String str) {
            return (UploadResult) Enum.valueOf(UploadResult.class, str);
        }

        public static UploadResult[] values() {
            return (UploadResult[]) $VALUES.clone();
        }
    }

    public AbstractUploader(e9e0<File> e9e0Var, Lock lock, EventChannel eventChannel, boolean z, boolean z2, String str) {
        this.storage = e9e0Var;
        this.lock = lock;
        this.channel = eventChannel;
        this.isContentCompressed = z;
        this.autoDetectContentCompression = z2;
        this.logTag = str;
        this.uploadHelper = new UploadHelper(str);
    }

    private final UploadResult uploadFileWithContent(ApiClient apiClient, File file) throws ApiInvocationException, IOException {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.uploadHelper.executeApiMethod$calls_sdk_analytics_release(apiClient, this.channel, new StreamingItemsApiValue(file, this.autoDetectContentCompression ? Files.isCompressed(file) : this.isContentCompressed));
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            CallAnalyticsLogger callAnalyticsLogger = this.logger;
            String str = this.logTag;
            String apiMethod = this.channel.getApiMethod();
            String collector = this.channel.getCollector();
            if (collector == null) {
                collector = "-";
            }
            callAnalyticsLogger.d(str, "upload completed, took " + currentTimeMillis2 + "ms. channel=" + apiMethod + ", collector=" + collector);
            return UploadResult.SUCCESS;
        } catch (ApiInvocationException e) {
            int errorCode = e.getErrorCode();
            if (errorCode == 2 || errorCode == 453 || errorCode == 102 || errorCode == 103) {
                this.logger.w(this.logTag, "recoverable invocation error occurred, will retry");
                throw e;
            }
            this.logger.e(this.logTag, "upload failed: " + e.getErrorMessage() + ", removing possibly broken logs");
            return UploadResult.BAD_CONTENT;
        } catch (ApiRequestException e2) {
            this.logger.e(this.logTag, "upload failed: " + e2.getMessage() + ", removing likely broken logs");
            return UploadResult.BAD_CONTENT;
        } catch (JsonSerializeException e3) {
            this.logger.e(this.logTag, "upload failed: " + e3.getMessage() + ", removing likely broken logs");
            return UploadResult.BAD_CONTENT;
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void drop() {
        Lock lock = this.lock;
        lock.lock();
        try {
            File file = this.storage.get();
            try {
                if (file.exists()) {
                    Files.delete(file);
                    this.logger.d(this.logTag, "storage dropped:  " + file);
                } else {
                    this.logger.d(this.logTag, "don't drop storage " + file + ", file doesn't exist");
                }
            } catch (IOException e) {
                this.logger.e(this.logTag, "storage drop failed " + file, e);
            }
            s3q0 s3q0Var = s3q0.a;
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final File ensureStorageIsOfCorrectType(boolean z) {
        File file = this.storage.get();
        if (file.exists() && file.isDirectory() != z) {
            try {
                Files.delete(file);
                return file;
            } catch (IOException unused) {
                this.logger.d(this.logTag, "File " + file.getName() + " isDirectory != " + z + " but can not be deleted");
            }
        }
        return file;
    }

    public final EventChannel getChannel() {
        return this.channel;
    }

    public final Uploader.IdleStateProvider getIdleState() {
        return this.idleState;
    }

    public final Lock getLock() {
        return this.lock;
    }

    public final CallAnalyticsLogger getLogger() {
        return this.logger;
    }

    public final e9e0<File> getStorage() {
        return this.storage;
    }

    public final void setIdleState(Uploader.IdleStateProvider idleStateProvider) {
        this.idleState = idleStateProvider;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void setIdleStateProvider(Uploader.IdleStateProvider idleStateProvider) {
        this.idleState = idleStateProvider;
    }

    public final UploadResult uploadFile(File file) {
        UploadResult uploadResult;
        Lock lock = this.lock;
        lock.lock();
        try {
            CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
            if (config == null) {
                this.logger.d(this.logTag, "api not initialized, will retry");
                uploadResult = UploadResult.SKIP;
            } else {
                try {
                    if (file.isFile() && Files.length(file) != 0) {
                        UploadResult uploadFileWithContent = uploadFileWithContent(config.getOkApi().getApiClient(), file);
                        Files.delete(file);
                        uploadResult = uploadFileWithContent;
                    }
                    this.logger.d(this.logTag, "nothing to upload");
                    try {
                        Files.delete(file);
                    } catch (Throwable th) {
                        this.logger.e(this.logTag, "can't delete empty file " + file.getPath(), th);
                    }
                    uploadResult = UploadResult.SKIP;
                } catch (IOException e) {
                    this.logger.e(this.logTag, "upload failed due to io error", e);
                    uploadResult = UploadResult.ERROR;
                } catch (ApiException e2) {
                    this.logger.e(this.logTag, "upload failed due to api error", e2);
                    uploadResult = UploadResult.RECOVERABLE_ERROR;
                }
            }
            return uploadResult;
        } finally {
            lock.unlock();
        }
    }
}
