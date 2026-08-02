package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Objects;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import yads.kk0;
import yads.lk0;
import yads.o83;

/* loaded from: classes7.dex */
public final class ed81 implements fb81 {
    public qd81 A;
    public boolean B;
    public boolean C;
    public long D;
    public final f381 a;
    public final c981 d;
    public ng71 e;
    public qd81 f;
    public ji41 g;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean v;
    public boolean y;
    public qd81 z;
    public final f681 b = new f681();
    public int h = 1000;
    public int[] i = new int[1000];
    public long[] j = new long[1000];
    public long[] m = new long[1000];
    public int[] l = new int[1000];
    public int[] k = new int[1000];
    public v781[] n = new v781[1000];
    public final o3 c = new o3(new su71(11));
    public long s = Long.MIN_VALUE;
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public boolean x = true;
    public boolean w = true;

    public ed81(xi71 xi71Var, c981 c981Var, cw71 cw71Var) {
        this.d = c981Var;
        this.a = new f381(xi71Var);
    }

    @Override // defpackage.fb81
    public final void a(int i, dl81 dl81Var) {
        while (true) {
            f381 f381Var = this.a;
            if (i <= 0) {
                f381Var.getClass();
                return;
            }
            zer zerVar = (zer) f381Var.y;
            if (((j191) zerVar.c) == null) {
                j191 a = ((xi71) f381Var.b).a();
                zer zerVar2 = new zer(((zer) f381Var.y).b);
                zerVar.c = a;
                zerVar.w = zerVar2;
            }
            int min = Math.min(i, (int) (((zer) f381Var.y).b - f381Var.a));
            zer zerVar3 = (zer) f381Var.y;
            dl81Var.d((int) (f381Var.a - zerVar3.a), min, ((j191) zerVar3.c).a);
            i -= min;
            long j = f381Var.a + min;
            f381Var.a = j;
            zer zerVar4 = (zer) f381Var.y;
            if (j == zerVar4.b) {
                f381Var.y = (zer) zerVar4.w;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c2, code lost:
    
        if (((defpackage.r981) r10.valueAt(r10.size() - 1)).a.equals(r9.A) == false) goto L48;
     */
    @Override // defpackage.fb81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j, int i, int i2, int i3, v781 v781Var) {
        if (this.y) {
            qd81 qd81Var = this.z;
            if (qd81Var == null) {
                ny61.k();
                return;
            }
            k(qd81Var);
        }
        int i4 = i & 1;
        boolean z = i4 != 0;
        if (this.w) {
            if (!z) {
                return;
            } else {
                this.w = false;
            }
        }
        long j2 = j + this.D;
        if (this.B) {
            if (j2 < this.s) {
                return;
            }
            if (i4 == 0) {
                if (!this.C) {
                    Objects.toString(this.A);
                    nba1.e();
                    this.C = true;
                }
                i |= 1;
            }
        }
        long j3 = (this.a.a - i2) - i3;
        synchronized (this) {
            try {
                int i5 = this.o;
                if (i5 > 0) {
                    if (this.j[q(i5 - 1)] + this.k[r14] > j3) {
                        throw new IllegalArgumentException();
                    }
                }
                this.v = (536870912 & i) != 0;
                this.u = Math.max(this.u, j2);
                int q = q(this.o);
                this.m[q] = j2;
                this.j[q] = j3;
                this.k[q] = i2;
                this.l[q] = i;
                this.n[q] = v781Var;
                this.i[q] = 0;
                if (((SparseArray) this.c.w).size() != 0) {
                    SparseArray sparseArray = (SparseArray) this.c.w;
                }
                o3 o3Var = this.c;
                int i6 = this.p + this.o;
                qd81 qd81Var2 = this.A;
                qd81Var2.getClass();
                r981 r981Var = new r981(qd81Var2);
                if (o3Var.b == -1) {
                    if (((SparseArray) o3Var.w).size() != 0) {
                        throw new IllegalStateException();
                    }
                    o3Var.b = 0;
                }
                if (((SparseArray) o3Var.w).size() > 0) {
                    SparseArray sparseArray2 = (SparseArray) o3Var.w;
                    int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                    if (i6 < keyAt) {
                        throw new IllegalArgumentException();
                    }
                    if (keyAt == i6) {
                        su71 su71Var = (su71) o3Var.c;
                        SparseArray sparseArray3 = (SparseArray) o3Var.w;
                        Object valueAt = sparseArray3.valueAt(sparseArray3.size() - 1);
                        su71Var.getClass();
                        ((r981) valueAt).getClass();
                    }
                }
                ((SparseArray) o3Var.w).append(i6, r981Var);
                int i7 = this.o + 1;
                this.o = i7;
                int i8 = this.h;
                if (i7 == i8) {
                    int i9 = i8 + 1000;
                    int[] iArr = new int[i9];
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    int[] iArr2 = new int[i9];
                    int[] iArr3 = new int[i9];
                    v781[] v781VarArr = new v781[i9];
                    int i10 = this.q;
                    int i11 = i8 - i10;
                    System.arraycopy(this.j, i10, jArr, 0, i11);
                    System.arraycopy(this.m, this.q, jArr2, 0, i11);
                    System.arraycopy(this.l, this.q, iArr2, 0, i11);
                    System.arraycopy(this.k, this.q, iArr3, 0, i11);
                    System.arraycopy(this.n, this.q, v781VarArr, 0, i11);
                    System.arraycopy(this.i, this.q, iArr, 0, i11);
                    int i12 = this.q;
                    System.arraycopy(this.j, 0, jArr, i11, i12);
                    System.arraycopy(this.m, 0, jArr2, i11, i12);
                    System.arraycopy(this.l, 0, iArr2, i11, i12);
                    System.arraycopy(this.k, 0, iArr3, i11, i12);
                    System.arraycopy(this.n, 0, v781VarArr, i11, i12);
                    System.arraycopy(this.i, 0, iArr, i11, i12);
                    this.j = jArr;
                    this.m = jArr2;
                    this.l = iArr2;
                    this.k = iArr3;
                    this.n = v781VarArr;
                    this.i = iArr;
                    this.q = 0;
                    this.h = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fb81
    public final int c(jz61 jz61Var, int i, boolean z) {
        f381 f381Var = this.a;
        zer zerVar = (zer) f381Var.y;
        if (((j191) zerVar.c) == null) {
            j191 a = ((xi71) f381Var.b).a();
            zer zerVar2 = new zer(((zer) f381Var.y).b);
            zerVar.c = a;
            zerVar.w = zerVar2;
        }
        int min = Math.min(i, (int) (((zer) f381Var.y).b - f381Var.a));
        zer zerVar3 = (zer) f381Var.y;
        int v = jz61Var.v((int) (f381Var.a - zerVar3.a), min, ((j191) zerVar3.c).a);
        if (v == -1) {
            if (z) {
                return -1;
            }
            ny61.b();
            return 0;
        }
        long j = f381Var.a + v;
        f381Var.a = j;
        zer zerVar4 = (zer) f381Var.y;
        if (j == zerVar4.b) {
            f381Var.y = (zer) zerVar4.w;
        }
        return v;
    }

    public final int d(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.m[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.l[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.h) {
                i = 0;
            }
        }
        return i3;
    }

    public final int e(og81 og81Var, yh81 yh81Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        f681 f681Var = this.b;
        synchronized (this) {
            yh81Var.w = false;
            int i3 = this.r;
            i2 = -3;
            if (i3 != this.o) {
                qd81 qd81Var = ((r981) this.c.p(this.p + i3)).a;
                if (!z2 && qd81Var == this.f) {
                    int q = q(this.r);
                    ji41 ji41Var = this.g;
                    int[] iArr = this.l;
                    if (ji41Var != null) {
                        int i4 = iArr[q];
                        yh81Var.w = true;
                    } else {
                        int i5 = iArr[q];
                        yh81Var.a = i5;
                        long j = this.m[q];
                        yh81Var.x = j;
                        if (j < this.s) {
                            yh81Var.a = i5 | Integer.MIN_VALUE;
                        }
                        f681Var.a = this.k[q];
                        f681Var.b = this.j[q];
                        f681Var.c = this.n[q];
                        i2 = -4;
                    }
                }
                i(qd81Var, og81Var);
                i2 = -5;
            } else {
                if (!z && !this.v) {
                    qd81 qd81Var2 = this.A;
                    if (qd81Var2 != null && (z2 || qd81Var2 != this.f)) {
                        i(qd81Var2, og81Var);
                        i2 = -5;
                    }
                }
                yh81Var.a = 4;
                i2 = -4;
            }
        }
        if (i2 == -4 && !yh81Var.c(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                f381 f381Var = this.a;
                f681 f681Var2 = this.b;
                if (z3) {
                    f381.c((zer) f381Var.x, yh81Var, f681Var2, (dl81) f381Var.c);
                } else {
                    f381Var.x = f381.c((zer) f381Var.x, yh81Var, f681Var2, (dl81) f381Var.c);
                }
            }
            if (!z3) {
                this.r++;
            }
        }
        return i2;
    }

    public final long f(int i) {
        this.t = Math.max(this.t, o(i));
        this.o -= i;
        int i2 = this.p + i;
        this.p = i2;
        int i3 = this.q + i;
        this.q = i3;
        int i4 = this.h;
        if (i3 >= i4) {
            this.q = i3 - i4;
        }
        int i5 = this.r - i;
        this.r = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.r = 0;
        }
        o3 o3Var = this.c;
        SparseArray sparseArray = (SparseArray) o3Var.w;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            su71 su71Var = (su71) o3Var.c;
            Object valueAt = sparseArray.valueAt(i6);
            su71Var.getClass();
            ((r981) valueAt).getClass();
            sparseArray.removeAt(i6);
            int i8 = o3Var.b;
            if (i8 > 0) {
                o3Var.b = i8 - 1;
            }
            i6 = i7;
        }
        if (this.o != 0) {
            return this.j[this.q];
        }
        int i9 = this.q;
        if (i9 == 0) {
            i9 = this.h;
        }
        return this.j[i9 - 1] + this.k[r7];
    }

    public final void g() {
        long f;
        f381 f381Var = this.a;
        synchronized (this) {
            int i = this.o;
            f = i == 0 ? -1L : f(i);
        }
        f381Var.d(f);
    }

    public final void h(long j, boolean z) {
        ed81 ed81Var;
        Throwable th;
        long j2;
        f381 f381Var = this.a;
        synchronized (this) {
            try {
                int i = this.o;
                j2 = -1;
                if (i != 0) {
                    long[] jArr = this.m;
                    int i2 = this.q;
                    if (j >= jArr[i2]) {
                        if (z) {
                            try {
                                int i3 = this.r;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                ed81Var = this;
                                throw th;
                            }
                        }
                        ed81Var = this;
                        try {
                            int d = ed81Var.d(i2, i, j, false);
                            if (d == -1) {
                            } else {
                                j2 = ed81Var.f(d);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                ed81Var = this;
            }
        }
        f381Var.d(j2);
    }

    public final void i(qd81 qd81Var, og81 og81Var) {
        qd81 qd81Var2;
        qd81 qd81Var3 = this.f;
        boolean z = qd81Var3 == null;
        kk0 kk0Var = z ? null : qd81Var3.H;
        this.f = qd81Var;
        kk0 kk0Var2 = qd81Var.H;
        c981 c981Var = this.d;
        if (c981Var != null) {
            int i = kk0Var2 != null ? 1 : 0;
            da81 da81Var = new da81(qd81Var);
            da81Var.D = i;
            qd81Var2 = new qd81(da81Var);
        } else {
            qd81Var2 = qd81Var;
        }
        og81Var.b = qd81Var2;
        og81Var.a = this.g;
        if (c981Var == null) {
            return;
        }
        if (z || !rf71.o(kk0Var, kk0Var2)) {
            ji41 ji41Var = qd81Var.H != null ? new ji41(28, new lk0(new o83())) : null;
            this.g = ji41Var;
            og81Var.a = ji41Var;
        }
    }

    public final synchronized boolean j(boolean z) {
        qd81 qd81Var;
        int i = this.r;
        boolean z2 = false;
        if (i == this.o) {
            if (z || this.v || ((qd81Var = this.A) != null && qd81Var != this.f)) {
                z2 = true;
            }
            return z2;
        }
        if (((r981) this.c.p(this.p + i)).a != this.f) {
            return true;
        }
        int q = q(this.r);
        if (this.g != null) {
            int i2 = this.l[q];
        } else {
            z2 = true;
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    @Override // defpackage.fb81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(qd81 qd81Var) {
        qd81 qd81Var2;
        String str;
        boolean z;
        i6z0 c;
        if (this.D == 0 || qd81Var.I == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            qd81Var2 = qd81Var;
        } else {
            da81 da81Var = new da81(qd81Var);
            da81Var.o = qd81Var.I + this.D;
            qd81Var2 = new qd81(da81Var);
        }
        boolean z2 = false;
        this.y = false;
        this.z = qd81Var;
        synchronized (this) {
            try {
                this.x = false;
                if (!rf71.o(qd81Var2, this.A)) {
                    if (((SparseArray) this.c.w).size() != 0) {
                        SparseArray sparseArray = (SparseArray) this.c.w;
                        if (((r981) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(qd81Var2)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.w;
                            this.A = ((r981) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            qd81 qd81Var3 = this.A;
                            str = qd81Var3.E;
                            String str2 = qd81Var3.B;
                            ArrayList arrayList = g681.a;
                            if (str != null) {
                                switch (str) {
                                    case "audio/eac3-joc":
                                    case "audio/mpeg-L1":
                                    case "audio/mpeg-L2":
                                    case "audio/ac3":
                                    case "audio/raw":
                                    case "audio/eac3":
                                    case "audio/flac":
                                    case "audio/mpeg":
                                    case "audio/g711-alaw":
                                    case "audio/g711-mlaw":
                                        z = true;
                                        break;
                                    case "audio/mp4a-latm":
                                        if (str2 != null && (c = g681.c(str2)) != null) {
                                            int i = c.c;
                                            char c2 = i != 2 ? i != 5 ? i != 29 ? i != 42 ? i != 22 ? i != 23 ? (char) 0 : (char) 15 : (char) 0 : (char) 16 : '\f' : (char) 11 : '\n';
                                            if (c2 != 0 && c2 != 16) {
                                                z = true;
                                                break;
                                            }
                                        }
                                        break;
                                }
                                this.B = z;
                                this.C = false;
                                z2 = true;
                            }
                            z = false;
                            this.B = z;
                            this.C = false;
                            z2 = true;
                        }
                    }
                    this.A = qd81Var2;
                    qd81 qd81Var32 = this.A;
                    str = qd81Var32.E;
                    String str22 = qd81Var32.B;
                    ArrayList arrayList2 = g681.a;
                    if (str != null) {
                    }
                    z = false;
                    this.B = z;
                    this.C = false;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ng71 ng71Var = this.e;
        if (ng71Var == null || !z2) {
            return;
        }
        ng71Var.I.post(ng71Var.G);
    }

    public final synchronized int l(long j, boolean z) {
        try {
            try {
                int q = q(this.r);
                int i = this.r;
                int i2 = this.o;
                if (i == i2 || j < this.m[q]) {
                    return 0;
                }
                if (j > this.u && z) {
                    return i2 - i;
                }
                int d = d(q, i2 - i, j, true);
                if (d == -1) {
                    return 0;
                }
                return d;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    public final void m(int r7) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed81.m(int):void");
    }

    public final void n(boolean z) {
        o3 o3Var;
        SparseArray sparseArray;
        f381 f381Var = this.a;
        f381Var.e((zer) f381Var.w);
        zer zerVar = (zer) f381Var.w;
        if (((j191) zerVar.c) != null) {
            ny61.k();
            return;
        }
        zerVar.a = 0L;
        zerVar.b = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        f381Var.x = zerVar;
        f381Var.y = zerVar;
        f381Var.a = 0L;
        ((xi71) f381Var.b).c();
        int i = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.w = true;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = false;
        while (true) {
            o3Var = this.c;
            sparseArray = (SparseArray) o3Var.w;
            if (i >= sparseArray.size()) {
                break;
            }
            su71 su71Var = (su71) o3Var.c;
            Object valueAt = sparseArray.valueAt(i);
            su71Var.getClass();
            ((r981) valueAt).getClass();
            i++;
        }
        o3Var.b = -1;
        sparseArray.clear();
        if (z) {
            this.z = null;
            this.A = null;
            this.x = true;
        }
    }

    public final long o(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int q = q(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.m[q]);
            if ((this.l[q] & 1) != 0) {
                return j;
            }
            q--;
            if (q == -1) {
                q = this.h - 1;
            }
        }
        return j;
    }

    public final synchronized boolean p(long j, boolean z) {
        try {
            try {
                synchronized (this) {
                    try {
                        this.r = 0;
                        f381 f381Var = this.a;
                        f381Var.x = (zer) f381Var.w;
                        int q = q(0);
                        int i = this.r;
                        int i2 = this.o;
                        if (i != i2 && j >= this.m[q]) {
                            if (j <= this.u || z) {
                                int d = d(q, i2 - i, j, true);
                                if (d == -1) {
                                    return false;
                                }
                                this.s = j;
                                this.r += d;
                                return true;
                            }
                        }
                        return false;
                    } finally {
                        th = th;
                        while (true) {
                            Throwable th = th;
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }

    public final int q(int i) {
        int i2 = this.q + i;
        int i3 = this.h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final void r() {
        if (this.g != null) {
            this.g = null;
            this.f = null;
        }
    }
}
