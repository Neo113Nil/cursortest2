package com.yandex.messaging.domain;

import defpackage.b7t;
import defpackage.dft;
import defpackage.g92;
import defpackage.kse;
import defpackage.lqo;
import defpackage.p4t;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tz10;
import defpackage.vds0;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class g extends vds0 {
    public final com.yandex.messaging.domain.personal.a b;
    public final b7t c;
    public final lqo d;
    public final com.yandex.messaging.internal.authorized.j e;
    public final p4t f;

    public g(com.yandex.messaging.domain.personal.a aVar, kse kseVar, b7t b7tVar, lqo lqoVar, com.yandex.messaging.internal.authorized.j jVar, p4t p4tVar) {
        super(kseVar.b);
        this.b = aVar;
        this.c = b7tVar;
        this.d = lqoVar;
        this.e = jVar;
        this.f = p4tVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return !this.d.a(tz10.L) ? new g92(2, EmptyList.a) : kotlinx.coroutines.flow.e.X(new rol0(new GetUserBadgesUseCase$run$1(this, null)), new GetUserBadgesUseCase$run$$inlined$flatMapLatest$1(null, (dft) obj, this));
    }
}
