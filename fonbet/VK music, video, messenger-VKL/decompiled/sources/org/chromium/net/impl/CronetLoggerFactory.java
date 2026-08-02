package org.chromium.net.impl;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.telemetry.CronetLoggerImpl;

/* loaded from: classes11.dex */
public final class CronetLoggerFactory {
    private static final int SAMPLE_RATE_PER_SECOND = 1;
    private static final String TAG = "CronetLoggerFactory";
    private static CronetLogger sLogger;

    /* loaded from: classes8.dex */
    public static final class SwapLoggerForTesting implements AutoCloseable {
        public SwapLoggerForTesting(CronetLogger cronetLogger) {
            CronetLoggerFactory.setLoggerForTesting(cronetLogger);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            CronetLoggerFactory.setLoggerForTesting(null);
        }
    }

    private CronetLoggerFactory() {
    }

    public static CronetLogger createLogger(Context context, CronetLogger.CronetSource cronetSource) {
        CronetLogger cronetLogger;
        synchronized (CronetLoggerFactory.class) {
            if (sLogger == null && Build.VERSION.SDK_INT >= 30 && CronetManifest.isAppOptedInForTelemetry(context, cronetSource)) {
                try {
                    sLogger = new CronetLoggerImpl(1);
                } catch (Exception e) {
                    Log.e(TAG, "Exception creating an instance of CronetLoggerImpl", e);
                }
            }
            if (sLogger == null) {
                sLogger = new NoOpLogger();
            }
            cronetLogger = sLogger;
        }
        return cronetLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setLoggerForTesting(@Nullable CronetLogger cronetLogger) {
        synchronized (CronetLoggerFactory.class) {
            sLogger = cronetLogger;
        }
    }
}
