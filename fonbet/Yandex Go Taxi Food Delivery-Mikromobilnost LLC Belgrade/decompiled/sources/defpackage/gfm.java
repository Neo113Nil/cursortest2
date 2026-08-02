package defpackage;

import com.yandex.passport.api.KPassportEnvironment;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class gfm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[KPassportEnvironment.values().length];
        try {
            iArr[KPassportEnvironment.PRODUCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KPassportEnvironment.TEAM_PRODUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KPassportEnvironment.RC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[KPassportEnvironment.TESTING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[KPassportEnvironment.TEAM_TESTING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
