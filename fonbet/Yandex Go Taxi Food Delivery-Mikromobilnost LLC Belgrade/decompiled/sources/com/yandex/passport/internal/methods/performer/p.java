package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.common.logger.LogLevel;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class p implements w0 {
    public final com.yandex.passport.internal.core.accounts.d a;

    public p(com.yandex.passport.internal.core.accounts.d dVar) {
        this.a = dVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(com.yandex.passport.internal.methods.q0 q0Var) {
        Object g = com.yandex.passport.common.util.a.g(new GetAccountByUidPerformer$performMethod$1(q0Var, this, null));
        LogLevel logLevel = LogLevel.DEBUG;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            StringBuilder sb = new StringBuilder("Got an account with uid={");
            sb.append(q0Var);
            sb.append(".uid} and success=");
            sb.append(!(g instanceof Result.Failure));
            com.yandex.passport.common.logger.a.c(logLevel, null, sb.toString(), 10);
        }
        return g;
    }
}
