package com.yandex.go.intentprocessor;

import defpackage.dqe0;
import defpackage.h4l0;
import defpackage.o400;
import defpackage.sjh;
import defpackage.t7z;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.z7w;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class p implements z7w {
    public final tt2 a;
    public final com.yandex.go.preorder.deeplinks.route.c b;
    public final ru.yandex.taxi.orderforanother.repository.a c;
    public final h4l0 d;
    public final com.yandex.go.route.interactor.b e;
    public final dqe0 f;
    public final com.yandex.go.preorder.address.b g;

    public p(tt2 tt2Var, com.yandex.go.preorder.deeplinks.route.c cVar, ru.yandex.taxi.orderforanother.repository.a aVar, h4l0 h4l0Var, com.yandex.go.route.interactor.b bVar, dqe0 dqe0Var, com.yandex.go.preorder.address.b bVar2) {
        this.a = tt2Var;
        this.b = cVar;
        this.c = aVar;
        this.d = h4l0Var;
        this.e = bVar;
        this.f = dqe0Var;
        this.g = bVar2;
    }

    @Override // defpackage.z7w
    public final Object a(t7z t7zVar, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new RouteIntentProcessor$process$2(this, t7zVar, null), continuation);
    }
}
