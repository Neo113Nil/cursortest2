package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class v implements w0 {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final com.yandex.passport.internal.filter.i b;
    public final com.yandex.passport.internal.usecase.o0 c;
    public final com.yandex.passport.internal.flags.j w;

    public v(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.filter.i iVar, com.yandex.passport.internal.usecase.o0 o0Var, com.yandex.passport.internal.flags.j jVar) {
        this.a = dVar;
        this.b = iVar;
        this.c = o0Var;
        this.w = jVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.g(new GetAvailableAccountsPerformer$performMethod$1(this, (com.yandex.passport.internal.methods.y0) x2Var, null));
    }
}
