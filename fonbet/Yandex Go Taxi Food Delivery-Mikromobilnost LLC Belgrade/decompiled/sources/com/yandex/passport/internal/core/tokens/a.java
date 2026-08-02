package com.yandex.passport.internal.core.tokens;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.i;
import com.yandex.passport.internal.database.DatabaseHelper;
import defpackage.w53;

/* loaded from: classes8.dex */
public final class a {
    public final DatabaseHelper a;
    public final c0 b;

    public a(DatabaseHelper databaseHelper, c0 c0Var) {
        this.a = databaseHelper;
        this.b = c0Var;
    }

    public final void a(ModernAccount modernAccount) {
        Uid uid = modernAccount.getUid();
        this.a.dropClientToken(uid);
        c0 c0Var = this.b;
        c0Var.getClass();
        w53 w53Var = new w53();
        if (uid != null) {
            w53Var.put("uid", String.valueOf(uid.getValue()));
        }
        c0Var.a.a(i.b, w53Var);
    }
}
