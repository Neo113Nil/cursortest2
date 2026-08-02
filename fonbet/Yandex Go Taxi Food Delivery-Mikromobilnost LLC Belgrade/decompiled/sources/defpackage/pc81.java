package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class pc81 implements n771 {
    public int c;
    public rf81 e;
    public long h;
    public zv81 i;
    public int m;
    public boolean n;
    public final dl81 a = new dl81(12);
    public final e981 b = new e981();
    public yg71 d = new cm81();
    public zv81[] g = new zv81[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.c = 0;
        this.d = yg71Var;
        this.h = -1L;
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        this.h = -1L;
        this.i = null;
        for (zv81 zv81Var : this.g) {
            if (zv81Var.j == 0) {
                zv81Var.h = 0;
            } else {
                zv81Var.h = zv81Var.l[rf71.t(zv81Var.k, j, true)];
            }
        }
        if (j != 0) {
            this.c = 6;
        } else if (this.g.length == 0) {
            this.c = 0;
        } else {
            this.c = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        boolean z;
        zv81 zv81Var;
        long j;
        int i;
        zv81 zv81Var2;
        long j2 = this.h;
        int i2 = 0;
        if (j2 != -1) {
            w971 w971Var = (w971) bb71Var;
            long j3 = w971Var.w;
            if (j2 < j3 || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + j3) {
                jp61Var.a = j2;
                z = true;
                this.h = -1L;
                if (!z) {
                    return 1;
                }
                int i3 = this.c;
                e981 e981Var = this.b;
                zv81 zv81Var3 = null;
                dl81 dl81Var = this.a;
                switch (i3) {
                    case 0:
                        if (!f(bb71Var)) {
                            dy31.g(null, "AVI Header List not found");
                            return 0;
                        }
                        ((w971) bb71Var).b(12);
                        this.c = 1;
                        return 0;
                    case 1:
                        ((w971) bb71Var).E(dl81Var.a, 0, 12, false);
                        dl81Var.m(0);
                        e981Var.a = dl81Var.h();
                        e981Var.b = dl81Var.h();
                        e981Var.c = 0;
                        if (e981Var.a != 1414744396) {
                            su71.b(e981Var.a, "LIST expected, found: ");
                            return 0;
                        }
                        int h = dl81Var.h();
                        e981Var.c = h;
                        if (h != 1819436136) {
                            su71.b(e981Var.c, "hdrl expected, found: ");
                            return 0;
                        }
                        this.j = e981Var.b;
                        this.c = 2;
                        return 0;
                    case 2:
                        int i4 = this.j - 4;
                        dl81 dl81Var2 = new dl81(i4);
                        ((w971) bb71Var).E(dl81Var2.a, 0, i4, false);
                        ls71 a = ls71.a(1819436136, dl81Var2);
                        int i5 = a.b;
                        if (i5 != 1819436136) {
                            dy31.g(null, oyr.i(i5, "Unexpected header list type "));
                            return 0;
                        }
                        rf81 rf81Var = (rf81) a.b(rf81.class);
                        if (rf81Var == null) {
                            dy31.g(null, "AviHeader not found");
                            return 0;
                        }
                        this.e = rf81Var;
                        this.f = rf81Var.c * rf81Var.a;
                        ArrayList arrayList = new ArrayList();
                        p481 listIterator = a.a.listIterator(0);
                        int i6 = 0;
                        while (listIterator.hasNext()) {
                            u281 u281Var = (u281) listIterator.next();
                            if (u281Var.getType() == 1819440243) {
                                ls71 ls71Var = (ls71) u281Var;
                                int i7 = i6 + 1;
                                wi81 wi81Var = (wi81) ls71Var.b(wi81.class);
                                rn81 rn81Var = (rn81) ls71Var.b(rn81.class);
                                if (wi81Var == null) {
                                    nba1.e();
                                } else if (rn81Var == null) {
                                    nba1.e();
                                } else {
                                    long h2 = rf71.h(wi81Var.d, wi81Var.b * 1000000, wi81Var.c);
                                    qd81 qd81Var = rn81Var.a;
                                    da81 da81Var = new da81(qd81Var);
                                    da81Var.a = Integer.toString(i6);
                                    int i8 = wi81Var.e;
                                    if (i8 != 0) {
                                        da81Var.l = i8;
                                    }
                                    nw81 nw81Var = (nw81) ls71Var.b(nw81.class);
                                    if (nw81Var != null) {
                                        da81Var.b = nw81Var.a;
                                    }
                                    int e = g681.e(qd81Var.E);
                                    if (e == 1 || e == 2) {
                                        fb81 l = this.d.l(i6, e);
                                        l.k(new qd81(da81Var));
                                        zv81Var = new zv81(i6, e, h2, wi81Var.d, l);
                                        this.f = h2;
                                        if (zv81Var != null) {
                                            arrayList.add(zv81Var);
                                        }
                                        i6 = i7;
                                    }
                                }
                                zv81Var = null;
                                if (zv81Var != null) {
                                }
                                i6 = i7;
                            }
                        }
                        this.g = (zv81[]) arrayList.toArray(new zv81[0]);
                        this.d.mo495a();
                        this.c = 3;
                        return 0;
                    case 3:
                        long j4 = this.k;
                        if (j4 != -1 && ((w971) bb71Var).w != j4) {
                            this.h = j4;
                            return 0;
                        }
                        w971 w971Var2 = (w971) bb71Var;
                        w971Var2.I(dl81Var.a, 0, 12, false);
                        w971Var2.y = 0;
                        dl81Var.m(0);
                        e981Var.a = dl81Var.h();
                        e981Var.b = dl81Var.h();
                        e981Var.c = 0;
                        int h3 = dl81Var.h();
                        int i9 = e981Var.a;
                        if (i9 == 1179011410) {
                            w971Var2.b(12);
                            return 0;
                        }
                        if (i9 != 1414744396 || h3 != 1769369453) {
                            this.h = w971Var2.w + e981Var.b + 8;
                            return 0;
                        }
                        long j5 = w971Var2.w;
                        this.k = j5;
                        this.l = j5 + e981Var.b + 8;
                        if (!this.n) {
                            rf81 rf81Var2 = this.e;
                            rf81Var2.getClass();
                            if ((rf81Var2.b & 16) == 16) {
                                this.c = 4;
                                this.h = this.l;
                                return 0;
                            }
                            this.d.r(new w471(this.f, 0L));
                            this.n = true;
                        }
                        this.h = w971Var2.w + 12;
                        this.c = 6;
                        return 0;
                    case 4:
                        w971 w971Var3 = (w971) bb71Var;
                        w971Var3.E(dl81Var.a, 0, 8, false);
                        dl81Var.m(0);
                        int h4 = dl81Var.h();
                        int h5 = dl81Var.h();
                        if (h4 != 829973609) {
                            this.h = w971Var3.w + h5;
                            return 0;
                        }
                        this.c = 5;
                        this.m = h5;
                        return 0;
                    case 5:
                        dl81 dl81Var3 = new dl81(this.m);
                        ((w971) bb71Var).E(dl81Var3.a, 0, this.m, false);
                        int i10 = dl81Var3.c;
                        int i11 = dl81Var3.b;
                        if (i10 - i11 < 16) {
                            j = 0;
                        } else {
                            dl81Var3.m(i11 + 8);
                            long h6 = dl81Var3.h();
                            long j6 = this.k;
                            j = h6 > j6 ? 0L : j6 + 8;
                            dl81Var3.m(i11);
                        }
                        while (dl81Var3.c - dl81Var3.b >= 16) {
                            int h7 = dl81Var3.h();
                            int h8 = dl81Var3.h();
                            long h9 = dl81Var3.h() + j;
                            dl81Var3.h();
                            zv81[] zv81VarArr = this.g;
                            int length = zv81VarArr.length;
                            int i12 = i2;
                            while (true) {
                                if (i12 < length) {
                                    i = i2;
                                    zv81Var2 = zv81VarArr[i12];
                                    if (zv81Var2.b != h7 && zv81Var2.c != h7) {
                                        i12++;
                                        i2 = i;
                                    }
                                } else {
                                    i = i2;
                                    zv81Var2 = null;
                                }
                            }
                            if (zv81Var2 != null) {
                                if ((h8 & 16) == 16) {
                                    if (zv81Var2.j == zv81Var2.l.length) {
                                        long[] jArr = zv81Var2.k;
                                        zv81Var2.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = zv81Var2.l;
                                        zv81Var2.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = zv81Var2.k;
                                    int i13 = zv81Var2.j;
                                    jArr2[i13] = h9;
                                    zv81Var2.l[i13] = zv81Var2.i;
                                    zv81Var2.j = i13 + 1;
                                }
                                zv81Var2.i++;
                            }
                            i2 = i;
                        }
                        int i14 = i2;
                        zv81[] zv81VarArr2 = this.g;
                        int length2 = zv81VarArr2.length;
                        for (int i15 = i14; i15 < length2; i15++) {
                            zv81 zv81Var4 = zv81VarArr2[i15];
                            zv81Var4.k = Arrays.copyOf(zv81Var4.k, zv81Var4.j);
                            zv81Var4.l = Arrays.copyOf(zv81Var4.l, zv81Var4.j);
                        }
                        this.n = true;
                        this.d.r(new w471(this, this.f, 2));
                        this.c = 6;
                        this.h = this.k;
                        return i14;
                    case 6:
                        w971 w971Var4 = (w971) bb71Var;
                        long j7 = w971Var4.w;
                        if (j7 >= this.l) {
                            return -1;
                        }
                        zv81 zv81Var5 = this.i;
                        if (zv81Var5 != null) {
                            fb81 fb81Var = zv81Var5.a;
                            int i16 = zv81Var5.g;
                            int c = i16 - fb81Var.c(bb71Var, i16, false);
                            zv81Var5.g = c;
                            boolean z2 = c == 0;
                            if (z2) {
                                if (zv81Var5.f > 0) {
                                    int i17 = zv81Var5.h;
                                    fb81Var.b((zv81Var5.d * i17) / zv81Var5.e, Arrays.binarySearch(zv81Var5.l, i17) >= 0 ? 1 : 0, zv81Var5.f, 0, null);
                                }
                                zv81Var5.h++;
                            }
                            if (z2) {
                                this.i = null;
                            }
                            return 0;
                        }
                        if ((j7 & 1) == 1) {
                            w971Var4.b(1);
                        }
                        w971Var4.I(dl81Var.a, 0, 12, false);
                        dl81Var.m(0);
                        int h10 = dl81Var.h();
                        if (h10 == 1414744396) {
                            dl81Var.m(8);
                            w971Var4.b(dl81Var.h() == 1769369453 ? 12 : 8);
                            w971Var4.y = 0;
                            return 0;
                        }
                        int h11 = dl81Var.h();
                        if (h10 == 1263424842) {
                            this.h = w971Var4.w + h11 + 8;
                            return 0;
                        }
                        w971Var4.b(8);
                        w971Var4.y = 0;
                        for (zv81 zv81Var6 : this.g) {
                            if (zv81Var6.b == h10 || zv81Var6.c == h10) {
                                zv81Var3 = zv81Var6;
                                if (zv81Var3 != null) {
                                    this.h = w971Var4.w + h11;
                                    return 0;
                                }
                                zv81Var3.f = h11;
                                zv81Var3.g = h11;
                                this.i = zv81Var3;
                                return 0;
                            }
                        }
                        if (zv81Var3 != null) {
                        }
                        break;
                    default:
                        ny61.w();
                        return 0;
                }
            } else {
                w971Var.b((int) (j2 - j3));
            }
        }
        z = false;
        this.h = -1L;
        if (!z) {
        }
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        dl81 dl81Var = this.a;
        ((w971) bb71Var).I(dl81Var.a, 0, 12, false);
        dl81Var.m(0);
        if (dl81Var.h() == 1179011410) {
            dl81Var.m(dl81Var.b + 4);
            if (dl81Var.h() == 541677121) {
                return true;
            }
        }
        return false;
    }
}
