package defpackage;

import android.content.Context;
import com.yandex.go.about.domain.d;

/* loaded from: classes12.dex */
public final class c5 extends pgd {
    public final Context F;
    public final w030 G;
    public final d H;
    public final fwf I;
    public final v3u0 J;
    public final p1b K;
    public k20 L;

    public c5(f6 f6Var, Context context, w030 w030Var, d dVar, fwf fwfVar, v3u0 v3u0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = dVar;
        this.I = fwfVar;
        this.J = v3u0Var;
        this.K = new p1b(f6Var, new y4(1, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((zy11) obj);
        this.L = this.J.a(this);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((zy11) obj);
        k20 k20Var = this.L;
        if (k20Var != null) {
            k20Var.cancel();
        }
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
