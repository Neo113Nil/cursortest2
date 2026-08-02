package defpackage;

import com.yandex.payment.sdk.datasource.bind.interfaces.CardButtonTitle;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class i560 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardButtonTitle.values().length];
        try {
            iArr[CardButtonTitle.ShowNext.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardButtonTitle.ShowProcess.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
