package com.yandex.passport.internal.push;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class s0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnqueueType.values().length];
        try {
            iArr[EnqueueType.JOB_INTENT_SERVICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnqueueType.COROUTINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
