package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.database.DatabaseHelper;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class b1 extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final DatabaseHelper c;
    public final com.yandex.passport.internal.report.reporters.b1 d;

    public b1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, DatabaseHelper databaseHelper, com.yandex.passport.internal.report.reporters.b1 b1Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = eVar;
        this.c = databaseHelper;
        this.d = b1Var;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        a1 a1Var = (a1) obj;
        ModernAccount a = this.b.a(com.yandex.passport.internal.l.b(a1Var.b(), a1Var.c().b(), a1Var.c().c(), null), a1Var.a().getEvent(), true);
        long value = a.getUid().getValue();
        Uid masterUid = a.getMasterUid();
        Long l = masterUid != null ? new Long(masterUid.getValue()) : null;
        this.d.l(value, l, a.getUserInfo().getHasMasterToken(), a1Var.a(), a1Var.c().c().getLocationId());
        if (a1Var.c().a() != null) {
            this.c.putClientToken(a.getUid(), a1Var.c().a());
        }
        return a;
    }
}
