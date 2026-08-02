package yads;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.fo8;
import xsna.h5s;

/* loaded from: classes10.dex */
public final class h30 implements qn1, uy2, ku {
    public final int b;
    public final a30 c;
    public final v93 d;
    public final tk0 e;
    public final ae0 f;
    public final vo g;
    public final long h;
    public final hh1 i;
    public final qe j;
    public final m83 k;
    public final g30[] l;
    public final hc0 m;
    public final vf2 n;
    public final co1 p;
    public final pk0 q;
    public final zf2 r;
    public pn1 s;
    public sy v;
    public c30 w;
    public int x;
    public List y;
    public static final Pattern z = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public lu[] t = a();
    public an0[] u = new an0[0];
    public final IdentityHashMap o = new IdentityHashMap();

    public h30(int i, c30 c30Var, vo voVar, int i2, a30 a30Var, v93 v93Var, tk0 tk0Var, pk0 pk0Var, ae0 ae0Var, co1 co1Var, long j, hh1 hh1Var, qe qeVar, hc0 hc0Var, com.monetization.ads.exo.source.dash.c cVar, zf2 zf2Var) {
        this.b = i;
        this.w = c30Var;
        this.g = voVar;
        this.x = i2;
        this.c = a30Var;
        this.d = v93Var;
        this.e = tk0Var;
        this.q = pk0Var;
        this.f = ae0Var;
        this.p = co1Var;
        this.h = j;
        this.i = hh1Var;
        this.j = qeVar;
        this.m = hc0Var;
        this.r = zf2Var;
        this.n = new vf2(c30Var, cVar, qeVar);
        lu[] luVarArr = this.t;
        hc0Var.getClass();
        this.v = hc0.a(luVarArr);
        gd2 a = c30Var.a(i2);
        List list = a.d;
        this.y = list;
        Pair a2 = a(tk0Var, a.c, list);
        this.k = (m83) a2.first;
        this.l = (g30[]) a2.second;
    }

