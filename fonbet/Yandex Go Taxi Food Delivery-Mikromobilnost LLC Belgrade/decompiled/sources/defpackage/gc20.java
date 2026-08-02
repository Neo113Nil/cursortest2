package defpackage;

import io.appmetrica.analytics.IParamsCallback;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class gc20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IParamsCallback.Reason.values().length];
        try {
            iArr[IParamsCallback.Reason.NETWORK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IParamsCallback.Reason.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IParamsCallback.Reason.INVALID_RESPONSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[IParamsCallback.Reason.INCONSISTENT_CLIDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
