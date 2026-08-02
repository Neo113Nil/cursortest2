package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class an0 implements ot2 {
    public final nx0 b;
    public long[] d;
    public boolean e;
    public bn0 f;
    public boolean g;
    public int h;
    public final zm0 c = new zm0();
    public long i = C.TIME_UNSET;

    public an0(bn0 bn0Var, nx0 nx0Var, boolean z) {
        this.b = nx0Var;
        this.f = bn0Var;
        this.d = bn0Var.b;
        a(bn0Var, z);
    }

    @Override // yads.ot2
    public final void a() {
    }

    @Override // yads.ot2
    public final boolean isReady() {
        return true;
    }

    @Override // yads.ot2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        int i2 = this.h;
        boolean z = i2 == this.d.length;
        if (z && !this.e) {
            sa0Var.b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.g) {
            ox0Var.b = this.b;
            this.g = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.h = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] a = this.c.a(this.f.a[i2]);
            sa0Var.c(a.length);
            sa0Var.d.put(a);
        }
        sa0Var.f = this.d[i2];
        sa0Var.b = 1;
        return -4;
    }

    @Override // yads.ot2
    public final int a(long j) {
        int max = Math.max(this.h, mc3.a(this.d, j, true));
        int i = max - this.h;
        this.h = max;
        return i;
    }

    public final void a(bn0 bn0Var, boolean z) {
        int i = this.h;
        long j = C.TIME_UNSET;
        long j2 = i == 0 ? -9223372036854775807L : this.d[i - 1];
        this.e = z;
        this.f = bn0Var;
        long[] jArr = bn0Var.b;
        this.d = jArr;
        long j3 = this.i;
        if (j3 == C.TIME_UNSET) {
            if (j2 != C.TIME_UNSET) {
                this.h = mc3.a(jArr, j2, false);
            }
        } else {
            int a = mc3.a(jArr, j3, true);
            this.h = a;
            if (this.e && a == this.d.length) {
                j = j3;
            }
            this.i = j;
        }
    }
}
