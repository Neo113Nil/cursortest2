package xsna;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.t9i0;
import xsna.v9i0;

/* compiled from: SelectSessionRoomReducer.kt */
/* loaded from: classes7.dex */
public final class u9i0 extends dm50<w9i0, t9i0, v9i0> {
    @Override // xsna.dm50
    public final v9i0 c(v9i0 v9i0Var, t9i0 t9i0Var) {
        Object obj;
        v9i0 v9i0Var2 = v9i0Var;
        t9i0 t9i0Var2 = t9i0Var;
        if (t9i0Var2 instanceof t9i0.b) {
            t9i0.b bVar = (t9i0.b) t9i0Var2;
            return v9i0Var2 instanceof v9i0.b ? new v9i0.c(bVar.b, bVar.c, EmptyList.b) : v9i0Var2;
        }
        if (!(t9i0Var2 instanceof t9i0.d)) {
            if (t9i0Var2 instanceof t9i0.a) {
                return v9i0.a.b;
            }
            if (!(t9i0Var2 instanceof t9i0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            t9i0.c cVar = (t9i0.c) t9i0Var2;
            if (!(v9i0Var2 instanceof v9i0.c)) {
                return v9i0Var2 instanceof v9i0.d ? v9i0.d.a((v9i0.d) v9i0Var2, null, cVar.b, 7) : v9i0Var2;
            }
            v9i0.c cVar2 = (v9i0.c) v9i0Var2;
            return new v9i0.d(cVar2.b, cVar2.c, cVar2.d, cVar.b);
        }
        t9i0.d dVar = (t9i0.d) t9i0Var2;
        List<lvi0> list = dVar.b;
        if (v9i0Var2 instanceof v9i0.c) {
            v9i0.c cVar3 = (v9i0.c) v9i0Var2;
            return !epx.f(list, cVar3.d) ? new v9i0.c(cVar3.b, cVar3.c, list) : cVar3;
        }
        if (!(v9i0Var2 instanceof v9i0.d)) {
            return v9i0Var2;
        }
        v9i0.d dVar2 = (v9i0.d) v9i0Var2;
        if (epx.f(list, dVar2.d)) {
            return v9i0Var2;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((lvi0) obj).a.a, dVar2.e)) {
                break;
            }
        }
        return obj == null ? new v9i0.c(dVar2.b, dVar2.c, list) : v9i0.d.a(dVar2, dVar.b, null, 11);
    }

    @Override // xsna.dm50
    public final w9i0 d() {
        return new w9i0(e(new amp(28)), e(new tcu(27)), e(new ehu(29)), e(new byo(23)));
    }

    @Override // xsna.dm50
    public final void h(v9i0 v9i0Var, w9i0 w9i0Var) {
        v9i0 v9i0Var2 = v9i0Var;
        w9i0 w9i0Var2 = w9i0Var;
        if (v9i0Var2 instanceof v9i0.b) {
            f(w9i0Var2.a, v9i0Var2);
            return;
        }
        if (v9i0Var2 instanceof v9i0.c) {
            f(w9i0Var2.b, v9i0Var2);
        } else if (v9i0Var2 instanceof v9i0.d) {
            f(w9i0Var2.c, v9i0Var2);
        } else {
            if (!(v9i0Var2 instanceof v9i0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(w9i0Var2.d, v9i0Var2);
        }
    }
}
