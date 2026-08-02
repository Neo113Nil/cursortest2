package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class nhy implements z910 {
    public final m3u0 a;

    public nhy(m3u0 m3u0Var) {
        this.a = m3u0Var;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        Object obj;
        Object obj2;
        aa10 w;
        long b = n8e.b(0, j, 0, 0, 0, 10);
        List list2 = list;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (jl40.l(pj91.g((x910) obj), "label")) {
                break;
            }
            i++;
        }
        x910 x910Var = (x910) obj;
        o l0 = x910Var != null ? x910Var.l0(b) : null;
        int max = Math.max(0, l0 != null ? l0.a : 0);
        int i2 = l0 != null ? l0.b : 0;
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            x910 x910Var2 = (x910) list.get(i3);
            if (jl40.l(pj91.g(x910Var2), "field")) {
                o l02 = x910Var2.l0(p8e.j(0, -i2, b, 1));
                int max2 = Math.max(max, l02.a);
                int i4 = i2 + l02.b;
                int size3 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i5);
                    if (jl40.l(pj91.g((x910) obj2), "hint")) {
                        break;
                    }
                    i5++;
                }
                x910 x910Var3 = (x910) obj2;
                o l03 = x910Var3 != null ? x910Var3.l0(p8e.j(0, -i4, b, 1)) : null;
                int max3 = Math.max(Math.max(max2, l03 != null ? l03.a : 0), n8e.k(j));
                int max4 = Math.max(i4, n8e.j(j));
                w = kVar.w(max3, max4, b.f(), new ric(this, l03, l0, max4, l02));
                return w;
            }
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return null;
    }
}
