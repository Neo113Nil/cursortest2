package defpackage;

import com.yandex.plus.log.api.LogPriority;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class jlz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LogPriority.values().length];
        try {
            iArr[LogPriority.VERBOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogPriority.DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LogPriority.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LogPriority.WARNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LogPriority.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LogPriority.ASSERT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
