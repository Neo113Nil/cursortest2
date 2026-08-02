package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class yd0 implements sg1 {
    public final long a;
    public final long b;
    public final float c;
    public long d = C.TIME_UNSET;
    public long e = C.TIME_UNSET;
    public long g = C.TIME_UNSET;
    public long h = C.TIME_UNSET;
    public float k = 0.97f;
    public float j = 1.03f;
    public float l = 1.0f;
    public long m = C.TIME_UNSET;
    public long f = C.TIME_UNSET;
    public long i = C.TIME_UNSET;
    public long n = C.TIME_UNSET;
    public long o = C.TIME_UNSET;

    public yd0(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final void a() {
        long j = this.d;
        if (j != C.TIME_UNSET) {
            long j2 = this.e;
            if (j2 != C.TIME_UNSET) {
                j = j2;
            }
            long j3 = this.g;
            if (j3 != C.TIME_UNSET && j < j3) {
                j = j3;
            }
            long j4 = this.h;
            if (j4 != C.TIME_UNSET && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f == j) {
            return;
        }
        this.f = j;
        this.i = j;
        this.n = C.TIME_UNSET;
        this.o = C.TIME_UNSET;
        this.m = C.TIME_UNSET;
    }
}
