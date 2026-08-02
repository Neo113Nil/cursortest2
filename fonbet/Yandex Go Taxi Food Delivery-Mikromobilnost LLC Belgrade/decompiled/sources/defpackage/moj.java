package defpackage;

import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.state.CouponSize;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class moj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CouponSize.values().length];
        try {
            iArr[CouponSize.M.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CouponSize.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
