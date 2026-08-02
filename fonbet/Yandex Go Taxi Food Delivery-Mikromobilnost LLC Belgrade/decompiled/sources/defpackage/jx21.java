package defpackage;

import com.yandex.payment.sdk.ui.CardInputMode;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class jx21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardInputMode.values().length];
        try {
            iArr[CardInputMode.BindOnly.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardInputMode.PayAndBind.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
