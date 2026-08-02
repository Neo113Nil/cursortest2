package defpackage;

import com.yandex.delivery.mapper.model.SelectDestinationPolicy;
import com.yandex.go.chargers.dvizh_subscription.web.b;
import com.yandex.go.chargers.e;
import com.yandex.go.explorer.impl.navigation.c;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.places.impl.navigation.common.base.d;
import com.yandex.go.scooters.offers.v2.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.clarification.impl.repo.a;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardOpenReason;
import ru.yandex.taxi.masstransit.router.ScheduleExitAction;
import ru.yandex.taxi.masstransit.router.l;
import ru.yandex.taxi.masstransit.threads.ThreadsCardMode;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.scooters.data.ScootersParkingSelectionMode;

/* loaded from: classes13.dex */
public final /* synthetic */ class cb0 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cb0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sy60
    public final void a() {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        int i = this.a;
        int i2 = 9;
        boolean z = false;
        z = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fb0) obj2).P((wqw) obj);
                break;
            case 1:
                j75 j75Var = (j75) obj;
                r0 r0Var = ((d) obj2).V.a;
                do {
                    value = r0Var.getValue();
                    arrayList = new ArrayList();
                    for (Object obj3 : (List) value) {
                        if (!(((bcc0) obj3).a instanceof xl80)) {
                            arrayList.add(obj3);
                        }
                    }
                } while (!r0Var.k(value, arrayList));
                j75Var.invoke();
                break;
            case 2:
                d dVar = (d) obj2;
                sls slsVar = (sls) obj;
                r0 r0Var2 = dVar.V.a;
                do {
                    value2 = r0Var2.getValue();
                    arrayList2 = new ArrayList();
                    for (Object obj4 : (List) value2) {
                        if (!(((bcc0) obj4).a instanceof ul80)) {
                            arrayList2.add(obj4);
                        }
                    }
                } while (!r0Var2.k(value2, arrayList2));
                if (slsVar != null) {
                    slsVar.invoke();
                    break;
                } else {
                    dVar.T().a();
                    break;
                }
            case 3:
                qk5 qk5Var = (qk5) obj2;
                qk5Var.z((m950) qk5Var.J.get(), new ok5(qk5Var, (qk1) obj, z ? 1 : 0));
                break;
            case 4:
                com.yandex.go.benefits_center.benefits.router.d.Q((com.yandex.go.benefits_center.benefits.router.d) obj2, (zn5) obj, true);
                break;
            case 5:
                ((sls) obj2).invoke();
                ((b) obj).D.h();
                break;
            case 6:
                ((y4c0) obj2).U((cz9) obj);
                break;
            case 7:
                ((f9a) obj2).R((b9a) obj);
                break;
            case 8:
                q2a q2aVar = (q2a) obj2;
                e eVar = (e) obj;
                if (q2aVar.b) {
                    eVar.V(q2aVar);
                    break;
                } else {
                    eVar.r(new qu(i2));
                    break;
                }
            case 9:
                q5i q5iVar = (q5i) obj2;
                ygg yggVar = (ygg) obj;
                q5iVar.getClass();
                r5i r5iVar = q5iVar.a;
                Map map = yggVar.d;
                if (map != null) {
                    r5iVar.a0.a(yggVar.a, null, map);
                }
                m950 m950Var = (m950) r5iVar.J.get();
                String str = yggVar.a;
                SelectDestinationPolicy selectDestinationPolicy = yggVar.c;
                r5iVar.E(m950Var, new gyh(str, null, null, selectDestinationPolicy != null ? selectDestinationPolicy.name() : null, new t4s("cargo_toolbar"), null, true, false, null, null, yggVar.f, 934), sy60.Q2, hxx.a);
                break;
            case 10:
                c.Q((c) obj2, (gto) obj);
                break;
            case 11:
                kf30 kf30Var = (kf30) obj;
                bzy0 bzy0Var = ((hf30) obj2).b;
                if (bzy0Var != null) {
                    r0 r0Var3 = kf30Var.a;
                    do {
                        value4 = r0Var3.getValue();
                    } while (!r0Var3.k(value4, new if30(bzy0Var)));
                } else {
                    r0 r0Var4 = kf30Var.a;
                    do {
                        value3 = r0Var4.getValue();
                    } while (!r0Var4.k(value3, gf30.a));
                }
            case 12:
                ((iz1) obj2).V((t3g) obj, new ix30(new ex30(MtDetailRouteCardOpenReason.BACK_FROM_MAP_FLOW)));
                break;
            case 13:
                m640 m640Var = (m640) obj;
                bzy0 bzy0Var2 = ((hf30) obj2).b;
                if (bzy0Var2 != null) {
                    o640 o640Var = new o640(bzy0Var2, ThreadsCardMode.COLLAPSED, (pg30) m640Var.J, (String) null);
                    m640Var.D((m950) ((c8w) m640Var.E).get(), o640Var, new l640(m640Var, o640Var));
                    break;
                } else {
                    m640Var.r(new qu(i2));
                    break;
                }
            case 14:
                l lVar = (l) obj2;
                fk40 fk40Var = ((qk40) lVar.n()).a;
                bzy0 bzy0Var3 = ((dk40) obj).b;
                int i3 = rk40.a[(fk40Var instanceof dk40 ? ScheduleExitAction.GoBack : bzy0Var3 != null ? ScheduleExitAction.OpenThreadVariants : ScheduleExitAction.OpenRoute).ordinal()];
                if (i3 == 1) {
                    lVar.r(new qu(i2));
                    break;
                } else if (i3 == 2) {
                    tk40 tk40Var = lVar.K;
                    if (tk40Var != null) {
                        r0 r0Var5 = tk40Var.a;
                        do {
                            value5 = r0Var5.getValue();
                        } while (!r0Var5.k(value5, sk40.a((sk40) value5, new ek40(bzy0Var3))));
                    }
                } else if (i3 != 3) {
                    w511.b();
                    break;
                } else {
                    tk40 tk40Var2 = lVar.K;
                    if (tk40Var2 != null) {
                        r0 r0Var6 = tk40Var2.a;
                        do {
                            value6 = r0Var6.getValue();
                        } while (!r0Var6.k(value6, sk40.a((sk40) value6, ck40.a)));
                    }
                }
                break;
            case 15:
                ((f) obj2).p0((o2y0) obj);
                break;
            case 16:
                wse0 wse0Var = (wse0) obj2;
                xse0 xse0Var = (xse0) obj;
                if (wse0Var.I.a(new SuitabilityCheckType[0])) {
                    wse0Var.P(xse0Var);
                    break;
                } else {
                    wse0Var.r(new vld0(19));
                    break;
                }
            case 17:
                ete0 ete0Var = (ete0) obj2;
                k9s0 k9s0Var = (k9s0) obj;
                com.yandex.go.navigation.screen.c cVar = ete0Var.E;
                a aVar = ete0Var.H;
                Screen b = cVar.b();
                aq80 aq80Var = ete0Var.G;
                i iVar = (i) ete0Var.F;
                lea0 e = iVar.e();
                if (e == null ? false : lw90.c(iVar.t, null, new n65[0], 3).a(e.c()).equals(xw91.C)) {
                    aq80Var.getClass();
                    if (b != Screen.SUMMARY) {
                        z = ((icv0) aq80Var.a).a(new SuitabilityCheckType[0]);
                    }
                }
                if (z) {
                    if (((Boolean) kotlinx.coroutines.flow.e.d(aVar.f).a.getValue()).booleanValue()) {
                        aVar.d = tp0.b;
                        break;
                    } else {
                        ete0Var.r(new k7d0(22, k9s0Var));
                        break;
                    }
                } else {
                    ete0Var.P();
                    break;
                }
            case 18:
                ((g) obj2).F.h();
                ((h7n0) obj).d();
                break;
            case 19:
                g gVar = (g) obj2;
                if (gVar.r0 == ((y4c0) obj)) {
                    gVar.r0 = null;
                    break;
                }
                break;
            case 20:
                ru.yandex.taxi.scooters.presentation.detailed_order.e eVar2 = (ru.yandex.taxi.scooters.presentation.detailed_order.e) obj2;
                zuo0 zuo0Var = (zuo0) obj;
                eVar2.T = null;
                pen0 pen0Var = eVar2.W;
                if (pen0Var == null) {
                    eVar2.U(zuo0Var, null, null);
                    break;
                } else if (!(pen0Var instanceof oen0) && !(pen0Var instanceof ken0) && !(pen0Var instanceof men0)) {
                    if (pen0Var instanceof len0) {
                        eVar2.U(zuo0Var, ((len0) pen0Var).a, ScootersParkingSelectionMode.FIX);
                        break;
                    } else if (pen0Var instanceof nen0) {
                        ny61.u();
                        break;
                    } else {
                        w511.b();
                        break;
                    }
                } else {
                    eVar2.U(zuo0Var, null, null);
                    break;
                }
                break;
            case 21:
                ((y4c0) obj2).V((Set) obj);
                break;
            case 22:
                ((sls) obj2).invoke();
                ((com.yandex.go.scooters.subscription.pci_dss.web.b) obj).D.h();
                break;
            default:
                ((sls) obj2).invoke();
                ((qht0) obj).a = null;
                break;
        }
    }
}
