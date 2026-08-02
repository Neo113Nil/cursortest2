package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import yads.a11;
import yads.aa2;
import yads.af1;
import yads.b01;
import yads.bs1;
import yads.cs1;
import yads.ef1;
import yads.h30;

/* loaded from: classes7.dex */
public final class ng71 implements ra71, yg71, av81, mp61 {
    public static final Map h0;
    public static final qd81 i0;
    public final xi71 A;
    public final String B;
    public final long C;
    public final vi71 E;
    public e771 J;
    public a11 K;
    public boolean N;
    public boolean O;
    public boolean P;
    public s421 Q;
    public a871 R;
    public boolean T;
    public boolean V;
    public boolean W;
    public int Z;
    public final Uri a;
    public boolean a0;
    public final u871 b;
    public long b0;
    public final c981 c;
    public boolean d0;
    public int e0;
    public boolean f0;
    public boolean g0;
    public final ll81 w;
    public final sc81 x;
    public final cw71 y;
    public final vp71 z;
    public final t671 D = new t671("ProgressiveMediaPeriod");
    public final sh71 F = new sh71();
    public final mg71 G = new mg71(this, 0);
    public final mg71 H = new mg71(this, 1);
    public final Handler I = rf71.i(null);
    public ha71[] M = new ha71[0];
    public ed81[] L = new ed81[0];
    public long c0 = -9223372036854775807L;
    public long S = -9223372036854775807L;
    public int U = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        h0 = Collections.unmodifiableMap(hashMap);
        da81 da81Var = new da81();
        da81Var.a = "icy";
        da81Var.k = "application/x-icy";
        i0 = new qd81(da81Var);
    }

    public ng71(Uri uri, u871 u871Var, vi71 vi71Var, c981 c981Var, cw71 cw71Var, ll81 ll81Var, sc81 sc81Var, vp71 vp71Var, xi71 xi71Var, String str, int i) {
        this.a = uri;
        this.b = u871Var;
        this.c = c981Var;
        this.y = cw71Var;
        this.w = ll81Var;
        this.x = sc81Var;
        this.z = vp71Var;
        this.A = xi71Var;
        this.B = str;
        this.C = i;
        this.E = vi71Var;
    }

    @Override // defpackage.ra71
    public final long D(long j, lb71 lb71Var) {
        m();
        if (!this.R.b()) {
            return 0L;
        }
        v171 d = this.R.d(j);
        return lb71Var.a(j, d.a.a, d.b.a);
    }

    @Override // defpackage.ra71
    public final long J(gk71[] gk71VarArr, boolean[] zArr, dg81[] dg81VarArr, boolean[] zArr2, long j) {
        gk71 gk71Var;
        long j2 = j;
        m();
        s421 s421Var = this.Q;
        wx71 wx71Var = (wx71) s421Var.b;
        boolean[] zArr3 = (boolean[]) s421Var.w;
        int i = this.Z;
        for (int i2 = 0; i2 < gk71VarArr.length; i2++) {
            dg81 dg81Var = dg81VarArr[i2];
            if (dg81Var != null && (gk71VarArr[i2] == null || !zArr[i2])) {
                int i3 = ((z671) dg81Var).a;
                if (!zArr3[i3]) {
                    ny61.k();
                    return 0L;
                }
                this.Z--;
                zArr3[i3] = false;
                dg81VarArr[i2] = null;
            }
        }
        boolean z = !this.V ? j2 == 0 : i != 0;
        for (int i4 = 0; i4 < gk71VarArr.length; i4++) {
            if (dg81VarArr[i4] == null && (gk71Var = gk71VarArr[i4]) != null) {
                if (gk71Var.g() != 1) {
                    ny61.k();
                    return 0L;
                }
                if (gk71Var.e(0) != 0) {
                    ny61.k();
                    return 0L;
                }
                int indexOf = wx71Var.b.indexOf(gk71Var.c());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                if (zArr3[indexOf]) {
                    ny61.k();
                    return 0L;
                }
                this.Z++;
                zArr3[indexOf] = true;
                dg81VarArr[i4] = new z671(this, indexOf);
                zArr2[i4] = true;
                if (!z) {
                    ed81 ed81Var = this.L[indexOf];
                    z = (ed81Var.p(j2, true) || ed81Var.p + ed81Var.r == 0) ? false : true;
                }
            }
        }
        if (this.Z == 0) {
            this.d0 = false;
            this.W = false;
            t671 t671Var = this.D;
            boolean e = t671Var.e();
            ed81[] ed81VarArr = this.L;
            if (e) {
                for (ed81 ed81Var2 : ed81VarArr) {
                    ed81Var2.g();
                }
                af1 af1Var = t671Var.b;
                if (af1Var == null) {
                    ny61.k();
                    return 0L;
                }
                af1Var.a(false);
            } else {
                for (ed81 ed81Var3 : ed81VarArr) {
                    ed81Var3.n(false);
                }
            }
        } else if (z) {
            j2 = e(j2);
            for (int i5 = 0; i5 < dg81VarArr.length; i5++) {
                if (dg81VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.V = true;
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    @Override // defpackage.av81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m191 a(zl61 zl61Var, long j, long j2, IOException iOException, int i) {
        long j3;
        m191 m191Var;
        a871 a871Var;
        c471 c471Var = (c471) zl61Var;
        Uri uri = c471Var.b.c;
        nl81 nl81Var = new nl81();
        int i2 = rf71.a;
        this.w.getClass();
        if (!(iOException instanceof aa2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof b01) && !(iOException instanceof ef1)) {
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof h30) || ((h30) th).b != 2008) {
                }
            }
            j3 = Math.min((i - 1) * 1000, 5000);
            if (j3 != -9223372036854775807L) {
                m191Var = t671.e;
            } else {
                int n = n();
                int i3 = n > this.e0 ? 1 : 0;
                if (this.a0 || !((a871Var = this.R) == null || a871Var.c() == -9223372036854775807L)) {
                    this.e0 = n;
                } else {
                    boolean z = this.O;
                    if (z && !this.W && this.c0 == -9223372036854775807L) {
                        this.d0 = true;
                        m191Var = t671.d;
                    } else {
                        this.W = z;
                        this.b0 = 0L;
                        this.e0 = 0;
                        for (ed81 ed81Var : this.L) {
                            ed81Var.n(false);
                        }
                        c471Var.f.a = 0L;
                        c471Var.i = 0L;
                        c471Var.h = true;
                        c471Var.l = false;
                    }
                }
                m191Var = new m191(i3, j3);
            }
            int i4 = m191Var.a;
            boolean z2 = i4 != 0 || i4 == 1;
            long j4 = c471Var.i;
            long j5 = this.S;
            sc81 sc81Var = this.x;
            sc81Var.d(nl81Var, new pil0(1, -1, null, 0, null, sc81Var.a(j4), sc81Var.a(j5)), iOException, !z2);
            return m191Var;
        }
        j3 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
        }
        int i42 = m191Var.a;
        if (i42 != 0) {
        }
        long j42 = c471Var.i;
        long j52 = this.S;
        sc81 sc81Var2 = this.x;
        sc81Var2.d(nl81Var, new pil0(1, -1, null, 0, null, sc81Var2.a(j42), sc81Var2.a(j52)), iOException, !z2);
        return m191Var;
    }

    public final long b(boolean z) {
        long j;
        long j2 = Long.MIN_VALUE;
        for (int i = 0; i < this.L.length; i++) {
            if (!z) {
                s421 s421Var = this.Q;
                s421Var.getClass();
                if (!((boolean[]) s421Var.w)[i]) {
                    continue;
                }
            }
            ed81 ed81Var = this.L[i];
            synchronized (ed81Var) {
                j = ed81Var.u;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final ed81 c(ha71 ha71Var) {
        int length = this.L.length;
        for (int i = 0; i < length; i++) {
            if (ha71Var.equals(this.M[i])) {
                return this.L[i];
            }
        }
        c981 c981Var = this.c;
        c981Var.getClass();
        ed81 ed81Var = new ed81(this.A, c981Var, this.y);
        ed81Var.e = this;
        int i2 = length + 1;
        ha71[] ha71VarArr = (ha71[]) Arrays.copyOf(this.M, i2);
        ha71VarArr[length] = ha71Var;
        this.M = ha71VarArr;
        ed81[] ed81VarArr = (ed81[]) Arrays.copyOf(this.L, i2);
        ed81VarArr[length] = ed81Var;
        this.L = ed81VarArr;
        return ed81Var;
    }

    public final void d(int i) {
        m();
        boolean[] zArr = (boolean[]) this.Q.c;
        if (this.d0 && zArr[i] && !this.L[i].j(false)) {
            this.c0 = 0L;
            this.d0 = false;
            this.W = true;
            this.b0 = 0L;
            this.e0 = 0;
            for (ed81 ed81Var : this.L) {
                ed81Var.n(false);
            }
            e771 e771Var = this.J;
            e771Var.getClass();
            e771Var.a((sn61) this);
        }
    }

    @Override // defpackage.ra71
    public final long e(long j) {
        int i;
        m();
        boolean[] zArr = (boolean[]) this.Q.c;
        if (!this.R.b()) {
            j = 0;
        }
        this.W = false;
        this.b0 = j;
        if (this.c0 != -9223372036854775807L) {
            this.c0 = j;
            return j;
        }
        if (this.U != 7) {
            int length = this.L.length;
            for (0; i < length; i + 1) {
                i = (this.L[i].p(j, false) || (!zArr[i] && this.P)) ? i + 1 : 0;
            }
            return j;
        }
        this.d0 = false;
        this.c0 = j;
        this.f0 = false;
        t671 t671Var = this.D;
        if (!t671Var.e()) {
            t671Var.c = null;
            for (ed81 ed81Var : this.L) {
                ed81Var.n(false);
            }
            return j;
        }
        for (ed81 ed81Var2 : this.L) {
            ed81Var2.g();
        }
        af1 af1Var = t671Var.b;
        if (af1Var != null) {
            af1Var.a(false);
            return j;
        }
        ny61.k();
        return 0L;
    }

    @Override // defpackage.ra71
    public final long f() {
        if (!this.W) {
            return -9223372036854775807L;
        }
        if (!this.f0 && n() <= this.e0) {
            return -9223372036854775807L;
        }
        this.W = false;
        return this.b0;
    }

    @Override // defpackage.sn61
    public final long g() {
        long j;
        boolean z;
        long j2;
        m();
        if (this.f0 || this.Z == 0) {
            return Long.MIN_VALUE;
        }
        long j3 = this.c0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        if (this.P) {
            int length = this.L.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                s421 s421Var = this.Q;
                if (((boolean[]) s421Var.c)[i] && ((boolean[]) s421Var.w)[i]) {
                    ed81 ed81Var = this.L[i];
                    synchronized (ed81Var) {
                        z = ed81Var.v;
                    }
                    if (z) {
                        continue;
                    } else {
                        ed81 ed81Var2 = this.L[i];
                        synchronized (ed81Var2) {
                            j2 = ed81Var2.u;
                        }
                        j = Math.min(j, j2);
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            j = b(false);
        }
        return j == Long.MIN_VALUE ? this.b0 : j;
    }

    @Override // defpackage.ra71
    public final wx71 getTrackGroups() {
        m();
        return (wx71) this.Q.b;
    }

    @Override // defpackage.sn61
    public final void h(long j) {
    }

    @Override // defpackage.sn61
    public final long i() {
        return g();
    }

    @Override // defpackage.sn61
    public final boolean isLoading() {
        boolean z;
        if (!this.D.e()) {
            return false;
        }
        sh71 sh71Var = this.F;
        synchronized (sh71Var) {
            z = sh71Var.a;
        }
        return z;
    }

    @Override // defpackage.ra71
    public final void j() {
        int i = this.U;
        this.w.getClass();
        this.D.b(i == 7 ? 6 : 3);
        if (!this.f0 || this.O) {
            return;
        }
        dy31.g(null, "Loading finished before preparation is complete.");
    }

    @Override // defpackage.sn61
    public final boolean k(long j) {
        if (this.f0) {
            return false;
        }
        t671 t671Var = this.D;
        if (t671Var.c != null || this.d0) {
            return false;
        }
        if (this.O && this.Z == 0) {
            return false;
        }
        boolean c = this.F.c();
        if (t671Var.e()) {
            return c;
        }
        p();
        return true;
    }

    @Override // defpackage.yg71
    public final fb81 l(int i, int i2) {
        return c(new ha71(false, i));
    }

    public final void m() {
        if (!this.O) {
            ny61.k();
        } else {
            this.Q.getClass();
            this.R.getClass();
        }
    }

    public final int n() {
        int i = 0;
        for (ed81 ed81Var : this.L) {
            i += ed81Var.p + ed81Var.o;
        }
        return i;
    }

    public final void o() {
        qd81 qd81Var;
        if (this.g0 || this.O || !this.N || this.R == null) {
            return;
        }
        ed81[] ed81VarArr = this.L;
        int length = ed81VarArr.length;
        int i = 0;
        while (true) {
            qd81 qd81Var2 = null;
            if (i < length) {
                ed81 ed81Var = ed81VarArr[i];
                synchronized (ed81Var) {
                    if (!ed81Var.x) {
                        qd81Var2 = ed81Var.A;
                    }
                }
                if (qd81Var2 == null) {
                    return;
                } else {
                    i++;
                }
            } else {
                sh71 sh71Var = this.F;
                synchronized (sh71Var) {
                    sh71Var.a = false;
                }
                int length2 = this.L.length;
                tu71[] tu71VarArr = new tu71[length2];
                boolean[] zArr = new boolean[length2];
                int i2 = 0;
                while (true) {
                    int i3 = 1;
                    if (i2 >= length2) {
                        this.Q = new s421(new wx71(tu71VarArr), zArr);
                        this.O = true;
                        e771 e771Var = this.J;
                        e771Var.getClass();
                        e771Var.a((ra71) this);
                        return;
                    }
                    ed81 ed81Var2 = this.L[i2];
                    synchronized (ed81Var2) {
                        qd81Var = ed81Var2.x ? null : ed81Var2.A;
                    }
                    qd81Var.getClass();
                    String str = qd81Var.E;
                    boolean equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str));
                    boolean z = equals || MediaStreamTrack.VIDEO_TRACK_KIND.equals(g681.d(str));
                    zArr[i2] = z;
                    this.P = z | this.P;
                    a11 a11Var = this.K;
                    if (a11Var != null) {
                        if (equals || this.M[i2].b) {
                            cs1 cs1Var = qd81Var.C;
                            cs1 cs1Var2 = cs1Var == null ? new cs1(a11Var) : new cs1((bs1[]) rf71.r(cs1Var.b, new bs1[]{a11Var}));
                            da81 da81Var = new da81(qd81Var);
                            da81Var.i = cs1Var2;
                            qd81Var = new qd81(da81Var);
                        }
                        if (equals && qd81Var.y == -1 && qd81Var.z == -1 && a11Var.b != -1) {
                            da81 da81Var2 = new da81(qd81Var);
                            da81Var2.f = a11Var.b;
                            qd81Var = new qd81(da81Var2);
                        }
                    }
                    ((r281) this.c).getClass();
                    if (qd81Var.H == null) {
                        i3 = 0;
                    }
                    da81 da81Var3 = new da81(qd81Var);
                    da81Var3.D = i3;
                    tu71VarArr[i2] = new tu71(Integer.toString(i2), new qd81(da81Var3));
                    i2++;
                }
            }
        }
    }

    public final void p() {
        c471 c471Var = new c471(this, this.a, this.b, this.E, this, this.F);
        if (this.O) {
            long j = this.c0;
            if (j == -9223372036854775807L) {
                ny61.k();
                return;
            }
            long j2 = this.S;
            if (j2 != -9223372036854775807L && j > j2) {
                this.f0 = true;
                this.c0 = -9223372036854775807L;
                return;
            }
            a871 a871Var = this.R;
            a871Var.getClass();
            long j3 = a871Var.d(this.c0).a.b;
            long j4 = this.c0;
            c471Var.f.a = j3;
            c471Var.i = j4;
            c471Var.h = true;
            c471Var.l = false;
            for (ed81 ed81Var : this.L) {
                ed81Var.s = this.c0;
            }
            this.c0 = -9223372036854775807L;
        }
        this.e0 = n();
        int i = this.U;
        this.w.getClass();
        this.D.c(c471Var, this, i == 7 ? 6 : 3);
        nl81 nl81Var = new nl81(c471Var.j);
        long j5 = c471Var.i;
        long j6 = this.S;
        sc81 sc81Var = this.x;
        sc81Var.g(nl81Var, new pil0(1, -1, null, 0, null, sc81Var.a(j5), sc81Var.a(j6)));
    }

    @Override // defpackage.yg71
    public final void r(a871 a871Var) {
        this.I.post(new fe71(1, this, a871Var));
    }

    @Override // defpackage.ra71
    public final void x(e771 e771Var, long j) {
        this.J = e771Var;
        this.F.c();
        p();
    }

    @Override // defpackage.mp61
    public final void b() {
        for (ed81 ed81Var : this.L) {
            ed81Var.n(true);
            ed81Var.r();
        }
        vi71 vi71Var = this.E;
        if (((n771) vi71Var.c) != null) {
            vi71Var.c = null;
        }
        vi71Var.w = null;
    }

    @Override // defpackage.av81
    public final void a(zl61 zl61Var, long j, long j2) {
        a871 a871Var;
        c471 c471Var = (c471) zl61Var;
        if (this.S == -9223372036854775807L && (a871Var = this.R) != null) {
            boolean b = a871Var.b();
            long b2 = b(true);
            long j3 = b2 == Long.MIN_VALUE ? 0L : b2 + 10000;
            this.S = j3;
            boolean z = this.T;
            vp71 vp71Var = this.z;
            if (j3 == -9223372036854775807L) {
                j3 = vp71Var.X;
            }
            if (vp71Var.W || vp71Var.X != j3 || vp71Var.Y != b || vp71Var.Z != z) {
                vp71Var.X = j3;
                vp71Var.Y = b;
                vp71Var.Z = z;
                vp71Var.W = false;
                yn81 pq81Var = new pq81(vp71Var.X, vp71Var.Y, vp71Var.Z, vp71Var.P);
                if (vp71Var.W) {
                    pq81Var = new oj71(pq81Var);
                }
                vp71Var.a(pq81Var);
            }
        }
        Uri uri = c471Var.b.c;
        nl81 nl81Var = new nl81();
        this.w.getClass();
        long j4 = c471Var.i;
        long j5 = this.S;
        sc81 sc81Var = this.x;
        sc81Var.f(nl81Var, new pil0(1, -1, null, 0, null, sc81Var.a(j4), sc81Var.a(j5)));
        this.f0 = true;
        e771 e771Var = this.J;
        e771Var.getClass();
        e771Var.a((sn61) this);
    }

    @Override // defpackage.av81
    public final void a(zl61 zl61Var, long j, long j2, boolean z) {
        c471 c471Var = (c471) zl61Var;
        Uri uri = c471Var.b.c;
        nl81 nl81Var = new nl81();
        this.w.getClass();
        long j3 = c471Var.i;
        long j4 = this.S;
        sc81 sc81Var = this.x;
        sc81Var.c(nl81Var, new pil0(1, -1, null, 0, null, sc81Var.a(j3), sc81Var.a(j4)));
        if (z) {
            return;
        }
        for (ed81 ed81Var : this.L) {
            ed81Var.n(false);
        }
        if (this.Z > 0) {
            e771 e771Var = this.J;
            e771Var.getClass();
            e771Var.a((sn61) this);
        }
    }

    @Override // defpackage.ra71
    public final void a(long j) {
        m();
        if (this.c0 != -9223372036854775807L) {
            return;
        }
        boolean[] zArr = (boolean[]) this.Q.w;
        int length = this.L.length;
        for (int i = 0; i < length; i++) {
            this.L[i].h(j, zArr[i]);
        }
    }

    @Override // defpackage.yg71
    /* renamed from: a */
    public final void mo495a() {
        this.N = true;
        this.I.post(this.G);
    }
}
