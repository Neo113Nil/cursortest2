package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.HashMap;
import ru.yandex.taxi.preorder.summary.tariffpage.interactors.e;

/* loaded from: classes6.dex */
public final class lkx0 extends ad5 {
    public final c8r A;
    public final tbx0 B;
    public final b8r C;
    public final e D;
    public final h3y E;
    public final yvf0 F;
    public final oep0 G;
    public final xb80 H;
    public final tw60 I;
    public final sfx0 J;
    public final ck31 K;
    public final wiq0 x;
    public final h3y y;
    public final h3y z;

    public lkx0(wiq0 wiq0Var, h3y h3yVar, h3y h3yVar2, c8r c8rVar, tbx0 tbx0Var, b8r b8rVar, e eVar, h3y h3yVar3, yvf0 yvf0Var, oep0 oep0Var, xb80 xb80Var, tw60 tw60Var, sfx0 sfx0Var, ck31 ck31Var) {
        super(jkx0.class);
        this.x = wiq0Var;
        this.y = h3yVar;
        this.z = h3yVar2;
        this.A = c8rVar;
        this.B = tbx0Var;
        this.C = b8rVar;
        this.D = eVar;
        this.E = h3yVar3;
        this.F = yvf0Var;
        this.G = oep0Var;
        this.H = xb80Var;
        this.I = tw60Var;
        this.J = sfx0Var;
        this.K = ck31Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        dkx0 dkx0Var = (dkx0) this.y.get();
        x770 x770Var = dkx0Var.f;
        Integer valueOf = Integer.valueOf(dkx0Var.h);
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("count", valueOf);
        HashMap hashMap2 = new HashMap();
        pho phoVar = x770Var.a;
        phoVar.a("TariffPagerStatistics.ViewHolder.Created", hashMap, 1, hashMap2);
        Integer valueOf2 = Integer.valueOf(dkx0Var.i);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("count", valueOf2);
        x4e.B(phoVar, "TariffPagerStatistics.ViewHolder.Bind", hashMap3, 1);
        dkx0Var.h = 0;
        dkx0Var.i = 0;
        this.I.g.j.b();
    }

    public final void Kg(String str) {
        dk31 j = ((k) this.K).j();
        mi31 b = c8r.b(this.A, str, null, j.a, 2);
        if (b == null) {
            return;
        }
        pex0 pex0Var = b.a;
        if (((tfx0) this.J).a(pex0Var)) {
            ((pep0) this.G).f((m950) this.F.get(), new efx0(j.c, pex0Var), hxx.a);
        }
    }
}
