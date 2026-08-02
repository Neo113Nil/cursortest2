package com.yandex.div.internal.widget.slider;

import com.yandex.div.internal.widget.slider.SliderView;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SliderView.Thumb.values().length];
        try {
            iArr[SliderView.Thumb.THUMB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SliderView.Thumb.THUMB_SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
