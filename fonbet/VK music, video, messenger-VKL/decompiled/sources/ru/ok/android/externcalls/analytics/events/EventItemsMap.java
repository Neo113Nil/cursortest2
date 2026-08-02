package ru.ok.android.externcalls.analytics.events;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.externcalls.analytics.events.EventItemValue;

/* compiled from: EventItemsMap.kt */
/* loaded from: classes9.dex */
public final class EventItemsMap {
    private final Map<String, EventItemValue> items;

    public EventItemsMap() {
        this.items = new LinkedHashMap();
    }

    public final EventItemsMap addAll(EventItemsMap eventItemsMap) {
        addAll(eventItemsMap.getItems());
        return this;
    }

    public final Map<String, EventItemValue> getItems() {
        return this.items;
    }

    public final EventItemsMap set(String str, EventItemValue eventItemValue) {
        this.items.put(str, eventItemValue);
        return this;
    }

    public String toString() {
        return "EventItemsMap(\"items\" = " + this.items + ")";
    }

    public final EventItemsMap addAll(Map<String, ? extends EventItemValue> map) {
        for (Map.Entry<String, ? extends EventItemValue> entry : map.entrySet()) {
            this.items.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final EventItemsMap set(String str, String str2) {
        if (str2 != null) {
            this.items.put(str, EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl(str2)));
        }
        return this;
    }

    public EventItemsMap(Map<String, ? extends EventItemValue> map) {
        this();
        addAll(map);
    }

    public final EventItemsMap set(String str, Boolean bool) {
        if (bool != null) {
            this.items.put(str, EventItemValue.BooleanValue.m297boximpl(EventItemValue.BooleanValue.m298constructorimpl(bool.booleanValue())));
        }
        return this;
    }

    public final EventItemsMap set(String str, Integer num) {
        if (num != null) {
            this.items.put(str, EventItemValue.IntValue.m311boximpl(EventItemValue.IntValue.m312constructorimpl(num.intValue())));
        }
        return this;
    }

    public EventItemsMap(Pair<String, ? extends EventItemValue> pair) {
        this();
        set(pair.i(), pair.j());
    }

    public final EventItemsMap set(String str, Long l) {
        if (l != null) {
            this.items.put(str, EventItemValue.LongValue.m318boximpl(EventItemValue.LongValue.m319constructorimpl(l.longValue())));
        }
        return this;
    }

    public final EventItemsMap set(String str, Float f) {
        if (f != null) {
            this.items.put(str, EventItemValue.FloatValue.m304boximpl(EventItemValue.FloatValue.m305constructorimpl(f.floatValue())));
        }
        return this;
    }
}
