package defpackage;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerSourceScreen;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.pickup_from_photo.navigation.b;
import com.yandex.go.pickup_from_photo.navigation.d;
import com.yandex.go.search.router.Origin;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final class gnb0 implements r71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ gnb0(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    private final void p1() {
    }

    private final void q1(String str) {
    }

    private final void r1(String str) {
    }

    private final void s1() {
    }

    private final void t1() {
    }

    private final void u1() {
    }

    private final void v1(PointType pointType, Address address, pv0 pv0Var) {
    }

    private final void w1(PointType pointType, Address address, pv0 pv0Var) {
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.l51
    public final void a1(pv0 pv0Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((b) h55Var).r(new t71(pv0Var, 13));
                break;
            case 1:
                ((d) h55Var).r(new qu(9));
                break;
            default:
                ((com.yandex.go.suggest.impl.router.d) h55Var).K.i(new ZoneAddress(pv0Var.a, 2));
                break;
        }
    }

    @Override // defpackage.l51
    public final void h(PointType pointType, Address address, pv0 pv0Var) {
        zzs B;
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                int i = sfw0.a[pointType.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        w511.b();
                        break;
                    } else {
                        com.yandex.go.suggest.impl.router.d dVar = (com.yandex.go.suggest.impl.router.d) this.b;
                        y9y0 y9y0Var = dVar.K;
                        boolean a = dVar.P.a(vz0.a);
                        hxx hxxVar = hxx.a;
                        r4 = null;
                        ymu ymuVar = null;
                        if (!a) {
                            m950 m950Var = (m950) dVar.N.get();
                            int i2 = kyh0.new_point_selection_screen_starting_point_title_statement;
                            PointType pointType2 = PointType.SOURCE;
                            Origin origin = Origin.SUGGEST;
                            Address h = y9y0Var.h();
                            pv0 pv0Var2 = h != null ? new pv0(h, null, null, null, null, null, null, null, 1022) : null;
                            Address h2 = y9y0Var.h();
                            dVar.E(m950Var, new m41(i2, null, pointType2, origin, pv0Var2, h2 != null ? h2.B() : null, true, false, null, null, null, 521472), new cyh(4, dVar), hxxVar);
                            break;
                        } else {
                            m950 m950Var2 = (m950) dVar.O.get();
                            Address h3 = y9y0Var.h();
                            if (h3 != null && (B = h3.B()) != null) {
                                ymuVar = new ymu(6, B, (Object) null);
                            }
                            dVar.E(m950Var2, new u11(ymuVar, AddressMapPickerSourceScreen.SuperappSearch), new tfw0(), hxxVar);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.r71
    public final void o(String str) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                ((mg21) ((com.yandex.go.suggest.impl.router.d) this.b).S).c(str);
                break;
        }
    }

    @Override // defpackage.r71
    public final void q() {
        int i = this.a;
    }
}
