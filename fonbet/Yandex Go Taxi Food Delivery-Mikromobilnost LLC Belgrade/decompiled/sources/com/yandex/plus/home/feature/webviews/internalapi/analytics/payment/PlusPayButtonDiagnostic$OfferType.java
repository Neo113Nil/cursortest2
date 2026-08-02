package com.yandex.plus.home.feature.webviews.internalapi.analytics.payment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/analytics/payment/PlusPayButtonDiagnostic$OfferType", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/analytics/payment/PlusPayButtonDiagnostic$OfferType;", "NATIVE", "IN_APP", "UNKNOWN", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayButtonDiagnostic$OfferType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPayButtonDiagnostic$OfferType[] $VALUES;
    public static final PlusPayButtonDiagnostic$OfferType IN_APP;
    public static final PlusPayButtonDiagnostic$OfferType NATIVE;
    public static final PlusPayButtonDiagnostic$OfferType UNKNOWN;

    static {
        PlusPayButtonDiagnostic$OfferType plusPayButtonDiagnostic$OfferType = new PlusPayButtonDiagnostic$OfferType("NATIVE", 0);
        NATIVE = plusPayButtonDiagnostic$OfferType;
        PlusPayButtonDiagnostic$OfferType plusPayButtonDiagnostic$OfferType2 = new PlusPayButtonDiagnostic$OfferType("IN_APP", 1);
        IN_APP = plusPayButtonDiagnostic$OfferType2;
        PlusPayButtonDiagnostic$OfferType plusPayButtonDiagnostic$OfferType3 = new PlusPayButtonDiagnostic$OfferType("UNKNOWN", 2);
        UNKNOWN = plusPayButtonDiagnostic$OfferType3;
        PlusPayButtonDiagnostic$OfferType[] plusPayButtonDiagnostic$OfferTypeArr = {plusPayButtonDiagnostic$OfferType, plusPayButtonDiagnostic$OfferType2, plusPayButtonDiagnostic$OfferType3};
        $VALUES = plusPayButtonDiagnostic$OfferTypeArr;
        $ENTRIES = a.a(plusPayButtonDiagnostic$OfferTypeArr);
    }

    public static PlusPayButtonDiagnostic$OfferType valueOf(String str) {
        return (PlusPayButtonDiagnostic$OfferType) Enum.valueOf(PlusPayButtonDiagnostic$OfferType.class, str);
    }

    public static PlusPayButtonDiagnostic$OfferType[] values() {
        return (PlusPayButtonDiagnostic$OfferType[]) $VALUES.clone();
    }
}
