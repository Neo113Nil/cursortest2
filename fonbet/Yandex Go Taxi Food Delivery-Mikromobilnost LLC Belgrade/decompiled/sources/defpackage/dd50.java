package defpackage;

import com.yandex.go.coroutines.g;
import com.yandex.go.navigator.analitycs.a;
import com.yandex.go.navigator.domain.v;
import com.yandex.go.navigator.events.e;
import com.yandex.go.navigator.map_interactions.parkings.c;
import com.yandex.go.navigator.repository.f;
import com.yandex.go.navigator.repository.o;

/* loaded from: classes12.dex */
public final class dd50 extends ad5 {
    public final bp4 A;
    public final m901 B;
    public final o C;
    public final c D;
    public final oc50 E;
    public final tzw0 F;
    public final yr21 G;
    public final z950 H;
    public final ah00 I;
    public final bzw J;
    public final a K;
    public final v L;
    public final e M;
    public final el00 N;
    public final g O;
    public float P;
    public final liq0 x;
    public final com.yandex.go.navigator.domain.e y;
    public final f z;

    public dd50(liq0 liq0Var, com.yandex.go.navigator.domain.e eVar, f fVar, bp4 bp4Var, m901 m901Var, o oVar, c cVar, oc50 oc50Var, tzw0 tzw0Var, yr21 yr21Var, z950 z950Var, ah00 ah00Var, bzw bzwVar, a aVar, v vVar, e eVar2, el00 el00Var) {
        super(yc50.class);
        this.x = liq0Var;
        this.y = eVar;
        this.z = fVar;
        this.A = bp4Var;
        this.B = m901Var;
        this.C = oVar;
        this.D = cVar;
        this.E = oc50Var;
        this.F = tzw0Var;
        this.G = yr21Var;
        this.H = z950Var;
        this.I = ah00Var;
        this.J = bzwVar;
        this.K = aVar;
        this.L = vVar;
        this.M = eVar2;
        this.N = el00Var;
        g gVar = new g();
        gVar.a(5000L);
        this.O = gVar;
        this.P = ((gh00) ah00Var).j();
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        this.O.b();
        m901 m901Var = this.B;
        m901Var.a.getValue().provideTrafficLayer(new l901(m901Var, 2));
        ((yc50) Dg()).B5();
        ((yc50) Dg()).j2();
        super.Cg();
    }
}
