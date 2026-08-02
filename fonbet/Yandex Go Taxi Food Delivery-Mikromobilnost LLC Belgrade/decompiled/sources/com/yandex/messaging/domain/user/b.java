package com.yandex.messaging.domain.user;

import defpackage.kse;
import defpackage.nft;
import defpackage.np21;
import defpackage.op21;
import defpackage.tpr;
import defpackage.vds0;
import defpackage.w5t;
import defpackage.zy11;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public final class b extends vds0 {
    public final nft b;
    public final w5t c;
    public final np21 d;

    public b(nft nftVar, w5t w5tVar, np21 np21Var, kse kseVar) {
        super(kseVar.b);
        this.b = nftVar;
        this.c = w5tVar;
        this.d = np21Var;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new m0(this.b.d(((op21) obj).a, true), this.c.a(zy11.a), new GetUserNameFlowUseCase$run$1(this, null));
    }
}
