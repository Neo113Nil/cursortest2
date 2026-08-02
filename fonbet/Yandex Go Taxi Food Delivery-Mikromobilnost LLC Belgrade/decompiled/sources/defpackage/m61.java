package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class m61 implements i61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m61(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void B0() {
    }

    private final void I() {
    }

    private final void M1(PointType pointType, Address address, pv0 pv0Var, boolean z) {
    }

    private final void N3(zzs zzsVar) {
    }

    private final void Q2(zzs zzsVar) {
    }

    private final void h() {
    }

    private final void p6(pv0 pv0Var) {
    }

    private final void q4(zzs zzsVar) {
    }

    private final void s5(pv0 pv0Var) {
    }

    @Override // defpackage.i61
    public final void F5(pv0 pv0Var) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                oh70 oh70Var = (oh70) this.b;
                if (pv0Var.a.X1() || !pv0Var.b()) {
                    oh70Var.a(PointType.SOURCE, pv0Var, null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.i61
    public final void K1() {
        int i = this.a;
    }

    @Override // defpackage.i61
    public final void la(PointType pointType, Address address, pv0 pv0Var, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                ((zid) obj).r(new yid(pointType, pv0Var, 0));
                break;
            default:
                oh70 oh70Var = (oh70) obj;
                int i2 = nh70.a[pointType.ordinal()];
                if (i2 == 1) {
                    oh70Var.a(pointType, null, address != null ? address.B() : null);
                    break;
                } else if (i2 != 2) {
                    w511.b();
                    break;
                } else if (pv0Var == null) {
                    oh70Var.a(pointType, null, address != null ? address.B() : null);
                    break;
                } else {
                    oh70Var.a(pointType, pv0Var, null);
                    break;
                }
        }
    }

    @Override // defpackage.i61
    public final void n6(boolean z, dw1 dw1Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((hc) obj).run();
                break;
            case 1:
                zid zidVar = (zid) obj;
                CompositeAddressSearchModalView compositeAddressSearchModalView = zidVar.L;
                if (compositeAddressSearchModalView != null) {
                    compositeAddressSearchModalView.post(new ce0(compositeAddressSearchModalView, 15));
                }
                zidVar.r(new xz3(z, dw1Var, 4));
                break;
            default:
                oh70 oh70Var = (oh70) obj;
                oh70Var.b.d(oh70Var.e.d(), true);
                break;
        }
    }

    @Override // defpackage.i61
    public final void setMapToPoint(zzs zzsVar) {
        int i = this.a;
    }
}
