package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.methods.h2;
import com.yandex.passport.internal.methods.x2;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class d1 implements w0 {
    public final com.yandex.passport.internal.core.accounts.z a;
    public final com.yandex.passport.internal.core.accounts.n b;

    public d1(com.yandex.passport.internal.core.accounts.z zVar, com.yandex.passport.internal.core.accounts.n nVar) {
        this.a = zVar;
        this.b = nVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Object g = com.yandex.passport.common.util.a.g(new RemoveAccountExplicitlyPerformer$performMethod$1((h2) x2Var, this, null));
        Throwable a = Result.a(g);
        if (a != null) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, "removeAccountUseCase executing failed: " + a.getMessage(), 8);
            }
        }
        return g;
    }
}
