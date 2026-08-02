package defpackage;

import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class e42 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DefaultEnvironment.values().length];
        try {
            iArr[DefaultEnvironment.PRODUCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DefaultEnvironment.TESTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
