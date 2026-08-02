package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class dox0 {
    public final wiq0 a;
    public final dqe0 b;

    public dox0(dqe0 dqe0Var, wiq0 wiq0Var) {
        this.a = wiq0Var;
        this.b = dqe0Var;
    }

    public final mk6 a() {
        Collection collection;
        pex0 m = ((k) this.a).m();
        if (m == null) {
            return mk6.e;
        }
        String str = ((k) this.a).j.f;
        jn40 jn40Var = m.V;
        if (jn40Var == null || (collection = jn40Var.f) == null) {
            collection = EmptySet.a;
        }
        if (str.length() == 0) {
            str = m.b;
        }
        boolean z = m.K0;
        List list = this.b.a.x;
        return new mk6(str, z, !(list == null || list.isEmpty()), collection);
    }
}
