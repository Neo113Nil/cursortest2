package defpackage;

import androidx.compose.runtime.snapshots.a;

/* loaded from: classes.dex */
public abstract class i2t0 {
    public a a;
    public long b;
    public boolean c;
    public int d;

    public i2t0(long j, a aVar) {
        int i;
        int numberOfTrailingZeros;
        this.a = aVar;
        this.b = j;
        q2m0 q2m0Var = q2t0.a;
        if (j != 0) {
            a d = d();
            long j2 = d.c;
            long[] jArr = d.w;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.b;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.a;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (q2t0.c) {
                i = q2t0.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(i2t0 i2t0Var) {
        q2t0.b.b(i2t0Var);
    }

    public final void a() {
        synchronized (q2t0.c) {
            b();
            p();
        }
    }

    public void b() {
        q2t0.d = q2t0.d.b(g());
    }

    public abstract void c();

    public a d() {
        return this.a;
    }

    public abstract tls e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract tls i();

    public final i2t0 j() {
        p3t0 p3t0Var = q2t0.b;
        i2t0 i2t0Var = (i2t0) p3t0Var.a();
        p3t0Var.b(this);
        return i2t0Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(g5u0 g5u0Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            q2t0.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(a aVar) {
        this.a = aVar;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract i2t0 u(tls tlsVar);
}
