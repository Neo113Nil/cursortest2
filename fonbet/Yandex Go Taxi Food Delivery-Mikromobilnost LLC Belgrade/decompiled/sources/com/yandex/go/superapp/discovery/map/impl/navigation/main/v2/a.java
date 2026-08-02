package com.yandex.go.superapp.discovery.map.impl.navigation.main.v2;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.flex.c;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.x;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.z;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.p;
import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2ModalView;
import defpackage.abw0;
import defpackage.ah00;
import defpackage.atv0;
import defpackage.avv0;
import defpackage.bac0;
import defpackage.bt00;
import defpackage.btv0;
import defpackage.dzv0;
import defpackage.e5s0;
import defpackage.euv0;
import defpackage.huv0;
import defpackage.i9c0;
import defpackage.ip11;
import defpackage.jtv0;
import defpackage.k0b0;
import defpackage.ktv0;
import defpackage.kuv0;
import defpackage.l7s0;
import defpackage.n3w;
import defpackage.n4w0;
import defpackage.ntj;
import defpackage.oep0;
import defpackage.oyv0;
import defpackage.p2t;
import defpackage.pav;
import defpackage.ptv0;
import defpackage.pwy0;
import defpackage.r3v;
import defpackage.rvv0;
import defpackage.tje;
import defpackage.tuv0;
import defpackage.u45;
import defpackage.u6w0;
import defpackage.uh00;
import defpackage.w030;
import defpackage.w040;
import defpackage.w66;
import defpackage.wuo;
import defpackage.wyv0;
import defpackage.xvf0;
import defpackage.xyv0;
import defpackage.y3u0;
import defpackage.y50;
import defpackage.ytj;
import defpackage.yyv0;
import defpackage.zh00;
import defpackage.zuv0;
import java.util.Set;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes14.dex */
public final class a extends com.yandex.go.superapp.discovery.map.impl.navigation.common.a {
    public final Context G;
    public final w030 H;
    public final ktv0 I;
    public final oyv0 J;
    public final xyv0 K;
    public final atv0 L;
    public final z M;
    public final p N;
    public final y50 O;
    public final n4w0 P;

    public a(Context context, w030 w030Var, ktv0 ktv0Var, oyv0 oyv0Var, xyv0 xyv0Var, atv0 atv0Var, z zVar, p pVar, y50 y50Var, n4w0 n4w0Var, rvv0 rvv0Var) {
        super(rvv0Var);
        this.G = context;
        this.H = w030Var;
        this.I = ktv0Var;
        this.J = oyv0Var;
        this.K = xyv0Var;
        this.L = atv0Var;
        this.M = zVar;
        this.N = pVar;
        this.O = y50Var;
        this.P = n4w0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        if (((SuperAppDiscoveryMapV2Experiment) this.N.a().c()).d) {
            this.M.a();
        }
        tje.N(o(), null, null, new SuperAppDiscoveryMapV2ModalViewRouter$onLaunch$1(this, null), 3);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.H;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        uh00 uh00Var;
        Context context = this.G;
        FrameLayout frameLayout = new FrameLayout(context);
        kuv0 kuv0Var = new kuv0(frameLayout);
        new FrameLayout(context).addView(frameLayout);
        ktv0 ktv0Var = this.I;
        jtv0 jtv0Var = ktv0Var instanceof jtv0 ? (jtv0) ktv0Var : null;
        if (jtv0Var == null || (uh00Var = jtv0Var.i) == null) {
            uh00Var = uh00.e;
        }
        uh00 uh00Var2 = uh00Var;
        l7s0 l7s0Var = new l7s0(this);
        yyv0 yyv0Var = this.K.a;
        wyv0 wyv0Var = new wyv0(jtv0Var, uh00Var2, kuv0Var, l7s0Var, (com.yandex.div.core.expression.variables.a) yyv0Var.a.get(), (oep0) yyv0Var.b.get(), yyv0Var.c, (euv0) yyv0Var.d.get(), (c) yyv0Var.e.get(), (bac0) yyv0Var.f.get(), (huv0) yyv0Var.g.get(), (ptv0) yyv0Var.h.get(), (com.yandex.go.superapp.discovery.map.impl.domain.interactors.c) yyv0Var.i.get(), (k0b0) yyv0Var.j.get(), (zuv0) yyv0Var.k.get(), (btv0) yyv0Var.l.get(), (p2t) yyv0Var.m.get(), (e5s0) yyv0Var.n.get(), (abw0) yyv0Var.o.get(), (Set) yyv0Var.p.get(), (tuv0) yyv0Var.q.get(), (dzv0) yyv0Var.r.get(), (com.yandex.go.superapp.discovery.map.impl.domain.interactors.a) yyv0Var.s.get(), (u6w0) yyv0Var.t.get(), (x) yyv0Var.u.get(), (ah00) yyv0Var.v.get(), (y3u0) yyv0Var.w.get(), (zh00) yyv0Var.x.a, (i9c0) yyv0Var.y.get(), (com.yandex.go.superapp.discovery.map.impl.ui.main.v2.flex.actions.change_current_address.a) yyv0Var.z.get(), (i) yyv0Var.A.get(), (p) yyv0Var.B.get(), (wuo) yyv0Var.C.get(), (pwy0) yyv0Var.D.get(), (avv0) yyv0Var.E.get(), (ytj) yyv0Var.F.get());
        w040 w040Var = this.J.a;
        return new SuperAppDiscoveryMapV2ModalView((Context) ((xvf0) w040Var.a).get(), wyv0Var, kuv0Var, uh00Var2, (pav) ((xvf0) w040Var.b).get(), (r3v) ((xvf0) w040Var.c).get(), (w66) ((xvf0) w040Var.d).get(), (ah00) ((xvf0) w040Var.e).get(), (bt00) ((xvf0) w040Var.f).get(), (ip11) ((xvf0) w040Var.g).get(), (ntj) ((n3w) w040Var.h).a);
    }
}
