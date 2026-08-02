package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.cancel.p;
import com.yandex.go.taxi.order.models.api.objects.AutoReorder;
import kotlin.a;

/* loaded from: classes14.dex */
public final class k880 {
    public final zuj0 a;
    public final i3y b = a.a(new s780(2));

    public k880(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    public static boolean b(TaxiOrder taxiOrder) {
        p pVar;
        xh60 b = taxiOrder.V().P.b("after_cancel_popup");
        return (b == null || (pVar = (p) b.b) == null || !pVar.a()) ? false : true;
    }

    public final j880 a(o2y0 o2y0Var) {
        String h;
        String h2;
        AutoReorder autoReorder = o2y0Var.b().V().q;
        zuj0 zuj0Var = this.a;
        if (autoReorder != null) {
            h = ((avj0) zuj0Var).h(kyh0.autoreorder_expire_title);
            h2 = ((avj0) zuj0Var).h(kyh0.autoreorder_expire_subTitle);
        } else {
            h = ((avj0) zuj0Var).h(kyh0.taxiexpired_title);
            h2 = ((avj0) zuj0Var).h(kyh0.taxiexpired_subtitle);
        }
        return new j880(h, h2, ((avj0) zuj0Var).h(kyh0.taxiexpired_search_in_other_tariff));
    }
}
