package defpackage;

import com.yandex.go.payments.api.GooglePayInteractor$GooglePayTokenResult;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class eba0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GooglePayInteractor$GooglePayTokenResult.values().length];
        try {
            iArr[GooglePayInteractor$GooglePayTokenResult.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
