package com.ybsdk.core.design.animation.ticker;

import com.ybsdk.core.design.animation.ticker.TickerView;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TickerView.ScrollingDirection.values().length];
        try {
            iArr[TickerView.ScrollingDirection.DOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TickerView.ScrollingDirection.UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TickerView.ScrollingDirection.ANY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
