package defpackage;

import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class in90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DefaultEnvironment.values().length];
        try {
            iArr[DefaultEnvironment.TESTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DefaultEnvironment.PRODUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
