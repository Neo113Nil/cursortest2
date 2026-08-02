package ru.ok.android.externcalls.sdk.analytics;

/* compiled from: ConversationAnalyticsConfigurationImpl.kt */
/* loaded from: classes9.dex */
public final class ConversationAnalyticsConfigurationImpl implements ConversationAnalyticsConfiguration {
    private ApplicationNameProvider applicationNameProvider;
    private UploadConfigProvider uploadConfigProvider;

    public final ApplicationNameProvider getApplicationNameProvider() {
        return this.applicationNameProvider;
    }

    public final UploadConfigProvider getUploadConfigProvider() {
        return this.uploadConfigProvider;
    }

    @Override // ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfiguration
    public void setApplicationNameProvider(ApplicationNameProvider applicationNameProvider) {
        this.applicationNameProvider = applicationNameProvider;
    }

    @Override // ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfiguration
    public void setUploadConfigProvider(UploadConfigProvider uploadConfigProvider) {
        this.uploadConfigProvider = uploadConfigProvider;
    }
}
