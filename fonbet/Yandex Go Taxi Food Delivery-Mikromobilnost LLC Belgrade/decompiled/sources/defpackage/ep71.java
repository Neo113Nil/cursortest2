package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import yads.bl2;
import yads.cs1;
import yads.jc2;
import yads.t31;
import yads.zm0;

/* loaded from: classes7.dex */
public final class ep71 implements xl61 {
    public rl71 A;
    public final ut71 a;
    public final ie81 b;
    public final uk81 c;
    public final vmn0 w;
    public final SparseArray x;
    public xrr y;
    public ek71 z;

    public ep71(ut71 ut71Var) {
        ut71Var.getClass();
        this.a = ut71Var;
        int i = rf71.a;
        Looper myLooper = Looper.myLooper();
        this.y = new xrr(new CopyOnWriteArraySet(), myLooper == null ? Looper.getMainLooper() : myLooper, ut71Var, new dp71(25));
        ie81 ie81Var = new ie81();
        this.b = ie81Var;
        this.c = new uk81();
        this.w = new vmn0(ie81Var);
        this.x = new SparseArray();
    }

    public final wc71 A() {
        return w((v281) this.w.y);
    }

    public final wc71 a() {
        return w((v281) this.w.w);
    }

    @Override // defpackage.ub81
    public final void b(int i) {
        ek71 ek71Var = this.z;
        ek71Var.getClass();
        vmn0 vmn0Var = this.w;
        vmn0Var.w = vmn0.c(ek71Var, (t31) vmn0Var.b, (v281) vmn0Var.x, (ie81) vmn0Var.a);
        ek71Var.v();
        vmn0Var.i(ek71Var.b0.a);
        y(a(), 0, new dp71(9));
    }

    @Override // defpackage.sf81
    public final void c(int i, v281 v281Var, nl81 nl81Var, pil0 pil0Var) {
        y(v(i, v281Var), 1001, new yx61(22));
    }

    @Override // defpackage.ub81
    public final void d(boolean z, int i) {
        y(a(), 30, new yx61(28));
    }

    @Override // defpackage.ub81
    public final void e(kv71 kv71Var) {
        y(a(), 12, new dp71(22));
    }

    @Override // defpackage.ub81
    public final void f(jc2 jc2Var) {
        rg71 rg71Var;
        wc71 a = (!(jc2Var instanceof zm0) || (rg71Var = ((zm0) jc2Var).i) == null) ? a() : w(new v281(rg71Var));
        y(a, 10, new gp51(a, (Object) jc2Var, 18));
    }

    @Override // defpackage.ub81
    public final void g(jc2 jc2Var) {
        rg71 rg71Var;
        y((!(jc2Var instanceof zm0) || (rg71Var = ((zm0) jc2Var).i) == null) ? a() : w(new v281(rg71Var)), 10, new yx61(16));
    }

    @Override // defpackage.ub81
    public final void h(op81 op81Var, int i) {
        y(a(), 1, new dp71(20));
    }

    @Override // defpackage.ub81
    public final void i(ty71 ty71Var) {
        wc71 A = A();
        y(A, 25, new wa71(A, ty71Var));
    }

    @Override // defpackage.ub81
    public final void j(o881 o881Var) {
        y(a(), 13, new dp71(13));
    }

    @Override // defpackage.sf81
    public final void k(int i, v281 v281Var, nl81 nl81Var, pil0 pil0Var) {
        y(v(i, v281Var), 1002, new dp71(1));
    }

    @Override // defpackage.ub81
    public final void l(cs1 cs1Var) {
        y(a(), 28, new dp71(12));
    }

    @Override // defpackage.sf81
    public final void m(int i, v281 v281Var, nl81 nl81Var, pil0 pil0Var) {
        y(v(i, v281Var), 1000, new yx61(13));
    }

    @Override // defpackage.sf81
    public final void n(int i, v281 v281Var, nl81 nl81Var, pil0 pil0Var, IOException iOException, boolean z) {
        wc71 v = v(i, v281Var);
        y(v, 1003, new gp51(v, nl81Var, pil0Var, iOException, z));
    }

    @Override // defpackage.ub81
    public final void o(af81 af81Var, af81 af81Var2, int i) {
        ek71 ek71Var = this.z;
        ek71Var.getClass();
        vmn0 vmn0Var = this.w;
        vmn0Var.w = vmn0.c(ek71Var, (t31) vmn0Var.b, (v281) vmn0Var.x, (ie81) vmn0Var.a);
        wc71 a = a();
        y(a, 11, new vno(a, i, af81Var, af81Var2));
    }

    @Override // defpackage.ub81
    public final void onCues(List list) {
        y(a(), 27, new dp71(14));
    }

    @Override // defpackage.ub81
    public final void onIsLoadingChanged(boolean z) {
        y(a(), 3, new dp71(19));
    }

    @Override // defpackage.ub81
    public final void onIsPlayingChanged(boolean z) {
        y(a(), 7, new dp71(2));
    }

