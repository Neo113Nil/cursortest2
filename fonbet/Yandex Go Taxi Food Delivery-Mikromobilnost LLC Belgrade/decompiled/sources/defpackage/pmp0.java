package defpackage;

import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes6.dex */
public final class pmp0 extends m230 {
    public final mhf E;
    public final n050 F;
    public final hyb G;
    public final AddressResolveRepository H;
    public final fy01 I;
    public final i130 J;
    public final i6r K;
    public final yvf0 L;

    public pmp0(mhf mhfVar, n050 n050Var, hyb hybVar, AddressResolveRepository addressResolveRepository, fy01 fy01Var, i130 i130Var, i6r i6rVar, yvf0 yvf0Var) {
        super(null);
        this.E = mhfVar;
        this.F = n050Var;
        this.G = hybVar;
        this.H = addressResolveRepository;
        this.I = fy01Var;
        this.J = i130Var;
        this.K = i6rVar;
        this.L = yvf0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        if (((rmp0) obj).e) {
            ((nwx0) this.I).a.c().o8();
        }
        this.E.c();
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.J.a();
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        rmp0 rmp0Var = (rmp0) obj;
        v9l0 v9l0Var = new v9l0(new nmp0(this));
        v9l0Var.b = SourcePicker.A_FROM_SUMMARY;
        String str = rmp0Var.c;
        v9l0Var.d = 0;
        v9l0Var.e = str;
        v9l0Var.f = rmp0Var.d;
        v9l0Var.g = rmp0Var.a;
        v9l0Var.k = rmp0Var.b;
        v9l0Var.i = true;
        v9l0Var.m = false;
        v9l0Var.o = RouteSelectorOpenReason.OTHER;
        v9l0Var.q = new mmp0(1, this);
        x9l0 x9l0Var = new x9l0(v9l0Var);
        i6r i6rVar = this.K;
        i6rVar.getClass();
        hyb hybVar = this.G;
        hybVar.getClass();
        AddressResolveRepository addressResolveRepository = this.H;
        addressResolveRepository.getClass();
        RouteSelectorModalView a = new t3g(i6rVar, x9l0Var, hybVar, addressResolveRepository).a();
        a.setOnAppearingListener(new vzb(3, this));
        return a;
    }
}
