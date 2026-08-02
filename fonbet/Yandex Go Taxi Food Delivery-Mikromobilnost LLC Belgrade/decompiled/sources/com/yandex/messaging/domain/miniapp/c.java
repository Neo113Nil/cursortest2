package com.yandex.messaging.domain.miniapp;

import com.yandex.messaging.ChatRequest;
import defpackage.f920;
import defpackage.kse;
import defpackage.lqo;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vds0;

/* loaded from: classes15.dex */
public final class c extends vds0 {
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final f920 c;
    public final lqo d;

    public c(com.yandex.messaging.internal.authorized.chat.b bVar, f920 f920Var, kse kseVar, lqo lqoVar) {
        super(kseVar.e);
        this.b = bVar;
        this.c = f920Var;
        this.d = lqoVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new rol0(new GetMiniappMetadataUseCase$run$1((ChatRequest) obj, this, null));
    }
}
