package com.yandex.plus.home.feature.webviews.internalapi.analytics.payment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/analytics/payment/PlusPayButtonDiagnostic$PaymentType", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/analytics/payment/PlusPayButtonDiagnostic$PaymentType;", "TARIFFICATOR", "OLD_PAYMENT", "HOST", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayButtonDiagnostic$PaymentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPayButtonDiagnostic$PaymentType[] $VALUES;
    public static final PlusPayButtonDiagnostic$PaymentType HOST;
    public static final PlusPayButtonDiagnostic$PaymentType OLD_PAYMENT;
    public static final PlusPayButtonDiagnostic$PaymentType TARIFFICATOR;

    static {
        PlusPayButtonDiagnostic$PaymentType plusPayButtonDiagnostic$PaymentType = new PlusPayButtonDiagnostic$PaymentType("TARIFFICATOR", 0);
        TARIFFICATOR = plusPayButtonDiagnostic$PaymentType;
        PlusPayButtonDiagnostic$PaymentType plusPayButtonDiagnostic$PaymentType2 = new PlusPayButtonDiagnostic$PaymentType("OLD_PAYMENT", 1);
        OLD_PAYMENT = plusPayButtonDiagnostic$PaymentType2;
        PlusPayButtonDiagnostic$PaymentType plusPayButtonDiagnostic$PaymentType3 = new PlusPayButtonDiagnostic$PaymentType("HOST", 2);
        HOST = plusPayButtonDiagnostic$PaymentType3;
        PlusPayButtonDiagnostic$PaymentType[] plusPayButtonDiagnostic$PaymentTypeArr = {plusPayButtonDiagnostic$PaymentType, plusPayButtonDiagnostic$PaymentType2, plusPayButtonDiagnostic$PaymentType3};
        $VALUES = plusPayButtonDiagnostic$PaymentTypeArr;
        $ENTRIES = a.a(plusPayButtonDiagnostic$PaymentTypeArr);
    }

    public static PlusPayButtonDiagnostic$PaymentType valueOf(String str) {
        return (PlusPayButtonDiagnostic$PaymentType) Enum.valueOf(PlusPayButtonDiagnostic$PaymentType.class, str);
    }

    public static PlusPayButtonDiagnostic$PaymentType[] values() {
        return (PlusPayButtonDiagnostic$PaymentType[]) $VALUES.clone();
    }
}
