package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class t42 implements t31 {
    public final boolean a;

    public t42(v9 v9Var) {
        this.a = epx.f(v9Var.b(), s42.c.a()) || epx.f(v9Var.b(), s42.d.a());
    }

    @Override // yads.t31
    public final boolean a() {
        return this.a;
    }
}
