package ru.ok.android.externcalls.analytics.config;

import ru.ok.android.externcalls.analytics.internal.log.DefaultCallAnalyticsLogger;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;
import ru.ok.android.sdk.api.OkApi;
import xsna.zcl;

/* compiled from: CallAnalyticsConfig.kt */
/* loaded from: classes9.dex */
public final class CallAnalyticsConfig {
    private final EventMetaParamsConfig eventMetaParams;
    private final CallAnalyticsLogger logger;
    private final OkApi okApi;
    private final UploadConfig upload;

    public CallAnalyticsConfig(OkApi okApi, EventMetaParamsConfig eventMetaParamsConfig, CallAnalyticsLogger callAnalyticsLogger, UploadConfig uploadConfig) {
        this.okApi = okApi;
        this.eventMetaParams = eventMetaParamsConfig;
        this.logger = callAnalyticsLogger;
        this.upload = uploadConfig;
    }

    public final EventMetaParamsConfig getEventMetaParams() {
        return this.eventMetaParams;
    }

    public final CallAnalyticsLogger getLogger() {
        return this.logger;
    }

    public final OkApi getOkApi() {
        return this.okApi;
    }

    public final UploadConfig getUpload() {
        return this.upload;
    }

    public /* synthetic */ CallAnalyticsConfig(OkApi okApi, EventMetaParamsConfig eventMetaParamsConfig, CallAnalyticsLogger callAnalyticsLogger, UploadConfig uploadConfig, int i, zcl zclVar) {
        this(okApi, (i & 2) != 0 ? new EventMetaParamsConfig(null, 1, null) : eventMetaParamsConfig, (i & 4) != 0 ? new DefaultCallAnalyticsLogger() : callAnalyticsLogger, (i & 8) != 0 ? new UploadConfig(0, null, 0L, 0L, null, null, null, null, null, null, null, null, 4095, null) : uploadConfig);
    }
}
