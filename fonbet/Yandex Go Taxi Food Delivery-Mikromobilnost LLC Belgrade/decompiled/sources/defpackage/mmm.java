package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public class mmm {
    public final int a;
    public final sf10 b;
    public final CopyOnWriteArrayList c;

    public mmm() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            lmm lmmVar = (lmm) it.next();
            tw21.a0(lmmVar.a, new kmm(this, lmmVar.b, 3));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            lmm lmmVar = (lmm) it.next();
            tw21.a0(lmmVar.a, new kmm(this, lmmVar.b, 1));
        }
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            lmm lmmVar = (lmm) it.next();
            tw21.a0(lmmVar.a, new kmm(this, lmmVar.b, 2));
        }
    }

    public final void d(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            lmm lmmVar = (lmm) it.next();
            tw21.a0(lmmVar.a, new z50(this, lmmVar.b, i, 5));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            lmm lmmVar = (lmm) it.next();
            tw21.a0(lmmVar.a, new p7h(7, this, lmmVar.b, exc));
        }
    }

    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            lmm lmmVar = (lmm) it.next();
            tw21.a0(lmmVar.a, new kmm(this, lmmVar.b, 0));
        }
    }

    public mmm(CopyOnWriteArrayList copyOnWriteArrayList, int i, sf10 sf10Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = sf10Var;
    }
}
