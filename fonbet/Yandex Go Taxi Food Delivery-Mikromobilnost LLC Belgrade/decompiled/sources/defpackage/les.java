package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.ssl.Alerts;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes10.dex */
public class les implements b5p {
    public static final byte[] M = {-94, 57, 79, 82, Alerts.alert_user_canceled, -101, 79, 20, -94, 68, 108, 66, 124, Alerts.alert_no_renegotiation, -115, -12};
    public static final a N;
    public long A;
    public long B;
    public kes C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public d5p I;
    public g001[] J;
    public g001[] K;
    public boolean L;
    public final o2v0 a;
    public final int b;
    public final uzz0 c;
    public final List d;
    public final SparseArray e;
    public final ef90 f;
    public final ef90 g;
    public final ef90 h;
    public final byte[] i;
    public final ef90 j;
    public final sez0 k;
    public final ogo l;
    public final ef90 m;
    public final ArrayDeque n;
    public final ArrayDeque o;
    public final zp1 p;
    public final g001 q;
    public ImmutableList r;
    public int s;
    public int t;
    public long u;
    public int v;
    public ef90 w;
    public long x;
    public int y;
    public long z;

    static {
        f7s f7sVar = new f7s();
        f7sVar.m = eh20.q("application/x-emsg");
        N = new a(f7sVar);
    }

    public les(o2v0 o2v0Var, int i, sez0 sez0Var, uzz0 uzz0Var, List list, g001 g001Var) {
        this.a = o2v0Var;
        this.b = i;
        this.k = sez0Var;
        this.c = uzz0Var;
        this.d = Collections.unmodifiableList(list);
        this.q = g001Var;
        this.l = new ogo();
        this.m = new ef90(16);
        this.f = new ef90(l150.a);
        this.g = new ef90(6);
        this.h = new ef90();
        byte[] bArr = new byte[16];
        this.i = bArr;
        this.j = new ef90(bArr);
        this.n = new ArrayDeque();
        this.o = new ArrayDeque();
        this.e = new SparseArray();
        this.r = ImmutableList.p();
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = d5p.f2;
        this.J = new g001[0];
        this.K = new g001[0];
        this.p = new zp1(new xen(12, this));
    }

