package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.f9j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class j3f implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ o3f d;
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ j3f(int i, int i2, o3f o3fVar, List list, boolean z) {
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
        int i2 = this.c;
        boolean z = size == i && i2 / i < 3;
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
            f9j0.c.b bVar = (f9j0.c.b) next;
            if (!list.contains(bVar) && bVar.d) {
                arrayList.add(next);
            }
        }
        if (!z || arrayList.size() >= i) {
            return io.reactivex.rxjava3.core.x.k(arrayList);
        }
        return new io.reactivex.rxjava3.internal.operators.single.d0(this.d.d(i - arrayList.size(), i2 + i, this.f, j5g.u0(list3, list)), new xr(10), null).l(new com.vk.movika.sdk.base.hooks.f(new i3f(arrayList, 0), 11));
    }
}
