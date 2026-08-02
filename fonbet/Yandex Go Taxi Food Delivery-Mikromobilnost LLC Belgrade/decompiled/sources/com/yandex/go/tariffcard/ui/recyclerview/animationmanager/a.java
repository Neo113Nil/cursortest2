package com.yandex.go.tariffcard.ui.recyclerview.animationmanager;

import com.yandex.go.tariffcard.ui.recyclerview.animationmanager.CombinedValueAnimator;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CombinedValueAnimator.DurationScaleMode.values().length];
        try {
            iArr[CombinedValueAnimator.DurationScaleMode.TOGETHER_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CombinedValueAnimator.DurationScaleMode.TOGETHER_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
