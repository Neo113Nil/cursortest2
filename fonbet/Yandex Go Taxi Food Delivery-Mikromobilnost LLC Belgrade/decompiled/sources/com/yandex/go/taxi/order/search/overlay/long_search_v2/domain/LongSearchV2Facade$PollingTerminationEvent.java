package com.yandex.go.taxi.order.search.overlay.long_search_v2.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/search/overlay/long_search_v2/domain/LongSearchV2Facade$PollingTerminationEvent", "", "Lcom/yandex/go/taxi/order/search/overlay/long_search_v2/domain/LongSearchV2Facade$PollingTerminationEvent;", "START", "END", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LongSearchV2Facade$PollingTerminationEvent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LongSearchV2Facade$PollingTerminationEvent[] $VALUES;
    public static final LongSearchV2Facade$PollingTerminationEvent END;
    public static final LongSearchV2Facade$PollingTerminationEvent START;

    static {
        LongSearchV2Facade$PollingTerminationEvent longSearchV2Facade$PollingTerminationEvent = new LongSearchV2Facade$PollingTerminationEvent("START", 0);
        START = longSearchV2Facade$PollingTerminationEvent;
        LongSearchV2Facade$PollingTerminationEvent longSearchV2Facade$PollingTerminationEvent2 = new LongSearchV2Facade$PollingTerminationEvent("END", 1);
        END = longSearchV2Facade$PollingTerminationEvent2;
        LongSearchV2Facade$PollingTerminationEvent[] longSearchV2Facade$PollingTerminationEventArr = {longSearchV2Facade$PollingTerminationEvent, longSearchV2Facade$PollingTerminationEvent2};
        $VALUES = longSearchV2Facade$PollingTerminationEventArr;
        $ENTRIES = a.a(longSearchV2Facade$PollingTerminationEventArr);
    }

    public static LongSearchV2Facade$PollingTerminationEvent valueOf(String str) {
        return (LongSearchV2Facade$PollingTerminationEvent) Enum.valueOf(LongSearchV2Facade$PollingTerminationEvent.class, str);
    }

    public static LongSearchV2Facade$PollingTerminationEvent[] values() {
        return (LongSearchV2Facade$PollingTerminationEvent[]) $VALUES.clone();
    }
}
