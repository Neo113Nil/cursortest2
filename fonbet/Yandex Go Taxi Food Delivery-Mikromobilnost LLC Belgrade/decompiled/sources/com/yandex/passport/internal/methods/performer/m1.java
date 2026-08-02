package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.methods.v2;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.properties.UpdateableProperties;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class m1 implements w0 {
    public final com.yandex.passport.internal.properties.q a;
    public final com.yandex.passport.internal.usecase.u0 b;
    public final com.yandex.passport.internal.report.reporters.o0 c;

    public m1(com.yandex.passport.internal.properties.q qVar, com.yandex.passport.internal.usecase.u0 u0Var, com.yandex.passport.internal.report.reporters.o0 o0Var) {
        this.a = qVar;
        this.b = u0Var;
        this.c = o0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        v2 v2Var = (v2) x2Var;
        Object g = com.yandex.passport.common.util.a.g(new UpdatePropertiesPerformer$performMethod$1(this, v2Var, null));
        Throwable a = Result.a(g);
        if (a != null) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onFailure " + a, 8);
            }
            this.c.s(a, (UpdateableProperties) v2Var.b.c);
        }
        return g;
    }
}
