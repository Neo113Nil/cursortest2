package defpackage;

import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class eyv {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AndroidLocationProviderType.values().length];
        try {
            iArr[AndroidLocationProviderType.GPS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AndroidLocationProviderType.NETWORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AndroidLocationProviderType.PASSIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AndroidLocationProviderType.FUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
