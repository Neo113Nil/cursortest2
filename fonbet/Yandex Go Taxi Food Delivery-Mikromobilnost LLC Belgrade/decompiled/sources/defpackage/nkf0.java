package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;

/* loaded from: classes10.dex */
public final class nkf0 implements pyy {
    public volatile boolean A;
    public long C;
    public g001 E;
    public boolean F;
    public final /* synthetic */ qkf0 G;
    public final Uri b;
    public final x7u0 c;
    public final kkf0 w;
    public final qkf0 x;
    public final cyd y;
    public final xde0 z = new xde0();
    public boolean B = true;
    public final long a = uwy.f.getAndIncrement();
    public npg D = a(0);

    public nkf0(qkf0 qkf0Var, Uri uri, kpg kpgVar, vu6 vu6Var, qkf0 qkf0Var2, cyd cydVar) {
        this.G = qkf0Var;
        this.b = uri;
        this.c = new x7u0(kpgVar);
        this.w = vu6Var;
        this.x = qkf0Var2;
        this.y = cydVar;
    }

    public final npg a(long j) {
        mpg mpgVar = new mpg();
        mpgVar.a = this.b;
        mpgVar.f = j;
        mpgVar.h = this.G.B;
        mpgVar.i = 6;
        mpgVar.e = qkf0.l0;
        return mpgVar.a();
    }

    @Override // defpackage.pyy
    public final void d() {
        this.A = true;
    }

    @Override // defpackage.pyy
    public final void load() {
        kpg kpgVar;
        b5p b5pVar;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.A) {
            try {
                long j = this.z.a;
                npg a = a(j);
                this.D = a;
                long open = this.c.open(a);
                if (this.A) {
                    if (i2 != 1 && ((vu6) this.w).a() != -1) {
                        this.z.a = ((vu6) this.w).a();
                    }
                    yri0.b(this.c);
                    return;
                }
                if (open != -1) {
                    open += j;
                    qkf0 qkf0Var = this.G;
                    qkf0Var.K.post(new lkf0(qkf0Var, 0));
                }
                long j2 = open;
                this.G.M = r5v.a(this.c.a.getResponseHeaders());
                x7u0 x7u0Var = this.c;
                r5v r5vVar = this.G.M;
                if (r5vVar == null || (i = r5vVar.y) == -1) {
                    kpgVar = x7u0Var;
                } else {
                    kpgVar = new p5v(x7u0Var, i, this);
                    g001 z = this.G.z(new pkf0(0, true));
                    this.E = z;
                    z.d(qkf0.m0);
                }
                ((vu6) this.w).b(kpgVar, this.b, this.c.a.getResponseHeaders(), j, j2, this.x);
                if (this.G.M != null && (b5pVar = ((vu6) this.w).b) != null && (b5pVar instanceof rb30)) {
                    ((rb30) b5pVar).r = true;
                }
                if (this.B) {
                    kkf0 kkf0Var = this.w;
                    long j3 = this.C;
                    b5p b5pVar2 = ((vu6) kkf0Var).b;
                    b5pVar2.getClass();
                    b5pVar2.a(j, j3);
                    this.B = false;
                }
                while (i2 == 0 && !this.A) {
                    try {
                        this.y.a();
                        kkf0 kkf0Var2 = this.w;
                        xde0 xde0Var = this.z;
                        vu6 vu6Var = (vu6) kkf0Var2;
                        b5p b5pVar3 = vu6Var.b;
                        b5pVar3.getClass();
                        kbh kbhVar = vu6Var.c;
                        kbhVar.getClass();
                        i2 = b5pVar3.g(kbhVar, xde0Var);
                        long a2 = ((vu6) this.w).a();
                        if (a2 > this.G.C + j) {
                            this.y.c();
                            qkf0 qkf0Var2 = this.G;
                            qkf0Var2.K.post(qkf0Var2.J);
                            j = a2;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (((vu6) this.w).a() != -1) {
                    this.z.a = ((vu6) this.w).a();
                }
                yri0.b(this.c);
            } catch (Throwable th) {
                if (i2 != 1 && ((vu6) this.w).a() != -1) {
                    this.z.a = ((vu6) this.w).a();
                }
                yri0.b(this.c);
                throw th;
            }
        }
    }
}
