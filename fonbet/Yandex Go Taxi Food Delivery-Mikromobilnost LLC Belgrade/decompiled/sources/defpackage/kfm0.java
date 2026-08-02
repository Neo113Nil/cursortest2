package defpackage;

import com.yandex.payment.sdk.model.data.WidthOnLargeScreen;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class kfm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WidthOnLargeScreen.values().length];
        try {
            iArr[WidthOnLargeScreen.COMPACT_WIDTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WidthOnLargeScreen.FULL_SCREEN_WIDTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
