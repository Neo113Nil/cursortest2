package ru.ok.android.externcalls.analytics;

import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;
import xsna.sni0;

/* compiled from: CallAnalyticsSender.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class CallAnalyticsSender {
    public static final CallAnalyticsSender INSTANCE = new CallAnalyticsSender();
    private static final String LOG_TAG = "CallAnalyticsSender";
    private static volatile Listener listener;

    /* compiled from: CallAnalyticsSender.kt */
    public interface Listener {
        void onNewEvent(CallAnalyticsEvent callAnalyticsEvent);
    }

    private CallAnalyticsSender() {
    }

    public final void forceSendScheduledEvents() {
        EventQueueCollector.flushAll();
    }

    public final synchronized void initialize(CallAnalyticsConfig callAnalyticsConfig) {
        CallAnalyticsConfigStorage callAnalyticsConfigStorage = CallAnalyticsConfigStorage.INSTANCE;
        if (callAnalyticsConfigStorage.getConfig() == null) {
            callAnalyticsConfigStorage.setConfig(callAnalyticsConfig);
        }
    }

    public final void send(CallAnalyticsEvent callAnalyticsEvent) {
        try {
            Listener listener2 = listener;
            if (listener2 != null) {
                listener2.onNewEvent(callAnalyticsEvent);
            }
        } catch (Throwable th) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Error while notifying external listener", th);
        }
        CallAnalyticsConfigStorage callAnalyticsConfigStorage = CallAnalyticsConfigStorage.INSTANCE;
        if (callAnalyticsConfigStorage.getConfig() == null) {
            callAnalyticsConfigStorage.getLogger().e(LOG_TAG, "CallAnalyticsSender is not initialized, event=" + callAnalyticsEvent + " is skipped");
            return;
        }
        EventQueueCollector.getInstance(new EventChannel(callAnalyticsEvent.getApiMethodName(), null, null, null, false, 30, null)).addEvent(callAnalyticsEvent);
    }

    public final void setEventListener(Listener listener2) {
        listener = listener2;
    }

    public final void setIdle(final boolean z, final boolean z2) {
        CallAnalyticsConfigStorage.INSTANCE.getLogger().d(LOG_TAG, sni0.a("CallAnalyticsSender setIdle(isIdle=", ",isCallActive=", ")", z, z2));
        EventQueueCollector.setIdleStateProvider(new EventQueueCollector.IdleStateProvider() { // from class: ru.ok.android.externcalls.analytics.CallAnalyticsSender$setIdle$1
            @Override // ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector.IdleStateProvider
            public boolean isCallActive() {
                return z2;
            }

            @Override // ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector.IdleStateProvider
            public boolean isIdle() {
                return z;
            }
        });
    }
}
