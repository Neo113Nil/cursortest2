package com.yandex.messaging.internal;

import defpackage.d9t;
import defpackage.kse;
import defpackage.mth;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vds0;

/* loaded from: classes15.dex */
public final class r extends vds0 {
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final kse c;

    public r(kse kseVar, com.yandex.messaging.internal.authorized.chat.b bVar) {
        super(kseVar.b);
        this.b = bVar;
        this.c = kseVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new mth(new rol0(new GetMessageMenuUseCase$run$1((d9t) obj, this, null)), 6);
    }
}
