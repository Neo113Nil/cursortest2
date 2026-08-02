package defpackage;

import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class l6e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ConsoleLoggingMode.values().length];
        try {
            iArr[ConsoleLoggingMode.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConsoleLoggingMode.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ConsoleLoggingMode.AUTOMATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
