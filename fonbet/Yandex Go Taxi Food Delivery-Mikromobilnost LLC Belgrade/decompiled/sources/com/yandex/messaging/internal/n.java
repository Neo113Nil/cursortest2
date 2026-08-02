package com.yandex.messaging.internal;

import defpackage.k020;
import defpackage.kse;
import defpackage.l7;
import defpackage.o8t;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vds0;

/* loaded from: classes15.dex */
public final class n extends vds0 {
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final kse c;

    public n(k020 k020Var, com.yandex.messaging.internal.authorized.chat.b bVar, kse kseVar) {
        super(kseVar.b);
        this.b = bVar;
        this.c = kseVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        o8t o8tVar = (o8t) obj;
        return new l7(11, new rol0(new GetLastMessageUseCase$lastMessageFlow$1(this, o8tVar.a, null)), o8tVar, this);
    }
}
