package xsna;

import xsna.i3x0;

/* compiled from: VkVoipDelegateManager.kt */
/* loaded from: classes7.dex */
public final class b1w0 implements i3x0 {
    public final lqw0 a;
    public final a1w0 b;
    public final x0w0 c;
    public final y0w0 d = new y0w0();
    public final z0w0 e = new z0w0();

    public b1w0(a000 a000Var, c1w0 c1w0Var, lqw0 lqw0Var) {
        this.a = lqw0Var;
        this.b = new a1w0(a000Var);
        this.c = new x0w0(a000Var, c1w0Var, lqw0Var);
    }

    @Override // xsna.i3x0
    public final z0w0 a() {
        return this.e;
    }

    @Override // xsna.i3x0
    public final y0w0 b() {
        return this.d;
    }

    @Override // xsna.i3x0
    public final x0w0 getBackground() {
        return this.c;
    }

    @Override // xsna.i3x0
    public final i3x0.c getConfiguration() {
        return this.a;
    }

    @Override // xsna.i3x0
    public final a1w0 h() {
        return this.b;
    }
}
