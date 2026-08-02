package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$TextChoice;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public abstract class jsq {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (r3 == 0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ksq a(TaxiOrder taxiOrder) {
        List list;
        EmptyList emptyList;
        isq isqVar = new isq(taxiOrder.a);
        String z = taxiOrder.z();
        isqVar.f = (z == null || z.length() == 0) ? false : true;
        isqVar.h = taxiOrder.z();
        isqVar.g = taxiOrder.A();
        List list2 = taxiOrder.V().A.e;
        q6c0 q6c0Var = new q6c0(21, taxiOrder.V().A.b, taxiOrder.V().A.c, taxiOrder.V().A.a);
        FeedbackDto k = taxiOrder.k();
        EmptyList emptyList2 = EmptyList.a;
        if (k != null) {
            FeedbackChoices feedbackChoices = k.c;
            Integer num = k.a;
            isqVar.j = num != null ? num.intValue() : 0;
            isqVar.k = k.b;
            if (feedbackChoices == null || (list = feedbackChoices.d) == null) {
                list = emptyList2;
            }
            if (feedbackChoices != null) {
                ?? r3 = feedbackChoices.e;
                emptyList = r3;
            }
            emptyList = emptyList2;
        } else {
            list = null;
            emptyList = null;
        }
        isqVar.d = taxiOrder.V().E.a;
        if (list == null) {
            list = emptyList2;
        }
        List<FeedbackBadgeChoice$TextChoice> list3 = list2;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        for (FeedbackBadgeChoice$TextChoice feedbackBadgeChoice$TextChoice : list3) {
            String str = feedbackBadgeChoice$TextChoice.a;
            arrayList.add(new r8i0(120, str, feedbackBadgeChoice$TextChoice.b, null, null, null, list.contains(str)));
        }
        isqVar.c = arrayList;
        if (emptyList != null) {
            emptyList2 = emptyList;
        }
        wrq wrqVar = wrq.f;
        isqVar.e = vrq.a(q6c0Var, new qh2(emptyList2, 4));
        return new ksq(isqVar);
    }

    public static ksq b(String str) {
        return new ksq(new isq(str));
    }
}
