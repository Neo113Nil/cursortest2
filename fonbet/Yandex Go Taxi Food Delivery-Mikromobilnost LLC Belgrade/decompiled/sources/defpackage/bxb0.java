package defpackage;

import com.yandex.go.design.compose.taxi.shared.pin.PinSize;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class bxb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinSize.values().length];
        try {
            iArr[PinSize.L.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinSize.M.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PinSize.S.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PinSize.XS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
