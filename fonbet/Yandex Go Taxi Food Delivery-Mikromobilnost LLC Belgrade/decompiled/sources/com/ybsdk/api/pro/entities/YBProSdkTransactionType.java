package com.ybsdk.api.pro.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/api/pro/entities/YBProSdkTransactionType;", "", "<init>", "(Ljava/lang/String;I)V", "PURCHASE", "TRANSFER_OUT", "REFUND", "TOPUP", "TRANSFER_IN", "CASH_WITHDRAWAL", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBProSdkTransactionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBProSdkTransactionType[] $VALUES;
    public static final YBProSdkTransactionType PURCHASE = new YBProSdkTransactionType("PURCHASE", 0);
    public static final YBProSdkTransactionType TRANSFER_OUT = new YBProSdkTransactionType("TRANSFER_OUT", 1);
    public static final YBProSdkTransactionType REFUND = new YBProSdkTransactionType("REFUND", 2);
    public static final YBProSdkTransactionType TOPUP = new YBProSdkTransactionType("TOPUP", 3);
    public static final YBProSdkTransactionType TRANSFER_IN = new YBProSdkTransactionType("TRANSFER_IN", 4);
    public static final YBProSdkTransactionType CASH_WITHDRAWAL = new YBProSdkTransactionType("CASH_WITHDRAWAL", 5);

    private static final /* synthetic */ YBProSdkTransactionType[] $values() {
        return new YBProSdkTransactionType[]{PURCHASE, TRANSFER_OUT, REFUND, TOPUP, TRANSFER_IN, CASH_WITHDRAWAL};
    }

    static {
        YBProSdkTransactionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBProSdkTransactionType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBProSdkTransactionType valueOf(String str) {
        return (YBProSdkTransactionType) Enum.valueOf(YBProSdkTransactionType.class, str);
    }

    public static YBProSdkTransactionType[] values() {
        return (YBProSdkTransactionType[]) $VALUES.clone();
    }
}
