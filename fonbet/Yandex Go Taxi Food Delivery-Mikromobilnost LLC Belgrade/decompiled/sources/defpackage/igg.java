package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.a;
import androidx.media3.exoplayer.dash.PlayerEmsgHandler;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.u;
import com.google.common.collect.v;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class igg implements xe10, trq0 {
    public static final Pattern T = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern U = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final tyy A;
    public final au1 B;
    public final yzz0 C;
    public final hgg[] D;
    public final z8h E;
    public final PlayerEmsgHandler F;
    public final xf10 H;
    public final mmm I;
    public final vyc0 J;
    public we10 K;
    public fsd N;
    public egg O;
    public int P;
    public List Q;
    public long S;
    public final int a;
    public final cgg b;
    public final cj01 c;
    public final qmm w;
    public final twy x;
    public final jc5 y;
    public final long z;
    public boolean R = true;
    public tsb[] L = new tsb[0];
    public tgo[] M = new tgo[0];
    public final IdentityHashMap G = new IdentityHashMap();

    public igg(int i, egg eggVar, jc5 jc5Var, int i2, cgg cggVar, cj01 cj01Var, qmm qmmVar, mmm mmmVar, twy twyVar, xf10 xf10Var, long j, tyy tyyVar, au1 au1Var, z8h z8hVar, gyc gycVar, vyc0 vyc0Var) {
        int i3;
        int i4;
        int[][] iArr;
        boolean[] zArr;
        a[][] aVarArr;
        a[] aVarArr2;
        eyi a;
        int i5;
        HashMap hashMap;
        String[] strArr;
        Integer num;
        this.a = i;
        this.O = eggVar;
        this.y = jc5Var;
        this.P = i2;
        this.b = cggVar;
        this.c = cj01Var;
        this.w = qmmVar;
        this.I = mmmVar;
        this.x = twyVar;
        this.H = xf10Var;
        this.z = j;
        this.A = tyyVar;
        this.B = au1Var;
        this.E = z8hVar;
        this.J = vyc0Var;
        boolean z = true;
        this.F = new PlayerEmsgHandler(eggVar, gycVar, au1Var);
        int i6 = 0;
        z8hVar.getClass();
        this.N = new fsd(ImmutableList.p(), ImmutableList.p());
        pxa0 period = eggVar.getPeriod(i2);
        List list = period.d;
        this.Q = list;
        List list2 = period.c;
        int size = list2.size();
        HashMap hashMap2 = new HashMap(v.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            hashMap2.put(Long.valueOf(((a70) list2.get(i7)).a), Integer.valueOf(i7));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        int i8 = 0;
        while (i8 < size) {
            a70 a70Var = (a70) list2.get(i8);
            List list3 = a70Var.e;
            List list4 = a70Var.f;
            boolean z2 = z;
            eyi a2 = a("http://dashif.org/guidelines/trickmode", list3);
            a2 = a2 == null ? a("http://dashif.org/guidelines/trickmode", list4) : a2;
            int intValue = (a2 == null || (num = (Integer) hashMap2.get(Long.valueOf(Long.parseLong(a2.b)))) == null) ? i8 : num.intValue();
            if (intValue == i8 && (a = a("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = a.b;
                int i9 = tw21.a;
                String[] split = str.split(",", -1);
                int length = split.length;
                int i10 = i6;
                while (i10 < length) {
                    Integer num2 = (Integer) hashMap2.get(Long.valueOf(Long.parseLong(split[i10])));
                    if (num2 != null) {
                        a70 a70Var2 = (a70) list2.get(num2.intValue());
                        i5 = size;
                        int i11 = a70Var.b;
                        hashMap = hashMap2;
                        List list5 = a70Var.c;
                        strArr = split;
                        int i12 = a70Var2.b;
                        List list6 = a70Var2.c;
                        if (i11 == i12) {
                            if (!list5.isEmpty() && !list6.isEmpty()) {
                                a aVar = ((s4j0) list5.get(0)).a;
                                a aVar2 = ((s4j0) list6.get(0)).a;
                                if (Objects.equals(aVar.d, aVar2.d)) {
                                    if (aVar.f != aVar2.f) {
                                    }
                                }
                            }
                            intValue = Math.min(intValue, num2.intValue());
                        }
                    } else {
                        i5 = size;
                        hashMap = hashMap2;
                        strArr = split;
                    }
                    i10++;
                    size = i5;
                    hashMap2 = hashMap;
                    split = strArr;
                }
            }
            int i13 = size;
            HashMap hashMap3 = hashMap2;
            if (intValue != i8) {
                List list7 = (List) sparseArray.get(i8);
                List list8 = (List) sparseArray.get(intValue);
                list8.addAll(list7);
                sparseArray.put(i8, list8);
                arrayList.remove(list7);
            }
            i8++;
            z = z2;
            size = i13;
            hashMap2 = hashMap3;
            i6 = 0;
        }
        boolean z3 = z;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i14 = 0; i14 < size2; i14++) {
            int[] e = com.google.common.primitives.a.e((Collection) arrayList.get(i14));
            iArr2[i14] = e;
            Arrays.sort(e);
        }
        boolean[] zArr2 = new boolean[size2];
        a[][] aVarArr3 = new a[size2][];
        int i15 = 0;
        int i16 = 0;
        while (i15 < size2) {
            int[] iArr3 = iArr2[i15];
            int length2 = iArr3.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list9 = ((a70) list2.get(iArr3[i17])).c;
                iArr = iArr2;
                for (int i18 = 0; i18 < list9.size(); i18++) {
                    if (!((s4j0) list9.get(i18)).w.isEmpty()) {
                        zArr2[i15] = z3;
                        i16++;
                        break;
                    }
                }
                i17++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i15];
            int length3 = iArr4.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length3) {
                    zArr = zArr2;
                    aVarArr = aVarArr3;
                    aVarArr2 = new a[0];
                    break;
                }
                int i20 = iArr4[i19];
                a70 a70Var3 = (a70) list2.get(i20);
                List list10 = ((a70) list2.get(i20)).d;
                int[] iArr5 = iArr4;
                int i21 = 0;
                while (i21 < list10.size()) {
                    eyi eyiVar = (eyi) list10.get(i21);
                    zArr = zArr2;
                    aVarArr = aVarArr3;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(eyiVar.a)) {
                        f7s f7sVar = new f7s();
                        f7sVar.m = eh20.q("application/cea-608");
                        f7sVar.a = oyr.n(a70Var3.a, ":cea608", new StringBuilder());
                        aVarArr2 = d(eyiVar, T, new a(f7sVar));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(eyiVar.a)) {
                        f7s f7sVar2 = new f7s();
                        f7sVar2.m = eh20.q("application/cea-708");
                        f7sVar2.a = oyr.n(a70Var3.a, ":cea708", new StringBuilder());
                        aVarArr2 = d(eyiVar, U, new a(f7sVar2));
                        break;
                    }
                    i21++;
                    aVarArr3 = aVarArr;
                    zArr2 = zArr;
                }
                i19++;
                iArr4 = iArr5;
            }
            aVarArr[i15] = aVarArr2;
            if (aVarArr2.length != 0) {
                i16++;
            }
            i15++;
            aVarArr3 = aVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        a[][] aVarArr4 = aVarArr3;
        int size3 = list.size() + i16 + size2;
        xzz0[] xzz0VarArr = new xzz0[size3];
        hgg[] hggVarArr = new hgg[size3];
        int i22 = 0;
        int i23 = 0;
        while (i22 < size2) {
            int[] iArr7 = iArr6[i22];
            ArrayList arrayList3 = new ArrayList();
            for (int i24 : iArr7) {
                arrayList3.addAll(((a70) list2.get(i24)).c);
            }
            int size4 = arrayList3.size();
            a[] aVarArr5 = new a[size4];
            int i25 = 0;
            while (i25 < size4) {
                int i26 = size2;
                a aVar3 = ((s4j0) arrayList3.get(i25)).a;
                int i27 = i23;
                f7s a3 = aVar3.a();
                a3.L = qmmVar.getCryptoType(aVar3);
                aVarArr5[i25] = new a(a3);
                i25++;
                size2 = i26;
                i23 = i27;
            }
            int i28 = size2;
            int i29 = i23;
            a70 a70Var4 = (a70) list2.get(iArr7[0]);
            long j2 = a70Var4.a;
            String l = j2 != -1 ? Long.toString(j2) : oyr.i(i22, "unset:");
            int i30 = i29 + 1;
            if (zArr3[i22]) {
                i3 = i29 + 2;
            } else {
                i3 = i30;
                i30 = -1;
            }
            if (aVarArr4[i22].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            List list11 = list2;
            int i31 = 0;
            while (i31 < size4) {
                int i32 = i31;
                aVarArr5[i32] = cggVar.getOutputTextFormat(aVarArr5[i32]);
                i31 = i32 + 1;
            }
            xzz0VarArr[i29] = new xzz0(l, aVarArr5);
            hggVarArr[i29] = new hgg(a70Var4.b, 0, iArr7, i29, i30, i3, -1, ImmutableList.p());
            int i33 = -1;
            if (i30 != -1) {
                String j3 = b64.j(l, ":emsg");
                f7s f7sVar3 = new f7s();
                f7sVar3.a = j3;
                f7sVar3.m = eh20.q("application/x-emsg");
                xzz0VarArr[i30] = new xzz0(j3, new a(f7sVar3));
                hggVarArr[i30] = new hgg(5, 1, iArr7, i29, -1, -1, -1, ImmutableList.p());
                i33 = -1;
            }
            if (i3 != i33) {
                String j4 = b64.j(l, ":cc");
                hggVarArr[i3] = new hgg(3, 1, iArr7, i29, -1, -1, -1, ImmutableList.m(aVarArr4[i22]));
                a[] aVarArr6 = aVarArr4[i22];
                for (int i34 = 0; i34 < aVarArr6.length; i34++) {
                    aVarArr6[i34] = cggVar.getOutputTextFormat(aVarArr6[i34]);
                }
                xzz0VarArr[i3] = new xzz0(j4, aVarArr4[i22]);
            }
            i22++;
            size2 = i28;
            i23 = i4;
            list2 = list11;
        }
        int i35 = 0;
        while (i35 < list.size()) {
            bho bhoVar = (bho) list.get(i35);
            f7s f7sVar4 = new f7s();
            f7sVar4.a = bhoVar.a();
            f7sVar4.m = eh20.q("application/x-emsg");
            xzz0VarArr[i23] = new xzz0(bhoVar.a() + ":" + i35, new a(f7sVar4));
            hggVarArr[i23] = new hgg(5, 2, new int[0], -1, -1, -1, i35, ImmutableList.p());
            i35++;
            i23++;
        }
        Pair create = Pair.create(new yzz0(xzz0VarArr), hggVarArr);
        this.C = (yzz0) create.first;
        this.D = (hgg[]) create.second;
    }

    public static eyi a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            eyi eyiVar = (eyi) list.get(i);
            if (str.equals(eyiVar.a)) {
                return eyiVar;
            }
        }
        return null;
    }

    public static a[] d(eyi eyiVar, Pattern pattern, a aVar) {
        String str = eyiVar.b;
        if (str == null) {
            return new a[]{aVar};
        }
        int i = tw21.a;
        String[] split = str.split(";", -1);
        a[] aVarArr = new a[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            Matcher matcher = pattern.matcher(split[i2]);
            if (!matcher.matches()) {
                return new a[]{aVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            f7s a = aVar.a();
            a.a = aVar.a + ":" + parseInt;
            a.H = parseInt;
            a.d = matcher.group(2);
            aVarArr[i2] = new a(a);
        }
        return aVarArr;
    }

    public final int b(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 != -1) {
            hgg[] hggVarArr = this.D;
            int i3 = hggVarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && hggVarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.xe10
    public final long c(long j, g7q0 g7q0Var) {
        for (tsb tsbVar : this.L) {
            if (tsbVar.a == 2) {
                return tsbVar.x.c(j, g7q0Var);
            }
        }
        return j;
    }

    @Override // defpackage.xe10
    public final long e(long j) {
        for (tsb tsbVar : this.L) {
            tsbVar.A(j);
        }
        for (tgo tgoVar : this.M) {
            int a = tw21.a(tgoVar.c, j, true);
            tgoVar.z = a;
            tgoVar.A = (tgoVar.w && a == tgoVar.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // defpackage.xe10
    public final long f() {
        tsb[] tsbVarArr = this.L;
        int length = tsbVarArr.length;
        for (int i = 0; i < length; i++) {
            tsb tsbVar = tsbVarArr[i];
            tsbVar.getClass();
            try {
                if (tsbVar.Q) {
                    return this.S;
                }
            } finally {
                tsbVar.Q = false;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.urq0
    public final long g() {
        return this.N.g();
    }

    @Override // defpackage.xe10
    public final yzz0 getTrackGroups() {
        return this.C;
    }

    @Override // defpackage.urq0
    public final void h(long j) {
        for (tsb tsbVar : this.L) {
            if (!tsbVar.B.d()) {
                long periodDurationUs = this.O.getPeriodDurationUs(this.P);
                uyl0 uyl0Var = tsbVar.F;
                d6z.x(!tsbVar.B.d());
                if (!tsbVar.w() && periodDurationUs != -9223372036854775807L && !tsbVar.D.isEmpty()) {
                    z35 u = tsbVar.u();
                    long j2 = u.E;
                    if (j2 == -9223372036854775807L) {
                        j2 = u.A;
                    }
                    if (j2 > periodDurationUs) {
                        long n = uyl0Var.n();
                        if (n > periodDurationUs) {
                            uyl0Var.i(periodDurationUs);
                            for (uyl0 uyl0Var2 : tsbVar.G) {
                                uyl0Var2.i(periodDurationUs);
                            }
                            tsbVar.z.i(tsbVar.a, periodDurationUs, n);
                        }
                    }
                }
            }
        }
        this.N.h(j);
    }

    @Override // defpackage.urq0
    public final long i() {
        return this.N.i();
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        return this.N.isLoading();
    }

    @Override // defpackage.xe10
    public final void j() {
        this.A.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xe10
    public final long k(loo[] looVarArr, boolean[] zArr, xyl0[] xyl0VarArr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        xzz0 xzz0Var;
        int i5;
        boolean z2;
        int[] iArr3 = new int[looVarArr.length];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = -1;
            if (i7 >= looVarArr.length) {
                break;
            }
            loo looVar = looVarArr[i7];
            if (looVar != null) {
                iArr3[i7] = this.C.b(looVar.getTrackGroup());
            } else {
                iArr3[i7] = -1;
            }
            i7++;
        }
        for (int i8 = 0; i8 < looVarArr.length; i8++) {
            if (looVarArr[i8] == null || !zArr[i8]) {
                xyl0 xyl0Var = xyl0VarArr[i8];
                if (xyl0Var instanceof tsb) {
                    ((tsb) xyl0Var).z(this);
                } else if (xyl0Var instanceof ssb) {
                    ssb ssbVar = (ssb) xyl0Var;
                    boolean[] zArr3 = ssbVar.x.w;
                    int i9 = ssbVar.c;
                    d6z.x(zArr3[i9]);
                    zArr3[i9] = false;
                }
                xyl0VarArr[i8] = null;
            }
        }
        int i10 = 0;
        while (true) {
            z = true;
            if (i10 >= looVarArr.length) {
                break;
            }
            xyl0 xyl0Var2 = xyl0VarArr[i10];
            if ((xyl0Var2 instanceof dxn) || (xyl0Var2 instanceof ssb)) {
                int b = b(i10, iArr3);
                if (b == -1) {
                    z2 = xyl0VarArr[i10] instanceof dxn;
                } else {
                    xyl0 xyl0Var3 = xyl0VarArr[i10];
                    z2 = (xyl0Var3 instanceof ssb) && ((ssb) xyl0Var3).a == xyl0VarArr[b];
                }
                if (!z2) {
                    xyl0 xyl0Var4 = xyl0VarArr[i10];
                    if (xyl0Var4 instanceof ssb) {
                        ssb ssbVar2 = (ssb) xyl0Var4;
                        boolean[] zArr4 = ssbVar2.x.w;
                        int i11 = ssbVar2.c;
                        d6z.x(zArr4[i11]);
                        zArr4[i11] = false;
                    }
                    xyl0VarArr[i10] = null;
                }
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < looVarArr.length) {
            loo looVar2 = looVarArr[i12];
            if (looVar2 == null) {
                iArr2 = iArr3;
                i2 = i6;
                i3 = i12;
            } else {
                xyl0 xyl0Var5 = xyl0VarArr[i12];
                if (xyl0Var5 == null) {
                    zArr2[i12] = z;
                    hgg hggVar = this.D[iArr3[i12]];
                    int i13 = hggVar.c;
                    if (i13 == 0) {
                        int i14 = hggVar.f;
                        boolean z3 = i14 != i ? z ? 1 : 0 : i6;
                        if (z3 != 0) {
                            xzz0Var = this.C.a(i14);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i6;
                            xzz0Var = null;
                        }
                        int i15 = hggVar.g;
                        ImmutableList p = i15 != i ? this.D[i15].h : ImmutableList.p();
                        int size = p.size() + i4;
                        a[] aVarArr = new a[size];
                        int[] iArr4 = new int[size];
                        if (z3 != 0) {
                            aVarArr[i6] = xzz0Var.d[i6];
                            iArr4[i6] = 5;
                            i5 = z ? 1 : 0;
                        } else {
                            i5 = i6;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i16 = i6; i16 < p.size(); i16++) {
                            a aVar = (a) p.get(i16);
                            aVarArr[i5] = aVar;
                            iArr4[i5] = 3;
                            arrayList.add(aVar);
                            i5 += z ? 1 : 0;
                        }
                        syc0 newPlayerTrackEmsgHandler = (!this.O.dynamic || z3 == 0) ? null : this.F.newPlayerTrackEmsgHandler();
                        iArr2 = iArr3;
                        i3 = i12;
                        syc0 syc0Var = newPlayerTrackEmsgHandler;
                        i2 = 0;
                        tsb tsbVar = new tsb(hggVar.b, iArr4, aVarArr, this.b.createDashChunkSource(this.A, this.O, this.y, this.P, hggVar.a, looVar2, hggVar.b, this.z, z3, arrayList, newPlayerTrackEmsgHandler, this.c, this.J, null), this, this.B, j, this.w, this.I, this.x, this.H, this.R);
                        synchronized (this) {
                            this.G.put(tsbVar, syc0Var);
                        }
                        xyl0VarArr[i3] = tsbVar;
                    } else {
                        iArr2 = iArr3;
                        i2 = i6;
                        i3 = i12;
                        if (i13 == 2) {
                            xyl0VarArr[i3] = new tgo((bho) this.Q.get(hggVar.d), looVar2.getTrackGroup().d[i2], this.O.dynamic);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i2 = i6;
                    i3 = i12;
                    if (xyl0Var5 instanceof tsb) {
                        ((dgg) ((tsb) xyl0Var5).x).i(looVar2);
                    }
                }
            }
            i12 = i3 + 1;
            i6 = i2;
            iArr3 = iArr2;
            i = -1;
            z = true;
        }
        int[] iArr5 = iArr3;
        boolean z4 = i6;
        int i17 = z4 ? 1 : 0;
        while (i17 < looVarArr.length) {
            if (xyl0VarArr[i17] != null || looVarArr[i17] == null) {
                iArr = iArr5;
            } else {
                hgg hggVar2 = this.D[iArr5[i17]];
                if (hggVar2.c == 1) {
                    iArr = iArr5;
                    int b2 = b(i17, iArr);
                    if (b2 != -1) {
                        tsb tsbVar2 = (tsb) xyl0VarArr[b2];
                        int i18 = hggVar2.b;
                        boolean[] zArr5 = tsbVar2.w;
                        uyl0[] uyl0VarArr = tsbVar2.G;
                        for (int i19 = z4 ? 1 : 0; i19 < uyl0VarArr.length; i19++) {
                            if (tsbVar2.b[i19] == i18) {
                                d6z.x(!zArr5[i19]);
                                zArr5[i19] = true;
                                uyl0VarArr[i19].C(j, true);
                                xyl0VarArr[i17] = new ssb(tsbVar2, tsbVar2, uyl0VarArr[i19], i19);
                            }
                        }
                        ny61.k();
                        return 0L;
                    }
                    xyl0VarArr[i17] = new dxn();
                    i17++;
                    iArr5 = iArr;
                } else {
                    iArr = iArr5;
                }
            }
            i17++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = xyl0VarArr.length;
        for (int i20 = z4 ? 1 : 0; i20 < length; i20++) {
            xyl0 xyl0Var6 = xyl0VarArr[i20];
            if (xyl0Var6 instanceof tsb) {
                arrayList2.add((tsb) xyl0Var6);
            } else if (xyl0Var6 instanceof tgo) {
                arrayList3.add((tgo) xyl0Var6);
            }
        }
        tsb[] tsbVarArr = new tsb[arrayList2.size()];
        this.L = tsbVarArr;
        arrayList2.toArray(tsbVarArr);
        tgo[] tgoVarArr = new tgo[arrayList3.size()];
        this.M = tgoVarArr;
        arrayList3.toArray(tgoVarArr);
        z8h z8hVar = this.E;
        AbstractList b3 = u.b(arrayList2, new x8e(14));
        z8hVar.getClass();
        this.N = new fsd(arrayList2, b3);
        if (this.R) {
            this.R = z4;
            this.S = j;
        }
        return j;
    }

    @Override // defpackage.xe10
    public final void l(we10 we10Var, long j) {
        this.K = we10Var;
        we10Var.onPrepared(this);
    }

    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        return this.N.n(xzyVar);
    }

    @Override // defpackage.trq0
    public final void onContinueLoadingRequested(urq0 urq0Var) {
        this.K.onContinueLoadingRequested(this);
    }

    @Override // defpackage.xe10
    public final void s(long j, boolean z) {
        for (tsb tsbVar : this.L) {
            tsbVar.s(j, z);
        }
    }
}
