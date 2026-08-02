package com.yandex.go.superapp.tracking.api.dependencies;

import defpackage.jqr;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.q701;
import defpackage.sjh;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wmh;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes8.dex */
public abstract class c implements q701 {
    public final tt2 a;
    public final tse b;
    public final g c;
    public final wmh d;
    public pzt0 e;

    public c(tt2 tt2Var, tse tseVar, g gVar, wmh wmhVar) {
        this.a = tt2Var;
        this.b = tseVar;
        this.c = gVar;
        this.d = wmhVar;
    }

    public abstract Object a(Object obj, DefaultTrackingSourceInteractor$start$$inlined$map$1$2$1 defaultTrackingSourceInteractor$start$$inlined$map$1$2$1);

    @Override // defpackage.q701
    public final void start() {
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.a.getClass();
        sjh sjhVar = uyj.a;
        this.e = com.yandex.go.coroutines.b.h(this.b, e.F(new jqr(new b(e.F(this.c, o400.a), this), new DefaultTrackingSourceInteractor$start$2(2, this.d, wmh.class, "update", "update(Ljava/util/List;)V", 4), 3), uyj.a));
    }

    @Override // defpackage.q701
    public void stop() {
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = null;
    }
}
