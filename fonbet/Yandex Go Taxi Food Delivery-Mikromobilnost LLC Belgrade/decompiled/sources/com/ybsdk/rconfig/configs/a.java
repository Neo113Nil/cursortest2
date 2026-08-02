package com.ybsdk.rconfig.configs;

import com.ybsdk.rconfig.configs.ProductsV4GradientConfig;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProductsV4GradientConfig.GradientType.values().length];
        try {
            iArr[ProductsV4GradientConfig.GradientType.HEADER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductsV4GradientConfig.GradientType.FOOTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
