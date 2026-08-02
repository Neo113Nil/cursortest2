package defpackage;

import com.yandex.div.json.ParsingExceptionReason;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class mnt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ParsingExceptionReason.values().length];
        try {
            iArr[ParsingExceptionReason.MISSING_TEMPLATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ParsingExceptionReason.MISSING_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ParsingExceptionReason.MISSING_VARIABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ParsingExceptionReason.TYPE_MISMATCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ParsingExceptionReason.INVALID_VALUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ParsingExceptionReason.DEPENDENCY_FAILED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
