package com.yandex.div.internal.widget.tabs;

import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BaseIndicatorTabLayout.AnimationType.values().length];
        a = iArr;
        try {
            iArr[BaseIndicatorTabLayout.AnimationType.FADE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[BaseIndicatorTabLayout.AnimationType.SLIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
