package defpackage;

import com.yandex.go.payments.paymentlist.data.EditModeState;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class omn {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EditModeState.values().length];
        try {
            iArr[EditModeState.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EditModeState.ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EditModeState.GONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
