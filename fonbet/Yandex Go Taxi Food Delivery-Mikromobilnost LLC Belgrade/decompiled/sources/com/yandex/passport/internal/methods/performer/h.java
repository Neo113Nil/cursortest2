package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.methods.x2;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class h implements w0 {
    public final com.yandex.passport.internal.account.c a;

    public h(com.yandex.passport.internal.account.c cVar) {
        this.a = cVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        com.yandex.passport.internal.methods.c0 c0Var = (com.yandex.passport.internal.methods.c0) x2Var;
        try {
            Environment u = com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) c0Var.b.c);
            com.yandex.passport.internal.account.c cVar = this.a;
            String str = (String) c0Var.c.c;
            AnalyticsFromValue.Companion.getClass();
            return com.yandex.passport.internal.a0.g0(cVar.e(u, str, com.yandex.passport.internal.analytics.a.b()));
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
