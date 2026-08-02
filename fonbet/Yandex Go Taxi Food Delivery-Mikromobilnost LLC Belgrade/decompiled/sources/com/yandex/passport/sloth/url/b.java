package com.yandex.passport.sloth.url;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.sloth.command.data.SlothAccountType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Environment.values().length];
        try {
            iArr[Environment.RC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Environment.TESTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[SlothAccountType.values().length];
        try {
            iArr2[SlothAccountType.PORTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SlothAccountType.LITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SlothAccountType.SOCIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SlothAccountType.PDD.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SlothAccountType.PHONISH.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SlothAccountType.MAILISH.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SlothAccountType.MUSIC_PHONISH.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[SlothAccountType.CHILDISH.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[SlothAccountType.UNDEFINED.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr2;
    }
}
