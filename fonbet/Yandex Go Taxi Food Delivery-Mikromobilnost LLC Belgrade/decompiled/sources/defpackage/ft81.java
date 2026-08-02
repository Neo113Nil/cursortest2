package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes7.dex */
public final class ft81 implements ra71, e771 {
    public ra71[] A;
    public ji41 B;
    public final ra71[] a;
    public final IdentityHashMap b;
    public final jv71 c;
    public final ArrayList w = new ArrayList();
    public final HashMap x = new HashMap();
    public e771 y;
    public wx71 z;

    public ft81(jv71 jv71Var, long[] jArr, ra71... ra71VarArr) {
        this.c = jv71Var;
        this.a = ra71VarArr;
        jv71Var.getClass();
        this.B = new ji41(21, new sn61[0]);
        this.b = new IdentityHashMap();
        this.A = new ra71[0];
        for (int i = 0; i < ra71VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new tm81(ra71VarArr[i], j);
            }
        }
    }

    @Override // defpackage.ra71
    public final long D(long j, lb71 lb71Var) {
        ra71[] ra71VarArr = this.A;
        return (ra71VarArr.length > 0 ? ra71VarArr[0] : this.a[0]).D(j, lb71Var);
    }

    @Override // defpackage.ra71
    public final long J(gk71[] gk71VarArr, boolean[] zArr, dg81[] dg81VarArr, boolean[] zArr2, long j) {
        HashMap hashMap;
        IdentityHashMap identityHashMap;
        ra71[] ra71VarArr;
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = new int[gk71VarArr.length];
        int[] iArr4 = new int[gk71VarArr.length];
        int i = 0;
        while (true) {
            int length = gk71VarArr.length;
            hashMap = this.x;
            identityHashMap = this.b;
            ra71VarArr = this.a;
            if (i >= length) {
                break;
            }
            dg81 dg81Var = dg81VarArr[i];
            Integer num = dg81Var == null ? null : (Integer) identityHashMap.get(dg81Var);
            iArr3[i] = num == null ? -1 : num.intValue();
            iArr4[i] = -1;
            gk71 gk71Var = gk71VarArr[i];
            if (gk71Var != null) {
                tu71 tu71Var = (tu71) hashMap.get(gk71Var.c());
                tu71Var.getClass();
                int i2 = 0;
                while (true) {
                    if (i2 >= ra71VarArr.length) {
                        break;
                    }
                    int indexOf = ra71VarArr[i2].getTrackGroups().b.indexOf(tu71Var);
                    if (indexOf < 0) {
                        indexOf = -1;
                    }
                    if (indexOf != -1) {
                        iArr4[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        identityHashMap.clear();
        int length2 = gk71VarArr.length;
        dg81[] dg81VarArr2 = new dg81[length2];
        dg81[] dg81VarArr3 = new dg81[gk71VarArr.length];
        gk71[] gk71VarArr2 = new gk71[gk71VarArr.length];
        ArrayList arrayList = new ArrayList(ra71VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < ra71VarArr.length) {
            int i4 = 0;
            while (i4 < gk71VarArr.length) {
                dg81VarArr3[i4] = iArr3[i4] == i3 ? dg81VarArr[i4] : null;
                if (iArr4[i4] == i3) {
                    gk71 gk71Var2 = gk71VarArr[i4];
                    gk71Var2.getClass();
                    iArr = iArr3;
                    tu71 tu71Var2 = (tu71) hashMap.get(gk71Var2.c());
                    tu71Var2.getClass();
                    iArr2 = iArr4;
                    gk71VarArr2[i4] = new pj81(gk71Var2, tu71Var2);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    gk71VarArr2[i4] = null;
                }
                i4++;
                iArr3 = iArr;
                iArr4 = iArr2;
            }
            int[] iArr5 = iArr3;
            int[] iArr6 = iArr4;
            ArrayList arrayList2 = arrayList;
            dg81[] dg81VarArr4 = dg81VarArr3;
            int i5 = i3;
            long J = ra71VarArr[i3].J(gk71VarArr2, zArr, dg81VarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = J;
            } else if (J != j2) {
                ny61.r("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < gk71VarArr.length; i6++) {
                if (iArr6[i6] == i5) {
                    dg81 dg81Var2 = dg81VarArr4[i6];
                    dg81Var2.getClass();
                    dg81VarArr2[i6] = dg81VarArr4[i6];
                    identityHashMap.put(dg81Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr5[i6] == i5 && dg81VarArr4[i6] != null) {
                    ny61.k();
                    return 0L;
                }
            }
            if (z) {
                arrayList2.add(ra71VarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            dg81VarArr3 = dg81VarArr4;
            iArr3 = iArr5;
            iArr4 = iArr6;
        }
        System.arraycopy(dg81VarArr2, 0, dg81VarArr, 0, length2);
        ra71[] ra71VarArr2 = (ra71[]) arrayList.toArray(new ra71[0]);
        this.A = ra71VarArr2;
        this.c.getClass();
        this.B = new ji41(21, ra71VarArr2);
        return j2;
    }

    @Override // defpackage.e771
    public final void a(ra71 ra71Var) {
        ArrayList arrayList = this.w;
        arrayList.remove(ra71Var);
        if (arrayList.isEmpty()) {
            ra71[] ra71VarArr = this.a;
            int i = 0;
            for (ra71 ra71Var2 : ra71VarArr) {
                i += ra71Var2.getTrackGroups().a;
            }
            tu71[] tu71VarArr = new tu71[i];
            int i2 = 0;
            for (int i3 = 0; i3 < ra71VarArr.length; i3++) {
                wx71 trackGroups = ra71VarArr[i3].getTrackGroups();
                int i4 = trackGroups.a;
                int i5 = 0;
                while (i5 < i4) {
                    tu71 a = trackGroups.a(i5);
                    tu71 tu71Var = new tu71(i3 + ":" + a.b, a.w);
                    this.x.put(tu71Var, a);
                    tu71VarArr[i2] = tu71Var;
                    i5++;
                    i2++;
                }
            }
            this.z = new wx71(tu71VarArr);
            e771 e771Var = this.y;
            e771Var.getClass();
            e771Var.a((ra71) this);
        }
    }

    @Override // defpackage.ra71
    public final long e(long j) {
        long e = this.A[0].e(j);
        int i = 1;
        while (true) {
            ra71[] ra71VarArr = this.A;
            if (i >= ra71VarArr.length) {
                return e;
            }
            if (ra71VarArr[i].e(e) != e) {
                ny61.r("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // defpackage.ra71
    public final long f() {
        long j;
        ra71 ra71Var;
        ra71[] ra71VarArr = this.A;
        int length = ra71VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            ra71 ra71Var2 = ra71VarArr[i];
            long f = ra71Var2.f();
            if (f == j2) {
                j = j2;
                if (j3 != j && ra71Var2.e(j3) != j3) {
                    ny61.r("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                ra71[] ra71VarArr2 = this.A;
                int length2 = ra71VarArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (ra71Var = ra71VarArr2[i2]) == ra71Var2) {
                        break;
                    }
                    if (ra71Var.e(f) != f) {
                        ny61.r("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = f;
            } else {
                j = j2;
                if (f != j3) {
                    ny61.r("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // defpackage.sn61
    public final long g() {
        return this.B.g();
    }

    @Override // defpackage.ra71
    public final wx71 getTrackGroups() {
        wx71 wx71Var = this.z;
        wx71Var.getClass();
        return wx71Var;
    }

    @Override // defpackage.sn61
    public final void h(long j) {
        this.B.h(j);
    }

    @Override // defpackage.sn61
    public final long i() {
        return this.B.i();
    }

    @Override // defpackage.sn61
    public final boolean isLoading() {
        return this.B.isLoading();
    }

    @Override // defpackage.ra71
    public final void j() {
        for (ra71 ra71Var : this.a) {
            ra71Var.j();
        }
    }

    @Override // defpackage.sn61
    public final boolean k(long j) {
        ArrayList arrayList = this.w;
        if (arrayList.isEmpty()) {
            return this.B.k(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ra71) arrayList.get(i)).k(j);
        }
        return false;
    }

    @Override // defpackage.ra71
    public final void x(e771 e771Var, long j) {
        this.y = e771Var;
        ArrayList arrayList = this.w;
        ra71[] ra71VarArr = this.a;
        Collections.addAll(arrayList, ra71VarArr);
        for (ra71 ra71Var : ra71VarArr) {
            ra71Var.x(this, j);
        }
    }

    @Override // defpackage.ra71
    public final void a(long j) {
        for (ra71 ra71Var : this.A) {
            ra71Var.a(j);
        }
    }

    @Override // defpackage.yj61
    public final void a(sn61 sn61Var) {
        e771 e771Var = this.y;
        e771Var.getClass();
        e771Var.a((sn61) this);
    }
}
