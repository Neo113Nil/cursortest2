package com.yandex.go.taxi.order.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/api/models/PromoPlaqueItem$DisplayOnType", "", "Lcom/yandex/go/taxi/order/api/models/PromoPlaqueItem$DisplayOnType;", "MULTI_ORDER", "DETAILS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PromoPlaqueItem$DisplayOnType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PromoPlaqueItem$DisplayOnType[] $VALUES;
    public static final PromoPlaqueItem$DisplayOnType DETAILS;
    public static final PromoPlaqueItem$DisplayOnType MULTI_ORDER;

    static {
        PromoPlaqueItem$DisplayOnType promoPlaqueItem$DisplayOnType = new PromoPlaqueItem$DisplayOnType("MULTI_ORDER", 0);
        MULTI_ORDER = promoPlaqueItem$DisplayOnType;
        PromoPlaqueItem$DisplayOnType promoPlaqueItem$DisplayOnType2 = new PromoPlaqueItem$DisplayOnType("DETAILS", 1);
        DETAILS = promoPlaqueItem$DisplayOnType2;
        PromoPlaqueItem$DisplayOnType[] promoPlaqueItem$DisplayOnTypeArr = {promoPlaqueItem$DisplayOnType, promoPlaqueItem$DisplayOnType2};
        $VALUES = promoPlaqueItem$DisplayOnTypeArr;
        $ENTRIES = a.a(promoPlaqueItem$DisplayOnTypeArr);
    }

    public static PromoPlaqueItem$DisplayOnType valueOf(String str) {
        return (PromoPlaqueItem$DisplayOnType) Enum.valueOf(PromoPlaqueItem$DisplayOnType.class, str);
    }

    public static PromoPlaqueItem$DisplayOnType[] values() {
        return (PromoPlaqueItem$DisplayOnType[]) $VALUES.clone();
    }
}
