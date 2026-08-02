package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class vc2 implements vx2 {
    public nx0 a;
    public c83 b;
    public q83 c;

    public vc2(String str) {
        this.a = new mx0().d(str).a();
    }

    @Override // yads.vx2
    public final void a(kc2 kc2Var) {
        long a;
        c83 c83Var = this.b;
        if (c83Var == null) {
            throw new IllegalStateException();
        }
        int i = mc3.a;
        synchronized (c83Var) {
            try {
                long j = c83Var.c;
                a = j != C.TIME_UNSET ? j + c83Var.b : c83Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        long b = this.b.b();
        if (a == C.TIME_UNSET || b == C.TIME_UNSET) {
            return;
        }
        nx0 nx0Var = this.a;
        if (b != nx0Var.q) {
            mx0 mx0Var = new mx0(nx0Var);
            mx0Var.o = b;
            nx0 nx0Var2 = new nx0(mx0Var);
            this.a = nx0Var2;
            this.c.a(nx0Var2);
        }
        int i2 = kc2Var.c - kc2Var.b;
        this.c.a(i2, kc2Var);
        this.c.a(a, 1, i2, 0, null);
    }

    @Override // yads.vx2
    public final void a(c83 c83Var, qq0 qq0Var, pa3 pa3Var) {
        this.b = c83Var;
        pa3Var.a();
        pa3Var.b();
        q83 a = qq0Var.a(pa3Var.d, 5);
        this.c = a;
        a.a(this.a);
    }
}
