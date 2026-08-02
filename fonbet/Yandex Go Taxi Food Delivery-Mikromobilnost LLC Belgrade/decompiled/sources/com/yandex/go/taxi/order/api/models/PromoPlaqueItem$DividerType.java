package com.yandex.go.taxi.order.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/taxi/order/api/models/PromoPlaqueItem$DividerType", "", "Lcom/yandex/go/taxi/order/api/models/PromoPlaqueItem$DividerType;", "ICON_MARGIN_TOP", "ICON_MARGIN_BOTTOM", "MARGIN_TOP", "MARGIN_BOTTOM", "NORMAL_TOP", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PromoPlaqueItem$DividerType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PromoPlaqueItem$DividerType[] $VALUES;
    public static final PromoPlaqueItem$DividerType ICON_MARGIN_BOTTOM;
    public static final PromoPlaqueItem$DividerType ICON_MARGIN_TOP;
    public static final PromoPlaqueItem$DividerType MARGIN_BOTTOM;
    public static final PromoPlaqueItem$DividerType MARGIN_TOP;
    public static final PromoPlaqueItem$DividerType NONE;
    public static final PromoPlaqueItem$DividerType NORMAL_TOP;

    static {
        PromoPlaqueItem$DividerType promoPlaqueItem$DividerType = new PromoPlaqueItem$DividerType("ICON_MARGIN_TOP", 0);
        ICON_MARGIN_TOP = promoPlaqueItem$DividerType;
        PromoPlaqueItem$DividerType promoPlaqueItem$DividerType2 = new PromoPlaqueItem$DividerType("ICON_MARGIN_BOTTOM", 1);
        ICON_MARGIN_BOTTOM = promoPlaqueItem$DividerType2;
        PromoPlaqueItem$DividerType promoPlaqueItem$DividerType3 = new PromoPlaqueItem$DividerType("MARGIN_TOP", 2);
        MARGIN_TOP = promoPlaqueItem$DividerType3;
        PromoPlaqueItem$DividerType promoPlaqueItem$DividerType4 = new PromoPlaqueItem$DividerType("MARGIN_BOTTOM", 3);
        MARGIN_BOTTOM = promoPlaqueItem$DividerType4;
        PromoPlaqueItem$DividerType promoPlaqueItem$DividerType5 = new PromoPlaqueItem$DividerType("NORMAL_TOP", 4);
        NORMAL_TOP = promoPlaqueItem$DividerType5;
        PromoPlaqueItem$DividerType promoPlaqueItem$DividerType6 = new PromoPlaqueItem$DividerType(JCP.RAW_PREFIX, 5);
        NONE = promoPlaqueItem$DividerType6;
        PromoPlaqueItem$DividerType[] promoPlaqueItem$DividerTypeArr = {promoPlaqueItem$DividerType, promoPlaqueItem$DividerType2, promoPlaqueItem$DividerType3, promoPlaqueItem$DividerType4, promoPlaqueItem$DividerType5, promoPlaqueItem$DividerType6};
        $VALUES = promoPlaqueItem$DividerTypeArr;
        $ENTRIES = a.a(promoPlaqueItem$DividerTypeArr);
    }

    public static PromoPlaqueItem$DividerType valueOf(String str) {
        return (PromoPlaqueItem$DividerType) Enum.valueOf(PromoPlaqueItem$DividerType.class, str);
    }

    public static PromoPlaqueItem$DividerType[] values() {
        return (PromoPlaqueItem$DividerType[]) $VALUES.clone();
    }
}
