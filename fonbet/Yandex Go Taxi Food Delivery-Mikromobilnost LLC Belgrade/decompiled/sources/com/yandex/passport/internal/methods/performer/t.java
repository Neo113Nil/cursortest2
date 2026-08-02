package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class t implements w0 {
    public final com.yandex.passport.internal.usecase.y a;
    public final com.yandex.passport.internal.methods.performer.error.a b;
    public final com.yandex.passport.common.ui.lang.b c;
    public final com.yandex.passport.internal.report.reporters.c0 w;

    public t(com.yandex.passport.internal.usecase.y yVar, com.yandex.passport.internal.methods.performer.error.a aVar, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.report.reporters.c0 c0Var) {
        this.a = yVar;
        this.b = aVar;
        this.c = bVar;
        this.w = c0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        com.yandex.passport.internal.methods.x0 x0Var = (com.yandex.passport.internal.methods.x0) x2Var;
        Object h = com.yandex.passport.common.util.a.h(new GetAuthorizationUrlPerformer$performMethod$1(x0Var, this, null));
        Throwable a = Result.a(h);
        if (a == null) {
            return h;
        }
        try {
            this.w.k(String.valueOf(a.getMessage()), String.valueOf(x0Var.e().getUid().getValue()), x0Var.e().getAnalyticsParams());
            throw com.yandex.passport.internal.methods.performer.error.a.a(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
