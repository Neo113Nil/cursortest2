package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.delivery.rental_duration_selector.DeliveryRentalDurationModalView;
import com.yandex.go.payments.cards.info.CardInfoModalView;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.scooters.insurance.details.ScootersInsuranceDetailsModalView;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesType;
import com.yandex.go.scooters.passes.purchased.ScootersPurchasedPassStatusModalView;
import com.yandex.go.settings.lang.LanguageModalView;
import com.yandex.go.shortcuts.impl.advertisement.ShortcutInfoModalView;
import com.yandex.go.taxi.order.cancel.reasons.view.v1.CancelReasonsV1View;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.h;
import ru.yandex.taxi.linked_order.modals.info.LinkedOrderInfoModalView;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class dr7 extends m230 {
    public final /* synthetic */ int E;
    public final Object F;
    public final Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr7(w030 w030Var, sli0 sli0Var, it2 it2Var, lg21 lg21Var, h hVar) {
        super(null);
        this.E = 6;
        this.F = w030Var;
        this.G = it2Var;
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.E) {
            case 6:
                ((it2) this.G).getClass();
                r(new qu(9));
                break;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
        }
        return (w030) this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r13v30, types: [T, qa0] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        int i = this.E;
        int i2 = 27;
        int i3 = 3;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return ((vt7) obj2).a(new kv5(i2, this));
            case 1:
                List list = (List) obj;
                rx7 rx7Var = (rx7) obj2;
                rk6 rk6Var = new rk6(12, this);
                tn1 tn1Var = new tn1(29, this);
                c06 c06Var = rx7Var.a;
                return new CancelReasonsV1View((bx7) ((dx7) c06Var.a).get(), tn1Var, rk6Var, list, (Context) ((n3w) c06Var.b).a);
            case 2:
                zf8 zf8Var = (zf8) obj;
                sr4 sr4Var = new sr4(27, this);
                wf8 wf8Var = ((vf8) obj2).a;
                return new CardInfoModalView((Context) wf8Var.a.get(), (i) wf8Var.b.get(), (tse) wf8Var.c.get(), (tt2) wf8Var.d.get(), (g1a0) wf8Var.e.get(), zf8Var, sr4Var, (bia0) wf8Var.f.get(), (tma0) wf8Var.g.get());
            case 3:
                j4n j4nVar = (j4n) obj2;
                kmi kmiVar = new kmi(this);
                j4nVar.getClass();
                int i4 = 1;
                return (DeliveryRentalDurationModalView) i5m.b(new wif((xvf0) new oyf(j4nVar, i4), i5m.b(new ncb(n3w.a(kmiVar), new n4g0(new oyf(j4nVar, 4), 21), new oyf(j4nVar, 2), new wif((Object) new oyf(j4nVar, 0), (xvf0) new rwh(new oyf(j4nVar, i3), i4), 23), new oyf(j4nVar, 6), new oyf(j4nVar, 5), 17)), 24)).get();
            case 4:
                return (LanguageModalView) ((rqt) obj2).get();
            case 5:
                ((i130) obj2).a().a();
                wrr wrrVar = (wrr) this.F;
                gny gnyVar = ((koy) obj).a;
                ?? qa0Var = new qa0(8, this);
                wrrVar.getClass();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = qa0Var;
                v51 v51Var = new v51(i3, ref$ObjectRef);
                LinkedOrderInfoModalView linkedOrderInfoModalView = new LinkedOrderInfoModalView((Activity) wrrVar.b, (ony) wrrVar.c, (v8e0) wrrVar.w, (m25) wrrVar.x, gnyVar, v51Var, (g58) wrrVar.z, (z0a0) wrrVar.A);
                linkedOrderInfoModalView.setSlideListener(new i4u(wrrVar));
                linkedOrderInfoModalView.setOnAppearingListener(new mny(linkedOrderInfoModalView, wrrVar, v51Var));
                return linkedOrderInfoModalView;
            case 6:
                throw null;
            case 7:
                dtn0 dtn0Var = (dtn0) obj;
                CharSequence charSequence = dtn0Var.a;
                List list2 = dtn0Var.b;
                qgn0 qgn0Var = new qgn0(i3, this);
                zz7 zz7Var = ((btn0) obj2).a;
                return new ScootersInsuranceDetailsModalView((Context) zz7Var.a.get(), (lg21) zz7Var.b.get(), charSequence, list2, qgn0Var);
            case 8:
                poo0 poo0Var = (poo0) obj;
                ScootersPassesType scootersPassesType = poo0Var.b;
                moo0 moo0Var = poo0Var.a;
                fcj0 fcj0Var = ((ooo0) obj2).a;
                return new ScootersPurchasedPassStatusModalView((Context) ((xvf0) fcj0Var.a).get(), (ytz) ((k7g) fcj0Var.b).get(), (tse) ((xvf0) fcj0Var.c).get(), (e) ((xvf0) fcj0Var.d).get(), (ynn0) ((qzm0) fcj0Var.e).get(), scootersPassesType, moo0Var);
            default:
                return new ShortcutInfoModalView((Context) ((ozr0) obj2).a.a.get(), (jzr0) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dr7(w030 w030Var, Object obj, int i) {
        super(null);
        this.E = i;
        this.F = w030Var;
        this.G = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dr7(int i, Object obj, Object obj2) {
        super(null);
        this.E = i;
        this.G = obj;
        this.F = obj2;
    }
}
