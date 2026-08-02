package com.ybsdk.network.dto.creditlimit;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoType;", "", "<init>", "(Ljava/lang/String;I)V", "WITHOUT_FEE", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitPlanPromoType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CreditLimitPlanPromoType[] $VALUES;
    public static final CreditLimitPlanPromoType WITHOUT_FEE = new CreditLimitPlanPromoType("WITHOUT_FEE", 0);

    private static final /* synthetic */ CreditLimitPlanPromoType[] $values() {
        return new CreditLimitPlanPromoType[]{WITHOUT_FEE};
    }

    static {
        CreditLimitPlanPromoType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CreditLimitPlanPromoType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CreditLimitPlanPromoType valueOf(String str) {
        return (CreditLimitPlanPromoType) Enum.valueOf(CreditLimitPlanPromoType.class, str);
    }

    public static CreditLimitPlanPromoType[] values() {
        return (CreditLimitPlanPromoType[]) $VALUES.clone();
    }
}
