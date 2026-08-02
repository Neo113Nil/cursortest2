package com.yandex.messaging.domain.statuses;

import defpackage.kse;
import defpackage.pdt;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vds0;

/* loaded from: classes15.dex */
public final class c extends vds0 {
    public final com.yandex.messaging.domain.personal.a b;
    public final com.yandex.messaging.internal.i c;
    public final pdt d;

    public c(kse kseVar, com.yandex.messaging.domain.personal.a aVar, com.yandex.messaging.internal.i iVar, pdt pdtVar) {
        super(kseVar.e);
        this.b = aVar;
        this.c = iVar;
        this.d = pdtVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return kotlinx.coroutines.flow.e.X(new rol0(new GetCurrentPersonalStatusUseCase$run$1(this, null)), new GetCurrentPersonalStatusUseCase$run$$inlined$flatMapLatest$1(this, null));
    }
}
