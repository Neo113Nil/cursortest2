package defpackage;

import com.ybsdk.feature.main.api.ui.DivListReporter$Screen;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class fzk {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivListReporter$Screen.values().length];
        try {
            iArr[DivListReporter$Screen.PRODUCTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivListReporter$Screen.MERCHANT_OFFERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
