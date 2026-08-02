package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.methods.x2;
import defpackage.uw51;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class o implements w0 {
    public final com.yandex.passport.internal.core.accounts.d a;

    public o(com.yandex.passport.internal.core.accounts.d dVar) {
        this.a = dVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        com.yandex.passport.internal.methods.b bVar = ((com.yandex.passport.internal.methods.p0) x2Var).b;
        String str = (String) bVar.c;
        LogLevel logLevel = LogLevel.DEBUG;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("getAccount: accountName=", str, logLevel, null, 10);
        }
        com.yandex.passport.internal.b a = this.a.a();
        ModernAccount b = com.yandex.passport.common.permission.b.b(a.a, null, str, a.b);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(logLevel, null, "getAccount: account=" + b, 10);
        }
        try {
            if (b != null) {
                return com.yandex.passport.internal.a0.g0(b);
            }
            throw new PassportAccountNotFoundException("name", (String) bVar.c);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
