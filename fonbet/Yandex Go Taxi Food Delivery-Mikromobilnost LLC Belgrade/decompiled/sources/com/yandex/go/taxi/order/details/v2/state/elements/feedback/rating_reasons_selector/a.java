package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating_reasons_selector;

import com.yandex.go.taxi.order.feedback.domain.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.RatingReasonsTitleDto;
import defpackage.jsq;
import defpackage.lmk0;
import defpackage.o2y0;
import defpackage.pjk0;
import defpackage.ppa1;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final o2y0 a;
    public final com.yandex.go.taxi.order.details.v2.domain.feedback.a b;

    public a(o2y0 o2y0Var, com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar) {
        this.a = o2y0Var;
        this.b = aVar;
    }

    public static String a(int i, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ppa1.c(i, ((RatingReasonsTitleDto) obj).b)) {
                break;
            }
        }
        RatingReasonsTitleDto ratingReasonsTitleDto = (RatingReasonsTitleDto) obj;
        if (ratingReasonsTitleDto != null) {
            return ratingReasonsTitleDto.a;
        }
        return null;
    }

    public final g b(pjk0 pjk0Var) {
        return e.I(e.t(e.I(this.a.a(), new RideCardRatingReasonsItemDataSource$stateFlow$1(2, null))), new RideCardRatingReasonsItemDataSource$stateFlow$2(pjk0Var, this, null));
    }

    public final void c(HashSet hashSet, ArrayList arrayList) {
        Object value;
        TaxiOrder taxiOrder;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((lmk0) it.next()).a());
        }
        HashSet H0 = kotlin.collections.a.H0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : hashSet) {
            if (H0.contains((String) obj)) {
                arrayList3.add(obj);
            }
        }
        HashSet H02 = kotlin.collections.a.H0(arrayList3);
        if (H02.equals(hashSet)) {
            return;
        }
        List J0 = kotlin.collections.a.J0(H02);
        com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar = this.b;
        o2y0 o2y0Var = aVar.a;
        r0 r0Var = o2y0Var.a;
        do {
            value = r0Var.getValue();
            taxiOrder = (TaxiOrder) value;
            taxiOrder.R(J0);
        } while (!r0Var.k(value, taxiOrder));
        o2y0Var.f();
        ((b) aVar.g).d(o2y0Var.b().a, jsq.a(o2y0Var.b()));
        aVar.h.g(o2y0Var.b());
    }
}
