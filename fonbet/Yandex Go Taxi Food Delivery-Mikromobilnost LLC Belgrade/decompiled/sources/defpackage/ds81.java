package defpackage;

import android.os.Handler;
import yads.aa2;
import yads.cs1;
import yads.nm0;
import yads.yc2;

/* loaded from: classes7.dex */
public final class ds81 implements fb81 {
    public final ed81 a;
    public final og81 b = new og81();
    public final u471 c = new u471();
    public long d = -9223372036854775807L;
    public final /* synthetic */ yc2 e;

    public ds81(yc2 yc2Var, xi71 xi71Var) {
        this.e = yc2Var;
        this.a = new ed81(xi71Var, null, null);
    }

    @Override // defpackage.fb81
    public final void a(int i, dl81 dl81Var) {
        this.a.a(i, dl81Var);
    }

    @Override // defpackage.fb81
    public final void b(long j, int i, int i2, int i3, v781 v781Var) {
        long f;
        u471 u471Var;
        long j2;
        this.a.b(j, i, i2, i3, v781Var);
        while (this.a.j(false)) {
            this.c.e();
            if (this.a.e(this.b, this.c, 0, false) == -4) {
                this.c.f();
                u471Var = this.c;
            } else {
                u471Var = null;
            }
            if (u471Var != null) {
                long j3 = u471Var.x;
                cs1 a = this.e.d.a(u471Var);
                if (a != null) {
                    nm0 nm0Var = (nm0) a.b[0];
                    String str = nm0Var.b;
                    String str2 = nm0Var.c;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = rf71.B(new String(nm0Var.f, md81.c));
                        } catch (aa2 unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != -9223372036854775807L) {
                            uo81 uo81Var = new uo81(j3, j2);
                            Handler handler = this.e.e;
                            handler.sendMessage(handler.obtainMessage(1, uo81Var));
                        }
                    }
                }
            }
        }
        ed81 ed81Var = this.a;
        f381 f381Var = ed81Var.a;
        synchronized (ed81Var) {
            int i4 = ed81Var.r;
            f = i4 == 0 ? -1L : ed81Var.f(i4);
        }
        f381Var.d(f);
    }

    @Override // defpackage.fb81
    public final int c(jz61 jz61Var, int i, boolean z) {
        return this.a.c(jz61Var, i, z);
    }

    @Override // defpackage.fb81
    public final void k(qd81 qd81Var) {
        this.a.k(qd81Var);
    }
}
