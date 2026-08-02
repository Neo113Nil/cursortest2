package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class f implements w0 {
    public final com.yandex.passport.internal.usecase.authorize.f a;
    public final com.yandex.passport.internal.methods.performer.error.a b;

    public f(com.yandex.passport.internal.usecase.authorize.f fVar, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = fVar;
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new AuthorizeByDeviceCodePerformer$performMethod$1((com.yandex.passport.internal.methods.b0) x2Var, this, null));
    }
}
