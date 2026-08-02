package defpackage;

import com.yandex.fintechsdk.entities.environment.PayEnvironment;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class gu90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PayEnvironment.values().length];
        try {
            iArr[PayEnvironment.PRODUCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PayEnvironment.SANDBOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PayEnvironment.TESTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
