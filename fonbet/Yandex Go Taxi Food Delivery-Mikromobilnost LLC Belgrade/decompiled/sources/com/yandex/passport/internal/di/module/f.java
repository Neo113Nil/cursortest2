package com.yandex.passport.internal.di.module;

import android.content.Context;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.database.PassportDatabase;
import defpackage.dai0;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class f implements v7p {
    public final /* synthetic */ int a;
    public final e b;
    public final yvf0 c;

    public /* synthetic */ f(e eVar, yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = eVar;
        this.c = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.c;
        e eVar = this.b;
        switch (i) {
            case 0:
                PassportDatabase passportDatabase = (PassportDatabase) yvf0Var.get();
                eVar.getClass();
                com.yandex.passport.internal.database.auth_cookie.d S0 = passportDatabase.S0();
                q5z.i(S0);
                return S0;
            case 1:
                DatabaseHelper databaseHelper = (DatabaseHelper) yvf0Var.get();
                eVar.getClass();
                com.yandex.passport.internal.database.n tokensDao = databaseHelper.getTokensDao();
                q5z.i(tokensDao);
                return tokensDao;
            case 2:
                PassportDatabase passportDatabase2 = (PassportDatabase) yvf0Var.get();
                eVar.getClass();
                com.yandex.passport.internal.database.diary.e U0 = passportDatabase2.U0();
                q5z.i(U0);
                return U0;
            case 3:
                DatabaseHelper databaseHelper2 = (DatabaseHelper) yvf0Var.get();
                eVar.getClass();
                return new com.yandex.passport.internal.database.g(databaseHelper2);
            default:
                Context context = (Context) yvf0Var.get();
                eVar.getClass();
                androidx.room.j l = dai0.l(context, PassportDatabase.class, "passport-database");
                l.a(com.yandex.passport.internal.database.i.a);
                return (PassportDatabase) l.b();
        }
    }
}
