package defpackage;

import com.ybsdk.api.entities.YBBuildFlavor;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class cs6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YBBuildFlavor.values().length];
        try {
            iArr[YBBuildFlavor.DEV.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YBBuildFlavor.PROD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
