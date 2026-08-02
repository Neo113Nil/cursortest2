package com.airbnb.lottie.utils;

import com.airbnb.lottie.utils.OffscreenLayer;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OffscreenLayer.RenderStrategy.values().length];
        a = iArr;
        try {
            iArr[OffscreenLayer.RenderStrategy.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[OffscreenLayer.RenderStrategy.SAVE_LAYER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[OffscreenLayer.RenderStrategy.BITMAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[OffscreenLayer.RenderStrategy.RENDER_NODE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
