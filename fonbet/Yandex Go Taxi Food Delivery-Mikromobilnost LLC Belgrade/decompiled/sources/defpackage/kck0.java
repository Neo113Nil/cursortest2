package defpackage;

import com.yandex.go.taxi.order.details.v2.core.availability.m;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class kck0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ kck0(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                mVar.j.l((hck0) obj);
                break;
            default:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((o2y0) it.next()).b());
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    mVar.f((TaxiOrder) it2.next());
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((TaxiOrder) it3.next()).a);
                }
                Set N0 = a.N0(arrayList2);
                ConcurrentHashMap concurrentHashMap = mVar.h;
                ConcurrentHashMap concurrentHashMap2 = mVar.h;
                Set g = v4r0.g(concurrentHashMap.keySet(), N0);
                Iterator it4 = g.iterator();
                while (it4.hasNext()) {
                    concurrentHashMap2.remove((String) it4.next());
                }
                if (!g.isEmpty() && concurrentHashMap2.isEmpty()) {
                    mVar.d();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
