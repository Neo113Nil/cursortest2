package xsna;

import java.util.Collections;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.cca0;
import xsna.dda0;
import xsna.qfa0;
import xsna.wca0;

/* compiled from: PhotoTagsFeature.kt */
/* loaded from: classes4.dex */
public final class hca0 extends wk50<jda0, eda0, cca0, wca0> {
    public final oca0 f;
    public final qfa0.g g;
    public final int h;
    public final int i;
    public final f4z<dda0> j;

    public hca0(int i, int i2, oca0 oca0Var, qfa0.g gVar) {
        super(null, new ada0());
        this.f = oca0Var;
        this.g = gVar;
        this.h = i;
        this.i = i2;
        this.j = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(eda0 eda0Var, cca0 cca0Var) {
        cca0 cca0Var2 = cca0Var;
        Iterable iterable = eda0Var.b;
        if (cca0Var2 instanceof cca0.b) {
            U(Collections.singleton(((cca0.b) cca0Var2).b));
            return;
        }
        if (cca0Var2 instanceof cca0.e) {
            V(Collections.singleton(((cca0.e) cca0Var2).b));
            return;
        }
        boolean equals = cca0Var2.equals(cca0.a.b);
        qfa0.g gVar = this.g;
        if (equals) {
            if (iterable == null) {
                iterable = EmptyList.b;
            }
            Set<qba0> S0 = j5g.S0(iterable);
            gVar.c();
            U(S0);
            return;
        }
        boolean equals2 = cca0Var2.equals(cca0.c.b);
        f4z<dda0> f4zVar = this.j;
        if (equals2) {
            f4zVar.b(dda0.b.a);
            return;
        }
        if (cca0Var2.equals(cca0.d.b)) {
            if (iterable == null) {
                iterable = EmptyList.b;
            }
            Set<qba0> S02 = j5g.S0(iterable);
            gVar.b();
            V(S02);
            return;
        }
        if (cca0Var2 instanceof cca0.g) {
            f4zVar.b(new dda0.f(((cca0.g) cca0Var2).b));
            return;
        }
        if (cca0Var2 instanceof cca0.h) {
            f4zVar.b(new dda0.g(((cca0.h) cca0Var2).b));
            return;
        }
        if (cca0Var2 instanceof cca0.f) {
            Throwable th = ((cca0.f) cca0Var2).b;
            f4zVar.b(new dda0.d(th));
            T(new wca0.b(th));
        } else if (cca0Var2 instanceof cca0.j) {
            T(new wca0.c(((cca0.j) cca0Var2).b));
        } else if (cca0Var2 instanceof cca0.k) {
            T(new wca0.a(((cca0.k) cca0Var2).b));
        } else {
            if (!(cca0Var2 instanceof cca0.i)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(new dda0.e(((cca0.i) cca0Var2).b));
        }
    }

    public final void U(Set<qba0> set) {
        this.e.b(this.f.b(set).subscribe(new gca0(0, this, set), new cx00(new o440(this, 10), 12)));
    }

    public final void V(Set<qba0> set) {
        this.e.b(this.f.a(set).subscribe(new fca0(0, this, set), new le50(new nl30(this, 13), 6)));
    }

    public final f4z<dda0> W() {
        return this.j;
    }
}
