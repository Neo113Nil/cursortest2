package defpackage;

import android.content.Context;
import com.yandex.go.drive.delegates.a;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.preorder.navigation.n;
import com.yandex.go.settings.email.EmailRequireExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.List;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.costcenters.required.CostCenterRequiredModalView;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class kn3 extends v96 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ kn3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.v96
    public final boolean b() {
        switch (this.a) {
            case 0:
                pex0 m = ((k) ((wiq0) this.c)).m();
                if (m != null && m.u0 == TariffOrderFlow.DRIVE_FLOW) {
                    a aVar = (a) ((h3y) this.e).get();
                    g gVar = aVar.b;
                    if (!(gVar.g() && gVar.a.Ng())) {
                        aVar.b(new bgc(12), new c0m(5));
                        return true;
                    }
                } else if (!((g) this.b).g()) {
                    n.X(((qht0) ((vfc0) this.d).b).b, new xse0(ghv0.a, null, null, 62));
                    return true;
                }
                return false;
            case 1:
                e4a0 h = ((dqe0) this.b).a.h();
                PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.CORP;
                if (h == paymentMethod$Type) {
                    c cVar = (c) ((cda0) this.d);
                    fga0 fga0Var = cVar.g;
                    fga0Var.getClass();
                    CorpAccount j = fga0Var.j(fga0Var.q(paymentMethod$Type));
                    jve b = j != null ? cVar.o.b(j) : null;
                    if (b != null) {
                        sk7 sk7Var = (sk7) this.e;
                        pex0 m2 = ((k) ((wiq0) sk7Var.w)).m();
                        if (m2 == null ? false : ((zwe) sk7Var.c).e(m2.u0)) {
                            sk7 sk7Var2 = (sk7) this.e;
                            pex0 m3 = ((k) ((wiq0) sk7Var2.w)).m();
                            gyc gycVar = (gyc) sk7Var2.b;
                            List list = b.e;
                            gycVar.getClass();
                            if (!gycVar.q(list, m3 != null ? m3.u0 : null)) {
                                w3i w3iVar = (w3i) this.c;
                                gwe gweVar = (gwe) w3iVar.y;
                                zwe zweVar = (zwe) w3iVar.z;
                                txe txeVar = new txe((wiq0) w3iVar.A);
                                i130 i130Var = (i130) w3iVar.c;
                                w030 a = i130Var.a();
                                Context context = (Context) w3iVar.b;
                                yfa yfaVar = new yfa(w3iVar);
                                gweVar.getClass();
                                zweVar.getClass();
                                a.getClass();
                                context.getClass();
                                vbb vbbVar = new vbb(w3iVar, new j4n(gweVar, zweVar, b, (uxe) txeVar, a, context, (hwe) yfaVar));
                                pho phoVar = gweVar.c;
                                q5z.h(phoVar);
                                i130Var.a().s(new CostCenterRequiredModalView(context, new cxe(new p1b(new o61(phoVar)), vbbVar)), true);
                                return true;
                            }
                        }
                    }
                }
                return false;
            default:
                EmailRequireExperiment emailRequireExperiment = (EmailRequireExperiment) ((n3a) this.d).b.b();
                if (emailRequireExperiment.b) {
                    ru.yandex.taxi.settings.email.a aVar2 = (ru.yandex.taxi.settings.email.a) this.c;
                    if (((Number) aVar2.f.getValue(aVar2, ru.yandex.taxi.settings.email.a.i[0])).intValue() == 0 && evu0.J(aVar2.c())) {
                        ((pep0) ((oep0) this.e)).f((m950) ((u0g) this.b).get(), emailRequireExperiment, hxx.a);
                        return true;
                    }
                }
                return false;
        }
    }
}
