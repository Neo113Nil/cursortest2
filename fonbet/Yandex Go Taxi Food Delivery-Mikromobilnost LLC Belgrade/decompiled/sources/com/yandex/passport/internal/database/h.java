package com.yandex.passport.internal.database;

import defpackage.hkw0;
import defpackage.zg20;

/* loaded from: classes8.dex */
public final class h extends zg20 {
    @Override // defpackage.zg20
    public final void b(hkw0 hkw0Var) {
        hkw0Var.r("CREATE TABLE IF NOT EXISTS modern_auth_cookie (\n    uid TEXT NOT NULL,\n    cookies TEXT NOT NULL,\n    domain TEXT NOT NULL DEFAULT '',\n    PRIMARY KEY (uid, domain)\n);");
        hkw0Var.r("INSERT INTO modern_auth_cookie (uid, cookies, domain)\nSELECT uid, cookies, '' FROM auth_cookie;");
        hkw0Var.r("DROP TABLE auth_cookie");
    }
}
