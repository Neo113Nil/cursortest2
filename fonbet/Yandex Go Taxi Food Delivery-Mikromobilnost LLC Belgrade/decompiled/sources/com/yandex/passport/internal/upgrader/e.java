package com.yandex.passport.internal.upgrader;

import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.stash.StashCell;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class e extends com.yandex.passport.common.domain.d {
    public final n b;
    public final com.yandex.passport.internal.core.accounts.d c;

    public e(com.yandex.passport.common.coroutine.a aVar, n nVar, com.yandex.passport.internal.core.accounts.d dVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = nVar;
        this.c = dVar;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        ModernAccount e = this.c.a().e((Uid) obj);
        if (e != null) {
            com.yandex.passport.internal.core.accounts.g.i(this.b.a, e, new Pair[]{new Pair(StashCell.UPGRADE_STATUS, String.valueOf(PassportAccountUpgradeStatus.NOT_NEEDED.ordinal()))});
        }
        return zy11.a;
    }
}
