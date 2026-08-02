package xsna;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public abstract class dak0 {
    public kak0 a;
    public long b;
    public boolean c;
    public int d;

    /* compiled from: Snapshot.kt */
    public static final class a {
        public static dak0 a() {
            return qak0.b.a();
        }

        public static dak0 b(dak0 dak0Var) {
            if (dak0Var instanceof mop0) {
                mop0 mop0Var = (mop0) dak0Var;
                if (mop0Var.E() == ey2.f()) {
                    mop0Var.F(null);
                    return dak0Var;
                }
            }
            if (dak0Var instanceof nop0) {
                nop0 nop0Var = (nop0) dak0Var;
                if (nop0Var.w() == ey2.f()) {
                    nop0Var.x(null);
                    return dak0Var;
                }
            }
            dak0 g = qak0.g(dak0Var, null, false);
            g.j();
            return g;
        }

        public static Object c(e1m e1mVar, gzs gzsVar) {
            dak0 mop0Var;
            dak0 a = qak0.b.a();
            if (a instanceof mop0) {
                mop0 mop0Var2 = (mop0) a;
                if (mop0Var2.E() == ey2.f()) {
                    izs<Object, s3q0> e = mop0Var2.e();
                    izs<Object, s3q0> i = mop0Var2.i();
                    try {
                        ((mop0) a).F(qak0.k(e1mVar, e, true));
                        ((mop0) a).G(i);
                        return gzsVar.invoke();
                    } finally {
                        mop0Var2.F(e);
                        mop0Var2.G(i);
                    }
                }
            }
            if (a == null || (a instanceof uh50)) {
                mop0Var = new mop0(a instanceof uh50 ? (uh50) a : null, e1mVar, null, true, false);
            } else {
                mop0Var = a.u(e1mVar);
            }
            try {
                dak0 j = mop0Var.j();
                try {
                    Object invoke = gzsVar.invoke();
                    dak0.q(j);
                    mop0Var.c();
                    return invoke;
                } catch (Throwable th) {
                    dak0.q(j);
                    throw th;
                }
            } catch (Throwable th2) {
                mop0Var.c();
                throw th2;
            }
        }

        public static void d(dak0 dak0Var, dak0 dak0Var2, izs izsVar) {
            if (dak0Var != dak0Var2) {
                dak0Var2.getClass();
                dak0.q(dak0Var);
                dak0Var2.c();
            } else if (dak0Var instanceof mop0) {
                ((mop0) dak0Var).F(izsVar);
            } else if (dak0Var instanceof nop0) {
                ((nop0) dak0Var).x(izsVar);
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + dak0Var).toString());
            }
        }
    }

    public dak0(long j, kak0 kak0Var) {
        int i;
        int numberOfTrailingZeros;
        this.a = kak0Var;
        this.b = j;
        lak0 lak0Var = qak0.a;
        if (j != 0) {
            kak0 d = d();
            long j2 = d.d;
            long[] jArr = d.e;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.c;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.b;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (qak0.c) {
                i = qak0.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(dak0 dak0Var) {
        qak0.b.b(dak0Var);
    }

    public final void a() {
        synchronized (qak0.c) {
            b();
            p();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public void b() {
        qak0.d = qak0.d.b(g());
    }

    public void c() {
        this.c = true;
        synchronized (qak0.c) {
            o();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public kak0 d() {
        return this.a;
    }

    public abstract izs<Object, s3q0> e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract izs<Object, s3q0> i();

    public final dak0 j() {
        jbk0<dak0> jbk0Var = qak0.b;
        dak0 a2 = jbk0Var.a();
        jbk0Var.b(this);
        return a2;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(muk0 muk0Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            qak0.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(kak0 kak0Var) {
        this.a = kak0Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract dak0 u(izs<Object, s3q0> izsVar);
}
