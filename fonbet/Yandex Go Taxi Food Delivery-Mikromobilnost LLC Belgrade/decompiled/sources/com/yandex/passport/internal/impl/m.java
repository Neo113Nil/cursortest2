package com.yandex.passport.internal.impl;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.tje;
import defpackage.u40;
import kotlin.Result;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class m implements u40 {
    public final /* synthetic */ n0 a;
    public final /* synthetic */ o b;

    public m(n0 n0Var, o oVar) {
        this.a = n0Var;
        this.b = oVar;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        Result result = (Result) obj;
        Object value = result.getValue();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Activity result " + ((Object) Result.c(value)), 8);
        }
        tje.N(this.b.a, null, null, new KPassportUiApiImpl$register$1$onActivityResult$$inlined$emitOn$1(this.a, result.getValue(), null), 3);
    }
}
