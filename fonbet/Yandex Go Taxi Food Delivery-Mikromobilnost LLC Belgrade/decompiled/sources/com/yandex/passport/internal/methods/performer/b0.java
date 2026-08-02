package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.methods.x2;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class b0 implements w0 {
    public final com.yandex.passport.internal.account.a a;

    public b0(com.yandex.passport.internal.account.a aVar) {
        this.a = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        try {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getCurrentAccount", 8);
            }
            ModernAccount a = this.a.a();
            if (a != null) {
                return com.yandex.passport.internal.a0.g0(a);
            }
            return null;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
