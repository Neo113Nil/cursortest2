package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import kotlin.Lazy;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.internal.api.IterableItemsApiValue;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;
import ru.ok.android.util.Files;
import xsna.ac;
import xsna.bpn0;
import xsna.e9e0;
import xsna.f2l;
import xsna.mu1;
import xsna.odj;
import xsna.s3q0;
import xsna.yq1;
import xsna.zcl;

/* compiled from: DbUploader.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class DbUploader implements Uploader {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "CallAnalyticsDbUploader";
    private final EventChannel channel;
    private final DatabaseHelper dbHelper;
    private volatile Uploader.IdleStateProvider idleState;
    private volatile long lastUploadTime;
    private final Lock lock;
    private final Lazy multiUploadHelper$delegate;
    private final int recordToUploadCount;
    private final Long timeBeforeNextUploadMs;
    private final UploadHelper uploadHelper = new UploadHelper(LOG_TAG);
    private final CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();

    /* compiled from: DbUploader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DbUploader(e9e0<Looper> e9e0Var, e9e0<File> e9e0Var2, Lock lock, EventChannel eventChannel, DatabaseHelper databaseHelper, int i, Long l) {
        this.lock = lock;
        this.channel = eventChannel;
        this.dbHelper = databaseHelper;
        this.recordToUploadCount = i;
        this.timeBeforeNextUploadMs = l;
        this.multiUploadHelper$delegate = new bpn0(new yq1(7, e9e0Var, this));
        try {
            new Handler(e9e0Var.get()).post(new f2l(0, e9e0Var2, this));
        } catch (Throwable th) {
            this.logger.report(LOG_TAG, "Error schedule legacy storage remove", new StatDeliveryException("Error schedule legacy storage remove", th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(e9e0 e9e0Var, DbUploader dbUploader) {
        try {
            File file = (File) e9e0Var.get();
            if (file.exists()) {
                Files.delete(file);
            }
        } catch (Throwable th) {
            dbUploader.logger.report(LOG_TAG, "Error remove legacy storage", new StatDeliveryException("Error remove legacy storage", th));
        }
    }

    private final MultiUploadHelper getMultiUploadHelper() {
        return (MultiUploadHelper) this.multiUploadHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiUploadHelper multiUploadHelper_delegate$lambda$0(e9e0 e9e0Var, DbUploader dbUploader) {
        return new MultiUploadHelper(e9e0Var, dbUploader.channel, dbUploader.timeBeforeNextUploadMs, LOG_TAG, new ac(dbUploader, 28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean multiUploadHelper_delegate$lambda$0$0(DbUploader dbUploader) {
        Uploader.IdleStateProvider idleStateProvider = dbUploader.idleState;
        boolean isCallActive = idleStateProvider != null ? idleStateProvider.isCallActive() : false;
        int i = isCallActive ? dbUploader.recordToUploadCount : 1;
        Lock lock = dbUploader.lock;
        lock.lock();
        try {
            int count = dbUploader.dbHelper.count();
            lock.unlock();
            CallAnalyticsLogger callAnalyticsLogger = dbUploader.logger;
            StringBuilder a = odj.a(count, dbUploader.recordToUploadCount, "hasMoreElements(total=", ",limit=", ",isCallActive=");
            a.append(isCallActive);
            a.append(")->");
            a.append(i);
            callAnalyticsLogger.d(LOG_TAG, a.toString());
            return count > i;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 upload$lambda$0$0(DbUploader dbUploader, CallAnalyticsConfig callAnalyticsConfig, Iterator it) {
        dbUploader.uploadImpl(callAnalyticsConfig.getOkApi().getApiClient(), it);
        return s3q0.a;
    }

    private final void uploadImpl(ApiClient apiClient, Iterator<String> it) {
        try {
            if (!it.hasNext()) {
                this.logger.d(LOG_TAG, "Nothing to upload with empty query");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.uploadHelper.executeApiMethod$calls_sdk_analytics_release(apiClient, this.channel, new IterableItemsApiValue(it));
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            CallAnalyticsLogger callAnalyticsLogger = this.logger;
            String apiMethod = this.channel.getApiMethod();
            String collector = this.channel.getCollector();
            if (collector == null) {
                collector = "-";
            }
            callAnalyticsLogger.d(LOG_TAG, "upload completed, took " + currentTimeMillis2 + "ms. channel=" + apiMethod + ", collector=" + collector);
            this.lastUploadTime = getMultiUploadHelper().currentTime();
        } catch (ApiInvocationException e) {
            int errorCode = e.getErrorCode();
            if (errorCode == 2 || errorCode == 453 || errorCode == 102 || errorCode == 103) {
                this.logger.w(LOG_TAG, "recoverable invocation error occurred, will retry");
                throw e;
            }
            this.logger.e(LOG_TAG, "upload failed: " + e.getErrorMessage() + ", removing possibly broken logs");
        } catch (ApiRequestException e2) {
            this.logger.e(LOG_TAG, "upload failed: " + e2.getMessage() + ", removing likely broken logs");
        } catch (JsonSerializeException e3) {
            this.logger.e(LOG_TAG, "upload failed: " + e3.getMessage() + ", removing likely broken logs");
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void drop() {
        Lock lock = this.lock;
        lock.lock();
        try {
            this.dbHelper.drop();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            lock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public File getSink() {
        return new File("db-uploader-stub");
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void setIdleStateProvider(Uploader.IdleStateProvider idleStateProvider) {
        Uploader.IdleStateProvider idleStateProvider2 = this.idleState;
        Boolean valueOf = idleStateProvider2 != null ? Boolean.valueOf(idleStateProvider2.isIdle()) : null;
        this.idleState = idleStateProvider;
        getMultiUploadHelper().setIdleStateProvider(valueOf, idleStateProvider);
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void upload() {
        Uploader.IdleStateProvider idleStateProvider = this.idleState;
        if (idleStateProvider != null && !idleStateProvider.isIdle()) {
            this.logger.d(LOG_TAG, "call is not idle, postpone upload");
            return;
        }
        CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
        if (config == null) {
            this.logger.d(LOG_TAG, "api not initialized, will retry");
            return;
        }
        if (!getMultiUploadHelper().isNowGoodTimeToUploadNext(this.lastUploadTime)) {
            this.logger.d(LOG_TAG, "it's not a time to upload next. do it a bit later");
            getMultiUploadHelper().scheduleNextUpload(false, 1);
            return;
        }
        Lock lock = this.lock;
        lock.lock();
        try {
            int count = this.dbHelper.count();
            if (count > 0) {
                this.dbHelper.grab(this.recordToUploadCount, new mu1(13, this, config));
            } else {
                this.logger.d(LOG_TAG, "not enough items to start upload: " + count + ". At least one required");
            }
            getMultiUploadHelper().scheduleNextUpload(false, 1);
            s3q0 s3q0Var = s3q0.a;
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
