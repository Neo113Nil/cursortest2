package com.yandex.passport.internal.database.diary;

import com.yandex.passport.internal.database.PassportDatabase_Impl;

/* loaded from: classes8.dex */
public final class e {
    public final PassportDatabase_Impl a;
    public final c b;
    public final com.yandex.passport.internal.database.auth_cookie.c c;
    public final com.yandex.passport.internal.database.auth_cookie.c d;
    public final com.yandex.passport.internal.database.auth_cookie.c e;
    public final com.yandex.passport.internal.database.auth_cookie.c f;

    public e(PassportDatabase_Impl passportDatabase_Impl) {
        this.a = passportDatabase_Impl;
        int i = 2;
        this.b = new c(passportDatabase_Impl, i);
        this.c = new com.yandex.passport.internal.database.auth_cookie.c(passportDatabase_Impl, 1);
        this.d = new com.yandex.passport.internal.database.auth_cookie.c(passportDatabase_Impl, i);
        this.e = new com.yandex.passport.internal.database.auth_cookie.c(passportDatabase_Impl, 3);
        this.f = new com.yandex.passport.internal.database.auth_cookie.c(passportDatabase_Impl, 4);
    }
}
