package defpackage;

import com.yandex.go.payments.api.GooglePayInteractor$GooglePayTokenResult;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class jvt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GooglePayInteractor$GooglePayTokenResult.values().length];
        try {
            iArr[GooglePayInteractor$GooglePayTokenResult.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GooglePayInteractor$GooglePayTokenResult.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GooglePayInteractor$GooglePayTokenResult.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
