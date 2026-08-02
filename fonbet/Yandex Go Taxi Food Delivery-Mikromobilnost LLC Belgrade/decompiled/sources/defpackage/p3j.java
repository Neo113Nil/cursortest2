package defpackage;

import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.detailed_price.analytics.DetailedPriceAnalytics$OrderStatus;
import com.yandex.go.taxi.order.detailed_price.ui.DetailedPriceModalView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class p3j implements e3j {
    public final /* synthetic */ DetailedPriceModalView a;

    public p3j(DetailedPriceModalView detailedPriceModalView) {
        this.a = detailedPriceModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        uzx binding;
        p2j p2jVar;
        Object obj2;
        g3j g3jVar;
        uzx binding2;
        uzx binding3;
        g3j g3jVar2;
        uzx binding4;
        uzx binding5;
        uzx binding6;
        m3j m3jVar = (m3j) obj;
        boolean z = m3jVar instanceof k3j;
        DetailedPriceModalView detailedPriceModalView = this.a;
        if (z) {
            binding4 = detailedPriceModalView.getBinding();
            cma1.L((GoLinearLayout) binding4.c.b);
            binding5 = detailedPriceModalView.getBinding();
            cma1.L(binding5.e);
            binding6 = detailedPriceModalView.getBinding();
            cma1.J((GoConstraintLayout) binding6.d.b);
            return;
        }
        if (m3jVar instanceof j3j) {
            binding2 = detailedPriceModalView.getBinding();
            ((GoConstraintLayout) binding2.d.b).setVisibility(8);
            binding3 = detailedPriceModalView.getBinding();
            cma1.J((GoLinearLayout) binding3.c.b);
            detailedPriceModalView.renderButton(((j3j) m3jVar).a);
            g3jVar2 = detailedPriceModalView.presenter;
            s3j s3jVar = g3jVar2.x.a;
            String str = s3jVar.a;
            DetailedPriceAnalytics$OrderStatus Kg = g3j.Kg(s3jVar.c);
            pj pjVar = g3jVar2.A;
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("order_id", str);
            hashMap.put("order_status", Kg.getEventValue());
            pjVar.a.a("DetailedPrice.Modal.Failed", hashMap, 1, new HashMap());
            return;
        }
        if (!(m3jVar instanceof l3j)) {
            w511.b();
            return;
        }
        binding = detailedPriceModalView.getBinding();
        ((GoConstraintLayout) binding.d.b).setVisibility(8);
        p2jVar = detailedPriceModalView.adapter;
        l3j l3jVar = (l3j) m3jVar;
        List list = l3jVar.a;
        p2jVar.submitList(list, new uxh(14, detailedPriceModalView));
        detailedPriceModalView.renderButton(l3jVar.b);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((x2j) obj2) instanceof w2j) {
                    break;
                }
            }
        }
        w2j w2jVar = obj2 instanceof w2j ? (w2j) obj2 : null;
        String valueOf = String.valueOf(w2jVar != null ? w2jVar.a : null);
        g3jVar = detailedPriceModalView.presenter;
        int size = list.size();
        s3j s3jVar2 = g3jVar.x.a;
        String str2 = s3jVar2.a;
        DetailedPriceAnalytics$OrderStatus Kg2 = g3j.Kg(s3jVar2.c);
        pj pjVar2 = g3jVar.A;
        pjVar2.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("items_count", Integer.valueOf(size));
        hashMap2.put("title", valueOf);
        hashMap2.put("order_id", str2);
        hashMap2.put("order_status", Kg2.getEventValue());
        pjVar2.a.a("DetailedPrice.Modal.ContentLoaded", hashMap2, 1, new HashMap());
    }
}
