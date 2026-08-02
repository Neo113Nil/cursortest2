package defpackage;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class emk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RideCardPresentationType.values().length];
        try {
            iArr[RideCardPresentationType.DETAILS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardPresentationType.COMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
