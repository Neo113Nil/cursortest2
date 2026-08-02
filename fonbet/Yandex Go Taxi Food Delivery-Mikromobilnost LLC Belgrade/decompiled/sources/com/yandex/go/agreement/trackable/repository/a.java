package com.yandex.go.agreement.trackable.repository;

import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.i3y;
import defpackage.lr40;
import defpackage.mdh;
import defpackage.on2;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;

/* loaded from: classes12.dex */
public final class a {
    public final tt2 a;
    public final hit b;
    public final i3y c;
    public pzt0 d;

    public a(on2 on2Var, tt2 tt2Var, hit hitVar) {
        this.a = tt2Var;
        this.b = hitVar;
        this.c = kotlin.a.a(new lr40(on2Var, 16));
    }

    public final void a(TrackableAcceptanceActionParam trackableAcceptanceActionParam, wls wlsVar) {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        hbp0 hbp0Var = this.b.a;
        this.a.getClass();
        sjh sjhVar = uyj.a;
        this.d = tje.N(hbp0Var, mdh.b, null, new TrackableAcceptanceStatusRepository$saveStatus$1(this, trackableAcceptanceActionParam, wlsVar, null), 2);
    }
}
