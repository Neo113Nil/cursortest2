package defpackage;

import ru.yandex.taxi.logistics.sdk.logger.Logger$Severity;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class cgz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Logger$Severity.values().length];
        try {
            iArr[Logger$Severity.VERBOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Logger$Severity.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Logger$Severity.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Logger$Severity.DEBUG.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Logger$Severity.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
