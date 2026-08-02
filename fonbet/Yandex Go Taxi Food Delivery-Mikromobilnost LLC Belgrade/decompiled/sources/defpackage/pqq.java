package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class pqq implements p8w {
    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        Iterable unmodifiableList;
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        kwu kwuVar = d5j0Var.a;
        Set j = kwuVar.j();
        ArrayList arrayList = new ArrayList();
        for (Object obj : j) {
            if (cvu0.x((String) obj, "move_to_header:", false)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return zci0Var.b(d5j0Var);
        }
        t4j0 b = d5j0Var.b();
        jwu g = kwuVar.g();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            List list = kwuVar.g;
            if (list == null) {
                unmodifiableList = EmptyList.a;
            } else {
                ArrayList arrayList2 = new ArrayList(4);
                b6w m = y6i0.m(y6i0.n(0, list.size()), 2);
                int i = m.a;
                int i2 = m.b;
                int i3 = m.c;
                if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                    while (true) {
                        if (str.equals(list.get(i))) {
                            arrayList2.add(list.get(i + 1));
                        }
                        if (i == i2) {
                            break;
                        }
                        i += i3;
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            List M = a.M(unmodifiableList);
            String substring = str.substring(15);
            b.f(substring);
            Iterator it2 = M.iterator();
            while (it2.hasNext()) {
                b.a(substring, (String) it2.next());
            }
            g.m(str);
        }
        b.a = g.e();
        return zci0Var.b(new d5j0(b));
    }
}
