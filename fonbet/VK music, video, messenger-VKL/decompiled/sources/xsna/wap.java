package xsna;

import android.content.Context;
import xsna.ang0;
import xsna.nc30;
import xsna.p4h0;

/* compiled from: ElementGestureDetector.kt */
/* loaded from: classes4.dex */
public final class wap implements p4h0.a, nc30.a, ang0.a {
    public skp0 a;
    public final p4h0 b;
    public final nc30 c;
    public final ang0 d;

    public wap(Context context) {
        p4h0 p4h0Var = new p4h0(context);
        this.b = p4h0Var;
        nc30 nc30Var = new nc30();
        this.c = nc30Var;
        ang0 ang0Var = new ang0();
        this.d = ang0Var;
        p4h0Var.a = this;
        nc30Var.e = this;
        ang0Var.h = this;
    }

    @Override // xsna.ang0.a
    public final void a(float f, float f2, float f3) {
        skp0 skp0Var = this.a;
        if (skp0Var != null) {
            skp0Var.g(f, f2, f3);
        }
    }

    @Override // xsna.nc30.a
    public final void b(float f, float f2) {
        skp0 skp0Var = this.a;
        if (skp0Var != null) {
            skp0Var.e(f, f2);
        }
    }

    @Override // xsna.p4h0.a
    public final void onScale(float f, float f2, float f3) {
        skp0 skp0Var = this.a;
        if (skp0Var != null) {
            skp0Var.f(f, f2, f3);
        }
    }
}
