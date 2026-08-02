package defpackage;

import com.ybsdk.feature.webview.api.WebViewControl;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class fq41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebViewControl.Type.values().length];
        try {
            iArr[WebViewControl.Type.CROSS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebViewControl.Type.ARROW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
