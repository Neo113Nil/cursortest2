package yads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class me0 implements qa2 {
    public final pa2 a;
    public final long b;
    public final long c;
    public final d53 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public me0(d53 d53Var, long j, long j2, long j3, long j4, boolean z) {
        ni.a(j >= 0 && j2 > j);
        this.d = d53Var;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new pa2();
    }

    @Override // yads.qa2
    public final zx2 a() {
        if (this.f != 0) {
            return new le0(this);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    @Override // yads.qa2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(ld0 ld0Var) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i = this.e;
        if (i == 0) {
            j = 0;
            long j6 = ld0Var.d;
            this.g = j6;
            this.e = 1;
            long j7 = this.c - 65307;
            if (j7 > j6) {
                return j7;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j8 = this.i;
                j2 = 2;
                long j9 = this.j;
                if (j8 != j9) {
                    long j10 = ld0Var.d;
                    if (this.a.a(ld0Var, j9)) {
                        this.a.a(ld0Var, false);
                        ld0Var.f = 0;
                        long j11 = this.h;
                        pa2 pa2Var = this.a;
                        long j12 = pa2Var.b;
                        long j13 = j11 - j12;
                        int i2 = pa2Var.d + pa2Var.e;
                        if (0 > j13 || j13 >= 72000) {
                            if (j13 < 0) {
                                this.j = j10;
                                this.l = j12;
                                j5 = j13;
                            } else {
                                j5 = j13;
                                this.i = ld0Var.d + i2;
                                this.k = j12;
                            }
                            long j14 = this.j;
                            long j15 = this.i;
                            long j16 = j14 - j15;
                            if (j16 < 100000) {
                                this.j = j15;
                                j4 = -1;
                                j3 = j15;
                            } else {
                                j4 = -1;
                                long j17 = ld0Var.d - (i2 * (j13 <= 0 ? 2L : 1L));
                                int i3 = mc3.a;
                                j3 = Math.max(j15, Math.min(((j16 * j5) / (this.l - this.k)) + j17, j14 - 1));
                            }
                        }
                    } else {
                        j3 = this.i;
                        if (j3 == j10) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j4 = -1;
                    }
                    if (j3 == j4) {
                        return j3;
                    }
                    this.e = 3;
                }
                j3 = -1;
                j4 = -1;
                if (j3 == j4) {
                }
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j4 = -1;
                j2 = 2;
            }
            while (true) {
                this.a.a(ld0Var, j4);
                this.a.a(ld0Var, false);
                pa2 pa2Var2 = this.a;
                if (pa2Var2.b > this.h) {
                    ld0Var.f = 0;
                    this.e = 4;
                    return -(this.k + j2);
                }
                ld0Var.a(pa2Var2.d + pa2Var2.e);
                this.i = ld0Var.d;
                this.k = this.a.b;
                j4 = -1;
            }
        } else {
            j = 0;
        }
        pa2 pa2Var3 = this.a;
        pa2Var3.a = 0;
        pa2Var3.b = j;
        pa2Var3.c = 0;
        pa2Var3.d = 0;
        pa2Var3.e = 0;
        if (!pa2Var3.a(ld0Var, -1L)) {
            throw new EOFException();
        }
        this.a.a(ld0Var, false);
        pa2 pa2Var4 = this.a;
        ld0Var.a(pa2Var4.d + pa2Var4.e);
        long j18 = this.a.b;
        while (true) {
            pa2 pa2Var5 = this.a;
            if ((pa2Var5.a & 4) == 4 || !pa2Var5.a(ld0Var, -1L) || ld0Var.d >= this.c || !this.a.a(ld0Var, true)) {
                break;
            }
            pa2 pa2Var6 = this.a;
            try {
                ld0Var.a(pa2Var6.d + pa2Var6.e);
                j18 = this.a.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j18;
        this.e = 4;
        return this.g;
    }

    @Override // yads.qa2
    public final void a(long j) {
        long j2 = this.f - 1;
        int i = mc3.a;
        this.h = Math.max(0L, Math.min(j, j2));
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
