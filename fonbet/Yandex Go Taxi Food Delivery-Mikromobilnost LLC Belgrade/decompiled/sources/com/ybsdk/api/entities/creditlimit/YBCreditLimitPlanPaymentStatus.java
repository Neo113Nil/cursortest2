package com.ybsdk.api.entities.creditlimit;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/api/entities/creditlimit/YBCreditLimitPlanPaymentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "EXPECTED", "COMING", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBCreditLimitPlanPaymentStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBCreditLimitPlanPaymentStatus[] $VALUES;
    public static final YBCreditLimitPlanPaymentStatus EXPECTED = new YBCreditLimitPlanPaymentStatus("EXPECTED", 0);
    public static final YBCreditLimitPlanPaymentStatus COMING = new YBCreditLimitPlanPaymentStatus("COMING", 1);

    private static final /* synthetic */ YBCreditLimitPlanPaymentStatus[] $values() {
        return new YBCreditLimitPlanPaymentStatus[]{EXPECTED, COMING};
    }

    static {
        YBCreditLimitPlanPaymentStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBCreditLimitPlanPaymentStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBCreditLimitPlanPaymentStatus valueOf(String str) {
        return (YBCreditLimitPlanPaymentStatus) Enum.valueOf(YBCreditLimitPlanPaymentStatus.class, str);
    }

    public static YBCreditLimitPlanPaymentStatus[] values() {
        return (YBCreditLimitPlanPaymentStatus[]) $VALUES.clone();
    }
}
