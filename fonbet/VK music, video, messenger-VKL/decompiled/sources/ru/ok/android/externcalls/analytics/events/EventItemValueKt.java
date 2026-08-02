package ru.ok.android.externcalls.analytics.events;

import java.util.Collection;
import java.util.Map;
import ru.ok.android.externcalls.analytics.events.EventItemValue;

/* compiled from: EventItemValue.kt */
/* loaded from: classes9.dex */
public final class EventItemValueKt {
    public static final EventItemValue toEventItemValue(String str) {
        return EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl(str));
    }

    public static final EventItemValue toEventItemValue(int i) {
        return EventItemValue.IntValue.m311boximpl(EventItemValue.IntValue.m312constructorimpl(i));
    }

    public static final EventItemValue toEventItemValue(long j) {
        return EventItemValue.LongValue.m318boximpl(EventItemValue.LongValue.m319constructorimpl(j));
    }

    public static final EventItemValue toEventItemValue(float f) {
        return EventItemValue.FloatValue.m304boximpl(EventItemValue.FloatValue.m305constructorimpl(f));
    }

    public static final EventItemValue toEventItemValue(Collection<String> collection) {
        return EventItemValue.ArrStringValue.m290boximpl(EventItemValue.ArrStringValue.m291constructorimpl(collection));
    }

    public static final EventItemValue toEventItemValue(Map<String, String> map) {
        return EventItemValue.MapStringStringValue.m325boximpl(EventItemValue.MapStringStringValue.m326constructorimpl(map));
    }
}
