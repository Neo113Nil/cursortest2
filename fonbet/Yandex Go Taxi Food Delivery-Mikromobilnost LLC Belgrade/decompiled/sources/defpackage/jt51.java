package defpackage;

import com.yandex.go.payments.yb.experiments.YbInPaymentsPromotionExperiment;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class jt51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YbInPaymentsPromotionExperiment.ContentType.values().length];
        try {
            iArr[YbInPaymentsPromotionExperiment.ContentType.LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbInPaymentsPromotionExperiment.ContentType.BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
