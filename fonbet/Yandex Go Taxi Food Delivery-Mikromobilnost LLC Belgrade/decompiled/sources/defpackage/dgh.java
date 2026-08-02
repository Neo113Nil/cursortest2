package defpackage;

import java.io.EOFException;

/* loaded from: classes10.dex */
public final class dgh implements uv60, dx81 {
    public long A;
    public long B;
    public long C;
    public final Object D;
    public final Object E;
    public final long a;
    public final long b;
    public int c;
    public long w;
    public long x;
    public long y;
    public long z;

    public dgh(gru0 gru0Var, long j, long j2, long j3, long j4, boolean z) {
        d6z.l(j >= 0 && j2 > j);
        this.E = gru0Var;
        this.a = j;
        this.b = j2;
        if (j3 == j2 - j || z) {
            this.w = j4;
            this.c = 4;
        } else {
            this.c = 0;
        }
        this.D = new tv60();
    }

    @Override // defpackage.dx81
    public void a(long j) {
        long j2 = this.w - 1;
        int i = rf71.a;
        this.y = Math.max(0L, Math.min(j, j2));
        this.c = 2;
        this.z = this.a;
        this.A = this.b;
        this.B = 0L;
        this.C = this.w;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    @Override // defpackage.dx81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long c(w971 w971Var) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        pu81 pu81Var = (pu81) this.D;
        int i = this.c;
        long j7 = this.b;
        if (i == 0) {
            j = 0;
            long j8 = w971Var.w;
            this.x = j8;
            this.c = 1;
            long j9 = j7 - 65307;
            if (j9 > j8) {
                return j9;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j10 = this.z;
                long j11 = this.A;
                if (j10 == j11) {
                    j2 = 2;
                } else {
                    long j12 = w971Var.w;
                    if (pu81Var.a(w971Var, j11)) {
                        pu81Var.b(w971Var, false);
                        w971Var.y = 0;
                        long j13 = this.y;
                        long j14 = pu81Var.b;
                        long j15 = j13 - j14;
                        j2 = 2;
                        int i2 = pu81Var.d + pu81Var.e;
                        if (0 > j15 || j15 >= 72000) {
                            if (j15 < 0) {
                                this.A = j12;
                                this.C = j14;
                                j3 = j15;
                            } else {
                                j3 = j15;
                                this.z = w971Var.w + i2;
                                this.B = j14;
                            }
                            long j16 = this.A;
                            j4 = this.z;
                            long j17 = j16 - j4;
                            if (j17 < 100000) {
                                this.A = j4;
                                j5 = -1;
                            } else {
                                j5 = -1;
                                long j18 = w971Var.w - (i2 * (j15 <= 0 ? 2L : 1L));
                                int i3 = rf71.a;
                                j4 = Math.max(j4, Math.min(((j17 * j3) / (this.C - this.B)) + j18, j16 - 1));
                            }
                        }
                    } else {
                        j4 = this.z;
                        if (j4 == j12) {
                            ny61.v("No ogg page can be found.");
                            return 0L;
                        }
                        j5 = -1;
                        j2 = 2;
                    }
                    if (j4 == j5) {
                        return j4;
                    }
                    this.c = 3;
                    j6 = j5;
                }
                j4 = -1;
                j5 = -1;
                if (j4 == j5) {
                }
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    ny61.k();
                    return 0L;
                }
                j6 = -1;
                j2 = 2;
            }
            while (true) {
                pu81Var.a(w971Var, j6);
                pu81Var.b(w971Var, false);
                if (pu81Var.b > this.y) {
                    w971Var.y = 0;
                    this.c = 4;
                    return -(this.B + j2);
                }
                w971Var.b(pu81Var.d + pu81Var.e);
                this.z = w971Var.w;
                this.B = pu81Var.b;
                j6 = -1;
            }
        } else {
            j = 0;
        }
        pu81Var.a = 0;
        pu81Var.b = j;
        pu81Var.c = 0;
        pu81Var.d = 0;
        pu81Var.e = 0;
        if (!pu81Var.a(w971Var, -1L)) {
            ny61.b();
            return 0L;
        }
        pu81Var.b(w971Var, false);
        w971Var.b(pu81Var.d + pu81Var.e);
        long j19 = pu81Var.b;
        while ((pu81Var.a & 4) != 4 && pu81Var.a(w971Var, -1L) && w971Var.w < j7 && pu81Var.b(w971Var, true)) {
            try {
                w971Var.b(pu81Var.d + pu81Var.e);
                j19 = pu81Var.b;
            } catch (EOFException unused) {
            }
        }
        this.w = j19;
        this.c = 4;
        return this.x;
    }

    @Override // defpackage.uv60
    public f7q0 d() {
        if (this.w != 0) {
            return new cgh(0, this);
        }
        return null;
    }

    @Override // defpackage.uv60
    public void g(long j) {
        this.y = tw21.j(j, 0L, this.w - 1);
        this.c = 2;
        this.z = this.a;
        this.A = this.b;
        this.B = 0L;
        this.C = this.w;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    @Override // defpackage.uv60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long j(c5p c5pVar) {
        long j;
        long j2;
        long j3;
        tv60 tv60Var = (tv60) this.D;
        int i = this.c;
        long j4 = this.b;
        if (i == 0) {
            j = 0;
            long position = c5pVar.getPosition();
            this.x = position;
            this.c = 1;
            long j5 = j4 - 65307;
            if (j5 > position) {
                return j5;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.z == this.A) {
                    j3 = -1;
                } else {
                    long position2 = c5pVar.getPosition();
                    if (tv60Var.b(c5pVar, this.A)) {
                        tv60Var.a(c5pVar, false);
                        c5pVar.J();
                        long j6 = this.y;
                        long j7 = tv60Var.b;
                        long j8 = j6 - j7;
                        j2 = 2;
                        int i2 = tv60Var.d + tv60Var.e;
                        if (0 > j8 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.A = position2;
                                this.C = j7;
                            } else {
                                this.z = c5pVar.getPosition() + i2;
                                this.B = tv60Var.b;
                            }
                            long j9 = this.A;
                            long j10 = this.z;
                            if (j9 - j10 < 100000) {
                                this.A = j10;
                                j3 = j10;
                            } else {
                                long position3 = c5pVar.getPosition() - (i2 * (j8 <= 0 ? 2L : 1L));
                                long j11 = this.A;
                                long j12 = this.z;
                                j3 = tw21.j((((j11 - j12) * j8) / (this.C - this.B)) + position3, j12, j11 - 1);
                            }
                        } else {
                            j3 = -1;
                        }
                        if (j3 == -1) {
                            return j3;
                        }
                        this.c = 3;
                    } else {
                        j3 = this.z;
                        if (j3 == position2) {
                            ny61.v("No ogg page can be found.");
                            return 0L;
                        }
                    }
                }
                j2 = 2;
                if (j3 == -1) {
                }
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    ny61.k();
                    return 0L;
                }
                j2 = 2;
            }
            while (true) {
                tv60Var.b(c5pVar, -1L);
                tv60Var.a(c5pVar, false);
                if (tv60Var.b > this.y) {
                    c5pVar.J();
                    this.c = 4;
                    return -(this.B + j2);
                }
                c5pVar.O(tv60Var.d + tv60Var.e);
                this.z = c5pVar.getPosition();
                this.B = tv60Var.b;
            }
        } else {
            j = 0;
        }
        tv60Var.a = 0;
        tv60Var.b = j;
        tv60Var.c = 0;
        tv60Var.d = 0;
        tv60Var.e = 0;
        if (!tv60Var.b(c5pVar, -1L)) {
            ny61.b();
            return 0L;
        }
        tv60Var.a(c5pVar, false);
        c5pVar.O(tv60Var.d + tv60Var.e);
        long j13 = tv60Var.b;
        while ((tv60Var.a & 4) != 4 && tv60Var.b(c5pVar, -1L) && c5pVar.getPosition() < j4 && tv60Var.a(c5pVar, true)) {
            try {
                c5pVar.O(tv60Var.d + tv60Var.e);
                j13 = tv60Var.b;
            } catch (EOFException unused) {
            }
        }
        this.w = j13;
        this.c = 4;
        return this.x;
    }

    @Override // defpackage.dx81
    public a871 a() {
        if (this.w != 0) {
            return new k071(this);
        }
        return null;
    }

    public dgh(co61 co61Var, long j, long j2, long j3, long j4, boolean z) {
        if (j >= 0 && j2 > j) {
            this.E = co61Var;
            this.a = j;
            this.b = j2;
            if (j3 != j2 - j && !z) {
                this.c = 0;
            } else {
                this.w = j4;
                this.c = 4;
            }
            this.D = new pu81();
            return;
        }
        w511.q();
        throw null;
    }
}
