package com.yandex.go.payments_widgets.yandex_bank;

import com.yandex.go.yb.data.u;
import defpackage.g721;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mxk0;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zqd0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;

/* loaded from: classes8.dex */
public final class j {
    public final zqd0 a;
    public final zqd0 b;
    public final com.yandex.div.core.expression.variables.a c;
    public final u d;
    public final tt2 e;
    public final mxk0 f;

    public j(zqd0 zqd0Var, zqd0 zqd0Var2, com.yandex.div.core.expression.variables.a aVar, u uVar, tt2 tt2Var, mxk0 mxk0Var) {
        this.a = zqd0Var;
        this.b = zqd0Var2;
        this.c = aVar;
        this.d = uVar;
        this.e = tt2Var;
        this.f = mxk0Var;
    }

    public final Object a(Continuation continuation) {
        int i = 6;
        i iVar = new i(new mth(new j0(null, kotlinx.coroutines.flow.e.t(new m0(new g(this.d.c().t, this), this.f.e, new UpdateYbVariablesInteractor$startUpdate$3(3, null))), new UpdateYbVariablesInteractor$startUpdate$$inlined$withPreviousEmit$1(3, null)), i), this);
        this.e.getClass();
        sjh sjhVar = uyj.a;
        return new o(kotlinx.coroutines.flow.e.F(iVar, mdh.b), new UpdateYbVariablesInteractor$startUpdate$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new g721(i, this), continuation);
    }
}
