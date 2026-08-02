package defpackage;

import com.yandex.passport.api.PassportTheme;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class ho90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassportTheme.values().length];
        try {
            iArr[PassportTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassportTheme.LIGHT_CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PassportTheme.DARK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PassportTheme.FOLLOW_SYSTEM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
