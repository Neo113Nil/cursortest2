package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.data.network.d9;
import com.yandex.passport.internal.methods.q1;
import com.yandex.passport.internal.methods.x2;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class i1 implements w0 {
    public final d9 a;
    public final com.yandex.passport.internal.methods.performer.error.a b;
    public final com.yandex.passport.internal.link_auth.a c;
    public final com.yandex.passport.internal.report.reporters.d0 w;
    public final com.yandex.passport.internal.network.mappers.b x;

    public i1(d9 d9Var, com.yandex.passport.internal.methods.performer.error.a aVar, com.yandex.passport.internal.link_auth.a aVar2, com.yandex.passport.internal.report.reporters.d0 d0Var, com.yandex.passport.internal.network.mappers.b bVar) {
        this.a = d9Var;
        this.b = aVar;
        this.c = aVar2;
        this.w = d0Var;
        this.x = bVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Object h = com.yandex.passport.common.util.a.h(new TrackFromMagicPerformer$performMethod$1((q1) x2Var, this, null));
        Throwable a = Result.a(h);
        if (a == null) {
            return h;
        }
        try {
            throw com.yandex.passport.internal.methods.performer.error.a.a(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
