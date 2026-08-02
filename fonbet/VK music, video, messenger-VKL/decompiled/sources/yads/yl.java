package yads;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class yl implements nq0 {
    public int c;
    public zl e;
    public long h;
    public iu i;
    public int m;
    public boolean n;
    public final kc2 a = new kc2(12);
    public final xl b = new xl();
    public qq0 d = new al0();
    public iu[] g = new iu[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = C.TIME_UNSET;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.c = 0;
        this.d = qq0Var;
        this.h = -1L;
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        this.h = -1L;
        this.i = null;
        for (iu iuVar : this.g) {
            if (iuVar.j == 0) {
                iuVar.h = 0;
            } else {
                iuVar.h = iuVar.l[mc3.b(iuVar.k, j, true)];
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
    /* JADX WARN: Removed duplicated region for block: B:149:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        boolean z;
        iu iuVar;
        long j;
        int i;
        iu iuVar2;
        long j2 = this.h;
        int i2 = 0;
        if (j2 != -1) {
            ld0 ld0Var = (ld0) oq0Var;
            long j3 = ld0Var.d;
            if (j2 >= j3 && j2 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE + j3) {
                ld0Var.a((int) (j2 - j3));
            } else {
                hh2Var.a = j2;
                z = true;
                this.h = -1L;
                if (!z) {
                    return 1;
                }
                iu iuVar3 = null;
                switch (this.c) {
                    case 0:
                        if (a(oq0Var)) {
                            ((ld0) oq0Var).a(12);
                            this.c = 1;
                            return 0;
                        }
                        throw new pc2("AVI Header List not found", null, true, 1);
                    case 1:
                        ((ld0) oq0Var).a(this.a.a, 0, 12, false);
                        this.a.e(0);
                        xl xlVar = this.b;
                        kc2 kc2Var = this.a;
                        xlVar.getClass();
                        xlVar.a = kc2Var.d();
                        xlVar.b = kc2Var.d();
                        xlVar.c = 0;
                        if (xlVar.a == 1414744396) {
                            xlVar.c = kc2Var.d();
                            xl xlVar2 = this.b;
                            if (xlVar2.c == 1819436136) {
                                this.j = xlVar2.b;
                                this.c = 2;
                                return 0;
                            }
                            throw new pc2("hdrl expected, found: " + this.b.c, null, true, 1);
                        }
                        throw new pc2("LIST expected, found: " + xlVar.a, null, true, 1);
                    case 2:
                        int i3 = this.j - 4;
                        kc2 kc2Var2 = new kc2(i3);
                        ((ld0) oq0Var).a(kc2Var2.a, 0, i3, false);
                        mg1 a = mg1.a(1819436136, kc2Var2);
                        if (a.b == 1819436136) {
                            zl zlVar = (zl) a.a(zl.class);
                            if (zlVar != null) {
                                this.e = zlVar;
                                this.f = zlVar.c * zlVar.a;
                                ArrayList arrayList = new ArrayList();
                                p51 listIterator = a.a.listIterator(0);
                                int i4 = 0;
                                while (listIterator.hasNext()) {
                                    vl vlVar = (vl) listIterator.next();
                                    if (vlVar.getType() == 1819440243) {
                                        mg1 mg1Var = (mg1) vlVar;
                                        int i5 = i4 + 1;
                                        am amVar = (am) mg1Var.a(am.class);
                                        x43 x43Var = (x43) mg1Var.a(x43.class);
                                        if (amVar == null) {
                                            ji1.d("AviExtractor", "Missing Stream Header");
                                        } else if (x43Var == null) {
                                            ji1.d("AviExtractor", "Missing Stream Format");
                                        } else {
                                            long a2 = mc3.a(amVar.d, amVar.b * 1000000, amVar.c);
                                            nx0 nx0Var = x43Var.a;
                                            nx0Var.getClass();
                                            mx0 mx0Var = new mx0(nx0Var);
                                            mx0Var.a = Integer.toString(i4);
                                            int i6 = amVar.e;
                                            if (i6 != 0) {
                                                mx0Var.l = i6;
                                            }
                                            a53 a53Var = (a53) mg1Var.a(a53.class);
                                            if (a53Var != null) {
                                                mx0Var.b = a53Var.a;
                                            }
                                            int d = iu1.d(nx0Var.m);
                                            if (d == 1 || d == 2) {
                                                q83 a3 = this.d.a(i4, d);
                                                a3.a(new nx0(mx0Var));
                                                iuVar = new iu(i4, d, a2, amVar.d, a3);
                                                this.f = a2;
                                                if (iuVar != null) {
                                                    arrayList.add(iuVar);
                                                }
                                                i4 = i5;
                                            }
                                        }
                                        iuVar = null;
                                        if (iuVar != null) {
                                        }
                                        i4 = i5;
                                    }
                                }
                                this.g = (iu[]) arrayList.toArray(new iu[0]);
                                this.d.a();
                                this.c = 3;
                                return 0;
                            }
                            throw new pc2("AviHeader not found", null, true, 1);
                        }
                        throw new pc2("Unexpected header list type " + a.b, null, true, 1);
                    case 3:
                        long j4 = this.k;
                        if (j4 != -1 && ((ld0) oq0Var).d != j4) {
                            this.h = j4;
                            return 0;
                        }
                        ld0 ld0Var2 = (ld0) oq0Var;
                        ld0Var2.b(this.a.a, 0, 12, false);
                        ld0Var2.f = 0;
                        this.a.e(0);
                        xl xlVar3 = this.b;
                        kc2 kc2Var3 = this.a;
                        xlVar3.getClass();
                        xlVar3.a = kc2Var3.d();
                        xlVar3.b = kc2Var3.d();
                        xlVar3.c = 0;
                        int d2 = this.a.d();
                        int i7 = this.b.a;
                        if (i7 == 1179011410) {
                            ld0Var2.a(12);
                            return 0;
                        }
                        if (i7 == 1414744396 && d2 == 1769369453) {
                            long j5 = ld0Var2.d;
                            this.k = j5;
                            this.l = j5 + r7.b + 8;
                            if (!this.n) {
                                zl zlVar2 = this.e;
                                zlVar2.getClass();
                                if ((zlVar2.b & 16) == 16) {
                                    this.c = 4;
                                    this.h = this.l;
                                    return 0;
                                }
                                this.d.a(new yx2(this.f, 0L));
                                this.n = true;
                            }
                            this.h = ld0Var2.d + 12;
                            this.c = 6;
                            return 0;
                        }
                        this.h = ld0Var2.d + r7.b + 8;
                        return 0;
                    case 4:
                        ld0 ld0Var3 = (ld0) oq0Var;
                        ld0Var3.a(this.a.a, 0, 8, false);
                        this.a.e(0);
                        int d3 = this.a.d();
                        int d4 = this.a.d();
                        if (d3 == 829973609) {
                            this.c = 5;
                            this.m = d4;
                            return 0;
                        }
                        this.h = ld0Var3.d + d4;
                        return 0;
                    case 5:
                        kc2 kc2Var4 = new kc2(this.m);
                        ((ld0) oq0Var).a(kc2Var4.a, 0, this.m, false);
                        int i8 = kc2Var4.c;
                        int i9 = kc2Var4.b;
                        if (i8 - i9 < 16) {
                            j = 0;
                        } else {
                            kc2Var4.e(i9 + 8);
                            long d5 = kc2Var4.d();
                            long j6 = this.k;
                            j = d5 > j6 ? 0L : j6 + 8;
                            kc2Var4.e(i9);
                        }
                        while (kc2Var4.c - kc2Var4.b >= 16) {
                            int d6 = kc2Var4.d();
                            int d7 = kc2Var4.d();
                            long d8 = kc2Var4.d() + j;
                            kc2Var4.d();
                            iu[] iuVarArr = this.g;
                            int length = iuVarArr.length;
                            int i10 = i2;
                            while (true) {
                                if (i10 < length) {
                                    iuVar2 = iuVarArr[i10];
                                    i = i2;
                                    if (iuVar2.b != d6 && iuVar2.c != d6) {
                                        i10++;
                                        i2 = i;
                                    }
                                } else {
                                    i = i2;
                                    iuVar2 = null;
                                }
                            }
                            if (iuVar2 != null) {
                                if ((d7 & 16) == 16) {
                                    iuVar2.a(d8);
                                }
                                iuVar2.i++;
                            }
                            i2 = i;
                        }
                        int i11 = i2;
                        iu[] iuVarArr2 = this.g;
                        int length2 = iuVarArr2.length;
                        for (int i12 = i11; i12 < length2; i12++) {
                            iuVarArr2[i12].a();
                        }
                        this.n = true;
                        this.d.a(new wl(this, this.f));
                        this.c = 6;
                        this.h = this.k;
                        return i11;
                    case 6:
                        ld0 ld0Var4 = (ld0) oq0Var;
                        long j7 = ld0Var4.d;
                        if (j7 >= this.l) {
                            return -1;
                        }
                        iu iuVar4 = this.i;
                        if (iuVar4 != null) {
                            int i13 = iuVar4.g;
                            int a4 = i13 - iuVar4.a.a(oq0Var, i13, false);
                            iuVar4.g = a4;
                            boolean z2 = a4 == 0;
                            if (z2) {
                                if (iuVar4.f > 0) {
                                    q83 q83Var = iuVar4.a;
                                    int i14 = iuVar4.h;
                                    q83Var.a((iuVar4.d * i14) / iuVar4.e, Arrays.binarySearch(iuVar4.l, i14) >= 0 ? 1 : 0, iuVar4.f, 0, null);
                                }
                                iuVar4.h++;
                            }
                            if (z2) {
                                this.i = null;
                            }
                        } else {
                            if ((j7 & 1) == 1) {
                                ld0Var4.a(1);
                            }
                            ld0Var4.b(this.a.a, 0, 12, false);
                            this.a.e(0);
                            int d9 = this.a.d();
                            if (d9 == 1414744396) {
                                this.a.e(8);
                                ld0Var4.a(this.a.d() == 1769369453 ? 12 : 8);
                                ld0Var4.f = 0;
                            } else {
                                int d10 = this.a.d();
                                if (d9 == 1263424842) {
                                    this.h = ld0Var4.d + d10 + 8;
                                    return 0;
                                }
                                ld0Var4.a(8);
                                ld0Var4.f = 0;
                                for (iu iuVar5 : this.g) {
                                    if (iuVar5.b == d9 || iuVar5.c == d9) {
                                        iuVar3 = iuVar5;
                                        if (iuVar3 != null) {
                                            this.h = ld0Var4.d + d10;
                                            return 0;
                                        }
                                        iuVar3.f = d10;
                                        iuVar3.g = d10;
                                        this.i = iuVar3;
                                    }
                                }
                                if (iuVar3 != null) {
                                }
                            }
                        }
                        return 0;
                    default:
                        throw new AssertionError();
                }
            }
        }
        z = false;
        this.h = -1L;
        if (!z) {
        }
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ((ld0) oq0Var).b(this.a.a, 0, 12, false);
        this.a.e(0);
        if (this.a.d() != 1179011410) {
            return false;
        }
        kc2 kc2Var = this.a;
        kc2Var.e(kc2Var.b + 4);
        return this.a.d() == 541677121;
    }
}
