package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.n3i0;

/* compiled from: ConstantBitrateSeekMap.java */
/* loaded from: classes12.dex */
public class h5j implements n3i0 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;

    public h5j(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        this.h = z2;
        if (j == -1) {
            this.d = -1L;
            this.f = C.TIME_UNSET;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / i;
        }
    }

    @Override // xsna.n3i0
    public final boolean c() {
        return this.h;
    }

    @Override // xsna.n3i0
    public final long getDurationUs() {
        return this.f;
    }

    @Override // xsna.n3i0
    public final n3i0.a getSeekPoints(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            p3i0 p3i0Var = new p3i0(0L, j3);
            return new n3i0.a(p3i0Var, p3i0Var);
        }
        int i = this.e;
        long j4 = this.c;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = (Math.max(0L, max - j3) * 8000000) / i;
        p3i0 p3i0Var2 = new p3i0(max2, max);
        if (j2 != -1 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.a) {
                return new n3i0.a(p3i0Var2, new p3i0((Math.max(0L, j6 - j3) * 8000000) / i, j6));
            }
        }
        return new n3i0.a(p3i0Var2, p3i0Var2);
    }

    @Override // xsna.n3i0
    public final boolean isSeekable() {
        return this.d != -1 || this.g;
    }
}
