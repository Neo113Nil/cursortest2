package yads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Map;

/* loaded from: classes10.dex */
public final class al2 implements ch1, n21 {
    public final Uri a;
    public final v43 b;
    public final cr c;
    public final qq0 d;
    public final vy e;
    public volatile boolean g;
    public long i;
    public u30 j;
    public nt2 k;
    public boolean l;
    public final /* synthetic */ fl2 m;
    public final hh2 f = new hh2();
    public boolean h = true;

    public al2(fl2 fl2Var, Uri uri, p30 p30Var, cr crVar, qq0 qq0Var, vy vyVar) {
        this.m = fl2Var;
        this.a = uri;
        this.b = new v43(p30Var);
        this.c = crVar;
        this.d = qq0Var;
        this.e = vyVar;
        wg1.a();
        this.j = a(0L);
    }

    public final u30 a(long j) {
        Uri uri = this.a;
        String str = this.m.j;
        Map map = fl2.N;
        ni.a(uri, "The uri must be set.");
        return new u30(uri, 0L, 1, null, map, j, -1L, str, 6, null);
    }

    @Override // yads.ch1
    public final void b() {
        this.g = true;
    }

    @Override // yads.ch1
    public final void a() {
        p30 p30Var;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.g) {
            try {
                long j = this.f.a;
                u30 a = a(j);
                this.j = a;
                long a2 = this.b.a(a);
                if (a2 != -1) {
                    a2 += j;
                    this.m.h();
                }
                long j2 = a2;
                this.m.s = r21.a(this.b.a.getResponseHeaders());
                v43 v43Var = this.b;
                r21 r21Var = this.m.s;
                if (r21Var == null || (i = r21Var.g) == -1) {
                    p30Var = v43Var;
                } else {
                    p30Var = new o21(v43Var, i, this);
                    fl2 fl2Var = this.m;
                    fl2Var.getClass();
                    nt2 a3 = fl2Var.a(new dl2(true, 0));
                    this.k = a3;
                    a3.a(fl2.O);
                }
                this.c.a(p30Var, this.a, this.b.a.getResponseHeaders(), j, j2, this.d);
                if (this.m.s != null) {
                    nq0 nq0Var = this.c.b;
                    if (nq0Var instanceof jw1) {
                        ((jw1) nq0Var).q = true;
                    }
                }
                if (this.h) {
                    cr crVar = this.c;
                    long j3 = this.i;
                    nq0 nq0Var2 = crVar.b;
                    nq0Var2.getClass();
                    nq0Var2.seek(j, j3);
                    this.h = false;
                }
                while (i2 == 0 && !this.g) {
                    try {
                        this.e.a();
                        cr crVar2 = this.c;
                        hh2 hh2Var = this.f;
                        nq0 nq0Var3 = crVar2.b;
                        nq0Var3.getClass();
                        ld0 ld0Var = crVar2.c;
                        ld0Var.getClass();
                        i2 = nq0Var3.a(ld0Var, hh2Var);
                        ld0 ld0Var2 = this.c.c;
                        long j4 = ld0Var2 != null ? ld0Var2.d : -1L;
                        if (j4 > this.m.k + j) {
                            vy vyVar = this.e;
                            synchronized (vyVar) {
                                vyVar.a = false;
                            }
                            fl2 fl2Var2 = this.m;
                            fl2Var2.q.post(fl2Var2.p);
                            j = j4;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else {
                    ld0 ld0Var3 = this.c.c;
                    if ((ld0Var3 != null ? ld0Var3.d : -1L) != -1) {
                        this.f.a = ld0Var3 != null ? ld0Var3.d : -1L;
                    }
                }
                s30.a(this.b);
            } catch (Throwable th) {
                if (i2 != 1) {
                    ld0 ld0Var4 = this.c.c;
                    if ((ld0Var4 != null ? ld0Var4.d : -1L) != -1) {
                        this.f.a = ld0Var4 != null ? ld0Var4.d : -1L;
                    }
                }
                s30.a(this.b);
                throw th;
            }
        }
    }
}
