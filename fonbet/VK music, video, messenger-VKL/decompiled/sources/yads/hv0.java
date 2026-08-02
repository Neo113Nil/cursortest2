package yads;

import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes10.dex */
public final class hv0 implements di3 {
    public final w5 a;
    public final i72 b;
    public final b72 c;
    public final Iterator d;
    public final z30 e;

    public hv0(w5 w5Var, i72 i72Var, b72 b72Var, Iterator it, z30 z30Var) {
        this.a = w5Var;
        this.b = i72Var;
        this.c = b72Var;
        this.d = it;
        this.e = z30Var;
    }

    @Override // yads.di3
    public final void a() {
        if (this.d.hasNext()) {
            Pair pair = (Pair) this.d.next();
            String str = (String) pair.d();
            String str2 = (String) pair.g();
            w5 w5Var = this.a;
            i72 i72Var = this.b;
            b72 b72Var = this.c;
            b72Var.a(str, new hv0(w5Var, i72Var, b72Var, this.d, this.e), str2);
        }
    }

    @Override // yads.di3
    public final void b() {
        this.e.a(y30.f);
    }

    @Override // yads.di3
    public final void c() {
        a();
    }
}
