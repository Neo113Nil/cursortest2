package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.ssl.Alerts;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;
import yads.aa2;
import yads.jk0;
import yads.kk0;
import yads.nm0;

/* loaded from: classes7.dex */
public final class dw81 implements n771 {
    public static final byte[] G = {-94, 57, 79, 82, Alerts.alert_user_canceled, -101, 79, 20, -94, 68, 108, 66, 124, Alerts.alert_no_renegotiation, -115, -12};
    public static final qd81 H;
    public int A;
    public boolean B;
    public yg71 C;
    public fb81[] D;
    public fb81[] E;
    public boolean F;
    public final int a;
    public final List b;
    public final SparseArray c;
    public final dl81 d;
    public final dl81 e;
    public final dl81 f;
    public final byte[] g;
    public final dl81 h;
    public final w281 i;
    public final dl81 j;
    public final ArrayDeque k;
    public final ArrayDeque l;
    public final fb81 m;
    public int n;
    public int o;
    public long p;
    public int q;
    public dl81 r;
    public long s;
    public int t;
    public long u;
    public long v;
    public long w;
    public nt81 x;
    public int y;
    public int z;

    static {
        da81 da81Var = new da81();
        da81Var.k = "application/x-emsg";
        H = new qd81(da81Var);
    }

    public dw81(int i, List list, ds81 ds81Var) {
        this.a = i;
        this.b = Collections.unmodifiableList(list);
        this.m = ds81Var;
        this.i = new w281();
        this.j = new dl81(16);
        this.d = new dl81(sba1.a);
        this.e = new dl81(5);
        this.f = new dl81();
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new dl81(bArr);
        this.k = new ArrayDeque();
        this.l = new ArrayDeque();
        this.c = new SparseArray();
        this.v = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.C = yg71.x5;
        this.D = new fb81[0];
        this.E = new fb81[0];
    }

