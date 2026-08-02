package com.yandex.go.payments.payment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/payments/payment/YbWalletPayment$YandexType", "", "Lcom/yandex/go/payments/payment/YbWalletPayment$YandexType;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PRO", "PAY", "SPLIT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class YbWalletPayment$YandexType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbWalletPayment$YandexType[] $VALUES;
    public static final YbWalletPayment$YandexType PAY;
    public static final YbWalletPayment$YandexType PRO;
    public static final YbWalletPayment$YandexType SPLIT;
    private final String value;

    static {
        YbWalletPayment$YandexType ybWalletPayment$YandexType = new YbWalletPayment$YandexType("PRO", 0, "pro");
        PRO = ybWalletPayment$YandexType;
        YbWalletPayment$YandexType ybWalletPayment$YandexType2 = new YbWalletPayment$YandexType("PAY", 1, "pay");
        PAY = ybWalletPayment$YandexType2;
        YbWalletPayment$YandexType ybWalletPayment$YandexType3 = new YbWalletPayment$YandexType("SPLIT", 2, "split");
        SPLIT = ybWalletPayment$YandexType3;
        YbWalletPayment$YandexType[] ybWalletPayment$YandexTypeArr = {ybWalletPayment$YandexType, ybWalletPayment$YandexType2, ybWalletPayment$YandexType3};
        $VALUES = ybWalletPayment$YandexTypeArr;
        $ENTRIES = a.a(ybWalletPayment$YandexTypeArr);
    }

    public YbWalletPayment$YandexType(String str, int i, String str2) {
        this.value = str2;
    }

    public static YbWalletPayment$YandexType valueOf(String str) {
        return (YbWalletPayment$YandexType) Enum.valueOf(YbWalletPayment$YandexType.class, str);
    }

    public static YbWalletPayment$YandexType[] values() {
        return (YbWalletPayment$YandexType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
