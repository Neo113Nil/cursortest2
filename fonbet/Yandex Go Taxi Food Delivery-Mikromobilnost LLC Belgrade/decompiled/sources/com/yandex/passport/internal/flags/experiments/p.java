package com.yandex.passport.internal.flags.experiments;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ExperimentsUpdater$LoadingStrategy.values().length];
        try {
            iArr[ExperimentsUpdater$LoadingStrategy.FORCED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExperimentsUpdater$LoadingStrategy.DAILY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExperimentsUpdater$LoadingStrategy.INITIALIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
