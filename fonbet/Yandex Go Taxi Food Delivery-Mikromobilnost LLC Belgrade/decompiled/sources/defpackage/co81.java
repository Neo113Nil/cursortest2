package defpackage;

import java.util.Arrays;
import yads.aa2;

/* loaded from: classes7.dex */
public final class co81 implements n771 {
    public yg71 a;
    public co61 b;
    public boolean c;

    public final boolean a(w971 w971Var) {
        boolean z;
        pu81 pu81Var = new pu81();
        if (pu81Var.b(w971Var, true) && (pu81Var.a & 2) == 2) {
            int min = Math.min(pu81Var.e, 8);
            dl81 dl81Var = new dl81(min);
            w971Var.I(dl81Var.a, 0, min, false);
            dl81Var.m(0);
            if (dl81Var.c - dl81Var.b >= 5 && dl81Var.s() == 127 && dl81Var.t() == 1179402563) {
                this.b = new r171();
                return true;
            }
            dl81Var.m(0);
            try {
                z = w8a1.e(1, dl81Var, true);
            } catch (aa2 unused) {
                z = false;
            }
            if (z) {
                this.b = new om61();
            } else {
                dl81Var.m(0);
                if (uo61.e(dl81Var, uo61.o)) {
                    this.b = new uo61();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.a = yg71Var;
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        co61 co61Var = this.b;
        if (co61Var != null) {
            pr81 pr81Var = co61Var.a;
            pu81 pu81Var = pr81Var.a;
            pu81Var.a = 0;
            pu81Var.b = 0L;
            pu81Var.c = 0;
            pu81Var.d = 0;
            pu81Var.e = 0;
            pr81Var.b.i(0);
            pr81Var.c = -1;
            pr81Var.e = false;
            if (j == 0) {
                co61Var.c(!co61Var.l);
                return;
            }
            if (co61Var.h != 0) {
                long j3 = (co61Var.i * j2) / 1000000;
                co61Var.e = j3;
                dx81 dx81Var = co61Var.d;
                int i = rf71.a;
                dx81Var.a(j3);
                co61Var.h = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167  */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        int i;
        dl81 dl81Var;
        byte[] bArr;
        if (this.a == null) {
            ny61.k();
            return 0;
        }
        if (this.b == null) {
            w971 w971Var = (w971) bb71Var;
            if (!a(w971Var)) {
                dy31.g(null, "Failed to determine bitstream type");
                return 0;
            }
            w971Var.y = 0;
        }
        if (!this.c) {
            fb81 l = this.a.l(0, 1);
            this.a.mo495a();
            co61 co61Var = this.b;
            co61Var.c = this.a;
            co61Var.b = l;
            co61Var.c(true);
            this.c = true;
        }
        co61 co61Var2 = this.b;
        fb81 fb81Var = co61Var2.b;
        pr81 pr81Var = co61Var2.a;
        if (fb81Var == null) {
            ny61.k();
            return 0;
        }
        int i2 = rf71.a;
        int i3 = co61Var2.h;
        if (i3 != 0) {
            if (i3 == 1) {
                ((w971) bb71Var).b((int) co61Var2.f);
                co61Var2.h = 2;
                return 0;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    return -1;
                }
                ny61.k();
                return 0;
            }
            w971 w971Var2 = (w971) bb71Var;
            long c = co61Var2.d.c(w971Var2);
            if (c >= 0) {
                jp61Var.a = c;
                return 1;
            }
            if (c < -1) {
                co61Var2.b(-(c + 2));
            }
            if (!co61Var2.l) {
                a871 a = co61Var2.d.a();
                if (a == null) {
                    ny61.k();
                    return 0;
                }
                co61Var2.c.r(a);
                co61Var2.l = true;
            }
            if (co61Var2.k <= 0 && !pr81Var.a(w971Var2)) {
                co61Var2.h = 3;
                return -1;
            }
            co61Var2.k = 0L;
            dl81 dl81Var2 = pr81Var.b;
            long a2 = co61Var2.a(dl81Var2);
            if (a2 >= 0) {
                long j = co61Var2.g;
                if (j + a2 >= co61Var2.e) {
                    co61Var2.b.a(dl81Var2.c, dl81Var2);
                    co61Var2.b.b((j * 1000000) / co61Var2.i, 1, dl81Var2.c, 0, null);
                    co61Var2.e = -1L;
                }
            }
            co61Var2.g += a2;
            return 0;
        }
        while (true) {
            w971 w971Var3 = (w971) bb71Var;
            boolean a3 = pr81Var.a(w971Var3);
            dl81 dl81Var3 = pr81Var.b;
            if (!a3) {
                co61Var2.h = 3;
                return -1;
            }
            long j2 = w971Var3.w;
            long j3 = co61Var2.f;
            co61Var2.k = j2 - j3;
            if (co61Var2.d(dl81Var3, j3, co61Var2.j)) {
                co61Var2.f = w971Var3.w;
            } else {
                qd81 qd81Var = co61Var2.j.a;
                co61Var2.i = qd81Var.S;
                if (!co61Var2.m) {
                    co61Var2.b.k(qd81Var);
                    co61Var2.m = true;
                }
                zer zerVar = co61Var2.j.b;
                if (zerVar != null) {
                    co61Var2.d = zerVar;
                } else {
                    long j4 = w971Var3.c;
                    if (j4 != -1) {
                        pu81 pu81Var = pr81Var.a;
                        boolean z = (pu81Var.a & 4) != 0;
                        i = 2;
                        long j5 = co61Var2.f;
                        long j6 = pu81Var.d + pu81Var.e;
                        long j7 = pu81Var.b;
                        dl81Var = dl81Var3;
                        co61Var2.d = new dgh(co61Var2, j5, j4, j6, j7, z);
                        co61Var2.h = i;
                        bArr = dl81Var.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        byte[] copyOf = Arrays.copyOf(bArr, Math.max(65025, dl81Var.c));
                        int i4 = dl81Var.c;
                        dl81Var.a = copyOf;
                        dl81Var.c = i4;
                        dl81Var.b = 0;
                        return 0;
                    }
                    co61Var2.d = new wk61();
                }
                i = 2;
                dl81Var = dl81Var3;
                co61Var2.h = i;
                bArr = dl81Var.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        try {
            return a((w971) bb71Var);
        } catch (aa2 unused) {
            return false;
        }
    }
}
