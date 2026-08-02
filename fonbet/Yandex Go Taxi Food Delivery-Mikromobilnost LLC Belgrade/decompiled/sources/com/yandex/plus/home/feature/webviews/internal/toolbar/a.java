package com.yandex.plus.home.feature.webviews.internal.toolbar;

import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebViewToolbar.OnIconPressAnimation.values().length];
        try {
            iArr[WebViewToolbar.OnIconPressAnimation.RIPPLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebViewToolbar.OnIconPressAnimation.SCALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
