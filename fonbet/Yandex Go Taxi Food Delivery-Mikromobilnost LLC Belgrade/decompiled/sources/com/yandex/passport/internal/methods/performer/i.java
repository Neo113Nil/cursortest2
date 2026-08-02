package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class i implements w0 {
    public final com.yandex.passport.internal.account.c a;
    public final com.yandex.passport.internal.methods.performer.error.a b;

    public i(com.yandex.passport.internal.account.c cVar, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = cVar;
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new AuthorizeByUserCredentialsPerformer$performMethod$1(this, (com.yandex.passport.internal.methods.e0) x2Var, null));
    }
}
