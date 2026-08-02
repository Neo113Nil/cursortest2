package yads;

import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public abstract class e03 implements oa0 {
    public final d03 a;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final sa0[] e;
    public final ua0[] f;
    public int g;
    public int h;
    public sa0 i;
    public x53 j;
    public boolean k;
    public boolean l;

    public e03(sa0[] sa0VarArr, ua0[] ua0VarArr) {
        this.e = sa0VarArr;
        this.g = sa0VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = c();
        }
        this.f = ua0VarArr;
        this.h = ua0VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = d();
        }
        d03 d03Var = new d03((j03) this);
        this.a = d03Var;
        d03Var.start();
    }

    @Override // yads.oa0
    public final Object a() {
        synchronized (this.b) {
            try {
                x53 x53Var = this.j;
                if (x53Var != null) {
                    throw x53Var;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (ua0) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract x53 a(sa0 sa0Var, ua0 ua0Var, boolean z);

    @Override // yads.oa0
    public final Object b() {
        sa0 sa0Var;
        synchronized (this.b) {
            try {
                x53 x53Var = this.j;
                if (x53Var != null) {
                    throw x53Var;
                }
                if (this.i != null) {
                    throw new IllegalStateException();
                }
                int i = this.g;
                if (i == 0) {
                    sa0Var = null;
                } else {
                    sa0[] sa0VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    sa0Var = sa0VarArr[i2];
                }
                this.i = sa0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sa0Var;
    }

    public abstract a63 c();

    public abstract i03 d();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        x53 x53Var;
        x53 x53Var2;
        synchronized (this.b) {
            while (!this.l && (this.c.isEmpty() || this.h <= 0)) {
                try {
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            sa0 sa0Var = (sa0) this.c.removeFirst();
            ua0[] ua0VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            ua0 ua0Var = ua0VarArr[i];
            boolean z = this.k;
            this.k = false;
            if (sa0Var.b(4)) {
                ua0Var.b = 4 | ua0Var.b;
            } else {
                if (sa0Var.b(Integer.MIN_VALUE)) {
                    ua0Var.b |= Integer.MIN_VALUE;
                }
                if (sa0Var.b(134217728)) {
                    ua0Var.b = 134217728 | ua0Var.b;
                }
                try {
                    x53Var2 = a(sa0Var, ua0Var, z);
                } catch (OutOfMemoryError e) {
                    x53Var = new x53("Unexpected decode error", e);
                    x53Var2 = x53Var;
                    if (x53Var2 != null) {
                    }
                    synchronized (this.b) {
                    }
                } catch (RuntimeException e2) {
                    x53Var = new x53("Unexpected decode error", e2);
                    x53Var2 = x53Var;
                    if (x53Var2 != null) {
                    }
                    synchronized (this.b) {
                    }
                }
                if (x53Var2 != null) {
                    synchronized (this.b) {
                        this.j = x53Var2;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        ua0Var.b();
                    } else if (ua0Var.b(Integer.MIN_VALUE)) {
                        ua0Var.b();
                    } else {
                        this.d.addLast(ua0Var);
                    }
                    sa0Var.b();
                    sa0[] sa0VarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    sa0VarArr[i2] = sa0Var;
                } finally {
                }
            }
            return true;
        }
    }

    public final void f() {
        if (this.c.isEmpty() || this.h <= 0) {
            return;
        }
        this.b.notify();
    }

    @Override // yads.oa0
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                sa0 sa0Var = this.i;
                if (sa0Var != null) {
                    sa0Var.b();
                    sa0[] sa0VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    sa0VarArr[i] = sa0Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    sa0 sa0Var2 = (sa0) this.c.removeFirst();
                    sa0Var2.b();
                    sa0[] sa0VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    sa0VarArr2[i2] = sa0Var2;
                }
                while (!this.d.isEmpty()) {
                    ((ua0) this.d.removeFirst()).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        int i = this.g;
        sa0[] sa0VarArr = this.e;
        if (i != sa0VarArr.length) {
            throw new IllegalStateException();
        }
        for (sa0 sa0Var : sa0VarArr) {
            sa0Var.c(1024);
        }
    }

    @Override // yads.oa0
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // yads.oa0
    public final void a(a63 a63Var) {
        synchronized (this.b) {
            try {
                x53 x53Var = this.j;
                if (x53Var == null) {
                    if (a63Var == this.i) {
                        this.c.addLast(a63Var);
                        if (!this.c.isEmpty() && this.h > 0) {
                            this.b.notify();
                        }
                        this.i = null;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw x53Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
