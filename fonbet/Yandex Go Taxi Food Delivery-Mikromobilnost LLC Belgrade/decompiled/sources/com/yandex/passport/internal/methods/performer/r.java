package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class r implements w0 {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final com.yandex.passport.internal.filter.i b;

    public r(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.filter.i iVar) {
        this.a = dVar;
        this.b = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.g(new GetAccountsListPerformer$performMethod$1(this, (com.yandex.passport.internal.methods.u0) x2Var, null));
    }
}
