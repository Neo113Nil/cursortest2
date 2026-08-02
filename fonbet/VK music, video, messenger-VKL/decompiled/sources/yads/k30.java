package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class k30 implements i30 {
    public final hu a;
    public final long b;

    public k30(hu huVar, long j) {
        this.a = huVar;
        this.b = j;
    }

    @Override // yads.i30
    public final boolean a() {
        return true;
    }

    @Override // yads.i30
    public final long b() {
        return 0L;
    }

    @Override // yads.i30
    public final long c(long j, long j2) {
        return 0L;
    }

    @Override // yads.i30
    public final long d(long j, long j2) {
        return C.TIME_UNSET;
    }

    @Override // yads.i30
    public final long e(long j, long j2) {
        return this.a.a;
    }

    @Override // yads.i30
    public final long a(long j, long j2) {
        hu huVar = this.a;
        return mc3.b(huVar.e, j + this.b, true);
    }

    @Override // yads.i30
    public final long b(long j, long j2) {
        return this.a.d[(int) j];
    }

    @Override // yads.i30
    public final long c(long j) {
        return this.a.a;
    }

    @Override // yads.i30
    public final qm2 b(long j) {
        return new qm2(null, this.a.c[(int) j], r1.b[r7]);
    }

    @Override // yads.i30
    public final long a(long j) {
        return this.a.e[(int) j] - this.b;
    }
}
