package com.yandex.go.taxi.order.perf.session;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.i6y0;
import defpackage.mdh;
import defpackage.oa1;
import defpackage.s5w0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;
    public final oa1 b;
    public final i6y0 c;
    public final a3y0 d = new a3y0(TaxiOrderLogGroup.PERF.getTag(), "SessionTimelineCollector");

    public a(tt2 tt2Var, oa1 oa1Var, i6y0 i6y0Var) {
        this.a = tt2Var;
        this.b = oa1Var;
        this.c = i6y0Var;
    }

    public final void a(tse tseVar) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        tje.N(tseVar, mdh.b, null, new TaxiOrderSessionTimelineCollector$launchSessionCollector$1(this, null), 2).w(new s5w0(21, this));
    }
}
