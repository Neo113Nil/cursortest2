package com.yandex.go.analytics.realtime;

import com.yandex.go.analytics.realtime.experiments.InAppRealtimeAnalyticsExperiment;
import defpackage.alv;
import defpackage.bvf0;
import defpackage.csf0;
import defpackage.cvw;
import defpackage.dei0;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mei0;
import defpackage.qhw0;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wei0;
import defpackage.yw60;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class a implements dei0, yw60 {
    public final alv a;
    public final Set b;
    public final i3y c;
    public final i3y d;
    public final ike e;
    public final i3y f;

    public a(alv alvVar, Set set, tt2 tt2Var) {
        this.a = alvVar;
        this.b = set;
        i3y a = kotlin.a.a(new csf0(6, this));
        this.c = a;
        this.d = kotlin.a.a(new RealtimeAnalyticsImpl$enabled$2(0, (InAppRealtimeAnalyticsExperiment) a.getValue(), InAppRealtimeAnalyticsExperiment.class, "isEnabled", "isEnabled()Z", 0));
        qhw0 a2 = jl40.a();
        tt2Var.getClass();
        this.e = bvf0.a(cvw.U(a2, uyj.a));
        this.f = kotlin.a.a(new RealtimeAnalyticsImpl$realtimeServices$2(0, this, a.class, "obtainRealtimeSignalService", "obtainRealtimeSignalService()Ljava/util/List;", 0));
    }

    public final void d(mei0 mei0Var) {
        Iterator it = ((List) this.f.getValue()).iterator();
        while (it.hasNext()) {
            ((wei0) it.next()).a(mei0Var);
        }
    }

    @Override // defpackage.yw60
    public final void e() {
        Iterator it = ((List) this.f.getValue()).iterator();
        while (it.hasNext()) {
            ((wei0) it.next()).start();
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "RealtimeAnalyticsImpl";
    }

    @Override // defpackage.yw60
    public final void l() {
        Iterator it = ((List) this.f.getValue()).iterator();
        while (it.hasNext()) {
            ((wei0) it.next()).stop();
        }
    }
}
