package xsna;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import xsna.ewo0;

/* compiled from: PlaybackInfo.java */
/* loaded from: classes12.dex */
public final class fwa0 {
    public static final i.b u = new i.b(new Object());
    public final ewo0 a;
    public final i.b b;
    public final long c;
    public final long d;
    public final int e;

    @Nullable
    public final ExoPlaybackException f;
    public final boolean g;
    public final qfp0 h;
    public final ehp0 i;
    public final List<fi20> j;
    public final i.b k;
    public final boolean l;
    public final int m;
    public final int n;
    public final jwa0 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public fwa0(ewo0 ewo0Var, i.b bVar, long j, long j2, int i, @Nullable ExoPlaybackException exoPlaybackException, boolean z, qfp0 qfp0Var, ehp0 ehp0Var, List<fi20> list, i.b bVar2, boolean z2, int i2, int i3, jwa0 jwa0Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = ewo0Var;
        this.b = bVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = qfp0Var;
        this.i = ehp0Var;
        this.j = list;
        this.k = bVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = jwa0Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static fwa0 k(ehp0 ehp0Var) {
        ewo0.a aVar = ewo0.a;
        qfp0 qfp0Var = qfp0.d;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        jwa0 jwa0Var = jwa0.d;
        i.b bVar = u;
        return new fwa0(aVar, bVar, C.TIME_UNSET, 0L, 1, null, false, qfp0Var, ehp0Var, gVar, bVar, false, 1, 0, jwa0Var, 0L, 0L, 0L, 0L, false);
    }

    @CheckResult
    public final fwa0 a() {
        return new fwa0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    @CheckResult
    public final fwa0 b(boolean z) {
        return new fwa0(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    @CheckResult
    public final fwa0 c(i.b bVar) {
        return new fwa0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, bVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    @CheckResult
    public final fwa0 d(i.b bVar, long j, long j2, long j3, long j4, qfp0 qfp0Var, ehp0 ehp0Var, List<fi20> list) {
        return new fwa0(this.a, bVar, j2, j3, this.e, this.f, this.g, qfp0Var, ehp0Var, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    @CheckResult
    public final fwa0 e(int i, int i2, boolean z) {
        return new fwa0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    @CheckResult
    public final fwa0 f(@Nullable ExoPlaybackException exoPlaybackException) {
        return new fwa0(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    @CheckResult
    public final fwa0 g(jwa0 jwa0Var) {
        return new fwa0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, jwa0Var, this.q, this.r, this.s, this.t, this.p);
    }

    @CheckResult
    public final fwa0 h(int i) {
        return new fwa0(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    @CheckResult
    public final fwa0 i(boolean z) {
        return new fwa0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    @CheckResult
    public final fwa0 j(ewo0 ewo0Var) {
        return new fwa0(ewo0Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return y2r0.S(y2r0.j0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
