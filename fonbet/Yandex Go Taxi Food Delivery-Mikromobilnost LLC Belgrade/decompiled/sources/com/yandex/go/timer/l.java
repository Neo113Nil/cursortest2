package com.yandex.go.timer;

import defpackage.eci0;
import defpackage.jtq0;
import defpackage.rol0;
import defpackage.tse;
import defpackage.xsr0;
import kotlinx.coroutines.flow.q0;

/* loaded from: classes8.dex */
public final class l {
    public final jtq0 a;
    public final eci0 b;

    public l(jtq0 jtq0Var, tse tseVar) {
        this.a = jtq0Var;
        rol0 rol0Var = new rol0(new TimestampRepository$timestampFlow$1(this, null));
        xsr0.a.getClass();
        this.b = kotlinx.coroutines.flow.e.O(rol0Var, tseVar, new q0(0L, 0L), 1);
    }
}
