package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class ue1 implements vl0 {
    public final String a;
    public final kc2 b;
    public final jc2 c;
    public q83 d;
    public String e;
    public nx0 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public ue1(String str) {
        this.a = str;
        kc2 kc2Var = new kc2(1024);
        this.b = kc2Var;
        this.c = new jc2(kc2Var.a());
        this.k = C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0180, code lost:
    
        throw new yads.pc2(null, null, true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x018f, code lost:
    
        if (r17.l == false) goto L89;
     */
    @Override // yads.vl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kc2 kc2Var) {
        int i;
        boolean e;
        if (this.d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i2 = kc2Var.c - kc2Var.b;
            if (i2 <= 0) {
                return;
            }
            int i3 = this.g;
            if (i3 != 0) {
                if (i3 == 1) {
                    int m = kc2Var.m();
                    if ((m & 224) == 224) {
                        this.j = m;
                        this.g = 2;
                    } else if (m != 86) {
                        this.g = 0;
                    }
                } else if (i3 == 2) {
                    int m2 = ((this.j & (-225)) << 8) | kc2Var.m();
                    this.i = m2;
                    kc2 kc2Var2 = this.b;
                    if (m2 > kc2Var2.a.length) {
                        kc2Var2.c(m2);
                        jc2 jc2Var = this.c;
                        byte[] bArr = this.b.a;
                        jc2Var.getClass();
                        jc2Var.a(bArr.length, bArr);
                    }
                    this.h = 0;
                    this.g = 3;
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(i2, this.i - this.h);
                    kc2Var.a(this.c.a, this.h, min);
                    int i4 = this.h + min;
                    this.h = i4;
                    if (i4 == this.i) {
                        this.c.b(0);
                        jc2 jc2Var2 = this.c;
                        if (!jc2Var2.e()) {
                            this.l = true;
                            int a = jc2Var2.a(1);
                            int a2 = a == 1 ? jc2Var2.a(1) : 0;
                            this.m = a2;
                            if (a2 != 0) {
                                throw new pc2(null, null, true, 1);
                            }
                            if (a == 1) {
                                jc2Var2.a((jc2Var2.a(2) + 1) * 8);
                            }
                            if (!jc2Var2.e()) {
                                throw new pc2(null, null, true, 1);
                            }
                            this.n = jc2Var2.a(6);
                            int a3 = jc2Var2.a(4);
                            int a4 = jc2Var2.a(3);
                            if (a3 != 0 || a4 != 0) {
                                break;
                            }
                            if (a == 0) {
                                int d = jc2Var2.d();
                                int b = jc2Var2.b();
                                a a5 = b.a(jc2Var2, true);
                                this.u = a5.c;
                                this.r = a5.a;
                                this.t = a5.b;
                                int b2 = b - jc2Var2.b();
                                jc2Var2.b(d);
                                byte[] bArr2 = new byte[(b2 + 7) / 8];
                                jc2Var2.a(bArr2, b2);
                                mx0 mx0Var = new mx0();
                                mx0Var.a = this.e;
                                mx0Var.k = "audio/mp4a-latm";
                                mx0Var.h = this.u;
                                mx0Var.x = this.t;
                                mx0Var.y = this.r;
                                mx0Var.m = Collections.singletonList(bArr2);
                                mx0Var.c = this.a;
                                nx0 nx0Var = new nx0(mx0Var);
                                if (!nx0Var.equals(this.f)) {
                                    this.f = nx0Var;
                                    this.s = 1024000000 / nx0Var.A;
                                    this.d.a(nx0Var);
                                }
                            } else {
                                int b3 = jc2Var2.b();
                                a a6 = b.a(jc2Var2, true);
                                this.u = a6.c;
                                this.r = a6.a;
                                this.t = a6.b;
                                jc2Var2.c(jc2Var2.a((jc2Var2.a(2) + 1) * 8) - (b3 - jc2Var2.b()));
                            }
                            int a7 = jc2Var2.a(3);
                            this.o = a7;
                            if (a7 == 0) {
                                jc2Var2.c(8);
                            } else if (a7 == 1) {
                                jc2Var2.c(9);
                            } else if (a7 == 3 || a7 == 4 || a7 == 5) {
                                jc2Var2.c(6);
                            } else {
                                if (a7 != 6 && a7 != 7) {
                                    throw new IllegalStateException();
                                }
                                jc2Var2.c(1);
                            }
                            boolean e2 = jc2Var2.e();
                            this.p = e2;
                            this.q = 0L;
                            if (e2) {
                                if (a == 1) {
                                    this.q = jc2Var2.a((jc2Var2.a(2) + 1) * 8);
                                } else {
                                    do {
                                        e = jc2Var2.e();
                                        this.q = (this.q << 8) + jc2Var2.a(8);
                                    } while (e);
                                }
                            }
                            if (jc2Var2.e()) {
                                jc2Var2.c(8);
                            }
                        }
                        if (this.m != 0) {
                            throw new pc2(null, null, true, 1);
                        }
                        if (this.n != 0) {
                            throw new pc2(null, null, true, 1);
                        }
                        if (this.o != 0) {
                            throw new pc2(null, null, true, 1);
                        }
                        int i5 = 0;
                        while (true) {
                            int a8 = jc2Var2.a(8);
                            i = i5 + a8;
                            if (a8 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int d2 = jc2Var2.d();
                        if ((d2 & 7) == 0) {
                            this.b.e(d2 >> 3);
                        } else {
                            jc2Var2.a(this.b.a, i * 8);
                            this.b.e(0);
                        }
                        this.d.a(i, this.b);
                        long j = this.k;
                        if (j != C.TIME_UNSET) {
                            this.d.a(j, 1, i, 0, null);
                            this.k += this.s;
                        }
                        if (this.p) {
                            jc2Var2.c((int) this.q);
                        }
                        this.g = 0;
                    } else {
                        continue;
                    }
                }
            } else if (kc2Var.m() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, pa3 pa3Var) {
        pa3Var.a();
        pa3Var.b();
        this.d = qq0Var.a(pa3Var.d, 1);
        pa3Var.b();
        this.e = pa3Var.e;
    }

    @Override // yads.vl0
    public final void a(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.k = j;
        }
    }

    @Override // yads.vl0
    public final void a() {
        this.g = 0;
        this.k = C.TIME_UNSET;
        this.l = false;
    }
}
