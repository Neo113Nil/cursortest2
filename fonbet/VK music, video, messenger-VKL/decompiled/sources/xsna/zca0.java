package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.jda0;
import xsna.tba0;

/* compiled from: PhotoTagsReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class zca0 extends FunctionReferenceImpl implements izs<eda0, jda0.b> {
    @Override // xsna.izs
    public final jda0.b invoke(eda0 eda0Var) {
        ListBuilder g;
        eda0 eda0Var2 = eda0Var;
        ((ada0) this.receiver).getClass();
        List<qba0> list = eda0Var2.b;
        if (list == null) {
            g = null;
        } else {
            ListBuilder e = e43.e();
            List<qba0> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (qba0 qba0Var : list2) {
                if (eda0Var2.d.contains(Integer.valueOf(qba0Var.j))) {
                    qba0Var = new qba0(qba0Var.a, qba0Var.b, qba0Var.c, qba0Var.d, qba0Var.e, qba0Var.f, qba0Var.g, qba0Var.h, qba0Var.i, qba0Var.j, qba0Var.k, qba0Var.l, qba0Var.m, true);
                }
                arrayList.add(qba0Var);
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new tba0.b((qba0) it.next()));
            }
            e.addAll(arrayList2);
            if (!arrayList2.isEmpty()) {
                e.add(new tba0.a(arrayList2.size()));
            }
            g = e.g();
        }
        return new jda0.b(g, eda0Var2.c);
    }
}
