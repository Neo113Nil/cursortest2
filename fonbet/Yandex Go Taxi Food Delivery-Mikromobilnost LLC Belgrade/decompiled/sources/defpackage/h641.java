package defpackage;

import ru.yandex.taxi.layers.presentation.walkroute.WalkRoutePresenter$onResume$$inlined$safeCollectIn$1;
import ru.yandex.taxi.layers.presentation.walkroute.e;

/* loaded from: classes5.dex */
public final class h641 extends qc5 {
    public final e A;
    public qur B;
    public zzs C;
    public String D;
    public boolean E;

    public h641(ney neyVar, d641 d641Var, e eVar) {
        super(n641.class, neyVar);
        this.A = eVar;
        eVar.c = d641Var;
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.E = false;
        ((n641) Dg()).h0();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        String str = this.D;
        if (str == null) {
            str = null;
        }
        tje.N(Kg(), null, null, new WalkRoutePresenter$onResume$$inlined$safeCollectIn$1(this.A.d(this.C, str), null, this), 3);
    }
}
