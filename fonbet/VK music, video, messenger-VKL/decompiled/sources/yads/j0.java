package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class j0 implements vl0 {
    public final jc2 a;
    public final kc2 b;
    public final String c;
    public String d;
    public q83 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public nx0 j;
    public int k;
    public long l;

    public j0() {
        this(null);
    }

    @Override // yads.vl0
    public final void a(kc2 kc2Var) {
        if (this.e == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i = kc2Var.c - kc2Var.b;
            if (i <= 0) {
                return;
            }
            int i2 = this.f;
            if (i2 == 0) {
                while (kc2Var.c - kc2Var.b > 0) {
                    if (this.h) {
                        int m = kc2Var.m();
                        this.h = m == 172;
                        if (m == 64 || m == 65) {
                            boolean z = m == 65;
                            this.f = 1;
                            byte[] bArr = this.b.a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z ? 65 : 64);
                            this.g = 2;
                        }
                    } else {
                        this.h = kc2Var.m() == 172;
                    }
                }
            } else if (i2 == 1) {
                byte[] bArr2 = this.b.a;
                int min = Math.min(i, 16 - this.g);
                kc2Var.a(bArr2, this.g, min);
                int i3 = this.g + min;
                this.g = i3;
                if (i3 == 16) {
                    this.a.b(0);
                    k0 a = l0.a(this.a);
                    nx0 nx0Var = this.j;
                    if (nx0Var == null || 2 != nx0Var.z || a.a != nx0Var.A || !"audio/ac4".equals(nx0Var.m)) {
                        mx0 mx0Var = new mx0();
                        mx0Var.a = this.d;
                        mx0Var.k = "audio/ac4";
                        mx0Var.x = 2;
                        mx0Var.y = a.a;
                        mx0Var.c = this.c;
                        nx0 nx0Var2 = new nx0(mx0Var);
                        this.j = nx0Var2;
                        this.e.a(nx0Var2);
                    }
                    this.k = a.b;
                    this.i = (a.c * 1000000) / this.j.A;
                    this.b.e(0);
                    this.e.a(16, this.b);
                    this.f = 2;
                }
            } else if (i2 == 2) {
                int min2 = Math.min(i, this.k - this.g);
                this.e.a(min2, kc2Var);
                int i4 = this.g + min2;
                this.g = i4;
                int i5 = this.k;
                if (i4 == i5) {
                    long j = this.l;
                    if (j != C.TIME_UNSET) {
                        this.e.a(j, 1, i5, 0, null);
                        this.l += this.i;
                    }
                    this.f = 0;
                }
            }
        }
    }

    public j0(String str) {
        byte[] bArr = new byte[16];
        this.a = new jc2(bArr);
        this.b = new kc2(bArr);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = C.TIME_UNSET;
        this.c = str;
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, pa3 pa3Var) {
        pa3Var.a();
        pa3Var.b();
        this.d = pa3Var.e;
        pa3Var.b();
        this.e = qq0Var.a(pa3Var.d, 1);
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.l = j;
        }
    }

    @Override // yads.vl0
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = C.TIME_UNSET;
    }
}
