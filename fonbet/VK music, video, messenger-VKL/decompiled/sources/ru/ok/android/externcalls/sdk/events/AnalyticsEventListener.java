package ru.ok.android.externcalls.sdk.events;

import java.util.Map;

/* compiled from: AnalyticsEventListener.kt */
/* loaded from: classes9.dex */
public interface AnalyticsEventListener {

    /* compiled from: AnalyticsEventListener.kt */
    public interface AnalyticsEvent {
        Map<String, Object> getData();

        String getName();

        String getStringValue();

        long getTimestamp();

        Number getValue();
    }

    void onAnalyticsEvent(AnalyticsEvent analyticsEvent);
}
