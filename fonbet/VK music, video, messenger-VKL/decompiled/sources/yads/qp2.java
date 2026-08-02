package yads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class qp2 implements Comparable {
    public final on3 b;
    public final int c;
    public final String d;
    public final int e;
    public final Object f;
    public uq2 g;
    public Integer h;
    public dq2 i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public qe0 o;
    public lr p;
    public Object q;
    public op2 r;

    public qp2(int i, String str, uq2 uq2Var) {
        this.b = on3.c ? new on3() : null;
        this.f = new Object();
        this.j = true;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.p = null;
        this.c = i;
        this.d = str;
        this.g = uq2Var;
        a(new qe0());
        this.e = b(str);
    }

    public mn3 a(mn3 mn3Var) {
        return mn3Var;
    }

    public abstract wq2 a(g92 g92Var);

    public abstract void a(Object obj);

    public byte[] b() {
        return null;
    }

    public final void c(String str) {
        dq2 dq2Var = this.i;
        if (dq2Var != null) {
            synchronized (dq2Var.b) {
                dq2Var.b.remove(this);
            }
            synchronized (dq2Var.j) {
                Iterator it = dq2Var.j.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            dq2Var.a(this, 5);
        }
        if (on3.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new np2(this, str, id));
                return;
            }
            this.b.a(str, id);
            on3 on3Var = this.b;
            toString();
            on3Var.a();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qp2 qp2Var = (qp2) obj;
        int f = f();
        int f2 = qp2Var.f();
        return f == f2 ? this.h.intValue() - qp2Var.h.intValue() : hg0.a(f2) - hg0.a(f);
    }

    public Map d() {
        return Collections.EMPTY_MAP;
    }

    public final int e() {
        return this.c;
    }

    public int f() {
        return 2;
    }

    public String g() {
        return this.d;
    }

    public final boolean h() {
        boolean z;
        synchronized (this.f) {
            z = this.l;
        }
        return z;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.f) {
            z = this.k;
        }
        return z;
    }

    public final void j() {
        op2 op2Var;
        synchronized (this.f) {
            op2Var = this.r;
        }
        if (op2Var != null) {
            ((io3) op2Var).b(this);
        }
    }

    public final void k() {
        this.j = false;
    }

    public final void l() {
        this.n = true;
    }

    public final void m() {
        this.m = true;
    }

    public final String toString() {
        String a = xsna.et.a(this.e, new StringBuilder("0x"));
        StringBuilder sb = new StringBuilder();
        sb.append(i() ? "[X] " : "[ ] ");
        sb.append(g());
        sb.append(" ");
        sb.append(a);
        sb.append(" ");
        sb.append(pp2.a(f()));
        sb.append(" ");
        sb.append(this.h);
        return sb.toString();
    }

    public static int b(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void a() {
        synchronized (this.f) {
            this.k = true;
            this.g = null;
        }
    }

    public final void a(wq2 wq2Var) {
        op2 op2Var;
        synchronized (this.f) {
            op2Var = this.r;
        }
        if (op2Var != null) {
            ((io3) op2Var).a(this, wq2Var);
        }
    }

    public final void a(int i) {
        dq2 dq2Var = this.i;
        if (dq2Var != null) {
            dq2Var.a(this, i);
        }
    }

    public final void a(op2 op2Var) {
        synchronized (this.f) {
            this.r = op2Var;
        }
    }

    public final void a(qe0 qe0Var) {
        this.o = qe0Var;
    }

    public final void a(String str) {
        if (on3.c) {
            this.b.a(str, Thread.currentThread().getId());
        }
    }

    public final String c() {
        String g = g();
        int i = this.c;
        if (i == 0 || i == -1) {
            return g;
        }
        return Integer.toString(i) + '-' + g;
    }
}
