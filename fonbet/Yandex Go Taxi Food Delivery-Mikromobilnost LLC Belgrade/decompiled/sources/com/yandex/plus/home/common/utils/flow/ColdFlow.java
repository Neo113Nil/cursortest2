package com.yandex.plus.home.common.utils.flow;

import defpackage.ffx;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.xac;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.v;

/* loaded from: classes2.dex */
public final class ColdFlow implements tpr {
    public final n0 a;
    public final xac b;

    public ColdFlow() {
        n0 c = ffx.c(Integer.MAX_VALUE, 0, null, 6);
        this.a = c;
        this.b = new xac(new v(c, new ColdFlow$terminableFlow$1(2, null)), 0);
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        Object collect = this.b.collect(vprVar, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }
}
