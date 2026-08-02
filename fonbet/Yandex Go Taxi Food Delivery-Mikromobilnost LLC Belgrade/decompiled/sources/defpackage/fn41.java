package defpackage;

import ru.yandex.taxi.logistics.sdk.webview.api.WebViewState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class fn41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebViewState.values().length];
        try {
            iArr[WebViewState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebViewState.READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebViewState.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
