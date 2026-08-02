package com.yandex.payment.sdk.flex.impl.customview.views.webview;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UrlMatch.values().length];
        try {
            iArr[UrlMatch.CONTAINING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UrlMatch.EXACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
