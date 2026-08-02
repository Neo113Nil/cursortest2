package com.yandex.go.payments_widgets.split;

import defpackage.dxf0;
import defpackage.g721;
import defpackage.ix51;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.mth;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.va90;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.j0;

/* loaded from: classes8.dex */
public final class g {
    public final tt2 a;
    public final com.yandex.div.core.expression.variables.a b;
    public final va90 c;
    public final dxf0 d;
    public final ix51 e;

    public g(tt2 tt2Var, com.yandex.div.core.expression.variables.a aVar, va90 va90Var, dxf0 dxf0Var, ix51 ix51Var) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = va90Var;
        this.d = dxf0Var;
        this.e = ix51Var;
    }

    public final Object a(Continuation continuation) {
        ix51 ix51Var = this.e;
        b bVar = new b(new f(new mth(new j0(null, new d(new jqr(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new i(ix51Var.a.c().t)), new YbSplitWidgetsInteractor$ybSplitState$$inlined$flatMapLatest$1(ix51Var, null))), new YbSplitWidgetsInteractor$ybSplitState$3(ix51Var, null), 3), this), new UpdateYbSplitVariablesInteractor$startUpdate$$inlined$withPreviousEmit$1(3, null)), 6), this));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(bVar, mdh.b).collect(new g721(5, this), continuation);
    }
}
