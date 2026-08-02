package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class d implements w0 {
    public final com.yandex.passport.internal.usecase.authorize.d a;
    public final com.yandex.passport.internal.methods.performer.error.a b;

    public d(com.yandex.passport.internal.usecase.authorize.d dVar, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = dVar;
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new AuthorizeByCodePerformer$performMethod$1(this, (com.yandex.passport.internal.methods.z) x2Var, null));
    }
}
