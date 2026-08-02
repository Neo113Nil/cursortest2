package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: DashWrappingSegmentIndex.java */
/* loaded from: classes12.dex */
public final class htk implements btk {
    public final fcc b;
    public final long c;

    public htk(fcc fccVar, long j) {
        this.b = fccVar;
        this.c = j;
    }

    @Override // xsna.btk
    public final long a(long j, long j2) {
        return this.b.d[(int) j];
    }

    @Override // xsna.btk
    public final long b(long j, long j2) {
        return C.TIME_UNSET;
    }

    @Override // xsna.btk
    public final boolean d() {
        return true;
    }

    @Override // xsna.btk
    public final long f(long j, long j2) {
        return 0L;
    }

    @Override // xsna.btk
    public final long getTimeUs(long j) {
        return this.b.e[(int) j] - this.c;
    }

    @Override // xsna.btk
    public final long h(long j, long j2) {
        return y2r0.f(this.b.e, j + this.c, true);
    }

    @Override // xsna.btk
    public final long i(long j) {
        return this.b.a;
    }

    @Override // xsna.btk
    public final long k() {
        return 0L;
    }

    @Override // xsna.btk
    public final rwe0 l(long j) {
        return new rwe0(null, this.b.c[(int) j], r1.b[r7]);
    }

    @Override // xsna.btk
    public final long n(long j, long j2) {
        return this.b.a;
    }
}
