package defpackage;

import com.yandex.messaging.internal.view.timeline.poll.a;
import com.yandex.messaging.internal.view.timeline.poll.options.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final /* synthetic */ class d85 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ d85(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.v0(aVar.K0());
                aVar.L0();
                return zy11Var;
            default:
                b bVar = aVar.H2;
                ArrayList arrayList = bVar.w;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    arrayList2.add(new Pair(Integer.valueOf(i2), (hxd0) next));
                    i2 = i3;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (((hxd0) ((Pair) next2).f()).d) {
                        arrayList3.add(next2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(Integer.valueOf(((Number) ((Pair) it3.next()).c()).intValue()));
                }
                aVar.M0(arrayList4);
                Iterator it4 = bVar.w.iterator();
                while (it4.hasNext()) {
                    ((hxd0) it4.next()).d = false;
                }
                aVar.v0(aVar.K0());
                return zy11Var;
        }
    }
}
