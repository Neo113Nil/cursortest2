package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.preorder.mainscreen.MainScreen;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.domain.u;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class p2s0 implements i61 {
    public final u A;
    public final oep0 B;
    public final ah00 a;
    public final a3v b;
    public final h3y c;
    public final net0 w;
    public final yb00 x;
    public final rft0 y;
    public final w2g z;

    public p2s0(ah00 ah00Var, a3v a3vVar, h3y h3yVar, net0 net0Var, yb00 yb00Var, rft0 rft0Var, w2g w2gVar, u uVar, oep0 oep0Var) {
        this.a = ah00Var;
        this.b = a3vVar;
        this.c = h3yVar;
        this.w = net0Var;
        this.x = yb00Var;
        this.y = rft0Var;
        this.z = w2gVar;
        this.A = uVar;
        this.B = oep0Var;
    }

    @Override // defpackage.i61
    public final void F5(pv0 pv0Var) {
        this.w.a(pv0Var);
    }

    @Override // defpackage.i61
    public final void K1() {
        ((qht0) this.y).f(false);
    }

    @Override // defpackage.i61
    public final void la(PointType pointType, Address address, pv0 pv0Var, boolean z) {
        int i = o2s0.a[pointType.ordinal()];
        if (i == 1) {
            this.b.Lc(MainScreen.class, null);
            this.A.c(ModalViewOrigin.HOME, address, new epo0(22, this, pointType));
        } else if (i == 2) {
            ((pep0) this.B).f(new pw1(8, this.z.b.C(), this.y), pv0Var == null ? new szi(ModalViewOrigin.HOME, RouteSelectorOpenReason.ADDRESS) : new uzi(pv0Var, RouteSelectorOpenReason.ADDRESS), hxx.a);
        } else {
            w511.b();
        }
    }

    @Override // defpackage.i61
    public final void n6(boolean z, dw1 dw1Var) {
        this.x.a(SelectionOrigin.MAIN, z, false);
    }

    @Override // defpackage.i61
    public final void setMapToPoint(zzs zzsVar) {
        ((gh00) this.a).G(zzsVar);
    }
}
