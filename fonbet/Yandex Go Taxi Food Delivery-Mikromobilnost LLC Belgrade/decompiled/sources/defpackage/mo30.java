package defpackage;

import com.yandex.go.payments.porttech.navigation.d;
import com.yandex.go.rida.mainscreen.router.e;
import com.yandex.go.scooters.discovery.m;
import com.yandex.go.scooters.offers.v2.g;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.cashback.router.c;
import ru.yandex.taxi.masstransit.main.router.b;
import ru.yandex.taxi.masstransit.router.l;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.scooters.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class mo30 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mo30(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sy60
    public final void a() {
        Object value;
        sz60 sz60Var;
        qz60 qz60Var;
        int i = this.a;
        c21 c21Var = sy60.Q2;
        int i2 = 9;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b) obj).r(new qu(i2));
                break;
            case 1:
                vx30 vx30Var = (vx30) obj;
                vx30Var.z((m950) vx30Var.H.get(), c21Var);
                MtRoutesModalView mtRoutesModalView = vx30Var.U;
                if (mtRoutesModalView != null) {
                    mtRoutesModalView.setVisibility(0);
                    break;
                }
                break;
            case 2:
                npc npcVar = (npc) obj;
                npcVar.r(new qu(i2));
                npcVar.F.invoke();
                break;
            case 3:
                ((l) obj).r(new qu(9));
                break;
            case 4:
                yn5 yn5Var = (yn5) obj;
                yn5Var.r(new qu(i2));
                ((d240) yn5Var.F).invoke();
                break;
            case 5:
                va50 va50Var = (va50) obj;
                r0 r0Var = (r0) ((tz60) va50Var.Q().c.get()).a;
                do {
                    value = r0Var.getValue();
                    sz60Var = (sz60) value;
                    qz60Var = qz60.a;
                } while (!r0Var.k(value, qz60Var));
                if (!(sz60Var instanceof rz60)) {
                    if (!jl40.l(sz60Var, qz60Var)) {
                        w511.b();
                        break;
                    } else {
                        va50Var.r(new qu(i2));
                        break;
                    }
                } else {
                    va50Var.r(new x240(20, (rz60) sz60Var));
                    break;
                }
            case 6:
                xx70 xx70Var = (xx70) obj;
                xx70Var.r(new qu(i2));
                ((bm50) xx70Var.E).invoke();
                break;
            case 7:
                ((f) obj).t0();
                break;
            case 8:
                pw1 pw1Var = (pw1) obj;
                pw1Var.r(new qu(i2));
                ((sls) pw1Var.F).invoke();
                break;
            case 9:
                rwo0 rwo0Var = (rwo0) obj;
                rwo0Var.r(new qu(i2));
                ((sls) rwo0Var.F).invoke();
                break;
            case 10:
                ((xe80) obj).r(new qu(i2));
                break;
            case 11:
                ((xus) obj).r(new ur70(27));
                break;
            case 12:
                ((com.yandex.go.places.impl.navigation.common.navigator.internal.b) obj).m.a.r(new qu(i2));
                break;
            case 13:
                ((cgc0) obj).r(new qu(i2));
                break;
            case 14:
                vgc0 vgc0Var = (vgc0) obj;
                vgc0Var.r(new i4b0(25, vgc0Var));
                break;
            case 15:
                c cVar = (c) obj;
                cVar.F.a.a = null;
                cVar.r(new qu(i2));
                break;
            case 16:
                ((d) obj).r(new qu(9));
                break;
            case 17:
                ((com.yandex.go.preorder.navigation.b) obj).E.a();
                break;
            case 18:
                ((com.yandex.go.promocodes.d) obj).r(new qu(9));
                break;
            case 19:
                e eVar = (e) obj;
                if (eVar.u()) {
                    eVar.r(new qu(i2));
                    break;
                }
                break;
            case 20:
                ((x6k0) obj).close();
                break;
            case 21:
                ((ifk0) obj).d0 = null;
                break;
            case 22:
                ((com.yandex.go.safety.center.contacts.b) obj).r(new qu(9));
                break;
            case 23:
                ((iik0) obj).invoke();
                break;
            case 24:
                ((com.yandex.go.safety.center.safetycenter_web.b) obj).r(new qu(9));
                break;
            case 25:
                ((h7n0) obj).d();
                break;
            case 26:
                ((g) obj).q0 = null;
                break;
            case 27:
                ((m) obj).r(new qu(i2));
                break;
            case 28:
                com.yandex.go.scooters.ignition.panel.c cVar2 = ((hrn0) obj).a;
                cVar2.z((m950) cVar2.J.get(), c21Var);
                break;
            default:
                ((a) obj).r(new qu(i2));
                break;
        }
    }
}
