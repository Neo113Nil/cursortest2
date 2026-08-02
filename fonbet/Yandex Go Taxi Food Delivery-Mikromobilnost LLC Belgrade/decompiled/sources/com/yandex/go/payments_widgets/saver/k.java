package com.yandex.go.payments_widgets.saver;

import defpackage.g721;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.mth;
import defpackage.o2m0;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yo40;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.j0;

/* loaded from: classes8.dex */
public final class k {
    public final tt2 a;
    public final com.yandex.div.core.expression.variables.a b;
    public final yo40 c;
    public final o2m0 d;

    public k(tt2 tt2Var, com.yandex.div.core.expression.variables.a aVar, yo40 yo40Var, o2m0 o2m0Var) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = yo40Var;
        this.d = o2m0Var;
    }

    public final Object a(Continuation continuation) {
        o2m0 o2m0Var = this.d;
        int i = 3;
        f fVar = new f(new j(new mth(new j0(null, new h(new jqr(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new b(o2m0Var.a.c().t)), new SaverWidgetsInteractor$saverState$$inlined$flatMapLatest$1(o2m0Var, null))), new SaverWidgetsInteractor$saverState$3(o2m0Var, null), i), this), new UpdateSaverVariablesInteractor$startUpdate$$inlined$withPreviousEmit$1(3, null)), 6), this));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(fVar, mdh.b).collect(new g721(i, this), continuation);
    }
}
