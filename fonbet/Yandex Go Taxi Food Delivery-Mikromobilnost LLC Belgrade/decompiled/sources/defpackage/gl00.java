package defpackage;

import com.yandex.go.proxyprovision.api.MapKitDefaultHost;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class gl00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapKitDefaultHost.values().length];
        try {
            iArr[MapKitDefaultHost.YANDEX_NET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapKitDefaultHost.YANDEX_COM_NET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MapKitDefaultHost.YANGO_COM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MapKitDefaultHost.EU_YANGO_TECH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MapKitDefaultHost.YANGO_TECH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
