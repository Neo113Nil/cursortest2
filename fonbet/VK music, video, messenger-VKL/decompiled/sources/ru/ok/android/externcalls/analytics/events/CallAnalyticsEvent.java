package ru.ok.android.externcalls.analytics.events;

import java.util.Map;

/* compiled from: CallAnalyticsEvent.kt */
/* loaded from: classes9.dex */
public abstract class CallAnalyticsEvent {
    private final String collector;

    public abstract String getApiMethodName();

    public String getCollector() {
        return this.collector;
    }

    public abstract Map<String, EventItemValue> getItems();
}
