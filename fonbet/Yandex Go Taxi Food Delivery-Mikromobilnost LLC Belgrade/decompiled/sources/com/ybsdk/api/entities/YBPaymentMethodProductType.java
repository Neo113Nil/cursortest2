package com.ybsdk.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/api/entities/YBPaymentMethodProductType;", "", "<init>", "(Ljava/lang/String;I)V", "WALLET", "PRO", "CREDIT_LIMIT", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YBPaymentMethodProductType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBPaymentMethodProductType[] $VALUES;
    public static final YBPaymentMethodProductType WALLET = new YBPaymentMethodProductType("WALLET", 0);
    public static final YBPaymentMethodProductType PRO = new YBPaymentMethodProductType("PRO", 1);
    public static final YBPaymentMethodProductType CREDIT_LIMIT = new YBPaymentMethodProductType("CREDIT_LIMIT", 2);

    private static final /* synthetic */ YBPaymentMethodProductType[] $values() {
        return new YBPaymentMethodProductType[]{WALLET, PRO, CREDIT_LIMIT};
    }

    static {
        YBPaymentMethodProductType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBPaymentMethodProductType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBPaymentMethodProductType valueOf(String str) {
        return (YBPaymentMethodProductType) Enum.valueOf(YBPaymentMethodProductType.class, str);
    }

    public static YBPaymentMethodProductType[] values() {
        return (YBPaymentMethodProductType[]) $VALUES.clone();
    }
}
