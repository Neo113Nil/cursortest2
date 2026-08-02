package ru.ok.android.externcalls.sdk.analytics.internal;

import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfigurationImpl;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender;

/* compiled from: ConversationAnalyticsSenderImpl.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class ConversationAnalyticsSenderImpl implements ConversationAnalyticsSender {
    private final ConversationAnalyticsConfigurationImpl configuration = new ConversationAnalyticsConfigurationImpl();

    @Override // ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender
    public void forceSendScheduledEvents() {
        CallAnalyticsSender.INSTANCE.forceSendScheduledEvents();
    }

    @Override // ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender
    public ConversationAnalyticsConfigurationImpl getConfiguration() {
        return this.configuration;
    }
}