    public static DrmInitData b(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ub30 ub30Var = (ub30) list.get(i);
            if (ub30Var.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = ub30Var.c.a;
                lg e = vaa1.e(bArr);
                UUID uuid = e == null ? null : (UUID) e.b;
                if (uuid == null) {
                    lk91.j("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    public static void c(ef90 ef90Var, int i, wzz0 wzz0Var) {
        ef90Var.K(i + 8);
        int k = ef90Var.k();
        byte[] bArr = aj6.a;
        if ((k & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (k & 2) != 0;
        int C = ef90Var.C();
        if (C == 0) {
            Arrays.fill(wzz0Var.l, 0, wzz0Var.e, false);
            return;
        }
        int i2 = wzz0Var.e;
        ef90 ef90Var2 = wzz0Var.n;
        if (C != i2) {
            StringBuilder t = b64.t(C, "Senc sample count ", " is different from fragment sample count");
            t.append(wzz0Var.e);
            throw ParserException.a(null, t.toString());
        }
        Arrays.fill(wzz0Var.l, 0, C, z);
        ef90Var2.H(ef90Var.a());
        wzz0Var.k = true;
        wzz0Var.o = true;
        ef90Var.i(0, ef90Var2.c, ef90Var2.a);
        ef90Var2.K(0);
        wzz0Var.o = false;
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        SparseArray sparseArray = this.e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((kes) sparseArray.valueAt(i)).f();
        }
        this.o.clear();
        this.y = 0;
        ((PriorityQueue) this.p.x).clear();
        this.z = j2;
        this.n.clear();
        this.s = 0;
        this.v = 0;
    }

    @Override // defpackage.b5p
    public final List d() {
        return this.r;
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        int i;
        String str;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            d5pVar = new kzo(d5pVar, this.a);
        }
        this.I = d5pVar;
        this.s = 0;
        this.v = 0;
        g001[] g001VarArr = new g001[2];
        this.J = g001VarArr;
        g001 g001Var = this.q;
        if (g001Var != null) {
            g001VarArr[0] = g001Var;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((i2 & 4) != 0) {
            g001VarArr[i] = d5pVar.B(100, 5);
            i3 = 101;
            i++;
        }
        g001[] g001VarArr2 = (g001[]) tw21.Y(i, this.J);
        this.J = g001VarArr2;
        for (g001 g001Var2 : g001VarArr2) {
            g001Var2.d(N);
        }
        List list = this.d;
        this.K = new g001[list.size()];
        int i4 = 0;
        while (i4 < this.K.length) {
            g001 B = this.I.B(i3, 3);
            B.d((a) list.get(i4));
            this.K[i4] = B;
            i4++;
            i3++;
        }
        uzz0 uzz0Var = this.c;
        if (uzz0Var != null) {
            g001 B2 = this.I.B(0, uzz0Var.b);
            k001 k001Var = new k001(this.c, new long[0], new int[0], 0, new long[0], new int[0], 0L);
            kjh kjhVar = new kjh(0, 0, 0, 0);
            String str2 = uzz0Var.g.n;
            if (eh20.p(str2)) {
                str = "video/mp4";
            } else if (eh20.l(str2)) {
                str = "audio/mp4";
            } else {
                if (eh20.n(str2)) {
                    if (Objects.equals(str2, "image/heic")) {
                        str = "image/heif";
                    } else if (Objects.equals(str2, "image/avif")) {
                        str = "image/avif";
                    }
                }
                str = "application/mp4";
            }
            this.e.put(0, new kes(B2, k001Var, kjhVar, str));
            this.I.A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:407:0x0791, code lost:
    
        r53.s = 0;
        r53.v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0796, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03b1, code lost:
    
        if ((defpackage.tw21.e0(r40, 1000000, r4, r46) + defpackage.tw21.e0(r5[0], 1000000, r2.c, r46)) >= r2.e) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:258:0x069b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(long j) {
        kjh kjhVar;
        kjh kjhVar2;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i2;
        tb30 tb30Var;
        int i3;
        int i4;
        int size;
        int i5;
        byte[] bArr;
        int i6;
        boolean z;
        int i7;
        ArrayList arrayList4;
        int i8;
        tb30 tb30Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        kjh kjhVar3;
        int i13;
        while (true) {
            ArrayDeque arrayDeque = this.n;
            if (arrayDeque.isEmpty() || ((tb30) arrayDeque.peek()).c != j) {
                break;
            }
            tb30 tb30Var3 = (tb30) arrayDeque.pop();
            int i14 = tb30Var3.b;
            ArrayList arrayList5 = tb30Var3.e;
            ArrayList arrayList6 = tb30Var3.d;
            int i15 = this.b;
            int i16 = 12;
            uzz0 uzz0Var = this.c;
            SparseArray sparseArray = this.e;
            if (i14 == 1836019574) {
                d6z.w("Unexpected moov box.", uzz0Var == null);
                DrmInitData b = b(arrayList6);
                tb30 j2 = tb30Var3.j(1836475768);
                j2.getClass();
                ArrayList arrayList7 = j2.d;
                SparseArray sparseArray2 = new SparseArray();
                int size2 = arrayList7.size();
                int i17 = 0;
                long j3 = -9223372036854775807L;
                while (i17 < size2) {
                    ub30 ub30Var = (ub30) arrayList7.get(i17);
                    int i18 = ub30Var.b;
                    ef90 ef90Var = ub30Var.c;
                    if (i18 == 1953654136) {
                        ef90Var.K(i16);
                        arrayList = arrayList7;
                        Pair create = Pair.create(Integer.valueOf(ef90Var.k()), new kjh(ef90Var.k() - 1, ef90Var.k(), ef90Var.k(), ef90Var.k()));
                        sparseArray2.put(((Integer) create.first).intValue(), (kjh) create.second);
                    } else {
                        arrayList = arrayList7;
                        if (i18 == 1835362404) {
                            ef90Var.K(8);
                            j3 = aj6.c(ef90Var.k()) == 0 ? ef90Var.A() : ef90Var.D();
                        }
                    }
                    i17++;
                    arrayList7 = arrayList;
                    i16 = 12;
                }
                int i19 = 1;
                ArrayList g = aj6.g(tb30Var3, new jts(), j3, b, (i15 & 16) != 0, false, new qir(10, this));
                int size3 = g.size();
                if (sparseArray.size() == 0) {
                    String d = rlb1.d(g);
                    int i20 = 0;
                    while (i20 < size3) {
                        k001 k001Var = (k001) g.get(i20);
                        uzz0 uzz0Var2 = k001Var.a;
                        d5p d5pVar = this.I;
                        int i21 = uzz0Var2.b;
                        int i22 = uzz0Var2.a;
                        g001 B = d5pVar.B(i20, i21);
                        B.getClass();
                        if (sparseArray2.size() == i19) {
                            kjhVar = (kjh) sparseArray2.valueAt(0);
                        } else {
                            kjhVar = (kjh) sparseArray2.get(i22);
                            kjhVar.getClass();
                        }
                        sparseArray.put(i22, new kes(B, k001Var, kjhVar, d));
                        this.A = Math.max(this.A, uzz0Var2.e);
                        i20++;
                        i19 = 1;
                    }
                    this.I.A();
                } else {
                    d6z.x(sparseArray.size() == size3);
                    for (int i23 = 0; i23 < size3; i23++) {
                        k001 k001Var2 = (k001) g.get(i23);
                        uzz0 uzz0Var3 = k001Var2.a;
                        kes kesVar = (kes) sparseArray.get(uzz0Var3.a);
                        int i24 = uzz0Var3.a;
                        if (sparseArray2.size() == 1) {
                            kjhVar2 = (kjh) sparseArray2.valueAt(0);
                        } else {
                            kjhVar2 = (kjh) sparseArray2.get(i24);
                            kjhVar2.getClass();
                        }
                        kesVar.e(k001Var2, kjhVar2);
                    }
                }
            } else {
                int i25 = i15;
                if (i14 == 1836019558) {
                    boolean z2 = uzz0Var != null;
                    int size4 = arrayList5.size();
                    int i26 = 0;
                    while (i26 < size4) {
                        tb30 tb30Var4 = (tb30) arrayList5.get(i26);
                        if (tb30Var4.b == 1953653094) {
                            ub30 k = tb30Var4.k(1952868452);
                            ArrayList arrayList8 = tb30Var4.d;
                            k.getClass();
                            ef90 ef90Var2 = k.c;
                            ef90Var2.K(8);
                            int k2 = ef90Var2.k();
                            byte[] bArr2 = aj6.a;
                            kes kesVar2 = (kes) (z2 ? sparseArray.valueAt(0) : sparseArray.get(ef90Var2.k()));
                            if (kesVar2 == null) {
                                i = size4;
                                tb30Var = tb30Var4;
                                kesVar2 = null;
                            } else {
                                wzz0 wzz0Var = kesVar2.b;
                                tb30Var = tb30Var4;
                                if ((k2 & 1) != 0) {
                                    long D = ef90Var2.D();
                                    wzz0Var.b = D;
                                    wzz0Var.c = D;
                                }
                                kjh kjhVar4 = kesVar2.e;
                                int k3 = (k2 & 2) != 0 ? ef90Var2.k() - 1 : kjhVar4.a;
                                int k4 = (k2 & 8) != 0 ? ef90Var2.k() : kjhVar4.b;
                                if ((k2 & 16) != 0) {
                                    i = size4;
                                    i3 = ef90Var2.k();
                                } else {
                                    i = size4;
                                    i3 = kjhVar4.c;
                                }
                                wzz0Var.a = new kjh(k3, k4, i3, (k2 & 32) != 0 ? ef90Var2.k() : kjhVar4.d);
                            }
                            if (kesVar2 == null) {
                                arrayList2 = arrayList5;
                                arrayList3 = arrayList6;
                                i2 = i25;
                            } else {
                                wzz0 wzz0Var2 = kesVar2.b;
                                long j4 = wzz0Var2.p;
                                boolean z3 = wzz0Var2.q;
                                kesVar2.f();
                                kesVar2.m = true;
                                tb30 tb30Var5 = tb30Var;
                                ub30 k5 = tb30Var5.k(1952867444);
                                if (k5 == null || (i25 & 2) != 0) {
                                    wzz0Var2.p = j4;
                                    wzz0Var2.q = z3;
                                } else {
                                    ef90 ef90Var3 = k5.c;
                                    ef90Var3.K(8);
                                    wzz0Var2.p = aj6.c(ef90Var3.k()) == 1 ? ef90Var3.D() : ef90Var3.A();
                                    wzz0Var2.q = true;
                                }
                                int size5 = arrayList8.size();
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i27 >= size5) {
                                        break;
                                    }
                                    int i30 = i27;
                                    ub30 ub30Var2 = (ub30) arrayList8.get(i27);
                                    ArrayList arrayList9 = arrayList5;
                                    if (ub30Var2.b == 1953658222) {
                                        ef90 ef90Var4 = ub30Var2.c;
                                        ef90Var4.K(12);
                                        int C = ef90Var4.C();
                                        if (C > 0) {
                                            i29 += C;
                                            i28++;
                                        }
                                    }
                                    i27 = i30 + 1;
                                    arrayList5 = arrayList9;
                                }
                                arrayList2 = arrayList5;
                                kesVar2.h = 0;
                                kesVar2.g = 0;
                                kesVar2.f = 0;
                                wzz0Var2.d = i28;
                                wzz0Var2.e = i29;
                                if (wzz0Var2.g.length < i28) {
                                    wzz0Var2.f = new long[i28];
                                    wzz0Var2.g = new int[i28];
                                }
                                if (wzz0Var2.h.length < i29) {
                                    int i31 = (i29 * HProv.PP_DELETE_KEYSET) / 100;
                                    wzz0Var2.h = new int[i31];
                                    wzz0Var2.i = new long[i31];
                                    wzz0Var2.j = new boolean[i31];
                                    wzz0Var2.l = new boolean[i31];
                                }
                                int i32 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i32 < size5) {
                                        ub30 ub30Var3 = (ub30) arrayList8.get(i32);
                                        int i35 = size5;
                                        if (ub30Var3.b == i4) {
                                            int i36 = i33 + 1;
                                            ef90 ef90Var5 = ub30Var3.c;
                                            ef90Var5.K(8);
                                            int k6 = ef90Var5.k();
                                            byte[] bArr3 = aj6.a;
                                            uzz0 uzz0Var4 = kesVar2.d.a;
                                            i7 = i32;
                                            kjh kjhVar5 = wzz0Var2.a;
                                            int i37 = tw21.a;
                                            int i38 = i33;
                                            wzz0Var2.g[i38] = ef90Var5.C();
                                            long[] jArr = wzz0Var2.f;
                                            int i39 = i34;
                                            long j6 = wzz0Var2.b;
                                            jArr[i38] = j6;
                                            if ((k6 & 1) != 0) {
                                                jArr[i38] = j6 + ef90Var5.k();
                                            }
                                            boolean z4 = (k6 & 4) != 0;
                                            int i40 = kjhVar5.d;
                                            if (z4) {
                                                i40 = ef90Var5.k();
                                            }
                                            boolean z5 = z4;
                                            boolean z6 = (k6 & 256) != 0;
                                            boolean z7 = (k6 & 512) != 0;
                                            boolean z8 = (k6 & 1024) != 0;
                                            boolean z9 = (k6 & 2048) != 0;
                                            boolean z10 = z8;
                                            long[] jArr2 = uzz0Var4.i;
                                            int i41 = i40;
                                            long[] jArr3 = uzz0Var4.j;
                                            if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                                long j7 = jArr2[0];
                                                if (j7 != 0) {
                                                    long j8 = uzz0Var4.d;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                }
                                                j5 = jArr3[0];
                                            }
                                            int[] iArr = wzz0Var2.h;
                                            long[] jArr4 = wzz0Var2.i;
                                            boolean[] zArr = wzz0Var2.j;
                                            boolean z11 = uzz0Var4.b == 2 && (i25 & 1) != 0;
                                            i34 = i39 + wzz0Var2.g[i38];
                                            arrayList4 = arrayList6;
                                            i8 = i25;
                                            long j9 = uzz0Var4.c;
                                            long j10 = wzz0Var2.p;
                                            int i42 = i39;
                                            while (i42 < i34) {
                                                if (z6) {
                                                    i9 = i42;
                                                    i10 = ef90Var5.k();
                                                } else {
                                                    i9 = i42;
                                                    i10 = kjhVar5.b;
                                                }
                                                boolean z12 = z11;
                                                if (i10 < 0) {
                                                    throw ParserException.a(null, "Unexpected negative value: " + i10);
                                                }
                                                if (z7) {
                                                    i11 = i34;
                                                    i12 = ef90Var5.k();
                                                } else {
                                                    i11 = i34;
                                                    i12 = kjhVar5.c;
                                                }
                                                if (i12 < 0) {
                                                    throw ParserException.a(null, "Unexpected negative value: " + i12);
                                                }
                                                int k7 = z10 ? ef90Var5.k() : (i9 == 0 && z5) ? i41 : kjhVar5.d;
                                                if (z9) {
                                                    kjhVar3 = kjhVar5;
                                                    i13 = ef90Var5.k();
                                                } else {
                                                    kjhVar3 = kjhVar5;
                                                    i13 = 0;
                                                }
                                                int i43 = k7;
                                                long e0 = tw21.e0((i13 + j10) - j5, 1000000L, j9, RoundingMode.DOWN);
                                                jArr4[i9] = e0;
                                                if (!wzz0Var2.q) {
                                                    jArr4[i9] = e0 + kesVar2.d.h;
                                                }
                                                iArr[i9] = i12;
                                                zArr[i9] = ((i43 >> 16) & 1) == 0 && (!z12 || i9 == 0);
                                                j10 += i10;
                                                i42 = i9 + 1;
                                                i34 = i11;
                                                z11 = z12;
                                                kjhVar5 = kjhVar3;
                                            }
                                            tb30Var2 = tb30Var5;
                                            wzz0Var2.p = j10;
                                            i33 = i36;
                                        } else {
                                            i7 = i32;
                                            arrayList4 = arrayList6;
                                            i8 = i25;
                                            tb30Var2 = tb30Var5;
                                        }
                                        tb30Var5 = tb30Var2;
                                        arrayList6 = arrayList4;
                                        i25 = i8;
                                        i4 = 1953658222;
                                        i32 = i7 + 1;
                                        size5 = i35;
                                    } else {
                                        arrayList3 = arrayList6;
                                        i2 = i25;
                                        tb30 tb30Var6 = tb30Var5;
                                        uzz0 uzz0Var5 = kesVar2.d.a;
                                        kjh kjhVar6 = wzz0Var2.a;
                                        kjhVar6.getClass();
                                        int i44 = kjhVar6.a;
                                        vzz0[] vzz0VarArr = uzz0Var5.l;
                                        vzz0 vzz0Var = vzz0VarArr == null ? null : vzz0VarArr[i44];
                                        ub30 k8 = tb30Var6.k(1935763834);
                                        if (k8 != null) {
                                            vzz0Var.getClass();
                                            ef90 ef90Var6 = k8.c;
                                            int i45 = vzz0Var.d;
                                            ef90Var6.K(8);
                                            int k9 = ef90Var6.k();
                                            byte[] bArr4 = aj6.a;
                                            if ((k9 & 1) == 1) {
                                                ef90Var6.L(8);
                                            }
                                            int y = ef90Var6.y();
                                            int C2 = ef90Var6.C();
                                            if (C2 > wzz0Var2.e) {
                                                StringBuilder t = b64.t(C2, "Saiz sample count ", " is greater than fragment sample count");
                                                t.append(wzz0Var2.e);
                                                throw ParserException.a(null, t.toString());
                                            }
                                            if (y == 0) {
                                                boolean[] zArr2 = wzz0Var2.l;
                                                i6 = 0;
                                                for (int i46 = 0; i46 < C2; i46++) {
                                                    int y2 = ef90Var6.y();
                                                    i6 += y2;
                                                    zArr2[i46] = y2 > i45;
                                                }
                                                z = false;
                                            } else {
                                                i6 = y * C2;
                                                z = false;
                                                Arrays.fill(wzz0Var2.l, 0, C2, y > i45);
                                            }
                                            Arrays.fill(wzz0Var2.l, C2, wzz0Var2.e, z);
                                            if (i6 > 0) {
                                                wzz0Var2.n.H(i6);
                                                wzz0Var2.k = true;
                                                wzz0Var2.o = true;
                                            }
                                        }
                                        ub30 k10 = tb30Var6.k(1935763823);
                                        if (k10 != null) {
                                            ef90 ef90Var7 = k10.c;
                                            ef90Var7.K(8);
                                            int k11 = ef90Var7.k();
                                            byte[] bArr5 = aj6.a;
                                            if ((k11 & 1) == 1) {
                                                ef90Var7.L(8);
                                            }
                                            int C3 = ef90Var7.C();
                                            if (C3 != 1) {
                                                throw ParserException.a(null, "Unexpected saio entry count: " + C3);
                                            }
                                            wzz0Var2.c += aj6.c(k11) == 0 ? ef90Var7.A() : ef90Var7.D();
                                        }
                                        ub30 k12 = tb30Var6.k(1936027235);
                                        if (k12 != null) {
                                            c(k12.c, 0, wzz0Var2);
                                        }
                                        String str = vzz0Var != null ? vzz0Var.b : null;
                                        ef90 ef90Var8 = null;
                                        ef90 ef90Var9 = null;
                                        for (int i47 = 0; i47 < arrayList8.size(); i47++) {
                                            ub30 ub30Var4 = (ub30) arrayList8.get(i47);
                                            ef90 ef90Var10 = ub30Var4.c;
                                            int i48 = ub30Var4.b;
                                            if (i48 == 1935828848) {
                                                ef90Var10.K(12);
                                                if (ef90Var10.k() == 1936025959) {
                                                    ef90Var8 = ef90Var10;
                                                }
                                            } else if (i48 == 1936158820) {
                                                ef90Var10.K(12);
                                                if (ef90Var10.k() == 1936025959) {
                                                    ef90Var9 = ef90Var10;
                                                }
                                            }
                                        }
                                        if (ef90Var8 != null && ef90Var9 != null) {
                                            ef90Var8.K(8);
                                            int c = aj6.c(ef90Var8.k());
                                            ef90Var8.L(4);
                                            if (c == 1) {
                                                ef90Var8.L(4);
                                            }
                                            if (ef90Var8.k() != 1) {
                                                throw ParserException.c("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            ef90Var9.K(8);
                                            int c2 = aj6.c(ef90Var9.k());
                                            ef90Var9.L(4);
                                            if (c2 == 1) {
                                                if (ef90Var9.A() == 0) {
                                                    throw ParserException.c("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (c2 >= 2) {
                                                ef90Var9.L(4);
                                            }
                                            if (ef90Var9.A() != 1) {
                                                throw ParserException.c("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            ef90Var9.L(1);
                                            int y3 = ef90Var9.y();
                                            int i49 = (y3 & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC) >> 4;
                                            int i50 = y3 & 15;
                                            boolean z13 = ef90Var9.y() == 1;
                                            if (z13) {
                                                int y4 = ef90Var9.y();
                                                byte[] bArr6 = new byte[16];
                                                ef90Var9.i(0, 16, bArr6);
                                                if (y4 == 0) {
                                                    int y5 = ef90Var9.y();
                                                    byte[] bArr7 = new byte[y5];
                                                    ef90Var9.i(0, y5, bArr7);
                                                    bArr = bArr7;
                                                } else {
                                                    bArr = null;
                                                }
                                                wzz0Var2.k = true;
                                                wzz0Var2.m = new vzz0(z13, str, y4, bArr6, i49, i50, bArr);
                                                size = arrayList8.size();
                                                for (i5 = 0; i5 < size; i5++) {
                                                    ub30 ub30Var5 = (ub30) arrayList8.get(i5);
                                                    if (ub30Var5.b == 1970628964) {
                                                        ef90 ef90Var11 = ub30Var5.c;
                                                        ef90Var11.K(8);
                                                        byte[] bArr8 = this.i;
                                                        ef90Var11.i(0, 16, bArr8);
                                                        if (Arrays.equals(bArr8, M)) {
                                                            c(ef90Var11, 16, wzz0Var2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        size = arrayList8.size();
                                        while (i5 < size) {
                                        }
                                    }
                                }
                            }
                        } else {
                            i = size4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            i2 = i25;
                        }
                        i26++;
                        arrayList5 = arrayList2;
                        size4 = i;
                        arrayList6 = arrayList3;
                        i25 = i2;
                    }
                    DrmInitData b2 = b(arrayList6);
                    if (b2 != null) {
                        int size6 = sparseArray.size();
                        for (int i51 = 0; i51 < size6; i51++) {
                            kes kesVar3 = (kes) sparseArray.valueAt(i51);
                            uzz0 uzz0Var6 = kesVar3.d.a;
                            kjh kjhVar7 = kesVar3.b.a;
                            int i52 = tw21.a;
                            int i53 = kjhVar7.a;
                            vzz0[] vzz0VarArr2 = uzz0Var6.l;
                            vzz0 vzz0Var2 = vzz0VarArr2 == null ? null : vzz0VarArr2[i53];
                            DrmInitData copyWithSchemeType = b2.copyWithSchemeType(vzz0Var2 != null ? vzz0Var2.b : null);
                            f7s a = kesVar3.d.a.g.a();
                            a.l = eh20.q(kesVar3.j);
                            a.q = copyWithSchemeType;
                            kesVar3.a.d(new a(a));
                        }
                    }
                    if (this.z != -9223372036854775807L) {
                        int size7 = sparseArray.size();
                        for (int i54 = 0; i54 < size7; i54++) {
                            kes kesVar4 = (kes) sparseArray.valueAt(i54);
                            long j11 = this.z;
                            int i55 = kesVar4.f;
                            while (true) {
                                wzz0 wzz0Var3 = kesVar4.b;
                                if (i55 < wzz0Var3.e && wzz0Var3.i[i55] <= j11) {
                                    if (wzz0Var3.j[i55]) {
                                        kesVar4.i = i55;
                                    }
                                    i55++;
                                }
                            }
                        }
                        this.z = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((tb30) arrayDeque.peek()).e.add(tb30Var3);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x00c0, code lost:
    
        r4 = r2.b;
        r9 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00ca, code lost:
    
        if (r33.s != 3) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x00ce, code lost:
    
        if (r2.m != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00d0, code lost:
    
        r5 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00df, code lost:
    
        r33.D = r5;
        r5 = r2.d.a.g;
        r11 = java.util.Objects.equals(r5.n, "video/avc");
        r12 = r33.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x00ef, code lost:
    
        if (r11 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x00f3, code lost:
    
        if ((r12 & 64) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x00f5, code lost:
    
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0107, code lost:
    
        r33.G = !r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x010f, code lost:
    
        if (r2.f >= r2.i) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0111, code lost:
    
        r34.O(r33.D);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x011a, code lost:
    
        if (r1 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x011d, code lost:
    
        r3 = r4.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0121, code lost:
    
        if (r1 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0123, code lost:
    
        r3.L(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0126, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x012a, code lost:
    
        if (r4.k == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0130, code lost:
    
        if (r4.l[r1] == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0132, code lost:
    
        r3.L(r3.E() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x013e, code lost:
    
        if (r2.c() != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0140, code lost:
    
        r33.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0142, code lost:
    
        r33.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0145, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x014e, code lost:
    
        if (r2.d.a.h != r22) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0150, code lost:
    
        r33.D -= 8;
        r34.O(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x015b, code lost:
    
        r5 = "audio/ac4".equals(r2.d.a.g.n);
        r11 = r33.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x016b, code lost:
    
        if (r5 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x016d, code lost:
    
        r33.E = r2.d(r11, 7);
        r11 = r33.D;
        r12 = r33.j;
        defpackage.eg3.h(r11, r12);
        r2.a.a(r12, 7, 0);
        r33.E += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x018c, code lost:
    
        r33.D += r33.E;
        r33.s = 4;
        r33.F = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0186, code lost:
    
        r33.E = r2.d(r11, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x00f8, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0100, code lost:
    
        if (java.util.Objects.equals(r5.n, "video/hevc") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0104, code lost:
    
        if ((r12 & 128) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x00d9, code lost:
    
        r5 = r4.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0198, code lost:
    
        r5 = r2.d;
        r11 = r5.a;
        r12 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x01a0, code lost:
    
        if (r2.m != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x01a2, code lost:
    
        r4 = r5.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x01af, code lost:
    
        if (r3 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x01b1, code lost:
    
        r4 = r3.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x01b5, code lost:
    
        r15 = r11.k;
        r11 = r11.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x01b9, code lost:
    
        if (r15 == 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x01bb, code lost:
    
        r10 = r33.g;
        r6 = r10.a;
        r6[0] = 0;
        r6[1] = 0;
        r6[r18] = 0;
        r13 = 4 - r15;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x01cb, code lost:
    
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x01d1, code lost:
    
        if (r33.E >= r33.D) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x01d3, code lost:
    
        r2 = r33.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01d5, code lost:
    
        if (r2 != 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x01da, code lost:
    
        if (r33.K.length > 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x01de, code lost:
    
        if (r33.G != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01f5, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x01f6, code lost:
    
        r34.readFully(r6, r13, r21 + r2);
        r10.K(0);
        r18 = r10.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0203, code lost:
    
        if (r18 < 0) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0205, code lost:
    
        r33.F = r18 - r2;
        r15 = r33.f;
        r18 = r13;
        r15.K(0);
        r32 = r14;
        r12.a(r15, 4, 0);
        r33.E += 4;
        r33.D += r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0225, code lost:
    
        if (r33.K.length <= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0227, code lost:
    
        if (r2 <= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0229, code lost:
    
        r13 = r6[4];
        r14 = r11.n;
        r15 = r11.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0233, code lost:
    
        if (java.util.Objects.equals(r14, r9) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0239, code lost:
    
        if (defpackage.eh20.c(r15, r9) == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x023c, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x024d, code lost:
    
        if (java.util.Objects.equals(r11.n, "video/hevc") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0253, code lost:
    
        if (defpackage.eh20.c(r15, "video/hevc") == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0264, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0265, code lost:
    
        r33.H = r13;
        r12.a(r10, r2, 0);
        r33.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0270, code lost:
    
        if (r2 <= 0) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0274, code lost:
    
        if (r33.G != false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x027a, code lost:
    
        if (defpackage.l150.c(r6, r2, r11) == false) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x027c, code lost:
    
        r33.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x027f, code lost:
    
        r13 = r18;
        r15 = r21;
        r9 = r23;
        r14 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x025d, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x025f, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0240, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0245, code lost:
    
        if ((r13 & 31) == 6) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0261, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0290, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01e0, code lost:
    
        r2 = defpackage.l150.d(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x01f0, code lost:
    
        if ((r21 + r2) > (r33.D - r33.E)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01f2, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0291, code lost:
    
        r23 = r9;
        r18 = r13;
        r32 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x029a, code lost:
    
        if (r33.H == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x029c, code lost:
    
        r13 = r33.h;
        r13.H(r2);
        r34.readFully(r13.a, 0, r33.F);
        r12.a(r13, r33.F, 0);
        r2 = r33.F;
        r9 = defpackage.l150.l(r13.c, r13.a);
        r13.K(0);
        r13.J(r9);
        r9 = r11.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x02c1, code lost:
    
        if (r9 != (-1)) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x02c5, code lost:
    
        if (r7.a == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x02c7, code lost:
    
        r7.a = 0;
        r7.g(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x02de, code lost:
    
        r7.b(r4, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x02ea, code lost:
    
        if ((r17.a() & 4) == 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x02ec, code lost:
    
        r7.g(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x02f5, code lost:
    
        r33.E += r2;
        r33.F -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x02cf, code lost:
    
        if (r7.a == r9) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x02d1, code lost:
    
        if (r9 < 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x02d3, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x02d6, code lost:
    
        defpackage.d6z.x(r14);
        r7.a = r9;
        r7.g(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x02d5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x02f0, code lost:
    
        r2 = r12.b(r34, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0301, code lost:
    
        r32 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x031a, code lost:
    
        r1 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0320, code lost:
    
        if (r33.G != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0322, code lost:
    
        r1 = r1 | ru.CryptoPro.JCP.tools.SelfTester_JCP.DECRYPT_CBC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0325, code lost:
    
        r26 = r1;
        r1 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x032b, code lost:
    
        if (r1 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x032d, code lost:
    
        r29 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0334, code lost:
    
        r24 = r4;
        r12.c(r24, r26, r33.D, 0, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0345, code lost:
    
        if (r32.isEmpty() != false) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0347, code lost:
    
        r1 = (defpackage.jes) r32.removeFirst();
        r33.y -= r1.c;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0358, code lost:
    
        if (r1.b == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x035a, code lost:
    
        r4 = r4 + r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x035c, code lost:
    
        if (r3 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x035e, code lost:
    
        r4 = r3.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0362, code lost:
    
        r7 = r4;
        r2 = r33.J;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0367, code lost:
    
        if (r5 >= r4) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0369, code lost:
    
        r2[r5].c(r7, 1, r1.c, r33.y, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x037b, code lost:
    
        if (r17.c() != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x037d, code lost:
    
        r33.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0380, code lost:
    
        r33.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0385, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0332, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0304, code lost:
    
        r17 = r2;
        r32 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0308, code lost:
    
        r2 = r33.E;
        r6 = r33.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x030c, code lost:
    
        if (r2 >= r6) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x030e, code lost:
    
        r33.E += r12.b(r34, r6 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x01a9, code lost:
    
        r4 = r4.i[r2.f];
     */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(c5p c5pVar, xde0 xde0Var) {
        char c;
        boolean z;
        int i;
        String t;
        String t2;
        long e0;
        long e02;
        long A;
        long j;
        long D;
        long D2;
        while (true) {
            int i2 = this.s;
            ArrayDeque arrayDeque = this.n;
            zp1 zp1Var = this.p;
            SparseArray sparseArray = this.e;
            boolean z2 = true;
            if (i2 != 0) {
                ArrayDeque arrayDeque2 = this.o;
                sez0 sez0Var = this.k;
                if (i2 == 1) {
                    int i3 = (int) (this.u - this.v);
                    ef90 ef90Var = this.w;
                    if (ef90Var != null) {
                        c5pVar.readFully(ef90Var.a, 8, i3);
                        int i4 = this.t;
                        ub30 ub30Var = new ub30(i4, ef90Var);
                        long position = c5pVar.getPosition();
                        if (!arrayDeque.isEmpty()) {
                            ((tb30) arrayDeque.peek()).d.add(ub30Var);
                        } else if (i4 == 1936286840) {
                            ef90Var.K(8);
                            int c2 = aj6.c(ef90Var.k());
                            ef90Var.L(4);
                            long A2 = ef90Var.A();
                            if (c2 == 0) {
                                D = ef90Var.A();
                                D2 = ef90Var.A();
                            } else {
                                D = ef90Var.D();
                                D2 = ef90Var.D();
                            }
                            long j2 = D2 + position;
                            long j3 = D;
                            int i5 = tw21.a;
                            long e03 = tw21.e0(j3, 1000000L, A2, RoundingMode.DOWN);
                            ef90Var.L(2);
                            int E = ef90Var.E();
                            int[] iArr = new int[E];
                            long[] jArr = new long[E];
                            long[] jArr2 = new long[E];
                            long[] jArr3 = new long[E];
                            long j4 = e03;
                            int i6 = 0;
                            while (i6 < E) {
                                int k = ef90Var.k();
                                if ((k & Integer.MIN_VALUE) != 0) {
                                    throw ParserException.a(null, "Unhandled indirect reference");
                                }
                                long A3 = ef90Var.A();
                                iArr[i6] = k & Integer.MAX_VALUE;
                                jArr[i6] = j2;
                                jArr3[i6] = j4;
                                j3 += A3;
                                j4 = tw21.e0(j3, 1000000L, A2, RoundingMode.DOWN);
                                jArr2[i6] = j4 - jArr3[i6];
                                ef90Var.L(4);
                                j2 += iArr[i6];
                                i6++;
                                e03 = e03;
                            }
                            Pair create = Pair.create(Long.valueOf(e03), new qsb(iArr, jArr, jArr2, jArr3));
                            this.B = ((Long) create.first).longValue();
                            this.I.w((f7q0) create.second);
                            this.L = true;
                        } else if (i4 == 1701671783 && this.J.length != 0) {
                            ef90Var.K(8);
                            int c3 = aj6.c(ef90Var.k());
                            if (c3 == 0) {
                                t = ef90Var.t();
                                t.getClass();
                                t2 = ef90Var.t();
                                t2.getClass();
                                long A4 = ef90Var.A();
                                long A5 = ef90Var.A();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                e0 = tw21.e0(A5, 1000000L, A4, roundingMode);
                                long j5 = this.B;
                                long j6 = j5 != -9223372036854775807L ? j5 + e0 : -9223372036854775807L;
                                e02 = tw21.e0(ef90Var.A(), 1000L, A4, roundingMode);
                                A = ef90Var.A();
                                j = j6;
                            } else if (c3 != 1) {
                                xvz.v(c3, "Skipping unsupported emsg version: ");
                            } else {
                                long A6 = ef90Var.A();
                                long D3 = ef90Var.D();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                j = tw21.e0(D3, 1000000L, A6, roundingMode2);
                                long e04 = tw21.e0(ef90Var.A(), 1000L, A6, roundingMode2);
                                long A7 = ef90Var.A();
                                t = ef90Var.t();
                                t.getClass();
                                t2 = ef90Var.t();
                                t2.getClass();
                                e02 = e04;
                                A = A7;
                                e0 = -9223372036854775807L;
                            }
                            String str = t;
                            String str2 = t2;
                            byte[] bArr = new byte[ef90Var.a()];
                            ef90Var.i(0, ef90Var.a(), bArr);
                            ef90 ef90Var2 = new ef90(this.l.a(new mgo(str, str2, e02, A, bArr)));
                            int a = ef90Var2.a();
                            for (g001 g001Var : this.J) {
                                ef90Var2.K(0);
                                g001Var.a(ef90Var2, a, 0);
                            }
                            if (j == -9223372036854775807L) {
                                arrayDeque2.addLast(new jes(true, a, e0));
                                this.y += a;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new jes(false, a, j));
                                this.y += a;
                            } else if (sez0Var == null || sez0Var.e()) {
                                if (sez0Var != null) {
                                    j = sez0Var.a(j);
                                }
                                long j7 = j;
                                for (g001 g001Var2 : this.J) {
                                    g001Var2.c(j7, 1, a, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new jes(false, a, j));
                                this.y += a;
                            }
                        }
                    } else {
                        c5pVar.O(i3);
                    }
                    f(c5pVar.getPosition());
                } else if (i2 != 2) {
                    kes kesVar = this.C;
                    if (kesVar != null) {
                        c = 2;
                        z = true;
                        i = 8;
                        break;
                    }
                    int size = sparseArray.size();
                    kes kesVar2 = null;
                    c = 2;
                    int i7 = 0;
                    long j8 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                    while (i7 < size) {
                        kes kesVar3 = (kes) sparseArray.valueAt(i7);
                        boolean z3 = kesVar3.m;
                        wzz0 wzz0Var = kesVar3.b;
                        boolean z4 = z2;
                        if ((z3 || kesVar3.f != kesVar3.d.b) && (!z3 || kesVar3.h != wzz0Var.d)) {
                            long j9 = !z3 ? kesVar3.d.c[kesVar3.f] : wzz0Var.f[kesVar3.h];
                            if (j9 < j8) {
                                kesVar2 = kesVar3;
                                j8 = j9;
                            }
                        }
                        i7++;
                        z2 = z4;
                    }
                    z = z2;
                    i = 8;
                    if (kesVar2 == null) {
                        int position2 = (int) (this.x - c5pVar.getPosition());
                        if (position2 < 0) {
                            throw ParserException.a(null, "Offset to end of mdat was negative.");
                        }
                        c5pVar.O(position2);
                        this.s = 0;
                        this.v = 0;
                    } else {
                        int position3 = (int) ((!kesVar2.m ? kesVar2.d.c[kesVar2.f] : kesVar2.b.f[kesVar2.h]) - c5pVar.getPosition());
                        if (position3 < 0) {
                            lk91.j("Ignoring negative offset to sample data.");
                            position3 = 0;
                        }
                        c5pVar.O(position3);
                        this.C = kesVar2;
                        kesVar = kesVar2;
                    }
                } else {
                    int size2 = sparseArray.size();
                    kes kesVar4 = null;
                    long j10 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                    for (int i8 = 0; i8 < size2; i8++) {
                        wzz0 wzz0Var2 = ((kes) sparseArray.valueAt(i8)).b;
                        if (wzz0Var2.o) {
                            long j11 = wzz0Var2.c;
                            if (j11 < j10) {
                                kesVar4 = (kes) sparseArray.valueAt(i8);
                                j10 = j11;
                            }
                        }
                    }
                    if (kesVar4 == null) {
                        this.s = 3;
                    } else {
                        int position4 = (int) (j10 - c5pVar.getPosition());
                        if (position4 < 0) {
                            throw ParserException.a(null, "Offset to encryption data was negative.");
                        }
                        c5pVar.O(position4);
                        wzz0 wzz0Var3 = kesVar4.b;
                        ef90 ef90Var3 = wzz0Var3.n;
                        c5pVar.readFully(ef90Var3.a, 0, ef90Var3.c);
                        ef90Var3.K(0);
                        wzz0Var3.o = false;
                    }
                }
            } else {
                int i9 = this.v;
                ef90 ef90Var4 = this.m;
                if (i9 == 0) {
                    if (!c5pVar.y(ef90Var4.a, 0, 8, true)) {
                        zp1Var.g(0);
                        return -1;
                    }
                    this.v = 8;
                    ef90Var4.K(0);
                    this.u = ef90Var4.A();
                    this.t = ef90Var4.k();
                }
                long j12 = this.u;
                if (j12 == 1) {
                    c5pVar.readFully(ef90Var4.a, 8, 8);
                    this.v += 8;
                    this.u = ef90Var4.D();
                } else if (j12 == 0) {
                    long length = c5pVar.getLength();
                    if (length == -1 && !arrayDeque.isEmpty()) {
                        length = ((tb30) arrayDeque.peek()).c;
                    }
                    if (length != -1) {
                        this.u = (length - c5pVar.getPosition()) + this.v;
                    }
                }
                if (this.u < this.v) {
                    throw ParserException.c("Atom size less than header length (unsupported).");
                }
                long position5 = c5pVar.getPosition() - this.v;
                int i10 = this.t;
                if ((i10 == 1836019558 || i10 == 1835295092) && !this.L) {
                    this.I.w(new qb4(this.A, position5));
                    this.L = true;
                }
                if (this.t == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        wzz0 wzz0Var4 = ((kes) sparseArray.valueAt(i11)).b;
                        wzz0Var4.getClass();
                        wzz0Var4.c = position5;
                        wzz0Var4.b = position5;
                    }
                }
                int i12 = this.t;
                if (i12 == 1835295092) {
                    this.C = null;
                    this.x = position5 + this.u;
                    this.s = 2;
                } else if (i12 == 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1836019558 || i12 == 1953653094 || i12 == 1836475768 || i12 == 1701082227) {
                    long position6 = (c5pVar.getPosition() + this.u) - 8;
                    arrayDeque.push(new tb30(this.t, position6));
                    if (this.u == this.v) {
                        f(position6);
                    } else {
                        this.s = 0;
                        this.v = 0;
                    }
                } else if (i12 == 1751411826 || i12 == 1835296868 || i12 == 1836476516 || i12 == 1936286840 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1668576371 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1937011571 || i12 == 1952867444 || i12 == 1952868452 || i12 == 1953196132 || i12 == 1953654136 || i12 == 1953658222 || i12 == 1886614376 || i12 == 1935763834 || i12 == 1935763823 || i12 == 1936027235 || i12 == 1970628964 || i12 == 1935828848 || i12 == 1936158820 || i12 == 1701606260 || i12 == 1835362404 || i12 == 1701671783) {
                    if (this.v != 8) {
                        throw ParserException.c("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.u > 2147483647L) {
                        throw ParserException.c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    ef90 ef90Var5 = new ef90((int) this.u);
                    System.arraycopy(ef90Var4.a, 0, ef90Var5.a, 0, 8);
                    this.w = ef90Var5;
                    this.s = 1;
                } else {
                    if (this.u > 2147483647L) {
                        throw ParserException.c("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.w = null;
                    this.s = 1;
                }
            }
        }
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        r3t0 g = k0a1.g(c5pVar, true, false);
        this.r = g != null ? ImmutableList.r(g) : ImmutableList.p();
        return g == null;
    }

    @Override // defpackage.b5p
    public final void release() {
    }

    public les(int i, o2v0 o2v0Var) {
        this(o2v0Var, i, null, null, ImmutableList.p(), null);
    }

    @Deprecated
    public les() {
        this(o2v0.d4, 32, null, null, ImmutableList.p(), null);
    }
}
