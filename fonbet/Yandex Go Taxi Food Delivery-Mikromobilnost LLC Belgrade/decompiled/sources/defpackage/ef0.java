package defpackage;

import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ef0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.values().length];
        try {
            iArr[WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.OPEN_EXTERNAL_URL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.OPEN_OTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.OTP_SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.OTP_FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.BINDING_SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.WEBVIEW_LOADED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.BINDING_FAILED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.SHOW_ERROR_MESSAGE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
