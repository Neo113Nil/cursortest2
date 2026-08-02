package defpackage;

import android.content.Context;
import com.yandex.go.chargers.discounts.list.ui.h;

/* loaded from: classes12.dex */
public final class lv9 extends pgd {
    public final Context F;
    public final txf G;
    public final w030 H;
    public final txf I;
    public final h J;
    public final av9 K;
    public final yvf0 L;
    public final boj0 M;
    public final yvf0 N;
    public final io9 O;
    public final c29 P;
    public final mu5 Q;

    public lv9(Context context, txf txfVar, w030 w030Var, txf txfVar2, h hVar, av9 av9Var, yc ycVar, boj0 boj0Var, txf txfVar3) {
        super(0);
        this.F = context;
        this.G = txfVar;
        this.H = w030Var;
        this.I = txfVar2;
        this.J = hVar;
        this.K = av9Var;
        this.L = ycVar;
        this.M = boj0Var;
        this.N = txfVar3;
        this.O = new io9(this);
        this.P = new c29(5, this);
        this.Q = new mu5(new od9(7, this));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.K.c = ((hw9) obj).d;
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.Q;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.H;
    }
}
