package com.yandex.passport.internal.sloth;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.ui.domik.webam.WebAmRegistrationType;
import com.yandex.passport.sloth.data.SlothLoginAction;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[SlothLoginAction.values().length];
        try {
            iArr[SlothLoginAction.EMPTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlothLoginAction.PASSWORD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlothLoginAction.REGISTRATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlothLoginAction.MAGIC_LINK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SlothLoginAction.SMS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SlothLoginAction.LOGIN_RESTORE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SlothLoginAction.REG_NEO_PHONISH.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[WebAmRegistrationType.values().length];
        try {
            iArr2[WebAmRegistrationType.Portal.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[WebAmRegistrationType.Neophonish.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[WebAmRegistrationType.Doregish.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[WebAmRegistrationType.Nothing.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr2;
        int[] iArr3 = new int[AppTheme.values().length];
        try {
            iArr3[AppTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[AppTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[AppTheme.FOLLOW_SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        c = iArr3;
        int[] iArr4 = new int[PassportTheme.values().length];
        try {
            iArr4[PassportTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[PassportTheme.LIGHT_CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[PassportTheme.DARK.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[PassportTheme.FOLLOW_SYSTEM.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        d = iArr4;
        int[] iArr5 = new int[PassportAccountType.values().length];
        try {
            iArr5[PassportAccountType.PORTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[PassportAccountType.LITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[PassportAccountType.SOCIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[PassportAccountType.PDD.ordinal()] = 4;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr5[PassportAccountType.PHONISH.ordinal()] = 5;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr5[PassportAccountType.MAILISH.ordinal()] = 6;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr5[PassportAccountType.MUSIC_PHONISH.ordinal()] = 7;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr5[PassportAccountType.CHILDISH.ordinal()] = 8;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr5[PassportAccountType.UNDEFINED.ordinal()] = 9;
        } catch (NoSuchFieldError unused27) {
        }
        e = iArr5;
    }
}
