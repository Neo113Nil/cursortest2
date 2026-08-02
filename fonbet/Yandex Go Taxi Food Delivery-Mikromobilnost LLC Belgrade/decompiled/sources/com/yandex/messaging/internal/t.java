package com.yandex.messaging.internal;

import defpackage.g9t;
import defpackage.kse;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vds0;

/* loaded from: classes15.dex */
public final class t extends vds0 {
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final kse c;

    public t(kse kseVar, com.yandex.messaging.internal.authorized.chat.b bVar) {
        super(kseVar.b);
        this.b = bVar;
        this.c = kseVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new rol0(new GetMessageUseCase$run$1((g9t) obj, this, null));
    }
}
