package defpackage;

import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class mac0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlacesNavigationEntry$Source.values().length];
        try {
            iArr[PlacesNavigationEntry$Source.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlacesNavigationEntry$Source.STARTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
