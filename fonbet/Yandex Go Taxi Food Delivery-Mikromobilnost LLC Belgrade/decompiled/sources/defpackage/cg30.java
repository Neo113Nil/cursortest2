package defpackage;

import ru.yandex.taxi.masstransit.datasource.routing.a;
import ru.yandex.taxi.masstransit.experiment.d0;

/* loaded from: classes6.dex */
public final class cg30 extends h55 {
    public final a D;
    public final lf0 E;
    public final d0 F;
    public final ru.yandex.taxi.masstransit.trains.config.a G;

    public cg30(a aVar, lf0 lf0Var, d0 d0Var, ru.yandex.taxi.masstransit.trains.config.a aVar2) {
        super(null);
        this.D = aVar;
        this.E = lf0Var;
        this.F = d0Var;
        this.G = aVar2;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        bg30 bg30Var = (bg30) obj;
        su30 j = this.D.j(bg30Var.a, bg30Var.c, this.F.a(), this.G.b(), 0L);
        if (j == null) {
            r(new qu(9));
            return;
        }
        A((m950) this.E.get(), new hg30(j, null, bg30Var.b, new kf30(gf30.a), new mz30(), bg30Var.d, bg30Var.e, bvf0.c(bg30Var.f), false, bg30Var.g, bg30Var.h, 258), sy60.Q2);
    }
}
