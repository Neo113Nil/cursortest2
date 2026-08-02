package defpackage;

import ru.yandex.videoplayer.multiplatform.utils.network.NetworkType;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class e260 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NetworkType.values().length];
        try {
            iArr[NetworkType.NETWORK_TYPE_WIFI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NetworkType.NETWORK_TYPE_2G.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NetworkType.NETWORK_TYPE_3G.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NetworkType.NETWORK_TYPE_4G.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[NetworkType.NETWORK_TYPE_5G_SA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[NetworkType.NETWORK_TYPE_5G_NSA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[NetworkType.NETWORK_TYPE_CELLULAR_UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
