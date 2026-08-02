package xsna;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import xsna.kr10;

/* compiled from: DefaultLivePlaybackSpeedControl.java */
/* loaded from: classes12.dex */
public final class shl implements hkz {
    public final long a;
    public final long b;
    public long c = C.TIME_UNSET;
    public long d = C.TIME_UNSET;
    public long f = C.TIME_UNSET;
    public long g = C.TIME_UNSET;
    public float j = 0.97f;
    public float i = 1.03f;
    public float k = 1.0f;
    public long l = C.TIME_UNSET;
    public long e = C.TIME_UNSET;
    public long h = C.TIME_UNSET;
    public long m = C.TIME_UNSET;
    public long n = C.TIME_UNSET;

    public shl(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // xsna.hkz
    public final void a(kr10.e eVar) {
        this.c = y2r0.S(eVar.a);
        this.f = y2r0.S(eVar.b);
        this.g = y2r0.S(eVar.c);
        float f = eVar.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        this.j = f;
        float f2 = eVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        this.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.c = C.TIME_UNSET;
        }
        f();
    }

    @Override // xsna.hkz
    public final float b(long j, long j2) {
        if (this.c == C.TIME_UNSET) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.m;
        if (j4 == C.TIME_UNSET) {
            this.m = j3;
            this.n = 0L;
        } else {
            this.m = Math.max(j3, (long) ((j3 * 9.999871E-4f) + (j4 * 0.999f)));
            this.n = (long) ((9.999871E-4f * Math.abs(j3 - r10)) + (0.999f * this.n));
        }
        if (this.l != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.l < 1000) {
            return this.k;
        }
        this.l = SystemClock.elapsedRealtime();
        long j5 = (this.n * 3) + this.m;
        if (this.h > j5) {
            float S = y2r0.S(1000L);
            long[] jArr = {j5, this.e, this.h - (((long) ((this.k - 1.0f) * S)) + ((long) ((this.i - 1.0f) * S)))};
            long j6 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j6) {
                    j6 = j7;
                }
            }
            this.h = j6;
        } else {
            long k = y2r0.k(j - ((long) (Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.k - 1.0f) / 1.0E-7f)), this.h, j5);
            this.h = k;
            long j8 = this.g;
            if (j8 != C.TIME_UNSET && k > j8) {
                this.h = j8;
            }
        }
        long j9 = j - this.h;
        if (Math.abs(j9) < this.a) {
            this.k = 1.0f;
        } else {
            this.k = y2r0.i((1.0E-7f * j9) + 1.0f, this.j, this.i);
        }
        return this.k;
    }

    @Override // xsna.hkz
    public final long c() {
        return this.h;
    }

    @Override // xsna.hkz
    public final void d() {
        long j = this.h;
        if (j == C.TIME_UNSET) {
            return;
        }
        long j2 = j + this.b;
        this.h = j2;
        long j3 = this.g;
        if (j3 != C.TIME_UNSET && j2 > j3) {
            this.h = j3;
        }
        this.l = C.TIME_UNSET;
    }

    @Override // xsna.hkz
    public final void e(long j) {
        this.d = j;
        f();
    }

    public final void f() {
        long j;
        long j2 = this.c;
        if (j2 != C.TIME_UNSET) {
            j = this.d;
            if (j == C.TIME_UNSET) {
                long j3 = this.f;
                if (j3 != C.TIME_UNSET && j2 < j3) {
                    j2 = j3;
                }
                j = this.g;
                if (j == C.TIME_UNSET || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.e == j) {
            return;
        }
        this.e = j;
        this.h = j;
        this.m = C.TIME_UNSET;
        this.n = C.TIME_UNSET;
        this.l = C.TIME_UNSET;
    }
}
