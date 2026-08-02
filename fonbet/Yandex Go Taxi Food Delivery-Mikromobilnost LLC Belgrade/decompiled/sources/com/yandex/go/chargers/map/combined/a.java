package com.yandex.go.chargers.map.combined;

import com.yandex.go.chargers.e;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import defpackage.avv0;
import defpackage.bb0;
import defpackage.byx;
import defpackage.c430;
import defpackage.cyx;
import defpackage.h55;
import defpackage.oj9;
import defpackage.psa;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.r2a;
import defpackage.tje;
import defpackage.un0;
import defpackage.yo9;
import defpackage.yz4;
import java.util.LinkedList;
import kotlinx.serialization.json.b;

/* loaded from: classes12.dex */
public final class a extends h55 {
    public final yz4 D;
    public final oj9 E;
    public final avv0 F;
    public final cyx G;
    public final e H;
    public pzt0 I;
    public final yo9 J;

    public a(yz4 yz4Var, oj9 oj9Var, avv0 avv0Var, cyx cyxVar, e eVar) {
        super(null);
        this.D = yz4Var;
        this.E = oj9Var;
        this.F = avv0Var;
        this.G = cyxVar;
        this.H = eVar;
        this.J = new yo9(this);
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        tje.N(o(), null, null, new ChargersCombinedMapOverlayRouterImpl$onAttach$1(this, null), 3);
        Q(null);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        pzt0 pzt0Var = this.I;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.I = null;
        LinkedList linkedList = this.E.a;
        if (!linkedList.isEmpty()) {
            linkedList.removeLast();
        }
        P(false);
    }

    public final void P(boolean z) {
        this.G.b(z ? new byx(Screen.DISCOVERY, new c430(Mode.CHARGERS, (b) null, (un0) null)) : new byx(Screen.DISCOVERY, new c430(Mode.NORMAL, (b) null, (un0) null)));
    }

    public final void Q(psa psaVar) {
        LinkedList linkedList = this.E.a;
        if (!linkedList.isEmpty()) {
            linkedList.removeLast();
        }
        this.D.d();
        e eVar = this.H;
        this.F.a(qoi0.a(eVar.getClass()));
        A(eVar, new r2a(psaVar), new bb0(this, 16));
    }
}
