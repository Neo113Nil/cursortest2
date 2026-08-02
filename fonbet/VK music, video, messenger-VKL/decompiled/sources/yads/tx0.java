package yads;

import android.util.Pair;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import xsna.aox0;

/* loaded from: classes10.dex */
public final class tx0 implements nq0 {
    public static final byte[] G = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final nx0 H;
    public int A;
    public boolean B;
    public qq0 C;
    public q83[] D;
    public q83[] E;
    public boolean F;
    public final int a;
    public final List b;
    public final SparseArray c;
    public final kc2 d;
    public final kc2 e;
    public final kc2 f;
    public final byte[] g;
    public final kc2 h;
    public final zm0 i;
    public final kc2 j;
    public final ArrayDeque k;
    public final ArrayDeque l;
    public final q83 m;
    public int n;
    public int o;
    public long p;
    public int q;
    public kc2 r;
    public long s;
    public int t;
    public long u;
    public long v;
    public long w;
    public sx0 x;
    public int y;
    public int z;

    static {
        mx0 mx0Var = new mx0();
        mx0Var.k = MimeTypes.APPLICATION_EMSG;
        H = new nx0(mx0Var);
    }

    public tx0() {
        this(0);
    }

    public final i83 a(i83 i83Var) {
        return i83Var;
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((sx0) this.c.valueAt(i)).b();
        }
        this.l.clear();
        this.t = 0;
        this.u = j2;
        this.k.clear();
        this.n = 0;
        this.q = 0;
    }

    public tx0(int i) {
        this(Collections.EMPTY_LIST);
    }

    public static lk0 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            wj wjVar = (wj) arrayList.get(i);
            if (wjVar.a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = wjVar.b.a;
                em2 a = fm2.a(bArr);
                UUID uuid = a == null ? null : a.a;
                if (uuid == null) {
                    ji1.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new kk0(uuid, null, MimeTypes.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new lk0(null, false, (kk0[]) arrayList2.toArray(new kk0[0]));
    }

    public tx0(int i, List list, q83 q83Var) {
        this.a = i;
        this.b = Collections.unmodifiableList(list);
        this.m = q83Var;
        this.i = new zm0();
        this.j = new kc2(16);
        this.d = new kc2(ez1.a);
        this.e = new kc2(5);
        this.f = new kc2();
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new kc2(bArr);
        this.k = new ArrayDeque();
        this.l = new ArrayDeque();
        this.c = new SparseArray();
        this.v = C.TIME_UNSET;
        this.u = C.TIME_UNSET;
        this.w = C.TIME_UNSET;
        this.C = qq0.a;
        this.D = new q83[0];
        this.E = new q83[0];
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        int i;
        this.C = qq0Var;
        int i2 = 0;
        this.n = 0;
        this.q = 0;
        q83[] q83VarArr = new q83[2];
        this.D = q83VarArr;
        q83 q83Var = this.m;
        if (q83Var != null) {
            q83VarArr[0] = q83Var;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.a & 4) != 0) {
            q83VarArr[i] = qq0Var.a(100, 5);
            i3 = 101;
            i++;
        }
        q83[] q83VarArr2 = (q83[]) mc3.a(i, this.D);
        this.D = q83VarArr2;
        for (q83 q83Var2 : q83VarArr2) {
            q83Var2.a(H);
        }
        this.E = new q83[this.b.size()];
        while (i2 < this.E.length) {
            q83 a = this.C.a(i3, 3);
            a.a((nx0) this.b.get(i2));
            this.E[i2] = a;
            i2++;
            i3++;
        }
    }

    public tx0(List list) {
        this(0, list, null);
    }

    public final void a(vj vjVar) {
        re0 re0Var;
        re0 re0Var2;
        lk0 a = a(vjVar.c);
        vj b = vjVar.b(1836475768);
        b.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = b.c.size();
        long j = -9223372036854775807L;
        for (int i = 0; i < size; i++) {
            wj wjVar = (wj) b.c.get(i);
            int i2 = wjVar.a;
            if (i2 == 1953654136) {
                kc2 kc2Var = wjVar.b;
                kc2Var.e(12);
                Pair create = Pair.create(Integer.valueOf(kc2Var.b()), new re0(kc2Var.b() - 1, kc2Var.b(), kc2Var.b(), kc2Var.b()));
                sparseArray.put(((Integer) create.first).intValue(), (re0) create.second);
            } else if (i2 == 1835362404) {
                kc2 kc2Var2 = wjVar.b;
                kc2Var2.e(8);
                j = ((kc2Var2.b() >> 24) & 255) == 0 ? kc2Var2.n() : kc2Var2.q();
            }
        }
        ArrayList a2 = ek.a(vjVar, new az0(), j, a, (this.a & 16) != 0, false, new aox0(this, 2));
        int size2 = a2.size();
        if (this.c.size() == 0) {
            for (int i3 = 0; i3 < size2; i3++) {
                r83 r83Var = (r83) a2.get(i3);
                i83 i83Var = r83Var.a;
                q83 a3 = this.C.a(i3, i83Var.b);
                int i4 = i83Var.a;
                if (sparseArray.size() == 1) {
                    re0Var2 = (re0) sparseArray.valueAt(0);
                } else {
                    re0Var2 = (re0) sparseArray.get(i4);
                    re0Var2.getClass();
                }
                this.c.put(i83Var.a, new sx0(a3, r83Var, re0Var2));
                this.v = Math.max(this.v, i83Var.e);
            }
            this.C.a();
            return;
        }
        if (this.c.size() != size2) {
            throw new IllegalStateException();
        }
        for (int i5 = 0; i5 < size2; i5++) {
            r83 r83Var2 = (r83) a2.get(i5);
            i83 i83Var2 = r83Var2.a;
            sx0 sx0Var = (sx0) this.c.get(i83Var2.a);
            int i6 = i83Var2.a;
            if (sparseArray.size() == 1) {
                re0Var = (re0) sparseArray.valueAt(0);
            } else {
                re0Var = (re0) sparseArray.get(i6);
                re0Var.getClass();
            }
            sx0Var.a(r83Var2, re0Var);
        }
    }

    @Override // yads.nq0
    public final void release() {
    }

    public static void a(kc2 kc2Var, int i, k83 k83Var) {
        kc2Var.e(i + 8);
        int b = kc2Var.b();
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int p = kc2Var.p();
            if (p == 0) {
                Arrays.fill(k83Var.l, 0, k83Var.e, false);
                return;
            }
            if (p == k83Var.e) {
                Arrays.fill(k83Var.l, 0, p, z);
                k83Var.n.c(kc2Var.c - kc2Var.b);
                k83Var.k = true;
                k83Var.o = true;
                kc2 kc2Var2 = k83Var.n;
                kc2Var.a(kc2Var2.a, 0, kc2Var2.c);
                k83Var.n.e(0);
                k83Var.o = false;
                return;
            }
            StringBuilder b2 = xsna.ji.b(p, "Senc sample count ", " is different from fragment sample count");
            b2.append(k83Var.e);
            throw new pc2(b2.toString(), null, true, 1);
        }
        throw pc2.b("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j) {
        SparseArray sparseArray;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        wj c;
        wj c2;
        kc2 kc2Var;
        int i10;
        int size;
        int i11;
        int b;
        int i12;
        boolean z;
        int i13;
        int i14;
        int i15;
        ArrayList arrayList;
        int i16;
        int i17;
        int i18;
        boolean z2;
        int i19;
        int i20;
        re0 re0Var;
        int i21;
        while (!this.k.isEmpty() && ((vj) this.k.peek()).b == j) {
            vj vjVar = (vj) this.k.pop();
            int i22 = vjVar.a;
            if (i22 == 1836019574) {
                a(vjVar);
            } else if (i22 == 1836019558) {
                SparseArray sparseArray2 = this.c;
                int i23 = this.a;
                byte[] bArr = this.g;
                int size2 = vjVar.d.size();
                int i24 = 0;
                while (i24 < size2) {
                    vj vjVar2 = (vj) vjVar.d.get(i24);
                    if (vjVar2.a == 1953653094) {
                        wj c3 = vjVar2.c(1952868452);
                        c3.getClass();
                        kc2 kc2Var2 = c3.b;
                        kc2Var2.e(8);
                        int b2 = kc2Var2.b();
                        sx0 sx0Var = (sx0) sparseArray2.get(kc2Var2.b());
                        if (sx0Var == null) {
                            sparseArray = sparseArray2;
                            sx0Var = null;
                        } else {
                            sparseArray = sparseArray2;
                            if ((b2 & 1) != 0) {
                                long q = kc2Var2.q();
                                k83 k83Var = sx0Var.b;
                                k83Var.b = q;
                                k83Var.c = q;
                            }
                            re0 re0Var2 = sx0Var.e;
                            if ((b2 & 2) != 0) {
                                i4 = kc2Var2.b() - 1;
                            } else {
                                i4 = re0Var2.a;
                            }
                            if ((b2 & 8) != 0) {
                                i5 = kc2Var2.b();
                            } else {
                                i5 = re0Var2.b;
                            }
                            if ((b2 & 16) != 0) {
                                i6 = kc2Var2.b();
                            } else {
                                i6 = re0Var2.c;
                            }
                            if ((b2 & 32) != 0) {
                                i7 = kc2Var2.b();
                            } else {
                                i7 = re0Var2.d;
                            }
                            sx0Var.b.a = new re0(i4, i5, i6, i7);
                        }
                        if (sx0Var != null) {
                            k83 k83Var2 = sx0Var.b;
                            long j2 = k83Var2.p;
                            boolean z3 = k83Var2.q;
                            sx0Var.b();
                            sx0Var.l = true;
                            wj c4 = vjVar2.c(1952867444);
                            if (c4 != null && (i23 & 2) == 0) {
                                kc2 kc2Var3 = c4.b;
                                kc2Var3.e(8);
                                k83Var2.p = ((kc2Var3.b() >> 24) & 255) == 1 ? kc2Var3.q() : kc2Var3.n();
                                k83Var2.q = true;
                            } else {
                                k83Var2.p = j2;
                                k83Var2.q = z3;
                            }
                            ArrayList arrayList2 = vjVar2.c;
                            int size3 = arrayList2.size();
                            int i25 = 0;
                            int i26 = 0;
                            int i27 = 0;
                            while (true) {
                                i8 = 1953658222;
                                if (i27 >= size3) {
                                    break;
                                }
                                wj wjVar = (wj) arrayList2.get(i27);
                                int i28 = i23;
                                if (wjVar.a == 1953658222) {
                                    kc2 kc2Var4 = wjVar.b;
                                    kc2Var4.e(12);
                                    int p = kc2Var4.p();
                                    if (p > 0) {
                                        i25 += p;
                                        i26++;
                                    }
                                }
                                i27++;
                                i23 = i28;
                            }
                            i3 = i23;
                            sx0Var.h = 0;
                            sx0Var.g = 0;
                            sx0Var.f = 0;
                            k83 k83Var3 = sx0Var.b;
                            k83Var3.d = i26;
                            k83Var3.e = i25;
                            if (k83Var3.g.length < i26) {
                                k83Var3.f = new long[i26];
                                k83Var3.g = new int[i26];
                            }
                            if (k83Var3.h.length < i25) {
                                int i29 = (i25 * 125) / 100;
                                k83Var3.h = new int[i29];
                                k83Var3.i = new long[i29];
                                k83Var3.j = new boolean[i29];
                                k83Var3.l = new boolean[i29];
                            }
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            while (true) {
                                long j3 = 0;
                                if (i30 < size3) {
                                    wj wjVar2 = (wj) arrayList2.get(i30);
                                    if (wjVar2.a == i8) {
                                        int i33 = i31 + 1;
                                        kc2 kc2Var5 = wjVar2.b;
                                        kc2Var5.e(8);
                                        int b3 = kc2Var5.b();
                                        i13 = i30;
                                        i83 i83Var = sx0Var.d.a;
                                        i14 = size2;
                                        k83 k83Var4 = sx0Var.b;
                                        i15 = i24;
                                        re0 re0Var3 = k83Var4.a;
                                        int i34 = mc3.a;
                                        arrayList = arrayList2;
                                        k83Var4.g[i31] = kc2Var5.p();
                                        long[] jArr = k83Var4.f;
                                        i16 = size3;
                                        int i35 = i31;
                                        long j4 = k83Var4.b;
                                        jArr[i35] = j4;
                                        if ((b3 & 1) != 0) {
                                            jArr[i35] = j4 + kc2Var5.b();
                                        }
                                        boolean z4 = (b3 & 4) != 0;
                                        int i36 = re0Var3.d;
                                        if (z4) {
                                            i36 = kc2Var5.b();
                                        }
                                        boolean z5 = (b3 & 256) != 0;
                                        boolean z6 = z4;
                                        boolean z7 = (b3 & 512) != 0;
                                        boolean z8 = (b3 & 1024) != 0;
                                        boolean z9 = (b3 & 2048) != 0;
                                        long[] jArr2 = i83Var.h;
                                        boolean z10 = z8;
                                        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
                                            j3 = i83Var.i[0];
                                        }
                                        int[] iArr = k83Var4.h;
                                        long[] jArr3 = k83Var4.i;
                                        boolean[] zArr = k83Var4.j;
                                        boolean z11 = i83Var.b == 2 && (i3 & 1) != 0;
                                        int i37 = k83Var4.g[i35] + i32;
                                        boolean z12 = z11;
                                        long j5 = i83Var.c;
                                        long j6 = k83Var4.p;
                                        while (i32 < i37) {
                                            if (z5) {
                                                i17 = i37;
                                                i18 = kc2Var5.b();
                                            } else {
                                                i17 = i37;
                                                i18 = re0Var3.b;
                                            }
                                            int i38 = i36;
                                            if (i18 < 0) {
                                                throw new pc2(nh2.a("Unexpected negative value: ", i18), null, true, 1);
                                            }
                                            if (z7) {
                                                z2 = z5;
                                                i19 = kc2Var5.b();
                                            } else {
                                                z2 = z5;
                                                i19 = re0Var3.c;
                                            }
                                            if (i19 >= 0) {
                                                if (z10) {
                                                    i20 = kc2Var5.b();
                                                } else {
                                                    i20 = (i32 == 0 && z6) ? i38 : re0Var3.d;
                                                }
                                                if (z9) {
                                                    re0Var = re0Var3;
                                                    i21 = kc2Var5.b();
                                                } else {
                                                    re0Var = re0Var3;
                                                    i21 = 0;
                                                }
                                                int i39 = i33;
                                                kc2 kc2Var6 = kc2Var5;
                                                long a = mc3.a((i21 + j6) - j3, 1000000L, j5);
                                                jArr3[i32] = a;
                                                if (!k83Var4.q) {
                                                    jArr3[i32] = a + sx0Var.d.h;
                                                }
                                                iArr[i32] = i19;
                                                zArr[i32] = ((i20 >> 16) & 1) == 0 && (!z12 || i32 == 0);
                                                j6 += i18;
                                                i32++;
                                                i37 = i17;
                                                i36 = i38;
                                                z5 = z2;
                                                re0Var3 = re0Var;
                                                i33 = i39;
                                                kc2Var5 = kc2Var6;
                                            } else {
                                                throw new pc2(nh2.a("Unexpected negative value: ", i19), null, true, 1);
                                            }
                                        }
                                        k83Var4.p = j6;
                                        i32 = i37;
                                        i31 = i33;
                                    } else {
                                        i13 = i30;
                                        i14 = size2;
                                        i15 = i24;
                                        arrayList = arrayList2;
                                        i16 = size3;
                                    }
                                    i30 = i13 + 1;
                                    size2 = i14;
                                    i24 = i15;
                                    arrayList2 = arrayList;
                                    size3 = i16;
                                    i8 = 1953658222;
                                } else {
                                    i2 = size2;
                                    i = i24;
                                    i83 i83Var2 = sx0Var.d.a;
                                    re0 re0Var4 = k83Var2.a;
                                    re0Var4.getClass();
                                    int i40 = re0Var4.a;
                                    j83[] j83VarArr = i83Var2.k;
                                    j83 j83Var = j83VarArr == null ? null : j83VarArr[i40];
                                    wj c5 = vjVar2.c(1935763834);
                                    if (c5 != null) {
                                        j83Var.getClass();
                                        kc2 kc2Var7 = c5.b;
                                        int i41 = j83Var.d;
                                        kc2Var7.e(8);
                                        if ((kc2Var7.b() & 1) == 1) {
                                            kc2Var7.e(kc2Var7.b + 8);
                                        }
                                        int m = kc2Var7.m();
                                        int p2 = kc2Var7.p();
                                        if (p2 <= k83Var2.e) {
                                            if (m == 0) {
                                                boolean[] zArr2 = k83Var2.l;
                                                i12 = 0;
                                                for (int i42 = 0; i42 < p2; i42++) {
                                                    int m2 = kc2Var7.m();
                                                    i12 += m2;
                                                    zArr2[i42] = m2 > i41;
                                                }
                                                z = false;
                                            } else {
                                                boolean z13 = m > i41;
                                                i12 = m * p2;
                                                z = false;
                                                Arrays.fill(k83Var2.l, 0, p2, z13);
                                            }
                                            Arrays.fill(k83Var2.l, p2, k83Var2.e, z);
                                            if (i12 > 0) {
                                                k83Var2.n.c(i12);
                                                i9 = 1;
                                                k83Var2.k = true;
                                                k83Var2.o = true;
                                                c = vjVar2.c(1935763823);
                                                if (c != null) {
                                                    kc2 kc2Var8 = c.b;
                                                    kc2Var8.e(8);
                                                    int b4 = kc2Var8.b();
                                                    if ((b4 & 1) == i9) {
                                                        kc2Var8.e(kc2Var8.b + 8);
                                                    }
                                                    int p3 = kc2Var8.p();
                                                    if (p3 != i9) {
                                                        throw new pc2(nh2.a("Unexpected saio entry count: ", p3), null, true, 1);
                                                    }
                                                    k83Var2.c += ((b4 >> 24) & 255) == 0 ? kc2Var8.n() : kc2Var8.q();
                                                }
                                                byte[] bArr2 = null;
                                                c2 = vjVar2.c(1936027235);
                                                if (c2 != null) {
                                                    a(c2.b, 0, k83Var2);
                                                }
                                                String str = j83Var == null ? j83Var.b : null;
                                                kc2Var = null;
                                                kc2 kc2Var9 = null;
                                                for (i10 = 0; i10 < vjVar2.c.size(); i10++) {
                                                    wj wjVar3 = (wj) vjVar2.c.get(i10);
                                                    kc2 kc2Var10 = wjVar3.b;
                                                    int i43 = wjVar3.a;
                                                    if (i43 == 1935828848) {
                                                        kc2Var10.e(12);
                                                        if (kc2Var10.b() == 1936025959) {
                                                            kc2Var = kc2Var10;
                                                        }
                                                    } else if (i43 == 1936158820) {
                                                        kc2Var10.e(12);
                                                        if (kc2Var10.b() == 1936025959) {
                                                            kc2Var9 = kc2Var10;
                                                        }
                                                    }
                                                }
                                                if (kc2Var != null && kc2Var9 != null) {
                                                    kc2Var.e(8);
                                                    b = (kc2Var.b() >> 24) & 255;
                                                    kc2Var.e(kc2Var.b + 4);
                                                    if (b == 1) {
                                                        kc2Var.e(kc2Var.b + 4);
                                                    }
                                                    if (kc2Var.b() != 1) {
                                                        kc2Var9.e(8);
                                                        int b5 = (kc2Var9.b() >> 24) & 255;
                                                        kc2Var9.e(kc2Var9.b + 4);
                                                        if (b5 == 1) {
                                                            if (kc2Var9.n() == 0) {
                                                                throw pc2.b("Variable length description in sgpd found (unsupported)");
                                                            }
                                                        } else if (b5 >= 2) {
                                                            kc2Var9.e(kc2Var9.b + 4);
                                                        }
                                                        if (kc2Var9.n() == 1) {
                                                            kc2Var9.e(kc2Var9.b + 1);
                                                            int m3 = kc2Var9.m();
                                                            int i44 = (m3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                                            int i45 = m3 & 15;
                                                            boolean z14 = kc2Var9.m() == 1;
                                                            if (z14) {
                                                                int m4 = kc2Var9.m();
                                                                byte[] bArr3 = new byte[16];
                                                                kc2Var9.a(bArr3, 0, 16);
                                                                if (m4 == 0) {
                                                                    int m5 = kc2Var9.m();
                                                                    bArr2 = new byte[m5];
                                                                    kc2Var9.a(bArr2, 0, m5);
                                                                }
                                                                k83Var2.k = true;
                                                                k83Var2.m = new j83(z14, str, m4, bArr3, i44, i45, bArr2);
                                                            }
                                                        } else {
                                                            throw pc2.b("Entry count in sgpd != 1 (unsupported).");
                                                        }
                                                    } else {
                                                        throw pc2.b("Entry count in sbgp != 1 (unsupported).");
                                                    }
                                                }
                                                size = vjVar2.c.size();
                                                for (i11 = 0; i11 < size; i11++) {
                                                    wj wjVar4 = (wj) vjVar2.c.get(i11);
                                                    if (wjVar4.a == 1970628964) {
                                                        kc2 kc2Var11 = wjVar4.b;
                                                        kc2Var11.e(8);
                                                        kc2Var11.a(bArr, 0, 16);
                                                        if (Arrays.equals(bArr, G)) {
                                                            a(kc2Var11, 16, k83Var2);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            StringBuilder b6 = xsna.ji.b(p2, "Saiz sample count ", " is greater than fragment sample count");
                                            b6.append(k83Var2.e);
                                            throw new pc2(b6.toString(), null, true, 1);
                                        }
                                    }
                                    i9 = 1;
                                    c = vjVar2.c(1935763823);
                                    if (c != null) {
                                    }
                                    byte[] bArr22 = null;
                                    c2 = vjVar2.c(1936027235);
                                    if (c2 != null) {
                                    }
                                    if (j83Var == null) {
                                    }
                                    kc2Var = null;
                                    kc2 kc2Var92 = null;
                                    while (i10 < vjVar2.c.size()) {
                                    }
                                    if (kc2Var != null) {
                                        kc2Var.e(8);
                                        b = (kc2Var.b() >> 24) & 255;
                                        kc2Var.e(kc2Var.b + 4);
                                        if (b == 1) {
                                        }
                                        if (kc2Var.b() != 1) {
                                        }
                                    }
                                    size = vjVar2.c.size();
                                    while (i11 < size) {
                                    }
                                }
                            }
                        }
                    } else {
                        sparseArray = sparseArray2;
                    }
                    i3 = i23;
                    i2 = size2;
                    i = i24;
                    i24 = i + 1;
                    sparseArray2 = sparseArray;
                    i23 = i3;
                    size2 = i2;
                }
                lk0 a2 = a(vjVar.c);
                if (a2 != null) {
                    int size4 = this.c.size();
                    for (int i46 = 0; i46 < size4; i46++) {
                        sx0 sx0Var2 = (sx0) this.c.valueAt(i46);
                        i83 i83Var3 = sx0Var2.d.a;
                        re0 re0Var5 = sx0Var2.b.a;
                        int i47 = mc3.a;
                        int i48 = re0Var5.a;
                        j83[] j83VarArr2 = i83Var3.k;
                        j83 j83Var2 = j83VarArr2 == null ? null : j83VarArr2[i48];
                        String str2 = j83Var2 != null ? j83Var2.b : null;
                        lk0 lk0Var = mc3.a(a2.d, str2) ? a2 : new lk0(str2, false, a2.b);
                        nx0 nx0Var = sx0Var2.d.a.f;
                        nx0Var.getClass();
                        mx0 mx0Var = new mx0(nx0Var);
                        mx0Var.n = lk0Var;
                        sx0Var2.a.a(new nx0(mx0Var));
                    }
                }
                if (this.u != C.TIME_UNSET) {
                    int size5 = this.c.size();
                    for (int i49 = 0; i49 < size5; i49++) {
                        sx0 sx0Var3 = (sx0) this.c.valueAt(i49);
                        long j7 = this.u;
                        int i50 = sx0Var3.f;
                        while (true) {
                            k83 k83Var5 = sx0Var3.b;
                            if (i50 < k83Var5.e && k83Var5.i[i50] < j7) {
                                if (k83Var5.j[i50]) {
                                    sx0Var3.i = i50;
                                }
                                i50++;
                            }
                        }
                    }
                    this.u = C.TIME_UNSET;
                }
            } else if (!this.k.isEmpty()) {
                ((vj) this.k.peek()).d.add(vjVar);
            }
        }
        this.n = 0;
        this.q = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0132, code lost:
    
        r31.x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0140, code lost:
    
        if (r2.d.a.g != 1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0142, code lost:
    
        r31.y = r3 - 8;
        ((yads.ld0) r32).a(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x015c, code lost:
    
        if ("audio/ac4".equals(r2.d.a.f.m) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x015e, code lost:
    
        r31.z = r2.a(r31.y, 7);
        yads.l0.a(r31.y, r31.h);
        r2.a.a(7, r31.h);
        r31.z += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0183, code lost:
    
        r31.y += r31.z;
        r31.n = 4;
        r31.A = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017b, code lost:
    
        r31.z = r2.a(r31.y, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d1, code lost:
    
        r3 = r2.b.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x018f, code lost:
    
        r3 = r2.d;
        r5 = r3.a;
        r6 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0197, code lost:
    
        if (r2.l != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0199, code lost:
    
        r10 = r3.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a8, code lost:
    
        r3 = r5.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01aa, code lost:
    
        if (r3 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ac, code lost:
    
        r12 = r31.e.a;
        r12[0] = 0;
        r12[1] = 0;
        r12[r33] = 0;
        r13 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c0, code lost:
    
        if (r31.z >= r31.y) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c2, code lost:
    
        r14 = r31.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c6, code lost:
    
        if (r14 != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c8, code lost:
    
        ((yads.ld0) r32).a(r12, r3, r13, r9);
        r31.e.e(r9);
        r14 = r31.e.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d9, code lost:
    
        if (r14 < r8) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01db, code lost:
    
        r31.A = r14 - 1;
        r31.d.e(r9);
        r6.a(4, r31.d);
        r6.a(r8 == true ? 1 : 0, r31.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f2, code lost:
    
        if (r31.E.length <= 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01f4, code lost:
    
        r14 = r5.f.m;
        r17 = r12[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0200, code lost:
    
        if ("video/avc".equals(r14) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0204, code lost:
    
        if ((r17 & 31) == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0213, code lost:
    
        r9 = r8 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0216, code lost:
    
        r31.B = r9;
        r31.z += 5;
        r31.y += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0223, code lost:
    
        r9 = 0;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x020a, code lost:
    
        if ("video/hevc".equals(r14) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0211, code lost:
    
        if (((r17 & 126) >> (r8 == true ? 1 : 0)) != 39) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0215, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x022c, code lost:
    
        throw new yads.pc2("Invalid NAL length", null, r8, r8 == true ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x022f, code lost:
    
        if (r31.B == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0231, code lost:
    
        r31.f.c(r14);
        r9 = r31.f.a;
        r14 = r31.A;
        r27 = r8 == true ? 1 : 0;
        ((yads.ld0) r32).a(r9, 0, r14, false);
        r6.a(r31.A, r31.f);
        r4 = r31.A;
        r8 = r31.f;
        r8 = yads.ez1.a(r8.c, r8.a);
        r31.f.e("video/hevc".equals(r5.f.m) ? 1 : 0);
        r31.f.d(r8);
        yads.rt.a(r10, r31.f, r31.E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0279, code lost:
    
        r31.z += r4;
        r31.A -= r4;
        r8 = r27;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0272, code lost:
    
        r27 = r8 == true ? 1 : 0;
        r4 = r6.a(r32, r14, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0287, code lost:
    
        r27 = r8 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a0, code lost:
    
        if (r2.l != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a2, code lost:
    
        r1 = r2.d.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02bd, code lost:
    
        if (r2.a() == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02bf, code lost:
    
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02c2, code lost:
    
        r22 = r1;
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c8, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02ca, code lost:
    
        r25 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02d1, code lost:
    
        r20 = r10;
        r6.a(r20, r22, r31.y, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02e4, code lost:
    
        if (r31.l.isEmpty() != false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02e6, code lost:
    
        r1 = (yads.rx0) r31.l.removeFirst();
        r31.t -= r1.c;
        r3 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02f9, code lost:
    
        if (r1.b == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02fb, code lost:
    
        r3 = r3 + r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02fd, code lost:
    
        r9 = r3;
        r3 = r31.D;
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0302, code lost:
    
        if (r5 >= r4) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0304, code lost:
    
        r3[r5].a(r9, 1, r1.c, r31.t, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0312, code lost:
    
        r2.f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x031a, code lost:
    
        if (r2.l != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x031c, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0335, code lost:
    
        r31.x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x033b, code lost:
    
        r31.n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x033d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x031e, code lost:
    
        r1 = r2.g + 1;
        r2.g = r1;
        r3 = r2.b.g;
        r4 = r2.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x032c, code lost:
    
        if (r1 != r3[r4]) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x032e, code lost:
    
        r2.h = r4 + 1;
        r8 = 0;
        r2.g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0339, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02cf, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02b3, code lost:
    
        if (r2.b.j[r2.f] == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02b5, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02b8, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x028a, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x028c, code lost:
    
        r3 = r31.z;
        r4 = r31.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0290, code lost:
    
        if (r3 >= r4) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0292, code lost:
    
        r31.z += r6.a(r32, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x01a0, code lost:
    
        r10 = r2.b.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00be, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c2, code lost:
    
        if (r31.n != 3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c6, code lost:
    
        if (r2.l != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c8, code lost:
    
        r3 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d9, code lost:
    
        r31.y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00df, code lost:
    
        if (r2.f >= r2.i) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e1, code lost:
    
        ((yads.ld0) r32).a(r3);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ea, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ed, code lost:
    
        r3 = r2.b.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f3, code lost:
    
        if (r1 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f5, code lost:
    
        r3.e(r3.b + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00fb, code lost:
    
        r1 = r2.b;
        r5 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0101, code lost:
    
        if (r1.k == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0107, code lost:
    
        if (r1.l[r5] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0109, code lost:
    
        r3.e(r3.b + (r3.r() * 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0114, code lost:
    
        r2.f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x011b, code lost:
    
        if (r2.l != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011e, code lost:
    
        r1 = r2.g + 1;
        r2.g = r1;
        r3 = r2.b.g;
        r4 = r2.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012b, code lost:
    
        if (r1 != r3[r4]) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x012d, code lost:
    
        r2.h = r4 + 1;
        r2.g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0134, code lost:
    
        r31.n = 3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        String j;
        String j2;
        long a;
        long n;
        long j3;
        long j4;
        long q;
        long q2;
        char c;
        int i;
        long j5;
        long j6;
        loop0: while (true) {
            while (true) {
                int i2 = this.n;
                char c2 = 2;
                ?? r8 = 1;
                ?? r9 = 0;
                if (i2 == 0) {
                    if (this.q == 0) {
                        if (!((ld0) oq0Var).a(this.j.a, 0, 8, true)) {
                            return -1;
                        }
                        this.q = 8;
                        this.j.e(0);
                        this.p = this.j.n();
                        this.o = this.j.b();
                    }
                    long j7 = this.p;
                    if (j7 == 1) {
                        ((ld0) oq0Var).a(this.j.a, 8, 8, false);
                        this.q += 8;
                        this.p = this.j.q();
                    } else if (j7 == 0) {
                        ld0 ld0Var = (ld0) oq0Var;
                        long j8 = ld0Var.c;
                        if (j8 == -1 && !this.k.isEmpty()) {
                            j8 = ((vj) this.k.peek()).b;
                        }
                        if (j8 != -1) {
                            this.p = (j8 - ld0Var.d) + this.q;
                        }
                    }
                    long j9 = this.p;
                    long j10 = this.q;
                    if (j9 >= j10) {
                        ld0 ld0Var2 = (ld0) oq0Var;
                        long j11 = ld0Var2.d - j10;
                        int i3 = this.o;
                        if ((i3 == 1836019558 || i3 == 1835295092) && !this.F) {
                            this.C.a(new yx2(this.v, j11));
                            this.F = true;
                        }
                        if (this.o == 1836019558) {
                            int size = this.c.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                k83 k83Var = ((sx0) this.c.valueAt(i4)).b;
                                k83Var.getClass();
                                k83Var.c = j11;
                                k83Var.b = j11;
                            }
                        }
                        int i5 = this.o;
                        if (i5 == 1835295092) {
                            this.x = null;
                            this.s = j11 + this.p;
                            this.n = 2;
                        } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227) {
                            long j12 = (ld0Var2.d + this.p) - 8;
                            this.k.push(new vj(i5, j12));
                            if (this.p == this.q) {
                                a(j12);
                            } else {
                                this.n = 0;
                                this.q = 0;
                            }
                        } else if (i5 == 1751411826 || i5 == 1835296868 || i5 == 1836476516 || i5 == 1936286840 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1668576371 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1937011571 || i5 == 1952867444 || i5 == 1952868452 || i5 == 1953196132 || i5 == 1953654136 || i5 == 1953658222 || i5 == 1886614376 || i5 == 1935763834 || i5 == 1935763823 || i5 == 1936027235 || i5 == 1970628964 || i5 == 1935828848 || i5 == 1936158820 || i5 == 1701606260 || i5 == 1835362404 || i5 == 1701671783) {
                            if (this.q == 8) {
                                long j13 = this.p;
                                if (j13 <= 2147483647L) {
                                    kc2 kc2Var = new kc2((int) j13);
                                    System.arraycopy(this.j.a, 0, kc2Var.a, 0, 8);
                                    this.r = kc2Var;
                                    this.n = 1;
                                } else {
                                    throw pc2.b("Leaf atom with length > 2147483647 (unsupported).");
                                }
                            } else {
                                throw pc2.b("Leaf atom defines extended atom size (unsupported).");
                            }
                        } else if (this.p <= 2147483647L) {
                            this.r = null;
                            this.n = 1;
                        } else {
                            throw pc2.b("Skipping atom with length > 2147483647 (unsupported).");
                        }
                    } else {
                        throw pc2.b("Atom size less than header length (unsupported).");
                    }
                } else if (i2 != 1) {
                    long j14 = Long.MAX_VALUE;
                    if (i2 != 2) {
                        sx0 sx0Var = this.x;
                        if (sx0Var != null) {
                            c = 2;
                            i = 8;
                            break loop0;
                        }
                        SparseArray sparseArray = this.c;
                        int size2 = sparseArray.size();
                        long j15 = Long.MAX_VALUE;
                        sx0 sx0Var2 = null;
                        int i6 = 0;
                        while (i6 < size2) {
                            char c3 = c2;
                            sx0 sx0Var3 = (sx0) sparseArray.valueAt(i6);
                            boolean z = sx0Var3.l;
                            if ((z || sx0Var3.f != sx0Var3.d.b) && (!z || sx0Var3.h != sx0Var3.b.d)) {
                                if (!z) {
                                    j6 = sx0Var3.d.c[sx0Var3.f];
                                } else {
                                    j6 = sx0Var3.b.f[sx0Var3.h];
                                }
                                if (j6 < j15) {
                                    sx0Var2 = sx0Var3;
                                    j15 = j6;
                                }
                            }
                            i6++;
                            c2 = c3;
                        }
                        c = c2;
                        i = 8;
                        if (sx0Var2 == null) {
                            ld0 ld0Var3 = (ld0) oq0Var;
                            int i7 = (int) (this.s - ld0Var3.d);
                            if (i7 >= 0) {
                                ld0Var3.a(i7);
                                this.n = 0;
                                this.q = 0;
                            } else {
                                throw new pc2("Offset to end of mdat was negative.", null, true, 1);
                            }
                        } else {
                            if (!sx0Var2.l) {
                                j5 = sx0Var2.d.c[sx0Var2.f];
                            } else {
                                j5 = sx0Var2.b.f[sx0Var2.h];
                            }
                            ld0 ld0Var4 = (ld0) oq0Var;
                            int i8 = (int) (j5 - ld0Var4.d);
                            if (i8 < 0) {
                                ji1.d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                i8 = 0;
                            }
                            ld0Var4.a(i8);
                            this.x = sx0Var2;
                            sx0Var = sx0Var2;
                        }
                    } else {
                        int size3 = this.c.size();
                        sx0 sx0Var4 = null;
                        for (int i9 = 0; i9 < size3; i9++) {
                            k83 k83Var2 = ((sx0) this.c.valueAt(i9)).b;
                            if (k83Var2.o) {
                                long j16 = k83Var2.c;
                                if (j16 < j14) {
                                    sx0Var4 = (sx0) this.c.valueAt(i9);
                                    j14 = j16;
                                }
                            }
                        }
                        if (sx0Var4 == null) {
                            this.n = 3;
                        } else {
                            ld0 ld0Var5 = (ld0) oq0Var;
                            int i10 = (int) (j14 - ld0Var5.d);
                            if (i10 >= 0) {
                                ld0Var5.a(i10);
                                k83 k83Var3 = sx0Var4.b;
                                kc2 kc2Var2 = k83Var3.n;
                                ld0Var5.a(kc2Var2.a, 0, kc2Var2.c, false);
                                k83Var3.n.e(0);
                                k83Var3.o = false;
                            } else {
                                throw new pc2("Offset to encryption data was negative.", null, true, 1);
                            }
                        }
                    }
                } else {
                    int i11 = ((int) this.p) - this.q;
                    kc2 kc2Var3 = this.r;
                    if (kc2Var3 != null) {
                        ld0 ld0Var6 = (ld0) oq0Var;
                        ld0Var6.a(kc2Var3.a, 8, i11, false);
                        int i12 = this.o;
                        wj wjVar = new wj(i12, kc2Var3);
                        long j17 = ld0Var6.d;
                        if (!this.k.isEmpty()) {
                            ((vj) this.k.peek()).c.add(wjVar);
                        } else if (i12 == 1936286840) {
                            kc2Var3.e(8);
                            int b = (kc2Var3.b() >> 24) & 255;
                            kc2Var3.e(kc2Var3.b + 4);
                            long n2 = kc2Var3.n();
                            if (b == 0) {
                                q = kc2Var3.n();
                                q2 = kc2Var3.n();
                            } else {
                                q = kc2Var3.q();
                                q2 = kc2Var3.q();
                            }
                            long j18 = q2 + j17;
                            long j19 = q;
                            long j20 = j18;
                            long a2 = mc3.a(j19, 1000000L, n2);
                            kc2Var3.e(kc2Var3.b + 2);
                            int r = kc2Var3.r();
                            int[] iArr = new int[r];
                            long[] jArr = new long[r];
                            long[] jArr2 = new long[r];
                            long[] jArr3 = new long[r];
                            long j21 = a2;
                            long j22 = j19;
                            int i13 = 0;
                            while (i13 < r) {
                                int b2 = kc2Var3.b();
                                if ((b2 & Integer.MIN_VALUE) == 0) {
                                    long n3 = kc2Var3.n();
                                    iArr[i13] = b2 & Integer.MAX_VALUE;
                                    jArr[i13] = j20;
                                    jArr3[i13] = j21;
                                    long j23 = j22 + n3;
                                    long[] jArr4 = jArr2;
                                    int i14 = i13;
                                    j21 = mc3.a(j23, 1000000L, n2);
                                    jArr4[i14] = j21 - jArr3[i14];
                                    kc2Var3.e(kc2Var3.b + 4);
                                    j22 = j23;
                                    i13 = i14 + 1;
                                    jArr = jArr;
                                    jArr2 = jArr4;
                                    j20 += iArr[i14];
                                } else {
                                    throw new pc2("Unhandled indirect reference", null, true, 1);
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(a2), new hu(iArr, jArr, jArr2, jArr3));
                            this.w = ((Long) create.first).longValue();
                            this.C.a((zx2) create.second);
                            this.F = true;
                        } else if (i12 == 1701671783 && this.D.length != 0) {
                            kc2Var3.e(8);
                            int b3 = (kc2Var3.b() >> 24) & 255;
                            if (b3 == 0) {
                                j = kc2Var3.j();
                                j.getClass();
                                j2 = kc2Var3.j();
                                j2.getClass();
                                long n4 = kc2Var3.n();
                                a = mc3.a(kc2Var3.n(), 1000000L, n4);
                                long j24 = this.w;
                                long j25 = j24 != C.TIME_UNSET ? j24 + a : -9223372036854775807L;
                                long a3 = mc3.a(kc2Var3.n(), 1000L, n4);
                                n = kc2Var3.n();
                                j3 = a3;
                                j4 = j25;
                            } else if (b3 != 1) {
                                lg1.a("Skipping unsupported emsg version: ", b3, "FragmentedMp4Extractor");
                            } else {
                                long n5 = kc2Var3.n();
                                long a4 = mc3.a(kc2Var3.q(), 1000000L, n5);
                                long a5 = mc3.a(kc2Var3.n(), 1000L, n5);
                                n = kc2Var3.n();
                                j = kc2Var3.j();
                                j.getClass();
                                j2 = kc2Var3.j();
                                j2.getClass();
                                a = -9223372036854775807L;
                                j3 = a5;
                                j4 = a4;
                            }
                            String str = j;
                            String str2 = j2;
                            long j26 = n;
                            int i15 = kc2Var3.c - kc2Var3.b;
                            byte[] bArr = new byte[i15];
                            kc2Var3.a(bArr, 0, i15);
                            kc2 kc2Var4 = new kc2(this.i.a(new xm0(str, str2, j3, j26, bArr)));
                            int i16 = kc2Var4.c - kc2Var4.b;
                            for (q83 q83Var : this.D) {
                                kc2Var4.e(0);
                                q83Var.a(i16, kc2Var4);
                            }
                            if (j4 == C.TIME_UNSET) {
                                this.l.addLast(new rx0(i16, a, true));
                                this.t += i16;
                            } else if (!this.l.isEmpty()) {
                                this.l.addLast(new rx0(i16, j4, false));
                                this.t += i16;
                            } else {
                                for (q83 q83Var2 : this.D) {
                                    q83Var2.a(j4, 1, i16, 0, null);
                                }
                            }
                        }
                    } else {
                        ((ld0) oq0Var).a(i11);
                    }
                    a(((ld0) oq0Var).d);
                }
            }
        }
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        return w23.a(oq0Var, true, false);
    }
}
