package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.data.network.s4;
import com.yandex.passport.data.network.t4;
import com.yandex.passport.internal.entities.Code;
import com.yandex.passport.internal.entities.Cookie;
import com.yandex.passport.internal.methods.x2;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class z implements w0 {
    public final t4 a;
    public final com.yandex.passport.internal.methods.performer.error.a b;
    public final com.yandex.passport.internal.credentials.d c;
    public final com.yandex.passport.internal.network.mappers.b w;

    public z(t4 t4Var, com.yandex.passport.internal.methods.performer.error.a aVar, com.yandex.passport.internal.credentials.d dVar, com.yandex.passport.internal.network.mappers.b bVar) {
        this.a = t4Var;
        this.b = aVar;
        this.c = dVar;
        this.w = bVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        com.yandex.passport.internal.methods.b1 b1Var = (com.yandex.passport.internal.methods.b1) x2Var;
        Object h = com.yandex.passport.common.util.a.h(new GetCodeByCookiePerformer$performMethod$1(this, b1Var, null));
        if (!(h instanceof Result.Failure)) {
            try {
                s4 s4Var = (s4) h;
                h = new Code(((Cookie) b1Var.b.c).m303getEnvironment(), s4Var.b, s4Var.c);
            } catch (Throwable th) {
                h = new Result.Failure(th);
            }
        }
        Throwable a = Result.a(h);
        if (a == null) {
            return h;
        }
        try {
            throw com.yandex.passport.internal.methods.performer.error.a.a(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
    }
}
