package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$OfferType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$PaymentType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class pio {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[PlusPayButtonDiagnostic$ButtonType.values().length];
        try {
            iArr[PlusPayButtonDiagnostic$ButtonType.NATIVE_SDK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayButtonDiagnostic$ButtonType.NATIVE_HOST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusPayButtonDiagnostic$ButtonType.WEB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PlusPayButtonDiagnostic$PaymentType.values().length];
        try {
            iArr2[PlusPayButtonDiagnostic$PaymentType.TARIFFICATOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PlusPayButtonDiagnostic$PaymentType.OLD_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PlusPayButtonDiagnostic$PaymentType.HOST.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[PlusPayButtonDiagnostic$OfferType.values().length];
        try {
            iArr3[PlusPayButtonDiagnostic$OfferType.IN_APP.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[PlusPayButtonDiagnostic$OfferType.NATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[PlusPayButtonDiagnostic$OfferType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
    }
}
