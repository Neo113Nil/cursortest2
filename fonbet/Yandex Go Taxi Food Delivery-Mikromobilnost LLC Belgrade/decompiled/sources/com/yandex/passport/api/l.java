package com.yandex.passport.api;

/* loaded from: classes8.dex */
public final class l {
    public static PassportAccountType a(int i, boolean z) {
        return i != 1 ? i != 10 ? i != 12 ? i != 24 ? i != 5 ? i != 6 ? i != 7 ? PassportAccountType.UNDEFINED : PassportAccountType.PDD : PassportAccountType.SOCIAL : PassportAccountType.LITE : PassportAccountType.PORTAL : PassportAccountType.MAILISH : z ? PassportAccountType.MUSIC_PHONISH : PassportAccountType.PHONISH : PassportAccountType.PORTAL;
    }
}
