package xsna;

import com.vk.geo.impl.model.BoundingBox;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.snt;

/* compiled from: Node.kt */
/* loaded from: classes2.dex */
public final class b670<S extends snt> extends s470<S> {
    public final List<s470<S>> b;
    public final xmj c;
    public final BoundingBox d;

    /* JADX WARN: Multi-variable type inference failed */
    public b670(List<? extends s470<S>> list, xmj xmjVar) {
        this.b = list;
        this.c = xmjVar;
        List<? extends s470<S>> list2 = list;
        this.d = w2r0.a(list2);
        if (list2.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // xsna.s470
    public final List<s470<S>> a(S s) {
        xmj xmjVar = this.c;
        lfi0 lfi0Var = xmjVar.d;
        lif0 d = s.n().d();
        List<s470<S>> list = this.b;
        s470<S> f = lfi0Var.f(d, list);
        if (f == null) {
            return EmptyList.b;
        }
        List<s470<S>> a = f.a(s);
        ArrayList arrayList = new ArrayList(a.size() + list.size());
        for (s470<S> s470Var : list) {
            if (s470Var != f) {
                arrayList.add(s470Var);
            }
        }
        arrayList.addAll(a);
        if (arrayList.size() <= xmjVar.a) {
            return Collections.singletonList(new b670(arrayList, xmjVar));
        }
        yfz M = xmjVar.c.M(xmjVar.b, arrayList);
        return M == null ? EmptyList.b : e43.l(new b670(M.a.b, xmjVar), new b670(M.b.b, xmjVar));
    }

    @Override // xsna.s470
    public final uki0<S> c(dt dtVar, dnz dnzVar) {
        BoundingBox boundingBox = this.d;
        boundingBox.getClass();
        return !boundingBox.b((lif0) dnzVar.c) ? ghp.a : new cor(new i5g(this.b), new es00(dtVar, dnzVar), new ulz(25));
    }

    @Override // xsna.luu, xsna.ktx0
    public final lif0 d() {
        return this.d;
    }

    @Override // xsna.luu
    public final snt n() {
        return this.d;
    }
}
