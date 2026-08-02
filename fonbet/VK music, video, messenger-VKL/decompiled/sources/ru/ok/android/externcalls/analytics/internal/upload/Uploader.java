package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Looper;
import java.io.File;
import java.util.concurrent.locks.Lock;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.e9e0;

/* compiled from: Uploader.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public interface Uploader {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: Uploader.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DEFAULT_EVENT_COUNT_TO_UPLOAD = 15;

        private Companion() {
        }

        public final Uploader create(e9e0<Looper> e9e0Var, e9e0<File> e9e0Var2, Lock lock, EventChannel eventChannel, boolean z, DatabaseHelper databaseHelper) {
            UploadConfig upload;
            UploadConfig upload2;
            UploadConfig upload3;
            UploadConfig upload4;
            UploadConfig upload5;
            CallAnalyticsConfigStorage callAnalyticsConfigStorage = CallAnalyticsConfigStorage.INSTANCE;
            CallAnalyticsConfig config = callAnalyticsConfigStorage.getConfig();
            int maxLocalCacheFileCount = (config == null || (upload5 = config.getUpload()) == null) ? 1 : upload5.getMaxLocalCacheFileCount();
            CallAnalyticsConfig config2 = callAnalyticsConfigStorage.getConfig();
            Long timeToUploadNextMs = (config2 == null || (upload4 = config2.getUpload()) == null) ? null : upload4.getTimeToUploadNextMs();
            CallAnalyticsConfig config3 = callAnalyticsConfigStorage.getConfig();
            boolean z2 = false;
            boolean disableUploadWhenCallIsActive = (config3 == null || (upload3 = config3.getUpload()) == null) ? false : upload3.getDisableUploadWhenCallIsActive();
            CallAnalyticsConfig config4 = callAnalyticsConfigStorage.getConfig();
            if (config4 != null && (upload2 = config4.getUpload()) != null) {
                z2 = upload2.getAutoDetectFileCompression();
            }
            boolean z3 = z2;
            CallAnalyticsConfig config5 = callAnalyticsConfigStorage.getConfig();
            return databaseHelper != null ? new DbUploader(e9e0Var, e9e0Var2, lock, eventChannel, databaseHelper, (config5 == null || (upload = config5.getUpload()) == null) ? 15 : upload.getEventCountToUploadNumber(), timeToUploadNextMs) : maxLocalCacheFileCount > 1 ? new MultiFileUploader(e9e0Var, e9e0Var2, lock, eventChannel, z, z3, maxLocalCacheFileCount, timeToUploadNextMs) : new SingleFileUploader(e9e0Var2, lock, eventChannel, disableUploadWhenCallIsActive, z3, z);
        }
    }

    /* compiled from: Uploader.kt */
    public interface IdleStateProvider {
        boolean isCallActive();

        boolean isIdle();
    }

    static Uploader create(e9e0<Looper> e9e0Var, e9e0<File> e9e0Var2, Lock lock, EventChannel eventChannel, boolean z, DatabaseHelper databaseHelper) {
        return Companion.create(e9e0Var, e9e0Var2, lock, eventChannel, z, databaseHelper);
    }

    void drop();

    File getSink();

    void upload();

    default void setIdleStateProvider(IdleStateProvider idleStateProvider) {
    }
}
