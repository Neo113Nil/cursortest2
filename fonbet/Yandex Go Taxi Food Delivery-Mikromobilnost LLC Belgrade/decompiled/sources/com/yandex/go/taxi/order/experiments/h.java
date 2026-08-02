package com.yandex.go.taxi.order.experiments;

import defpackage.i3y;
import defpackage.mth;
import defpackage.o2y0;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.tpr;
import defpackage.xn3;
import java.util.Arrays;

/* loaded from: classes14.dex */
public final class h {
    public final com.yandex.go.taxi.order.repositories.c a;
    public final i3y b;

    public h(rqo rqoVar, com.yandex.go.taxi.order.repositories.c cVar) {
        this.a = cVar;
        this.b = kotlin.a.a(new xn3(rqoVar, 12));
    }

    public final kotlinx.coroutines.flow.n a(o2y0 o2y0Var) {
        return new kotlinx.coroutines.flow.n(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{((qqo) this.b.getValue()).a(), new mth(new g(this.a.a(o2y0Var)), 6)}, 2)), new SearchProgressExperimentProvider$experimentFlow$2(this, null));
    }
}
