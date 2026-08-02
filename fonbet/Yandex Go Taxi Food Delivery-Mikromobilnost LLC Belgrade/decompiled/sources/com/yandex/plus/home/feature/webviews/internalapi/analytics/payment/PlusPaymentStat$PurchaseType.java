package com.yandex.plus.home.feature.webviews.internalapi.analytics.payment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/analytics/payment/PlusPaymentStat$PurchaseType", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/analytics/payment/PlusPaymentStat$PurchaseType;", "HOST", "NATIVE", "WEB", "INAPP", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPaymentStat$PurchaseType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPaymentStat$PurchaseType[] $VALUES;
    public static final PlusPaymentStat$PurchaseType HOST;
    public static final PlusPaymentStat$PurchaseType INAPP;
    public static final PlusPaymentStat$PurchaseType NATIVE;
    public static final PlusPaymentStat$PurchaseType WEB;

    static {
        PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType = new PlusPaymentStat$PurchaseType("HOST", 0);
        HOST = plusPaymentStat$PurchaseType;
        PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType2 = new PlusPaymentStat$PurchaseType("NATIVE", 1);
        NATIVE = plusPaymentStat$PurchaseType2;
        PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType3 = new PlusPaymentStat$PurchaseType("WEB", 2);
        WEB = plusPaymentStat$PurchaseType3;
        PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType4 = new PlusPaymentStat$PurchaseType("INAPP", 3);
        INAPP = plusPaymentStat$PurchaseType4;
        PlusPaymentStat$PurchaseType[] plusPaymentStat$PurchaseTypeArr = {plusPaymentStat$PurchaseType, plusPaymentStat$PurchaseType2, plusPaymentStat$PurchaseType3, plusPaymentStat$PurchaseType4};
        $VALUES = plusPaymentStat$PurchaseTypeArr;
        $ENTRIES = a.a(plusPaymentStat$PurchaseTypeArr);
    }

    public static PlusPaymentStat$PurchaseType valueOf(String str) {
        return (PlusPaymentStat$PurchaseType) Enum.valueOf(PlusPaymentStat$PurchaseType.class, str);
    }

    public static PlusPaymentStat$PurchaseType[] values() {
        return (PlusPaymentStat$PurchaseType[]) $VALUES.clone();
    }
}
