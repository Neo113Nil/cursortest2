package defpackage;

import com.yandex.delivery.mapper.model.CardsRevealing;
import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.logistics.cargo_flow.a;
import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.places.api.navigation.CardRevealing;
import com.yandex.go.route.interactor.b;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes12.dex */
public final class dv8 implements vni {
    public final ryh a;
    public final j0g b;

    public dv8(ryh ryhVar, xxh xxhVar) {
        this.a = ryhVar;
        this.b = new j0g(ryhVar, (xyh) xxhVar.a.a.get());
    }

    public static /* synthetic */ void c(dv8 dv8Var, d51 d51Var, ju0 ju0Var, vu0 vu0Var, sls slsVar, int i) {
        if ((i & 16) != 0) {
            slsVar = new bgc(12);
        }
        dv8Var.b(d51Var, ju0Var, vu0Var, null, slsVar);
    }

    public final void a(int i) {
        ryh ryhVar = this.a;
        a aVar = (a) ryhVar.b;
        boolean z = i == 0;
        b bVar = aVar.Z;
        Address h = z ? bVar.c().h() : (Address) kotlin.collections.a.S(i - 1, bVar.c().b);
        if (h == null) {
            return;
        }
        hu0 hu0Var = new hu0(i);
        dyh dyhVar = aVar.m0;
        PointType pointType = z ? PointType.SOURCE : PointType.DESTINATION;
        pv0 pv0Var = new pv0(h, null, null, null, null, null, null, null, 1022);
        dke dkeVar = new dke(21, aVar, hu0Var);
        dyhVar.getClass();
        Pair a = dyh.a(pv0Var, pointType, dkeVar);
        m41 m41Var = (m41) a.getFirst();
        k41 k41Var = (k41) a.getSecond();
        a aVar2 = (a) ryhVar.b;
        aVar2.E((m950) aVar2.I.get(), m41Var, k41Var, hxx.a);
    }

    public final void b(d51 d51Var, ju0 ju0Var, vu0 vu0Var, s61 s61Var, sls slsVar) {
        su0 su0Var;
        oo0 oo0Var;
        j0g j0gVar = this.b;
        j0gVar.getClass();
        if (!(vu0Var instanceof su0)) {
            if (vu0Var instanceof tu0) {
                return;
            }
            if (vu0Var == null || (vu0Var instanceof uu0) || (vu0Var instanceof ru0)) {
                a.S((a) ((ryh) j0gVar.a).b, ju0Var, new bhh(6, new ic0(17, slsVar)), vu0Var, d51Var, 48);
                return;
            } else {
                w511.b();
                return;
            }
        }
        PlainAddress plainAddress = null;
        s61 s61Var2 = s61Var != null ? s61Var : null;
        ryh ryhVar = (ryh) j0gVar.a;
        int index = ju0Var.getIndex();
        su0 su0Var2 = (su0) vu0Var;
        String str = su0Var2.a;
        String str2 = su0Var2.b;
        Map f = s61Var2 != null ? s61Var2.a : kotlin.collections.b.f();
        if (s61Var2 == null || (oo0Var = s61Var2.b) == null) {
            su0Var = su0Var2;
        } else {
            ((xyh) j0gVar.b).getClass();
            zgc0 zgc0Var = PlainAddress.Companion;
            a0t a0tVar = oo0Var.f;
            su0Var = su0Var2;
            AddressDTO addressDTO = new AddressDTO(new zzs(a0tVar.a, a0tVar.b, (int) a0tVar.c, null, null, 24), oo0Var.g, null, oo0Var.e, oo0Var.a, oo0Var.d, null, null, null, oo0Var.c, null, null, null, null, null, null, null, null, null, null, null, 33553292);
            zgc0Var.getClass();
            plainAddress = new PlainAddress(addressDTO);
        }
        ryhVar.B(Integer.valueOf(index), null, str, str2, new wth(6), slsVar, f, plainAddress, d51Var, true, su0Var.c);
    }

    public final void d(List list) {
        a aVar = (a) this.a.b;
        aVar.A((m950) aVar.M.get(), new zhi(PaymentsScreen.DELIVERY_FORM, list, true, nii.b), new c21());
    }

    public final void e(String str, int i, CardsRevealing cardsRevealing) {
        CardRevealing cardRevealing;
        a aVar = (a) this.a.b;
        h3y h3yVar = aVar.i0;
        b bVar = aVar.Z;
        Address h = i == 0 ? bVar.c().h() : (Address) kotlin.collections.a.S(i - 1, bVar.c().b);
        ((udc0) ((com.yandex.go.places.impl.navigation.a) h3yVar.get()).e.getValue()).i();
        com.yandex.go.places.impl.navigation.a aVar2 = (com.yandex.go.places.impl.navigation.a) h3yVar.get();
        dg80 dg80Var = new dg80(str, new gj80(i));
        int i2 = syh.a[cardsRevealing.ordinal()];
        if (i2 == 1) {
            cardRevealing = CardRevealing.EXPANDED;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            cardRevealing = CardRevealing.COMPACT;
        }
        kbc0 kbc0Var = new kbc0(cardRevealing);
        vvb1 vvb1Var = vvb1.H;
        String D1 = h != null ? h.D1() : null;
        if (D1 == null) {
            D1 = "";
        }
        aVar2.a(new cm80(guj.b, dg80Var, vvb1Var, D1, kbc0Var, false, false, 96), kl80.a);
    }

    public final void f(vu0 vu0Var, String str) {
        boolean z;
        if (vu0Var instanceof ru0) {
            z = true;
        } else {
            if (!(vu0Var instanceof su0) && !(vu0Var instanceof tu0) && !(vu0Var instanceof uu0)) {
                w511.b();
                return;
            }
            z = false;
        }
        a aVar = (a) this.a.b;
        aVar.E((m950) aVar.R.get(), new wu8(z, str), sy60.Q2, hxx.a);
    }
}
