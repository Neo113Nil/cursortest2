package xsna;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: RememberEventDispatcher.kt */
/* loaded from: classes11.dex */
public final class ytf0 {
    public Set<huf0> a;
    public fvi b;
    public final ci50<iuf0> c;
    public qh50<iuf0> d;
    public ci50<iuf0> e;
    public final ci50<Object> f;
    public final ci50<gzs<s3q0>> g;
    public qh50<ypi> h;
    public ph50<androidx.compose.runtime.f, lr90> i;
    public ArrayList<ci50<iuf0>> j;
    public j5h0<iuf0> k;

    public ytf0() {
        ci50<iuf0> ci50Var = new ci50<>(new iuf0[16]);
        this.c = ci50Var;
        this.d = k5h0.a();
        this.e = ci50Var;
        this.f = new ci50<>(new Object[16]);
        this.g = new ci50<>(new gzs[16]);
    }

    public static final boolean f(iuf0 iuf0Var, ci50<iuf0> ci50Var) {
        iuf0[] iuf0VarArr = ci50Var.b;
        int i = ci50Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            huf0 b = iuf0VarArr[i2].b();
            if (b instanceof lr90) {
                ci50<iuf0> ci50Var2 = ((lr90) b).c;
                if (ci50Var2.j(iuf0Var) || f(iuf0Var, ci50Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        ci50<iuf0> ci50Var = this.c;
        ci50Var.g();
        this.d.f();
        this.e = ci50Var;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set<huf0> set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator<huf0> it = set.iterator();
            while (it.hasNext()) {
                huf0 next = it.next();
                it.remove();
                next.d();
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void c() {
        Set<huf0> set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        ci50<Object> ci50Var = this.f;
        if (ci50Var.d != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                j5h0 j5h0Var = this.h;
                int i = ci50Var.d;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = ci50Var.b[i];
                    try {
                        if (obj instanceof iuf0) {
                            huf0 b = ((iuf0) obj).b();
                            set.remove(b);
                            b.f();
                        }
                        if (obj instanceof ypi) {
                            if (j5h0Var == null || !j5h0Var.a(obj)) {
                                ((ypi) obj).j();
                            } else {
                                ((ypi) obj).a();
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        fvi fviVar = this.b;
                        if (fviVar != null) {
                            fviVar.e(obj, th);
                        }
                        throw th;
                    }
                }
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ci50<iuf0> ci50Var2 = this.c;
        if (ci50Var2.d != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set<huf0> set2 = this.a;
                if (set2 != null) {
                    iuf0[] iuf0VarArr = ci50Var2.b;
                    int i2 = ci50Var2.d;
                    for (int i3 = 0; i3 < i2; i3++) {
                        iuf0 iuf0Var = iuf0VarArr[i3];
                        huf0 b2 = iuf0Var.b();
                        set2.remove(b2);
                        try {
                            b2.e();
                            s3q0 s3q0Var3 = s3q0.a;
                        } catch (Throwable th3) {
                            fvi fviVar2 = this.b;
                            if (fviVar2 != null) {
                                fviVar2.e(iuf0Var, th3);
                            }
                            throw th3;
                        }
                    }
                }
                s3q0 s3q0Var4 = s3q0.a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void d() {
        ci50<gzs<s3q0>> ci50Var = this.g;
        if (ci50Var.d != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                gzs<s3q0>[] gzsVarArr = ci50Var.b;
                int i = ci50Var.d;
                for (int i2 = 0; i2 < i; i2++) {
                    gzsVarArr[i2].invoke();
                }
                ci50Var.g();
                s3q0 s3q0Var = s3q0.a;
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void e(iuf0 iuf0Var) {
        if (!this.d.a(iuf0Var)) {
            j5h0<iuf0> j5h0Var = this.k;
            if (j5h0Var == null || !j5h0Var.a(iuf0Var)) {
                this.f.b(iuf0Var);
                return;
            }
            return;
        }
        this.d.m(iuf0Var);
        if (!this.e.j(iuf0Var)) {
            ci50<iuf0> ci50Var = this.c;
            if (!ci50Var.j(iuf0Var)) {
                f(iuf0Var, ci50Var);
            }
        }
        Set<huf0> set = this.a;
        if (set == null) {
            return;
        }
        set.add(iuf0Var.b());
    }

    public final void g(Set set, gvi gviVar) {
        a();
        this.a = set;
        this.b = gviVar;
    }

    public final void h(iuf0 iuf0Var) {
        this.e.b(iuf0Var);
        this.d.e(iuf0Var);
    }
}
