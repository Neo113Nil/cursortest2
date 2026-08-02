package defpackage;

import com.yandex.plus.core.debug.panel.internal.model.log.LogModel$LogDetails$LogLevel;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class jez {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LogModel$LogDetails$LogLevel.values().length];
        try {
            iArr[LogModel$LogDetails$LogLevel.VERBOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogModel$LogDetails$LogLevel.DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LogModel$LogDetails$LogLevel.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LogModel$LogDetails$LogLevel.WARN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LogModel$LogDetails$LogLevel.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LogModel$LogDetails$LogLevel.UNSPECIFIED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
