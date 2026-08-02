package xsna;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.a1n0;
import xsna.n3i0;
import xsna.osp0;
import xsna.tsp0;
import xsna.u27;

/* compiled from: TsExtractor.java */
/* loaded from: classes12.dex */
public final class ssp0 implements pgq {
    public final int a;
    public final int b;
    public final List<txo0> c;
    public final xi90 d;
    public final SparseIntArray e;
    public final bql f;
    public final a1n0.a g;
    public final SparseArray<tsp0> h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final rsp0 k;
    public osp0 l;
    public rgq m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;

    @Nullable
    public tsp0 r;
    public int s;
    public int t;

    public ssp0(int i, int i2, a1n0.a aVar, txo0 txo0Var, bql bqlVar) {
        this.f = bqlVar;
        this.a = i;
        this.b = i2;
        this.g = aVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(txo0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(txo0Var);
        }
        this.d = new xi90(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray<tsp0> sparseArray = new SparseArray<>();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new rsp0();
        this.m = rgq.o7;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (tsp0) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new a2i0(new a()));
        this.r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // xsna.pgq
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        qgq qgqVar2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        long length = qgqVar.getLength();
        int i5 = this.a;
        boolean z2 = i5 == 2;
        if (this.o) {
            long j = C.TIME_UNSET;
            rsp0 rsp0Var = this.k;
            if (length != -1 && !z2 && !rsp0Var.c) {
                int i6 = this.t;
                txo0 txo0Var = rsp0Var.a;
                xi90 xi90Var = rsp0Var.b;
                if (i6 <= 0) {
                    rsp0Var.a(qgqVar);
                    return 0;
                }
                if (rsp0Var.e) {
                    if (rsp0Var.g == C.TIME_UNSET) {
                        rsp0Var.a(qgqVar);
                        return 0;
                    }
                    if (rsp0Var.d) {
                        long j2 = rsp0Var.f;
                        if (j2 == C.TIME_UNSET) {
                            rsp0Var.a(qgqVar);
                            return 0;
                        }
                        rsp0Var.h = txo0Var.c(rsp0Var.g) - txo0Var.b(j2);
                        rsp0Var.a(qgqVar);
                        return 0;
                    }
                    int min = (int) Math.min(112800, qgqVar.getLength());
                    long j3 = 0;
                    if (qgqVar.getPosition() != j3) {
                        pzb0Var.a = j3;
                        return 1;
                    }
                    xi90Var.M(min);
                    qgqVar.resetPeekPosition();
                    qgqVar.peekFully(xi90Var.a, 0, min);
                    int i7 = xi90Var.b;
                    int i8 = xi90Var.c;
                    while (true) {
                        if (i7 >= i8) {
                            break;
                        }
                        if (xi90Var.a[i7] == 71) {
                            long n = po40.n(xi90Var, i7, i6);
                            if (n != C.TIME_UNSET) {
                                j = n;
                                break;
                            }
                        }
                        i7++;
                    }
                    rsp0Var.f = j;
                    rsp0Var.d = true;
                    return 0;
                }
                long length2 = qgqVar.getLength();
                int min2 = (int) Math.min(112800, length2);
                long j4 = length2 - min2;
                if (qgqVar.getPosition() != j4) {
                    pzb0Var.a = j4;
                    return 1;
                }
                xi90Var.M(min2);
                qgqVar.resetPeekPosition();
                qgqVar.peekFully(xi90Var.a, 0, min2);
                int i9 = xi90Var.b;
                int i10 = xi90Var.c;
                int i11 = i10 - 188;
                while (true) {
                    if (i11 < i9) {
                        break;
                    }
                    byte[] bArr = xi90Var.a;
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 < i9 || i14 >= i10 || bArr[i14] != 71) {
                            i13 = 0;
                        } else {
                            i13++;
                            if (i13 == 5) {
                                long n2 = po40.n(xi90Var, i11, i6);
                                if (n2 != C.TIME_UNSET) {
                                    j = n2;
                                    break;
                                }
                            }
                        }
                        i12++;
                    }
                    i11--;
                }
                rsp0Var.g = j;
                rsp0Var.e = true;
                return 0;
            }
            if (this.p) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.p = true;
                long j5 = rsp0Var.h;
                if (j5 != C.TIME_UNSET) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    osp0 osp0Var = new osp0(new u27.b(), new osp0.a(this.t, rsp0Var.a), j5, 1 + j5, 0L, length, 188L, 940);
                    this.l = osp0Var;
                    this.m.f(osp0Var.a);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.m.f(new n3i0.b(j5));
                }
            }
            if (this.q) {
                this.q = z;
                seek(0L, 0L);
                if (qgqVar.getPosition() != 0) {
                    pzb0Var.a = 0L;
                    return i;
                }
            }
            osp0 osp0Var2 = this.l;
            if (osp0Var2 != null && osp0Var2.c != null) {
                return osp0Var2.a(qgqVar, pzb0Var);
            }
            qgqVar2 = qgqVar;
            r1 = z;
        } else {
            qgqVar2 = qgqVar;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        xi90 xi90Var2 = this.d;
        byte[] bArr2 = xi90Var2.a;
        if (9400 - xi90Var2.b < 188) {
            int a2 = xi90Var2.a();
            if (a2 > 0) {
                System.arraycopy(bArr2, xi90Var2.b, bArr2, r1, a2);
            }
            xi90Var2.N(bArr2, a2);
        }
        while (true) {
            int a3 = xi90Var2.a();
            SparseArray<tsp0> sparseArray = this.h;
            if (a3 >= 188) {
                int i15 = xi90Var2.b;
                int i16 = xi90Var2.c;
                byte[] bArr3 = xi90Var2.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                xi90Var2.P(i17);
                int i18 = i17 + 188;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.s;
                    this.s = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw ParserException.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.s = r1;
                }
                int i20 = xi90Var2.c;
                if (i18 > i20) {
                    return r1;
                }
                int p = xi90Var2.p();
                if ((8388608 & p) != 0) {
                    xi90Var2.P(i18);
                    return r1;
                }
                int i21 = (4194304 & p) != 0 ? 1 : r1;
                int i22 = (2096896 & p) >> 8;
                boolean z3 = (p & 32) != 0 ? true : r1;
                tsp0 tsp0Var = (p & 16) != 0 ? sparseArray.get(i22) : null;
                if (tsp0Var == null) {
                    xi90Var2.P(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i23 = p & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i24 = sparseIntArray.get(i22, i23 - 1);
                    sparseIntArray.put(i22, i23);
                    if (i24 == i23) {
                        xi90Var2.P(i18);
                        return r1;
                    }
                    if (i23 != ((i24 + 1) & 15)) {
                        tsp0Var.seek();
                    }
                }
                if (z3) {
                    int C = xi90Var2.C();
                    i21 |= (xi90Var2.C() & 64) != 0 ? i4 : r1;
                    xi90Var2.Q(C - 1);
                }
                boolean z4 = this.o;
                if (i3 == i4 || z4 || !this.j.get(i22, r1)) {
                    xi90Var2.O(i18);
                    tsp0Var.a(i21, xi90Var2);
                    xi90Var2.O(i20);
                }
                if (i3 != i4 && !z4 && this.o && length != -1) {
                    this.q = true;
                }
                xi90Var2.P(i18);
                return r1;
            }
            int i25 = xi90Var2.c;
            int read = qgqVar2.read(bArr2, i25, 9400 - i25);
            if (read == -1) {
                int i26 = r1;
                while (i26 < sparseArray.size()) {
                    tsp0 valueAt = sparseArray.valueAt(i26);
                    if (valueAt instanceof z1a0) {
                        z1a0 z1a0Var = (z1a0) valueAt;
                        int i27 = (!z2 || z1a0Var.d()) ? i : r1;
                        if (z1a0Var.c == 3 && z1a0Var.j == -1 && ((!z2 || !(z1a0Var.a instanceof fsu)) && i27 != 0)) {
                            z1a0Var.a(i, new xi90());
                        }
                    }
                    i26++;
                    i = 1;
                }
                return -1;
            }
            xi90Var2.O(i25 + read);
            i = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(qgq qgqVar) throws IOException {
        byte[] bArr = this.d.a;
        tel telVar = (tel) qgqVar;
        telVar.peekFully(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            telVar.skipFully(i, false);
            return true;
        }
        return false;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        if ((this.b & 1) == 0) {
            rgqVar = new e1n0(rgqVar, this.g);
        }
        this.m = rgqVar;
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        osp0 osp0Var;
        long j3;
        SparseArray<tsp0> sparseArray = this.h;
        List<txo0> list = this.c;
        fxc0.z(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            txo0 txo0Var = list.get(i);
            synchronized (txo0Var) {
                j3 = txo0Var.b;
            }
            boolean z = j3 == C.TIME_UNSET;
            if (!z) {
                long d = txo0Var.d();
                z = (d == C.TIME_UNSET || d == 0 || d == j2) ? false : true;
            }
            if (z) {
                txo0Var.f(j2);
            }
        }
        if (j2 != 0 && (osp0Var = this.l) != null) {
            osp0Var.c(j2);
        }
        this.d.M(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sparseArray.valueAt(i2).seek();
        }
        this.s = 0;
    }

    @Override // xsna.pgq
    public final void release() {
    }

    /* compiled from: TsExtractor.java */
    public class a implements z1i0 {
        public final wi90 a = new wi90(new byte[4], 4);

        public a() {
        }

        @Override // xsna.z1i0
        public final void a(xi90 xi90Var) {
            ssp0 ssp0Var = ssp0.this;
            SparseArray<tsp0> sparseArray = ssp0Var.h;
            if (xi90Var.C() == 0 && (xi90Var.C() & 128) != 0) {
                xi90Var.Q(6);
                int a = xi90Var.a() / 4;
                for (int i = 0; i < a; i++) {
                    wi90 wi90Var = this.a;
                    xi90Var.n(wi90Var.b, 0, 4);
                    wi90Var.m(0);
                    int g = wi90Var.g(16);
                    wi90Var.o(3);
                    if (g == 0) {
                        wi90Var.o(13);
                    } else {
                        int g2 = wi90Var.g(13);
                        if (sparseArray.get(g2) == null) {
                            sparseArray.put(g2, new a2i0(ssp0Var.new b(g2)));
                            ssp0Var.n++;
                        }
                    }
                }
                if (ssp0Var.a != 2) {
                    sparseArray.remove(0);
                }
            }
        }

        @Override // xsna.z1i0
        public final void b(txo0 txo0Var, rgq rgqVar, tsp0.c cVar) {
        }
    }

    /* compiled from: TsExtractor.java */
    public class b implements z1i0 {
        public final wi90 a = new wi90(new byte[5], 5);
        public final SparseArray<tsp0> b = new SparseArray<>();
        public final SparseIntArray c = new SparseIntArray();
        public final int d;

        public b(int i) {
            this.d = i;
        }

        @Override // xsna.z1i0
        public final void a(xi90 xi90Var) {
            txo0 txo0Var;
            txo0 txo0Var2;
            SparseArray<tsp0> sparseArray;
            int i;
            char c;
            int i2;
            int i3;
            txo0 txo0Var3;
            ssp0 ssp0Var = ssp0.this;
            SparseArray<tsp0> sparseArray2 = ssp0Var.h;
            SparseBooleanArray sparseBooleanArray = ssp0Var.i;
            bql bqlVar = ssp0Var.f;
            List<txo0> list = ssp0Var.c;
            int i4 = ssp0Var.a;
            if (xi90Var.C() != 2) {
                return;
            }
            int i5 = 0;
            if (i4 == 1 || i4 == 2 || ssp0Var.n == 1) {
                txo0Var = list.get(0);
            } else {
                txo0Var = new txo0(list.get(0).d());
                list.add(txo0Var);
            }
            if ((xi90Var.C() & 128) == 0) {
                return;
            }
            xi90Var.Q(1);
            int J = xi90Var.J();
            xi90Var.Q(3);
            wi90 wi90Var = this.a;
            xi90Var.n(wi90Var.b, 0, 2);
            wi90Var.m(0);
            wi90Var.o(3);
            ssp0Var.t = wi90Var.g(13);
            xi90Var.n(wi90Var.b, 0, 2);
            wi90Var.m(0);
            wi90Var.o(4);
            xi90Var.Q(wi90Var.g(12));
            if (i4 == 2 && ssp0Var.r == null) {
                tsp0 a = bqlVar.a(21, new tsp0.b(21, null, 0, null, y2r0.b));
                ssp0Var.r = a;
                if (a != null) {
                    a.b(txo0Var, ssp0Var.m, new tsp0.c(J, 21, 8192));
                }
            }
            SparseArray<tsp0> sparseArray3 = this.b;
            sparseArray3.clear();
            SparseIntArray sparseIntArray = this.c;
            sparseIntArray.clear();
            int a2 = xi90Var.a();
            while (a2 > 0) {
                xi90Var.n(wi90Var.b, i5, 5);
                wi90Var.m(i5);
                int g = wi90Var.g(8);
                wi90Var.o(3);
                int g2 = wi90Var.g(13);
                wi90Var.o(4);
                int g3 = wi90Var.g(12);
                int i6 = xi90Var.b;
                wi90 wi90Var2 = wi90Var;
                int i7 = i6 + g3;
                int i8 = -1;
                String str = null;
                ArrayList arrayList = null;
                int i9 = 0;
                int i10 = a2;
                while (xi90Var.b < i7) {
                    int C = xi90Var.C();
                    int C2 = xi90Var.b + xi90Var.C();
                    if (C2 > i7) {
                        break;
                    }
                    SparseArray<tsp0> sparseArray4 = sparseArray2;
                    if (C == 5) {
                        long E = xi90Var.E();
                        if (E == 1094921523) {
                            i8 = 129;
                        } else if (E == 1161904947) {
                            i8 = 135;
                        } else {
                            if (E != 1094921524) {
                                if (E == 1212503619) {
                                    i8 = 36;
                                }
                            }
                            i8 = 172;
                        }
                        i2 = C2;
                        i3 = J;
                        txo0Var3 = txo0Var;
                    } else if (C == 106) {
                        i2 = C2;
                        i3 = J;
                        txo0Var3 = txo0Var;
                        i8 = 129;
                    } else if (C == 122) {
                        i3 = J;
                        txo0Var3 = txo0Var;
                        i8 = 135;
                        i2 = C2;
                    } else if (C == 127) {
                        int C3 = xi90Var.C();
                        if (C3 != 21) {
                            if (C3 == 14) {
                                i8 = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                            } else if (C3 == 33) {
                                i8 = 139;
                            }
                            i2 = C2;
                            i3 = J;
                            txo0Var3 = txo0Var;
                        }
                        i8 = 172;
                        i2 = C2;
                        i3 = J;
                        txo0Var3 = txo0Var;
                    } else {
                        if (C == 123) {
                            i2 = C2;
                            i8 = 138;
                        } else if (C == 10) {
                            String trim = xi90Var.A(3, StandardCharsets.UTF_8).trim();
                            i9 = xi90Var.C();
                            i2 = C2;
                            str = trim;
                        } else {
                            if (C == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (xi90Var.b < C2) {
                                    String trim2 = xi90Var.A(3, StandardCharsets.UTF_8).trim();
                                    xi90Var.C();
                                    txo0 txo0Var4 = txo0Var;
                                    byte[] bArr = new byte[4];
                                    xi90Var.n(bArr, 0, 4);
                                    arrayList2.add(new tsp0.a(trim2, bArr));
                                    txo0Var = txo0Var4;
                                    C2 = C2;
                                    J = J;
                                }
                                i2 = C2;
                                i3 = J;
                                txo0Var3 = txo0Var;
                                arrayList = arrayList2;
                                i8 = 89;
                            } else {
                                i2 = C2;
                                i3 = J;
                                txo0Var3 = txo0Var;
                                if (C == 111) {
                                    i8 = 257;
                                }
                            }
                            xi90Var.Q(i2 - xi90Var.b);
                            txo0Var = txo0Var3;
                            sparseArray2 = sparseArray4;
                            J = i3;
                        }
                        i3 = J;
                        txo0Var3 = txo0Var;
                    }
                    xi90Var.Q(i2 - xi90Var.b);
                    txo0Var = txo0Var3;
                    sparseArray2 = sparseArray4;
                    J = i3;
                }
                SparseArray<tsp0> sparseArray5 = sparseArray2;
                int i11 = J;
                txo0 txo0Var5 = txo0Var;
                xi90Var.P(i7);
                tsp0.b bVar = new tsp0.b(i8, str, i9, arrayList, Arrays.copyOfRange(xi90Var.a, i6, i7));
                if (g == 6 || g == 5) {
                    g = i8;
                }
                a2 = i10 - (g3 + 5);
                int i12 = i4 == 2 ? g : g2;
                if (sparseBooleanArray.get(i12)) {
                    c = 21;
                } else {
                    c = 21;
                    tsp0 a3 = (i4 == 2 && g == 21) ? ssp0Var.r : bqlVar.a(g, bVar);
                    if (i4 != 2 || g2 < sparseIntArray.get(i12, 8192)) {
                        sparseIntArray.put(i12, g2);
                        sparseArray3.put(i12, a3);
                    }
                }
                txo0Var = txo0Var5;
                wi90Var = wi90Var2;
                sparseArray2 = sparseArray5;
                J = i11;
                i5 = 0;
            }
            SparseArray<tsp0> sparseArray6 = sparseArray2;
            int i13 = J;
            txo0 txo0Var6 = txo0Var;
            int size = sparseIntArray.size();
            int i14 = 0;
            while (i14 < size) {
                int keyAt = sparseIntArray.keyAt(i14);
                int valueAt = sparseIntArray.valueAt(i14);
                sparseBooleanArray.put(keyAt, true);
                ssp0Var.j.put(valueAt, true);
                tsp0 valueAt2 = sparseArray3.valueAt(i14);
                if (valueAt2 != null) {
                    if (valueAt2 != ssp0Var.r) {
                        rgq rgqVar = ssp0Var.m;
                        i = i13;
                        tsp0.c cVar = new tsp0.c(i, keyAt, 8192);
                        txo0Var2 = txo0Var6;
                        valueAt2.b(txo0Var2, rgqVar, cVar);
                    } else {
                        txo0Var2 = txo0Var6;
                        i = i13;
                    }
                    sparseArray = sparseArray6;
                    sparseArray.put(valueAt, valueAt2);
                } else {
                    txo0Var2 = txo0Var6;
                    sparseArray = sparseArray6;
                    i = i13;
                }
                i14++;
                txo0Var6 = txo0Var2;
                sparseArray6 = sparseArray;
                i13 = i;
            }
            SparseArray<tsp0> sparseArray7 = sparseArray6;
            if (i4 == 2) {
                if (ssp0Var.o) {
                    return;
                }
                ssp0Var.m.endTracks();
                ssp0Var.n = 0;
                ssp0Var.o = true;
                return;
            }
            sparseArray7.remove(this.d);
            int i15 = i4 == 1 ? 0 : ssp0Var.n - 1;
            ssp0Var.n = i15;
            if (i15 == 0) {
                ssp0Var.m.endTracks();
                ssp0Var.o = true;
            }
        }

        @Override // xsna.z1i0
        public final void b(txo0 txo0Var, rgq rgqVar, tsp0.c cVar) {
        }
    }
}
