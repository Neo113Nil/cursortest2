package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class iux implements tqn {
    public final String a;
    public final int b;
    public final ef90 c;
    public final df90 d;
    public g001 e;
    public String f;
    public a g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public iux(String str, int i) {
        this.a = str;
        this.b = i;
        ef90 ef90Var = new ef90(1024);
        this.c = ef90Var;
        byte[] bArr = ef90Var.a;
        this.d = new df90(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019c, code lost:
    
        if (r23.m == false) goto L89;
     */
    @Override // defpackage.tqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ef90 ef90Var) {
        int g;
        int i;
        boolean f;
        d6z.z(this.e);
        while (ef90Var.a() > 0) {
            int i2 = this.h;
            if (i2 != 0) {
                if (i2 != 1) {
                    ef90 ef90Var2 = this.c;
                    df90 df90Var = this.d;
                    if (i2 == 2) {
                        int y = ((this.k & (-225)) << 8) | ef90Var.y();
                        this.j = y;
                        if (y > ef90Var2.a.length) {
                            ef90Var2.H(y);
                            byte[] bArr = ef90Var2.a;
                            df90Var.getClass();
                            df90Var.k(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i2 != 3) {
                            ny61.k();
                            return;
                        }
                        int min = Math.min(ef90Var.a(), this.j - this.i);
                        ef90Var.i(this.i, min, df90Var.a);
                        int i3 = this.i + min;
                        this.i = i3;
                        if (i3 == this.j) {
                            df90Var.m(0);
                            if (!df90Var.f()) {
                                this.m = true;
                                int g2 = df90Var.g(1);
                                int g3 = g2 == 1 ? df90Var.g(1) : 0;
                                this.n = g3;
                                if (g3 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (g2 == 1) {
                                    df90Var.g((df90Var.g(2) + 1) * 8);
                                }
                                if (!df90Var.f()) {
                                    throw ParserException.a(null, null);
                                }
                                this.o = df90Var.g(6);
                                int g4 = df90Var.g(4);
                                int g5 = df90Var.g(3);
                                if (g4 != 0 || g5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (g2 == 0) {
                                    int e = df90Var.e();
                                    int b = df90Var.b();
                                    a4 o = pw21.o(df90Var, true);
                                    this.v = o.a;
                                    this.s = o.b;
                                    this.u = o.c;
                                    int b2 = b - df90Var.b();
                                    df90Var.m(e);
                                    byte[] bArr2 = new byte[(b2 + 7) / 8];
                                    df90Var.h(b2, bArr2);
                                    f7s f7sVar = new f7s();
                                    f7sVar.a = this.f;
                                    f7sVar.l = eh20.q("video/mp2t");
                                    f7sVar.m = eh20.q("audio/mp4a-latm");
                                    f7sVar.j = this.v;
                                    f7sVar.C = this.u;
                                    f7sVar.D = this.s;
                                    f7sVar.p = Collections.singletonList(bArr2);
                                    f7sVar.d = this.a;
                                    f7sVar.f = this.b;
                                    a aVar = new a(f7sVar);
                                    if (!aVar.equals(this.g)) {
                                        this.g = aVar;
                                        this.t = 1024000000 / aVar.E;
                                        this.e.d(aVar);
                                    }
                                } else {
                                    int b3 = df90Var.b();
                                    a4 o2 = pw21.o(df90Var, true);
                                    this.v = o2.a;
                                    this.s = o2.b;
                                    this.u = o2.c;
                                    df90Var.o(df90Var.g((df90Var.g(2) + 1) * 8) - (b3 - df90Var.b()));
                                }
                                int g6 = df90Var.g(3);
                                this.p = g6;
                                if (g6 == 0) {
                                    df90Var.o(8);
                                } else if (g6 == 1) {
                                    df90Var.o(9);
                                } else if (g6 == 3 || g6 == 4 || g6 == 5) {
                                    df90Var.o(6);
                                } else {
                                    if (g6 != 6 && g6 != 7) {
                                        ny61.k();
                                        return;
                                    }
                                    df90Var.o(1);
                                }
                                boolean f2 = df90Var.f();
                                this.q = f2;
                                this.r = 0L;
                                if (f2) {
                                    if (g2 == 1) {
                                        this.r = df90Var.g((df90Var.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            f = df90Var.f();
                                            this.r = (this.r << 8) + df90Var.g(8);
                                        } while (f);
                                    }
                                }
                                if (df90Var.f()) {
                                    df90Var.o(8);
                                }
                            }
                            if (this.n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i4 = 0;
                            do {
                                g = df90Var.g(8);
                                i4 += g;
                            } while (g == 255);
                            int e2 = df90Var.e();
                            if ((e2 & 7) == 0) {
                                ef90Var2.K(e2 >> 3);
                                i = 0;
                            } else {
                                df90Var.h(i4 * 8, ef90Var2.a);
                                i = 0;
                                ef90Var2.K(0);
                            }
                            this.e.a(ef90Var2, i4, i);
                            d6z.x(this.l != -9223372036854775807L);
                            this.e.c(this.l, 1, i4, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                df90Var.o((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int y2 = ef90Var.y();
                    if ((y2 & 224) == 224) {
                        this.k = y2;
                        this.h = 2;
                    } else if (y2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (ef90Var.y() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.tqn
    public final void d() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.tqn
    public final void e(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.tqn
    public final void g(boolean z) {
    }

    @Override // defpackage.tqn
    public final void h(d5p d5pVar, xi11 xi11Var) {
        xi11Var.c();
        xi11Var.d();
        this.e = d5pVar.B(xi11Var.d, 1);
        xi11Var.d();
        this.f = xi11Var.e;
    }
}
