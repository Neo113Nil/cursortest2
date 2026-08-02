package defpackage;

import android.content.Context;
import com.yandex.go.information.domain.c;
import com.yandex.go.information.domain.h;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class buv extends pgd {
    public final h F;
    public final Context G;
    public final w030 H;
    public final c I;
    public final v3u0 J;
    public final d2g K;
    public final eqh L;
    public final d2g M;
    public final y50 N;
    public final mu5 O;
    public k20 P;

    public buv(h hVar, Context context, w030 w030Var, c cVar, v3u0 v3u0Var, d2g d2gVar, eqh eqhVar, d2g d2gVar2, y50 y50Var) {
        super(0);
        this.F = hVar;
        this.G = context;
        this.H = w030Var;
        this.I = cVar;
        this.J = v3u0Var;
        this.K = d2gVar;
        this.L = eqhVar;
        this.M = d2gVar2;
        this.N = y50Var;
        this.O = new mu5(new gau(15, this));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        r0 r0Var = this.F.f;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        k20 k20Var = this.P;
        if (k20Var != null) {
            k20Var.cancel();
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        r0 r0Var = this.F.f;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.P = this.J.a(this);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.O;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.H;
    }
}
