package defpackage;

import com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon.RideCardDriverCarIconRepository$DriverCarType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ngk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RideCardDriverCarIconRepository$DriverCarType.values().length];
        try {
            iArr[RideCardDriverCarIconRepository$DriverCarType.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardDriverCarIconRepository$DriverCarType.SIMPLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
