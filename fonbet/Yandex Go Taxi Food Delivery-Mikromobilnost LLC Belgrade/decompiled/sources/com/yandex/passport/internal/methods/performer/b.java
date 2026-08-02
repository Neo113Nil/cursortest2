package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class b implements w0 {
    public final com.yandex.passport.internal.usecase.b a;
    public final com.yandex.passport.internal.methods.performer.error.a b;

    public b(com.yandex.passport.internal.usecase.b bVar, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new AddAccountPerformer$performMethod$1((com.yandex.passport.internal.methods.x) x2Var, this, null));
    }
}
