package defpackage;

import com.yandex.go.payments.navigation.LpmPaymentRouter$UiMode;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class dzz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LpmPaymentRouter$UiMode.values().length];
        try {
            iArr[LpmPaymentRouter$UiMode.FULLSCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LpmPaymentRouter$UiMode.MODAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
