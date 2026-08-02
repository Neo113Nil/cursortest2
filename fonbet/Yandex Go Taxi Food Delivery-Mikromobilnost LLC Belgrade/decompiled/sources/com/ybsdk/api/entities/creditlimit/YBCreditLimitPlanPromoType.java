package com.ybsdk.api.entities.creditlimit;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ybsdk/api/entities/creditlimit/YBCreditLimitPlanPromoType;", "", "<init>", "(Ljava/lang/String;I)V", "WITHOUT_FEE", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBCreditLimitPlanPromoType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBCreditLimitPlanPromoType[] $VALUES;
    public static final YBCreditLimitPlanPromoType WITHOUT_FEE = new YBCreditLimitPlanPromoType("WITHOUT_FEE", 0);

    private static final /* synthetic */ YBCreditLimitPlanPromoType[] $values() {
        return new YBCreditLimitPlanPromoType[]{WITHOUT_FEE};
    }

    static {
        YBCreditLimitPlanPromoType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBCreditLimitPlanPromoType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBCreditLimitPlanPromoType valueOf(String str) {
        return (YBCreditLimitPlanPromoType) Enum.valueOf(YBCreditLimitPlanPromoType.class, str);
    }

    public static YBCreditLimitPlanPromoType[] values() {
        return (YBCreditLimitPlanPromoType[]) $VALUES.clone();
    }
}
