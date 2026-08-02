package defpackage;

import com.yandex.passport.api.PassportAccountType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class hl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassportAccountType.values().length];
        try {
            iArr[PassportAccountType.PORTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassportAccountType.CHILDISH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PassportAccountType.LITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PassportAccountType.SOCIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PassportAccountType.PHONISH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PassportAccountType.PDD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PassportAccountType.MAILISH.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PassportAccountType.MUSIC_PHONISH.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PassportAccountType.UNDEFINED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
