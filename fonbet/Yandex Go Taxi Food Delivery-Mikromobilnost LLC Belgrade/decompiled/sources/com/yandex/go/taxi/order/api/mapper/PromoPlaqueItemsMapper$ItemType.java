package com.yandex.go.taxi.order.api.mapper;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/api/mapper/PromoPlaqueItemsMapper$ItemType", "", "Lcom/yandex/go/taxi/order/api/mapper/PromoPlaqueItemsMapper$ItemType;", "ICON", "NO_ICON", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PromoPlaqueItemsMapper$ItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PromoPlaqueItemsMapper$ItemType[] $VALUES;
    public static final PromoPlaqueItemsMapper$ItemType ICON;
    public static final PromoPlaqueItemsMapper$ItemType NONE;
    public static final PromoPlaqueItemsMapper$ItemType NO_ICON;

    static {
        PromoPlaqueItemsMapper$ItemType promoPlaqueItemsMapper$ItemType = new PromoPlaqueItemsMapper$ItemType("ICON", 0);
        ICON = promoPlaqueItemsMapper$ItemType;
        PromoPlaqueItemsMapper$ItemType promoPlaqueItemsMapper$ItemType2 = new PromoPlaqueItemsMapper$ItemType("NO_ICON", 1);
        NO_ICON = promoPlaqueItemsMapper$ItemType2;
        PromoPlaqueItemsMapper$ItemType promoPlaqueItemsMapper$ItemType3 = new PromoPlaqueItemsMapper$ItemType(JCP.RAW_PREFIX, 2);
        NONE = promoPlaqueItemsMapper$ItemType3;
        PromoPlaqueItemsMapper$ItemType[] promoPlaqueItemsMapper$ItemTypeArr = {promoPlaqueItemsMapper$ItemType, promoPlaqueItemsMapper$ItemType2, promoPlaqueItemsMapper$ItemType3};
        $VALUES = promoPlaqueItemsMapper$ItemTypeArr;
        $ENTRIES = a.a(promoPlaqueItemsMapper$ItemTypeArr);
    }

    public static PromoPlaqueItemsMapper$ItemType valueOf(String str) {
        return (PromoPlaqueItemsMapper$ItemType) Enum.valueOf(PromoPlaqueItemsMapper$ItemType.class, str);
    }

    public static PromoPlaqueItemsMapper$ItemType[] values() {
        return (PromoPlaqueItemsMapper$ItemType[]) $VALUES.clone();
    }
}
