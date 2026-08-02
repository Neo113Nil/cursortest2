package com.yandex.go.design.divider;

import com.yandex.go.design.divider.CardDivider;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardDivider.Type.values().length];
        try {
            iArr[CardDivider.Type.BOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardDivider.Type.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardDivider.Type.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
