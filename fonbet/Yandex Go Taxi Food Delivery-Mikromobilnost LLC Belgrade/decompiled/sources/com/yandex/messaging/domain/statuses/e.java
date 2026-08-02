package com.yandex.messaging.domain.statuses;

import defpackage.kse;
import defpackage.pdt;
import defpackage.rft;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vds0;
import defpackage.w3c;
import defpackage.x6t;

/* loaded from: classes15.dex */
public final class e extends vds0 {
    public final pdt b;
    public final c c;
    public final com.yandex.messaging.domain.personal.a d;
    public final rft e;
    public final w3c f;

    public e(pdt pdtVar, c cVar, com.yandex.messaging.domain.personal.a aVar, rft rftVar, kse kseVar, w3c w3cVar) {
        super(kseVar.e);
        this.b = pdtVar;
        this.c = cVar;
        this.d = aVar;
        this.e = rftVar;
        this.f = w3cVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        x6t x6tVar = (x6t) obj;
        String str = x6tVar.a;
        return kotlinx.coroutines.flow.e.X(new rol0(new GetDisplayUserStatusUseCase$run$1(this, null)), new GetDisplayUserStatusUseCase$run$$inlined$flatMapLatest$1(null, x6tVar, this, this.e.a(str), this.b.a(str)));
    }
}
