package yads;

import android.net.Uri;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xsna.bi5;
import xsna.nq4;
import xsna.p69;
import xsna.ue9;

/* loaded from: classes10.dex */
public final class fl2 implements qn1, qq0, zg1, dh1, mt2 {
    public static final Map N;
    public static final nx0 O;
    public boolean B;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public long H;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public final Uri b;
    public final p30 c;
    public final tk0 d;
    public final ae0 e;
    public final co1 f;
    public final pk0 g;
    public final bl2 h;
    public final qe i;
    public final String j;
    public final long k;
    public final cr m;
    public pn1 r;
    public r21 s;
    public boolean v;
    public boolean w;
    public boolean x;
    public el2 y;
    public zx2 z;
    public final gh1 l = new gh1("ProgressiveMediaPeriod");
    public final vy n = new vy();
    public final Runnable o = new nq4(this, 14);
    public final Runnable p = new p69(this, 12);
    public final Handler q = mc3.a();
    public dl2[] u = new dl2[0];
    public nt2[] t = new nt2[0];
    public long I = C.TIME_UNSET;
    public long A = C.TIME_UNSET;
    public int C = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        N = Collections.unmodifiableMap(hashMap);
        mx0 mx0Var = new mx0();
        mx0Var.a = "icy";
        mx0Var.k = "application/x-icy";
        O = new nx0(mx0Var);
    }

    public fl2(Uri uri, p30 p30Var, cr crVar, tk0 tk0Var, pk0 pk0Var, ae0 ae0Var, co1 co1Var, bl2 bl2Var, qe qeVar, String str, int i) {
        this.b = uri;
        this.c = p30Var;
        this.d = tk0Var;
        this.g = pk0Var;
        this.e = ae0Var;
        this.f = co1Var;
        this.h = bl2Var;
        this.i = qeVar;
        this.j = str;
        this.k = i;
        this.m = crVar;
    }

    @Override // yads.qq0
    public final void a() {
        this.v = true;
        this.q.post(this.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [yads.gl2] */
    public final void b(zx2 zx2Var) {
        this.z = this.s == null ? zx2Var : new yx2(C.TIME_UNSET, 0L);
        this.A = zx2Var.c();
        boolean z = !this.G && zx2Var.c() == C.TIME_UNSET;
        this.B = z;
        this.C = z ? 7 : 1;
        bl2 bl2Var = this.h;
        long j = this.A;
        boolean b = zx2Var.b();
        boolean z2 = this.B;
        il2 il2Var = (il2) bl2Var;
        if (j == C.TIME_UNSET) {
            j = il2Var.p;
        }
        if (il2Var.o || il2Var.p != j || il2Var.q != b || il2Var.r != z2) {
            il2Var.p = j;
            il2Var.q = b;
            il2Var.r = z2;
            il2Var.o = false;
            long j2 = il2Var.p;
            t03 t03Var = new t03(j2, j2, il2Var.q, il2Var.r, il2Var.h);
            if (il2Var.o) {
                t03Var = new gl2(t03Var);
            }
            il2Var.a(t03Var);
        }
        if (this.w) {
            return;
        }
        g();
    }

    public final void c() {
        if (!this.w) {
            throw new IllegalStateException();
        }
        this.y.getClass();
        this.z.getClass();
    }

    @Override // yads.vy2
    public final boolean continueLoading(long j) {
        if (this.L || this.l.c != null || this.J) {
            return false;
        }
        if (this.w && this.F == 0) {
            return false;
        }
        boolean d = this.n.d();
        if (this.l.b()) {
            return d;
        }
        i();
        return true;
    }

    public final int d() {
        int i = 0;
        for (nt2 nt2Var : this.t) {
            i += nt2Var.q + nt2Var.p;
        }
        return i;
    }

    @Override // yads.qn1
    public final void discardBuffer(long j, boolean z) {
        c();
        if (this.I != C.TIME_UNSET) {
            return;
        }
        boolean[] zArr = this.y.c;
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            this.t[i].a(j, z, zArr[i]);
        }
    }

    public final void e() {
        if (this.M) {
            return;
        }
        pn1 pn1Var = this.r;
        pn1Var.getClass();
        pn1Var.a((vy2) this);
    }

    public final /* synthetic */ void f() {
        this.G = true;
    }

    public final void g() {
        if (this.M || this.w || !this.v || this.z == null) {
            return;
        }
        for (nt2 nt2Var : this.t) {
            if (nt2Var.c() == null) {
                return;
            }
        }
        vy vyVar = this.n;
        synchronized (vyVar) {
            vyVar.a = false;
        }
        int length = this.t.length;
        l83[] l83VarArr = new l83[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            nx0 c = this.t[i].c();
            c.getClass();
            String str = c.m;
            boolean equals = "audio".equals(iu1.c(str));
            boolean z = equals || "video".equals(iu1.c(str));
            zArr[i] = z;
            this.x = z | this.x;
            r21 r21Var = this.s;
            if (r21Var != null) {
                if (equals || this.u[i].b) {
                    ut1 ut1Var = c.k;
                    ut1 ut1Var2 = ut1Var == null ? new ut1(r21Var) : new ut1((tt1[]) mc3.a((Object[]) ut1Var.b, (Object[]) new tt1[]{r21Var}));
                    mx0 mx0Var = new mx0(c);
                    mx0Var.i = ut1Var2;
                    c = new nx0(mx0Var);
                }
                if (equals && c.g == -1 && c.h == -1 && r21Var.b != -1) {
                    mx0 mx0Var2 = new mx0(c);
                    mx0Var2.f = r21Var.b;
                    c = new nx0(mx0Var2);
                }
            }
            int a = this.d.a(c);
            mx0 mx0Var3 = new mx0(c);
            mx0Var3.D = a;
            l83VarArr[i] = new l83(Integer.toString(i), new nx0(mx0Var3));
        }
        this.y = new el2(new m83(l83VarArr), zArr);
        this.w = true;
        pn1 pn1Var = this.r;
        pn1Var.getClass();
        pn1Var.a((qn1) this);
    }

    @Override // yads.vy2
    public final long getBufferedPositionUs() {
        long j;
        boolean z;
        c();
        if (this.L || this.F == 0) {
            return Long.MIN_VALUE;
        }
        long j2 = this.I;
        if (j2 != C.TIME_UNSET) {
            return j2;
        }
        if (this.x) {
            int length = this.t.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                el2 el2Var = this.y;
                if (el2Var.b[i] && el2Var.c[i]) {
                    nt2 nt2Var = this.t[i];
                    synchronized (nt2Var) {
                        z = nt2Var.w;
                    }
                    if (!z) {
                        j = Math.min(j, this.t[i].b());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = a(false);
        }
        return j == Long.MIN_VALUE ? this.H : j;
    }

    @Override // yads.vy2
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // yads.qn1
    public final m83 getTrackGroups() {
        c();
        return this.y.a;
    }

    public final void h() {
        this.q.post(new bi5(this, 15));
    }

    public final void i() {
        al2 al2Var = new al2(this, this.b, this.c, this.m, this, this.n);
        if (this.w) {
            long j = this.I;
            if (j == C.TIME_UNSET) {
                throw new IllegalStateException();
            }
            long j2 = this.A;
            if (j2 != C.TIME_UNSET && j > j2) {
                this.L = true;
                this.I = C.TIME_UNSET;
                return;
            }
            zx2 zx2Var = this.z;
            zx2Var.getClass();
            long j3 = zx2Var.b(this.I).a.b;
            long j4 = this.I;
            al2Var.f.a = j3;
            al2Var.i = j4;
            al2Var.h = true;
            al2Var.l = false;
            for (nt2 nt2Var : this.t) {
                nt2Var.t = this.I;
            }
            this.I = C.TIME_UNSET;
        }
        this.K = d();
        this.l.a(al2Var, this, this.e.a(this.C));
        u30 u30Var = al2Var.j;
        co1 co1Var = this.f;
        Uri uri = u30Var.a;
        co1Var.c(new wg1(), new in1(1, -1, null, 0, null, co1Var.a(al2Var.i), co1Var.a(this.A)));
    }

    @Override // yads.vy2
    public final boolean isLoading() {
        boolean z;
        if (!this.l.b()) {
            return false;
        }
        vy vyVar = this.n;
        synchronized (vyVar) {
            z = vyVar.a;
        }
        return z;
    }

    @Override // yads.qn1
    public final void maybeThrowPrepareError() {
        this.l.a(this.e.a(this.C));
        if (this.L && !this.w) {
            throw new pc2("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    @Override // yads.qn1
    public final long readDiscontinuity() {
        if (!this.E) {
            return C.TIME_UNSET;
        }
        if (!this.L && d() <= this.K) {
            return C.TIME_UNSET;
        }
        this.E = false;
        return this.H;
    }

    @Override // yads.qn1
    public final long seekToUs(long j) {
        int i;
        c();
        boolean[] zArr = this.y.b;
        if (!this.z.b()) {
            j = 0;
        }
        this.E = false;
        this.H = j;
        if (this.I != C.TIME_UNSET) {
            this.I = j;
            return j;
        }
        if (this.C != 7) {
            int length = this.t.length;
            for (0; i < length; i + 1) {
                i = (this.t[i].b(j, false) || (!zArr[i] && this.x)) ? i + 1 : 0;
            }
            return j;
        }
        this.J = false;
        this.I = j;
        this.L = false;
        if (!this.l.b()) {
            this.l.c = null;
            for (nt2 nt2Var : this.t) {
                nt2Var.b(false);
            }
            return j;
        }
        for (nt2 nt2Var2 : this.t) {
            nt2Var2.a();
        }
        bh1 bh1Var = this.l.b;
        if (bh1Var == null) {
            throw new IllegalStateException();
        }
        bh1Var.a(false);
        return j;
    }

    @Override // yads.qn1
    public final long a(long j, ay2 ay2Var) {
        c();
        if (!this.z.b()) {
            return 0L;
        }
        xx2 b = this.z.b(j);
        return ay2Var.a(j, b.a.a, b.b.a);
    }

    public final long a(boolean z) {
        long j;
        long j2 = Long.MIN_VALUE;
        for (int i = 0; i < this.t.length; i++) {
            if (!z) {
                el2 el2Var = this.y;
                el2Var.getClass();
                if (!el2Var.c[i]) {
                    continue;
                }
            }
            nt2 nt2Var = this.t[i];
            synchronized (nt2Var) {
                j = nt2Var.v;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final void a(int i) {
        c();
        boolean[] zArr = this.y.b;
        if (this.J && zArr[i] && !this.t[i].a(false)) {
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (nt2 nt2Var : this.t) {
                nt2Var.b(false);
            }
            pn1 pn1Var = this.r;
            pn1Var.getClass();
            pn1Var.a((vy2) this);
        }
    }

    @Override // yads.dh1
    public final void b() {
        for (nt2 nt2Var : this.t) {
            nt2Var.b(true);
            nt2Var.d();
        }
        cr crVar = this.m;
        nq0 nq0Var = crVar.b;
        if (nq0Var != null) {
            nq0Var.release();
            crVar.b = null;
        }
        crVar.c = null;
    }

    @Override // yads.zg1
    public final void a(ch1 ch1Var, long j, long j2, boolean z) {
        al2 al2Var = (al2) ch1Var;
        Uri uri = al2Var.b.c;
        wg1 wg1Var = new wg1();
        this.e.getClass();
        co1 co1Var = this.f;
        co1Var.a(wg1Var, new in1(1, -1, null, 0, null, co1Var.a(al2Var.i), co1Var.a(this.A)));
        if (z) {
            return;
        }
        for (nt2 nt2Var : this.t) {
            nt2Var.b(false);
        }
        if (this.F > 0) {
            pn1 pn1Var = this.r;
            pn1Var.getClass();
            pn1Var.a((vy2) this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [yads.gl2] */
    @Override // yads.zg1
    public final void a(ch1 ch1Var, long j, long j2) {
        zx2 zx2Var;
        al2 al2Var = (al2) ch1Var;
        if (this.A == C.TIME_UNSET && (zx2Var = this.z) != null) {
            boolean b = zx2Var.b();
            long a = a(true);
            long j3 = a == Long.MIN_VALUE ? 0L : a + 10000;
            this.A = j3;
            bl2 bl2Var = this.h;
            boolean z = this.B;
            il2 il2Var = (il2) bl2Var;
            if (j3 == C.TIME_UNSET) {
                j3 = il2Var.p;
            }
            if (il2Var.o || il2Var.p != j3 || il2Var.q != b || il2Var.r != z) {
                il2Var.p = j3;
                il2Var.q = b;
                il2Var.r = z;
                il2Var.o = false;
                long j4 = il2Var.p;
                t03 t03Var = new t03(j4, j4, il2Var.q, il2Var.r, il2Var.h);
                if (il2Var.o) {
                    t03Var = new gl2(t03Var);
                }
                il2Var.a(t03Var);
            }
        }
        Uri uri = al2Var.b.c;
        wg1 wg1Var = new wg1();
        this.e.getClass();
        co1 co1Var = this.f;
        co1Var.b(wg1Var, new in1(1, -1, null, 0, null, co1Var.a(al2Var.i), co1Var.a(this.A)));
        this.L = true;
        pn1 pn1Var = this.r;
        pn1Var.getClass();
        pn1Var.a((vy2) this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    @Override // yads.zg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ah1 a(ch1 ch1Var, long j, long j2, IOException iOException, int i) {
        long j3;
        ah1 ah1Var;
        zx2 zx2Var;
        int i2;
        al2 al2Var = (al2) ch1Var;
        Uri uri = al2Var.b.c;
        wg1 wg1Var = new wg1();
        int i3 = mc3.a;
        this.e.getClass();
        boolean z = true;
        if (!(iOException instanceof pc2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof r11) && !(iOException instanceof fh1)) {
            int i4 = q30.c;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof q30) || ((q30) th).b != 2008) {
                }
            }
            j3 = Math.min((i - 1) * 1000, 5000);
            if (j3 != C.TIME_UNSET) {
                ah1Var = gh1.e;
            } else {
                int d = d();
                int i5 = d > this.K ? 1 : 0;
                if (!this.G && ((zx2Var = this.z) == null || zx2Var.c() == C.TIME_UNSET)) {
                    boolean z2 = this.w;
                    if (z2 && !this.E && this.I == C.TIME_UNSET) {
                        this.J = true;
                        ah1Var = gh1.d;
                    } else {
                        this.E = z2;
                        this.H = 0L;
                        this.K = 0;
                        for (nt2 nt2Var : this.t) {
                            nt2Var.b(false);
                        }
                        al2Var.f.a = 0L;
                        al2Var.i = 0L;
                        al2Var.h = true;
                        al2Var.l = false;
                    }
                } else {
                    this.K = d;
                }
                ah1Var = new ah1(i5, j3);
            }
            i2 = ah1Var.a;
            if (i2 != 0 && i2 != 1) {
                z = false;
            }
            co1 co1Var = this.f;
            co1Var.a(wg1Var, new in1(1, -1, null, 0, null, co1Var.a(al2Var.i), co1Var.a(this.A)), iOException, !z);
            if (!z) {
                this.e.getClass();
            }
            return ah1Var;
        }
        j3 = -9223372036854775807L;
        if (j3 != C.TIME_UNSET) {
        }
        i2 = ah1Var.a;
        if (i2 != 0) {
            z = false;
        }
        co1 co1Var2 = this.f;
        co1Var2.a(wg1Var, new in1(1, -1, null, 0, null, co1Var2.a(al2Var.i), co1Var2.a(this.A)), iOException, !z);
        if (!z) {
        }
        return ah1Var;
    }

    @Override // yads.vy2
    public final void reevaluateBuffer(long j) {
    }

    @Override // yads.qn1
    public final void a(pn1 pn1Var, long j) {
        this.r = pn1Var;
        this.n.d();
        i();
    }

    public final nt2 a(dl2 dl2Var) {
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            if (dl2Var.equals(this.u[i])) {
                return this.t[i];
            }
        }
        nt2 a = nt2.a(this.i, this.d, this.g);
        a.f = this;
        int i2 = length + 1;
        dl2[] dl2VarArr = (dl2[]) Arrays.copyOf(this.u, i2);
        dl2VarArr[length] = dl2Var;
        this.u = dl2VarArr;
        nt2[] nt2VarArr = (nt2[]) Arrays.copyOf(this.t, i2);
        nt2VarArr[length] = a;
        this.t = nt2VarArr;
        return a;
    }

    @Override // yads.qq0
    public final void a(zx2 zx2Var) {
        this.q.post(new ue9(7, this, zx2Var));
    }

    @Override // yads.qn1
    public final long a(pp0[] pp0VarArr, boolean[] zArr, ot2[] ot2VarArr, boolean[] zArr2, long j) {
        pp0 pp0Var;
        c();
        el2 el2Var = this.y;
        m83 m83Var = el2Var.a;
        boolean[] zArr3 = el2Var.c;
        int i = this.F;
        for (int i2 = 0; i2 < pp0VarArr.length; i2++) {
            ot2 ot2Var = ot2VarArr[i2];
            if (ot2Var != null && (pp0VarArr[i2] == null || !zArr[i2])) {
                int i3 = ((cl2) ot2Var).b;
                if (zArr3[i3]) {
                    this.F--;
                    zArr3[i3] = false;
                    ot2VarArr[i2] = null;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        boolean z = !this.D ? j == 0 : i != 0;
        for (int i4 = 0; i4 < pp0VarArr.length; i4++) {
            if (ot2VarArr[i4] == null && (pp0Var = pp0VarArr[i4]) != null) {
                if (pp0Var.f() == 1) {
                    if (pp0Var.b(0) == 0) {
                        int indexOf = m83Var.c.indexOf(pp0Var.b());
                        if (indexOf < 0) {
                            indexOf = -1;
                        }
                        if (!zArr3[indexOf]) {
                            this.F++;
                            zArr3[indexOf] = true;
                            ot2VarArr[i4] = new cl2(this, indexOf);
                            zArr2[i4] = true;
                            if (!z) {
                                nt2 nt2Var = this.t[indexOf];
                                z = (nt2Var.b(j, true) || nt2Var.q + nt2Var.s == 0) ? false : true;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.l.b()) {
                for (nt2 nt2Var2 : this.t) {
                    nt2Var2.a();
                }
                bh1 bh1Var = this.l.b;
                if (bh1Var != null) {
                    bh1Var.a(false);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                for (nt2 nt2Var3 : this.t) {
                    nt2Var3.b(false);
                }
            }
        } else if (z) {
            j = seekToUs(j);
            for (int i5 = 0; i5 < ot2VarArr.length; i5++) {
                if (ot2VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.D = true;
        return j;
    }

    @Override // yads.qq0
    public final q83 a(int i, int i2) {
        return a(new dl2(false, i));
    }
}