    public static Pair a(tk0 tk0Var, List list, List list2) {
        int i;
        int i2;
        int i3;
        int i4;
        nx0[] nx0VarArr;
        int i5;
        wf0 a;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            sparseIntArray.put(((zb) list.get(i6)).a, i6);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            zb zbVar = (zb) list.get(i7);
            wf0 a2 = a("http://dashif.org/guidelines/trickmode", zbVar.e);
            if (a2 == null) {
                a2 = a("http://dashif.org/guidelines/trickmode", zbVar.f);
            }
            if (a2 == null || (i5 = sparseIntArray.get(Integer.parseInt(a2.b), -1)) == -1) {
                i5 = i7;
            }
            if (i5 == i7 && (a = a("urn:mpeg:dash:adaptation-set-switching:2016", zbVar.f)) != null) {
                String str = a.b;
                int i8 = mc3.a;
                for (String str2 : str.split(StringUtils.COMMA, -1)) {
                    int i9 = sparseIntArray.get(Integer.parseInt(str2), -1);
                    if (i9 != -1) {
                        i5 = Math.min(i5, i9);
                    }
                }
            }
            if (i5 != i7) {
                List list3 = (List) sparseArray.get(i7);
                List list4 = (List) sparseArray.get(i5);
                list4.addAll(list3);
                sparseArray.put(i7, list4);
                arrayList.remove(list3);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i10 = 0; i10 < size2; i10++) {
            int[] a3 = wd1.a((Collection) arrayList.get(i10));
            iArr[i10] = a3;
            Arrays.sort(a3);
        }
        boolean[] zArr = new boolean[size2];
        nx0[][] nx0VarArr2 = new nx0[size2][];
        int i11 = 0;
        for (int i12 = 0; i12 < size2; i12++) {
            int[] iArr2 = iArr[i12];
            int length = iArr2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                List list5 = ((zb) list.get(iArr2[i13])).c;
                for (int i14 = 0; i14 < list5.size(); i14++) {
                    if (!((mp2) list5.get(i14)).d.isEmpty()) {
                        zArr[i12] = true;
                        i11++;
                        break;
                    }
                }
                i13++;
            }
            int[] iArr3 = iArr[i12];
            int length2 = iArr3.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    nx0VarArr = new nx0[0];
                    break;
                }
                int i16 = iArr3[i15];
                zb zbVar2 = (zb) list.get(i16);
                List list6 = ((zb) list.get(i16)).d;
                for (int i17 = 0; i17 < list6.size(); i17++) {
                    wf0 wf0Var = (wf0) list6.get(i17);
                    if ("urn:scte:dash:cc:cea-608:2015".equals(wf0Var.a)) {
                        mx0 mx0Var = new mx0();
                        mx0Var.k = MimeTypes.APPLICATION_CEA608;
                        mx0Var.a = h5s.c(zbVar2.a, ":cea608", new StringBuilder());
                        nx0VarArr = a(wf0Var, z, new nx0(mx0Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(wf0Var.a)) {
                        mx0 mx0Var2 = new mx0();
                        mx0Var2.k = MimeTypes.APPLICATION_CEA708;
                        mx0Var2.a = h5s.c(zbVar2.a, ":cea708", new StringBuilder());
                        nx0VarArr = a(wf0Var, A, new nx0(mx0Var2));
                        break;
                    }
                }
                i15++;
            }
            nx0VarArr2[i12] = nx0VarArr;
            if (nx0VarArr.length != 0) {
                i11++;
            }
        }
        int size3 = list2.size() + i11 + size2;
        l83[] l83VarArr = new l83[size3];
        g30[] g30VarArr = new g30[size3];
        int i18 = 0;
        int i19 = 0;
        while (i18 < size2) {
            int[] iArr4 = iArr[i18];
            ArrayList arrayList3 = new ArrayList();
            for (int i20 : iArr4) {
                arrayList3.addAll(((zb) list.get(i20)).c);
            }
            int size4 = arrayList3.size();
            nx0[] nx0VarArr3 = new nx0[size4];
            int i21 = 0;
            while (i21 < size4) {
                nx0 nx0Var = ((mp2) arrayList3.get(i21)).a;
                int i22 = size2;
                int a4 = tk0Var.a(nx0Var);
                int[][] iArr5 = iArr;
                mx0 mx0Var3 = new mx0(nx0Var);
                mx0Var3.D = a4;
                nx0VarArr3[i21] = new nx0(mx0Var3);
                i21++;
                size4 = size4;
                size2 = i22;
                iArr = iArr5;
            }
            int i23 = size2;
            int[][] iArr6 = iArr;
            zb zbVar3 = (zb) list.get(iArr4[0]);
            int i24 = zbVar3.a;
            String num = i24 != -1 ? Integer.toString(i24) : nh2.a("unset:", i18);
            int i25 = i19 + 1;
            if (zArr[i18]) {
                i = i19 + 2;
            } else {
                i = i25;
                i25 = -1;
            }
            if (nx0VarArr2[i18].length != 0) {
                i2 = i + 1;
            } else {
                i2 = i;
                i = -1;
            }
            l83VarArr[i19] = new l83(num, nx0VarArr3);
            int i26 = i25;
            g30VarArr[i19] = new g30(zbVar3.b, 0, iArr4, i19, i26, i, -1);
            if (i26 != -1) {
                String a5 = fo8.a(num, ":emsg");
                mx0 mx0Var4 = new mx0();
                mx0Var4.a = a5;
                mx0Var4.k = MimeTypes.APPLICATION_EMSG;
                l83VarArr[i26] = new l83(a5, new nx0(mx0Var4));
                i3 = i;
                g30VarArr[i26] = new g30(5, 1, iArr4, i19, -1, -1, -1);
                i4 = -1;
            } else {
                i3 = i;
                i4 = -1;
            }
            if (i3 != i4) {
                l83VarArr[i3] = new l83(fo8.a(num, ":cc"), nx0VarArr2[i18]);
                g30VarArr[i3] = new g30(3, 1, iArr4, i19, -1, -1, -1);
            }
            i18++;
            i19 = i2;
            size2 = i23;
            iArr = iArr6;
        }
        int i27 = 0;
        while (i27 < list2.size()) {
            bn0 bn0Var = (bn0) list2.get(i27);
            mx0 mx0Var5 = new mx0();
            mx0Var5.a = bn0Var.c + DomExceptionUtils.SEPARATOR + bn0Var.d;
            mx0Var5.k = MimeTypes.APPLICATION_EMSG;
            nx0 nx0Var2 = new nx0(mx0Var5);
            StringBuilder sb = new StringBuilder();
            sb.append(bn0Var.c + DomExceptionUtils.SEPARATOR + bn0Var.d);
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(i27);
            l83VarArr[i19] = new l83(sb.toString(), nx0Var2);
            int i28 = i27;
            g30VarArr[i19] = new g30(5, 2, new int[0], -1, -1, -1, i28);
            i27 = i28 + 1;
            i19++;
        }
        return Pair.create(new m83(l83VarArr), g30VarArr);
    }

    @Override // yads.vy2
    public final boolean continueLoading(long j) {
        return this.v.continueLoading(j);
    }

    @Override // yads.qn1
    public final void discardBuffer(long j, boolean z2) {
        long j2;
        for (lu luVar : this.t) {
            if (!luVar.c()) {
                nt2 nt2Var = luVar.n;
                int i = nt2Var.q;
                nt2Var.a(j, z2, true);
                nt2 nt2Var2 = luVar.n;
                int i2 = nt2Var2.q;
                if (i2 > i) {
                    synchronized (nt2Var2) {
                        j2 = nt2Var2.p == 0 ? Long.MIN_VALUE : nt2Var2.n[nt2Var2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        nt2[] nt2VarArr = luVar.o;
                        if (i3 >= nt2VarArr.length) {
                            break;
                        }
                        nt2VarArr[i3].a(j2, z2, luVar.e[i3]);
                        i3++;
                    }
                }
                int min = Math.min(luVar.a(i2, 0), luVar.v);
                if (min > 0) {
                    ArrayList arrayList = luVar.l;
                    int i4 = mc3.a;
                    if (min > arrayList.size() || min < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (min != 0) {
                        arrayList.subList(0, min).clear();
                    }
                    luVar.v -= min;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // yads.vy2
    public final long getBufferedPositionUs() {
        return this.v.getBufferedPositionUs();
    }

    @Override // yads.vy2
    public final long getNextLoadPositionUs() {
        return this.v.getNextLoadPositionUs();
    }

    @Override // yads.qn1
    public final m83 getTrackGroups() {
        return this.k;
    }

    @Override // yads.vy2
    public final boolean isLoading() {
        return this.v.isLoading();
    }

    @Override // yads.qn1
    public final void maybeThrowPrepareError() {
        this.i.a();
    }

    @Override // yads.qn1
    public final long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // yads.vy2
    public final void reevaluateBuffer(long j) {
        this.v.reevaluateBuffer(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x007b, code lost:
    
        if (r10.n.b(r18, r18 < r10.getNextLoadPositionUs()) != false) goto L43;
     */
    @Override // yads.qn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long seekToUs(long j) {
        jo joVar;
        lu[] luVarArr = this.t;
        int length = luVarArr.length;
        for (int i = 0; i < length; i++) {
            lu luVar = luVarArr[i];
            luVar.u = j;
            if (luVar.c()) {
                luVar.t = j;
            } else {
                for (int i2 = 0; i2 < luVar.l.size(); i2++) {
                    joVar = (jo) luVar.l.get(i2);
                    long j2 = joVar.g;
                    if (j2 == j && joVar.k == C.TIME_UNSET) {
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                }
                joVar = null;
                if (joVar != null) {
                    nt2 nt2Var = luVar.n;
                    int a = joVar.a(0);
                    synchronized (nt2Var) {
                        nt2Var.e();
                        int i3 = nt2Var.q;
                        if (a >= i3 && a <= nt2Var.p + i3) {
                            nt2Var.t = Long.MIN_VALUE;
                            nt2Var.s = a - i3;
                            nt2 nt2Var2 = luVar.n;
                            luVar.v = luVar.a(nt2Var2.q + nt2Var2.s, 0);
                            nt2[] nt2VarArr = luVar.o;
                            for (nt2 nt2Var3 : nt2VarArr) {
                                nt2Var3.b(j, true);
                            }
                        }
                        luVar.t = j;
                        luVar.x = false;
                        luVar.l.clear();
                        luVar.v = 0;
                        if (luVar.j.b()) {
                            luVar.n.a();
                            for (nt2 nt2Var4 : luVar.o) {
                                nt2Var4.a();
                            }
                            bh1 bh1Var = luVar.j.b;
                            if (bh1Var == null) {
                                throw new IllegalStateException();
                            }
                            bh1Var.a(false);
                        } else {
                            luVar.j.c = null;
                            luVar.n.b(false);
                            for (nt2 nt2Var5 : luVar.o) {
                                nt2Var5.b(false);
                            }
                        }
                    }
                }
            }
        }
        for (an0 an0Var : this.u) {
            int a2 = mc3.a(an0Var.d, j, true);
            an0Var.h = a2;
            an0Var.i = (an0Var.e && a2 == an0Var.d.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    public static wf0 a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            wf0 wf0Var = (wf0) list.get(i);
            if (str.equals(wf0Var.a)) {
                return wf0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r3 < (((r5.d.b() + r5.f) + r10) - 1)) goto L18;
     */
    @Override // yads.qn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, ay2 ay2Var) {
        long j2;
        long j3;
        long j4 = j;
        lu[] luVarArr = this.t;
        int length = luVarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            lu luVar = luVarArr[i2];
            if (luVar.b == 2) {
                lc0[] lc0VarArr = ((nc0) luVar.f).h;
                int length2 = lc0VarArr.length;
                while (i < length2) {
                    lc0 lc0Var = lc0VarArr[i];
                    i30 i30Var = lc0Var.d;
                    if (i30Var != null) {
                        long a = i30Var.a(j4, lc0Var.e);
                        long j5 = lc0Var.f;
                        long j6 = a + j5;
                        long a2 = lc0Var.d.a(j6 - j5);
                        long c = lc0Var.d.c(lc0Var.e);
                        if (a2 < j4) {
                            long j7 = c != -1 ? 1L : 1L;
                            j3 = lc0Var.d.a((j6 + j7) - lc0Var.f);
                            j2 = a2;
                            return ay2Var.a(j4, j2, j3);
                        }
                        j2 = a2;
                        j3 = j2;
                        return ay2Var.a(j4, j2, j3);
                    }
                    i++;
                    j4 = j;
                }
            } else {
                i2++;
                j4 = j;
            }
        }
        return j;
    }

    public static lu[] a() {
        return new lu[0];
    }

    @Override // yads.uy2
    public final void a(vy2 vy2Var) {
        this.s.a((vy2) this);
    }

    public static nx0[] a(wf0 wf0Var, Pattern pattern, nx0 nx0Var) {
        String str = wf0Var.b;
        if (str == null) {
            return new nx0[]{nx0Var};
        }
        int i = mc3.a;
        String[] split = str.split(";", -1);
        nx0[] nx0VarArr = new nx0[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            Matcher matcher = pattern.matcher(split[i2]);
            if (!matcher.matches()) {
                return new nx0[]{nx0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            mx0 mx0Var = new mx0(nx0Var);
            mx0Var.a = nx0Var.b + StringUtils.PROCESS_POSTFIX_DELIMITER + parseInt;
            mx0Var.C = parseInt;
            mx0Var.c = matcher.group(2);
            nx0VarArr[i2] = new nx0(mx0Var);
        }
        return nx0VarArr;
    }

    @Override // yads.qn1
    public final void a(pn1 pn1Var, long j) {
        this.s = pn1Var;
        pn1Var.a((qn1) this);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    @Override // yads.qn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(pp0[] pp0VarArr, boolean[] zArr, ot2[] ot2VarArr, boolean[] zArr2, long j) {
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        l83 l83Var;
        l83 l83Var2;
        int i5;
        uf2 uf2Var;
        int i6;
        ot2 ot2Var;
        int length = pp0VarArr.length;
        int[] iArr2 = new int[length];
        int i7 = 0;
        while (true) {
            if (i7 >= pp0VarArr.length) {
                break;
            }
            pp0 pp0Var = pp0VarArr[i7];
            if (pp0Var != null) {
                int indexOf = this.k.c.indexOf(pp0Var.b());
                iArr2[i7] = indexOf >= 0 ? indexOf : -1;
            } else {
                iArr2[i7] = -1;
            }
            i7++;
        }
        for (int i8 = 0; i8 < pp0VarArr.length; i8++) {
            if (pp0VarArr[i8] == null || !zArr[i8]) {
                ot2 ot2Var2 = ot2VarArr[i8];
                if (ot2Var2 instanceof lu) {
                    lu luVar = (lu) ot2Var2;
                    luVar.s = this;
                    nt2 nt2Var = luVar.n;
                    nt2Var.a();
                    nt2Var.d();
                    for (nt2 nt2Var2 : luVar.o) {
                        nt2Var2.a();
                        nt2Var2.d();
                    }
                    luVar.j.a(luVar);
                } else if (ot2Var2 instanceof ju) {
                    ju juVar = (ju) ot2Var2;
                    boolean[] zArr3 = juVar.f.e;
                    int i9 = juVar.d;
                    if (zArr3[i9]) {
                        zArr3[i9] = false;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                ot2VarArr[i8] = null;
            }
        }
        for (int i10 = 0; i10 < pp0VarArr.length; i10++) {
            ot2 ot2Var3 = ot2VarArr[i10];
            if ((ot2Var3 instanceof xl0) || (ot2Var3 instanceof ju)) {
                int i11 = iArr2[i10];
                if (i11 != -1) {
                    int i12 = this.l[i11].e;
                    i6 = 0;
                    while (i6 < length) {
                        int i13 = iArr2[i6];
                        if (i13 == i12 && this.l[i13].c == 0) {
                            break;
                        }
                        i6++;
                    }
                }
                i6 = -1;
                if (i6 == -1) {
                    if (ot2VarArr[i10] instanceof xl0) {
                        continue;
                    }
                    ot2Var = ot2VarArr[i10];
                    if (ot2Var instanceof ju) {
                        ju juVar2 = (ju) ot2Var;
                        boolean[] zArr4 = juVar2.f.e;
                        int i14 = juVar2.d;
                        if (zArr4[i14]) {
                            zArr4[i14] = false;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    ot2VarArr[i10] = null;
                } else {
                    ot2 ot2Var4 = ot2VarArr[i10];
                    if ((ot2Var4 instanceof ju) && ((ju) ot2Var4).b == ot2VarArr[i6]) {
                    }
                    ot2Var = ot2VarArr[i10];
                    if (ot2Var instanceof ju) {
                    }
                    ot2VarArr[i10] = null;
                }
            }
        }
        int i15 = 0;
        while (i15 < pp0VarArr.length) {
            pp0 pp0Var2 = pp0VarArr[i15];
            if (pp0Var2 == null) {
                iArr = iArr2;
                i3 = i15;
            } else {
                ot2 ot2Var5 = ot2VarArr[i15];
                if (ot2Var5 == null) {
                    zArr2[i15] = true;
                    g30 g30Var = this.l[iArr2[i15]];
                    int i16 = g30Var.c;
                    if (i16 == 0) {
                        int i17 = g30Var.f;
                        boolean z2 = i17 != i;
                        if (z2) {
                            l83Var = this.k.a(i17);
                            i4 = 1;
                        } else {
                            i4 = 0;
                            l83Var = null;
                        }
                        int i18 = g30Var.g;
                        boolean z3 = i18 != i;
                        if (z3) {
                            l83Var2 = this.k.a(i18);
                            i4 += l83Var2.b;
                        } else {
                            l83Var2 = null;
                        }
                        nx0[] nx0VarArr = new nx0[i4];
                        int[] iArr3 = new int[i4];
                        if (z2) {
                            nx0VarArr[0] = l83Var.e[0];
                            iArr3[0] = 5;
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z3) {
                            for (int i19 = 0; i19 < l83Var2.b; i19++) {
                                nx0 nx0Var = l83Var2.e[i19];
                                nx0VarArr[i5] = nx0Var;
                                iArr3[i5] = 3;
                                arrayList.add(nx0Var);
                                i5++;
                            }
                        }
                        if (this.w.d && z2) {
                            vf2 vf2Var = this.n;
                            uf2Var = new uf2(vf2Var, vf2Var.b);
                        } else {
                            uf2Var = null;
                        }
                        a30 a30Var = this.c;
                        hh1 hh1Var = this.i;
                        c30 c30Var = this.w;
                        vo voVar = this.g;
                        int i20 = this.x;
                        int[] iArr4 = g30Var.a;
                        iArr = iArr2;
                        int i21 = g30Var.b;
                        i3 = i15;
                        long j2 = this.h;
                        v93 v93Var = this.d;
                        zf2 zf2Var = this.r;
                        kc0 kc0Var = (kc0) a30Var;
                        p30 createDataSource = kc0Var.a.createDataSource();
                        if (v93Var != null) {
                            createDataSource.a(v93Var);
                        }
                        uf2 uf2Var2 = uf2Var;
                        lu luVar2 = new lu(g30Var.b, iArr3, nx0VarArr, new nc0(kc0Var.b, hh1Var, c30Var, voVar, i20, iArr4, pp0Var2, i21, createDataSource, j2, z2, arrayList, uf2Var, zf2Var), this, this.j, j, this.e, this.q, this.f, this.p);
                        synchronized (this) {
                            this.o.put(luVar2, uf2Var2);
                        }
                        ot2VarArr[i3] = luVar2;
                    } else {
                        iArr = iArr2;
                        i3 = i15;
                        if (i16 == 2) {
                            ot2VarArr[i3] = new an0((bn0) this.y.get(g30Var.d), pp0Var2.b().e[0], this.w.d);
                        }
                    }
                } else {
                    iArr = iArr2;
                    i3 = i15;
                    if (ot2Var5 instanceof lu) {
                        ((nc0) ((lu) ot2Var5).f).i = pp0Var2;
                    }
                }
            }
            i15 = i3 + 1;
            iArr2 = iArr;
            i = -1;
        }
        int[] iArr5 = iArr2;
        for (int i22 = 0; i22 < pp0VarArr.length; i22++) {
            if (ot2VarArr[i22] == null && pp0VarArr[i22] != null) {
                int i23 = iArr5[i22];
                g30 g30Var2 = this.l[i23];
                if (g30Var2.c == 1) {
                    if (i23 != -1) {
                        int i24 = g30Var2.e;
                        i2 = 0;
                        while (i2 < length) {
                            int i25 = iArr5[i2];
                            if (i25 == i24 && this.l[i25].c == 0) {
                                break;
                            }
                            i2++;
                        }
                    }
                    i2 = -1;
                    if (i2 == -1) {
                        ot2VarArr[i22] = new xl0();
                    } else {
                        lu luVar3 = (lu) ot2VarArr[i2];
                        int i26 = g30Var2.b;
                        int i27 = 0;
                        while (true) {
                            nt2[] nt2VarArr = luVar3.o;
                            if (i27 < nt2VarArr.length) {
                                if (luVar3.c[i27] == i26) {
                                    boolean[] zArr5 = luVar3.e;
                                    if (!zArr5[i27]) {
                                        zArr5[i27] = true;
                                        nt2VarArr[i27].b(j, true);
                                        ot2VarArr[i22] = new ju(luVar3, luVar3, luVar3.o[i27], i27);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    i27++;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (ot2 ot2Var6 : ot2VarArr) {
            if (ot2Var6 instanceof lu) {
                arrayList2.add((lu) ot2Var6);
            } else if (ot2Var6 instanceof an0) {
                arrayList3.add((an0) ot2Var6);
            }
        }
        lu[] luVarArr = new lu[arrayList2.size()];
        this.t = luVarArr;
        arrayList2.toArray(luVarArr);
        an0[] an0VarArr = new an0[arrayList3.size()];
        this.u = an0VarArr;
        arrayList3.toArray(an0VarArr);
        hc0 hc0Var = this.m;
        lu[] luVarArr2 = this.t;
        hc0Var.getClass();
        this.v = new sy(luVarArr2);
        return j;
    }
}
