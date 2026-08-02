package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.presentation.state.DashboardPromoBannerType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class lhw {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DashboardPromoBannerType.values().length];
        try {
            iArr[DashboardPromoBannerType.PLAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DashboardPromoBannerType.COUPON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