    @Override // defpackage.ub81
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        y(a(), 5, new yx61(20));
    }

    @Override // defpackage.ub81
    public final void onPlaybackStateChanged(int i) {
        y(a(), 4, new dp71(7));
    }

    @Override // defpackage.ub81
    public final void onPlaybackSuppressionReasonChanged(int i) {
        y(a(), 6, new dp71(4));
    }

    @Override // defpackage.ub81
    public final void onPlayerStateChanged(boolean z, int i) {
        y(a(), -1, new yx61(29));
    }

    @Override // defpackage.ub81
    public final void onSkipSilenceEnabledChanged(boolean z) {
        y(A(), 23, new dp71(15));
    }

    @Override // defpackage.ub81
    public final void onSurfaceSizeChanged(int i, int i2) {
        y(A(), 24, new dp71(23));
    }

    @Override // defpackage.ub81
    public final void onVolumeChanged(float f) {
        y(A(), 22, new dp71(17));
    }

    @Override // defpackage.ub81
    public final void p(bf71 bf71Var) {
        y(a(), 27, new yx61(17));
    }

    @Override // defpackage.ub81
    public final void q(dd71 dd71Var) {
        y(a(), 29, new yx61(26));
    }

    @Override // defpackage.ub81
    public final void r(ph81 ph81Var) {
        y(a(), 2, new dp71(10));
    }

    @Override // defpackage.sf81
    public final void s(int i, v281 v281Var, pil0 pil0Var) {
        wc71 v = v(i, v281Var);
        y(v, 1004, new gs51(10, v, pil0Var));
    }

    @Override // defpackage.ub81
    public final void t(oi61 oi61Var) {
        y(a(), 14, new dp71(18));
    }

    @Override // defpackage.sf81
    public final void u(int i, v281 v281Var, pil0 pil0Var) {
        y(v(i, v281Var), 1005, new yx61(14));
    }

    public final wc71 v(int i, v281 v281Var) {
        this.z.getClass();
        if (v281Var != null) {
            return ((yn81) ((bl2) this.w.c).get(v281Var)) != null ? w(v281Var) : x(yn81.b, i, v281Var);
        }
        ek71 ek71Var = this.z;
        ek71Var.v();
        yn81 yn81Var = ek71Var.b0.a;
        if (i >= yn81Var.b()) {
            yn81Var = yn81.b;
        }
        return x(yn81Var, i, null);
    }

    public final wc71 w(v281 v281Var) {
        this.z.getClass();
        yn81 yn81Var = v281Var == null ? null : (yn81) ((bl2) this.w.c).get(v281Var);
        if (v281Var != null && yn81Var != null) {
            return x(yn81Var, yn81Var.a(v281Var.a, this.b).c, v281Var);
        }
        int q = this.z.q();
        ek71 ek71Var = this.z;
        ek71Var.v();
        yn81 yn81Var2 = ek71Var.b0.a;
        if (q >= yn81Var2.b()) {
            yn81Var2 = yn81.b;
        }
        return x(yn81Var2, q, null);
    }

    public final wc71 x(yn81 yn81Var, int i, v281 v281Var) {
        v281 v281Var2 = yn81Var.c() ? null : v281Var;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ek71 ek71Var = this.z;
        ek71Var.v();
        boolean z = yn81Var.equals(ek71Var.b0.a) && i == this.z.q();
        long j = 0;
        if (v281Var2 == null || !v281Var2.a()) {
            if (z) {
                j = this.z.n();
            } else if (!yn81Var.c()) {
                j = rf71.u(yn81Var.a(i, this.c, 0L).E);
            }
        } else if (z && this.z.o() == v281Var2.b && this.z.p() == v281Var2.c) {
            ek71 ek71Var2 = this.z;
            ek71Var2.v();
            j = rf71.u(ek71Var2.a(ek71Var2.b0));
        }
        long j2 = j;
        v281 v281Var3 = (v281) this.w.w;
        ek71 ek71Var3 = this.z;
        ek71Var3.v();
        yn81 yn81Var2 = ek71Var3.b0.a;
        int q = this.z.q();
        ek71 ek71Var4 = this.z;
        ek71Var4.v();
        long u = rf71.u(ek71Var4.a(ek71Var4.b0));
        ek71 ek71Var5 = this.z;
        ek71Var5.v();
        return new wc71(elapsedRealtime, yn81Var, i, v281Var2, j2, yn81Var2, q, v281Var3, u, rf71.u(ek71Var5.b0.q));
    }

    public final void y(wc71 wc71Var, int i, ov71 ov71Var) {
        this.x.put(i, wc71Var);
        xrr xrrVar = this.y;
        xrrVar.b(i, ov71Var);
        xrrVar.a();
    }

    public final void z(ek71 ek71Var, Looper looper) {
        if (this.z != null && !((t31) this.w.b).isEmpty()) {
            ny61.k();
            return;
        }
        ek71Var.getClass();
        this.z = ek71Var;
        ((xb71) this.a).getClass();
        this.A = new rl71(new Handler(looper, null));
        xrr xrrVar = this.y;
        gs51 gs51Var = new gs51(9, this, ek71Var);
        this.y = new xrr((CopyOnWriteArraySet) xrrVar.y, looper, (ut71) xrrVar.c, gs51Var);
    }
}
