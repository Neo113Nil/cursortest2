package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.report.g5;
import com.yandex.passport.internal.report.h5;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.ld;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class e0 implements w0 {
    public final com.yandex.passport.internal.database.auth_cookie.a a;
    public final com.yandex.passport.internal.methods.performer.error.a b;
    public final com.yandex.passport.internal.report.reporters.r c;

    public e0(com.yandex.passport.internal.database.auth_cookie.a aVar, com.yandex.passport.internal.methods.performer.error.a aVar2, com.yandex.passport.internal.report.reporters.r rVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = rVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.h1) x2Var).b.c);
        com.yandex.passport.internal.report.reporters.r rVar = this.c;
        rVar.getClass();
        rVar.f(h5.w, new jd(Long.valueOf(B.getValue())));
        Object g = com.yandex.passport.common.util.a.g(new GetInvalidateCookiesAndDeleteAuthCookiesPerformer$performMethod$1(this, B, null));
        Throwable a = Result.a(g);
        if (a == null) {
            return g;
        }
        try {
            rVar.f(g5.w, new jd(Long.valueOf(B.getValue())), new ld(a));
            throw com.yandex.passport.internal.methods.performer.error.a.a(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
