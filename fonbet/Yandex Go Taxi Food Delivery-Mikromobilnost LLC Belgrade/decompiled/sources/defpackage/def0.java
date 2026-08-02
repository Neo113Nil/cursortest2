package defpackage;

import com.yandex.messaging.auth.AuthEnvironment;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class def0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AuthEnvironment.values().length];
        try {
            iArr[AuthEnvironment.Production.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AuthEnvironment.TeamProduction.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AuthEnvironment.Testing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AuthEnvironment.TeamTesting.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AuthEnvironment.Rc.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
