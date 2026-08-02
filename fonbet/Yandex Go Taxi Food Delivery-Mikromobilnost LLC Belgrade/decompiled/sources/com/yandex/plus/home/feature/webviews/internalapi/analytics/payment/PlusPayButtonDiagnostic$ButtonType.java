package com.yandex.plus.home.feature.webviews.internalapi.analytics.payment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/analytics/payment/PlusPayButtonDiagnostic$ButtonType", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/analytics/payment/PlusPayButtonDiagnostic$ButtonType;", "NATIVE_SDK", "WEB", "NATIVE_HOST", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayButtonDiagnostic$ButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPayButtonDiagnostic$ButtonType[] $VALUES;
    public static final PlusPayButtonDiagnostic$ButtonType NATIVE_HOST;
    public static final PlusPayButtonDiagnostic$ButtonType NATIVE_SDK;
    public static final PlusPayButtonDiagnostic$ButtonType WEB;

    static {
        PlusPayButtonDiagnostic$ButtonType plusPayButtonDiagnostic$ButtonType = new PlusPayButtonDiagnostic$ButtonType("NATIVE_SDK", 0);
        NATIVE_SDK = plusPayButtonDiagnostic$ButtonType;
        PlusPayButtonDiagnostic$ButtonType plusPayButtonDiagnostic$ButtonType2 = new PlusPayButtonDiagnostic$ButtonType("WEB", 1);
        WEB = plusPayButtonDiagnostic$ButtonType2;
        PlusPayButtonDiagnostic$ButtonType plusPayButtonDiagnostic$ButtonType3 = new PlusPayButtonDiagnostic$ButtonType("NATIVE_HOST", 2);
        NATIVE_HOST = plusPayButtonDiagnostic$ButtonType3;
        PlusPayButtonDiagnostic$ButtonType[] plusPayButtonDiagnostic$ButtonTypeArr = {plusPayButtonDiagnostic$ButtonType, plusPayButtonDiagnostic$ButtonType2, plusPayButtonDiagnostic$ButtonType3};
        $VALUES = plusPayButtonDiagnostic$ButtonTypeArr;
        $ENTRIES = a.a(plusPayButtonDiagnostic$ButtonTypeArr);
    }

    public static PlusPayButtonDiagnostic$ButtonType valueOf(String str) {
        return (PlusPayButtonDiagnostic$ButtonType) Enum.valueOf(PlusPayButtonDiagnostic$ButtonType.class, str);
    }

    public static PlusPayButtonDiagnostic$ButtonType[] values() {
        return (PlusPayButtonDiagnostic$ButtonType[]) $VALUES.clone();
    }
}
