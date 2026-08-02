package defpackage;

import com.ybsdk.feature.card.api.RetrofitProvider$Type;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class app0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RetrofitProvider$Type.values().length];
        try {
            iArr[RetrofitProvider$Type.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RetrofitProvider$Type.PCI_DSS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
