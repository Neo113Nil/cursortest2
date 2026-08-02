package com.yandex.go.chargers.passes.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/domain/ChargersPassType;", "", "SUBSCRIPTION", "RENTAL_PACKAGE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPassType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersPassType[] $VALUES;
    public static final ChargersPassType RENTAL_PACKAGE;
    public static final ChargersPassType SUBSCRIPTION;
    public static final ChargersPassType UNKNOWN;

    static {
        ChargersPassType chargersPassType = new ChargersPassType("SUBSCRIPTION", 0);
        SUBSCRIPTION = chargersPassType;
        ChargersPassType chargersPassType2 = new ChargersPassType("RENTAL_PACKAGE", 1);
        RENTAL_PACKAGE = chargersPassType2;
        ChargersPassType chargersPassType3 = new ChargersPassType("UNKNOWN", 2);
        UNKNOWN = chargersPassType3;
        ChargersPassType[] chargersPassTypeArr = {chargersPassType, chargersPassType2, chargersPassType3};
        $VALUES = chargersPassTypeArr;
        $ENTRIES = a.a(chargersPassTypeArr);
    }

    public static ChargersPassType valueOf(String str) {
        return (ChargersPassType) Enum.valueOf(ChargersPassType.class, str);
    }

    public static ChargersPassType[] values() {
        return (ChargersPassType[]) $VALUES.clone();
    }
}
