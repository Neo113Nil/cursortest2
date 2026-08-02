package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public final class ows0 {
    public final sus0 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public wx40 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final m6w p;
    public final m6w q;
    public final m6w r;
    public wx40 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public vx40 x;

    public ows0(sus0 sus0Var) {
        this.a = sus0Var;
        int[] iArr = sus0Var.a;
        this.b = iArr;
        Object[] objArr = sus0Var.c;
        this.c = objArr;
        this.d = sus0Var.B;
        this.e = sus0Var.C;
        this.f = sus0Var.D;
        int i = sus0Var.b;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = sus0Var.w;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new m6w();
        this.q = new m6w();
        this.r = new m6w();
        this.u = sus0Var.b;
        this.v = -1;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void z(ows0 ows0Var) {
        int i = ows0Var.v;
        int r = ows0Var.r(i);
        int[] iArr = ows0Var.b;
        int i2 = (r * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & SelfTester_JCP.DECRYPT_CNT) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | SelfTester_JCP.DECRYPT_CNT;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        ows0Var.W(ows0Var.G(i, iArr));
    }

    public final void A(sus0 sus0Var, int i) {
        if (this.n <= 0) {
            lid.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.b == 0) {
            int a = uus0.a(i, sus0Var.a);
            int i2 = sus0Var.b;
            if (a == i2) {
                int[] iArr = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                wx40 wx40Var = this.f;
                int[] iArr2 = sus0Var.a;
                Object[] objArr2 = sus0Var.c;
                int i3 = sus0Var.w;
                HashMap hashMap2 = sus0Var.C;
                wx40 wx40Var2 = sus0Var.D;
                this.b = iArr2;
                this.c = objArr2;
                this.d = sus0Var.B;
                this.g = i2;
                this.h = (iArr2.length / 5) - i2;
                this.k = i3;
                this.l = objArr2.length - i3;
                this.m = i2;
                this.e = hashMap2;
                this.f = wx40Var2;
                sus0Var.a = iArr;
                sus0Var.b = 0;
                sus0Var.c = objArr;
                sus0Var.w = 0;
                sus0Var.B = arrayList;
                sus0Var.C = hashMap;
                sus0Var.D = wx40Var;
                return;
            }
        }
        ows0 k = sus0Var.k();
        try {
            qje.H(k, i, this, true, true, false);
            k.e(true);
        } catch (Throwable th) {
            k.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        defpackage.f73.d(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        defpackage.f73.d(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i) {
        yss yssVar;
        int i2;
        yss yssVar2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int o = o() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int b = uus0.b(i6, o, arrayList); b < this.d.size() && (i3 = (yssVar2 = (yss) this.d.get(b)).a) < 0 && (i4 = i3 + o) < i; b++) {
                        yssVar2.a = i4;
                    }
                } else {
                    for (int b2 = uus0.b(i, o, arrayList); b2 < this.d.size() && (i2 = (yssVar = (yss) this.d.get(b2)).a) >= 0; b2++) {
                        yssVar.a = -(o - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int o2 = o();
            if (i6 >= o2) {
                lid.a("Check failed");
            }
            while (i6 < o2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.b[i7];
                int p = i8 > -2 ? i8 : (p() + i8) - (-2);
                if (p >= i) {
                    p = -((p() - p) - (-2));
                }
                if (p != i8) {
                    this.b[i7] = p;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void C(int i, int i2) {
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
        int min = Math.min(i2 + 1, p());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int r = r(min);
                int r2 = r(i5);
                int i7 = this.g;
                while (r < r2) {
                    int i8 = (r * 5) + 4;
                    int i9 = this.b[i8];
                    if (!(i9 >= 0)) {
                        lid.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    r++;
                    if (r == i7) {
                        r += this.h;
                    }
                }
            } else {
                int r3 = r(i5);
                int r4 = r(min);
                while (r3 < r4) {
                    int i10 = (r3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (!(i11 < 0)) {
                        lid.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    r3++;
                    if (r3 == this.g) {
                        r3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final List D(yss yssVar, ows0 ows0Var) {
        if (ows0Var.n <= 0) {
            lid.a("Check failed");
        }
        if (this.n != 0) {
            lid.a("Check failed");
        }
        if (!yssVar.a()) {
            lid.a("Check failed");
        }
        int c = c(yssVar) + 1;
        int i = this.t;
        if (i > c || c >= this.u) {
            lid.a("Check failed");
        }
        int G = G(c, this.b);
        int u = u(c);
        int F = y(c) ? 1 : F(c);
        List H = qje.H(this, c, ows0Var, false, false, true);
        W(G);
        boolean z = F > 0;
        while (G >= i) {
            int r = r(G);
            int[] iArr = this.b;
            int i2 = r * 5;
            iArr[i2 + 3] = uus0.a(r, iArr) - u;
            if (z) {
                int[] iArr2 = this.b;
                int i3 = iArr2[i2 + 1];
                if ((1073741824 & i3) != 0) {
                    z = false;
                } else {
                    uus0.e(iArr2, r, (i3 & 67108863) - F);
                }
            }
            G = G(G, this.b);
        }
        if (z) {
            if (this.o < F) {
                lid.a("Check failed");
            }
            this.o -= F;
        }
        return H;
    }

    public final Object E(int i) {
        int r = r(i);
        int[] iArr = this.b;
        if ((iArr[(r * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(r, iArr))];
        }
        return null;
    }

    public final int F(int i) {
        return this.b[(r(i) * 5) + 1] & 67108863;
    }

    public final int G(int i, int[] iArr) {
        int i2 = iArr[(r(i) * 5) + 2];
        return i2 > -2 ? i2 : (p() + i2) - (-2);
    }

    public final Object H(Object obj) {
        if (this.n > 0) {
            x(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.j) {
            lid.a("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void I() {
        int i;
        vx40 vx40Var = this.x;
        if (vx40Var != null) {
            while (vx40Var.b != 0) {
                int B = gwk0.B(vx40Var);
                int r = r(B);
                int i2 = B + 1;
                int u = u(B) + B;
                while (true) {
                    if (i2 >= u) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(r(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += u(i2);
                    }
                }
                int[] iArr = this.b;
                int i3 = (r * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int G = G(B, iArr);
                    if (G >= 0) {
                        gwk0.e(vx40Var, G);
                    }
                }
            }
        }
    }

    public final boolean J() {
        if (this.n != 0) {
            lid.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int g = g(r(i), this.b);
        int N = N();
        Q(this.v);
        vx40 vx40Var = this.x;
        if (vx40Var != null) {
            while (true) {
                int i3 = vx40Var.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    xva1.e("IntList is empty.");
                    throw null;
                }
                if (vx40Var.a[0] < i) {
                    break;
                }
                gwk0.B(vx40Var);
            }
        }
        boolean K = K(i, this.t - i);
        L(g, this.i - g, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= N;
        return K;
    }

    public final boolean K(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            B(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int b = uus0.b(i3, o() - this.h, this.d);
                if (b >= this.d.size()) {
                    b--;
                }
                int i4 = b + 1;
                int i5 = 0;
                while (b >= 0) {
                    yss yssVar = (yss) this.d.get(b);
                    int c = c(yssVar);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        yssVar.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
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
            if (i8 >= 0 && (this.b[(r(i8) * 5) + 1] & SelfTester_JCP.DECRYPT_CBC) != 0) {
                W(i8);
            }
        }
        return r0;
    }

    public final void L(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            C(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object M(int i, int i2, Object obj) {
        int P = P(r(i), this.b);
        int g = g(r(i + 1), this.b);
        int i3 = P + i2;
        if (i3 < P || i3 >= g) {
            lid.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int h = h(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[h];
        objArr[h] = obj;
        return obj2;
    }

    public final int N() {
        int r = r(this.t);
        int a = uus0.a(r, this.b) + this.t;
        this.t = a;
        this.i = g(r(a), this.b);
        int i = this.b[(r * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    public final void O() {
        int i = this.u;
        this.t = i;
        this.i = g(r(i), this.b);
    }

    public final int P(int i, int[] iArr) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int d = uus0.d(i, iArr);
        return d < 0 ? (this.c.length - this.l) + d + 1 : d;
    }

    public final dts Q(int i) {
        yss T;
        HashMap hashMap = this.e;
        if (hashMap == null || (T = T(i)) == null) {
            return null;
        }
        return (dts) hashMap.get(T);
    }

    public final void R() {
        if (this.n != 0) {
            lid.a("Key must be supplied when inserting");
        }
        o430 o430Var = did.a;
        S(o430Var, o430Var, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(Object obj, Object obj2, boolean z, int i) {
        int i2;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.c(this.o);
        o430 o430Var = did.a;
        if (objArr == true) {
            int i4 = this.t;
            int g = g(r(i4), this.b);
            w(1);
            this.i = g;
            this.j = g;
            int r = r(i4);
            int i5 = obj != o430Var ? 1 : 0;
            int i6 = (z || obj2 == o430Var) ? 0 : 1;
            int i7 = i(g, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i4) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = r * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = (z ? 1 : 0) + i5 + i6;
            if (i10 > 0) {
                x(i10, i4);
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
            if (i3 >= 0) {
                Q(i3);
            }
        } else {
            this.p.c(i3);
            this.q.c((o() - this.h) - this.u);
            int i12 = this.t;
            int r2 = r(i12);
            if (!jl40.l(obj2, o430Var)) {
                if (z) {
                    X(this.t, obj2);
                } else {
                    V(obj2);
                }
            }
            this.i = P(r2, this.b);
            this.j = g(r(this.t + 1), this.b);
            int[] iArr2 = this.b;
            int i13 = r2 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.u = i2;
    }

    public final yss T(int i) {
        ArrayList arrayList;
        int g;
        if (i < 0 || i >= p() || (g = uus0.g(i, p(), (arrayList = this.d))) < 0) {
            return null;
        }
        return (yss) arrayList.get(g);
    }

    public final void U(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            H(obj);
            return;
        }
        wx40 wx40Var = this.s;
        if (wx40Var == null) {
            wx40Var = new wx40((Object) null);
        }
        this.s = wx40Var;
        int i = this.v;
        Object b = wx40Var.b(i);
        if (b == null) {
            b = new xy40((Object) null);
            wx40Var.i(i, b);
        }
        ((xy40) b).g(obj);
    }

    public final void V(Object obj) {
        int r = r(this.t);
        int i = (r * 5) + 1;
        if ((this.b[i] & SelfTester_JCP.IMITA) == 0) {
            lid.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(r, iArr))] = obj;
    }

    public final void W(int i) {
        if (i >= 0) {
            vx40 vx40Var = this.x;
            if (vx40Var == null) {
                vx40Var = new vx40((Object) null);
                this.x = vx40Var;
            }
            gwk0.e(vx40Var, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(int i, Object obj) {
        int r = r(i);
        int[] iArr = this.b;
        boolean z = r < iArr.length;
        if (!z) {
            lid.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[h(g(r, this.b))] = obj;
    }

    public final void a(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            lid.a("Cannot seek backwards");
        }
        if (!(this.n <= 0)) {
            khe0.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 >= this.v && i2 <= this.u) {
            z = true;
        }
        if (!z) {
            lid.a("Cannot seek outside the current group (" + this.v + LicenseUtility.SEPARATOR + this.u + ')');
        }
        this.t = i2;
        int g = g(r(i2), this.b);
        this.i = g;
        this.j = g;
    }

    public final yss b(int i) {
        ArrayList arrayList = this.d;
        int g = uus0.g(i, p(), arrayList);
        if (g >= 0) {
            return (yss) arrayList.get(g);
        }
        if (i > this.g) {
            i = -(p() - i);
        }
        yss yssVar = new yss(i);
        arrayList.add(-(g + 1), yssVar);
        return yssVar;
    }

    public final int c(yss yssVar) {
        int i = yssVar.a;
        return i < 0 ? p() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((o() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            B(p());
            C(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            I();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        wx40 wx40Var = this.f;
        sus0 sus0Var = this.a;
        if (!sus0Var.z) {
            khe0.a("Unexpected writer close()");
        }
        sus0Var.z = false;
        sus0Var.a = iArr;
        sus0Var.b = i2;
        sus0Var.c = objArr;
        sus0Var.w = i3;
        sus0Var.B = arrayList;
        sus0Var.C = hashMap;
        sus0Var.D = wx40Var;
    }

    public final int f(int i) {
        return g(r(i), this.b);
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
        xy40 xy40Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int r = r(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = r * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        m6w m6wVar = this.r;
        if (z) {
            wx40 wx40Var = this.s;
            if (wx40Var != null && (xy40Var = (xy40) wx40Var.b(i3)) != null) {
                Object[] objArr = xy40Var.a;
                int i8 = xy40Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    H(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            uus0.e(iArr, r, i4);
            int b = m6wVar.b();
            if (z2) {
                i4 = 1;
            }
            this.o = b + i4;
            int G = G(i3, this.b);
            this.v = G;
            int p = G < 0 ? p() : r(G + 1);
            int g = p >= 0 ? g(p, this.b) : 0;
            this.i = g;
            this.j = g;
            return;
        }
        if (i != i2) {
            lid.a("Expected to be at the end of a group");
        }
        int a = uus0.a(r, this.b);
        int[] iArr2 = this.b;
        int i10 = iArr2[i7] & 67108863;
        iArr2[i6 + 3] = i5;
        uus0.e(iArr2, r, i4);
        int b2 = this.p.b();
        this.u = (o() - this.h) - this.q.b();
        this.v = b2;
        int G2 = G(i3, this.b);
        int b3 = m6wVar.b();
        this.o = b3;
        if (G2 == b2) {
            this.o = b3 + (z2 ? 0 : i4 - i10);
            return;
        }
        int i11 = i5 - a;
        int i12 = z2 ? 0 : i4 - i10;
        if (i11 != 0 || i12 != 0) {
            while (G2 != 0 && G2 != b2 && (i12 != 0 || i11 != 0)) {
                int r2 = r(G2);
                if (i11 != 0) {
                    this.b[(r2 * 5) + 3] = uus0.a(r2, this.b) + i11;
                }
                if (i12 != 0) {
                    int[] iArr3 = this.b;
                    uus0.e(iArr3, r2, (iArr3[(r2 * 5) + 1] & 67108863) + i12);
                }
                int[] iArr4 = this.b;
                if ((iArr4[(r2 * 5) + 1] & 1073741824) != 0) {
                    i12 = 0;
                }
                G2 = G(G2, iArr4);
            }
        }
        this.o += i12;
    }

    public final void k() {
        if (this.n <= 0) {
            khe0.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                lid.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (o() - this.h) - this.q.b();
        }
    }

    public final void l(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            lid.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                lid.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            R();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void m(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((p() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(r(i3) * 5) + 2] = i;
            int a = uus0.a(r(i3), this.b) + i3;
            m(i3, a, i3 + 1);
            i3 = a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x013b, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(wls wlsVar, int i) {
        int i2;
        int i3;
        int i4;
        Object obj;
        wls wlsVar2 = wlsVar;
        int G = G(i, this.b);
        int p = p();
        int u = u(i) + i;
        int i5 = i;
        xx40 xx40Var = null;
        vx40 vx40Var = null;
        loop0: while (i5 < u) {
            int f = f(i5);
            int i6 = i5 + 1;
            int f2 = f(i6);
            while (f < f2) {
                Object obj2 = this.c[h(f)];
                if (obj2 instanceof gts) {
                    gts gtsVar = (gts) obj2;
                    if (!(gtsVar instanceof gts)) {
                        gtsVar = null;
                    }
                    if (gtsVar == null) {
                        lid.b("Inconsistent composition");
                        ny61.A();
                        return;
                    }
                    int i7 = gtsVar.b;
                    if (i7 >= 0) {
                        int u2 = u(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < u2 && i9 < i7) {
                            int i10 = G;
                            int r = r(i8);
                            int i11 = u;
                            i8 += uus0.a(r, this.b);
                            if (i8 < u2 && (this.b[(r * 5) + 1] & 536870912) == 0) {
                                i9++;
                            }
                            G = i10;
                            u = i11;
                        }
                        i3 = G;
                        i4 = u;
                        if (xx40Var == null) {
                            int[] iArr = i6w.a;
                            obj = null;
                            xx40Var = new xx40((Object) null);
                        } else {
                            obj = null;
                        }
                        if (vx40Var == null) {
                            vx40Var = new vx40(obj);
                        }
                        xx40Var.a(i8);
                        vx40Var.c(i8);
                        vx40Var.c(f);
                        f++;
                        G = i3;
                        u = i4;
                    }
                }
                i3 = G;
                i4 = u;
                wlsVar2.invoke(Integer.valueOf(f), obj2);
                f++;
                G = i3;
                u = i4;
            }
            int i12 = G;
            int i13 = u;
            G = i6 < p ? G(i6, this.b) : -1;
            if (G != i5) {
                int i14 = i12;
                while (true) {
                    if (vx40Var != null && xx40Var != null && xx40Var.g(i5)) {
                        int i15 = vx40Var.b;
                        int i16 = i15 / 2;
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < i16) {
                            int i19 = i17 * 2;
                            int a = vx40Var.a(i19);
                            if (a == i5) {
                                int a2 = vx40Var.a(i19 + 1);
                                wlsVar2.invoke(Integer.valueOf(a2), this.c[h(a2)]);
                            } else if (i19 != i18) {
                                int i20 = i18 + 1;
                                vx40Var.f(i18, a);
                                i18 += 2;
                                vx40Var.f(i20, vx40Var.a(i19 + 1));
                            } else {
                                i18 += 2;
                            }
                            i17++;
                            wlsVar2 = wlsVar;
                        }
                        if (i18 != i15) {
                            if (i18 < 0 || i18 > (i2 = vx40Var.b) || i15 < 0 || i15 > i2) {
                                break loop0;
                            }
                            if (i15 < i18) {
                                xva1.b("The end index must be < start index");
                                throw null;
                            }
                            if (i15 != i18) {
                                if (i15 < i2) {
                                    int[] iArr2 = vx40Var.a;
                                    f73.d(i18, i15, i2, iArr2, iArr2);
                                }
                                vx40Var.b -= i15 - i18;
                            }
                        }
                    }
                    if (i5 != i && i14 != G) {
                        i5 = i14;
                        i14 = G(i14, this.b);
                        wlsVar2 = wlsVar;
                    }
                }
            }
            wlsVar2 = wlsVar;
            i5 = i6;
            u = i13;
        }
    }

    public final int o() {
        return this.b.length / 5;
    }

    public final int p() {
        return o() - this.h;
    }

    public final Object q(int i) {
        int r = r(i);
        int[] iArr = this.b;
        int i2 = (r * 5) + 1;
        if ((iArr[i2] & SelfTester_JCP.IMITA) == 0) {
            return did.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + g(r, iArr)];
    }

    public final int r(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int s(int i) {
        return this.b[r(i) * 5];
    }

    public final Object t(int i) {
        int r = r(i);
        int[] iArr = this.b;
        if ((iArr[(r * 5) + 1] & 536870912) != 0) {
            return this.c[uus0.c(r, iArr)];
        }
        return null;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + p() + " gap=" + this.g + LicenseUtility.SEPARATOR + (this.g + this.h) + ')';
    }

    public final int u(int i) {
        return uus0.a(r(i), this.b);
    }

    public final boolean v(int i, int i2) {
        int o;
        int u;
        if (i2 == this.v) {
            o = this.u;
        } else {
            m6w m6wVar = this.p;
            if (i2 > m6wVar.a(0)) {
                u = u(i2);
            } else {
                int[] iArr = m6wVar.a;
                int min = Math.min(iArr.length, m6wVar.b);
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
                    u = u(i2);
                } else {
                    o = (o() - this.h) - this.q.a[i3];
                }
            }
            o = u + i2;
        }
        return i > i2 && i < o;
    }

    public final void w(int i) {
        if (i > 0) {
            int i2 = this.t;
            B(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                f73.d(0, 0, i3 * 5, iArr, iArr2);
                f73.d((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
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

    public final void x(int i, int i2) {
        if (i > 0) {
            C(this.i, i2);
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

    public final boolean y(int i) {
        return (this.b[(r(i) * 5) + 1] & 1073741824) != 0;
    }
}
