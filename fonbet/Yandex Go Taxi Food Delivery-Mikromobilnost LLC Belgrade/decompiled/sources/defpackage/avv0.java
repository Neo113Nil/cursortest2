package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class avv0 {
    public final r0 a = bvf0.c(EmptyList.a);

    public final void a(g0c g0cVar) {
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            arrayList = new ArrayList((List) value);
            int f = scc.f(arrayList);
            while (true) {
                if (-1 >= f) {
                    arrayList.add(g0cVar);
                    break;
                } else {
                    if (jl40.l(arrayList.get(f), g0cVar)) {
                        arrayList.set(f, g0cVar);
                        break;
                    }
                    f--;
                }
            }
        } while (!r0Var.k(value, arrayList));
    }

    public final void b(g0c g0cVar) {
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            arrayList = new ArrayList((List) value);
            int f = scc.f(arrayList);
            while (true) {
                if (-1 >= f) {
                    break;
                }
                if (jl40.l(arrayList.get(f), g0cVar)) {
                    arrayList.remove(f);
                    break;
                }
                f--;
            }
        } while (!r0Var.k(value, arrayList));
    }
}
