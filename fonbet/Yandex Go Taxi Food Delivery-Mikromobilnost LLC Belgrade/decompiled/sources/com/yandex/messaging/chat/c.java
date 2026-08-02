package com.yandex.messaging.chat;

import defpackage.kse;
import defpackage.o1b0;
import defpackage.oeb;
import defpackage.rft;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vds0;

/* loaded from: classes15.dex */
public final class c extends vds0 {
    public final oeb b;
    public final rft c;

    public c(oeb oebVar, rft rftVar, kse kseVar) {
        super(kseVar.e);
        this.b = oebVar;
        this.c = rftVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new rol0(new GetOnlineStatusByChatUseCase$run$1((o1b0) obj, this, null));
    }
}
