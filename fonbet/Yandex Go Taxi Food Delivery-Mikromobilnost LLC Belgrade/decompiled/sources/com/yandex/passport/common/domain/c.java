package com.yandex.passport.common.domain;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RetryStrategy.values().length];
        try {
            iArr[RetryStrategy.CONSTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RetryStrategy.LINEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RetryStrategy.EXPONENTIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
