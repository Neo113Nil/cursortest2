package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class c implements w0 {
    public final com.yandex.passport.internal.usecase.authorize.l a;
    public final com.yandex.passport.internal.methods.performer.error.a b;
    public final com.yandex.passport.internal.report.reporters.d0 c;

    public c(com.yandex.passport.internal.usecase.authorize.l lVar, com.yandex.passport.internal.methods.performer.error.a aVar, com.yandex.passport.internal.report.reporters.d0 d0Var) {
        this.a = lVar;
        this.b = aVar;
        this.c = d0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new AuthByQrLinkPerformer$performMethod$1((com.yandex.passport.internal.methods.y) x2Var, this, null));
    }
}
