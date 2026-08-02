package ru.ok.android.externcalls.sdk.events;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.events.AnalyticsEventListener;
import xsna.zcl;

/* compiled from: SharedAnalyticsEvent.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class SharedAnalyticsEvent implements AnalyticsEventListener.AnalyticsEvent {
    public static final Companion Companion = new Companion(null);
    private final Map<String, Object> data;

    /* compiled from: SharedAnalyticsEvent.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        @CallInternalApi
        public final AnalyticsEventListener.AnalyticsEvent toEventListenerEvent(CallAnalyticsEvent callAnalyticsEvent) {
            zcl zclVar = null;
            if (callAnalyticsEvent instanceof SdkMetricStatEvent) {
                return new SharedAnalyticsEvent((SdkMetricStatEvent) callAnalyticsEvent, zclVar);
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SharedAnalyticsEvent(SdkMetricStatEvent sdkMetricStatEvent, zcl zclVar) {
        this(sdkMetricStatEvent);
    }

    @CallInternalApi
    public static final AnalyticsEventListener.AnalyticsEvent toEventListenerEvent(CallAnalyticsEvent callAnalyticsEvent) {
        return Companion.toEventListenerEvent(callAnalyticsEvent);
    }

    private final Object toRaw(EventItemValue eventItemValue) {
        if (eventItemValue instanceof EventItemValue.StringValue) {
            return ((EventItemValue.StringValue) eventItemValue).m338unboximpl();
        }
        if (eventItemValue instanceof EventItemValue.FloatValue) {
            return Float.valueOf(((EventItemValue.FloatValue) eventItemValue).m310unboximpl());
        }
        if (eventItemValue instanceof EventItemValue.LongValue) {
            return Long.valueOf(((EventItemValue.LongValue) eventItemValue).m324unboximpl());
        }
        if (eventItemValue instanceof EventItemValue.IntValue) {
            return Integer.valueOf(((EventItemValue.IntValue) eventItemValue).m317unboximpl());
        }
        if (eventItemValue instanceof EventItemValue.ArrStringValue) {
            return ((EventItemValue.ArrStringValue) eventItemValue).m296unboximpl();
        }
        if (eventItemValue instanceof EventItemValue.MapStringStringValue) {
            return ((EventItemValue.MapStringStringValue) eventItemValue).m331unboximpl();
        }
        if (eventItemValue instanceof EventItemValue.BooleanValue) {
            return Boolean.valueOf(((EventItemValue.BooleanValue) eventItemValue).m303unboximpl());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Map<String, Object> toValuesMap(Map<String, ? extends EventItemValue> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends EventItemValue> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), toRaw(entry.getValue()));
        }
        return linkedHashMap;
    }

    @Override // ru.ok.android.externcalls.sdk.events.AnalyticsEventListener.AnalyticsEvent
    public Map<String, Object> getData() {
        return this.data;
    }

    @Override // ru.ok.android.externcalls.sdk.events.AnalyticsEventListener.AnalyticsEvent
    public String getName() {
        String obj;
        Object obj2 = getData().get("name");
        return (obj2 == null || (obj = obj2.toString()) == null) ? "" : obj;
    }

    @Override // ru.ok.android.externcalls.sdk.events.AnalyticsEventListener.AnalyticsEvent
    public String getStringValue() {
        Object obj = getData().get("string_value");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.events.AnalyticsEventListener.AnalyticsEvent
    public long getTimestamp() {
        Object obj = getData().get("timestamp");
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // ru.ok.android.externcalls.sdk.events.AnalyticsEventListener.AnalyticsEvent
    public Number getValue() {
        Object obj = getData().get("value");
        if (obj instanceof Number) {
            return (Number) obj;
        }
        return null;
    }

    public String toString() {
        return getName() + " " + getData();
    }

    private SharedAnalyticsEvent(SdkMetricStatEvent sdkMetricStatEvent) {
        this.data = toValuesMap(sdkMetricStatEvent.getItems());
    }
}
