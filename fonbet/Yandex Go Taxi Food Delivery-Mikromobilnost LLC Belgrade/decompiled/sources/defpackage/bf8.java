package defpackage;

import android.content.Context;
import com.yandex.go.multitariff.SelectionRules;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.preorder.extraphone.ExtraContactPhonesRules;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.summary.router.a;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.preorder.extraphone.e;
import ru.yandex.taxi.preorder.extraphone.requiredmodalview.ExtraPhoneRequiredModalView;

/* loaded from: classes6.dex */
public final class bf8 extends v96 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public bf8(e eVar, dqe0 dqe0Var, v4p v4pVar) {
        this.a = 2;
        this.c = eVar;
        this.b = dqe0Var;
        this.d = v4pVar;
    }

    @Override // defpackage.v96
    public final boolean b() {
        pex0 m;
        ExtraContactPhonesRules extraContactPhonesRules;
        jn40 jn40Var;
        SelectionRules selectionRules;
        switch (this.a) {
            case 0:
                e4a0 h = ((dqe0) this.b).a.h();
                PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.CARD;
                if (h == paymentMethod$Type) {
                    c cVar = (c) ((cda0) this.c);
                    fga0 fga0Var = cVar.g;
                    fga0Var.getClass();
                    Card g = fga0Var.g(fga0Var.q(paymentMethod$Type));
                    if (g != null && ((syw) cVar.l.get()).a(g)) {
                        ((d770) this.d).a();
                        return true;
                    }
                }
                return false;
            case 1:
                a aVar = (a) this.b;
                too tooVar = (too) ((voo) this.d).a.b();
                if (!tooVar.b() || (m = ((k) ((wiq0) this.c)).m()) == null || !tooVar.d.containsKey(m.b) || aVar.c.c()) {
                    return false;
                }
                aVar.a(m, SummaryExpandReason.AUTO_SUMMARY_ORDER_BUTTON_EXPERIMENT);
                return true;
            case 2:
                String str = ((dqe0) this.b).a.O.a;
                if (str == null) {
                    str = "";
                }
                e eVar = (e) this.c;
                mi31 d = b8r.d(eVar.b, str, null, 6);
                pex0 pex0Var = d != null ? d.a : null;
                if (pex0Var == null || (extraContactPhonesRules = pex0Var.W) == null) {
                    extraContactPhonesRules = ExtraContactPhonesRules.f;
                }
                if (!extraContactPhonesRules.a || !extraContactPhonesRules.a() || eVar.c(str).b.length() != 0) {
                    return false;
                }
                v4p v4pVar = (v4p) this.d;
                yzf yzfVar = v4pVar.a;
                zzf zzfVar = yzfVar.a;
                c0g c0gVar = yzfVar.b;
                h0g h0gVar = yzfVar.c;
                Context context = (Context) c0gVar.U.get();
                e eVar2 = (e) zzfVar.w8.get();
                zzf zzfVar2 = h0gVar.x;
                ExtraPhoneRequiredModalView extraPhoneRequiredModalView = new ExtraPhoneRequiredModalView(context, new u4p(eVar2, new u1n(14, (lx4) zzfVar2.Y.get(), new b1((pho) zzfVar2.d0.get()))));
                extraPhoneRequiredModalView.setOnSelectPhoneClick(new e90(29, extraPhoneRequiredModalView, v4pVar));
                v4pVar.c.a().k(extraPhoneRequiredModalView, 2.0f, true);
                return true;
            case 3:
                wiq0 wiq0Var = (wiq0) this.b;
                k kVar = (k) wiq0Var;
                pex0 m2 = kVar.m();
                if (m2 != null && (jn40Var = m2.V) != null) {
                    mo40 mo40Var = (mo40) this.d;
                    kVar.h();
                    if (mo40Var.a.a || ((selectionRules = jn40Var.h) != SelectionRules.b && jn40Var.f.size() < selectionRules.a.a)) {
                        ((a) this.c).a(((k) wiq0Var).m(), SummaryExpandReason.AUTO_MULTICLASS_ON_ORDER);
                        return true;
                    }
                }
                return false;
            default:
                icv0 icv0Var = (icv0) this.b;
                pex0 m3 = ((k) ((wiq0) this.d)).m();
                if ((m3 == null || !"invalid_payment".equals(m3.G)) && icv0Var.a(SuitabilityCheckType.BY_TARIFF) && icv0Var.a(SuitabilityCheckType.BY_COMPOSITE)) {
                    return false;
                }
                ((d770) ((h3y) this.c).get()).a();
                return true;
        }
    }

    public /* synthetic */ bf8(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
