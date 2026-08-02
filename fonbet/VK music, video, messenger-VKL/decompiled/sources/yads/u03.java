package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class u03 extends jo {
    public final int o;
    public final nx0 p;
    public long q;
    public boolean r;

    public u03(p30 p30Var, u30 u30Var, nx0 nx0Var, int i, Object obj, long j, long j2, long j3, int i2, nx0 nx0Var2) {
        super(p30Var, u30Var, nx0Var, i, obj, j, j2, C.TIME_UNSET, C.TIME_UNSET, j3);
        this.o = i2;
        this.p = nx0Var2;
    }

    @Override // yads.ch1
    public final void a() {
        q83 bl0Var;
        lo loVar = this.m;
        if (loVar == null) {
            throw new IllegalStateException();
        }
        for (nt2 nt2Var : loVar.b) {
            if (nt2Var.E != 0) {
                nt2Var.E = 0L;
                nt2Var.z = true;
            }
        }
        int i = this.o;
        int i2 = 0;
        while (true) {
            int[] iArr = loVar.a;
            if (i2 >= iArr.length) {
                ji1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                bl0Var = new bl0();
                break;
            }
            if (i == iArr[i2]) {
                bl0Var = loVar.b[i2];
                break;
            }
            i2++;
        }
        q83 q83Var = bl0Var;
        q83Var.a(this.p);
        try {
            u30 u30Var = this.b;
            long j = this.q;
            long j2 = u30Var.g;
            long a = this.i.a(u30Var.a(j, j2 == -1 ? -1L : j2 - j));
            if (a != -1) {
                a += this.q;
            }
            ld0 ld0Var = new ld0(this.i, this.q, a);
            for (int i3 = 0; i3 != -1; i3 = q83Var.a(ld0Var, Integer.MAX_VALUE, true)) {
                this.q += i3;
            }
            q83Var.a(this.g, 1, (int) this.q, 0, null);
            s30.a(this.i);
            this.r = true;
        } catch (Throwable th) {
            s30.a(this.i);
            throw th;
        }
    }

    @Override // yads.jo
    public final boolean d() {
        return this.r;
    }

    @Override // yads.ch1
    public final void b() {
    }
}
