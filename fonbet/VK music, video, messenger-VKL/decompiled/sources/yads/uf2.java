package yads;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class uf2 implements q83 {
    public final nt2 a;
    public final ox0 b = new ox0();
    public final xt1 c = new xt1();
    public long d = C.TIME_UNSET;
    public final /* synthetic */ vf2 e;

    public uf2(vf2 vf2Var, qe qeVar) {
        this.e = vf2Var;
        this.a = nt2.a(qeVar);
    }

    @Override // yads.q83
    public final void a(nx0 nx0Var) {
        this.a.a(nx0Var);
    }

    @Override // yads.q83
    public final int a(l30 l30Var, int i, boolean z) {
        return this.a.b(l30Var, i, z);
    }

    @Override // yads.q83
    public final void a(int i, kc2 kc2Var) {
        this.a.b(i, kc2Var);
    }

    @Override // yads.q83
    public final void a(long j, int i, int i2, int i3, p83 p83Var) {
        long a;
        xt1 xt1Var;
        long j2;
        this.a.a(j, i, i2, i3, p83Var);
        while (this.a.a(false)) {
            this.c.b();
            if (this.a.a(this.b, (sa0) this.c, 0, false) == -4) {
                this.c.c();
                xt1Var = this.c;
            } else {
                xt1Var = null;
            }
            if (xt1Var != null) {
                long j3 = xt1Var.f;
                ut1 a2 = this.e.d.a(xt1Var);
                if (a2 != null) {
                    xm0 xm0Var = (xm0) a2.b[0];
                    String str = xm0Var.b;
                    String str2 = xm0Var.c;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = mc3.f(mc3.a(xm0Var.f));
                        } catch (pc2 unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != C.TIME_UNSET) {
                            sf2 sf2Var = new sf2(j3, j2);
                            Handler handler = this.e.e;
                            handler.sendMessage(handler.obtainMessage(1, sf2Var));
                        }
                    }
                }
            }
        }
        nt2 nt2Var = this.a;
        jt2 jt2Var = nt2Var.a;
        synchronized (nt2Var) {
            int i4 = nt2Var.s;
            a = i4 == 0 ? -1L : nt2Var.a(i4);
        }
        jt2Var.a(a);
    }
}
