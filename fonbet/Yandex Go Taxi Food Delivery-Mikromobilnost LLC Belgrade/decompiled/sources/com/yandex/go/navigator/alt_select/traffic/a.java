package com.yandex.go.navigator.alt_select.traffic;

import com.yandex.go.navigator.alt_select.traffic.CyclicTransitionDrawable;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CyclicTransitionDrawable.State.values().length];
        try {
            iArr[CyclicTransitionDrawable.State.STARTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CyclicTransitionDrawable.State.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
