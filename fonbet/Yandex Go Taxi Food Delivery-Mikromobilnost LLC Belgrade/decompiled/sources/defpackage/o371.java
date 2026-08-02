package defpackage;

import org.xmlpull.v1.XmlPullParserException;
import yads.aa2;
import yads.bs1;
import yads.cs1;
import yads.lu1;
import yads.wk2;

/* loaded from: classes7.dex */
public final class o371 implements n771 {
    public yg71 b;
    public int c;
    public int d;
    public int e;
    public lu1 g;
    public w971 h;
    public qgg i;
    public zz71 j;
    public final dl81 a = new dl81(6);
    public long f = -1;

    public final void a() {
        yg71 yg71Var = this.b;
        yg71Var.getClass();
        fb81 l = yg71Var.l(1024, 4);
        da81 da81Var = new da81();
        da81Var.j = "image/jpeg";
        da81Var.i = new cs1(new bs1[0]);
        l.k(new qd81(da81Var));
        yg71 yg71Var2 = this.b;
        yg71Var2.getClass();
        yg71Var2.mo495a();
        this.b.r(new w471(-9223372036854775807L, 0L));
        this.c = 6;
    }

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.b = yg71Var;
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            zz71 zz71Var = this.j;
            zz71Var.getClass();
            zz71Var.c(j, j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        String j;
        String j2;
        wk71 wk71Var;
        wk2 wk2Var;
        int i;
        lu1 lu1Var;
        boolean z;
        long j3;
        boolean z2;
        int i2 = this.c;
        dl81 dl81Var = this.a;
        if (i2 == 0) {
            dl81Var.i(2);
            ((w971) bb71Var).E(dl81Var.a, 0, 2, false);
            int x = dl81Var.x();
            this.d = x;
            if (x == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((x < 65488 || x > 65497) && x != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            dl81Var.i(2);
            ((w971) bb71Var).E(dl81Var.a, 0, 2, false);
            this.e = dl81Var.x() - 2;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    ny61.k();
                    return 0;
                }
                if (this.i == null || bb71Var != this.h) {
                    w971 w971Var = (w971) bb71Var;
                    this.h = w971Var;
                    this.i = new qgg(w971Var, this.f);
                }
                zz71 zz71Var = this.j;
                zz71Var.getClass();
                int e = zz71Var.e(this.i, jp61Var);
                if (e == 1) {
                    jp61Var.a += this.f;
                }
                return e;
            }
            w971 w971Var2 = (w971) bb71Var;
            long j4 = w971Var2.w;
            long j5 = this.f;
            if (j4 != j5) {
                jp61Var.a = j5;
                return 1;
            }
            if (!w971Var2.I(dl81Var.a, 0, 1, true)) {
                a();
                return 0;
            }
            w971Var2.y = 0;
            if (this.j == null) {
                this.j = new zz71();
            }
            qgg qggVar = new qgg(w971Var2, this.f);
            this.i = qggVar;
            this.j.getClass();
            if (!wfa1.c(qggVar, false)) {
                a();
                return 0;
            }
            zz71 zz71Var2 = this.j;
            long j6 = this.f;
            yg71 yg71Var = this.b;
            yg71Var.getClass();
            zz71Var2.q = new qgg(j6, yg71Var, 9);
            lu1 lu1Var2 = this.g;
            lu1Var2.getClass();
            bs1[] bs1VarArr = {lu1Var2};
            yg71 yg71Var2 = this.b;
            yg71Var2.getClass();
            fb81 l = yg71Var2.l(1024, 4);
            da81 da81Var = new da81();
            da81Var.j = "image/jpeg";
            da81Var.i = new cs1(bs1VarArr);
            l.k(new qd81(da81Var));
            this.c = 5;
            return 0;
        }
        int i3 = this.d;
        int i4 = this.e;
        if (i3 == 65505) {
            byte[] bArr = new byte[i4];
            w971 w971Var3 = (w971) bb71Var;
            w971Var3.E(bArr, 0, i4, false);
            if (this.g == null) {
                int i5 = 0;
                if (i4 == 0) {
                    j = null;
                } else {
                    while (i5 < i4 && bArr[i5] != 0) {
                        i5++;
                    }
                    j = rf71.j(0, i5, bArr);
                    if (i5 < i4) {
                        i5++;
                    }
                }
                if ("http://ns.adobe.com/xap/1.0/".equals(j)) {
                    if (i4 - i5 == 0) {
                        j2 = null;
                    } else {
                        int i6 = i5;
                        while (i6 < i4 && bArr[i6] != 0) {
                            i6++;
                        }
                        j2 = rf71.j(i5, i6 - i5, bArr);
                    }
                    if (j2 != null) {
                        long j7 = w971Var3.c;
                        if (j7 != -1) {
                            try {
                                wk71Var = tea1.b(j2);
                            } catch (NumberFormatException | XmlPullParserException | aa2 unused) {
                                nba1.e();
                                wk71Var = null;
                            }
                            if (wk71Var != null && (i = (wk2Var = wk71Var.b).w) >= 2) {
                                int i7 = i - 1;
                                long j8 = -1;
                                long j9 = -1;
                                long j10 = -1;
                                long j11 = -1;
                                boolean z3 = false;
                                while (i7 >= 0) {
                                    ih71 ih71Var = (ih71) wk2Var.get(i7);
                                    boolean equals = z3 | "video/mp4".equals(ih71Var.a);
                                    if (i7 == 0) {
                                        z = equals;
                                        j7 -= ih71Var.c;
                                        j3 = 0;
                                    } else {
                                        z = equals;
                                        j3 = j7 - ih71Var.b;
                                    }
                                    long j12 = j7;
                                    j7 = j3;
                                    if (!z || j7 == j12) {
                                        z2 = z;
                                    } else {
                                        j11 = j12 - j7;
                                        z2 = false;
                                        j10 = j7;
                                    }
                                    if (i7 == 0) {
                                        j9 = j12;
                                        j8 = j7;
                                    }
                                    i7--;
                                    z3 = z2;
                                }
                                if (j10 != -1 && j11 != -1 && j8 != -1 && j9 != -1) {
                                    lu1Var = new lu1(j8, j9, wk71Var.a, j10, j11);
                                    this.g = lu1Var;
                                    if (lu1Var != null) {
                                        this.f = lu1Var.e;
                                    }
                                }
                            }
                        }
                        lu1Var = null;
                        this.g = lu1Var;
                        if (lu1Var != null) {
                        }
                    }
                }
            }
        } else {
            ((w971) bb71Var).b(i4);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        w971 w971Var = (w971) bb71Var;
        dl81 dl81Var = this.a;
        dl81Var.i(2);
        w971Var.I(dl81Var.a, 0, 2, false);
        if (dl81Var.x() == 65496) {
            dl81Var.i(2);
            w971Var.I(dl81Var.a, 0, 2, false);
            int x = dl81Var.x();
            this.d = x;
            if (x == 65504) {
                dl81Var.i(2);
                w971Var.I(dl81Var.a, 0, 2, false);
                w971Var.c(dl81Var.x() - 2, false);
                dl81Var.i(2);
                w971Var.I(dl81Var.a, 0, 2, false);
                this.d = dl81Var.x();
            }
            if (this.d == 65505) {
                w971Var.c(2, false);
                dl81Var.i(6);
                w971Var.I(dl81Var.a, 0, 6, false);
                if (dl81Var.t() == 1165519206 && dl81Var.x() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
