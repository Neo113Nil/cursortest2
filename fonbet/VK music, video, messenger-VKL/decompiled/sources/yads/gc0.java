package yads;

import android.view.View;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes10.dex */
public final class gc0 implements ew {
    public final View a;
    public final cw b;
    public final z30 c;
    public final long d;
    public final lw e;
    public final xc2 f;

    public gc0(View view, cw cwVar, z30 z30Var, long j, lw lwVar, xc2 xc2Var) {
        this.a = view;
        this.b = cwVar;
        this.c = z30Var;
        this.d = j;
        this.e = lwVar;
        this.f = xc2Var;
        cwVar.a(d());
    }

    @Override // yads.ew
    public final void a() {
        ((ad2) this.f).d();
    }

    @Override // yads.ew
    public final void b() {
        ((ad2) this.f).b();
    }

    @Override // yads.ew
    public final void c() {
        fc0 fc0Var = new fc0(this.a, this.b, this.c);
        long max = (long) Math.max(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, this.d - this.e.a);
        if (max == 0) {
            this.b.b(this.a);
            return;
        }
        ad2 ad2Var = (ad2) this.f;
        ad2Var.e = this.e;
        ad2Var.a(max, fc0Var);
        this.c.a(y30.d);
    }

    public final View d() {
        return this.a;
    }

    @Override // yads.ew
    public final void invalidate() {
        ((ad2) this.f).a();
    }
}
