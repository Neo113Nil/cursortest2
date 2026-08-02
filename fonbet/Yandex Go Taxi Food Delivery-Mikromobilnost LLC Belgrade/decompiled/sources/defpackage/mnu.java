package defpackage;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.u;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class mnu implements xe10, cou {
    public final xf10 A;
    public final au1 B;
    public final IdentityHashMap C;
    public final tez0 D;
    public final z8h E;
    public final boolean F;
    public final int G;
    public final vyc0 H;
    public final h2t I = new h2t(this);
    public we10 J;
    public int K;
    public yzz0 L;
    public hou[] M;
    public hou[] N;
    public int O;
    public fsd P;
    public final jch a;
    public final mch b;
    public final gyc c;
    public final cj01 w;
    public final qmm x;
    public final mmm y;
    public final twy z;

    public mnu(jch jchVar, mch mchVar, gyc gycVar, cj01 cj01Var, qmm qmmVar, mmm mmmVar, twy twyVar, xf10 xf10Var, au1 au1Var, z8h z8hVar, boolean z, int i, vyc0 vyc0Var) {
        this.a = jchVar;
        this.b = mchVar;
        this.c = gycVar;
        this.w = cj01Var;
        this.x = qmmVar;
        this.y = mmmVar;
        this.z = twyVar;
        this.A = xf10Var;
        this.B = au1Var;
        this.E = z8hVar;
        this.F = z;
        this.G = i;
        this.H = vyc0Var;
        z8hVar.getClass();
        this.P = new fsd(ImmutableList.p(), ImmutableList.p());
        this.C = new IdentityHashMap();
        this.D = new tez0();
        this.M = new hou[0];
        this.N = new hou[0];
    }

    public static a m(a aVar, a aVar2, boolean z) {
        w820 w820Var;
        int i;
        String str;
        String str2;
        ImmutableList immutableList;
        int i2;
        int i3;
        String str3;
        ImmutableList p = ImmutableList.p();
        if (aVar2 != null) {
            str2 = aVar2.k;
            w820Var = aVar2.l;
            i2 = aVar2.D;
            i = aVar2.e;
            i3 = aVar2.f;
            str = aVar2.d;
            str3 = aVar2.b;
            immutableList = aVar2.c;
        } else {
            String w = tw21.w(1, aVar.k);
            w820Var = aVar.l;
            if (z) {
                i2 = aVar.D;
                i = aVar.e;
                i3 = aVar.f;
                str = aVar.d;
                str3 = aVar.b;
                str2 = w;
                immutableList = aVar.c;
            } else {
                i = 0;
                str = null;
                str2 = w;
                immutableList = p;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String e = eh20.e(str2);
        int i4 = z ? aVar.h : -1;
        int i5 = z ? aVar.i : -1;
        f7s f7sVar = new f7s();
        f7sVar.a = aVar.a;
        f7sVar.b = str3;
        f7sVar.c = ImmutableList.l(immutableList);
        f7sVar.l = eh20.q(aVar.m);
        f7sVar.m = eh20.q(e);
        f7sVar.j = str2;
        f7sVar.k = w820Var;
        f7sVar.h = i4;
        f7sVar.i = i5;
        f7sVar.C = i2;
        f7sVar.e = i;
        f7sVar.f = i3;
        f7sVar.d = str;
        return new a(f7sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if ((r8 != null ? androidx.media3.exoplayer.hls.playlist.a.a(r8, r4) ^ r13 : false) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0058 A[SYNTHETIC] */
    @Override // defpackage.cou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Uri uri, swy swyVar, boolean z) {
        boolean z2;
        long j;
        int i;
        boolean z3;
        int indexOf;
        rwy fallbackSelectionFor;
        boolean z4 = true;
        for (hou houVar : this.M) {
            inu inuVar = houVar.w;
            Uri[] uriArr = inuVar.e;
            if (tw21.l(uriArr, uri)) {
                if (!z && (fallbackSelectionFor = houVar.B.getFallbackSelectionFor(s001.a(inuVar.q), swyVar)) != null && fallbackSelectionFor.a == 2) {
                    z2 = true;
                    j = fallbackSelectionFor.b;
                    i = 0;
                    while (true) {
                        if (i < uriArr.length) {
                            i = -1;
                            break;
                        }
                        if (uriArr[i].equals(uri)) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1 && (indexOf = inuVar.q.indexOf(i)) != -1) {
                        inuVar.s |= uri.equals(inuVar.o);
                        if (j != -9223372036854775807L) {
                            if (inuVar.q.excludeTrack(indexOf, j)) {
                                androidx.media3.exoplayer.hls.playlist.a aVar = (androidx.media3.exoplayer.hls.playlist.a) inuVar.g.w.get(uri);
                            }
                            z3 = false;
                        }
                    }
                    if (j != -9223372036854775807L) {
                        z3 = z2;
                    }
                    z3 = false;
                }
                z2 = true;
                j = -9223372036854775807L;
                i = 0;
                while (true) {
                    if (i < uriArr.length) {
                    }
                    i++;
                }
                if (i != -1) {
                    inuVar.s |= uri.equals(inuVar.o);
                    if (j != -9223372036854775807L) {
                    }
                }
                if (j != -9223372036854775807L) {
                }
                z3 = false;
            } else {
                z3 = true;
            }
            z4 &= z3;
        }
        this.J.onContinueLoadingRequested(this);
        return z4;
    }

    @Override // defpackage.cou
    public final void b() {
        for (hou houVar : this.M) {
            androidx.media3.exoplayer.upstream.a aVar = houVar.C;
            ArrayList arrayList = houVar.G;
            if (!arrayList.isEmpty()) {
                lnu lnuVar = (lnu) eab1.c(arrayList);
                int b = houVar.w.b(lnuVar);
                if (b == 1) {
                    lnuVar.f0 = true;
                } else if (b == 0) {
                    houVar.K.post(new qpo(26, houVar, lnuVar));
                } else if (b == 2 && !houVar.o0 && aVar.d()) {
                    aVar.a();
                }
            }
        }
        this.J.onContinueLoadingRequested(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xe10
    public final long c(long j, g7q0 g7q0Var) {
        hou[] houVarArr = this.N;
        int length = houVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            hou houVar = houVarArr[i];
            if (houVar.T == 2) {
                inu inuVar = houVar.w;
                mch mchVar = inuVar.g;
                int selectedIndex = inuVar.q.getSelectedIndex();
                Uri[] uriArr = inuVar.e;
                unu a = (selectedIndex >= uriArr.length || selectedIndex == -1) ? null : mchVar.a(uriArr[inuVar.q.getSelectedIndexInTrackGroup()], true);
                if (a != null) {
                    ImmutableList immutableList = a.r;
                    if (!immutableList.isEmpty()) {
                        long j2 = a.h - mchVar.G;
                        long j3 = j - j2;
                        int c = tw21.c(immutableList, Long.valueOf(j3), true);
                        long j4 = ((rnu) immutableList.get(c)).x;
                        return g7q0Var.a(j3, j4, (!a.c || c == immutableList.size() - 1) ? j4 : ((rnu) immutableList.get(c + 1)).x) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    public final hou d(String str, int i, Uri[] uriArr, a[] aVarArr, a aVar, List list, Map map, long j) {
        return new hou(str, i, this.I, new inu(this.a, this.b, uriArr, aVarArr, this.c, this.w, this.D, list, this.H), map, this.B, j, aVar, this.x, this.y, this.z, this.A, this.G);
    }

    @Override // defpackage.xe10
    public final long e(long j) {
        hou[] houVarArr = this.N;
        if (houVarArr.length > 0) {
            boolean G = houVarArr[0].G(j, false);
            int i = 1;
            while (true) {
                hou[] houVarArr2 = this.N;
                if (i >= houVarArr2.length) {
                    break;
                }
                houVarArr2[i].G(j, G);
                i++;
            }
            if (G) {
                this.D.a.clear();
            }
        }
        return j;
    }

    @Override // defpackage.xe10
    public final long f() {
        return -9223372036854775807L;
    }

    @Override // defpackage.urq0
    public final long g() {
        return this.P.g();
    }

    @Override // defpackage.xe10
    public final yzz0 getTrackGroups() {
        yzz0 yzz0Var = this.L;
        yzz0Var.getClass();
        return yzz0Var;
    }

    @Override // defpackage.urq0
    public final void h(long j) {
        this.P.h(j);
    }

    @Override // defpackage.urq0
    public final long i() {
        return this.P.i();
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        return this.P.isLoading();
    }

    @Override // defpackage.xe10
    public final void j() {
        for (hou houVar : this.M) {
            houVar.D();
            if (houVar.o0 && !houVar.W) {
                throw ParserException.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x011e, code lost:
    
        if (r44 != r3.k0) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ac  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.xe10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(loo[] looVarArr, boolean[] zArr, xyl0[] xyl0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        xyl0[] xyl0VarArr2;
        int[] iArr;
        boolean z;
        ?? r9;
        inu inuVar;
        int i;
        int i2;
        xyl0[] xyl0VarArr3;
        int i3;
        int[] iArr2;
        hou[] houVarArr;
        hou houVar;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        ?? r10;
        int i7;
        int i8;
        loo[] looVarArr2;
        int[] iArr3 = new int[looVarArr.length];
        int[] iArr4 = new int[looVarArr.length];
        int i9 = 0;
        while (true) {
            int length = looVarArr.length;
            identityHashMap = this.C;
            if (i9 >= length) {
                break;
            }
            xyl0 xyl0Var = xyl0VarArr[i9];
            iArr3[i9] = xyl0Var == null ? -1 : ((Integer) identityHashMap.get(xyl0Var)).intValue();
            iArr4[i9] = -1;
            loo looVar = looVarArr[i9];
            if (looVar != null) {
                xzz0 trackGroup = looVar.getTrackGroup();
                int i10 = 0;
                while (true) {
                    hou[] houVarArr2 = this.M;
                    if (i10 < houVarArr2.length) {
                        hou houVar2 = houVarArr2[i10];
                        houVar2.q();
                        if (houVar2.d0.b(trackGroup) != -1) {
                            iArr4[i9] = i10;
                            break;
                        }
                        i10++;
                    }
                }
            }
            i9++;
        }
        identityHashMap.clear();
        int length2 = looVarArr.length;
        xyl0[] xyl0VarArr4 = new xyl0[length2];
        int length3 = looVarArr.length;
        xyl0[] xyl0VarArr5 = new xyl0[length3];
        int length4 = looVarArr.length;
        loo[] looVarArr3 = new loo[length4];
        boolean z5 = false;
        hou[] houVarArr3 = new hou[this.M.length];
        int i11 = length3;
        int i12 = 0;
        int i13 = 0;
        boolean z6 = false;
        while (i12 < this.M.length) {
            int i14 = length2;
            ?? r7 = z5;
            while (true) {
                xyl0VarArr2 = xyl0VarArr4;
                if (r7 >= looVarArr.length) {
                    break;
                }
                xyl0VarArr5[r7] = iArr3[r7] == i12 ? xyl0VarArr[r7] : null;
                looVarArr3[r7] = iArr4[r7] == i12 ? looVarArr[r7] : null;
                xyl0VarArr4 = xyl0VarArr2;
                r7++;
            }
            hou houVar3 = this.M[i12];
            androidx.media3.exoplayer.upstream.a aVar = houVar3.C;
            int i15 = i12;
            inu inuVar2 = houVar3.w;
            Uri[] uriArr = inuVar2.e;
            mch mchVar = inuVar2.g;
            ArrayList arrayList = houVar3.G;
            houVar3.q();
            int i16 = houVar3.Z;
            ?? r29 = xyl0VarArr5;
            ?? r72 = z5;
            while (r72 < length4) {
                dou douVar = (dou) r29[r72];
                if (douVar == null || (looVarArr3[r72] != null && zArr[r72])) {
                    i8 = r72;
                    looVarArr2 = looVarArr3;
                } else {
                    i8 = r72;
                    houVar3.Z--;
                    looVarArr2 = looVarArr3;
                    if (douVar.c != -1) {
                        hou houVar4 = douVar.b;
                        int i17 = douVar.a;
                        houVar4.q();
                        houVar4.f0.getClass();
                        int i18 = houVar4.f0[i17];
                        d6z.x(houVar4.i0[i18]);
                        houVar4.i0[i18] = z5;
                        douVar.c = -1;
                    }
                    r29[i8] = 0;
                }
                looVarArr3 = looVarArr2;
                r72 = i8 + 1;
            }
            loo[] looVarArr4 = looVarArr3;
            boolean z7 = true;
            if (!z6) {
                if (!houVar3.n0) {
                    iArr = iArr3;
                } else if (i16 != 0) {
                    iArr = iArr3;
                }
                z = z5;
                loo looVar2 = inuVar2.q;
                boolean z8 = z;
                loo looVar3 = looVar2;
                r9 = z5;
                while (r9 < length4) {
                    int i19 = r9;
                    loo looVar4 = looVarArr4[i19];
                    if (looVar4 == null) {
                        i7 = length4;
                    } else {
                        i7 = length4;
                        boolean z9 = z8;
                        int b = houVar3.d0.b(looVar4.getTrackGroup());
                        if (b == houVar3.g0) {
                            androidx.media3.exoplayer.hls.playlist.a aVar2 = (androidx.media3.exoplayer.hls.playlist.a) mchVar.w.get(uriArr[inuVar2.q.getSelectedIndexInTrackGroup()]);
                            if (aVar2 != null) {
                                aVar2.D = z5;
                            }
                            inuVar2.q = looVar4;
                            looVar3 = looVar4;
                        }
                        if (r29[i19] == 0) {
                            houVar3.Z++;
                            dou douVar2 = new dou(houVar3, b);
                            r29[i19] = douVar2;
                            zArr2[i19] = z7;
                            if (houVar3.f0 != null) {
                                douVar2.a();
                                if (!z9) {
                                    gou gouVar = houVar3.O[houVar3.f0[b]];
                                    z8 = (gouVar.p() == 0 || gouVar.C(j, z7)) ? false : true;
                                }
                            }
                        }
                        z8 = z9;
                    }
                    length4 = i7;
                    z5 = false;
                    z7 = true;
                    r9 = i19 + 1;
                }
                int i20 = length4;
                boolean z10 = z8;
                if (houVar3.Z != 0) {
                    androidx.media3.exoplayer.hls.playlist.a aVar3 = (androidx.media3.exoplayer.hls.playlist.a) mchVar.w.get(uriArr[inuVar2.q.getSelectedIndexInTrackGroup()]);
                    if (aVar3 != null) {
                        aVar3.D = false;
                    }
                    inuVar2.n = null;
                    houVar3.b0 = null;
                    houVar3.m0 = true;
                    arrayList.clear();
                    if (aVar.d()) {
                        if (houVar3.V) {
                            for (gou gouVar2 : houVar3.O) {
                                gouVar2.h();
                            }
                        }
                        aVar.a();
                    } else {
                        houVar3.F();
                    }
                    inuVar = inuVar2;
                    i4 = i11;
                    i2 = i14;
                    xyl0VarArr3 = xyl0VarArr2;
                    i3 = i15;
                    z3 = z10;
                    iArr2 = iArr4;
                    houVarArr = houVarArr3;
                    houVar = houVar3;
                } else {
                    boolean z11 = true;
                    if (arrayList.isEmpty() || Objects.equals(looVar3, looVar2)) {
                        inuVar = inuVar2;
                        i = i11;
                        i2 = i14;
                        xyl0VarArr3 = xyl0VarArr2;
                        i3 = i15;
                        iArr2 = iArr4;
                        houVarArr = houVarArr3;
                        houVar = houVar3;
                    } else {
                        if (houVar3.n0) {
                            inuVar = inuVar2;
                            i = i11;
                            i2 = i14;
                            xyl0VarArr3 = xyl0VarArr2;
                            i3 = i15;
                            iArr2 = iArr4;
                            houVarArr = houVarArr3;
                            houVar = houVar3;
                        } else {
                            long j2 = j < 0 ? -j : 0L;
                            lnu x = houVar3.x();
                            long j3 = j2;
                            jb10[] a = inuVar2.a(x, j);
                            inuVar = inuVar2;
                            List list = houVar3.H;
                            i = i11;
                            i2 = i14;
                            xyl0VarArr3 = xyl0VarArr2;
                            i3 = i15;
                            iArr2 = iArr4;
                            houVarArr = houVarArr3;
                            houVar = houVar3;
                            loo looVar5 = looVar3;
                            looVar5.updateSelectedTrack(j, j3, -9223372036854775807L, list, a);
                            if (looVar5.getSelectedIndexInTrackGroup() != inuVar.h.a(x.w)) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                        }
                        houVar.m0 = z11;
                        z2 = z11;
                        z3 = z2;
                        if (z3) {
                            i4 = i;
                        } else {
                            houVar.G(j, z2);
                            i4 = i;
                            int i21 = 0;
                            while (i21 < i4) {
                                if (r29[i21] != 0) {
                                    zArr2[i21] = z11;
                                }
                                i21++;
                                z11 = true;
                            }
                        }
                    }
                    z2 = z6;
                    z3 = z10;
                    if (z3) {
                    }
                }
                ArrayList arrayList2 = houVar.L;
                arrayList2.clear();
                for (i5 = 0; i5 < i4; i5++) {
                    ?? r8 = r29[i5];
                    if (r8 != 0) {
                        arrayList2.add((dou) r8);
                    }
                }
                houVar.n0 = true;
                i6 = 0;
                z4 = false;
                while (i6 < looVarArr.length) {
                    ?? r82 = r29[i6];
                    int i22 = i3;
                    if (iArr2[i6] == i22) {
                        r82.getClass();
                        r10 = xyl0VarArr3;
                        r10[i6] = r82;
                        identityHashMap.put(r82, Integer.valueOf(i22));
                        z4 = true;
                    } else {
                        r10 = xyl0VarArr3;
                        if (iArr[i6] == i22) {
                            d6z.x(r82 == 0);
                        }
                    }
                    i6++;
                    xyl0VarArr3 = r10;
                    i3 = i22;
                }
                xyl0[] xyl0VarArr6 = xyl0VarArr3;
                int i23 = i3;
                int i24 = i13;
                if (!z4) {
                    houVarArr[i24] = houVar;
                    i13 = i24 + 1;
                    if (i24 == 0) {
                        inuVar.l = true;
                        if (!z3) {
                            hou[] houVarArr4 = this.N;
                            if (houVarArr4.length != 0 && houVar == houVarArr4[0]) {
                            }
                        }
                        this.D.a.clear();
                        z6 = true;
                    } else {
                        inuVar.l = i23 < this.O;
                    }
                }
                i12 = i23 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                houVarArr3 = houVarArr;
                xyl0VarArr5 = r29;
                looVarArr3 = looVarArr4;
                length2 = i2;
                z5 = false;
                i11 = i4;
                xyl0VarArr4 = xyl0VarArr6;
                length4 = i20;
            }
            iArr = iArr3;
            z = true;
            loo looVar22 = inuVar2.q;
            boolean z82 = z;
            loo looVar32 = looVar22;
            r9 = z5;
            while (r9 < length4) {
            }
            int i202 = length4;
            boolean z102 = z82;
            if (houVar3.Z != 0) {
            }
            ArrayList arrayList22 = houVar.L;
            arrayList22.clear();
            while (i5 < i4) {
            }
            houVar.n0 = true;
            i6 = 0;
            z4 = false;
            while (i6 < looVarArr.length) {
            }
            xyl0[] xyl0VarArr62 = xyl0VarArr3;
            int i232 = i3;
            int i242 = i13;
            if (!z4) {
            }
            i12 = i232 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            houVarArr3 = houVarArr;
            xyl0VarArr5 = r29;
            looVarArr3 = looVarArr4;
            length2 = i2;
            z5 = false;
            i11 = i4;
            xyl0VarArr4 = xyl0VarArr62;
            length4 = i202;
        }
        boolean z12 = z5;
        System.arraycopy(xyl0VarArr4, z12 ? 1 : 0, xyl0VarArr, z12 ? 1 : 0, length2);
        hou[] houVarArr5 = (hou[]) tw21.Y(i13, houVarArr3);
        this.N = houVarArr5;
        ImmutableList m = ImmutableList.m(houVarArr5);
        AbstractList b2 = u.b(m, new qir(14));
        this.E.getClass();
        this.P = new fsd(m, b2);
        return j;
    }

    @Override // defpackage.xe10
    public final void l(we10 we10Var, long j) {
        jch jchVar;
        boolean z;
        List list;
        List list2;
        hou[] houVarArr;
        HashSet hashSet;
        int i;
        boolean z2;
        jch jchVar2;
        int i2;
        boolean z3;
        Uri[] uriArr;
        this.J = we10Var;
        mch mchVar = this.b;
        mchVar.getClass();
        mchVar.x.add(this);
        ynu ynuVar = mchVar.C;
        ynuVar.getClass();
        List list3 = ynuVar.f;
        List list4 = ynuVar.e;
        Map map = Collections.EMPTY_MAP;
        boolean isEmpty = list4.isEmpty();
        List list5 = ynuVar.g;
        int i3 = 0;
        this.K = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jch jchVar3 = this.a;
        boolean z4 = this.F;
        if (isEmpty) {
            jchVar = jchVar3;
            z = z4;
            list = list3;
            list2 = list5;
        } else {
            a aVar = ynuVar.h;
            int size = list4.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                list2 = list5;
                if (i4 >= list4.size()) {
                    break;
                }
                a aVar2 = ((xnu) list4.get(i4)).b;
                int i6 = aVar2.v;
                String str = aVar2.k;
                if (i6 > 0 || tw21.w(2, str) != null) {
                    iArr[i4] = 2;
                    i5++;
                } else if (tw21.w(1, str) != null) {
                    iArr[i4] = 1;
                    i3++;
                } else {
                    iArr[i4] = -1;
                }
                i4++;
                list5 = list2;
            }
            if (i5 > 0) {
                z3 = false;
                jchVar2 = jchVar3;
                i2 = i5;
                z2 = true;
            } else if (i3 < size) {
                z2 = false;
                jchVar2 = jchVar3;
                i2 = size - i3;
                z3 = true;
            } else {
                z2 = false;
                jchVar2 = jchVar3;
                i2 = size;
                z3 = false;
            }
            Uri[] uriArr2 = new Uri[i2];
            a[] aVarArr = new a[i2];
            int[] iArr2 = new int[i2];
            int i7 = 0;
            int i8 = 0;
            while (i7 < list4.size()) {
                if (z2) {
                    uriArr = uriArr2;
                    if (iArr[i7] != 2) {
                        i7++;
                        uriArr2 = uriArr;
                    }
                } else {
                    uriArr = uriArr2;
                }
                if (!z3 || iArr[i7] != 1) {
                    xnu xnuVar = (xnu) list4.get(i7);
                    uriArr[i8] = xnuVar.a;
                    aVarArr[i8] = xnuVar.b;
                    iArr2[i8] = i7;
                    i8++;
                }
                i7++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = aVarArr[0].k;
            int v = tw21.v(2, str2);
            int v2 = tw21.v(1, str2);
            boolean z5 = (v2 == 1 || (v2 == 0 && list3.isEmpty())) && v <= 1 && v2 + v > 0;
            jch jchVar4 = jchVar2;
            list = list3;
            z = z4;
            hou d = d("main", (z2 || v2 <= 0) ? 0 : 1, uriArr3, aVarArr, ynuVar.h, ynuVar.i, map, j);
            arrayList.add(d);
            arrayList2.add(iArr2);
            if (z && z5) {
                ArrayList arrayList3 = new ArrayList();
                if (v > 0) {
                    a[] aVarArr2 = new a[i2];
                    int i9 = 0;
                    while (i9 < i2) {
                        a aVar3 = aVarArr[i9];
                        String w = tw21.w(2, aVar3.k);
                        String e = eh20.e(w);
                        f7s f7sVar = new f7s();
                        f7sVar.a = aVar3.a;
                        f7sVar.b = aVar3.b;
                        f7sVar.c = ImmutableList.l(aVar3.c);
                        f7sVar.l = eh20.q(aVar3.m);
                        f7sVar.m = eh20.q(e);
                        f7sVar.j = w;
                        f7sVar.k = aVar3.l;
                        f7sVar.h = aVar3.h;
                        f7sVar.i = aVar3.i;
                        f7sVar.t = aVar3.u;
                        f7sVar.u = aVar3.v;
                        f7sVar.v = aVar3.w;
                        f7sVar.e = aVar3.e;
                        f7sVar.f = aVar3.f;
                        aVarArr2[i9] = new a(f7sVar);
                        i9++;
                        aVarArr = aVarArr;
                    }
                    a[] aVarArr3 = aVarArr;
                    arrayList3.add(new xzz0("main", aVarArr2));
                    if (v2 > 0 && (aVar != null || list.isEmpty())) {
                        arrayList3.add(new xzz0("main:audio", m(aVarArr3[0], aVar, false)));
                    }
                    List list6 = ynuVar.i;
                    if (list6 != null) {
                        for (int i10 = 0; i10 < list6.size(); i10++) {
                            arrayList3.add(new xzz0(oyr.i(i10, "main:cc:"), jchVar4.b((a) list6.get(i10))));
                        }
                    }
                    jchVar = jchVar4;
                } else {
                    jchVar = jchVar4;
                    a[] aVarArr4 = new a[i2];
                    for (int i11 = 0; i11 < i2; i11++) {
                        aVarArr4[i11] = m(aVarArr[i11], aVar, true);
                    }
                    arrayList3.add(new xzz0("main", aVarArr4));
                }
                f7s f7sVar2 = new f7s();
                f7sVar2.a = "ID3";
                f7sVar2.m = eh20.q("application/id3");
                xzz0 xzz0Var = new xzz0("main:id3", new a(f7sVar2));
                arrayList3.add(xzz0Var);
                d.E((xzz0[]) arrayList3.toArray(new xzz0[0]), arrayList3.indexOf(xzz0Var));
            } else {
                jchVar = jchVar4;
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet2 = new HashSet();
        int i12 = 0;
        while (i12 < list.size()) {
            List list7 = list;
            String str3 = ((wnu) list7.get(i12)).c;
            if (hashSet2.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z6 = true;
                for (int i13 = 0; i13 < list7.size(); i13++) {
                    if (str3.equals(((wnu) list7.get(i13)).c)) {
                        wnu wnuVar = (wnu) list7.get(i13);
                        arrayList6.add(Integer.valueOf(i13));
                        Uri uri = wnuVar.a;
                        a aVar4 = wnuVar.b;
                        arrayList4.add(uri);
                        arrayList5.add(aVar4);
                        z6 &= tw21.v(1, aVar4.k) == 1;
                    }
                }
                String concat = "audio:".concat(str3);
                int i14 = tw21.a;
                list = list7;
                hashSet = hashSet2;
                i = i12;
                hou d2 = d(concat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (a[]) arrayList5.toArray(new a[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList2.add(com.google.common.primitives.a.e(arrayList6));
                arrayList.add(d2);
                if (z && z6) {
                    d2.E(new xzz0[]{new xzz0(concat, (a[]) arrayList5.toArray(new a[0]))}, new int[0]);
                }
            } else {
                hashSet = hashSet2;
                i = i12;
                list = list7;
            }
            i12 = i + 1;
            hashSet2 = hashSet;
        }
        this.O = arrayList.size();
        for (int i15 = 0; i15 < list2.size(); i15++) {
            wnu wnuVar2 = (wnu) list2.get(i15);
            StringBuilder t = b64.t(i15, "subtitle:", ":");
            t.append(wnuVar2.c);
            String sb = t.toString();
            a aVar5 = wnuVar2.b;
            hou d3 = d(sb, 3, new Uri[]{wnuVar2.a}, new a[]{aVar5}, null, Collections.EMPTY_LIST, map, j);
            arrayList2.add(new int[]{i15});
            arrayList.add(d3);
            d3.E(new xzz0[]{new xzz0(sb, jchVar.b(aVar5))}, new int[0]);
        }
        this.M = (hou[]) arrayList.toArray(new hou[0]);
        this.K = this.M.length;
        int i16 = 0;
        while (true) {
            int i17 = this.O;
            houVarArr = this.M;
            if (i16 >= i17) {
                break;
            }
            houVarArr[i16].w.l = true;
            i16++;
        }
        for (hou houVar : houVarArr) {
            if (!houVar.W) {
                wzy wzyVar = new wzy();
                wzyVar.a = houVar.k0;
                houVar.n(new xzy(wzyVar));
            }
        }
        this.N = this.M;
    }

    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        if (this.L != null) {
            return this.P.n(xzyVar);
        }
        for (hou houVar : this.M) {
            if (!houVar.W) {
                wzy wzyVar = new wzy();
                wzyVar.a = houVar.k0;
                houVar.n(new xzy(wzyVar));
            }
        }
        return false;
    }

    @Override // defpackage.xe10
    public final void s(long j, boolean z) {
        for (hou houVar : this.N) {
            if (houVar.V && !houVar.z()) {
                int length = houVar.O.length;
                for (int i = 0; i < length; i++) {
                    houVar.O[i].g(j, z, houVar.i0[i]);
                }
            }
        }
    }
}
