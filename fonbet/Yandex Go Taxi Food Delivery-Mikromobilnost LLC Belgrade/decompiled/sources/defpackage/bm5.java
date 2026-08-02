package defpackage;

import com.yandex.go.benefits_center.data.model.BenefitsCenterBanner;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class bm5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BenefitsCenterBanner.Appearance.values().length];
        try {
            iArr[BenefitsCenterBanner.Appearance.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BenefitsCenterBanner.Appearance.BLACK_WHITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BenefitsCenterBanner.Appearance.MUTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
