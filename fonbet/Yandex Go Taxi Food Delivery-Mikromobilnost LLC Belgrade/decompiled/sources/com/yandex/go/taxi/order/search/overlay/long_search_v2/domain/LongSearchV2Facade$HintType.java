package com.yandex.go.taxi.order.search.overlay.long_search_v2.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/search/overlay/long_search_v2/domain/LongSearchV2Facade$HintType", "", "Lcom/yandex/go/taxi/order/search/overlay/long_search_v2/domain/LongSearchV2Facade$HintType;", "POLLING_STARTED", "CAR_POLLING", "CAR_BUSY", "RADIUS_CHANGE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LongSearchV2Facade$HintType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LongSearchV2Facade$HintType[] $VALUES;
    public static final LongSearchV2Facade$HintType CAR_BUSY;
    public static final LongSearchV2Facade$HintType CAR_POLLING;
    public static final LongSearchV2Facade$HintType POLLING_STARTED;
    public static final LongSearchV2Facade$HintType RADIUS_CHANGE;

    static {
        LongSearchV2Facade$HintType longSearchV2Facade$HintType = new LongSearchV2Facade$HintType("POLLING_STARTED", 0);
        POLLING_STARTED = longSearchV2Facade$HintType;
        LongSearchV2Facade$HintType longSearchV2Facade$HintType2 = new LongSearchV2Facade$HintType("CAR_POLLING", 1);
        CAR_POLLING = longSearchV2Facade$HintType2;
        LongSearchV2Facade$HintType longSearchV2Facade$HintType3 = new LongSearchV2Facade$HintType("CAR_BUSY", 2);
        CAR_BUSY = longSearchV2Facade$HintType3;
        LongSearchV2Facade$HintType longSearchV2Facade$HintType4 = new LongSearchV2Facade$HintType("RADIUS_CHANGE", 3);
        RADIUS_CHANGE = longSearchV2Facade$HintType4;
        LongSearchV2Facade$HintType[] longSearchV2Facade$HintTypeArr = {longSearchV2Facade$HintType, longSearchV2Facade$HintType2, longSearchV2Facade$HintType3, longSearchV2Facade$HintType4};
        $VALUES = longSearchV2Facade$HintTypeArr;
        $ENTRIES = a.a(longSearchV2Facade$HintTypeArr);
    }

    public static LongSearchV2Facade$HintType valueOf(String str) {
        return (LongSearchV2Facade$HintType) Enum.valueOf(LongSearchV2Facade$HintType.class, str);
    }

    public static LongSearchV2Facade$HintType[] values() {
        return (LongSearchV2Facade$HintType[]) $VALUES.clone();
    }
}
