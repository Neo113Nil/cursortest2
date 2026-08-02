package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.methods.x2;
import defpackage.uw51;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class n implements w0 {
    public final com.yandex.passport.internal.core.accounts.d a;

    public n(com.yandex.passport.internal.core.accounts.d dVar) {
        this.a = dVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        com.yandex.passport.internal.methods.b bVar = ((com.yandex.passport.internal.methods.o0) x2Var).b;
        String str = (String) bVar.c;
        LogLevel logLevel = LogLevel.DEBUG;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("getAccount: machineReadableLogin=", str, logLevel, null, 10);
        }
        ModernAccount c = this.a.a().c(str);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(logLevel, null, "getAccount: account=" + c, 10);
        }
        try {
            if (c != null) {
                return com.yandex.passport.internal.a0.g0(c);
            }
            throw new PassportAccountNotFoundException("machineReadableLogin", (String) bVar.c);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
