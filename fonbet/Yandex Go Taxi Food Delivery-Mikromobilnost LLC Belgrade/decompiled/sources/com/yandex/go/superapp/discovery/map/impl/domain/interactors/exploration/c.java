package com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration;

import com.yandex.go.superapp.discovery.map.impl.domain.entities.exploration.ExplorationState;
import defpackage.ah00;
import defpackage.ai00;
import defpackage.gci0;
import defpackage.mth;
import defpackage.qvv;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uh00;
import defpackage.uso;
import defpackage.vh00;
import defpackage.vso;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class c {
    public final uh00 a;
    public final qvv b;
    public final ai00 c;
    public final ah00 d;
    public final vh00 e;

    public c(uh00 uh00Var, qvv qvvVar, ai00 ai00Var, ah00 ah00Var, vh00 vh00Var) {
        this.a = uh00Var;
        this.b = qvvVar;
        this.c = ai00Var;
        this.d = ah00Var;
        this.e = vh00Var;
    }

    public final gci0 a(tse tseVar) {
        gci0 gci0Var = this.b.b;
        kotlinx.coroutines.flow.b g = e.g(new MapExplorationInteractor$mapCameraFlow$1(this, null));
        uh00 uh00Var = this.a;
        double d = uh00Var.a;
        double d2 = uh00Var.b;
        vh00 vh00Var = this.e;
        vh00Var.getClass();
        tpr t = e.t(new j0(new ExplorationState(0), e.K(e.c(this.c.a), new b(e.t(new j0(Boolean.FALSE, new m0(new mth(gci0Var, 6), g, new MapExplorationFarPanDetectorInteractor$detectorFlow$1(vh00Var, null)), new MapExplorationFarPanDetectorInteractor$detectorFlow$2(d, d2, null))))), new MapExplorationInteractor$requestExplorationState$1(this, null)));
        xsr0.a.getClass();
        return e.R(t, tseVar, wsr0.b, new ExplorationState(0));
    }

    public final void b(vso vsoVar) {
        if (vsoVar.equals(uso.a)) {
            this.b.a.l(null);
        }
        this.c.a.g(vsoVar);
    }
}
