package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import yads.in;
import yads.mn;

/* loaded from: classes7.dex */
public final class fk71 {
    public final j18 a;
    public final nl61 b;
    public final tse c;
    public final jk81 d;
    public final mn e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public fk71(j18 j18Var, nl61 nl61Var, tse tseVar, jk81 jk81Var, mn mnVar) {
        this.a = j18Var;
        this.b = nl61Var;
        this.c = tseVar;
        this.d = jk81Var;
        this.e = mnVar;
    }

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            this.d.a(this.b, null);
            this.a.resumeWith(zy11.a);
        }
    }

    public final void b(Object obj) {
        if (this.f.compareAndSet(false, true)) {
            tje.N(this.c, null, null, new in(this, obj, null), 3);
        }
    }
}
