package defpackage;

import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class iac0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlacesNavigationMode.values().length];
        try {
            iArr[PlacesNavigationMode.NATIVE_NAVIGATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlacesNavigationMode.DEEPLINK_NAVIGATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
