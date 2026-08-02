package defpackage;

import com.yandex.plus.webview.core.resource.WebViewNavigationReason;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class li41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebViewNavigationReason.values().length];
        try {
            iArr[WebViewNavigationReason.OTHER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebViewNavigationReason.REDIRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebViewNavigationReason.USER_ACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
