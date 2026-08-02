package xsna;

import androidx.compose.runtime.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SlotTable.kt */
/* loaded from: classes11.dex */
public final class y2k0 {
    public final v2k0 a;
    public int[] b;
    public Object[] c;
    public ArrayList<rgt> d;
    public HashMap<rgt, wgt> e;
    public pg50<qg50> f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final s9x p;
    public final s9x q;
    public final s9x r;
    public pg50<fh50<Object>> s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public ng50 x;

    /* compiled from: SlotTable.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static List a(y2k0 y2k0Var, int i, y2k0 y2k0Var2, boolean z, boolean z2, boolean z3) {
            EmptyList emptyList;
            EmptyList emptyList2;
            boolean z4;
            int i2;
            rgt a0;
            int i3;
            int i4;
            int y = y2k0Var.y(i);
            int i5 = i + y;
            int f = y2k0Var.f(i);
            int f2 = y2k0Var.f(i5);
            int i6 = f2 - f;
            boolean z5 = i >= 0 && (y2k0Var.b[(y2k0Var.v(i) * 5) + 1] & 201326592) != 0;
            y2k0Var2.B(y);
            y2k0Var2.C(i6, y2k0Var2.t);
            if (y2k0Var.g < i5) {
                y2k0Var.G(i5);
            }
            if (y2k0Var.k < f2) {
                y2k0Var.H(f2, i5);
            }
            int[] iArr = y2k0Var2.b;
            int i7 = y2k0Var2.t;
            int i8 = i7 * 5;
            jw5.e(i8, i * 5, i5 * 5, y2k0Var.b, iArr);
            Object[] objArr = y2k0Var2.c;
            int i9 = y2k0Var2.i;
            System.arraycopy(y2k0Var.c, f, objArr, i9, i6);
            int i10 = y2k0Var2.v;
            iArr[i8 + 2] = i10;
            int i11 = i7 - i;
            int i12 = i7 + y;
            int g = i9 - y2k0Var2.g(i7, iArr);
            int i13 = y2k0Var2.m;
            int i14 = y2k0Var2.l;
            int length = objArr.length;
            boolean z6 = z5;
            int i15 = i13;
            int i16 = i7;
            while (i16 < i12) {
                if (i16 != i7) {
                    int i17 = (i16 * 5) + 2;
                    iArr[i17] = iArr[i17] + i11;
                }
                int[] iArr2 = iArr;
                int g2 = y2k0Var2.g(i16, iArr) + g;
                if (i15 < i16) {
                    i3 = i7;
                    i4 = 0;
                } else {
                    i3 = i7;
                    i4 = y2k0Var2.k;
                }
                iArr2[(i16 * 5) + 4] = y2k0.i(g2, i4, i14, length);
                if (i16 == i15) {
                    i15++;
                }
                i16++;
                i7 = i3;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            y2k0Var2.m = i15;
            int b = x2k0.b(y2k0Var.d, i, y2k0Var.t());
            int b2 = x2k0.b(y2k0Var.d, i5, y2k0Var.t());
            if (b < b2) {
                ArrayList<rgt> arrayList = y2k0Var.d;
                ArrayList arrayList2 = new ArrayList(b2 - b);
                for (int i18 = b; i18 < b2; i18++) {
                    rgt rgtVar = arrayList.get(i18);
                    rgtVar.a += i11;
                    arrayList2.add(rgtVar);
                }
                y2k0Var2.d.addAll(x2k0.b(y2k0Var2.d, y2k0Var2.t, y2k0Var2.t()), arrayList2);
                arrayList.subList(b, b2).clear();
                emptyList = arrayList2;
            } else {
                emptyList = EmptyList.b;
            }
            EmptyList emptyList3 = emptyList;
            if (!emptyList3.isEmpty()) {
                HashMap<rgt, wgt> hashMap = y2k0Var.e;
                HashMap<rgt, wgt> hashMap2 = y2k0Var2.e;
                if (hashMap != null && hashMap2 != null) {
                    int size = emptyList3.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        rgt rgtVar2 = (rgt) emptyList.get(i19);
                        wgt wgtVar = hashMap.get(rgtVar2);
                        if (wgtVar != null) {
                            hashMap.remove(rgtVar2);
                            hashMap2.put(rgtVar2, wgtVar);
                        }
                    }
                }
            }
            int i20 = y2k0Var2.v;
            wgt W = y2k0Var2.W(i10);
            if (W != null) {
                int i21 = i20 + 1;
                int i22 = y2k0Var2.t;
                int i23 = -1;
                while (i21 < i22) {
                    i23 = i21;
                    i21 = x2k0.a(i21, y2k0Var2.b) + i21;
                }
                ArrayList<Object> arrayList3 = W.a;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                    W.a = arrayList3;
                }
                if (i23 < 0 || (a0 = y2k0Var2.a0(i23)) == null) {
                    emptyList2 = emptyList;
                    i2 = 0;
                } else {
                    int size2 = arrayList3.size();
                    int i24 = 0;
                    EmptyList emptyList4 = emptyList;
                    while (i24 < size2) {
                        Object obj = arrayList3.get(i24);
                        if (epx.f(obj, a0)) {
                            emptyList2 = emptyList4;
                        } else {
                            emptyList2 = emptyList4;
                            if (!(obj instanceof wgt) || !((wgt) obj).f(a0)) {
                                i24++;
                                emptyList4 = emptyList2;
                            }
                        }
                        i2 = i24;
                        break;
                    }
                    emptyList2 = emptyList4;
                    i2 = -1;
                }
                arrayList3.add(i2, y2k0Var2.b(i22));
            } else {
                emptyList2 = emptyList;
            }
            int M = y2k0Var.M(i, y2k0Var.b);
            if (!z3) {
                z4 = false;
            } else if (z) {
                boolean z7 = M >= 0;
                if (z7) {
                    y2k0Var.X();
                    y2k0Var.a(M - y2k0Var.t);
                    y2k0Var.X();
                }
                y2k0Var.a(i - y2k0Var.t);
                boolean P = y2k0Var.P();
                if (z7) {
                    y2k0Var.U();
                    y2k0Var.j();
                    y2k0Var.U();
                    y2k0Var.j();
                }
                z4 = P;
            } else {
                boolean Q = y2k0Var.Q(i, y);
                y2k0Var.R(f, i6, i - 1);
                z4 = Q;
            }
            if (z4) {
                androidx.compose.runtime.b.a("Unexpectedly removed anchors");
            }
            int i25 = y2k0Var2.o;
            int i26 = iArr3[i8 + 1];
            y2k0Var2.o = i25 + ((1073741824 & i26) != 0 ? 1 : i26 & 67108863);
            if (z2) {
                y2k0Var2.t = i12;
                y2k0Var2.i = i9 + i6;
            }
            if (z6) {
                y2k0Var2.d0(i10);
            }
            return emptyList2;
        }
    }

    public y2k0(v2k0 v2k0Var) {
        this.a = v2k0Var;
        int[] iArr = v2k0Var.b;
        this.b = iArr;
        Object[] objArr = v2k0Var.d;
        this.c = objArr;
        this.d = v2k0Var.j;
        this.e = v2k0Var.k;
        this.f = v2k0Var.l;
        int i = v2k0Var.c;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = v2k0Var.e;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new s9x();
        this.q = new s9x();
        this.r = new s9x();
        this.u = i;
        this.v = -1;
    }

    public static void E(y2k0 y2k0Var) {
        int i = y2k0Var.v;
        int v = y2k0Var.v(i);
        int[] iArr = y2k0Var.b;
        int i2 = (v * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        y2k0Var.d0(y2k0Var.M(i, iArr));
    }

    public static int i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final boolean A(int i, int i2) {
        int o;
        int y;
        if (i2 == this.v) {
            o = this.u;
        } else {
            s9x s9xVar = this.p;
            if (i2 > s9xVar.a(0)) {
                y = y(i2);
            } else {
                int[] iArr = s9xVar.a;
                int min = Math.min(iArr.length, s9xVar.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    y = y(i2);
                } else {
                    o = (o() - this.h) - this.q.a[i3];
                }
            }
            o = y + i2;
        }
        return i > i2 && i < o;
    }

    public final void B(int i) {
        if (i > 0) {
            int i2 = this.t;
            G(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                jw5.e(0, 0, i3 * 5, iArr, iArr2);
                jw5.e((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int i9 = i(i5 > 0 ? f(i2 + i) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i10 = i3; i10 < i8; i10++) {
                this.b[(i10 * 5) + 4] = i9;
            }
            int i11 = this.m;
            if (i11 >= i3) {
                this.m = i11 + i;
            }
        }
    }

    public final void C(int i, int i2) {
        if (i > 0) {
            H(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean D(int i) {
        return (this.b[(v(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void F(v2k0 v2k0Var, int i) {
        if (this.n <= 0) {
            androidx.compose.runtime.b.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.c == 0) {
            int a2 = x2k0.a(i, v2k0Var.b);
            int i2 = v2k0Var.c;
            if (a2 == i2) {
                int[] iArr = this.b;
                Object[] objArr = this.c;
                ArrayList<rgt> arrayList = this.d;
                HashMap<rgt, wgt> hashMap = this.e;
                pg50<qg50> pg50Var = this.f;
                int[] iArr2 = v2k0Var.b;
                Object[] objArr2 = v2k0Var.d;
                int i3 = v2k0Var.e;
                HashMap<rgt, wgt> hashMap2 = v2k0Var.k;
                pg50<qg50> pg50Var2 = v2k0Var.l;
                this.b = iArr2;
                this.c = objArr2;
                this.d = v2k0Var.j;
                this.g = i2;
                this.h = (iArr2.length / 5) - i2;
                this.k = i3;
                this.l = objArr2.length - i3;
                this.m = i2;
                this.e = hashMap2;
                this.f = pg50Var2;
                v2k0Var.b = iArr;
                v2k0Var.c = 0;
                v2k0Var.d = objArr;
                v2k0Var.e = 0;
                v2k0Var.j = arrayList;
                v2k0Var.k = hashMap;
                v2k0Var.l = pg50Var;
                return;
            }
        }
        y2k0 f0 = v2k0Var.f0();
        try {
            a.a(f0, i, this, true, true, false);
            f0.e(true);
        } catch (Throwable th) {
            f0.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        xsna.jw5.e(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        xsna.jw5.e(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(int i) {
        rgt rgtVar;
        int i2;
        rgt rgtVar2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int o = o() - this.h;
                if (i6 < i) {
                    for (int b = x2k0.b(this.d, i6, o); b < this.d.size() && (i3 = (rgtVar2 = this.d.get(b)).a) < 0 && (i4 = i3 + o) < i; b++) {
                        rgtVar2.a = i4;
                    }
                } else {
                    for (int b2 = x2k0.b(this.d, i, o); b2 < this.d.size() && (i2 = (rgtVar = this.d.get(b2)).a) >= 0; b2++) {
                        rgtVar.a = -(o - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int o2 = o();
            if (i6 >= o2) {
                androidx.compose.runtime.b.a("Check failed");
            }
            while (i6 < o2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.b[i7];
                int t = i8 > -2 ? i8 : (t() + i8) - (-2);
                if (t >= i) {
                    t = -((t() - t) - (-2));
                }
                if (t != i8) {
                    this.b[i7] = t;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void H(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, t());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int v = v(min);
                int v2 = v(i5);
                int i7 = this.g;
                while (v < v2) {
                    int i8 = (v * 5) + 4;
                    int i9 = this.b[i8];
                    if (!(i9 >= 0)) {
                        androidx.compose.runtime.b.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    v++;
                    if (v == i7) {
                        v += this.h;
                    }
                }
            } else {
                int v3 = v(i5);
                int v4 = v(min);
                while (v3 < v4) {
                    int i10 = (v3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (!(i11 < 0)) {
                        androidx.compose.runtime.b.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    v3++;
                    if (v3 == this.g) {
                        v3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final List I(rgt rgtVar, y2k0 y2k0Var) {
        if (y2k0Var.n <= 0) {
            androidx.compose.runtime.b.a("Check failed");
        }
        if (this.n != 0) {
            androidx.compose.runtime.b.a("Check failed");
        }
        if (!rgtVar.a()) {
            androidx.compose.runtime.b.a("Check failed");
        }
        int c = c(rgtVar) + 1;
        int i = this.t;
        if (i > c || c >= this.u) {
            androidx.compose.runtime.b.a("Check failed");
        }
        int M = M(c, this.b);
        int y = y(c);
        int K = D(c) ? 1 : K(c);
        List a2 = a.a(this, c, y2k0Var, false, false, true);
        d0(M);
        boolean z = K > 0;
        while (M >= i) {
            int v = v(M);
            int[] iArr = this.b;
            int i2 = v * 5;
            iArr[i2 + 3] = x2k0.a(v, iArr) - y;
            if (z) {
                int[] iArr2 = this.b;
                int i3 = iArr2[i2 + 1];
                if ((1073741824 & i3) != 0) {
                    z = false;
                } else {
                    x2k0.d(v, (i3 & 67108863) - K, iArr2);
                }
            }
            M = M(M, this.b);
        }
        if (z) {
            if (this.o < K) {
                androidx.compose.runtime.b.a("Check failed");
            }
            this.o -= K;
        }
        return a2;
    }

    public final Object J(int i) {
        int v = v(i);
        int[] iArr = this.b;
        if ((iArr[(v * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(v, iArr))];
        }
        return null;
    }

    public final int K(int i) {
        return this.b[(v(i) * 5) + 1] & 67108863;
    }

    public final int L(int i) {
        return M(i, this.b);
    }

    public final int M(int i, int[] iArr) {
        int i2 = iArr[(v(i) * 5) + 2];
        return i2 > -2 ? i2 : (t() + i2) - (-2);
    }

    public final Object N(Object obj) {
        if (this.n > 0) {
            C(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.j) {
            androidx.compose.runtime.b.a("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void O() {
        int i;
        ng50 ng50Var = this.x;
        if (ng50Var != null) {
            while (ng50Var.b != 0) {
                int w = gcd0.w(ng50Var);
                int v = v(w);
                int i2 = w + 1;
                int y = y(w) + w;
                while (true) {
                    if (i2 >= y) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(v(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += y(i2);
                    }
                }
                int[] iArr = this.b;
                int i3 = (v * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int M = M(w, iArr);
                    if (M >= 0) {
                        gcd0.b(ng50Var, M);
                    }
                }
            }
        }
    }

    public final boolean P() {
        rgt a0;
        if (!(this.n == 0)) {
            androidx.compose.runtime.b.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int g = g(v(i), this.b);
        int T = T();
        wgt W = W(this.v);
        if (W != null && (a0 = a0(i)) != null) {
            W.h(a0);
        }
        ng50 ng50Var = this.x;
        if (ng50Var != null) {
            while (true) {
                int i3 = ng50Var.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    alk.E("IntList is empty.");
                    throw null;
                }
                if (ng50Var.a[0] < i) {
                    break;
                }
                gcd0.w(ng50Var);
            }
        }
        boolean Q = Q(i, this.t - i);
        R(g, this.i - g, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= T;
        return Q;
    }

    public final boolean Q(int i, int i2) {
        if (i2 > 0) {
            ArrayList<rgt> arrayList = this.d;
            G(i);
            if (!arrayList.isEmpty()) {
                HashMap<rgt, wgt> hashMap = this.e;
                int i3 = i + i2;
                int b = x2k0.b(this.d, i3, o() - this.h);
                if (b >= this.d.size()) {
                    b--;
                }
                int i4 = b + 1;
                int i5 = 0;
                while (b >= 0) {
                    rgt rgtVar = this.d.get(b);
                    int c = c(rgtVar);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        rgtVar.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                            hashMap.remove(rgtVar);
                        }
                        if (i5 == 0) {
                            i5 = b + 1;
                        }
                        i4 = b;
                    }
                    b--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(v(i8) * 5) + 1] & 67108864) != 0) {
                d0(i8);
            }
        }
        return r0;
    }

    public final void R(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            H(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object S(int i, int i2, Object obj) {
        int V = V(v(i), this.b);
        int g = g(v(i + 1), this.b);
        int i3 = V + i2;
        if (i3 < V || i3 >= g) {
            androidx.compose.runtime.b.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int h = h(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[h];
        objArr[h] = obj;
        return obj2;
    }

    public final int T() {
        int v = v(this.t);
        int a2 = x2k0.a(v, this.b) + this.t;
        this.t = a2;
        this.i = g(v(a2), this.b);
        int i = this.b[(v * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    public final void U() {
        int i = this.u;
        this.t = i;
        this.i = g(v(i), this.b);
    }

    public final int V(int i, int[] iArr) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int c = x2k0.c(i, iArr);
        return c < 0 ? (this.c.length - this.l) + c + 1 : c;
    }

    public final wgt W(int i) {
        rgt a0;
        HashMap<rgt, wgt> hashMap = this.e;
        if (hashMap == null || (a0 = a0(i)) == null) {
            return null;
        }
        return hashMap.get(a0);
    }

    public final void X() {
        if (this.n != 0) {
            androidx.compose.runtime.b.a("Key must be supplied when inserting");
        }
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Z(c0012a, c0012a, false, 0);
    }

    public final void Y(int i, Object obj) {
        Z(obj, a.C0011a.a, false, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(Object obj, Object obj2, boolean z, int i) {
        int i2;
        wgt W;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.c(this.o);
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (objArr == true) {
            int i4 = this.t;
            int g = g(v(i4), this.b);
            B(1);
            this.i = g;
            this.j = g;
            int v = v(i4);
            int i5 = obj != c0012a ? 1 : 0;
            int i6 = (z || obj2 == c0012a) ? 0 : 1;
            int i7 = i(g, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i4) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = v * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = (z ? 1 : 0) + i5 + i6;
            if (i10 > 0) {
                C(i10, i4);
                Object[] objArr2 = this.c;
                int i11 = this.i;
                if (z) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                if (i5 != 0) {
                    objArr2[i11] = obj;
                    i11++;
                }
                if (i6 != 0) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                this.i = i11;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0 && (W = W(i3)) != null) {
                wgt g2 = W.g();
                rgt b = b(i4);
                ArrayList<Object> arrayList = g2.a;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                g2.a = arrayList;
                arrayList.add(b);
            }
        } else {
            this.p.c(i3);
            this.q.c((o() - this.h) - this.u);
            int i12 = this.t;
            int v2 = v(i12);
            if (!epx.f(obj2, c0012a)) {
                if (z) {
                    e0(this.t, obj2);
                } else {
                    c0(obj2);
                }
            }
            this.i = V(v2, this.b);
            this.j = g(v(this.t + 1), this.b);
            int[] iArr2 = this.b;
            int i13 = v2 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.u = i2;
    }

    public final void a(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            androidx.compose.runtime.b.a("Cannot seek backwards");
        }
        if (!(this.n <= 0)) {
            gxc0.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 >= this.v && i2 <= this.u) {
            z = true;
        }
        if (!z) {
            androidx.compose.runtime.b.a("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int g = g(v(i2), this.b);
        this.i = g;
        this.j = g;
    }

    public final rgt a0(int i) {
        ArrayList<rgt> arrayList;
        int f;
        if (i < 0 || i >= t() || (f = x2k0.f((arrayList = this.d), i, t())) < 0) {
            return null;
        }
        return arrayList.get(f);
    }

    public final rgt b(int i) {
        ArrayList<rgt> arrayList = this.d;
        int f = x2k0.f(arrayList, i, t());
        if (f >= 0) {
            return arrayList.get(f);
        }
        if (i > this.g) {
            i = -(t() - i);
        }
        rgt rgtVar = new rgt(i);
        arrayList.add(-(f + 1), rgtVar);
        return rgtVar;
    }

    public final void b0(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            N(obj);
            return;
        }
        pg50<fh50<Object>> pg50Var = this.s;
        if (pg50Var == null) {
            pg50Var = new pg50<>((Object) null);
        }
        this.s = pg50Var;
        int i = this.v;
        fh50<Object> b = pg50Var.b(i);
        if (b == null) {
            b = new fh50<>((Object) null);
            pg50Var.k(i, b);
        }
        b.j(obj);
    }

    public final int c(rgt rgtVar) {
        int i = rgtVar.a;
        return i < 0 ? t() + i : i;
    }

    public final void c0(Object obj) {
        int v = v(this.t);
        int i = (v * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            androidx.compose.runtime.b.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(v, iArr))] = obj;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((o() - this.h) - this.u);
        }
    }

    public final void d0(int i) {
        if (i >= 0) {
            ng50 ng50Var = this.x;
            if (ng50Var == null) {
                ng50Var = new ng50();
                this.x = ng50Var;
            }
            gcd0.b(ng50Var, i);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            G(t());
            H(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            O();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList<rgt> arrayList = this.d;
        HashMap<rgt, wgt> hashMap = this.e;
        pg50<qg50> pg50Var = this.f;
        v2k0 v2k0Var = this.a;
        if (!v2k0Var.h) {
            gxc0.a("Unexpected writer close()");
        }
        v2k0Var.h = false;
        v2k0Var.b = iArr;
        v2k0Var.c = i2;
        v2k0Var.d = objArr;
        v2k0Var.e = i3;
        v2k0Var.j = arrayList;
        v2k0Var.k = hashMap;
        v2k0Var.l = pg50Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(int i, Object obj) {
        int v = v(i);
        int[] iArr = this.b;
        boolean z = v < iArr.length;
        if (!z) {
            androidx.compose.runtime.b.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[h(g(v, this.b))] = obj;
    }

    public final int f(int i) {
        return g(v(i), this.b);
    }

    public final int g(int i, int[] iArr) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int h(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void j() {
        fh50<Object> b;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int v = v(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = v * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        s9x s9xVar = this.r;
        if (z) {
            pg50<fh50<Object>> pg50Var = this.s;
            if (pg50Var != null && (b = pg50Var.b(i3)) != null) {
                Object[] objArr = b.a;
                int i8 = b.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    N(objArr[i9]);
                }
                pg50Var.i(i3);
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            x2k0.d(v, i4, iArr);
            int b2 = s9xVar.b();
            if (z2) {
                i4 = 1;
            }
            this.o = b2 + i4;
            int M = M(i3, this.b);
            this.v = M;
            int t = M < 0 ? t() : v(M + 1);
            int g = t >= 0 ? g(t, this.b) : 0;
            this.i = g;
            this.j = g;
            return;
        }
        if (i != i2) {
            androidx.compose.runtime.b.a("Expected to be at the end of a group");
        }
        int a2 = x2k0.a(v, this.b);
        int[] iArr2 = this.b;
        int i10 = iArr2[i7] & 67108863;
        iArr2[i6 + 3] = i5;
        x2k0.d(v, i4, iArr2);
        int b3 = this.p.b();
        this.u = (o() - this.h) - this.q.b();
        this.v = b3;
        int M2 = M(i3, this.b);
        int b4 = s9xVar.b();
        this.o = b4;
        if (M2 == b3) {
            this.o = b4 + (z2 ? 0 : i4 - i10);
            return;
        }
        int i11 = i5 - a2;
        int i12 = z2 ? 0 : i4 - i10;
        if (i11 != 0 || i12 != 0) {
            while (M2 != 0 && M2 != b3 && (i12 != 0 || i11 != 0)) {
                int v2 = v(M2);
                if (i11 != 0) {
                    this.b[(v2 * 5) + 3] = x2k0.a(v2, this.b) + i11;
                }
                if (i12 != 0) {
                    int[] iArr3 = this.b;
                    x2k0.d(v2, (iArr3[(v2 * 5) + 1] & 67108863) + i12, iArr3);
                }
                int[] iArr4 = this.b;
                if ((iArr4[(v2 * 5) + 1] & 1073741824) != 0) {
                    i12 = 0;
                }
                M2 = M(M2, iArr4);
            }
        }
        this.o += i12;
    }

    public final void k() {
        if (this.n <= 0) {
            gxc0.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                androidx.compose.runtime.b.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (o() - this.h) - this.q.b();
        }
    }

    public final void l(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            androidx.compose.runtime.b.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                androidx.compose.runtime.b.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            X();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void m(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((t() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(v(i3) * 5) + 2] = i;
            int a2 = x2k0.a(v(i3), this.b) + i3;
            m(i3, a2, i3 + 1);
            i3 = a2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0137, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i, wzs<? super Integer, Object, s3q0> wzsVar) {
        int i2;
        int i3;
        int i4;
        wzs<? super Integer, Object, s3q0> wzsVar2 = wzsVar;
        int M = M(i, this.b);
        int t = t();
        int y = y(i) + i;
        int i5 = i;
        qg50 qg50Var = null;
        ng50 ng50Var = null;
        loop0: while (i5 < y) {
            int f = f(i5);
            int i6 = i5 + 1;
            int f2 = f(i6);
            while (f < f2) {
                Object obj = this.c[h(f)];
                if (obj instanceof iuf0) {
                    iuf0 iuf0Var = (iuf0) obj;
                    zgt zgtVar = iuf0Var instanceof zgt ? (zgt) iuf0Var : null;
                    if (zgtVar == null) {
                        throw at.b("Inconsistent composition");
                    }
                    int i7 = zgtVar.b;
                    if (i7 >= 0) {
                        int y2 = y(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < y2 && i9 < i7) {
                            int i10 = M;
                            int v = v(i8);
                            int i11 = y;
                            i8 += x2k0.a(v, this.b);
                            if (i8 < y2 && (this.b[(v * 5) + 1] & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0) {
                                i9++;
                            }
                            M = i10;
                            y = i11;
                        }
                        i3 = M;
                        i4 = y;
                        if (qg50Var == null) {
                            qg50Var = p9x.a();
                        }
                        if (ng50Var == null) {
                            ng50Var = new ng50();
                        }
                        qg50Var.b(i8);
                        ng50Var.c(i8);
                        ng50Var.c(f);
                        f++;
                        M = i3;
                        y = i4;
                    }
                }
                i3 = M;
                i4 = y;
                wzsVar2.invoke(Integer.valueOf(f), obj);
                f++;
                M = i3;
                y = i4;
            }
            int i12 = M;
            int i13 = y;
            M = i6 < t ? M(i6, this.b) : -1;
            if (M != i5) {
                int i14 = i12;
                while (true) {
                    if (ng50Var != null && qg50Var != null && qg50Var.h(i5)) {
                        int i15 = ng50Var.b;
                        int i16 = i15 / 2;
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < i16) {
                            int i19 = i17 * 2;
                            int a2 = ng50Var.a(i19);
                            if (a2 == i5) {
                                int a3 = ng50Var.a(i19 + 1);
                                wzsVar2.invoke(Integer.valueOf(a3), this.c[h(a3)]);
                            } else if (i19 != i18) {
                                int i20 = i18 + 1;
                                ng50Var.g(i18, a2);
                                i18 += 2;
                                ng50Var.g(i20, ng50Var.a(i19 + 1));
                            } else {
                                i18 += 2;
                            }
                            i17++;
                            wzsVar2 = wzsVar;
                        }
                        if (i18 != i15) {
                            if (i18 < 0 || i18 > (i2 = ng50Var.b) || i15 < 0 || i15 > i2) {
                                break loop0;
                            }
                            if (i15 < i18) {
                                alk.B("The end index must be < start index");
                                throw null;
                            }
                            if (i15 != i18) {
                                if (i15 < i2) {
                                    int[] iArr = ng50Var.a;
                                    jw5.e(i18, i15, i2, iArr, iArr);
                                }
                                ng50Var.b -= i15 - i18;
                            }
                        }
                    }
                    if (i5 != i && i14 != M) {
                        i5 = i14;
                        i14 = M(i14, this.b);
                        wzsVar2 = wzsVar;
                    }
                }
            }
            wzsVar2 = wzsVar;
            i5 = i6;
            y = i13;
        }
    }

    public final int o() {
        return this.b.length / 5;
    }

    public final boolean p() {
        return this.f != null;
    }

    public final boolean q() {
        return this.e != null;
    }

    public final int r() {
        return this.t;
    }

    public final int s() {
        return this.v;
    }

    public final int t() {
        return o() - this.h;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + t() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final Object u(int i) {
        int v = v(i);
        int[] iArr = this.b;
        int i2 = (v * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return a.C0011a.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + g(v, iArr)];
    }

    public final int v(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int w(int i) {
        return this.b[v(i) * 5];
    }

    public final Object x(int i) {
        int v = v(i);
        int[] iArr = this.b;
        int i2 = v * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int y(int i) {
        return x2k0.a(v(i), this.b);
    }

    public final boolean z(rgt rgtVar, rgt rgtVar2) {
        int c = c(rgtVar);
        int a2 = x2k0.a(c, this.b) + c;
        int i = rgtVar2.a;
        return c <= i && i < a2;
    }
}
