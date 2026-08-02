package yads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class mo {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final co1 c = new co1();
    public final pk0 d = new pk0();
    public Looper e;
    public w73 f;
    public zf2 g;

    public abstract qn1 a(zn1 zn1Var, qe qeVar, long j);

    public void a() {
    }

    public abstract void a(qn1 qn1Var);

    public abstract void a(v93 v93Var);

    public void b() {
    }

    public abstract gn1 c();

    public final void c(ao1 ao1Var) {
        this.a.remove(ao1Var);
        if (!this.a.isEmpty()) {
            a(ao1Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        e();
    }

    public abstract void d();

    public abstract void e();

    public final pk0 a(zn1 zn1Var) {
        return new pk0(this.d.c, 0, zn1Var);
    }

    public final co1 b(zn1 zn1Var) {
        return new co1(this.c.c, 0, zn1Var, 0L);
    }

    public final void a(ao1 ao1Var) {
        boolean isEmpty = this.b.isEmpty();
        this.b.remove(ao1Var);
        if (isEmpty || !this.b.isEmpty()) {
            return;
        }
        a();
    }

    public final void b(ao1 ao1Var) {
        this.e.getClass();
        boolean isEmpty = this.b.isEmpty();
        this.b.add(ao1Var);
        if (isEmpty) {
            b();
        }
    }

    public final void a(w73 w73Var) {
        this.f = w73Var;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ao1) it.next()).a(this, w73Var);
        }
    }

    public final void a(qk0 qk0Var) {
        pk0 pk0Var = this.d;
        Iterator it = pk0Var.c.iterator();
        while (it.hasNext()) {
            ok0 ok0Var = (ok0) it.next();
            if (ok0Var.b == qk0Var) {
                pk0Var.c.remove(ok0Var);
            }
        }
    }

    public final void a(do1 do1Var) {
        co1 co1Var = this.c;
        Iterator it = co1Var.c.iterator();
        while (it.hasNext()) {
            bo1 bo1Var = (bo1) it.next();
            if (bo1Var.b == do1Var) {
                co1Var.c.remove(bo1Var);
            }
        }
    }
}