    public static kk0 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            hp81 hp81Var = (hp81) arrayList.get(i);
            if (hp81Var.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = hp81Var.c.a;
                nr41 c = sba1.c(bArr);
                UUID uuid = c == null ? null : (UUID) c.b;
                if (uuid == null) {
                    nba1.e();
                } else {
                    arrayList2.add(new jk0(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new kk0(null, false, (jk0[]) arrayList2.toArray(new jk0[0]));
    }

    public static void g(dl81 dl81Var, int i, or71 or71Var) {
        dl81Var.m(i + 8);
        int a = dl81Var.a();
        if ((a & 1) != 0) {
            throw aa2.a("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (a & 2) != 0;
        int v = dl81Var.v();
        if (v == 0) {
            Arrays.fill(or71Var.l, 0, or71Var.e, false);
            return;
        }
        int i2 = or71Var.e;
        dl81 dl81Var2 = or71Var.n;
        if (v != i2) {
            StringBuilder t = b64.t(v, "Senc sample count ", " is different from fragment sample count");
            t.append(or71Var.e);
            throw new aa2(t.toString(), null, true, 1);
        }
        Arrays.fill(or71Var.l, 0, v, z);
        dl81Var2.i(dl81Var.c - dl81Var.b);
        or71Var.k = true;
        or71Var.o = true;
        dl81Var.d(0, dl81Var2.c, dl81Var2.a);
        dl81Var2.m(0);
        or71Var.o = false;
    }

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        int i;
        this.C = yg71Var;
        int i2 = 0;
        this.n = 0;
        this.q = 0;
        fb81[] fb81VarArr = new fb81[2];
        this.D = fb81VarArr;
        fb81 fb81Var = this.m;
        if (fb81Var != null) {
            fb81VarArr[0] = fb81Var;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.a & 4) != 0) {
            fb81VarArr[i] = yg71Var.l(100, 5);
            i3 = 101;
            i++;
        }
        fb81[] fb81VarArr2 = (fb81[]) rf71.q(i, this.D);
        this.D = fb81VarArr2;
        for (fb81 fb81Var2 : fb81VarArr2) {
            fb81Var2.k(H);
        }
        List list = this.b;
        this.E = new fb81[list.size()];
        while (i2 < this.E.length) {
            fb81 l = this.C.l(i3, 3);
            l.k((qd81) list.get(i2));
            this.E[i2] = l;
            i2++;
            i3++;
        }
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        SparseArray sparseArray = this.c;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((nt81) sparseArray.valueAt(i)).c();
        }
        this.l.clear();
        this.t = 0;
        this.u = j2;
        this.k.clear();
        this.n = 0;
        this.q = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:393:0x0738, code lost:
    
        r51.n = 0;
        r51.q = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x073d, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x062b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0538  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j) {
        w181 w181Var;
        w181 w181Var2;
        ArrayList arrayList;
        int i;
        int i2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i3;
        int i4;
        int i5;
        int i6;
        hp81 k;
        hp81 k2;
        dl81 dl81Var;
        int i7;
        int size;
        int i8;
        int a;
        int i9;
        boolean z;
        int i10;
        int i11;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i12;
        int i13;
        int i14;
        w181 w181Var3;
        int i15;
        while (true) {
            ArrayDeque arrayDeque = this.k;
            if (arrayDeque.isEmpty() || ((wl81) arrayDeque.peek()).c != j) {
                break;
            }
            wl81 wl81Var = (wl81) arrayDeque.pop();
            int i16 = wl81Var.b;
            ArrayList arrayList6 = wl81Var.e;
            ArrayList arrayList7 = wl81Var.d;
            int i17 = this.a;
            int i18 = 12;
            SparseArray sparseArray = this.c;
            if (i16 == 1836019574) {
                kk0 a2 = a(arrayList7);
                wl81 j2 = wl81Var.j(1836475768);
                j2.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList8 = j2.d;
                int size2 = arrayList8.size();
                int i19 = 0;
                long j3 = -9223372036854775807L;
                while (i19 < size2) {
                    hp81 hp81Var = (hp81) arrayList8.get(i19);
                    int i20 = hp81Var.b;
                    dl81 dl81Var2 = hp81Var.c;
                    if (i20 == 1953654136) {
                        dl81Var2.m(i18);
                        arrayList = arrayList8;
                        Pair create = Pair.create(Integer.valueOf(dl81Var2.a()), new w181(dl81Var2.a() - 1, dl81Var2.a(), dl81Var2.a(), dl81Var2.a()));
                        sparseArray2.put(((Integer) create.first).intValue(), (w181) create.second);
                    } else {
                        arrayList = arrayList8;
                        if (i20 == 1835362404) {
                            dl81Var2.m(8);
                            j3 = ((dl81Var2.a() >> 24) & 255) == 0 ? dl81Var2.t() : dl81Var2.w();
                        }
                    }
                    i19++;
                    arrayList8 = arrayList;
                    i18 = 12;
                }
                int i21 = 1;
                ArrayList e = i471.e(wl81Var, new co71(), j3, a2, (i17 & 16) != 0, false, new su71(this));
                int size3 = e.size();
                if (sparseArray.size() == 0) {
                    int i22 = 0;
                    while (i22 < size3) {
                        je81 je81Var = (je81) e.get(i22);
                        wl71 wl71Var = je81Var.a;
                        yg71 yg71Var = this.C;
                        int i23 = wl71Var.b;
                        int i24 = wl71Var.a;
                        fb81 l = yg71Var.l(i22, i23);
                        if (sparseArray2.size() == i21) {
                            w181Var = (w181) sparseArray2.valueAt(0);
                        } else {
                            w181Var = (w181) sparseArray2.get(i24);
                            w181Var.getClass();
                        }
                        sparseArray.put(i24, new nt81(l, je81Var, w181Var));
                        this.v = Math.max(this.v, wl71Var.e);
                        i22++;
                        i21 = 1;
                    }
                    this.C.mo495a();
                } else {
                    if (sparseArray.size() != size3) {
                        ny61.k();
                        return;
                    }
                    for (int i25 = 0; i25 < size3; i25++) {
                        je81 je81Var2 = (je81) e.get(i25);
                        int i26 = je81Var2.a.a;
                        nt81 nt81Var = (nt81) sparseArray.get(i26);
                        if (sparseArray2.size() == 1) {
                            w181Var2 = (w181) sparseArray2.valueAt(0);
                        } else {
                            w181Var2 = (w181) sparseArray2.get(i26);
                            w181Var2.getClass();
                        }
                        nt81Var.d = je81Var2;
                        nt81Var.e = w181Var2;
                        nt81Var.a.k(je81Var2.a.f);
                        nt81Var.c();
                    }
                }
            } else {
                int i27 = i17;
                if (i16 == 1836019558) {
                    int size4 = arrayList6.size();
                    int i28 = 0;
                    while (i28 < size4) {
                        wl81 wl81Var2 = (wl81) arrayList6.get(i28);
                        int i29 = wl81Var2.b;
                        ArrayList arrayList9 = wl81Var2.d;
                        if (i29 == 1953653094) {
                            hp81 k3 = wl81Var2.k(1952868452);
                            k3.getClass();
                            dl81 dl81Var3 = k3.c;
                            dl81Var3.m(8);
                            int a3 = dl81Var3.a();
                            nt81 nt81Var2 = (nt81) sparseArray.get(dl81Var3.a());
                            if (nt81Var2 == null) {
                                i = size4;
                                nt81Var2 = null;
                            } else {
                                or71 or71Var = nt81Var2.b;
                                if ((a3 & 1) != 0) {
                                    long w = dl81Var3.w();
                                    or71Var.b = w;
                                    or71Var.c = w;
                                }
                                w181 w181Var4 = nt81Var2.e;
                                int a4 = (a3 & 2) != 0 ? dl81Var3.a() - 1 : w181Var4.a;
                                int a5 = (a3 & 8) != 0 ? dl81Var3.a() : w181Var4.b;
                                if ((a3 & 16) != 0) {
                                    i = size4;
                                    i4 = dl81Var3.a();
                                } else {
                                    i = size4;
                                    i4 = w181Var4.c;
                                }
                                or71Var.a = new w181(a4, a5, i4, (a3 & 32) != 0 ? dl81Var3.a() : w181Var4.d);
                            }
                            if (nt81Var2 == null) {
                                i2 = i28;
                                arrayList2 = arrayList6;
                                arrayList3 = arrayList7;
                                i3 = i27;
                            } else {
                                or71 or71Var2 = nt81Var2.b;
                                long j4 = or71Var2.p;
                                boolean z2 = or71Var2.q;
                                nt81Var2.c();
                                nt81Var2.l = true;
                                hp81 k4 = wl81Var2.k(1952867444);
                                if (k4 == null || (i27 & 2) != 0) {
                                    or71Var2.p = j4;
                                    or71Var2.q = z2;
                                } else {
                                    dl81 dl81Var4 = k4.c;
                                    dl81Var4.m(8);
                                    or71Var2.p = ((dl81Var4.a() >> 24) & 255) == 1 ? dl81Var4.w() : dl81Var4.t();
                                    or71Var2.q = true;
                                }
                                int size5 = arrayList9.size();
                                int i30 = 0;
                                int i31 = 0;
                                int i32 = 0;
                                while (true) {
                                    i5 = 1953658222;
                                    if (i30 >= size5) {
                                        break;
                                    }
                                    hp81 hp81Var2 = (hp81) arrayList9.get(i30);
                                    int i33 = i28;
                                    if (hp81Var2.b == 1953658222) {
                                        dl81 dl81Var5 = hp81Var2.c;
                                        dl81Var5.m(12);
                                        int v = dl81Var5.v();
                                        if (v > 0) {
                                            i31 += v;
                                            i32++;
                                        }
                                    }
                                    i30++;
                                    i28 = i33;
                                }
                                i2 = i28;
                                nt81Var2.h = 0;
                                nt81Var2.g = 0;
                                nt81Var2.f = 0;
                                or71Var2.d = i32;
                                or71Var2.e = i31;
                                if (or71Var2.g.length < i32) {
                                    or71Var2.f = new long[i32];
                                    or71Var2.g = new int[i32];
                                }
                                if (or71Var2.h.length < i31) {
                                    int i34 = (i31 * HProv.PP_DELETE_KEYSET) / 100;
                                    or71Var2.h = new int[i34];
                                    or71Var2.i = new long[i34];
                                    or71Var2.j = new boolean[i34];
                                    or71Var2.l = new boolean[i34];
                                }
                                int i35 = 0;
                                int i36 = 0;
                                int i37 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i35 < size5) {
                                        hp81 hp81Var3 = (hp81) arrayList9.get(i35);
                                        if (hp81Var3.b == i5) {
                                            int i38 = i36 + 1;
                                            dl81 dl81Var6 = hp81Var3.c;
                                            dl81Var6.m(8);
                                            int a6 = dl81Var6.a();
                                            i10 = i35;
                                            wl71 wl71Var2 = nt81Var2.d.a;
                                            i11 = size5;
                                            w181 w181Var5 = or71Var2.a;
                                            int i39 = rf71.a;
                                            arrayList4 = arrayList6;
                                            or71Var2.g[i36] = dl81Var6.v();
                                            long[] jArr = or71Var2.f;
                                            arrayList5 = arrayList7;
                                            long j6 = or71Var2.b;
                                            jArr[i36] = j6;
                                            if ((a6 & 1) != 0) {
                                                jArr[i36] = j6 + dl81Var6.a();
                                            }
                                            boolean z3 = (a6 & 4) != 0;
                                            int i40 = w181Var5.d;
                                            if (z3) {
                                                i40 = dl81Var6.a();
                                            }
                                            boolean z4 = z3;
                                            boolean z5 = (a6 & 256) != 0;
                                            boolean z6 = (a6 & 512) != 0;
                                            boolean z7 = (a6 & 1024) != 0;
                                            boolean z8 = (a6 & 2048) != 0;
                                            boolean z9 = z7;
                                            long[] jArr2 = wl71Var2.h;
                                            int i41 = i40;
                                            if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
                                                j5 = wl71Var2.i[0];
                                            }
                                            int[] iArr = or71Var2.h;
                                            long[] jArr3 = or71Var2.i;
                                            boolean[] zArr = or71Var2.j;
                                            boolean z10 = wl71Var2.b == 2 && (i27 & 1) != 0;
                                            int i42 = or71Var2.g[i36] + i37;
                                            i12 = i27;
                                            long j7 = wl71Var2.c;
                                            long j8 = or71Var2.p;
                                            while (i37 < i42) {
                                                int a7 = z5 ? dl81Var6.a() : w181Var5.b;
                                                boolean z11 = z10;
                                                if (a7 < 0) {
                                                    dy31.g(null, q8a1.c(a7, "Unexpected negative value: "));
                                                    return;
                                                }
                                                if (z6) {
                                                    i13 = i42;
                                                    i14 = dl81Var6.a();
                                                } else {
                                                    i13 = i42;
                                                    i14 = w181Var5.c;
                                                }
                                                if (i14 < 0) {
                                                    dy31.g(null, q8a1.c(i14, "Unexpected negative value: "));
                                                    return;
                                                }
                                                int a8 = z9 ? dl81Var6.a() : (i37 == 0 && z4) ? i41 : w181Var5.d;
                                                if (z8) {
                                                    w181Var3 = w181Var5;
                                                    i15 = dl81Var6.a();
                                                } else {
                                                    w181Var3 = w181Var5;
                                                    i15 = 0;
                                                }
                                                int i43 = i37;
                                                int i44 = i38;
                                                long h = rf71.h((i15 + j8) - j5, 1000000L, j7);
                                                jArr3[i43] = h;
                                                if (!or71Var2.q) {
                                                    jArr3[i43] = h + nt81Var2.d.h;
                                                }
                                                iArr[i43] = i14;
                                                zArr[i43] = ((a8 >> 16) & 1) == 0 && (!z11 || i43 == 0);
                                                j8 += a7;
                                                i37 = i43 + 1;
                                                z10 = z11;
                                                i42 = i13;
                                                w181Var5 = w181Var3;
                                                i38 = i44;
                                            }
                                            or71Var2.p = j8;
                                            i37 = i42;
                                            i36 = i38;
                                        } else {
                                            i10 = i35;
                                            i11 = size5;
                                            arrayList4 = arrayList6;
                                            arrayList5 = arrayList7;
                                            i12 = i27;
                                        }
                                        i35 = i10 + 1;
                                        size5 = i11;
                                        arrayList6 = arrayList4;
                                        arrayList7 = arrayList5;
                                        i27 = i12;
                                        i5 = 1953658222;
                                    } else {
                                        arrayList2 = arrayList6;
                                        arrayList3 = arrayList7;
                                        i3 = i27;
                                        wl71 wl71Var3 = nt81Var2.d.a;
                                        w181 w181Var6 = or71Var2.a;
                                        w181Var6.getClass();
                                        ro71 ro71Var = wl71Var3.k[w181Var6.a];
                                        hp81 k5 = wl81Var2.k(1935763834);
                                        if (k5 != null) {
                                            ro71Var.getClass();
                                            dl81 dl81Var7 = k5.c;
                                            int i45 = ro71Var.d;
                                            dl81Var7.m(8);
                                            if ((dl81Var7.a() & 1) == 1) {
                                                dl81Var7.m(dl81Var7.b + 8);
                                            }
                                            int s = dl81Var7.s();
                                            int v2 = dl81Var7.v();
                                            if (v2 > or71Var2.e) {
                                                StringBuilder t = b64.t(v2, "Saiz sample count ", " is greater than fragment sample count");
                                                t.append(or71Var2.e);
                                                throw new aa2(t.toString(), null, true, 1);
                                            }
                                            if (s == 0) {
                                                boolean[] zArr2 = or71Var2.l;
                                                i9 = 0;
                                                for (int i46 = 0; i46 < v2; i46++) {
                                                    int s2 = dl81Var7.s();
                                                    i9 += s2;
                                                    zArr2[i46] = s2 > i45;
                                                }
                                                z = false;
                                            } else {
                                                boolean z12 = s > i45;
                                                i9 = s * v2;
                                                z = false;
                                                Arrays.fill(or71Var2.l, 0, v2, z12);
                                            }
                                            Arrays.fill(or71Var2.l, v2, or71Var2.e, z);
                                            if (i9 > 0) {
                                                or71Var2.n.i(i9);
                                                i6 = 1;
                                                or71Var2.k = true;
                                                or71Var2.o = true;
                                                k = wl81Var2.k(1935763823);
                                                if (k != null) {
                                                    dl81 dl81Var8 = k.c;
                                                    dl81Var8.m(8);
                                                    int a9 = dl81Var8.a();
                                                    if ((a9 & 1) == i6) {
                                                        dl81Var8.m(dl81Var8.b + 8);
                                                    }
                                                    int v3 = dl81Var8.v();
                                                    if (v3 != i6) {
                                                        dy31.g(null, q8a1.c(v3, "Unexpected saio entry count: "));
                                                        return;
                                                    }
                                                    or71Var2.c += ((a9 >> 24) & 255) == 0 ? dl81Var8.t() : dl81Var8.w();
                                                }
                                                byte[] bArr = null;
                                                k2 = wl81Var2.k(1936027235);
                                                if (k2 != null) {
                                                    g(k2.c, 0, or71Var2);
                                                }
                                                String str = ro71Var == null ? ro71Var.b : null;
                                                dl81Var = null;
                                                dl81 dl81Var9 = null;
                                                for (i7 = 0; i7 < arrayList9.size(); i7++) {
                                                    hp81 hp81Var4 = (hp81) arrayList9.get(i7);
                                                    dl81 dl81Var10 = hp81Var4.c;
                                                    int i47 = hp81Var4.b;
                                                    if (i47 == 1935828848) {
                                                        dl81Var10.m(12);
                                                        if (dl81Var10.a() == 1936025959) {
                                                            dl81Var = dl81Var10;
                                                        }
                                                    } else if (i47 == 1936158820) {
                                                        dl81Var10.m(12);
                                                        if (dl81Var10.a() == 1936025959) {
                                                            dl81Var9 = dl81Var10;
                                                        }
                                                    }
                                                }
                                                if (dl81Var != null && dl81Var9 != null) {
                                                    dl81Var.m(8);
                                                    a = (dl81Var.a() >> 24) & 255;
                                                    dl81Var.m(dl81Var.b + 4);
                                                    if (a == 1) {
                                                        dl81Var.m(dl81Var.b + 4);
                                                    }
                                                    if (dl81Var.a() == 1) {
                                                        throw aa2.a("Entry count in sbgp != 1 (unsupported).");
                                                    }
                                                    dl81Var9.m(8);
                                                    int a10 = (dl81Var9.a() >> 24) & 255;
                                                    dl81Var9.m(dl81Var9.b + 4);
                                                    if (a10 == 1) {
                                                        if (dl81Var9.t() == 0) {
                                                            throw aa2.a("Variable length description in sgpd found (unsupported)");
                                                        }
                                                    } else if (a10 >= 2) {
                                                        dl81Var9.m(dl81Var9.b + 4);
                                                    }
                                                    if (dl81Var9.t() != 1) {
                                                        throw aa2.a("Entry count in sgpd != 1 (unsupported).");
                                                    }
                                                    dl81Var9.m(dl81Var9.b + 1);
                                                    int s3 = dl81Var9.s();
                                                    int i48 = (s3 & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC) >> 4;
                                                    int i49 = s3 & 15;
                                                    boolean z13 = dl81Var9.s() == 1;
                                                    if (z13) {
                                                        int s4 = dl81Var9.s();
                                                        byte[] bArr2 = new byte[16];
                                                        dl81Var9.d(0, 16, bArr2);
                                                        if (s4 == 0) {
                                                            int s5 = dl81Var9.s();
                                                            bArr = new byte[s5];
                                                            dl81Var9.d(0, s5, bArr);
                                                        }
                                                        or71Var2.k = true;
                                                        or71Var2.m = new ro71(z13, str, s4, bArr2, i48, i49, bArr);
                                                        size = arrayList9.size();
                                                        for (i8 = 0; i8 < size; i8++) {
                                                            hp81 hp81Var5 = (hp81) arrayList9.get(i8);
                                                            if (hp81Var5.b == 1970628964) {
                                                                dl81 dl81Var11 = hp81Var5.c;
                                                                dl81Var11.m(8);
                                                                byte[] bArr3 = this.g;
                                                                dl81Var11.d(0, 16, bArr3);
                                                                if (Arrays.equals(bArr3, G)) {
                                                                    g(dl81Var11, 16, or71Var2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                size = arrayList9.size();
                                                while (i8 < size) {
                                                }
                                            }
                                        }
                                        i6 = 1;
                                        k = wl81Var2.k(1935763823);
                                        if (k != null) {
                                        }
                                        byte[] bArr4 = null;
                                        k2 = wl81Var2.k(1936027235);
                                        if (k2 != null) {
                                        }
                                        if (ro71Var == null) {
                                        }
                                        dl81Var = null;
                                        dl81 dl81Var92 = null;
                                        while (i7 < arrayList9.size()) {
                                        }
                                        if (dl81Var != null) {
                                            dl81Var.m(8);
                                            a = (dl81Var.a() >> 24) & 255;
                                            dl81Var.m(dl81Var.b + 4);
                                            if (a == 1) {
                                            }
                                            if (dl81Var.a() == 1) {
                                            }
                                        }
                                        size = arrayList9.size();
                                        while (i8 < size) {
                                        }
                                    }
                                }
                            }
                        } else {
                            i = size4;
                            i2 = i28;
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                            i3 = i27;
                        }
                        i28 = i2 + 1;
                        size4 = i;
                        arrayList6 = arrayList2;
                        arrayList7 = arrayList3;
                        i27 = i3;
                    }
                    kk0 a11 = a(arrayList7);
                    if (a11 != null) {
                        int size6 = sparseArray.size();
                        for (int i50 = 0; i50 < size6; i50++) {
                            nt81 nt81Var3 = (nt81) sparseArray.valueAt(i50);
                            wl71 wl71Var4 = nt81Var3.d.a;
                            w181 w181Var7 = nt81Var3.b.a;
                            int i51 = rf71.a;
                            ro71 ro71Var2 = wl71Var4.k[w181Var7.a];
                            String str2 = ro71Var2 != null ? ro71Var2.b : null;
                            kk0 kk0Var = rf71.o(a11.d, str2) ? a11 : new kk0(str2, false, a11.b);
                            qd81 qd81Var = nt81Var3.d.a.f;
                            qd81Var.getClass();
                            da81 da81Var = new da81(qd81Var);
                            da81Var.n = kk0Var;
                            nt81Var3.a.k(new qd81(da81Var));
                        }
                    }
                    if (this.u != -9223372036854775807L) {
                        int size7 = sparseArray.size();
                        for (int i52 = 0; i52 < size7; i52++) {
                            nt81 nt81Var4 = (nt81) sparseArray.valueAt(i52);
                            long j9 = this.u;
                            int i53 = nt81Var4.f;
                            while (true) {
                                or71 or71Var3 = nt81Var4.b;
                                if (i53 < or71Var3.e && or71Var3.i[i53] < j9) {
                                    if (or71Var3.j[i53]) {
                                        nt81Var4.i = i53;
                                    }
                                    i53++;
                                }
                            }
                        }
                        this.u = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((wl81) arrayDeque.peek()).e.add(wl81Var);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0139, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0134, code lost:
    
        r37.x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0142, code lost:
    
        if (r2.d.a.g != r18) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0144, code lost:
    
        r37.y = r4 - 8;
        ((defpackage.w971) r38).b(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0150, code lost:
    
        r4 = "audio/ac4".equals(r2.d.a.f.E);
        r6 = r37.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0160, code lost:
    
        if (r4 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0162, code lost:
    
        r37.z = r2.a(r6, 7);
        r6 = r37.y;
        r7 = r37.h;
        defpackage.xca1.b(r6, r7);
        r2.a.a(7, r7);
        r37.z += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0181, code lost:
    
        r37.y += r37.z;
        r37.n = 4;
        r37.A = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017b, code lost:
    
        r37.z = r2.a(r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d8, code lost:
    
        r4 = r3.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x018d, code lost:
    
        r4 = r2.d;
        r6 = r4.a;
        r7 = r6.f;
        r8 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0197, code lost:
    
        if (r2.l != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0199, code lost:
    
        r13 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a6, code lost:
    
        r4 = r6.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01a8, code lost:
    
        if (r4 == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01aa, code lost:
    
        r6 = r37.e;
        r10 = r6.a;
        r10[0] = 0;
        r10[1] = 0;
        r10[r39] = 0;
        r15 = r4 + 1;
        r4 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c0, code lost:
    
        if (r37.z >= r37.y) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c2, code lost:
    
        r5 = r37.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c6, code lost:
    
        if (r5 != 0) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0237, code lost:
    
        r39 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x023b, code lost:
    
        if (r37.B == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x023d, code lost:
    
        r4 = r37.f;
        r4.i(r5);
        r20 = r6;
        r21 = r10;
        ((defpackage.w971) r38).E(r4.a, r11, r37.A, r11);
        r8.a(r37.A, r4);
        r5 = r37.A;
        r6 = defpackage.sba1.a(r4.c, r4.a);
        r4.m("video/hevc".equals(r7.E) ? 1 : 0);
        r4.k(r6);
        defpackage.aba1.b(r13, r4, r37.E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0279, code lost:
    
        r37.z += r5;
        r37.A -= r5;
        r4 = r39;
        r6 = r20;
        r10 = r21;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0271, code lost:
    
        r20 = r6;
        r21 = r10;
        r5 = r8.c(r38, r5, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c8, code lost:
    
        ((defpackage.w971) r38).E(r10, r4, r15, r11);
        r6.m(r11);
        r5 = r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01d6, code lost:
    
        if (r5 < 1) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d8, code lost:
    
        r37.A = r5 - 1;
        r5 = r37.d;
        r5.m(0);
        r8.a(4, r5);
        r8.a(1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ed, code lost:
    
        if (r37.E.length <= 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ef, code lost:
    
        r5 = r7.E;
        r20 = r10[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01f9, code lost:
    
        if ("video/avc".equals(r5) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fb, code lost:
    
        r39 = r4;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0200, code lost:
    
        if ((r20 & 31) == 6) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0216, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x021c, code lost:
    
        r37.B = r5;
        r37.z += 5;
        r37.y += r39;
        r11 = 0;
        r4 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x020a, code lost:
    
        if ("video/hevc".equals(r5) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0214, code lost:
    
        if (((r20 & 126) >> 1) != 39) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x021b, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0203, code lost:
    
        r39 = r4;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0218, code lost:
    
        r39 = r4;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x022f, code lost:
    
        defpackage.dy31.g(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0236, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a1, code lost:
    
        if (r2.l != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a3, code lost:
    
        r1 = r2.d.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02bb, code lost:
    
        if (r2.b() == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02bd, code lost:
    
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02c0, code lost:
    
        r23 = r1;
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02c6, code lost:
    
        if (r1 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02c8, code lost:
    
        r26 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02cf, code lost:
    
        r21 = r13;
        r8.b(r21, r23, r37.y, 0, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e0, code lost:
    
        if (r12.isEmpty() != false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e2, code lost:
    
        r1 = (defpackage.kq81) r12.removeFirst();
        r37.t -= r1.c;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02f3, code lost:
    
        if (r1.b == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f5, code lost:
    
        r4 = r4 + r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02f7, code lost:
    
        r29 = r4;
        r4 = r37.D;
        r5 = r4.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02fd, code lost:
    
        if (r6 >= r5) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02ff, code lost:
    
        r4[r6].b(r29, 1, r1.c, r37.t, null);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0313, code lost:
    
        r2.f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x031d, code lost:
    
        if (r2.l != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x031f, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0338, code lost:
    
        r37.x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x033e, code lost:
    
        r37.n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0340, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0322, code lost:
    
        r1 = r2.g + 1;
        r2.g = r1;
        r3 = r3.g;
        r4 = r2.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x032e, code lost:
    
        if (r1 != r3[r4]) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0330, code lost:
    
        r2.h = r4 + 1;
        r11 = 0;
        r2.g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x033c, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02cd, code lost:
    
        r26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02b2, code lost:
    
        if (r3.j[r2.f] == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02b4, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02b6, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x028d, code lost:
    
        r4 = r37.z;
        r5 = r37.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0291, code lost:
    
        if (r4 >= r5) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0293, code lost:
    
        r37.z += r8.c(r38, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01a0, code lost:
    
        r13 = r3.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c3, code lost:
    
        r3 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
    
        if (r37.n != 3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00cd, code lost:
    
        if (r2.l != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00cf, code lost:
    
        r4 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00de, code lost:
    
        r37.y = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e4, code lost:
    
        if (r2.f >= r2.i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e6, code lost:
    
        ((defpackage.w971) r38).b(r4);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ef, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f2, code lost:
    
        r4 = r3.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f6, code lost:
    
        if (r1 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f8, code lost:
    
        r4.m(r4.b + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00fe, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0102, code lost:
    
        if (r3.k == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0108, code lost:
    
        if (r3.l[r1] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010a, code lost:
    
        r4.m(r4.b + (r4.x() * 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0115, code lost:
    
        r2.f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x011d, code lost:
    
        if (r2.l != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0120, code lost:
    
        r1 = r2.g + 1;
        r2.g = r1;
        r3 = r3.g;
        r4 = r2.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012c, code lost:
    
        if (r1 != r3[r4]) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x012e, code lost:
    
        r2.h = r4 + 1;
        r2.g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0136, code lost:
    
        r37.n = 3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24, types: [w971] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r5v38, types: [w971] */
    /* JADX WARN: Type inference failed for: r6v24, types: [dl81] */
    /* JADX WARN: Type inference failed for: r6v25, types: [dl81] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r8v24, types: [fb81] */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        String p;
        String p2;
        long h;
        long h2;
        long t;
        long j;
        long w;
        long w2;
        char c;
        int i;
        int i2;
        loop0: while (true) {
            while (true) {
                int i3 = this.n;
                char c2 = 2;
                ArrayDeque arrayDeque = this.k;
                SparseArray sparseArray = this.c;
                int i4 = 1;
                ?? r11 = 0;
                if (i3 != 0) {
                    ArrayDeque arrayDeque2 = this.l;
                    if (i3 != 1) {
                        long j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                        if (i3 != 2) {
                            nt81 nt81Var = this.x;
                            if (nt81Var != null) {
                                c = 2;
                                i = 1;
                                i2 = 8;
                                break loop0;
                            }
                            int size = sparseArray.size();
                            long j3 = Long.MAX_VALUE;
                            nt81 nt81Var2 = null;
                            int i5 = 0;
                            while (i5 < size) {
                                char c3 = c2;
                                nt81 nt81Var3 = (nt81) sparseArray.valueAt(i5);
                                boolean z = nt81Var3.l;
                                or71 or71Var = nt81Var3.b;
                                int i6 = i4;
                                if ((z || nt81Var3.f != nt81Var3.d.b) && (!z || nt81Var3.h != or71Var.d)) {
                                    long j4 = !z ? nt81Var3.d.c[nt81Var3.f] : or71Var.f[nt81Var3.h];
                                    if (j4 < j3) {
                                        nt81Var2 = nt81Var3;
                                        j3 = j4;
                                    }
                                }
                                i5++;
                                c2 = c3;
                                i4 = i6;
                            }
                            c = c2;
                            i = i4;
                            i2 = 8;
                            if (nt81Var2 == null) {
                                w971 w971Var = (w971) bb71Var;
                                int i7 = (int) (this.s - w971Var.w);
                                if (i7 < 0) {
                                    dy31.g(null, "Offset to end of mdat was negative.");
                                    return 0;
                                }
                                w971Var.b(i7);
                                this.n = 0;
                                this.q = 0;
                            } else {
                                w971 w971Var2 = (w971) bb71Var;
                                int i8 = (int) ((!nt81Var2.l ? nt81Var2.d.c[nt81Var2.f] : nt81Var2.b.f[nt81Var2.h]) - w971Var2.w);
                                if (i8 < 0) {
                                    nba1.e();
                                    i8 = 0;
                                }
                                w971Var2.b(i8);
                                this.x = nt81Var2;
                                nt81Var = nt81Var2;
                            }
                        } else {
                            int size2 = sparseArray.size();
                            nt81 nt81Var4 = null;
                            for (int i9 = 0; i9 < size2; i9++) {
                                or71 or71Var2 = ((nt81) sparseArray.valueAt(i9)).b;
                                if (or71Var2.o) {
                                    long j5 = or71Var2.c;
                                    if (j5 < j2) {
                                        nt81Var4 = (nt81) sparseArray.valueAt(i9);
                                        j2 = j5;
                                    }
                                }
                            }
                            if (nt81Var4 == null) {
                                this.n = 3;
                            } else {
                                w971 w971Var3 = (w971) bb71Var;
                                int i10 = (int) (j2 - w971Var3.w);
                                if (i10 < 0) {
                                    dy31.g(null, "Offset to encryption data was negative.");
                                    return 0;
                                }
                                w971Var3.b(i10);
                                or71 or71Var3 = nt81Var4.b;
                                dl81 dl81Var = or71Var3.n;
                                w971Var3.E(dl81Var.a, 0, dl81Var.c, false);
                                or71Var3.n.m(0);
                                or71Var3.o = false;
                            }
                        }
                    } else {
                        int i11 = ((int) this.p) - this.q;
                        dl81 dl81Var2 = this.r;
                        if (dl81Var2 != null) {
                            w971 w971Var4 = (w971) bb71Var;
                            w971Var4.E(dl81Var2.a, 8, i11, false);
                            int i12 = this.o;
                            hp81 hp81Var = new hp81(i12, dl81Var2);
                            long j6 = w971Var4.w;
                            if (!arrayDeque.isEmpty()) {
                                ((wl81) arrayDeque.peek()).d.add(hp81Var);
                            } else if (i12 == 1936286840) {
                                dl81Var2.m(8);
                                int a = (dl81Var2.a() >> 24) & 255;
                                dl81Var2.m(dl81Var2.b + 4);
                                long t2 = dl81Var2.t();
                                if (a == 0) {
                                    w = dl81Var2.t();
                                    w2 = dl81Var2.t();
                                } else {
                                    w = dl81Var2.w();
                                    w2 = dl81Var2.w();
                                }
                                long j7 = w2 + j6;
                                long j8 = w;
                                long h3 = rf71.h(j8, 1000000L, t2);
                                dl81Var2.m(dl81Var2.b + 2);
                                int x = dl81Var2.x();
                                int[] iArr = new int[x];
                                long[] jArr = new long[x];
                                long[] jArr2 = new long[x];
                                long j9 = h3;
                                long[] jArr3 = new long[x];
                                int i13 = 0;
                                while (i13 < x) {
                                    int a2 = dl81Var2.a();
                                    if ((a2 & Integer.MIN_VALUE) != 0) {
                                        dy31.g(null, "Unhandled indirect reference");
                                        return 0;
                                    }
                                    long t3 = dl81Var2.t();
                                    iArr[i13] = a2 & Integer.MAX_VALUE;
                                    jArr[i13] = j7;
                                    jArr2[i13] = j9;
                                    j8 += t3;
                                    int i14 = i13;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    long h4 = rf71.h(j8, 1000000L, t2);
                                    jArr5[i14] = h4 - jArr4[i14];
                                    dl81Var2.m(dl81Var2.b + 4);
                                    j7 += iArr[i14];
                                    x = x;
                                    jArr3 = jArr5;
                                    jArr2 = jArr4;
                                    i13 = i14 + 1;
                                    h3 = h3;
                                    j9 = h4;
                                }
                                Pair create = Pair.create(Long.valueOf(h3), new jt81(iArr, jArr, jArr3, jArr2));
                                this.w = ((Long) create.first).longValue();
                                this.C.r((a871) create.second);
                                this.F = true;
                            } else if (i12 == 1701671783 && this.D.length != 0) {
                                dl81Var2.m(8);
                                int a3 = (dl81Var2.a() >> 24) & 255;
                                if (a3 == 0) {
                                    p = dl81Var2.p();
                                    p.getClass();
                                    p2 = dl81Var2.p();
                                    p2.getClass();
                                    long t4 = dl81Var2.t();
                                    h = rf71.h(dl81Var2.t(), 1000000L, t4);
                                    long j10 = this.w;
                                    long j11 = j10 != -9223372036854775807L ? j10 + h : -9223372036854775807L;
                                    h2 = rf71.h(dl81Var2.t(), 1000L, t4);
                                    t = dl81Var2.t();
                                    j = j11;
                                } else if (a3 != 1) {
                                    nba1.e();
                                } else {
                                    long t5 = dl81Var2.t();
                                    j = rf71.h(dl81Var2.w(), 1000000L, t5);
                                    h2 = rf71.h(dl81Var2.t(), 1000L, t5);
                                    t = dl81Var2.t();
                                    p = dl81Var2.p();
                                    p.getClass();
                                    p2 = dl81Var2.p();
                                    p2.getClass();
                                    h = -9223372036854775807L;
                                }
                                String str = p;
                                String str2 = p2;
                                long j12 = h2;
                                long j13 = t;
                                int i15 = dl81Var2.c - dl81Var2.b;
                                byte[] bArr = new byte[i15];
                                dl81Var2.d(0, i15, bArr);
                                dl81 dl81Var3 = new dl81(this.i.a(new nm0(str, str2, j12, j13, bArr)));
                                int i16 = dl81Var3.c - dl81Var3.b;
                                for (fb81 fb81Var : this.D) {
                                    dl81Var3.m(0);
                                    fb81Var.a(i16, dl81Var3);
                                }
                                if (j == -9223372036854775807L) {
                                    arrayDeque2.addLast(new kq81(true, i16, h));
                                    this.t += i16;
                                } else if (arrayDeque2.isEmpty()) {
                                    for (fb81 fb81Var2 : this.D) {
                                        fb81Var2.b(j, 1, i16, 0, null);
                                    }
                                } else {
                                    arrayDeque2.addLast(new kq81(false, i16, j));
                                    this.t += i16;
                                }
                            }
                        } else {
                            ((w971) bb71Var).b(i11);
                        }
                        d(((w971) bb71Var).w);
                    }
                } else {
                    int i17 = this.q;
                    dl81 dl81Var4 = this.j;
                    if (i17 == 0) {
                        if (!((w971) bb71Var).E(dl81Var4.a, 0, 8, true)) {
                            return -1;
                        }
                        this.q = 8;
                        dl81Var4.m(0);
                        this.p = dl81Var4.t();
                        this.o = dl81Var4.a();
                    }
                    long j14 = this.p;
                    if (j14 == 1) {
                        ((w971) bb71Var).E(dl81Var4.a, 8, 8, false);
                        this.q += 8;
                        this.p = dl81Var4.w();
                    } else if (j14 == 0) {
                        w971 w971Var5 = (w971) bb71Var;
                        long j15 = w971Var5.c;
                        if (j15 == -1 && !arrayDeque.isEmpty()) {
                            j15 = ((wl81) arrayDeque.peek()).c;
                        }
                        if (j15 != -1) {
                            this.p = (j15 - w971Var5.w) + this.q;
                        }
                    }
                    long j16 = this.p;
                    long j17 = this.q;
                    if (j16 < j17) {
                        throw aa2.a("Atom size less than header length (unsupported).");
                    }
                    w971 w971Var6 = (w971) bb71Var;
                    long j18 = w971Var6.w - j17;
                    int i18 = this.o;
                    if ((i18 == 1836019558 || i18 == 1835295092) && !this.F) {
                        this.C.r(new w471(this.v, j18));
                        this.F = true;
                    }
                    if (this.o == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i19 = 0; i19 < size3; i19++) {
                            or71 or71Var4 = ((nt81) sparseArray.valueAt(i19)).b;
                            or71Var4.getClass();
                            or71Var4.c = j18;
                            or71Var4.b = j18;
                        }
                    }
                    int i20 = this.o;
                    if (i20 == 1835295092) {
                        this.x = null;
                        this.s = j18 + this.p;
                        this.n = 2;
                    } else if (i20 == 1836019574 || i20 == 1953653099 || i20 == 1835297121 || i20 == 1835626086 || i20 == 1937007212 || i20 == 1836019558 || i20 == 1953653094 || i20 == 1836475768 || i20 == 1701082227) {
                        long j19 = (w971Var6.w + this.p) - 8;
                        arrayDeque.push(new wl81(i20, j19));
                        if (this.p == this.q) {
                            d(j19);
                        } else {
                            this.n = 0;
                            this.q = 0;
                        }
                    } else if (i20 == 1751411826 || i20 == 1835296868 || i20 == 1836476516 || i20 == 1936286840 || i20 == 1937011556 || i20 == 1937011827 || i20 == 1668576371 || i20 == 1937011555 || i20 == 1937011578 || i20 == 1937013298 || i20 == 1937007471 || i20 == 1668232756 || i20 == 1937011571 || i20 == 1952867444 || i20 == 1952868452 || i20 == 1953196132 || i20 == 1953654136 || i20 == 1953658222 || i20 == 1886614376 || i20 == 1935763834 || i20 == 1935763823 || i20 == 1936027235 || i20 == 1970628964 || i20 == 1935828848 || i20 == 1936158820 || i20 == 1701606260 || i20 == 1835362404 || i20 == 1701671783) {
                        if (this.q != 8) {
                            throw aa2.a("Leaf atom defines extended atom size (unsupported).");
                        }
                        long j20 = this.p;
                        if (j20 > 2147483647L) {
                            throw aa2.a("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        dl81 dl81Var5 = new dl81((int) j20);
                        System.arraycopy(dl81Var4.a, 0, dl81Var5.a, 0, 8);
                        this.r = dl81Var5;
                        this.n = 1;
                    } else {
                        if (this.p > 2147483647L) {
                            throw aa2.a("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.r = null;
                        this.n = 1;
                    }
                }
            }
        }
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        return wfa1.c(bb71Var, true);
    }

    public dw81() {
        this(0, Collections.EMPTY_LIST, null);
    }
}
