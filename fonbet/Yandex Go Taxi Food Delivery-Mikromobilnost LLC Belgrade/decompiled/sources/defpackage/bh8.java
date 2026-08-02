package defpackage;

import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.contract.TextState;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class bh8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextState.values().length];
        try {
            iArr[TextState.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextState.MASKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
