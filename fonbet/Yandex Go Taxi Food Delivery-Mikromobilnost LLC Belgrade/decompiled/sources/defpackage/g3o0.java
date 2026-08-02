package defpackage;

import com.yandex.go.scooters.offers.v2.details.ScootersOfferDetailsModalView;
import defpackage.aki0;
import defpackage.arm0;
import defpackage.e3o0;
import defpackage.f1j;
import defpackage.f3x;
import defpackage.g1j;
import defpackage.g3o0;
import defpackage.h1j;
import defpackage.i1j;
import defpackage.j1j;
import defpackage.j3x;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class g3o0 implements j3o0 {
    public final bys a;
    public final /* synthetic */ ScootersOfferDetailsModalView b;

    public g3o0(final ScootersOfferDetailsModalView scootersOfferDetailsModalView) {
        h3o0 binding;
        h3o0 binding2;
        this.b = scootersOfferDetailsModalView;
        binding = scootersOfferDetailsModalView.getBinding();
        binding.c.setItemAnimator(null);
        binding2 = scootersOfferDetailsModalView.getBinding();
        this.a = aki0.a(binding2.c, new tls() { // from class: com.yandex.go.scooters.offers.v2.details.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                j3x j3xVar = (j3x) obj;
                ScootersOfferDetailsModalView scootersOfferDetailsModalView2 = scootersOfferDetailsModalView;
                ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$1 scootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$1 = new ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$1(scootersOfferDetailsModalView2);
                j3xVar.getClass();
                aki0.b(new f3x(g1j.class, j3xVar, scootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$1), new arm0(6));
                f3x f3xVar = new f3x(f1j.class, j3xVar, new ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$3(scootersOfferDetailsModalView2));
                g3o0 g3o0Var = g3o0.this;
                aki0.b(f3xVar, new e3o0(g3o0Var, scootersOfferDetailsModalView2));
                aki0.b(new f3x(h1j.class, j3xVar, new ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$5(scootersOfferDetailsModalView2)), new arm0(7));
                aki0.b(new f3x(i1j.class, j3xVar, new ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$7(scootersOfferDetailsModalView2)), new arm0(8));
                aki0.b(new f3x(j1j.class, j3xVar, new ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$9(0, g3o0Var, g3o0.class, "prepareShimmeringBar", "prepareShimmeringBar()Lru/yandex/taxi/widget/ShimmeringBar;", 0)), new arm0(9));
                return zy11.a;
            }
        });
    }

    @Override // defpackage.j3o0
    public final void O5(List list) {
        this.a.submitList(list, null);
    }

    @Override // defpackage.j3o0
    public final void h1(List list, b4p0 b4p0Var, List list2) {
        f6n0 f6n0Var;
        this.a.submitList(list2, null);
        f6n0Var = this.b.scootersCardV2Analytics;
        c3o0 c3o0Var = f6n0Var.c;
        List list3 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(f6n0.e((b4p0) it.next()).getEvgenValue().getEventValue());
        }
        String eventValue = f6n0.e(b4p0Var).getEvgenValue().getEventValue();
        c3o0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("offers", arrayList);
        hashMap.put("selected_offer", eventValue);
        c3o0Var.a.a("ScootersOfferDetails.Shown", hashMap, 1, new HashMap());
    }
}
