package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class g implements w0 {
    public final com.yandex.passport.internal.usecase.authorize.h a;
    public final com.yandex.passport.internal.methods.performer.error.a b;

    public g(com.yandex.passport.internal.usecase.authorize.h hVar, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = hVar;
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new AuthorizeByForwardTrackPerformer$performMethod$1(this, (com.yandex.passport.internal.methods.d0) x2Var, null));
    }
}
