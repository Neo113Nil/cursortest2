package defpackage;

import java.util.ArrayList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import yads.kv;

/* loaded from: classes7.dex */
public final class oh71 implements ra71, e771 {
    public final ra71 a;
    public e771 b;
    public pe71[] c = new pe71[0];
    public long w;
    public long x;
    public long y;
    public kv z;

    public oh71(ra71 ra71Var, boolean z, long j, long j2) {
        this.a = ra71Var;
        this.w = z ? j : -9223372036854775807L;
        this.x = j;
        this.y = j2;
    }

    @Override // defpackage.ra71
    public final long D(long j, lb71 lb71Var) {
        long j2 = this.x;
        if (j == j2) {
            return j2;
        }
        long j3 = lb71Var.a;
        long j4 = lb71Var.b;
        int i = rf71.a;
        long max = Math.max(0L, Math.min(j3, j - j2));
        long j5 = this.y;
        long max2 = Math.max(0L, Math.min(j4, j5 == Long.MIN_VALUE ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : j5 - j));
        if (max != lb71Var.a || max2 != j4) {
            lb71Var = new lb71(max, max2);
        }
        return this.a.D(j, lb71Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0157, code lost:
    
        if (r11 > r1) goto L111;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x00fa. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0162  */
    @Override // defpackage.ra71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long J(gk71[] gk71VarArr, boolean[] zArr, dg81[] dg81VarArr, boolean[] zArr2, long j) {
        pe71 pe71Var;
        int i;
        char c;
        i6z0 c2;
        char c3;
        this.c = new pe71[dg81VarArr.length];
        dg81[] dg81VarArr2 = new dg81[dg81VarArr.length];
        for (int i2 = 0; i2 < dg81VarArr.length; i2++) {
            pe71[] pe71VarArr = this.c;
            pe71 pe71Var2 = (pe71) dg81VarArr[i2];
            pe71VarArr[i2] = pe71Var2;
            dg81VarArr2[i2] = pe71Var2 != null ? pe71Var2.a : null;
        }
        long J = this.a.J(gk71VarArr, zArr, dg81VarArr2, zArr2, j);
        long j2 = -9223372036854775807L;
        if (this.w != -9223372036854775807L) {
            long j3 = this.x;
            if (j == j3 && j3 != 0) {
                for (gk71 gk71Var : gk71VarArr) {
                    if (gk71Var != null) {
                        qd81 d = gk71Var.d();
                        String str = d.E;
                        String str2 = d.B;
                        ArrayList arrayList = g681.a;
                        if (str != null) {
                            c = '\n';
                            pe71Var = null;
                            switch (str) {
                                case "audio/mp4a-latm":
                                    if (str2 != null && (c2 = g681.c(str2)) != null) {
                                        int i3 = c2.c;
                                        if (i3 != 2) {
                                            if (i3 == 5) {
                                                c = 11;
                                            } else if (i3 != 29) {
                                                if (i3 == 42) {
                                                    c3 = 16;
                                                } else if (i3 == 22) {
                                                    c = 0;
                                                } else if (i3 != 23) {
                                                    c3 = 0;
                                                } else {
                                                    c = 15;
                                                }
                                                if (c3 == 0 && c3 != 16) {
                                                    break;
                                                }
                                            } else {
                                                c = '\f';
                                            }
                                        }
                                        c3 = c;
                                        if (c3 == 0) {
                                        }
                                    }
                                    break;
                            }
                            this.w = j2;
                            if (J != j) {
                                if (J >= this.x) {
                                    long j4 = this.y;
                                    if (j4 != Long.MIN_VALUE) {
                                    }
                                }
                                ny61.k();
                                return 0L;
                            }
                            for (i = 0; i < dg81VarArr.length; i++) {
                                dg81 dg81Var = dg81VarArr2[i];
                                pe71[] pe71VarArr2 = this.c;
                                if (dg81Var == null) {
                                    pe71VarArr2[i] = pe71Var;
                                } else {
                                    pe71 pe71Var3 = pe71VarArr2[i];
                                    if (pe71Var3 == null || pe71Var3.a != dg81Var) {
                                        pe71VarArr2[i] = new pe71(this, dg81Var);
                                    }
                                }
                                dg81VarArr[i] = pe71VarArr2[i];
                            }
                            return J;
                        }
                        pe71Var = null;
                        j2 = J;
                        this.w = j2;
                        if (J != j) {
                        }
                        while (i < dg81VarArr.length) {
                        }
                        return J;
                    }
                }
            }
        }
        pe71Var = null;
        this.w = j2;
        if (J != j) {
        }
        while (i < dg81VarArr.length) {
        }
        return J;
    }

    @Override // defpackage.e771
    public final void a(ra71 ra71Var) {
        if (this.z != null) {
            return;
        }
        e771 e771Var = this.b;
        e771Var.getClass();
        e771Var.a((ra71) this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r5) goto L17;
     */
    @Override // defpackage.ra71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(long j) {
        this.w = -9223372036854775807L;
        for (pe71 pe71Var : this.c) {
            if (pe71Var != null) {
                pe71Var.b = false;
            }
        }
        long e = this.a.e(j);
        if (e != j) {
            if (e >= this.x) {
                long j2 = this.y;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            ny61.k();
            return 0L;
        }
        return e;
    }

    @Override // defpackage.ra71
    public final long f() {
        long j = this.w;
        if (j != -9223372036854775807L) {
            this.w = -9223372036854775807L;
            long f = f();
            return f != -9223372036854775807L ? f : j;
        }
        long f2 = this.a.f();
        if (f2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (f2 >= this.x) {
            long j2 = this.y;
            if (j2 == Long.MIN_VALUE || f2 <= j2) {
                return f2;
            }
            ny61.k();
        } else {
            ny61.k();
        }
        return 0L;
    }

    @Override // defpackage.sn61
    public final long g() {
        long g = this.a.g();
        if (g != Long.MIN_VALUE) {
            long j = this.y;
            if (j == Long.MIN_VALUE || g < j) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.ra71
    public final wx71 getTrackGroups() {
        return this.a.getTrackGroups();
    }

    @Override // defpackage.sn61
    public final void h(long j) {
        this.a.h(j);
    }

    @Override // defpackage.sn61
    public final long i() {
        long i = this.a.i();
        if (i != Long.MIN_VALUE) {
            long j = this.y;
            if (j == Long.MIN_VALUE || i < j) {
                return i;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.sn61
    public final boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // defpackage.ra71
    public final void j() {
        kv kvVar = this.z;
        if (kvVar != null) {
            throw kvVar;
        }
        this.a.j();
    }

    @Override // defpackage.sn61
    public final boolean k(long j) {
        return this.a.k(j);
    }

    @Override // defpackage.ra71
    public final void x(e771 e771Var, long j) {
        this.b = e771Var;
        this.a.x(this, j);
    }

    @Override // defpackage.ra71
    public final void a(long j) {
        this.a.a(j);
    }

    @Override // defpackage.yj61
    public final void a(sn61 sn61Var) {
        e771 e771Var = this.b;
        e771Var.getClass();
        e771Var.a((sn61) this);
    }
}
