package defpackage;

import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class e551 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProductsScreenType$Type.values().length];
        try {
            iArr[ProductsScreenType$Type.ON_MULTI_ORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductsScreenType$Type.SUPERAPP_MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductsScreenType$Type.TRACKING_LIST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
