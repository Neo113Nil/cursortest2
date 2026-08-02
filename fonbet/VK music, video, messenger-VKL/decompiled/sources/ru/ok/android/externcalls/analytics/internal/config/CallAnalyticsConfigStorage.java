package ru.ok.android.externcalls.analytics.internal.config;

import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.android.externcalls.analytics.internal.log.DefaultCallAnalyticsLogger;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* compiled from: CallAnalyticsConfigStorage.kt */
/* loaded from: classes9.dex */
public final class CallAnalyticsConfigStorage {
    private static volatile CallAnalyticsConfig config;
    public static final CallAnalyticsConfigStorage INSTANCE = new CallAnalyticsConfigStorage();
    private static final DefaultCallAnalyticsLogger defaultLogger = new DefaultCallAnalyticsLogger();

    private CallAnalyticsConfigStorage() {
    }

    public final CallAnalyticsConfig getConfig() {
        return config;
    }

    public final CallAnalyticsLogger getLogger() {
        CallAnalyticsLogger logger;
        CallAnalyticsConfig callAnalyticsConfig = config;
        return (callAnalyticsConfig == null || (logger = callAnalyticsConfig.getLogger()) == null) ? defaultLogger : logger;
    }

    public final UploadConfig getUpload() {
        UploadConfig upload;
        CallAnalyticsConfig callAnalyticsConfig = config;
        return (callAnalyticsConfig == null || (upload = callAnalyticsConfig.getUpload()) == null) ? new UploadConfig(0, null, 0L, 0L, null, null, null, null, null, null, null, null, 4095, null) : upload;
    }

    public final void setConfig(CallAnalyticsConfig callAnalyticsConfig) {
        config = callAnalyticsConfig;
    }
}
