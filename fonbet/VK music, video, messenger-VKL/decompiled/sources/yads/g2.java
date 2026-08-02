package yads;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.widget.RelativeLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.oek0;
import xsna.oqx0;

/* loaded from: classes10.dex */
public final class g2 implements h2, kz {
    public final Context a;
    public final RelativeLayout b;
    public final Window c;
    public final x12 d;
    public final v9 e;
    public final f2 f;
    public final d4 g;
    public final qu2 h;
    public final ay0 i;
    public final fy0 j;
    public final qy0 k;

    public g2(Context context, RelativeLayout relativeLayout, Window window, x12 x12Var, v9 v9Var, q2 q2Var, b2 b2Var, d4 d4Var, ov2 ov2Var, int i, qu2 qu2Var, ay0 ay0Var, fy0 fy0Var) {
        this.a = context;
        this.b = relativeLayout;
        this.c = window;
        this.d = x12Var;
        this.e = v9Var;
        this.f = q2Var;
        this.g = d4Var;
        this.h = qu2Var;
        this.i = ay0Var;
        this.j = fy0Var;
        this.k = new vy0(context, v9Var, relativeLayout, this, b2Var, i, q2Var, d4Var, ov2Var).a(context, x12Var, this);
    }

    @Override // yads.h2
    public final void a() {
        ((q2) this.f).a(2, null);
    }

    @Override // yads.h2
    public final void b() {
        ((q2) this.f).a(3, null);
    }

    @Override // yads.h2
    public final void c() {
        if (this.g.a != e00.i) {
            this.b.setBackground(u9.a);
        }
        this.k.c();
        ((q2) this.f).a(0, null);
        ((q2) this.f).a(5, null);
    }

    @Override // yads.h2
    public final boolean d() {
        ay0 ay0Var = this.i;
        ay0Var.getClass();
        qu2 a = gx2.a().a(ay0Var.a);
        return a != null && a.s;
    }

    @Override // yads.kz
    public final void e() {
        ((q2) this.f).a.finish();
    }

    @Override // yads.h2
    public final void f() {
        qu2 qu2Var;
        ((q2) this.f).a(this.a.getResources().getConfiguration().orientation == 1 ? 7 : 6);
        this.c.requestFeature(1);
        this.c.addFlags(1024);
        this.c.addFlags(C.DEFAULT_MUXED_BUFFER_SIZE);
        if (this.e.F || ((qu2Var = this.h) != null && qu2Var.H0)) {
            fy0 fy0Var = this.j;
            Window window = this.c;
            fy0Var.getClass();
            oek0 oek0Var = new oek0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            oqx0.g fVar = i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
            fVar.g(2);
            fVar.b(2);
        }
        this.j.a(this.c, this.b);
    }

    @Override // yads.h2
    public final void g() {
        this.k.invalidate();
    }

    @Override // yads.h2
    public final void onAdClosed() {
        this.d.destroy();
        ((q2) this.f).a(4, null);
    }
}
