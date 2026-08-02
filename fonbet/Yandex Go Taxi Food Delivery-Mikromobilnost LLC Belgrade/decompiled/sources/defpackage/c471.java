package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Map;
import yads.a11;

/* loaded from: classes7.dex */
public final class c471 implements zl61 {
    public final Uri a;
    public final bh81 b;
    public final vi71 c;
    public final ng71 d;
    public final sh71 e;
    public volatile boolean g;
    public long i;
    public no71 j;
    public ed81 k;
    public boolean l;
    public final /* synthetic */ ng71 m;
    public final jp61 f = new jp61();
    public boolean h = true;

    public c471(ng71 ng71Var, Uri uri, u871 u871Var, vi71 vi71Var, ng71 ng71Var2, sh71 sh71Var) {
        this.m = ng71Var;
        this.a = uri;
        this.b = new bh81(u871Var);
        this.c = vi71Var;
        this.d = ng71Var2;
        this.e = sh71Var;
        nl81.a.getAndIncrement();
        String str = ng71Var.B;
        Map map = ng71.h0;
        cha1.b(uri, "The uri must be set.");
        this.j = new no71(uri, 0L, null, map, 0L, -1L, str, 6);
    }

    @Override // defpackage.zl61
    public final void a() {
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.g) {
            try {
                long j = this.f.a;
                Uri uri = this.a;
                String str = this.m.B;
                Map map = ng71.h0;
                cha1.b(uri, "The uri must be set.");
                no71 no71Var = new no71(uri, 0L, null, map, j, -1L, str, 6);
                this.j = no71Var;
                long Q = this.b.Q(no71Var);
                if (Q != -1) {
                    Q += j;
                    ng71 ng71Var = this.m;
                    ng71Var.I.post(new mg71(ng71Var, 2));
                }
                this.m.K = a11.a(this.b.a.b());
                u871 u871Var = this.b;
                a11 a11Var = this.m.K;
                if (a11Var != null && (i = a11Var.g) != -1) {
                    u871 vq81Var = new vq81(u871Var, i, this);
                    ed81 c = this.m.c(new ha71(true, 0));
                    this.k = c;
                    c.k(ng71.i0);
                    u871Var = vq81Var;
                }
                this.c.i(u871Var, this.a, this.b.a.b(), j, Q, this.d);
                if (this.m.K != null) {
                    n771 n771Var = (n771) this.c.c;
                    if (n771Var instanceof qt71) {
                        ((qt71) n771Var).o = true;
                    }
                }
                if (this.h) {
                    vi71 vi71Var = this.c;
                    long j2 = this.i;
                    n771 n771Var2 = (n771) vi71Var.c;
                    n771Var2.getClass();
                    n771Var2.c(j, j2);
                    this.h = false;
                }
                long j3 = j;
                while (i2 == 0 && !this.g) {
                    try {
                        this.e.a();
                        vi71 vi71Var2 = this.c;
                        jp61 jp61Var = this.f;
                        n771 n771Var3 = (n771) vi71Var2.c;
                        n771Var3.getClass();
                        w971 w971Var = (w971) vi71Var2.w;
                        w971Var.getClass();
                        i2 = n771Var3.e(w971Var, jp61Var);
                        w971 w971Var2 = (w971) this.c.w;
                        long j4 = w971Var2 != null ? w971Var2.w : -1L;
                        if (j4 > this.m.C + j3) {
                            sh71 sh71Var = this.e;
                            synchronized (sh71Var) {
                                sh71Var.a = false;
                            }
                            ng71 ng71Var2 = this.m;
                            ng71Var2.I.post(ng71Var2.H);
                            j3 = j4;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else {
                    w971 w971Var3 = (w971) this.c.w;
                    if ((w971Var3 != null ? w971Var3.w : -1L) != -1) {
                        this.f.a = w971Var3 != null ? w971Var3.w : -1L;
                    }
                }
                xca1.c(this.b);
            } catch (Throwable th) {
                if (i2 != 1) {
                    w971 w971Var4 = (w971) this.c.w;
                    if ((w971Var4 != null ? w971Var4.w : -1L) != -1) {
                        this.f.a = w971Var4 != null ? w971Var4.w : -1L;
                    }
                }
                xca1.c(this.b);
                throw th;
            }
        }
    }

    @Override // defpackage.zl61
    public final void b() {
        this.g = true;
    }
}
