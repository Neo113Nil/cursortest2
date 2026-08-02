package com.yandex.passport.internal.database.auth_cookie;

import com.yandex.passport.internal.database.PassportDatabase_Impl;

/* loaded from: classes8.dex */
public final class d {
    public final PassportDatabase_Impl a;
    public final b b;
    public final com.yandex.passport.internal.database.converters.b c = new com.yandex.passport.internal.database.converters.b();
    public final com.yandex.passport.internal.database.converters.a d = new com.yandex.passport.internal.database.converters.a();
    public final c e;

    public d(PassportDatabase_Impl passportDatabase_Impl) {
        this.a = passportDatabase_Impl;
        this.b = new b(this, passportDatabase_Impl);
        this.e = new c(passportDatabase_Impl, 0);
    }
}
