package ru.ok.android.externcalls.analytics.events;

import java.util.Map;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import xsna.j5g;
import xsna.pn00;
import xsna.sux;
import xsna.y57;
import xsna.zcl;

/* compiled from: SdkMetricStatEvent.kt */
/* loaded from: classes9.dex */
public final class SdkMetricStatEvent extends CallAnalyticsEvent {
    public static final Companion Companion = new Companion(null);
    public static final String NAME_KEY = "name";
    public static final String STRING_VALUE_KEY = "string_value";
    public static final String VALUE_KEY = "value";
    private final String apiMethodName = "vchat.clientStats";
    private final Map<String, EventItemValue> items;

    /* compiled from: SdkMetricStatEvent.kt */
    public static final class Builder {
        private final EventItemsMap map;

        public Builder(String str, EventItemValue eventItemValue) {
            EventItemsMap eventItemsMap = new EventItemsMap();
            this.map = eventItemsMap;
            eventItemsMap.set("name", str);
            if (eventItemValue != null) {
                if (eventItemValue instanceof EventItemValue.StringValue) {
                    eventItemsMap.set("string_value", eventItemValue);
                } else {
                    eventItemsMap.set("value", eventItemValue);
                }
            }
        }

        public final Builder addAll(Map<String, ? extends EventItemValue> map) {
            this.map.addAll(map);
            return this;
        }

        public final SdkMetricStatEvent build() {
            return new SdkMetricStatEvent(pn00.t(this.map.getItems()));
        }

        public final Builder set(String str, EventItemValue eventItemValue) {
            this.map.set(str, eventItemValue);
            return this;
        }

        public final Builder addAll(EventItemsMap eventItemsMap) {
            addAll(eventItemsMap.getItems());
            return this;
        }

        public final Builder set(String str, String str2) {
            this.map.set(str, str2);
            return this;
        }

        public final Builder set(String str, Integer num) {
            this.map.set(str, num);
            return this;
        }

        public final Builder set(String str, Long l) {
            this.map.set(str, l);
            return this;
        }

        public final Builder set(String str, Float f) {
            this.map.set(str, f);
            return this;
        }
    }

    /* compiled from: SdkMetricStatEvent.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdkMetricStatEvent(Map<String, ? extends EventItemValue> map) {
        this.items = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$0(Map.Entry entry) {
        return entry.getKey() + "=" + entry.getValue();
    }

    @Override // ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent
    public String getApiMethodName() {
        return this.apiMethodName;
    }

    @Override // ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent
    public Map<String, EventItemValue> getItems() {
        return this.items;
    }

    public String toString() {
        return y57.a("SdkMetricStatEvent apiMethod=", getApiMethodName(), " ", j5g.g0(getItems().entrySet(), ", ", null, null, 0, new sux(26), 30));
    }
}
