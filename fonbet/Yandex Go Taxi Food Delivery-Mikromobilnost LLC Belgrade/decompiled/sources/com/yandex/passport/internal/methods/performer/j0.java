package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.data.network.j8;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.report.r7;
import com.yandex.passport.internal.report.yd;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class j0 implements w0 {
    public final j8 a;
    public final com.yandex.passport.internal.methods.performer.error.a b;
    public final com.yandex.passport.internal.report.reporters.d0 c;
    public final com.yandex.passport.internal.network.mappers.b w;

    public j0(j8 j8Var, com.yandex.passport.internal.methods.performer.error.a aVar, com.yandex.passport.internal.report.reporters.d0 d0Var, com.yandex.passport.internal.network.mappers.b bVar) {
        this.a = j8Var;
        this.b = aVar;
        this.c = d0Var;
        this.w = bVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Object g = com.yandex.passport.common.util.a.g(new GetQrLinkPerformer$performMethod$1((com.yandex.passport.internal.methods.m1) x2Var, this, null));
        Throwable a = Result.a(g);
        if (a == null) {
            return g;
        }
        try {
            com.yandex.passport.internal.report.reporters.d0 d0Var = this.c;
            d0Var.getClass();
            d0Var.f(r7.w, new yd(a));
            throw com.yandex.passport.internal.methods.performer.error.a.a(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
