package defpackage;

import androidx.compose.ui.layout.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes12.dex */
public abstract class o57 {
    public static final boolean a(int i, long j, List list) {
        int i2 = (n8e.i(j) - ((list.size() - 1) * i)) / list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((x910) it.next()).k0(n8e.h(j)) > i2) {
                return false;
            }
        }
        return true;
    }

    public static final aa10 b(k kVar, List list, long j, int i) {
        aa10 w;
        int h = n8e.h(j) - ((list.size() - 1) * i);
        if (h < 0) {
            h = 0;
        }
        int size = h / list.size();
        int i2 = n8e.i(j);
        int d = d(i2, list);
        int i3 = d > size ? size : d;
        if (!((i2 >= 0) & (i3 >= 0))) {
            kxv.a("width and height must be >= 0");
        }
        long h2 = p8e.h(i2, i2, i3, i3);
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((x910) it.next()).l0(h2));
        }
        w = kVar.w(n8e.i(j), ((list.size() - 1) * i) + (arrayList.size() * i3), b.f(), new m57(arrayList, new Ref$IntRef(), i3, i, 0));
        return w;
    }

    public static final aa10 c(k kVar, List list, long j, int i) {
        aa10 w;
        int i2 = (n8e.i(j) - ((list.size() - 1) * i)) / list.size();
        int d = d(i2, list);
        if (!((i2 >= 0) & (d >= 0))) {
            kxv.a("width and height must be >= 0");
        }
        long h = p8e.h(i2, i2, d, d);
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((x910) it.next()).l0(h));
        }
        w = kVar.w(n8e.i(j), d, b.f(), new m57(arrayList, new Ref$IntRef(), i2, i, 1));
        return w;
    }

    public static final int d(int i, List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            ny61.p();
            return 0;
        }
        int V = ((x910) it.next()).V(i);
        while (it.hasNext()) {
            int V2 = ((x910) it.next()).V(i);
            if (V < V2) {
                V = V2;
            }
        }
        return V;
    }
}
