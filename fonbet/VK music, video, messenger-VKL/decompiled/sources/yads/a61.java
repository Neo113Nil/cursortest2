package yads;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final class a61 implements kx0, zi3, g61, vv1, oo2 {
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();

    public final void a(kx0 kx0Var) {
        this.a.add(kx0Var);
    }

    @Override // yads.vv1
    public final void b() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((vv1) it.next()).b();
        }
    }

    @Override // yads.g61
    public final void c() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((g61) it.next()).c();
        }
    }

    @Override // yads.zi3
    public final void d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((zi3) it.next()).d();
        }
    }

    @Override // yads.vv1
    public final void e() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((vv1) it.next()).e();
        }
    }

    @Override // yads.oo2
    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((oo2) it.next()).f();
        }
    }

    @Override // yads.g61
    public final void g() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((g61) it.next()).g();
        }
    }

    @Override // yads.zi3
    public final void h() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((zi3) it.next()).h();
        }
    }

    @Override // yads.kx0
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kx0) it.next()).a();
        }
    }
}
