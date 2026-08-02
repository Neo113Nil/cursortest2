package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.destination_picker.ChooseAddressMode;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class i83 implements i61 {
    public final /* synthetic */ ojd a;
    public final /* synthetic */ ModalViewOrigin b;
    public final /* synthetic */ k83 c;
    public final /* synthetic */ e83 w;
    public final /* synthetic */ boolean x;

    public i83(ojd ojdVar, ModalViewOrigin modalViewOrigin, k83 k83Var, e83 e83Var, boolean z) {
        this.a = ojdVar;
        this.b = modalViewOrigin;
        this.c = k83Var;
        this.w = e83Var;
        this.x = z;
    }

    @Override // defpackage.i61
    public final void F5(pv0 pv0Var) {
        this.a.f.invoke(pv0Var);
    }

    @Override // defpackage.i61
    public final void K1() {
        gdl0 gdl0Var = new gdl0(null, this.b, this.x, this.w);
        k83 k83Var = this.c;
        odl0 odl0Var = (odl0) k83Var.L.get();
        k83Var.A(new vdm(odl0Var.a, odl0Var.b, odl0Var.c, k83Var.O, 1), gdl0Var, new c21());
    }

    @Override // defpackage.i61
    public final void la(PointType pointType, Address address, pv0 pv0Var, boolean z) {
        int i = h83.a[pointType.ordinal()];
        ojd ojdVar = this.a;
        ModalViewOrigin modalViewOrigin = this.b;
        k83 k83Var = this.c;
        if (i == 1) {
            ojdVar.e.invoke(modalViewOrigin, address, Boolean.valueOf(z));
            k83Var.r(new qu(9));
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            k83Var.A((m950) k83Var.I.get(), new rzi(ojdVar.a, ojdVar.b, pv0Var, new arb(k83.U(modalViewOrigin), ChooseAddressMode.DESTINATION, modalViewOrigin), RouteSelectorOpenReason.ADDRESS), new j83(0, this.w));
        }
    }

    @Override // defpackage.i61
    public final void n6(boolean z, dw1 dw1Var) {
        this.a.g.invoke(Boolean.valueOf(z), bov0.e, Boolean.FALSE);
    }

    @Override // defpackage.i61
    public final void setMapToPoint(zzs zzsVar) {
        ((gh00) this.c.K).G(zzsVar);
    }
}
