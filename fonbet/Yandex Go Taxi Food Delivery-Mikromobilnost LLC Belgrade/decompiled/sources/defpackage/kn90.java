package defpackage;

import com.yandex.passport.api.PassportVpnStatus;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class kn90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassportVpnStatus.values().length];
        try {
            iArr[PassportVpnStatus.Allowed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassportVpnStatus.Blocked.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
