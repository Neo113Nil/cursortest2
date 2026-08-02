package defpackage;

import com.yandex.messaging.MessengerEnvironment;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class ift {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessengerEnvironment.values().length];
        try {
            iArr[MessengerEnvironment.PRODUCTION_TEAM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
