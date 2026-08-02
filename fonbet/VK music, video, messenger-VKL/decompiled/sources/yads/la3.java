package yads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class la3 implements nq0 {
    public final int a;
    public final int b;
    public final List c;
    public final kc2 d;
    public final SparseIntArray e;
    public final oa3 f;
    public final SparseArray g;
    public final SparseBooleanArray h;
    public final SparseBooleanArray i;
    public final ia3 j;
    public ha3 k;
    public qq0 l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public qa3 q;
    public int r;
    public int s;

    public la3(int i) {
        this(new c83(0L), new jf0());
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.l = qq0Var;
    }

    public final void b() {
        this.h.clear();
        this.g.clear();
        ((jf0) this.f).getClass();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            this.g.put(sparseArray.keyAt(i), (qa3) sparseArray.valueAt(i));
        }
        this.g.put(0, new wx2(new ja3(this)));
        this.q = null;
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        int i;
        ha3 ha3Var;
        long j3;
        if (this.a == 2) {
            throw new IllegalStateException();
        }
        int size = this.c.size();
        for (0; i < size; i + 1) {
            c83 c83Var = (c83) this.c.get(i);
            synchronized (c83Var) {
                j3 = c83Var.b;
            }
            boolean z = j3 == C.TIME_UNSET;
            if (z) {
                i = z ? 0 : i + 1;
                c83Var.c(j2);
            } else {
                long a = c83Var.a();
                if (a != C.TIME_UNSET) {
                    if (a != 0) {
                        if (a == j2) {
                        }
                        c83Var.c(j2);
                    }
                }
            }
        }
        if (j2 != 0 && (ha3Var = this.k) != null) {
            ha3Var.a(j2);
        }
        this.d.c(0);
        this.e.clear();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            ((qa3) this.g.valueAt(i2)).a();
        }
        this.r = 0;
    }

    public la3(c83 c83Var, jf0 jf0Var) {
        this.f = (oa3) ni.a(jf0Var);
        this.b = 112800;
        this.a = 1;
        this.c = Collections.singletonList(c83Var);
        this.d = new kc2(0, new byte[9400]);
        this.h = new SparseBooleanArray();
        this.i = new SparseBooleanArray();
        this.g = new SparseArray();
        this.e = new SparseIntArray();
        this.j = new ia3();
        this.l = qq0.a;
        this.s = -1;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    @Override // yads.nq0
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        long j;
        int i;
        ?? r11;
        long j2;
        long j3;
        boolean z;
        ld0 ld0Var = (ld0) oq0Var;
        long j4 = ld0Var.c;
        if (this.n) {
            long j5 = C.TIME_UNSET;
            if (j4 == -1 || this.a == 2) {
                j2 = 0;
            } else {
                ia3 ia3Var = this.j;
                j2 = 0;
                if (!ia3Var.d) {
                    int i2 = this.s;
                    if (i2 <= 0) {
                        ia3Var.c.a(mc3.f);
                        ia3Var.d = true;
                        ld0Var.f = 0;
                    } else {
                        if (!ia3Var.f) {
                            int min = (int) Math.min(ia3Var.a, j4);
                            long j6 = j4 - min;
                            if (ld0Var.d != j6) {
                                hh2Var.a = j6;
                                return 1;
                            }
                            ia3Var.c.c(min);
                            ld0Var.f = 0;
                            ld0Var.b(ia3Var.c.a, 0, min, false);
                            kc2 kc2Var = ia3Var.c;
                            int i3 = kc2Var.b;
                            int i4 = kc2Var.c;
                            int i5 = i4 - 188;
                            while (true) {
                                if (i5 < i3) {
                                    break;
                                }
                                byte[] bArr = kc2Var.a;
                                int i6 = -4;
                                int i7 = 0;
                                while (true) {
                                    if (i6 > 4) {
                                        break;
                                    }
                                    int i8 = (i6 * 188) + i5;
                                    if (i8 < i3 || i8 >= i4 || bArr[i8] != 71) {
                                        i7 = 0;
                                    } else {
                                        i7++;
                                        if (i7 == 5) {
                                            long a = ra3.a(i5, i2, kc2Var);
                                            if (a != C.TIME_UNSET) {
                                                j5 = a;
                                                break;
                                            }
                                        }
                                    }
                                    i6++;
                                }
                                i5--;
                            }
                            ia3Var.h = j5;
                            ia3Var.f = true;
                            return 0;
                        }
                        if (ia3Var.h == C.TIME_UNSET) {
                            ia3Var.c.a(mc3.f);
                            ia3Var.d = true;
                            ld0Var.f = 0;
                        } else {
                            if (!ia3Var.e) {
                                int min2 = (int) Math.min(ia3Var.a, j4);
                                long j7 = 0;
                                if (ld0Var.d != j7) {
                                    hh2Var.a = j7;
                                    return 1;
                                }
                                ia3Var.c.c(min2);
                                ld0Var.f = 0;
                                ld0Var.b(ia3Var.c.a, 0, min2, false);
                                kc2 kc2Var2 = ia3Var.c;
                                int i9 = kc2Var2.b;
                                int i10 = kc2Var2.c;
                                while (true) {
                                    if (i9 >= i10) {
                                        break;
                                    }
                                    if (kc2Var2.a[i9] == 71) {
                                        long a2 = ra3.a(i9, i2, kc2Var2);
                                        if (a2 != C.TIME_UNSET) {
                                            j5 = a2;
                                            break;
                                        }
                                    }
                                    i9++;
                                }
                                ia3Var.g = j5;
                                ia3Var.e = true;
                                return 0;
                            }
                            long j8 = ia3Var.g;
                            if (j8 == C.TIME_UNSET) {
                                ia3Var.c.a(mc3.f);
                                ia3Var.d = true;
                                ld0Var.f = 0;
                            } else {
                                long b = ia3Var.b.b(ia3Var.h) - ia3Var.b.b(j8);
                                ia3Var.i = b;
                                if (b < 0) {
                                    ji1.d("TsDurationReader", "Invalid duration: " + ia3Var.i + ". Using TIME_UNSET instead.");
                                    ia3Var.i = C.TIME_UNSET;
                                }
                                ia3Var.c.a(mc3.f);
                                ia3Var.d = true;
                                ld0Var.f = 0;
                            }
                        }
                    }
                    return 0;
                }
            }
            if (this.o) {
                j = -1;
                i = 1;
                j3 = j2;
                z = false;
            } else {
                this.o = true;
                ia3 ia3Var2 = this.j;
                long j9 = ia3Var2.i;
                if (j9 != C.TIME_UNSET) {
                    j = -1;
                    i = 1;
                    j3 = j2;
                    z = false;
                    ha3 ha3Var = new ha3(ia3Var2.b, j9, j4, this.s, this.b);
                    this.k = ha3Var;
                    this.l.a(ha3Var.a);
                } else {
                    j = -1;
                    i = 1;
                    j3 = j2;
                    z = false;
                    this.l.a(new yx2(j9, j3));
                }
            }
            if (this.p) {
                this.p = z;
                seek(j3, j3);
                if (ld0Var.d != j3) {
                    hh2Var.a = j3;
                    return i;
                }
            }
            ha3 ha3Var2 = this.k;
            r11 = z;
            if (ha3Var2 != null) {
                r11 = z;
                if (ha3Var2.c != null) {
                    return ha3Var2.a(ld0Var, hh2Var);
                }
            }
        } else {
            j = -1;
            i = 1;
            r11 = 0;
        }
        kc2 kc2Var3 = this.d;
        byte[] bArr2 = kc2Var3.a;
        int i11 = kc2Var3.b;
        if (9400 - i11 < 188) {
            int i12 = kc2Var3.c - i11;
            if (i12 > 0) {
                System.arraycopy(bArr2, i11, bArr2, r11, i12);
            }
            kc2 kc2Var4 = this.d;
            kc2Var4.a = bArr2;
            kc2Var4.c = i12;
            kc2Var4.b = r11;
        }
        while (true) {
            kc2 kc2Var5 = this.d;
            int i13 = kc2Var5.c;
            int i14 = kc2Var5.b;
            if (i13 - i14 >= 188) {
                byte[] bArr3 = kc2Var5.a;
                int i15 = i14;
                while (i15 < i13 && bArr3[i15] != 71) {
                    i15++;
                }
                this.d.e(i15);
                int i16 = i15 + 188;
                if (i16 > i13) {
                    int i17 = (i15 - i14) + this.r;
                    this.r = i17;
                    if (this.a == 2 && i17 > 376) {
                        boolean z2 = i;
                        throw new pc2("Cannot find sync byte. Most likely not a Transport Stream.", null, z2, z2 ? 1 : 0);
                    }
                } else {
                    this.r = r11;
                }
                kc2 kc2Var6 = this.d;
                int i18 = kc2Var6.c;
                if (i16 > i18) {
                    return r11;
                }
                int b2 = kc2Var6.b();
                if ((8388608 & b2) != 0) {
                    this.d.e(i16);
                    return r11;
                }
                int i19 = (4194304 & b2) != 0 ? 1 : r11;
                int i20 = (2096896 & b2) >> 8;
                boolean z3 = (b2 & 32) != 0 ? true : r11;
                qa3 qa3Var = (b2 & 16) != 0 ? (qa3) this.g.get(i20) : null;
                if (qa3Var == null) {
                    this.d.e(i16);
                    return r11;
                }
                if (this.a != 2) {
                    int i21 = b2 & 15;
                    int i22 = this.e.get(i20, i21 - 1);
                    this.e.put(i20, i21);
                    if (i22 == i21) {
                        this.d.e(i16);
                        return r11;
                    }
                    if (i21 != ((i22 + 1) & 15)) {
                        qa3Var.a();
                    }
                }
                if (z3) {
                    int m = this.d.m();
                    i19 |= (this.d.m() & 64) != 0 ? 2 : r11;
                    kc2 kc2Var7 = this.d;
                    kc2Var7.e(kc2Var7.b + (m - 1));
                }
                boolean z4 = this.n;
                if (this.a == 2 || z4 || !this.i.get(i20, r11)) {
                    this.d.d(i16);
                    qa3Var.a(i19, this.d);
                    this.d.d(i18);
                }
                if (this.a != 2 && !z4 && this.n && j4 != j) {
                    this.p = true;
                }
                this.d.e(i16);
                return r11;
            }
            int read = ld0Var.read(bArr2, i13, 9400 - i13);
            if (read == -1) {
                return -1;
            }
            this.d.d(i13 + read);
        }
    }

    @Override // yads.nq0
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(oq0 oq0Var) {
        byte[] bArr = this.d.a;
        ld0 ld0Var = (ld0) oq0Var;
        ld0Var.b(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            ld0Var.a(i);
            return true;
        }
        return false;
    }

    public static nq0[] a() {
        return new nq0[]{new la3(0)};
    }
}
