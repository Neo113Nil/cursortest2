package defpackage;

import com.yandex.images.NetworkUtils$ConnectionStrength;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class efv {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NetworkUtils$ConnectionStrength.values().length];
        a = iArr;
        try {
            iArr[NetworkUtils$ConnectionStrength.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[NetworkUtils$ConnectionStrength.MOBILE_2G.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[NetworkUtils$ConnectionStrength.MOBILE_3G.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[NetworkUtils$ConnectionStrength.MOBILE_4G.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[NetworkUtils$ConnectionStrength.WIRELESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[NetworkUtils$ConnectionStrength.ETHERNET.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
