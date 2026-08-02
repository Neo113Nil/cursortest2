package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.g;
import com.yandex.go.search.router.Origin;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.dashboard.address.a;
import ru.yandex.taxi.masstransit.stop.router.b;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class k0i implements isd {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ k0i(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    private final void p1() {
    }

    private final void q1() {
    }

    private final void r1(boolean z, dw1 dw1Var) {
    }

    private final void s1(boolean z, dw1 dw1Var) {
    }

    private final void t1(boolean z, dw1 dw1Var) {
    }

    private final void u1(boolean z, dw1 dw1Var) {
    }

    @Override // defpackage.isd
    public final void X0(boolean z, dw1 dw1Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((a) h55Var).r(new yce(z, 3));
                break;
            case 2:
                ((sw30) h55Var).r(new pi30(15));
                break;
            case 4:
                ((b) h55Var).r(new pi30(25));
                break;
            case 5:
                f9a.P((f9a) h55Var);
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        int i2 = 9;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((a) h55Var).r(new wth(14));
                break;
            case 2:
                ((sw30) h55Var).r(new qu(i2));
                break;
            case 4:
                b bVar = (b) h55Var;
                ru.yandex.taxi.masstransit.stop.interactor.b bVar2 = bVar.T;
                wu30 wu30Var = bVar2.d;
                uu30 uu30Var = ((jfl0) bVar2.a.a.getValue()).a;
                if (uu30Var != null) {
                    ZoneAddress zoneAddress = uu30Var.a;
                    if (zoneAddress == null) {
                        zoneAddress = new ZoneAddress((Address) null, 3);
                    }
                    wu30Var.i(zoneAddress);
                    wu30Var.c(uu30Var.b);
                }
                r0 r0Var = bVar2.a.a;
                jfl0 jfl0Var = new jfl0(null, null);
                r0Var.getClass();
                r0Var.m(null, jfl0Var);
                bVar.R.a = false;
                break;
            case 5:
                f9a f9aVar = (f9a) h55Var;
                ((g) f9aVar.G).a.a = false;
                f9aVar.r(new qu(i2));
                break;
        }
    }

    @Override // defpackage.isd
    public final void h(PointType pointType, Address address, pv0 pv0Var) {
        Address address2;
        int i = this.a;
        int i2 = 1;
        hxx hxxVar = hxx.a;
        int i3 = 6;
        int i4 = 2;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((a) h55Var).r(new u71(pointType, address, pv0Var, i2));
                break;
            case 1:
                ((rrj) h55Var).r(new u71(pointType, address, pv0Var, i4));
                break;
            case 2:
                ((sw30) h55Var).r(new u71(pointType, address, pv0Var, 5));
                break;
            case 3:
                ((vx30) h55Var).r(new u71(pointType, address, pv0Var, i3));
                break;
            case 4:
                b bVar = (b) h55Var;
                int i5 = z140.a[pointType.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        w511.b();
                        break;
                    } else if (pv0Var != null && (address2 = pv0Var.a) != null) {
                        r7 = address2.B();
                    }
                } else if (address != null) {
                    r7 = address.B();
                }
                lc30 lc30Var = new lc30(pointType, pv0Var, r7);
                bVar.E((m950) bVar.L.get(), lc30Var, new to30(lc30Var, bVar, pointType), hxxVar);
                break;
            case 5:
                f9a f9aVar = (f9a) h55Var;
                if (pointType != PointType.DESTINATION) {
                    f9aVar.E((m950) ((yvf0) f9aVar.J).get(), new m41(kyh0.new_point_selection_screen_starting_point_title_statement, null, PointType.SOURCE, Origin.SUGGEST, pv0Var, pv0Var != null ? pv0Var.a.B() : null, true, false, null, null, null, 524032), new cyh(3, f9aVar), hxxVar);
                    break;
                } else {
                    f9aVar.A((m950) ((yvf0) f9aVar.H).get(), new szi(ModalViewOrigin.HOME, null, 2), new j83(i3, f9aVar));
                    break;
                }
            case 6:
                ((qc31) h55Var).r(new u71(pointType, address, pv0Var, 7));
                break;
            default:
                ((dd31) h55Var).r(new u71(pointType, address, pv0Var, 8));
                break;
        }
    }

    @Override // defpackage.isd
    public final void o(String str) {
        int i = this.a;
        v770 v770Var = v770.c;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((a) h55Var).r(new wwb(str, 9));
                break;
            case 1:
                ((a60) ((y50) ((rrj) h55Var).G)).c(str, v770Var);
                break;
            case 2:
                ((a60) ((y50) ((sw30) h55Var).F.get())).c(str, v770Var);
                break;
            case 3:
                ((a60) ((vx30) h55Var).G).c(str, v770Var);
                break;
            case 4:
                ((b) h55Var).r(new my30(str, 2));
                break;
            case 5:
                ((a60) ((y50) ((yvf0) ((f9a) h55Var).F).get())).c(str, v770Var);
                break;
            case 6:
                ((a60) ((y50) ((qc31) h55Var).K.get())).c(str, v770Var);
                break;
            default:
                ((a60) ((y50) ((dd31) h55Var).J.get())).c(str, v770Var);
                break;
        }
    }
}
