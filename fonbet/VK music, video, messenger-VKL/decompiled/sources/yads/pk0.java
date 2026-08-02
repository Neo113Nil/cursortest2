package yads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.df6;
import xsna.l0g;

/* loaded from: classes10.dex */
public final class pk0 {
    public final int a;
    public final zn1 b;
    public final CopyOnWriteArrayList c;

    public pk0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void a(Handler handler, qk0 qk0Var) {
        qk0Var.getClass();
        this.c.add(new ok0(handler, qk0Var));
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ok0 ok0Var = (ok0) it.next();
            mc3.a(ok0Var.a, (Runnable) new xsna.yr2(8, this, ok0Var.b));
        }
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ok0 ok0Var = (ok0) it.next();
            mc3.a(ok0Var.a, (Runnable) new xsna.i73(10, this, ok0Var.b));
        }
    }

    public final void d() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ok0 ok0Var = (ok0) it.next();
            mc3.a(ok0Var.a, (Runnable) new xsna.vr2(11, this, ok0Var.b));
        }
    }

    public pk0(CopyOnWriteArrayList copyOnWriteArrayList, int i, zn1 zn1Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = zn1Var;
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ok0 ok0Var = (ok0) it.next();
            mc3.a(ok0Var.a, (Runnable) new df6(12, this, ok0Var.b));
        }
    }

    public final /* synthetic */ void b(qk0 qk0Var) {
        qk0Var.d(this.a, this.b);
    }

    public final /* synthetic */ void c(qk0 qk0Var) {
        qk0Var.c(this.a, this.b);
    }

    public final /* synthetic */ void d(qk0 qk0Var) {
        qk0Var.b(this.a, this.b);
    }

    public final void a(final int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ok0 ok0Var = (ok0) it.next();
            final qk0 qk0Var = ok0Var.b;
            mc3.a(ok0Var.a, new Runnable() { // from class: xsna.k9z0
                @Override // java.lang.Runnable
                public final void run() {
                    yads.pk0.this.a(qk0Var, i);
                }
            });
        }
    }

    public final void a(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ok0 ok0Var = (ok0) it.next();
            mc3.a(ok0Var.a, (Runnable) new l0g(this, ok0Var.b, exc, 5));
        }
    }

    public final /* synthetic */ void a(qk0 qk0Var) {
        qk0Var.a(this.a, this.b);
    }

    public final /* synthetic */ void a(qk0 qk0Var, int i) {
        qk0Var.getClass();
        qk0Var.a(this.a, this.b, i);
    }

    public final /* synthetic */ void a(qk0 qk0Var, Exception exc) {
        qk0Var.a(this.a, this.b, exc);
    }
}
