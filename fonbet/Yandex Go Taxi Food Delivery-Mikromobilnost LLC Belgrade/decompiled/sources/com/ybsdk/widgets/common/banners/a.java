package com.ybsdk.widgets.common.banners;

import com.ybsdk.widgets.common.banners.PromoBannerMediumView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PromoBannerMediumView.ButtonMode.values().length];
        try {
            iArr[PromoBannerMediumView.ButtonMode.GONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PromoBannerMediumView.ButtonMode.INVISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
