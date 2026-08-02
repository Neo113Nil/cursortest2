package com.yandex.passport.internal.report.reporters;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class x {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EsiaBindingReporter$FinishStatus.values().length];
        try {
            iArr[EsiaBindingReporter$FinishStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EsiaBindingReporter$FinishStatus.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EsiaBindingReporter$FinishStatus.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
