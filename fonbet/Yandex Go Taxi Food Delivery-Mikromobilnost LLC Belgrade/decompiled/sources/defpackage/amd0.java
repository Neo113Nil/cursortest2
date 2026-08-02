package defpackage;

import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class amd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Deeplink$WebViewFormat.values().length];
        try {
            iArr[Deeplink$WebViewFormat.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Deeplink$WebViewFormat.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
