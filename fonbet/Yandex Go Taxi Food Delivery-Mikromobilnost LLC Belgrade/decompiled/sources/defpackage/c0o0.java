package defpackage;

import com.yandex.go.scooters.mosru.statebar.ScootersMosRuStateBarPresenter$attachView$$inlined$collectIn$1;
import com.yandex.go.scooters.mosru.statebar.a;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;

/* loaded from: classes13.dex */
public final class c0o0 extends h55 {
    public final yvf0 D;
    public final xzn0 E;
    public final czn0 F;
    public final a0o0 G;
    public cjm0 H;

    public c0o0(yvf0 yvf0Var, xzn0 xzn0Var, czn0 czn0Var, a0o0 a0o0Var) {
        super(null);
        this.D = yvf0Var;
        this.E = xzn0Var;
        this.F = czn0Var;
        this.G = a0o0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        cjm0 cjm0Var = this.H;
        if (cjm0Var != null) {
            this.H = null;
            ((a) cjm0Var.c).Cg();
            ru.yandex.taxi.statebar.a aVar = (ru.yandex.taxi.statebar.a) cjm0Var.b;
            t3u0 t3u0Var = new t3u0(StateBarViewModel$Type.SCOOTERS_REQUIRE_MOS_RU_AUTHORIZATION);
            t3u0Var.b = false;
            aVar.a(new u3u0(t3u0Var));
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ehn0 ehn0Var = new ehn0(9, this);
        vx0 vx0Var = this.G.a;
        a aVar = new a((com.yandex.go.scooters.mosru.domain.a) vx0Var.a.get(), (com.yandex.go.scooters.mosru.data.a) vx0Var.b.get(), (czn0) vx0Var.c.get(), ehn0Var);
        cjm0 cjm0Var = new cjm0(4, (ru.yandex.taxi.statebar.a) ((n7g) this.E.a.b).get(), aVar);
        aVar.Bg(new wzn0(cjm0Var));
        tje.N(aVar.Jg(), null, null, new ScootersMosRuStateBarPresenter$attachView$$inlined$collectIn$1(aVar.y.e, null, aVar), 3);
        this.H = cjm0Var;
    }
}
