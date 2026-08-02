package com.ybsdk.core.design.spoiler;

import com.ybsdk.core.design.spoiler.Spoiler;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Spoiler.Gravity.values().length];
        try {
            iArr[Spoiler.Gravity.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Spoiler.Gravity.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Spoiler.Gravity.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
