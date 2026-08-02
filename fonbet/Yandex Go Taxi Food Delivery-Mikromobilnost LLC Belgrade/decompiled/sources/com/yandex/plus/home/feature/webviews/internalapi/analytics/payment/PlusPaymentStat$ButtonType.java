package com.yandex.plus.home.feature.webviews.internalapi.analytics.payment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/analytics/payment/PlusPaymentStat$ButtonType", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/analytics/payment/PlusPaymentStat$ButtonType;", "HOST", "NATIVE", "WEB", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPaymentStat$ButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPaymentStat$ButtonType[] $VALUES;
    public static final PlusPaymentStat$ButtonType HOST;
    public static final PlusPaymentStat$ButtonType NATIVE;
    public static final PlusPaymentStat$ButtonType WEB;

    static {
        PlusPaymentStat$ButtonType plusPaymentStat$ButtonType = new PlusPaymentStat$ButtonType("HOST", 0);
        HOST = plusPaymentStat$ButtonType;
        PlusPaymentStat$ButtonType plusPaymentStat$ButtonType2 = new PlusPaymentStat$ButtonType("NATIVE", 1);
        NATIVE = plusPaymentStat$ButtonType2;
        PlusPaymentStat$ButtonType plusPaymentStat$ButtonType3 = new PlusPaymentStat$ButtonType("WEB", 2);
        WEB = plusPaymentStat$ButtonType3;
        PlusPaymentStat$ButtonType[] plusPaymentStat$ButtonTypeArr = {plusPaymentStat$ButtonType, plusPaymentStat$ButtonType2, plusPaymentStat$ButtonType3};
        $VALUES = plusPaymentStat$ButtonTypeArr;
        $ENTRIES = a.a(plusPaymentStat$ButtonTypeArr);
    }

    public static PlusPaymentStat$ButtonType valueOf(String str) {
        return (PlusPaymentStat$ButtonType) Enum.valueOf(PlusPaymentStat$ButtonType.class, str);
    }

    public static PlusPaymentStat$ButtonType[] values() {
        return (PlusPaymentStat$ButtonType[]) $VALUES.clone();
    }
}
