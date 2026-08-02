package com.ybsdk.api.entities.creditlimit;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/api/entities/creditlimit/YBCreditPaymentMethodType;", "", "<init>", "(Ljava/lang/String;I)V", "WALLET", "AFT", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBCreditPaymentMethodType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBCreditPaymentMethodType[] $VALUES;
    public static final YBCreditPaymentMethodType WALLET = new YBCreditPaymentMethodType("WALLET", 0);
    public static final YBCreditPaymentMethodType AFT = new YBCreditPaymentMethodType("AFT", 1);

    private static final /* synthetic */ YBCreditPaymentMethodType[] $values() {
        return new YBCreditPaymentMethodType[]{WALLET, AFT};
    }

    static {
        YBCreditPaymentMethodType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBCreditPaymentMethodType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBCreditPaymentMethodType valueOf(String str) {
        return (YBCreditPaymentMethodType) Enum.valueOf(YBCreditPaymentMethodType.class, str);
    }

    public static YBCreditPaymentMethodType[] values() {
        return (YBCreditPaymentMethodType[]) $VALUES.clone();
    }
}
