package defpackage;

import com.yandex.messaging.MessengerEnvironment;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class n120 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessengerEnvironment.values().length];
        try {
            iArr[MessengerEnvironment.TESTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessengerEnvironment.ALPHA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessengerEnvironment.PRODUCTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MessengerEnvironment.TESTING_TEAM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MessengerEnvironment.ALPHA_TEAM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MessengerEnvironment.PRODUCTION_TEAM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
