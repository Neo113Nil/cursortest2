package com.yandex.go.plus.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/plus/api/model/PlusBrandType;", "", "YANDEX", "YANGO", "HAYYA", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusBrandType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusBrandType[] $VALUES;
    public static final PlusBrandType HAYYA;
    public static final PlusBrandType YANDEX;
    public static final PlusBrandType YANGO;

    static {
        PlusBrandType plusBrandType = new PlusBrandType("YANDEX", 0);
        YANDEX = plusBrandType;
        PlusBrandType plusBrandType2 = new PlusBrandType("YANGO", 1);
        YANGO = plusBrandType2;
        PlusBrandType plusBrandType3 = new PlusBrandType("HAYYA", 2);
        HAYYA = plusBrandType3;
        PlusBrandType[] plusBrandTypeArr = {plusBrandType, plusBrandType2, plusBrandType3};
        $VALUES = plusBrandTypeArr;
        $ENTRIES = a.a(plusBrandTypeArr);
    }

    public static PlusBrandType valueOf(String str) {
        return (PlusBrandType) Enum.valueOf(PlusBrandType.class, str);
    }

    public static PlusBrandType[] values() {
        return (PlusBrandType[]) $VALUES.clone();
    }
}
