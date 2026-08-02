package yads;

import android.util.SparseArray;
import java.io.EOFException;
import xsna.k2s0;

/* loaded from: classes10.dex */
public final class nt2 implements q83 {
    public nx0 A;
    public nx0 B;
    public boolean C;
    public boolean D;
    public long E;
    public final jt2 a;
    public final tk0 d;
    public final pk0 e;
    public mt2 f;
    public nx0 g;
    public nk0 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final kt2 b = new kt2();
    public int i = 1000;
    public int[] j = new int[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public p83[] o = new p83[1000];
    public final j33 c = new j33(new k2s0(7));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;

    public nt2(qe qeVar, tk0 tk0Var, pk0 pk0Var) {
        this.d = tk0Var;
        this.e = pk0Var;
        this.a = new jt2(qeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0076, code lost:
    
        if (((yads.lt2) r7.valueAt(r7.size() - 1)).a.equals(r6.B) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(long j, int i, long j2, int i2, p83 p83Var) {
        try {
            int i3 = this.p;
            if (i3 > 0) {
                if (this.k[e(i3 - 1)] + this.l[r0] > j2) {
                    throw new IllegalArgumentException();
                }
            }
            this.w = (536870912 & i) != 0;
            this.v = Math.max(this.v, j);
            int e = e(this.p);
            this.n[e] = j;
            this.k[e] = j2;
            this.l[e] = i2;
            this.m[e] = i;
            this.o[e] = p83Var;
            this.j[e] = 0;
            if (this.c.b.size() != 0) {
                SparseArray sparseArray = this.c.b;
            }
            tk0 tk0Var = this.d;
            sk0 a = tk0Var != null ? tk0Var.a(this.e, this.B) : sk0.a;
            j33 j33Var = this.c;
            int i4 = this.q + this.p;
            nx0 nx0Var = this.B;
            nx0Var.getClass();
            lt2 lt2Var = new lt2(nx0Var, a);
            if (j33Var.a == -1) {
                if (j33Var.b.size() != 0) {
                    throw new IllegalStateException();
                }
                j33Var.a = 0;
            }
            if (j33Var.b.size() > 0) {
                SparseArray sparseArray2 = j33Var.b;
                int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                if (i4 < keyAt) {
                    throw new IllegalArgumentException();
                }
                if (keyAt == i4) {
                    iz izVar = j33Var.c;
                    SparseArray sparseArray3 = j33Var.b;
                    izVar.accept(sparseArray3.valueAt(sparseArray3.size() - 1));
                }
            }
            j33Var.b.append(i4, lt2Var);
            int i5 = this.p + 1;
            this.p = i5;
            int i6 = this.i;
            if (i5 == i6) {
                int i7 = i6 + 1000;
                int[] iArr = new int[i7];
                long[] jArr = new long[i7];
                long[] jArr2 = new long[i7];
                int[] iArr2 = new int[i7];
                int[] iArr3 = new int[i7];
                p83[] p83VarArr = new p83[i7];
                int i8 = this.r;
                int i9 = i6 - i8;
                System.arraycopy(this.k, i8, jArr, 0, i9);
                System.arraycopy(this.n, this.r, jArr2, 0, i9);
                System.arraycopy(this.m, this.r, iArr2, 0, i9);
                System.arraycopy(this.l, this.r, iArr3, 0, i9);
                System.arraycopy(this.o, this.r, p83VarArr, 0, i9);
                System.arraycopy(this.j, this.r, iArr, 0, i9);
                int i10 = this.r;
                System.arraycopy(this.k, 0, jArr, i9, i10);
                System.arraycopy(this.n, 0, jArr2, i9, i10);
                System.arraycopy(this.m, 0, iArr2, i9, i10);
                System.arraycopy(this.l, 0, iArr3, i9, i10);
                System.arraycopy(this.o, 0, p83VarArr, i9, i10);
                System.arraycopy(this.j, 0, iArr, i9, i10);
                this.k = jArr;
                this.n = jArr2;
                this.m = iArr2;
                this.l = iArr3;
                this.o = p83VarArr;
                this.j = iArr;
                this.r = 0;
                this.i = i7;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long b(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        if (i4 < 0 || i4 > i3 - this.s) {
            throw new IllegalArgumentException();
        }
        int i5 = i3 - i4;
        this.p = i5;
        this.v = Math.max(this.u, d(i5));
        this.w = i4 == 0 && this.w;
        this.c.a(i);
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        return this.k[e(i6 - 1)] + this.l[r7];
    }

    public final void c(int i) {
        jt2 jt2Var = this.a;
        long b = b(i);
        if (b > jt2Var.g) {
            throw new IllegalArgumentException();
        }
        jt2Var.g = b;
        if (b != 0) {
            it2 it2Var = jt2Var.d;
            if (b != it2Var.a) {
                while (jt2Var.g > it2Var.b) {
                    it2Var = it2Var.d;
                }
                it2 it2Var2 = it2Var.d;
                it2Var2.getClass();
                jt2Var.a(it2Var2);
                it2 it2Var3 = new it2(jt2Var.b, it2Var.b);
                it2Var.d = it2Var3;
                if (jt2Var.g == it2Var.b) {
                    it2Var = it2Var3;
                }
                jt2Var.f = it2Var;
                if (jt2Var.e == it2Var2) {
                    jt2Var.e = it2Var3;
                    return;
                }
                return;
            }
        }
        jt2Var.a(jt2Var.d);
        it2 it2Var4 = new it2(jt2Var.b, jt2Var.g);
        jt2Var.d = it2Var4;
        jt2Var.e = it2Var4;
        jt2Var.f = it2Var4;
    }

    public final long d(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int e = e(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[e]);
            if ((this.m[e] & 1) != 0) {
                return j;
            }
            e--;
            if (e == -1) {
                e = this.i - 1;
            }
        }
        return j;
    }

    public final int e(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized void e() {
        this.s = 0;
        jt2 jt2Var = this.a;
        jt2Var.e = jt2Var.d;
    }

    public final void d() {
        nk0 nk0Var = this.h;
        if (nk0Var != null) {
            nk0Var.a(this.e);
            this.h = null;
            this.g = null;
        }
    }

    public final synchronized long b() {
        return this.v;
    }

    public final void b(boolean z) {
        jt2 jt2Var = this.a;
        jt2Var.a(jt2Var.d);
        jt2Var.d.a(jt2Var.b, 0L);
        it2 it2Var = jt2Var.d;
        jt2Var.e = it2Var;
        jt2Var.f = it2Var;
        jt2Var.g = 0L;
        ((ib0) jt2Var.a).c();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        j33 j33Var = this.c;
        for (int i = 0; i < j33Var.b.size(); i++) {
            j33Var.c.accept(j33Var.b.valueAt(i));
        }
        j33Var.a = -1;
        j33Var.b.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
        }
    }

    public final synchronized nx0 c() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean b(long j, boolean z) {
        try {
            try {
                e();
                int e = e(this.s);
                int i = this.s;
                int i2 = this.p;
                if (i != i2 && j >= this.n[e]) {
                    if (j <= this.v || z) {
                        int a = a(e, i2 - i, j, true);
                        if (a == -1) {
                            return false;
                        }
                        this.t = j;
                        this.s += a;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final long a(int i) {
        this.u = Math.max(this.u, d(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        if (i5 < 0) {
            this.s = 0;
        }
        this.c.b(i2);
        if (this.p == 0) {
            int i6 = this.r;
            if (i6 == 0) {
                i6 = this.i;
            }
            return this.k[i6 - 1] + this.l[r5];
        }
        return this.k[this.r];
    }

    public final void a(long j, boolean z, boolean z2) {
        Throwable th;
        jt2 jt2Var = this.a;
        synchronized (this) {
            try {
                int i = this.p;
                long j2 = -1;
                if (i != 0) {
                    long[] jArr = this.n;
                    int i2 = this.r;
                    if (j >= jArr[i2]) {
                        if (z2) {
                            try {
                                int i3 = this.s;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        try {
                            int a = a(i2, i, j, z);
                            if (a != -1) {
                                j2 = a(a);
                            }
                            jt2Var.a(j2);
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    }
                }
                jt2Var.a(j2);
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void a() {
        long a;
        jt2 jt2Var = this.a;
        synchronized (this) {
            int i = this.p;
            a = i == 0 ? -1L : a(i);
        }
        jt2Var.a(a);
    }

    public final int a(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    @Override // yads.q83
    public final void a(nx0 nx0Var) {
        nx0 nx0Var2;
        if (this.E == 0 || nx0Var.q == Long.MAX_VALUE) {
            nx0Var2 = nx0Var;
        } else {
            mx0 mx0Var = new mx0(nx0Var);
            mx0Var.o = nx0Var.q + this.E;
            nx0Var2 = new nx0(mx0Var);
        }
        boolean z = false;
        this.z = false;
        this.A = nx0Var;
        synchronized (this) {
            try {
                this.y = false;
                if (!mc3.a(nx0Var2, this.B)) {
                    if (this.c.b.size() != 0) {
                        SparseArray sparseArray = this.c.b;
                        if (((lt2) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(nx0Var2)) {
                            SparseArray sparseArray2 = this.c.b;
                            this.B = ((lt2) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            nx0 nx0Var3 = this.B;
                            this.C = iu1.a(nx0Var3.m, nx0Var3.j);
                            this.D = false;
                            z = true;
                        }
                    }
                    this.B = nx0Var2;
                    nx0 nx0Var32 = this.B;
                    this.C = iu1.a(nx0Var32.m, nx0Var32.j);
                    this.D = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mt2 mt2Var = this.f;
        if (mt2Var == null || !z) {
            return;
        }
        fl2 fl2Var = (fl2) mt2Var;
        fl2Var.q.post(fl2Var.o);
    }

    public final synchronized int a(long j, boolean z) {
        try {
            try {
                int e = e(this.s);
                int i = this.s;
                int i2 = this.p;
                if (i == i2 || j < this.n[e]) {
                    return 0;
                }
                if (j > this.v && z) {
                    return i2 - i;
                }
                int a = a(e, i2 - i, j, true);
                if (a == -1) {
                    return 0;
                }
                return a;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized boolean a(boolean z) {
        nx0 nx0Var;
        int i = this.s;
        boolean z2 = false;
        if (i != this.p) {
            if (((lt2) this.c.c(this.q + i)).a != this.g) {
                return true;
            }
            int e = e(this.s);
            nk0 nk0Var = this.h;
            if (nk0Var == null || nk0Var.getState() == 4 || ((this.m[e] & 1073741824) == 0 && this.h.a())) {
                z2 = true;
            }
            return z2;
        }
        if (z || this.w || ((nx0Var = this.B) != null && nx0Var != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final void a(nx0 nx0Var, ox0 ox0Var) {
        nx0 nx0Var2;
        nx0 nx0Var3 = this.g;
        boolean z = nx0Var3 == null;
        lk0 lk0Var = z ? null : nx0Var3.p;
        this.g = nx0Var;
        lk0 lk0Var2 = nx0Var.p;
        tk0 tk0Var = this.d;
        if (tk0Var != null) {
            int a = tk0Var.a(nx0Var);
            mx0 mx0Var = new mx0(nx0Var);
            mx0Var.D = a;
            nx0Var2 = new nx0(mx0Var);
        } else {
            nx0Var2 = nx0Var;
        }
        ox0Var.b = nx0Var2;
        ox0Var.a = this.h;
        if (this.d == null) {
            return;
        }
        if (z || !mc3.a(lk0Var, lk0Var2)) {
            nk0 nk0Var = this.h;
            nk0 b = this.d.b(this.e, nx0Var);
            this.h = b;
            ox0Var.a = b;
            if (nk0Var != null) {
                nk0Var.a(this.e);
            }
        }
    }

    public final int a(ox0 ox0Var, sa0 sa0Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        kt2 kt2Var = this.b;
        synchronized (this) {
            try {
                sa0Var.e = false;
                int i3 = this.s;
                i2 = -5;
                if (i3 != this.p) {
                    nx0 nx0Var = ((lt2) this.c.c(this.q + i3)).a;
                    if (!z2 && nx0Var == this.g) {
                        int e = e(this.s);
                        nk0 nk0Var = this.h;
                        if (nk0Var != null && nk0Var.getState() != 4 && ((this.m[e] & 1073741824) != 0 || !this.h.a())) {
                            sa0Var.e = true;
                            i2 = -3;
                        }
                        int i4 = this.m[e];
                        sa0Var.b = i4;
                        long j = this.n[e];
                        sa0Var.f = j;
                        if (j < this.t) {
                            sa0Var.b = i4 | Integer.MIN_VALUE;
                        }
                        kt2Var.a = this.l[e];
                        kt2Var.b = this.k[e];
                        kt2Var.c = this.o[e];
                        i2 = -4;
                    }
                    a(nx0Var, ox0Var);
                } else {
                    if (!z && !this.w) {
                        nx0 nx0Var2 = this.B;
                        if (nx0Var2 == null || (!z2 && nx0Var2 == this.g)) {
                            i2 = -3;
                        } else {
                            a(nx0Var2, ox0Var);
                        }
                    }
                    sa0Var.b = 4;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !sa0Var.b(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    jt2 jt2Var = this.a;
                    jt2.a(jt2Var.e, sa0Var, this.b, jt2Var.c);
                } else {
                    jt2 jt2Var2 = this.a;
                    jt2Var2.e = jt2.a(jt2Var2.e, sa0Var, this.b, jt2Var2.c);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    @Override // yads.q83
    public final int a(l30 l30Var, int i, boolean z) {
        jt2 jt2Var = this.a;
        it2 it2Var = jt2Var.f;
        if (it2Var.c == null) {
            pe a = ((ib0) jt2Var.a).a();
            it2 it2Var2 = new it2(jt2Var.b, jt2Var.f.b);
            it2Var.c = a;
            it2Var.d = it2Var2;
        }
        int min = Math.min(i, (int) (jt2Var.f.b - jt2Var.g));
        it2 it2Var3 = jt2Var.f;
        pe peVar = it2Var3.c;
        int read = l30Var.read(peVar.a, ((int) (jt2Var.g - it2Var3.a)) + peVar.b, min);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = jt2Var.g + read;
        jt2Var.g = j;
        it2 it2Var4 = jt2Var.f;
        if (j == it2Var4.b) {
            jt2Var.f = it2Var4.d;
        }
        return read;
    }

    @Override // yads.q83
    public final void a(int i, kc2 kc2Var) {
        jt2 jt2Var = this.a;
        while (i > 0) {
            it2 it2Var = jt2Var.f;
            if (it2Var.c == null) {
                pe a = ((ib0) jt2Var.a).a();
                it2 it2Var2 = new it2(jt2Var.b, jt2Var.f.b);
                it2Var.c = a;
                it2Var.d = it2Var2;
            }
            int min = Math.min(i, (int) (jt2Var.f.b - jt2Var.g));
            it2 it2Var3 = jt2Var.f;
            pe peVar = it2Var3.c;
            kc2Var.a(peVar.a, ((int) (jt2Var.g - it2Var3.a)) + peVar.b, min);
            i -= min;
            long j = jt2Var.g + min;
            jt2Var.g = j;
            it2 it2Var4 = jt2Var.f;
            if (j == it2Var4.b) {
                jt2Var.f = it2Var4.d;
            }
        }
        jt2Var.getClass();
    }

    @Override // yads.q83
    public final void a(long j, int i, int i2, int i3, p83 p83Var) {
        int i4;
        if (this.z) {
            nx0 nx0Var = this.A;
            if (nx0Var != null) {
                a(nx0Var);
            } else {
                throw new IllegalStateException();
            }
        }
        int i5 = i & 1;
        boolean z = i5 != 0;
        if (this.x) {
            if (!z) {
                return;
            } else {
                this.x = false;
            }
        }
        long j2 = this.E + j;
        if (this.C) {
            if (j2 < this.t) {
                return;
            }
            if (i5 == 0) {
                if (!this.D) {
                    ji1.d("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.D = true;
                }
                i4 = i | 1;
                a(j2, i4, (this.a.g - i2) - i3, i2, p83Var);
            }
        }
        i4 = i;
        a(j2, i4, (this.a.g - i2) - i3, i2, p83Var);
    }

    public static nt2 a(qe qeVar) {
        return new nt2(qeVar, null, null);
    }

    public static nt2 a(qe qeVar, tk0 tk0Var, pk0 pk0Var) {
        tk0Var.getClass();
        pk0Var.getClass();
        return new nt2(qeVar, tk0Var, pk0Var);
    }
}
