package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes10.dex */
public final class z21 implements vl0 {
    public q83 b;
    public boolean c;
    public int e;
    public int f;
    public final kc2 a = new kc2(10);
    public long d = C.TIME_UNSET;

    @Override // yads.vl0
    public final void a(kc2 kc2Var) {
        if (this.b == null) {
            throw new IllegalStateException();
        }
        if (this.c) {
            int i = kc2Var.c - kc2Var.b;
            int i2 = this.f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                System.arraycopy(kc2Var.a, kc2Var.b, this.a.a, this.f, min);
                if (this.f + min == 10) {
                    this.a.e(0);
                    if (73 != this.a.m() || 68 != this.a.m() || 51 != this.a.m()) {
                        ji1.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        kc2 kc2Var2 = this.a;
                        kc2Var2.e(kc2Var2.b + 3);
                        this.e = this.a.l() + 10;
                    }
                }
            }
            int min2 = Math.min(i, this.e - this.f);
            this.b.a(min2, kc2Var);
            this.f += min2;
        }
    }

    @Override // yads.vl0
    public final void b() {
        int i;
        q83 q83Var = this.b;
        if (q83Var == null) {
            throw new IllegalStateException();
        }
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != C.TIME_UNSET) {
                q83Var.a(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, pa3 pa3Var) {
        pa3Var.a();
        pa3Var.b();
        q83 a = qq0Var.a(pa3Var.d, 5);
        this.b = a;
        mx0 mx0Var = new mx0();
        pa3Var.b();
        mx0Var.a = pa3Var.e;
        mx0Var.k = MimeTypes.APPLICATION_ID3;
        a.a(new nx0(mx0Var));
    }

    @Override // yads.vl0
    public final void a(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != C.TIME_UNSET) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override // yads.vl0
    public final void a() {
        this.c = false;
        this.d = C.TIME_UNSET;
    }
}
