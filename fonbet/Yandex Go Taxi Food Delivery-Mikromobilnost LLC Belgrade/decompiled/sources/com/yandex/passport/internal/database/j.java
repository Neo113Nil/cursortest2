package com.yandex.passport.internal.database;

import defpackage.hkw0;
import defpackage.zg20;

/* loaded from: classes8.dex */
public final class j extends zg20 {
    public j() {
        super(1, 2);
    }

    @Override // defpackage.zg20
    public final void b(hkw0 hkw0Var) {
        hkw0Var.r("CREATE TABLE IF NOT EXISTS `auth_cookie` (`uid` TEXT NOT NULL, `cookies` TEXT NOT NULL, PRIMARY KEY(`uid`))");
    }
}
