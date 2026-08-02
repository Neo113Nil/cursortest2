package com.ybsdk.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/api/entities/YBCheckPaymentInfo$Condition", "", "Lcom/ybsdk/api/entities/YBCheckPaymentInfo$Condition;", "<init>", "(Ljava/lang/String;I)V", "TOPUP", "IDENTIFICATION", "KYC", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class YBCheckPaymentInfo$Condition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBCheckPaymentInfo$Condition[] $VALUES;
    public static final YBCheckPaymentInfo$Condition TOPUP = new YBCheckPaymentInfo$Condition("TOPUP", 0);
    public static final YBCheckPaymentInfo$Condition IDENTIFICATION = new YBCheckPaymentInfo$Condition("IDENTIFICATION", 1);
    public static final YBCheckPaymentInfo$Condition KYC = new YBCheckPaymentInfo$Condition("KYC", 2);

    private static final /* synthetic */ YBCheckPaymentInfo$Condition[] $values() {
        return new YBCheckPaymentInfo$Condition[]{TOPUP, IDENTIFICATION, KYC};
    }

    static {
        YBCheckPaymentInfo$Condition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBCheckPaymentInfo$Condition(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBCheckPaymentInfo$Condition valueOf(String str) {
        return (YBCheckPaymentInfo$Condition) Enum.valueOf(YBCheckPaymentInfo$Condition.class, str);
    }

    public static YBCheckPaymentInfo$Condition[] values() {
        return (YBCheckPaymentInfo$Condition[]) $VALUES.clone();
    }
}
