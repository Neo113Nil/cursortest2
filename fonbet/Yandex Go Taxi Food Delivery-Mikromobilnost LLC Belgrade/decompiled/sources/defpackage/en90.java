package defpackage;

import com.ybsdk.feature.passport.api.YbPassportEnvironment;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class en90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YbPassportEnvironment.values().length];
        try {
            iArr[YbPassportEnvironment.TESTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbPassportEnvironment.PRODUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
