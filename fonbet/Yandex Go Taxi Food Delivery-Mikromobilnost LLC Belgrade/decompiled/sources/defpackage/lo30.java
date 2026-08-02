package defpackage;

import ru.yandex.taxi.masstransit.domain.h;
import ru.yandex.taxi.masstransit.main.router.a;
import ru.yandex.taxi.masstransit.paymentcards.c;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;

/* loaded from: classes6.dex */
public final class lo30 extends ad5 {
    public final po21 A;
    public final a3v B;
    public final zuj0 C;
    public final atd0 D;
    public final dz00 E;
    public final tu30 F;
    public final c G;
    public final h H;
    public final pwy0 I;
    public final ru.yandex.taxi.perf.screen.c J;
    public final e311 K;
    public final y210 L;
    public final a x;
    public final ru.yandex.taxi.masstransit.main.ui.header.a y;
    public final ah00 z;

    public lo30(a aVar, ru.yandex.taxi.masstransit.main.ui.header.a aVar2, ah00 ah00Var, po21 po21Var, a3v a3vVar, zuj0 zuj0Var, atd0 atd0Var, dz00 dz00Var, tu30 tu30Var, c cVar, h hVar, pwy0 pwy0Var, ru.yandex.taxi.perf.screen.c cVar2, e311 e311Var, y210 y210Var) {
        super(ko30.class);
        this.x = aVar;
        this.y = aVar2;
        this.z = ah00Var;
        this.A = po21Var;
        this.B = a3vVar;
        this.C = zuj0Var;
        this.D = atd0Var;
        this.E = dz00Var;
        this.F = tu30Var;
        this.G = cVar;
        this.H = hVar;
        this.I = pwy0Var;
        this.J = cVar2;
        this.K = e311Var;
        this.L = y210Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        this.J.h(PerformanceScreenName.TransportDiscovery);
        this.L.a.set(null);
        super.Cg();
        this.B.a0(this);
    }
}
