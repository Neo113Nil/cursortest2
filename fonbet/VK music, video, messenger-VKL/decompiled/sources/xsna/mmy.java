package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import xsna.l0;
import xsna.tsp0;

/* compiled from: LatmReader.java */
/* loaded from: classes12.dex */
public final class mmy implements zap {

    @Nullable
    public final String a;
    public final int b;
    public final xi90 c;
    public final wi90 d;
    public rgp0 e;
    public String f;
    public androidx.media3.common.a g;
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

    @Nullable
    public String v;

    public mmy(@Nullable String str, int i) {
        this.a = str;
        this.b = i;
        xi90 xi90Var = new xi90(1024);
        this.c = xi90Var;
        byte[] bArr = xi90Var.a;
        this.d = new wi90(bArr, bArr.length);
        this.l = C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019e, code lost:
    
        if (r23.m == false) goto L89;
     */
    @Override // xsna.zap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xi90 xi90Var) throws ParserException {
        int g;
        boolean f;
        this.e.getClass();
        while (xi90Var.a() > 0) {
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    xi90 xi90Var2 = this.c;
                    wi90 wi90Var = this.d;
                    if (i == 2) {
                        int C = ((this.k & (-225)) << 8) | xi90Var.C();
                        this.j = C;
                        if (C > xi90Var2.a.length) {
                            xi90Var2.M(C);
                            byte[] bArr = xi90Var2.a;
                            wi90Var.getClass();
                            wi90Var.l(bArr, bArr.length);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(xi90Var.a(), this.j - this.i);
                        xi90Var.n(wi90Var.b, this.i, min);
                        int i2 = this.i + min;
                        this.i = i2;
                        if (i2 == this.j) {
                            wi90Var.m(0);
                            if (!wi90Var.f()) {
                                this.m = true;
                                int g2 = wi90Var.g(1);
                                int g3 = g2 == 1 ? wi90Var.g(1) : 0;
                                this.n = g3;
                                if (g3 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (g2 == 1) {
                                    wi90Var.g((wi90Var.g(2) + 1) * 8);
                                }
                                if (!wi90Var.f()) {
                                    throw ParserException.a(null, null);
                                }
                                this.o = wi90Var.g(6);
                                int g4 = wi90Var.g(4);
                                int g5 = wi90Var.g(3);
                                if (g4 != 0 || g5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (g2 == 0) {
                                    int e = wi90Var.e();
                                    int b = wi90Var.b();
                                    l0.a b2 = l0.b(wi90Var, true);
                                    this.v = b2.c;
                                    this.s = b2.a;
                                    this.u = b2.b;
                                    int b3 = b - wi90Var.b();
                                    wi90Var.m(e);
                                    byte[] bArr2 = new byte[(b3 + 7) / 8];
                                    wi90Var.h(b3, bArr2);
                                    a.C0043a c0043a = new a.C0043a();
                                    c0043a.a = this.f;
                                    c0043a.l = io20.q("video/mp2t");
                                    c0043a.m = io20.q("audio/mp4a-latm");
                                    c0043a.j = this.v;
                                    c0043a.E = this.u;
                                    c0043a.F = this.s;
                                    c0043a.p = Collections.singletonList(bArr2);
                                    c0043a.d = this.a;
                                    c0043a.f = this.b;
                                    androidx.media3.common.a aVar = new androidx.media3.common.a(c0043a);
                                    if (!aVar.equals(this.g)) {
                                        this.g = aVar;
                                        this.t = 1024000000 / aVar.G;
                                        this.e.c(aVar);
                                    }
                                } else {
                                    int b4 = wi90Var.b();
                                    l0.a b5 = l0.b(wi90Var, true);
                                    this.v = b5.c;
                                    this.s = b5.a;
                                    this.u = b5.b;
                                    wi90Var.o(wi90Var.g((wi90Var.g(2) + 1) * 8) - (b4 - wi90Var.b()));
                                }
                                int g6 = wi90Var.g(3);
                                this.p = g6;
                                if (g6 == 0) {
                                    wi90Var.o(8);
                                } else if (g6 == 1) {
                                    wi90Var.o(9);
                                } else if (g6 == 3 || g6 == 4 || g6 == 5) {
                                    wi90Var.o(6);
                                } else {
                                    if (g6 != 6 && g6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    wi90Var.o(1);
                                }
                                boolean f2 = wi90Var.f();
                                this.q = f2;
                                this.r = 0L;
                                if (f2) {
                                    if (g2 == 1) {
                                        this.r = wi90Var.g((wi90Var.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            f = wi90Var.f();
                                            this.r = (this.r << 8) + wi90Var.g(8);
                                        } while (f);
                                    }
                                }
                                if (wi90Var.f()) {
                                    wi90Var.o(8);
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
                            int i3 = 0;
                            do {
                                g = wi90Var.g(8);
                                i3 += g;
                            } while (g == 255);
                            int e2 = wi90Var.e();
                            if ((e2 & 7) == 0) {
                                xi90Var2.P(e2 >> 3);
                            } else {
                                wi90Var.h(i3 * 8, xi90Var2.a);
                                xi90Var2.P(0);
                            }
                            this.e.d(i3, xi90Var2);
                            fxc0.z(this.l != C.TIME_UNSET);
                            this.e.a(this.l, 1, i3, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                wi90Var.o((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int C2 = xi90Var.C();
                    if ((C2 & 224) == 224) {
                        this.k = C2;
                        this.h = 2;
                    } else if (C2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (xi90Var.C() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // xsna.zap
    public final void b(rgq rgqVar, tsp0.c cVar) {
        cVar.a();
        cVar.b();
        this.e = rgqVar.track(cVar.d, 1);
        cVar.b();
        this.f = cVar.e;
    }

    @Override // xsna.zap
    public final void c(int i, long j) {
        this.l = j;
    }

    @Override // xsna.zap
    public final void seek() {
        this.h = 0;
        this.l = C.TIME_UNSET;
        this.m = false;
    }

    @Override // xsna.zap
    public final void d(boolean z) {
    }
}
