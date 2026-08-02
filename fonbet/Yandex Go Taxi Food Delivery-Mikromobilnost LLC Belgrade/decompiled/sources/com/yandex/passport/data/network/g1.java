package com.yandex.passport.data.network;

import android.content.Context;
import com.yandex.passport.R;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class g1 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final Object d;
    public final Object e;

    public g1(xvf0 xvf0Var, yvf0 yvf0Var, com.yandex.passport.internal.di.module.c cVar, yvf0 yvf0Var2) {
        this.a = 9;
        this.d = xvf0Var;
        this.b = yvf0Var;
        this.e = cVar;
        this.c = yvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        yvf0 yvf0Var = this.c;
        yvf0 yvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new f1((com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (com.yandex.passport.common.network.l0) yvf0Var.get(), (com.yandex.passport.internal.network.c) ((yvf0) obj2).get(), (b1) ((m) obj).get());
            case 1:
                return new s3((com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (com.yandex.passport.common.network.l0) yvf0Var.get(), (com.yandex.passport.internal.network.c) ((yvf0) obj2).get(), (l3) ((m) obj).get());
            case 2:
                return new y3((com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (com.yandex.passport.common.network.l0) yvf0Var.get(), (com.yandex.passport.internal.network.c) ((yvf0) obj2).get(), (u3) ((m) obj).get());
            case 3:
                return new t4((com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (com.yandex.passport.common.network.l0) yvf0Var.get(), (com.yandex.passport.internal.network.c) ((yvf0) obj2).get(), (p4) ((m) obj).get());
            case 4:
                return new j8((com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (com.yandex.passport.common.network.l0) yvf0Var.get(), (com.yandex.passport.internal.network.c) ((yvf0) obj2).get(), (f8) ((k8) obj).get());
            case 5:
                return new za((com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (com.yandex.passport.common.network.l0) yvf0Var.get(), (com.yandex.passport.internal.network.c) ((yvf0) obj2).get(), (ya) ((m) obj).get());
            case 6:
                return new hd((com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (com.yandex.passport.common.network.l0) yvf0Var.get(), (com.yandex.passport.internal.network.c) ((yvf0) obj2).get(), (dd) ((nc) obj).get());
            case 7:
                com.yandex.passport.internal.analytics.t tVar = (com.yandex.passport.internal.analytics.t) yvf0Var2.get();
                com.yandex.passport.common.a aVar = (com.yandex.passport.common.a) yvf0Var.get();
                com.yandex.passport.internal.report.reporters.b1 b1Var = (com.yandex.passport.internal.report.reporters.b1) ((xvf0) obj).get();
                ((com.yandex.passport.internal.di.module.h) obj2).getClass();
                return new com.yandex.passport.internal.network.a(tVar, aVar, b1Var);
            case 8:
                Context context = (Context) yvf0Var2.get();
                com.yandex.passport.common.a aVar2 = (com.yandex.passport.common.a) yvf0Var.get();
                com.yandex.passport.internal.flags.j jVar = (com.yandex.passport.internal.flags.j) ((yvf0) obj2).get();
                ((com.yandex.passport.internal.di.module.n) obj).getClass();
                return new com.yandex.passport.internal.core.sync.a(context, context.getString(R.string.passport_sync_adapter_content_authority), com.yandex.passport.common.time.a.c(((Number) jVar.b(com.yandex.passport.internal.flags.q.q0)).intValue(), 0, 0, 14), aVar2);
            case 9:
                com.yandex.passport.internal.filter.l lVar = (com.yandex.passport.internal.filter.l) ((xvf0) obj2).get();
                com.yandex.passport.common.common.a aVar3 = (com.yandex.passport.common.common.a) yvf0Var2.get();
                ((com.yandex.passport.internal.di.module.c) obj).get();
                return new com.yandex.passport.internal.filter.i(lVar, aVar3, "7.55.1", (com.yandex.passport.internal.filter.s) yvf0Var.get());
            default:
                return new com.yandex.passport.internal.flags.experiments.q((com.yandex.passport.internal.flags.experiments.g) yvf0Var2.get(), (com.yandex.passport.common.a) yvf0Var.get(), (com.yandex.passport.common.permission.c) ((yvf0) obj2).get(), (com.yandex.passport.internal.flags.experiments.o) ((e9) obj).get());
        }
    }

    public /* synthetic */ g1(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, v7p v7pVar, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = v7pVar;
    }

    public g1(com.yandex.passport.internal.di.module.h hVar, yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var) {
        this.a = 7;
        this.d = hVar;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.e = xvf0Var;
    }

    public g1(com.yandex.passport.internal.di.module.n nVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3) {
        this.a = 8;
        this.e = nVar;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
    }
}
