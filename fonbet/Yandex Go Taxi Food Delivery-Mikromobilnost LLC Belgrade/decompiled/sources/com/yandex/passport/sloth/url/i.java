package com.yandex.passport.sloth.url;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SlothUrlChecker$Status.values().length];
        try {
            iArr[SlothUrlChecker$Status.ALLOWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlothUrlChecker$Status.REDIRECT_COMMAND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlothUrlChecker$Status.BLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlothUrlChecker$Status.EXTERNAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SlothUrlChecker$Status.EXTERNAL_AND_CANCEL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
