package defpackage;

import com.yandex.go.superapp.order.multi.old.view.f;
import com.yandex.go.superapp.order.multi.old.view.g;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.api.multi.TaxiOrderPresentationType;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.multi.feed.domain.a;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final /* synthetic */ class a780 implements jms {
    public final /* synthetic */ f a;

    public a780(f fVar) {
        this.a = fVar;
    }

    public final void a(lw40 lw40Var) {
        TaxiCardNavigationAction taxiCardNavigationAction;
        f fVar = this.a;
        g gVar = fVar.E;
        a3y0 a3y0Var = fVar.f0;
        if (!(lw40Var instanceof q870)) {
            if (lw40Var instanceof f670) {
                f670 f670Var = (f670) lw40Var;
                gVar.e.h(OrderScreen.LINKED_ORDER_DETAILS, false, new qa80(f670Var.a), f670Var.b, Boolean.FALSE);
                return;
            } else {
                if (lw40Var instanceof t370) {
                    gVar.e.h(OrderScreen.AMBULANCE_LINKED_ORDER, false, new qa80(((t370) lw40Var).a), null, Boolean.FALSE);
                    return;
                }
                a3y0Var.getClass();
                a3y0.h(new String[]{"handleNavCommand"});
                hst hstVar = jst.e;
                return;
            }
        }
        t0y0 t0y0Var = ((q870) lw40Var).a;
        a aVar = fVar.U;
        boolean z = t0y0Var.d;
        boolean z2 = t0y0Var.c;
        String str = t0y0Var.b;
        clk0 clk0Var = aVar.c;
        TaxiOrderPresentationType taxiOrderPresentationType = z ? TaxiOrderPresentationType.DETAILS : clk0Var.d() ? clk0Var.g() ? TaxiOrderPresentationType.DETAILS : TaxiOrderPresentationType.TRACKING : aVar.a.b(str) ? TaxiOrderPresentationType.TRACKING : TaxiOrderPresentationType.DETAILS;
        TaxiCardNavigationAction taxiCardNavigationAction2 = t0y0Var.g;
        boolean z3 = t0y0Var.h;
        DetailsOpenReason detailsOpenReason = t0y0Var.i;
        String str2 = t0y0Var.a;
        if (taxiCardNavigationAction2 == TaxiCardNavigationAction.OPEN_CUSTOM_TIPS_INPUT && ((OrderStackMvpView) fVar.Dg()).ue(taxiCardNavigationAction2)) {
            return;
        }
        fVar.W.getClass();
        if (taxiCardNavigationAction2 != null && taxiCardNavigationAction2 == (taxiCardNavigationAction = TaxiCardNavigationAction.OPEN_PAYMENT)) {
            fVar.B.h(OrderScreen.ORDER_DETAILS, false, new qa80(z2, z, str2, str), DetailsOpenReason.PAYMENT_METHODS, taxiCardNavigationAction);
            return;
        }
        if (taxiOrderPresentationType.a() && t0y0Var.e != DriveState.COMPLETE && z3) {
            gVar.f(detailsOpenReason, str2);
            return;
        }
        if (!taxiOrderPresentationType.a() && z3 && detailsOpenReason == DetailsOpenReason.DEEPLINK) {
            a3y0.d(a3y0Var, "handleOpenTaxiOrderNavCommand", null, new c680(1), 2);
        }
        gVar.d(str2, t0y0Var.f, detailsOpenReason, taxiCardNavigationAction2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a780) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, f.class, "handleNavCommand", "handleNavCommand(Lcom/yandex/go/taxi/order/api/multi/MultiorderNavCommand;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
