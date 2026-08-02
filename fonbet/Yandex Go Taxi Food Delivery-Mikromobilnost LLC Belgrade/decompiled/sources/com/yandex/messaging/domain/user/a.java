package com.yandex.messaging.domain.user;

import defpackage.a6t;
import defpackage.a7t;
import defpackage.b7t;
import defpackage.h2t;
import defpackage.kse;
import defpackage.op21;
import defpackage.syc;
import defpackage.tpr;
import defpackage.vds0;
import defpackage.w5t;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a extends vds0 {
    public final w5t b;
    public final b c;
    public final h2t d;

    public a(w5t w5tVar, b bVar, h2t h2tVar, kse kseVar) {
        super(kseVar.b);
        this.b = w5tVar;
        this.c = bVar;
        this.d = h2tVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        String str = ((a6t) obj).a;
        return e.t(e.n(e.t(new syc(((b7t) this.d.a).a(new a7t(str)), 27)), this.b.a(zy11.a), this.c.a(new op21(str)), new GetDeletedStatusUseCase$run$1(4, null)));
    }
}
