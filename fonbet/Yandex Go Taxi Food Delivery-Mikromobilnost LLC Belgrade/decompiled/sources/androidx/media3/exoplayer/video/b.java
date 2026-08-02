package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import defpackage.d6z;
import defpackage.her;
import defpackage.ny61;
import defpackage.o2x0;
import defpackage.tw21;
import defpackage.y3c;
import defpackage.yl31;
import defpackage.zl31;
import ru.yandex.video.m3.player.impl.utils.MemoryDependsLoadControl;

/* loaded from: classes10.dex */
public final class b {
    public final zl31 a;
    public final c b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public y3c l = y3c.a;

    public b(Context context, zl31 zl31Var, long j) {
        this.a = zl31Var;
        this.c = j;
        this.b = new c(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x013a, code lost:
    
        if (r26.a.c(r2, r4) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0144, code lost:
    
        if (r29 >= r33) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0076, code lost:
    
        if ((r9 == 0 ? false : r7.g[(int) ((r9 - 1) % 15)]) != false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, yl31 yl31Var) {
        long j5;
        long j6;
        long j7;
        boolean z3;
        int i;
        int i2;
        int i3;
        long j8;
        long j9;
        yl31Var.a = -9223372036854775807L;
        yl31Var.b = -9223372036854775807L;
        if (this.f == -9223372036854775807L) {
            this.f = j2;
        }
        if (this.h != j) {
            c cVar = this.b;
            j5 = -9223372036854775807L;
            long j10 = cVar.n;
            if (j10 != -1) {
                cVar.p = j10;
                cVar.q = cVar.o;
            }
            cVar.m++;
            her herVar = cVar.a;
            j6 = -1;
            long j11 = j * 1000;
            herVar.a.b(j11);
            if (herVar.a.a()) {
                herVar.c = false;
                j7 = 0;
            } else {
                j7 = 0;
                if (herVar.d != -9223372036854775807L) {
                    if (herVar.c) {
                        her.a aVar = herVar.b;
                        long j12 = aVar.d;
                    }
                    herVar.b.c();
                    herVar.b.b(herVar.d);
                    herVar.c = true;
                    herVar.b.b(j11);
                }
            }
            if (herVar.c && herVar.b.a()) {
                her.a aVar2 = herVar.a;
                herVar.a = herVar.b;
                herVar.b = aVar2;
                herVar.c = false;
            }
            herVar.d = j11;
            herVar.e = herVar.a.a() ? 0 : herVar.e + 1;
            cVar.c();
            this.h = j;
        } else {
            j5 = -9223372036854775807L;
            j6 = -1;
            j7 = 0;
        }
        long j13 = (long) ((j - j2) / this.k);
        if (this.d) {
            ((o2x0) this.l).getClass();
            j13 -= tw21.W(SystemClock.elapsedRealtime()) - j3;
        }
        long j14 = j13;
        yl31Var.a = j14;
        if (!z || z2) {
            if (this.m) {
                if (this.i == j5 || this.j) {
                    int i4 = this.e;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    ny61.k();
                                    return 0;
                                }
                                ((o2x0) this.l).getClass();
                                long W = tw21.W(SystemClock.elapsedRealtime()) - this.g;
                                if (this.d) {
                                }
                            }
                        }
                        z3 = true;
                    } else {
                        z3 = this.d;
                    }
                    if (!z3) {
                        return 0;
                    }
                    if (!this.d || j2 == this.f) {
                        return 5;
                    }
                    ((o2x0) this.l).getClass();
                    long nanoTime = System.nanoTime();
                    c cVar2 = this.b;
                    long j15 = (yl31Var.a * 1000) + nanoTime;
                    if (cVar2.p == j6 || !cVar2.a.a.a()) {
                        i = 3;
                        i2 = 2;
                        i3 = 1;
                    } else {
                        her herVar2 = cVar2.a;
                        if (herVar2.a.a()) {
                            her.a aVar3 = herVar2.a;
                            long j16 = aVar3.e;
                            j9 = j16 == j7 ? j7 : aVar3.f / j16;
                        } else {
                            j9 = j5;
                        }
                        i = 3;
                        i2 = 2;
                        i3 = 1;
                        long j17 = cVar2.q + ((long) (((cVar2.m - cVar2.p) * j9) / cVar2.i));
                        if (Math.abs(j15 - j17) <= 20000000) {
                            j15 = j17;
                        } else {
                            cVar2.m = j7;
                            long j18 = j6;
                            cVar2.p = j18;
                            cVar2.n = j18;
                        }
                    }
                    cVar2.n = cVar2.m;
                    cVar2.o = j15;
                    VideoFrameReleaseHelper$VSyncSampler videoFrameReleaseHelper$VSyncSampler = cVar2.c;
                    if (videoFrameReleaseHelper$VSyncSampler != null && cVar2.k != j5) {
                        long j19 = videoFrameReleaseHelper$VSyncSampler.sampledVsyncTimeNs;
                        if (j19 != j5) {
                            long j20 = cVar2.k;
                            long j21 = (((j15 - j19) / j20) * j20) + j19;
                            if (j15 <= j21) {
                                j8 = j21 - j20;
                            } else {
                                j8 = j21;
                                j21 = j20 + j21;
                            }
                            if (j21 - j15 >= j15 - j8) {
                                j21 = j8;
                            }
                            j15 = j21 - cVar2.l;
                        }
                    }
                    yl31Var.b = j15;
                    long j22 = (j15 - nanoTime) / 1000;
                    yl31Var.a = j22;
                    boolean z4 = (this.i == j5 || this.j) ? 0 : i3;
                    if (this.a.f(j22, j2, z2, z4)) {
                        return 4;
                    }
                    if (this.a.h(yl31Var.a, z2)) {
                        return z4 != 0 ? i : i2;
                    }
                    if (yl31Var.a > MemoryDependsLoadControl.DEFAULT_MAX_DURATION_MS) {
                        return 5;
                    }
                    return i3;
                }
                z3 = false;
                if (!z3) {
                }
            } else {
                this.n = true;
                if (this.a.f(j14, j2, z2, true)) {
                    return 4;
                }
                if (!this.d || yl31Var.a >= 30000) {
                    return 5;
                }
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (!this.m && this.n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        ((o2x0) this.l).getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long j;
        this.j = z;
        long j2 = this.c;
        if (j2 > 0) {
            ((o2x0) this.l).getClass();
            j = SystemClock.elapsedRealtime() + j2;
        } else {
            j = -9223372036854775807L;
        }
        this.i = j;
    }

    public final void d(int i) {
        this.e = Math.min(this.e, i);
    }

    public final boolean e() {
        boolean z = this.e != 3;
        this.e = 3;
        ((o2x0) this.l).getClass();
        this.g = tw21.W(SystemClock.elapsedRealtime());
        return z;
    }

    public final void f() {
        this.d = true;
        ((o2x0) this.l).getClass();
        this.g = tw21.W(SystemClock.elapsedRealtime());
        c cVar = this.b;
        cVar.d = true;
        cVar.m = 0L;
        cVar.p = -1L;
        cVar.n = -1L;
        VideoFrameReleaseHelper$DisplayHelper videoFrameReleaseHelper$DisplayHelper = cVar.b;
        if (videoFrameReleaseHelper$DisplayHelper != null) {
            VideoFrameReleaseHelper$VSyncSampler videoFrameReleaseHelper$VSyncSampler = cVar.c;
            videoFrameReleaseHelper$VSyncSampler.getClass();
            videoFrameReleaseHelper$VSyncSampler.addObserver();
            videoFrameReleaseHelper$DisplayHelper.register();
        }
        cVar.d(false);
    }

    public final void g() {
        this.d = false;
        this.i = -9223372036854775807L;
        c cVar = this.b;
        cVar.d = false;
        VideoFrameReleaseHelper$DisplayHelper videoFrameReleaseHelper$DisplayHelper = cVar.b;
        if (videoFrameReleaseHelper$DisplayHelper != null) {
            videoFrameReleaseHelper$DisplayHelper.unregister();
            VideoFrameReleaseHelper$VSyncSampler videoFrameReleaseHelper$VSyncSampler = cVar.c;
            videoFrameReleaseHelper$VSyncSampler.getClass();
            videoFrameReleaseHelper$VSyncSampler.removeObserver();
        }
        cVar.b();
    }

    public final void h() {
        c cVar = this.b;
        cVar.m = 0L;
        cVar.p = -1L;
        cVar.n = -1L;
        this.h = -9223372036854775807L;
        this.f = -9223372036854775807L;
        d(1);
        this.i = -9223372036854775807L;
    }

    public final void i(float f) {
        c cVar = this.b;
        cVar.f = f;
        her herVar = cVar.a;
        herVar.a.c();
        herVar.b.c();
        herVar.c = false;
        herVar.d = -9223372036854775807L;
        herVar.e = 0;
        cVar.c();
    }

    public final void j(Surface surface) {
        this.m = surface != null;
        this.n = false;
        c cVar = this.b;
        if (cVar.e != surface) {
            cVar.b();
            cVar.e = surface;
            cVar.d(true);
        }
        d(1);
    }

    public final void k(float f) {
        d6z.l(f > 0.0f);
        if (f == this.k) {
            return;
        }
        this.k = f;
        c cVar = this.b;
        cVar.i = f;
        cVar.m = 0L;
        cVar.p = -1L;
        cVar.n = -1L;
        cVar.d(false);
    }
}
