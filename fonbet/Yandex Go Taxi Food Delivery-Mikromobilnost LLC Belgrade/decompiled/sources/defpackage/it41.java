package defpackage;

import com.ybsdk.feature.webview.api.WebViewScreenParams;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class it41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebViewScreenParams.Auth.values().length];
        try {
            iArr[WebViewScreenParams.Auth.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebViewScreenParams.Auth.YANDEX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebViewScreenParams.Auth.BNK_NO_VERIFY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WebViewScreenParams.Auth.BNK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
