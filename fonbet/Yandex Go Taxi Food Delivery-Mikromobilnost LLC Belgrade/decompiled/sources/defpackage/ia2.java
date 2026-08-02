package defpackage;

import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationType;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class ia2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AndroidLocationType.values().length];
        try {
            iArr[AndroidLocationType.Gps.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AndroidLocationType.Network.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AndroidLocationType.Fused.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
