package com.ybsdk.network.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/network/dto/PaymentMethodProductType;", "", "<init>", "(Ljava/lang/String;I)V", "WALLET", "PRO", "CREDIT_LIMIT", "UNKNOWN", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodProductType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodProductType[] $VALUES;
    public static final PaymentMethodProductType WALLET = new PaymentMethodProductType("WALLET", 0);
    public static final PaymentMethodProductType PRO = new PaymentMethodProductType("PRO", 1);
    public static final PaymentMethodProductType CREDIT_LIMIT = new PaymentMethodProductType("CREDIT_LIMIT", 2);
    public static final PaymentMethodProductType UNKNOWN = new PaymentMethodProductType("UNKNOWN", 3);

    private static final /* synthetic */ PaymentMethodProductType[] $values() {
        return new PaymentMethodProductType[]{WALLET, PRO, CREDIT_LIMIT, UNKNOWN};
    }

    static {
        PaymentMethodProductType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PaymentMethodProductType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PaymentMethodProductType valueOf(String str) {
        return (PaymentMethodProductType) Enum.valueOf(PaymentMethodProductType.class, str);
    }

    public static PaymentMethodProductType[] values() {
        return (PaymentMethodProductType[]) $VALUES.clone();
    }
}
