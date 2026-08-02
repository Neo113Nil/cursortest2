package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class hou implements oyy, qyy, urq0, d5p, tyl0 {
    public static final Set t0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final mmm A;
    public final twy B;
    public final xf10 D;
    public final int E;
    public final ArrayList G;
    public final List H;
    public final eou I;
    public final eou J;
    public final Handler K;
    public final ArrayList L;
    public final Map M;
    public nsb N;
    public gou[] O;
    public final HashSet Q;
    public final SparseIntArray R;
    public fou S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public int Z;
    public final String a;
    public a a0;
    public final int b;
    public a b0;
    public final h2t c;
    public boolean c0;
    public yzz0 d0;
    public Set e0;
    public int[] f0;
    public int g0;
    public boolean h0;
    public boolean[] i0;
    public boolean[] j0;
    public long k0;
    public long l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public long q0;
    public DrmInitData r0;
    public lnu s0;
    public final inu w;
    public final au1 x;
    public final a y;
    public final qmm z;
    public final androidx.media3.exoplayer.upstream.a C = new androidx.media3.exoplayer.upstream.a("Loader:HlsSampleStreamWrapper");
    public final enu F = new enu();
    public int[] P = new int[0];

    /* JADX WARN: Type inference failed for: r1v4, types: [eou] */
    /* JADX WARN: Type inference failed for: r2v11, types: [eou] */
    public hou(String str, int i, h2t h2tVar, inu inuVar, Map map, au1 au1Var, long j, a aVar, qmm qmmVar, mmm mmmVar, twy twyVar, xf10 xf10Var, int i2) {
        this.a = str;
        this.b = i;
        this.c = h2tVar;
        this.w = inuVar;
        this.M = map;
        this.x = au1Var;
        this.y = aVar;
        this.z = qmmVar;
        this.A = mmmVar;
        this.B = twyVar;
        this.D = xf10Var;
        this.E = i2;
        final int i3 = 0;
        Set set = t0;
        this.Q = new HashSet(set.size());
        this.R = new SparseIntArray(set.size());
        this.O = new gou[0];
        this.j0 = new boolean[0];
        this.i0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = Collections.unmodifiableList(arrayList);
        this.L = new ArrayList();
        this.I = new Runnable(this) { // from class: eou
            public final /* synthetic */ hou b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                hou houVar = this.b;
                switch (i4) {
                    case 0:
                        houVar.C();
                        break;
                    default:
                        houVar.V = true;
                        houVar.C();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.J = new Runnable(this) { // from class: eou
            public final /* synthetic */ hou b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i42 = i4;
                hou houVar = this.b;
                switch (i42) {
                    case 0:
                        houVar.C();
                        break;
                    default:
                        houVar.V = true;
                        houVar.C();
                        break;
                }
            }
        };
        this.K = tw21.n(null);
        this.k0 = j;
        this.l0 = j;
    }

    public static coj r(int i, int i2) {
        lk91.j("Unmapped track with id " + i + " of type " + i2);
        return new coj();
    }

    public static a u(a aVar, a aVar2, boolean z) {
        String c;
        if (aVar == null) {
            return aVar2;
        }
        String str = aVar.k;
        String str2 = aVar2.n;
        int i = eh20.i(str2);
        if (tw21.v(i, str) == 1) {
            c = tw21.w(i, str);
            str2 = eh20.e(c);
        } else {
            c = eh20.c(str, str2);
        }
        f7s a = aVar2.a();
        a.a = aVar.a;
        a.b = aVar.b;
        a.c = ImmutableList.l(aVar.c);
        a.d = aVar.d;
        a.e = aVar.e;
        a.f = aVar.f;
        a.h = z ? aVar.h : -1;
        a.i = z ? aVar.i : -1;
        a.j = c;
        if (i == 2) {
            a.t = aVar.u;
            a.u = aVar.v;
            a.v = aVar.w;
        }
        if (str2 != null) {
            a.d(str2);
        }
        int i2 = aVar.D;
        if (i2 != -1 && i == 1) {
            a.C = i2;
        }
        w820 w820Var = aVar.l;
        if (w820Var != null) {
            w820 w820Var2 = aVar2.l;
            if (w820Var2 != null) {
                w820Var = w820Var2.b(w820Var);
            }
            a.k = w820Var;
        }
        return new a(a);
    }

    public static int y(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // defpackage.d5p
    public final void A() {
        this.p0 = true;
        this.K.post(this.J);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [gou[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gou[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [g001] */
    /* JADX WARN: Type inference failed for: r5v4, types: [gou, uyl0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [coj] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.d5p
    public final g001 B(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Set set = t0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.Q;
        SparseIntArray sparseIntArray = this.R;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            d6z.l(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.P[i3] = i;
                }
                r5 = this.P[i3] == i ? this.O[i3] : r(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.O;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.P[i4] == i) {
                    r5 = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (r5 == 0) {
            if (this.p0) {
                return r(i, i2);
            }
            int length = this.O.length;
            boolean z = i2 == 1 || i2 == 2;
            r5 = new gou(this.x, this.z, this.A, this.M);
            r5.t = this.k0;
            if (z) {
                r5.I = this.r0;
                r5.z = true;
            }
            long j = this.q0;
            if (r5.F != j) {
                r5.F = j;
                r5.z = true;
            }
            if (this.s0 != null) {
                r5.C = r6.D;
            }
            r5.f = this;
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.P, i5);
            this.P = copyOf;
            copyOf[length] = i;
            gou[] gouVarArr = this.O;
            int i6 = tw21.a;
            ?? copyOf2 = Arrays.copyOf(gouVarArr, gouVarArr.length + 1);
            copyOf2[gouVarArr.length] = r5;
            this.O = (gou[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.j0, i5);
            this.j0 = copyOf3;
            copyOf3[length] = z;
            this.h0 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (y(i2) > y(this.T)) {
                this.U = length;
                this.T = i2;
            }
            this.i0 = Arrays.copyOf(this.i0, i5);
        }
        if (i2 != 5) {
            return r5;
        }
        if (this.S == null) {
            this.S = new fou(r5, this.E);
        }
        return this.S;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        int i;
        if (!this.c0 && this.f0 == null && this.V) {
            int i2 = 0;
            for (gou gouVar : this.O) {
                if (gouVar.s() == null) {
                    return;
                }
            }
            yzz0 yzz0Var = this.d0;
            if (yzz0Var != null) {
                int i3 = yzz0Var.a;
                int[] iArr = new int[i3];
                this.f0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        gou[] gouVarArr = this.O;
                        if (i5 < gouVarArr.length) {
                            a s = gouVarArr[i5].s();
                            d6z.z(s);
                            a aVar = this.d0.a(i4).d[0];
                            String str = s.n;
                            String str2 = aVar.n;
                            int i6 = eh20.i(str);
                            if (i6 == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || s.I == aVar.I) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i5++;
                            } else if (i6 == eh20.i(str2)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.f0[i4] = i5;
                }
                Iterator it = this.L.iterator();
                while (it.hasNext()) {
                    ((dou) it.next()).a();
                }
                return;
            }
            int length = this.O.length;
            int i7 = 0;
            int i8 = -1;
            int i9 = -2;
            while (true) {
                int i10 = 1;
                if (i7 >= length) {
                    break;
                }
                a s2 = this.O[i7].s();
                d6z.z(s2);
                String str3 = s2.n;
                if (eh20.p(str3)) {
                    i10 = 2;
                } else if (!eh20.l(str3)) {
                    i10 = eh20.o(str3) ? 3 : -2;
                }
                if (y(i10) > y(i9)) {
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i8 != -1) {
                    i8 = -1;
                }
                i7++;
            }
            xzz0 xzz0Var = this.w.h;
            int i11 = xzz0Var.a;
            this.g0 = -1;
            this.f0 = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                this.f0[i12] = i12;
            }
            xzz0[] xzz0VarArr = new xzz0[length];
            int i13 = 0;
            while (i13 < length) {
                a s3 = this.O[i13].s();
                d6z.z(s3);
                String str4 = this.a;
                a aVar2 = this.y;
                if (i13 == i8) {
                    a[] aVarArr = new a[i11];
                    for (int i14 = i2; i14 < i11; i14++) {
                        a aVar3 = xzz0Var.d[i14];
                        if (i9 == 1 && aVar2 != null) {
                            aVar3 = aVar3.d(aVar2);
                        }
                        aVarArr[i14] = i11 == 1 ? s3.d(aVar3) : u(aVar3, s3, true);
                    }
                    xzz0VarArr[i13] = new xzz0(str4, aVarArr);
                    this.g0 = i13;
                    i = 0;
                } else {
                    if (i9 != 2 || !eh20.l(s3.n)) {
                        aVar2 = null;
                    }
                    StringBuilder v = oyr.v(str4, ":muxed:");
                    v.append(i13 < i8 ? i13 : i13 - 1);
                    i = 0;
                    xzz0VarArr[i13] = new xzz0(v.toString(), u(aVar2, s3, false));
                }
                i13++;
                i2 = i;
            }
            int i15 = i2;
            this.d0 = t(xzz0VarArr);
            d6z.x(this.e0 == null ? 1 : i15);
            this.e0 = Collections.EMPTY_SET;
            this.W = true;
            this.c.i();
        }
    }

    public final void D() {
        this.C.b();
        inu inuVar = this.w;
        BehindLiveWindowException behindLiveWindowException = inuVar.n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = inuVar.o;
        if (uri == null || !inuVar.s) {
            return;
        }
        androidx.media3.exoplayer.hls.playlist.a aVar = (androidx.media3.exoplayer.hls.playlist.a) inuVar.g.w.get(uri);
        aVar.b.b();
        IOException iOException = aVar.C;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void E(xzz0[] xzz0VarArr, int... iArr) {
        this.d0 = t(xzz0VarArr);
        this.e0 = new HashSet();
        for (int i : iArr) {
            this.e0.add(this.d0.a(i));
        }
        this.g0 = 0;
        this.K.post(new ejp(23, this.c));
        this.W = true;
    }

    public final void F() {
        for (gou gouVar : this.O) {
            gouVar.A(this.m0);
        }
        this.m0 = false;
    }

    public final boolean G(long j, boolean z) {
        lnu lnuVar;
        int i;
        this.k0 = j;
        if (z()) {
            this.l0 = j;
            return true;
        }
        boolean z2 = this.w.p;
        ArrayList arrayList = this.G;
        if (z2) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                lnuVar = (lnu) arrayList.get(i2);
                if (lnuVar.z == j) {
                    break;
                }
            }
        }
        lnuVar = null;
        if (this.V && !z) {
            int length = this.O.length;
            for (0; i < length; i + 1) {
                gou gouVar = this.O[i];
                i = ((lnuVar != null ? gouVar.B(lnuVar.f(i)) : gouVar.C(j, false)) || (!this.j0[i] && this.h0)) ? i + 1 : 0;
            }
            return false;
        }
        this.l0 = j;
        this.o0 = false;
        arrayList.clear();
        androidx.media3.exoplayer.upstream.a aVar = this.C;
        if (!aVar.d()) {
            aVar.c = null;
            F();
            return true;
        }
        if (this.V) {
            for (gou gouVar2 : this.O) {
                gouVar2.h();
            }
        }
        aVar.a();
        return true;
    }

    @Override // defpackage.qyy
    public final void a() {
        for (gou gouVar : this.O) {
            gouVar.z();
        }
    }

    @Override // defpackage.tyl0
    public final void b() {
        this.K.post(this.I);
    }

    @Override // defpackage.oyy
    public final void d(pyy pyyVar, long j, long j2, boolean z) {
        nsb nsbVar = (nsb) pyyVar;
        this.N = null;
        long j3 = nsbVar.a;
        npg npgVar = nsbVar.b;
        x7u0 x7u0Var = nsbVar.B;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        this.B.onLoadTaskConcluded(j3);
        this.D.c(uwyVar, nsbVar.c, this.b, nsbVar.w, nsbVar.x, nsbVar.y, nsbVar.z, nsbVar.A);
        if (z) {
            return;
        }
        if (z() || this.Z == 0) {
            F();
        }
        if (this.Z > 0) {
            this.c.onContinueLoadingRequested(this);
        }
    }

    @Override // defpackage.urq0
    public final long g() {
        if (this.o0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.l0;
        }
        long j = this.k0;
        lnu x = x();
        if (!x.c0) {
            ArrayList arrayList = this.G;
            x = arrayList.size() > 1 ? (lnu) unr0.k(2, arrayList) : null;
        }
        if (x != null) {
            j = Math.max(j, x.A);
        }
        if (this.V) {
            for (gou gouVar : this.O) {
                j = Math.max(j, gouVar.n());
            }
        }
        return j;
    }

    @Override // defpackage.urq0
    public final void h(long j) {
        androidx.media3.exoplayer.upstream.a aVar = this.C;
        if (aVar.c() || z()) {
            return;
        }
        boolean d = aVar.d();
        inu inuVar = this.w;
        List list = this.H;
        if (d) {
            this.N.getClass();
            if (inuVar.n != null ? false : inuVar.q.shouldCancelChunkLoad(j, this.N, list)) {
                aVar.a();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && inuVar.b((lnu) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            v(size);
        }
        int size2 = (inuVar.n != null || inuVar.q.length() < 2) ? list.size() : inuVar.q.evaluateQueueSize(j, list);
        if (size2 < this.G.size()) {
            v(size2);
        }
    }

    @Override // defpackage.urq0
    public final long i() {
        if (z()) {
            return this.l0;
        }
        if (this.o0) {
            return Long.MIN_VALUE;
        }
        return x().A;
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        return this.C.d();
    }

    @Override // defpackage.oyy
    public final void m(pyy pyyVar, long j, long j2) {
        nsb nsbVar = (nsb) pyyVar;
        this.N = null;
        if (nsbVar instanceof dnu) {
            dnu dnuVar = (dnu) nsbVar;
            byte[] bArr = dnuVar.C;
            inu inuVar = this.w;
            inuVar.m = bArr;
            androidx.media3.exoplayer.hls.a aVar = inuVar.j;
            Uri uri = dnuVar.b.a;
            byte[] bArr2 = dnuVar.E;
            bArr2.getClass();
            LinkedHashMap linkedHashMap = aVar.a;
            uri.getClass();
        }
        long j3 = nsbVar.a;
        npg npgVar = nsbVar.b;
        x7u0 x7u0Var = nsbVar.B;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        this.B.onLoadTaskConcluded(j3);
        this.D.e(uwyVar, nsbVar.c, this.b, nsbVar.w, nsbVar.x, nsbVar.y, nsbVar.z, nsbVar.A);
        if (this.W) {
            this.c.onContinueLoadingRequested(this);
            return;
        }
        wzy wzyVar = new wzy();
        wzyVar.a = this.k0;
        n(new xzy(wzyVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0402, code lost:
    
        if (r0.f == r2.f) goto L202;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024b  */
    @Override // defpackage.urq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(xzy xzyVar) {
        long max;
        List list;
        androidx.media3.exoplayer.hls.a aVar;
        long j;
        mch mchVar;
        enu enuVar;
        enu enuVar2;
        int i;
        lnu lnuVar;
        long j2;
        Uri uri;
        int i2;
        hnu hnuVar;
        dnu d;
        boolean z;
        List list2;
        boolean z2;
        androidx.media3.exoplayer.hls.a aVar2;
        byte[] bArr;
        androidx.media3.exoplayer.upstream.a aVar3;
        boolean z3;
        byte[] bArr2;
        kpg kpgVar;
        rnu rnuVar;
        hnu hnuVar2;
        npg npgVar;
        kpg kpgVar2;
        boolean z4;
        vyc0 vyc0Var;
        hnu hnuVar3;
        w5v w5vVar;
        ef90 ef90Var;
        wu6 wu6Var;
        sez0 sez0Var;
        boolean z5;
        byte[] bArr3;
        String str;
        boolean z6;
        if (!this.o0) {
            androidx.media3.exoplayer.upstream.a aVar4 = this.C;
            if (!aVar4.d() && !aVar4.c()) {
                if (z()) {
                    list = Collections.EMPTY_LIST;
                    max = this.l0;
                    for (gou gouVar : this.O) {
                        gouVar.t = this.l0;
                    }
                } else {
                    lnu x = x();
                    max = x.c0 ? x.A : Math.max(this.k0, x.z);
                    list = this.H;
                }
                List list3 = list;
                enu enuVar3 = this.F;
                enuVar3.a = null;
                enuVar3.b = false;
                enuVar3.c = null;
                boolean z7 = this.W || !list3.isEmpty();
                inu inuVar = this.w;
                androidx.media3.exoplayer.hls.a aVar5 = inuVar.j;
                Uri[] uriArr = inuVar.e;
                mch mchVar2 = inuVar.g;
                lnu lnuVar2 = list3.isEmpty() ? null : (lnu) eab1.c(list3);
                int a = lnuVar2 == null ? -1 : inuVar.h.a(lnuVar2.w);
                long j3 = xzyVar.a;
                long j4 = max - j3;
                int i3 = a;
                long j5 = inuVar.r;
                long j6 = j5 != -9223372036854775807L ? j5 - j3 : -9223372036854775807L;
                if (lnuVar2 == null || inuVar.p) {
                    aVar = aVar5;
                    j = j3;
                    mchVar = mchVar2;
                    enuVar = enuVar3;
                } else {
                    enuVar = enuVar3;
                    aVar = aVar5;
                    j = j3;
                    long j7 = lnuVar2.A - lnuVar2.z;
                    mchVar = mchVar2;
                    j4 = Math.max(0L, j4 - j7);
                    if (j6 != -9223372036854775807L) {
                        j6 = Math.max(0L, j6 - j7);
                    }
                }
                jb10[] a2 = inuVar.a(lnuVar2, max);
                long j8 = max;
                lnu lnuVar3 = lnuVar2;
                androidx.media3.exoplayer.hls.a aVar6 = aVar;
                mch mchVar3 = mchVar;
                inuVar.q.updateSelectedTrack(j, j4, j6, list3, a2);
                int selectedIndexInTrackGroup = inuVar.q.getSelectedIndexInTrackGroup();
                boolean z8 = i3 != selectedIndexInTrackGroup;
                Uri uri2 = uriArr[selectedIndexInTrackGroup];
                if (mchVar3.c(uri2)) {
                    enuVar2 = enuVar;
                    unu a3 = mchVar3.a(uri2, true);
                    a3.getClass();
                    long j9 = a3.h;
                    inuVar.p = a3.c;
                    if (a3.o) {
                        i = i3;
                        lnuVar = lnuVar3;
                        j2 = -9223372036854775807L;
                    } else {
                        i = i3;
                        lnuVar = lnuVar3;
                        j2 = (a3.u + j9) - mchVar3.G;
                    }
                    inuVar.r = j2;
                    boolean z9 = z8;
                    unu unuVar = a3;
                    long j10 = j9 - mchVar3.G;
                    int i4 = i;
                    lnu lnuVar4 = lnuVar;
                    Pair c = inuVar.c(lnuVar4, z9, unuVar, j10, j8);
                    long longValue = ((Long) c.first).longValue();
                    int intValue = ((Integer) c.second).intValue();
                    if (longValue >= unuVar.k || lnuVar4 == null || !z9) {
                        uri = uri2;
                        i2 = selectedIndexInTrackGroup;
                    } else {
                        uri = uriArr[i4];
                        unu a4 = mchVar3.a(uri, true);
                        a4.getClass();
                        j10 = a4.h - mchVar3.G;
                        unuVar = a4;
                        Pair c2 = inuVar.c(lnuVar4, false, unuVar, j10, j8);
                        longValue = ((Long) c2.first).longValue();
                        intValue = ((Integer) c2.second).intValue();
                        i2 = i4;
                    }
                    long j11 = j10;
                    unu unuVar2 = unuVar;
                    long j12 = longValue;
                    String str2 = unuVar2.a;
                    boolean z10 = unuVar2.c;
                    long j13 = unuVar2.k;
                    ImmutableList immutableList = unuVar2.r;
                    if (i2 != i4 && i4 != -1) {
                        androidx.media3.exoplayer.hls.playlist.a aVar7 = (androidx.media3.exoplayer.hls.playlist.a) mchVar3.w.get(uriArr[i4]);
                        if (aVar7 != null) {
                            aVar7.D = false;
                        }
                    }
                    if (j12 < j13) {
                        inuVar.n = new BehindLiveWindowException();
                    } else {
                        ImmutableList immutableList2 = unuVar2.s;
                        int i5 = (int) (j12 - j13);
                        if (i5 == immutableList.size()) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            if (intValue < immutableList2.size()) {
                                hnuVar = new hnu((snu) immutableList2.get(intValue), j12, intValue);
                                if (hnuVar == null) {
                                    if (!unuVar2.o) {
                                        enuVar2.c = uri;
                                        inuVar.s &= uri.equals(inuVar.o);
                                        inuVar.o = uri;
                                    } else if (z7 || immutableList.isEmpty()) {
                                        enuVar2.b = true;
                                    } else {
                                        hnuVar = new hnu((snu) eab1.c(immutableList), (j13 + immutableList.size()) - 1, -1);
                                    }
                                }
                                boolean z11 = hnuVar.d;
                                snu snuVar = hnuVar.a;
                                inuVar.s = false;
                                inuVar.o = null;
                                SystemClock.elapsedRealtime();
                                rnu rnuVar2 = snuVar.b;
                                long j14 = snuVar.x;
                                Uri j15 = (rnuVar2 != null || (str = rnuVar2.z) == null) ? null : m4m0.j(str2, str);
                                d = inuVar.d(i2, j15, true);
                                enuVar2.a = d;
                                if (d == null) {
                                    String str3 = snuVar.z;
                                    Uri j16 = str3 == null ? null : m4m0.j(str2, str3);
                                    dnu d2 = inuVar.d(i2, j16, false);
                                    enuVar2.a = d2;
                                    if (d2 == null) {
                                        if (lnuVar4 == null) {
                                            AtomicInteger atomicInteger = lnu.g0;
                                        } else if (!uri.equals(lnuVar4.F) || !lnuVar4.c0) {
                                            long j17 = j11 + j14;
                                            if (snuVar instanceof pnu) {
                                                z10 = ((pnu) snuVar).E || (hnuVar.c == 0 && z10);
                                            }
                                            if (!z10 || j17 < lnuVar4.A) {
                                                z = true;
                                                if (z || !z11) {
                                                    jch jchVar = inuVar.a;
                                                    kpg kpgVar3 = inuVar.b;
                                                    a aVar8 = inuVar.f[i2];
                                                    List list4 = inuVar.i;
                                                    int selectionReason = inuVar.q.getSelectionReason();
                                                    Object selectionData = inuVar.q.getSelectionData();
                                                    boolean z12 = inuVar.l;
                                                    tez0 tez0Var = inuVar.d;
                                                    if (j16 != null) {
                                                        aVar6.getClass();
                                                        list2 = list4;
                                                        z2 = z12;
                                                        bArr = null;
                                                        aVar2 = aVar6;
                                                    } else {
                                                        list2 = list4;
                                                        z2 = z12;
                                                        aVar2 = aVar6;
                                                        bArr = (byte[]) aVar2.a.get(j16);
                                                    }
                                                    byte[] bArr4 = j15 != null ? null : (byte[]) aVar2.a.get(j15);
                                                    vyc0 vyc0Var2 = inuVar.k;
                                                    AtomicInteger atomicInteger2 = lnu.g0;
                                                    mpg mpgVar = new mpg();
                                                    mpgVar.a = m4m0.j(str2, snuVar.a);
                                                    aVar3 = aVar4;
                                                    mpgVar.f = snuVar.B;
                                                    mpgVar.g = snuVar.C;
                                                    mpgVar.i = !z11 ? 8 : 0;
                                                    npg a5 = mpgVar.a();
                                                    z3 = bArr == null;
                                                    if (z3) {
                                                        bArr2 = null;
                                                    } else {
                                                        String str4 = snuVar.A;
                                                        str4.getClass();
                                                        bArr2 = lnu.e(str4);
                                                    }
                                                    if (bArr == null) {
                                                        bArr2.getClass();
                                                        kpgVar = new bf1(kpgVar3, bArr, bArr2);
                                                    } else {
                                                        kpgVar = kpgVar3;
                                                    }
                                                    rnuVar = snuVar.b;
                                                    if (rnuVar == null) {
                                                        boolean z13 = bArr4 != null;
                                                        if (z13) {
                                                            String str5 = rnuVar.A;
                                                            str5.getClass();
                                                            bArr3 = lnu.e(str5);
                                                        } else {
                                                            bArr3 = null;
                                                        }
                                                        Uri j18 = m4m0.j(str2, rnuVar.a);
                                                        mpg mpgVar2 = new mpg();
                                                        mpgVar2.a = j18;
                                                        boolean z14 = z13;
                                                        hnuVar2 = hnuVar;
                                                        mpgVar2.f = rnuVar.B;
                                                        mpgVar2.g = rnuVar.C;
                                                        npgVar = mpgVar2.a();
                                                        if (bArr4 != null) {
                                                            bArr3.getClass();
                                                            kpgVar3 = new bf1(kpgVar3, bArr4, bArr3);
                                                        }
                                                        z4 = z14;
                                                        kpgVar2 = kpgVar3;
                                                    } else {
                                                        hnuVar2 = hnuVar;
                                                        npgVar = null;
                                                        kpgVar2 = null;
                                                        z4 = false;
                                                    }
                                                    long j19 = j11 + j14;
                                                    long j20 = j19 + snuVar.c;
                                                    int i6 = unuVar2.j + snuVar.w;
                                                    if (lnuVar4 == null) {
                                                        npg npgVar2 = lnuVar4.J;
                                                        if (npgVar != npgVar2) {
                                                            if (npgVar == null || npgVar2 == null || !npgVar.a.equals(npgVar2.a)) {
                                                                vyc0Var = vyc0Var2;
                                                                hnuVar3 = hnuVar2;
                                                            } else {
                                                                hnuVar3 = hnuVar2;
                                                                vyc0Var = vyc0Var2;
                                                            }
                                                            z5 = false;
                                                            boolean z15 = !uri.equals(lnuVar4.F) && lnuVar4.c0;
                                                            w5vVar = lnuVar4.R;
                                                            ef90Var = lnuVar4.S;
                                                            wu6Var = (z5 || !z15 || lnuVar4.e0 || lnuVar4.E != i6) ? null : lnuVar4.V;
                                                        } else {
                                                            vyc0Var = vyc0Var2;
                                                            hnuVar3 = hnuVar2;
                                                        }
                                                        z5 = true;
                                                        if (uri.equals(lnuVar4.F)) {
                                                        }
                                                        w5vVar = lnuVar4.R;
                                                        ef90Var = lnuVar4.S;
                                                        wu6Var = (z5 || !z15 || lnuVar4.e0 || lnuVar4.E != i6) ? null : lnuVar4.V;
                                                    } else {
                                                        vyc0Var = vyc0Var2;
                                                        hnuVar3 = hnuVar2;
                                                        w5vVar = new w5v();
                                                        ef90Var = new ef90(10);
                                                        wu6Var = null;
                                                    }
                                                    w5v w5vVar2 = w5vVar;
                                                    ef90 ef90Var2 = ef90Var;
                                                    hnu hnuVar4 = hnuVar3;
                                                    long j21 = hnuVar4.b;
                                                    int i7 = hnuVar4.c;
                                                    boolean z16 = !z11;
                                                    boolean z17 = snuVar.D;
                                                    SparseArray sparseArray = tez0Var.a;
                                                    sez0Var = (sez0) sparseArray.get(i6);
                                                    if (sez0Var == null) {
                                                        sez0Var = new sez0(9223372036854775806L);
                                                        sparseArray.put(i6, sez0Var);
                                                    }
                                                    enuVar2.a = new lnu(jchVar, kpgVar, a5, aVar8, z3, kpgVar2, npgVar, z4, uri, list2, selectionReason, selectionData, j19, j20, j21, i7, z16, i6, z17, z2, sez0Var, snuVar.y, wu6Var, w5vVar2, ef90Var2, z, vyc0Var);
                                                    z6 = enuVar2.b;
                                                    nsb nsbVar = enuVar2.a;
                                                    Uri uri3 = enuVar2.c;
                                                    if (z6) {
                                                        this.l0 = -9223372036854775807L;
                                                        this.o0 = true;
                                                        return true;
                                                    }
                                                    if (nsbVar == null) {
                                                        if (uri3 == null) {
                                                            return false;
                                                        }
                                                        ((androidx.media3.exoplayer.hls.playlist.a) ((mnu) this.c.a).b.w.get(uri3)).c(true);
                                                        return false;
                                                    }
                                                    if (nsbVar instanceof lnu) {
                                                        lnu lnuVar5 = (lnu) nsbVar;
                                                        this.s0 = lnuVar5;
                                                        this.a0 = lnuVar5.w;
                                                        this.l0 = -9223372036854775807L;
                                                        this.G.add(lnuVar5);
                                                        piv pivVar = ImmutableList.b;
                                                        ImmutableList.a aVar9 = new ImmutableList.a();
                                                        for (gou gouVar2 : this.O) {
                                                            aVar9.a(Integer.valueOf(gouVar2.q + gouVar2.p));
                                                        }
                                                        ImmutableList g = aVar9.g();
                                                        lnuVar5.W = this;
                                                        lnuVar5.d0 = g;
                                                        for (gou gouVar3 : this.O) {
                                                            gouVar3.getClass();
                                                            gouVar3.C = lnuVar5.D;
                                                            if (lnuVar5.G) {
                                                                gouVar3.G = true;
                                                            }
                                                        }
                                                    }
                                                    this.N = nsbVar;
                                                    aVar3.g(nsbVar, this, this.B.getMinimumLoadableRetryCount(nsbVar.c));
                                                    return true;
                                                }
                                            }
                                        }
                                        z = false;
                                        if (z) {
                                        }
                                        jch jchVar2 = inuVar.a;
                                        kpg kpgVar32 = inuVar.b;
                                        a aVar82 = inuVar.f[i2];
                                        List list42 = inuVar.i;
                                        int selectionReason2 = inuVar.q.getSelectionReason();
                                        Object selectionData2 = inuVar.q.getSelectionData();
                                        boolean z122 = inuVar.l;
                                        tez0 tez0Var2 = inuVar.d;
                                        if (j16 != null) {
                                        }
                                        if (j15 != null) {
                                        }
                                        vyc0 vyc0Var22 = inuVar.k;
                                        AtomicInteger atomicInteger22 = lnu.g0;
                                        mpg mpgVar3 = new mpg();
                                        mpgVar3.a = m4m0.j(str2, snuVar.a);
                                        aVar3 = aVar4;
                                        mpgVar3.f = snuVar.B;
                                        mpgVar3.g = snuVar.C;
                                        mpgVar3.i = !z11 ? 8 : 0;
                                        npg a52 = mpgVar3.a();
                                        if (bArr == null) {
                                        }
                                        if (z3) {
                                        }
                                        if (bArr == null) {
                                        }
                                        rnuVar = snuVar.b;
                                        if (rnuVar == null) {
                                        }
                                        long j192 = j11 + j14;
                                        long j202 = j192 + snuVar.c;
                                        int i62 = unuVar2.j + snuVar.w;
                                        if (lnuVar4 == null) {
                                        }
                                        w5v w5vVar22 = w5vVar;
                                        ef90 ef90Var22 = ef90Var;
                                        hnu hnuVar42 = hnuVar3;
                                        long j212 = hnuVar42.b;
                                        int i72 = hnuVar42.c;
                                        boolean z162 = !z11;
                                        boolean z172 = snuVar.D;
                                        SparseArray sparseArray2 = tez0Var2.a;
                                        sez0Var = (sez0) sparseArray2.get(i62);
                                        if (sez0Var == null) {
                                        }
                                        enuVar2.a = new lnu(jchVar2, kpgVar, a52, aVar82, z3, kpgVar2, npgVar, z4, uri, list2, selectionReason2, selectionData2, j192, j202, j212, i72, z162, i62, z172, z2, sez0Var, snuVar.y, wu6Var, w5vVar22, ef90Var22, z, vyc0Var);
                                        z6 = enuVar2.b;
                                        nsb nsbVar2 = enuVar2.a;
                                        Uri uri32 = enuVar2.c;
                                        if (z6) {
                                        }
                                    }
                                }
                            }
                            hnuVar = null;
                            if (hnuVar == null) {
                            }
                            boolean z112 = hnuVar.d;
                            snu snuVar2 = hnuVar.a;
                            inuVar.s = false;
                            inuVar.o = null;
                            SystemClock.elapsedRealtime();
                            rnu rnuVar22 = snuVar2.b;
                            long j142 = snuVar2.x;
                            if (rnuVar22 != null) {
                            }
                            d = inuVar.d(i2, j15, true);
                            enuVar2.a = d;
                            if (d == null) {
                            }
                        } else {
                            rnu rnuVar3 = (rnu) immutableList.get(i5);
                            if (intValue == -1) {
                                hnuVar = new hnu(rnuVar3, j12, -1);
                            } else if (intValue < rnuVar3.F.size()) {
                                hnuVar = new hnu((snu) rnuVar3.F.get(intValue), j12, intValue);
                            } else {
                                int i8 = i5 + 1;
                                if (i8 < immutableList.size()) {
                                    hnuVar = new hnu((snu) immutableList.get(i8), j12 + 1, -1);
                                } else {
                                    if (!immutableList2.isEmpty()) {
                                        hnuVar = new hnu((snu) immutableList2.get(0), j12 + 1, 0);
                                    }
                                    hnuVar = null;
                                }
                            }
                            if (hnuVar == null) {
                            }
                            boolean z1122 = hnuVar.d;
                            snu snuVar22 = hnuVar.a;
                            inuVar.s = false;
                            inuVar.o = null;
                            SystemClock.elapsedRealtime();
                            rnu rnuVar222 = snuVar22.b;
                            long j1422 = snuVar22.x;
                            if (rnuVar222 != null) {
                            }
                            d = inuVar.d(i2, j15, true);
                            enuVar2.a = d;
                            if (d == null) {
                            }
                        }
                    }
                } else {
                    enuVar2 = enuVar;
                    enuVar2.c = uri2;
                    inuVar.s &= uri2.equals(inuVar.o);
                    inuVar.o = uri2;
                }
                aVar3 = aVar4;
                z6 = enuVar2.b;
                nsb nsbVar22 = enuVar2.a;
                Uri uri322 = enuVar2.c;
                if (z6) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.oyy
    public final void o(pyy pyyVar, long j, long j2, int i) {
        uwy uwyVar;
        nsb nsbVar = (nsb) pyyVar;
        if (i == 0) {
            long j3 = nsbVar.a;
            uwyVar = new uwy(nsbVar.b);
        } else {
            long j4 = nsbVar.a;
            npg npgVar = nsbVar.b;
            x7u0 x7u0Var = nsbVar.B;
            uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        }
        this.D.h(uwyVar, nsbVar.c, this.b, nsbVar.w, nsbVar.x, nsbVar.y, nsbVar.z, nsbVar.A, i);
    }

    @Override // defpackage.oyy
    public final h0n p(pyy pyyVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        h0n h0nVar;
        int i2;
        nsb nsbVar = (nsb) pyyVar;
        boolean z2 = nsbVar instanceof lnu;
        if (z2 && !((lnu) nsbVar).f0 && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode) == 410 || i2 == 404)) {
            return androidx.media3.exoplayer.upstream.a.d;
        }
        long j3 = nsbVar.B.b;
        npg npgVar = nsbVar.b;
        x7u0 x7u0Var = nsbVar.B;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, j3);
        tw21.l0(nsbVar.z);
        tw21.l0(nsbVar.A);
        swy swyVar = new swy(iOException, i);
        inu inuVar = this.w;
        qwy a = s001.a(inuVar.q);
        twy twyVar = this.B;
        rwy fallbackSelectionFor = twyVar.getFallbackSelectionFor(a, swyVar);
        if (fallbackSelectionFor == null || fallbackSelectionFor.a != 2) {
            z = false;
        } else {
            long j4 = fallbackSelectionFor.b;
            loo looVar = inuVar.q;
            z = looVar.excludeTrack(looVar.indexOf(inuVar.h.a(nsbVar.w)), j4);
        }
        if (z) {
            if (z2 && j3 == 0) {
                ArrayList arrayList = this.G;
                d6z.x(((lnu) arrayList.remove(arrayList.size() - 1)) == nsbVar);
                if (arrayList.isEmpty()) {
                    this.l0 = this.k0;
                } else {
                    ((lnu) eab1.c(arrayList)).e0 = true;
                }
            }
            h0nVar = androidx.media3.exoplayer.upstream.a.e;
        } else {
            long retryDelayMsFor = twyVar.getRetryDelayMsFor(swyVar);
            h0nVar = retryDelayMsFor != -9223372036854775807L ? new h0n(false, 0, retryDelayMsFor) : androidx.media3.exoplayer.upstream.a.f;
        }
        h0n h0nVar2 = h0nVar;
        boolean b = h0nVar2.b();
        this.D.f(uwyVar, nsbVar.c, this.b, nsbVar.w, nsbVar.x, nsbVar.y, nsbVar.z, nsbVar.A, iOException, !b);
        if (!b) {
            this.N = null;
            twyVar.onLoadTaskConcluded(nsbVar.a);
        }
        if (z) {
            if (!this.W) {
                wzy wzyVar = new wzy();
                wzyVar.a = this.k0;
                n(new xzy(wzyVar));
                return h0nVar2;
            }
            this.c.onContinueLoadingRequested(this);
        }
        return h0nVar2;
    }

    public final void q() {
        d6z.x(this.W);
        this.d0.getClass();
        this.e0.getClass();
    }

    public final yzz0 t(xzz0[] xzz0VarArr) {
        for (int i = 0; i < xzz0VarArr.length; i++) {
            xzz0 xzz0Var = xzz0VarArr[i];
            a[] aVarArr = new a[xzz0Var.a];
            for (int i2 = 0; i2 < xzz0Var.a; i2++) {
                a aVar = xzz0Var.d[i2];
                int cryptoType = this.z.getCryptoType(aVar);
                f7s a = aVar.a();
                a.L = cryptoType;
                aVarArr[i2] = new a(a);
            }
            xzz0VarArr[i] = new xzz0(xzz0Var.b, aVarArr);
        }
        return new yzz0(xzz0VarArr);
    }

    public final void v(int i) {
        ArrayList arrayList;
        d6z.x(!this.C.d());
        loop0: while (true) {
            arrayList = this.G;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            int i2 = i;
            while (true) {
                if (i2 >= arrayList.size()) {
                    lnu lnuVar = (lnu) arrayList.get(i);
                    for (int i3 = 0; i3 < this.O.length; i3++) {
                        if (this.O[i3].p() > lnuVar.f(i3)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((lnu) arrayList.get(i2)).G) {
                    break;
                } else {
                    i2++;
                }
            }
            i++;
        }
        if (i == -1) {
            return;
        }
        long j = x().A;
        lnu lnuVar2 = (lnu) arrayList.get(i);
        tw21.b0(i, arrayList.size(), arrayList);
        for (int i4 = 0; i4 < this.O.length; i4++) {
            this.O[i4].k(lnuVar2.f(i4));
        }
        if (arrayList.isEmpty()) {
            this.l0 = this.k0;
        } else {
            ((lnu) eab1.c(arrayList)).e0 = true;
        }
        this.o0 = false;
        this.D.i(this.T, lnuVar2.z, j);
    }

    @Override // defpackage.d5p
    public final void w(f7q0 f7q0Var) {
    }

    public final lnu x() {
        return (lnu) unr0.k(1, this.G);
    }

    public final boolean z() {
        return this.l0 != -9223372036854775807L;
    }
}
