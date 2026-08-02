package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$PurchaseType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c15 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlusPaymentStat$PurchaseType.values().length];
        try {
            iArr[PlusPaymentStat$PurchaseType.HOST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPaymentStat$PurchaseType.NATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusPaymentStat$PurchaseType.WEB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlusPaymentStat$PurchaseType.INAPP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[PlusPaymentStat$ButtonType.values().length];
        try {
            iArr2[PlusPaymentStat$ButtonType.HOST.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PlusPaymentStat$ButtonType.NATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PlusPaymentStat$ButtonType.WEB.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
