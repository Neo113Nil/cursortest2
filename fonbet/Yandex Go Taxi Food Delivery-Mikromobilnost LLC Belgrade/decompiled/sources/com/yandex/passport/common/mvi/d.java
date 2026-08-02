package com.yandex.passport.common.mvi;

import com.yandex.passport.internal.ui.bouncer.BouncerActivityTwm;
import com.yandex.passport.internal.ui.bouncer.model.b1;
import com.yandex.passport.internal.ui.bouncer.model.h1;
import com.yandex.passport.internal.ui.bouncer.model.p2;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import defpackage.jqr;
import defpackage.lz40;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tpr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes15.dex */
public abstract class d extends k {
    public final tpr g;
    public final b1 h;

    public d(s1 s1Var, h1 h1Var, com.yandex.passport.internal.ui.bouncer.model.middleware.a aVar, com.yandex.passport.internal.ui.bouncer.model.middleware.b bVar, p2 p2Var, n0 n0Var, b1 b1Var) {
        super(h1Var, aVar, bVar, p2Var, s1Var);
        this.g = n0Var;
        this.h = b1Var;
    }

    public final void b(BouncerActivityTwm bouncerActivityTwm) {
        Store$wireWith$1 store$wireWith$1 = new Store$wireWith$1(this, null);
        n0 n0Var = this.f;
        int i = 3;
        kotlinx.coroutines.flow.e.H(bouncerActivityTwm, new jqr(n0Var, store$wireWith$1, i));
        com.yandex.passport.internal.ui.bouncer.model.middleware.a aVar = this.b;
        int i2 = 0;
        List g = scc.g(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l);
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).a(n0Var, this.e));
        }
        kotlinx.coroutines.flow.e.H(bouncerActivityTwm, new jqr(kotlinx.coroutines.flow.e.J(arrayList), new Store$wireWith$3(2, n0Var, lz40.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), i));
        com.yandex.passport.internal.ui.bouncer.model.middleware.b bVar = this.c;
        List g2 = scc.g(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g, bVar.h, bVar.i, bVar.j, bVar.k);
        ArrayList arrayList2 = new ArrayList(tcc.n(g2, 10));
        Iterator it2 = g2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((e) it2.next()).a(n0Var));
        }
        kotlinx.coroutines.flow.e.H(bouncerActivityTwm, new jqr(kotlinx.coroutines.flow.e.J(arrayList2), new Store$wireWith$5(2, n0Var, lz40.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 3));
        kotlinx.coroutines.flow.e.H(bouncerActivityTwm, new jqr(new c(this.g, this.h, i2), new EventBasedStore$wireWith$2(2, n0Var, lz40.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 3));
    }
}
