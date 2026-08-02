package com.yandex.passport.internal.upgrader;

import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.a0;
import com.yandex.passport.internal.stash.StashCell;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class d extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final n c;
    public final com.yandex.passport.internal.report.reporters.f d;

    public d(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, n nVar, com.yandex.passport.internal.report.reporters.f fVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = dVar;
        this.c = nVar;
        this.d = fVar;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        Uid uid = (Uid) obj;
        com.yandex.passport.internal.report.reporters.f fVar = this.d;
        fVar.getClass();
        fVar.g(a0.w, uid);
        ModernAccount e = this.b.a().e(uid);
        if (e != null) {
            n nVar = this.c;
            com.yandex.passport.internal.core.accounts.g gVar = nVar.a;
            StashCell stashCell = StashCell.UPGRADE_POSTPONED_AT;
            nVar.b.getClass();
            com.yandex.passport.internal.core.accounts.g.i(gVar, e, new Pair[]{new Pair(stashCell, String.valueOf(System.currentTimeMillis())), new Pair(StashCell.UPGRADE_STATUS, String.valueOf(PassportAccountUpgradeStatus.SKIPPED.ordinal()))});
        }
        return zy11.a;
    }
}
