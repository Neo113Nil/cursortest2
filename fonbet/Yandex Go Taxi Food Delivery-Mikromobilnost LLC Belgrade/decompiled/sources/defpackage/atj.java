package defpackage;

import android.content.Context;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.impl.ui.main.DiscoveryMainModalView;
import com.yandex.go.places.impl.ui.main.actions.video_queue.a;
import com.yandex.go.places.impl.ui.main.d;
import com.yandex.go.places.impl.ui.main.e;
import com.yandex.go.places.impl.ui.main.map.my_places.b;
import com.yandex.go.places.impl.ui.main.map.overlay.c;

/* loaded from: classes13.dex */
public final class atj extends m230 {
    public final w030 E;
    public final Context F;
    public final psj G;
    public final ysj H;
    public final c I;
    public final b J;
    public final yac0 K;
    public final yvf0 L;
    public final ge50 M;
    public final cyx N;
    public final mg80 O;
    public final wbc0 P;
    public final qnh Q;

    public atj(w030 w030Var, Context context, psj psjVar, ysj ysjVar, c cVar, b bVar, yac0 yac0Var, yvf0 yvf0Var, ge50 ge50Var, cyx cyxVar, mg80 mg80Var, wbc0 wbc0Var) {
        super(null);
        this.E = w030Var;
        this.F = context;
        this.G = psjVar;
        this.H = ysjVar;
        this.I = cVar;
        this.J = bVar;
        this.K = yac0Var;
        this.L = yvf0Var;
        this.M = ge50Var;
        this.N = cyxVar;
        this.O = mg80Var;
        this.P = wbc0Var;
        this.Q = new qnh(this);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        if (this.K.a) {
            b bVar = this.J;
            bVar.c.Cg();
            xm00 xm00Var = bVar.w;
            if (xm00Var != null) {
                xm00Var.m();
            }
            xm00 xm00Var2 = bVar.w;
            if (xm00Var2 != null) {
                xm00Var2.d();
            }
            bVar.w = null;
            bVar.x.clear();
            c cVar = this.I;
            cVar.x.b();
            cVar.y.Cg();
        }
        this.O.b();
        this.P.b();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.N.b(new byx(Screen.DISCOVERY, new c430(Mode.ORGANIZATIONS, (kotlinx.serialization.json.b) null, (un0) null)));
        if (this.K.a) {
            this.I.attach();
            this.J.attach();
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        jsj jsjVar = new jsj(this.F);
        zsj zsjVar = this.H.a;
        com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar = (com.yandex.go.places.impl.navigation.common.navigator.internal.b) zsjVar.a.get();
        jio jioVar = (jio) zsjVar.b.get();
        com.yandex.go.places.experiments.tabbar.b bVar2 = (com.yandex.go.places.experiments.tabbar.b) zsjVar.c.get();
        e eVar = (e) zsjVar.d.get();
        com.yandex.go.places.impl.domain.interactors.main.c cVar = (com.yandex.go.places.impl.domain.interactors.main.c) zsjVar.e.get();
        boolean booleanValue = ((Boolean) zsjVar.f.get()).booleanValue();
        n3h n3hVar = (n3h) zsjVar.g.get();
        xvf0 xvf0Var = zsjVar.h;
        g3h g3hVar = (g3h) zsjVar.i.get();
        Context context = (Context) zsjVar.j.get();
        tse tseVar = (tse) zsjVar.k.get();
        w030 w030Var = (w030) zsjVar.l.get();
        PlacesNavigationMode placesNavigationMode = (PlacesNavigationMode) zsjVar.m.get();
        rs2 rs2Var = (rs2) zsjVar.n.get();
        ufc0 ufc0Var = (ufc0) zsjVar.o.get();
        oep0 oep0Var = (oep0) zsjVar.p.get();
        l6c0 l6c0Var = (l6c0) zsjVar.q.get();
        com.yandex.go.places.experiments.flex.b bVar3 = (com.yandex.go.places.experiments.flex.b) zsjVar.r.get();
        nac0 nac0Var = (nac0) zsjVar.s.get();
        a aVar = (a) zsjVar.t.get();
        com.yandex.go.places.impl.ui.main.actions.change_address.a aVar2 = (com.yandex.go.places.impl.ui.main.actions.change_address.a) zsjVar.u.get();
        qac0 qac0Var = (qac0) zsjVar.v.get();
        u050 u050Var = (u050) zsjVar.w.get();
        wbc0 wbc0Var = (wbc0) zsjVar.x.get();
        qwj qwjVar = (qwj) zsjVar.y.get();
        dac0 dac0Var = (dac0) zsjVar.z.get();
        o4c0 o4c0Var = (o4c0) zsjVar.A.a;
        q3v q3vVar = (q3v) zsjVar.B.get();
        k0b0 k0b0Var = (k0b0) zsjVar.C.get();
        ah00 ah00Var = (ah00) zsjVar.D.get();
        d dVar = new d(this.Q, (y7c0) obj, jsjVar, bVar, jioVar, bVar2, eVar, cVar, booleanValue, n3hVar, xvf0Var, g3hVar, context, tseVar, w030Var, placesNavigationMode, rs2Var, ufc0Var, oep0Var, l6c0Var, bVar3, nac0Var, aVar, aVar2, qac0Var, u050Var, wbc0Var, qwjVar, dac0Var, o4c0Var, q3vVar, k0b0Var, ah00Var);
        v920 v920Var = this.G.a;
        return new DiscoveryMainModalView((Context) ((x4g) v920Var.a).get(), (c2x0) ((z4g) v920Var.b).get(), (jsj) ((xvf0) v920Var.c).get(), jsjVar, dVar, (pav) ((xvf0) v920Var.w).get(), (yac0) ((xvf0) v920Var.x).get(), ((Boolean) ((n3w) v920Var.y).a).booleanValue());
    }
}
