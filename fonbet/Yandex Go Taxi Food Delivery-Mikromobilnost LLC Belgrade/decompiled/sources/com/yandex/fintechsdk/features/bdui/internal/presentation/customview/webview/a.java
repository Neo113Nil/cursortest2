package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.UrlMatch;

/* loaded from: classes12.dex */
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
