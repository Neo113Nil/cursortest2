package com.google.android.material.carousel;

import com.google.android.material.carousel.CarouselStrategy;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CarouselStrategy.StrategyType.values().length];
        a = iArr;
        try {
            iArr[CarouselStrategy.StrategyType.CONTAINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
    }
}
