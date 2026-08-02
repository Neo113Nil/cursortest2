package ru.ok.android.externcalls.analytics.events;

import java.util.Map;
import xsna.j5g;
import xsna.n1g0;
import xsna.pn00;
import xsna.y57;

/* compiled from: SdkIntervalStatEvent.kt */
/* loaded from: classes9.dex */
public final class SdkIntervalStatEvent extends CallAnalyticsEvent {
    private final String apiMethodName = "vchat.clientStats";
    private final Map<String, EventItemValue> items;

    /* compiled from: SdkIntervalStatEvent.kt */
    public static final class Builder {
        private final EventItemsMap map = new EventItemsMap();

        public final Builder addAll(Map<String, ? extends EventItemValue> map) {
            this.map.addAll(map);
            return this;
        }

        public final SdkIntervalStatEvent build() {
            return new SdkIntervalStatEvent(pn00.t(this.map.getItems()));
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

    /* JADX WARN: Multi-variable type inference failed */
    public SdkIntervalStatEvent(Map<String, ? extends EventItemValue> map) {
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
        return y57.a("SdkIntervalStatEvent apiMethod=", getApiMethodName(), " ", j5g.g0(getItems().entrySet(), ", ", null, null, 0, new n1g0(3), 30));
    }
}
