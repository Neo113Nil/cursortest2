package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public final class jxc0 {
    public static final sf10 u = new sf10(new Object());
    public final a9z0 a;
    public final sf10 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final yzz0 h;
    public final y001 i;
    public final List j;
    public final sf10 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final lxc0 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public jxc0(a9z0 a9z0Var, sf10 sf10Var, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, yzz0 yzz0Var, y001 y001Var, List list, sf10 sf10Var2, boolean z2, int i2, int i3, lxc0 lxc0Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = a9z0Var;
        this.b = sf10Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = yzz0Var;
        this.i = y001Var;
        this.j = list;
        this.k = sf10Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = lxc0Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static jxc0 j(y001 y001Var) {
        x8z0 x8z0Var = a9z0.a;
        yzz0 yzz0Var = yzz0.d;
        ImmutableList p = ImmutableList.p();
        lxc0 lxc0Var = lxc0.d;
        sf10 sf10Var = u;
        return new jxc0(x8z0Var, sf10Var, -9223372036854775807L, 0L, 1, null, false, yzz0Var, y001Var, p, sf10Var, false, 1, 0, lxc0Var, 0L, 0L, 0L, 0L, false);
    }

    public final jxc0 a() {
        return new jxc0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, k(), SystemClock.elapsedRealtime(), this.p);
    }

    public final jxc0 b(boolean z) {
        return new jxc0(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final jxc0 c(sf10 sf10Var) {
        return new jxc0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, sf10Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final jxc0 d(sf10 sf10Var, long j, long j2, long j3, long j4, yzz0 yzz0Var, y001 y001Var, List list) {
        return new jxc0(this.a, sf10Var, j2, j3, this.e, this.f, this.g, yzz0Var, y001Var, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final jxc0 e(int i, int i2, boolean z) {
        return new jxc0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final jxc0 f(ExoPlaybackException exoPlaybackException) {
        return new jxc0(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final jxc0 g(lxc0 lxc0Var) {
        return new jxc0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, lxc0Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final jxc0 h(int i) {
        return new jxc0(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final jxc0 i(a9z0 a9z0Var) {
        return new jxc0(a9z0Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long k() {
        long j;
        long j2;
        if (!l()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return tw21.W(tw21.l0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean l() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
