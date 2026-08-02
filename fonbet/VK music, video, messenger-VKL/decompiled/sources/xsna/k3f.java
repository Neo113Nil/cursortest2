package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.f9j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class k3f implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ o3f d;
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ k3f(int i, int i2, o3f o3fVar, List list, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = o3fVar;
        this.e = list;
        this.f = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list;
        List list2 = (List) obj;
        int size = list2.size();
        int i = this.b;
        boolean z = size == i && this.c / i < 3;
        List list3 = list2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list3.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = this.e;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            f9j0.c.a aVar = (f9j0.c.a) next;
            if (!list.contains(aVar) && aVar.b()) {
                arrayList.add(next);
            }
        }
        if (!z || arrayList.size() >= i) {
            return io.reactivex.rxjava3.core.x.k(arrayList);
        }
        return new io.reactivex.rxjava3.internal.operators.single.d0(this.d.c(i - arrayList.size(), list2.size(), this.f, j5g.u0(list3, list)), new pr(9), null).l(new r41(new lbe(arrayList, 4), 16));
    }
}
