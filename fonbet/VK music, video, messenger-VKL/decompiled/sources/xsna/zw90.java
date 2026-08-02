package xsna;

import android.view.View;

/* compiled from: PerformanceSessionWrapper.kt */
/* loaded from: classes6.dex */
public final class zw90 implements ahn0 {
    public final yw90 a;

    public zw90(yw90 yw90Var) {
        this.a = yw90Var;
    }

    @Override // xsna.ahn0
    public final void d(View view) {
        this.a.a();
    }

    @Override // xsna.ahn0
    public final void e(View view) {
        this.a.d3(view);
    }

    @Override // xsna.ahn0
    public final void f() {
        this.a.stop();
    }

    @Override // xsna.ahn0
    public final void g() {
        this.a.deactivate();
    }

    @Override // xsna.ahn0
    public final void h() {
        this.a.c();
    }

    @Override // xsna.ahn0
    public final void init() {
        this.a.init();
    }

    @Override // xsna.ahn0
    public final void a() {
    }

    @Override // xsna.ahn0
    public final void start() {
    }

    @Override // xsna.ahn0
    public final void c(boolean z) {
    }
}
