package com.yandex.div.internal.widget;

import com.yandex.div.internal.widget.AspectImageView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AspectImageView.Scale.values().length];
        try {
            iArr[AspectImageView.Scale.NO_SCALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AspectImageView.Scale.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AspectImageView.Scale.FILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AspectImageView.Scale.STRETCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
