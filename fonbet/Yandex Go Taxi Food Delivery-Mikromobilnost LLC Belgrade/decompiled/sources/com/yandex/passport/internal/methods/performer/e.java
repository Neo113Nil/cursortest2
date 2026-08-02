package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class e implements w0 {
    public final com.yandex.passport.internal.usecase.authorize.b a;
    public final com.yandex.passport.internal.methods.performer.error.a b;

    public e(com.yandex.passport.internal.usecase.authorize.b bVar, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new AuthorizeByCookiePerformer$performMethod$1(this, (com.yandex.passport.internal.methods.a0) x2Var, null));
    }
}
