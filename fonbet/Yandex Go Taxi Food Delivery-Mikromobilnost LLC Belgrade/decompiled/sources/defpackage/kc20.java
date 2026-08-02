package defpackage;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class kc20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeferredDeeplinkListener.Error.values().length];
        try {
            iArr[DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeferredDeeplinkListener.Error.PARSE_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeferredDeeplinkListener.Error.NO_REFERRER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeferredDeeplinkListener.Error.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
