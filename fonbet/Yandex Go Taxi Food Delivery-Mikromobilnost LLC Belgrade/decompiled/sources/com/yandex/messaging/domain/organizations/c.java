package com.yandex.messaging.domain.organizations;

import com.yandex.messaging.internal.v;
import defpackage.kse;
import defpackage.tpr;
import defpackage.vds0;
import defpackage.w5t;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public final class c extends vds0 {
    public final kse b;
    public final v c;
    public final w5t d;
    public final com.yandex.messaging.domain.chatlist.c e;
    public final com.yandex.messaging.domain.threads.c f;
    public final com.yandex.messaging.domain.unreadcount.d g;

    public c(kse kseVar, v vVar, w5t w5tVar, com.yandex.messaging.domain.chatlist.c cVar, com.yandex.messaging.domain.threads.c cVar2, com.yandex.messaging.domain.unreadcount.d dVar) {
        super(kseVar.b);
        this.b = kseVar;
        this.c = vVar;
        this.d = w5tVar;
        this.e = cVar;
        this.f = cVar2;
        this.g = dVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        v vVar = this.c;
        zy11 zy11Var = zy11.a;
        return e.F(e.X(new m0(vVar.a(zy11Var), this.d.a(zy11Var), new GetOrganizationsWithMentionsUseCase$getInitialOrganizations$1(3, null)), new GetOrganizationsWithMentionsUseCase$run$$inlined$flatMapLatest$1(null, this)), this.b.e);
    }
}
