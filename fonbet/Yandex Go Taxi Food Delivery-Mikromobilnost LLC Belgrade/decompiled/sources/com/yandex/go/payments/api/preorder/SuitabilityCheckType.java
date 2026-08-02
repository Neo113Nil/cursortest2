package com.yandex.go.payments.api.preorder;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/api/preorder/SuitabilityCheckType;", "", "BY_ZONE", "BY_TARIFF", "BY_COMPOSITE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuitabilityCheckType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuitabilityCheckType[] $VALUES;
    public static final SuitabilityCheckType BY_COMPOSITE;
    public static final SuitabilityCheckType BY_TARIFF;
    public static final SuitabilityCheckType BY_ZONE;

    static {
        SuitabilityCheckType suitabilityCheckType = new SuitabilityCheckType("BY_ZONE", 0);
        BY_ZONE = suitabilityCheckType;
        SuitabilityCheckType suitabilityCheckType2 = new SuitabilityCheckType("BY_TARIFF", 1);
        BY_TARIFF = suitabilityCheckType2;
        SuitabilityCheckType suitabilityCheckType3 = new SuitabilityCheckType("BY_COMPOSITE", 2);
        BY_COMPOSITE = suitabilityCheckType3;
        SuitabilityCheckType[] suitabilityCheckTypeArr = {suitabilityCheckType, suitabilityCheckType2, suitabilityCheckType3};
        $VALUES = suitabilityCheckTypeArr;
        $ENTRIES = a.a(suitabilityCheckTypeArr);
    }

    public static SuitabilityCheckType valueOf(String str) {
        return (SuitabilityCheckType) Enum.valueOf(SuitabilityCheckType.class, str);
    }

    public static SuitabilityCheckType[] values() {
        return (SuitabilityCheckType[]) $VALUES.clone();
    }
}
