package com.yandex.go.navigator.main_screen;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.go.navigator.analitycs.Screen;
import com.yandex.go.navigator.domain.FocusMode;
import com.yandex.go.navigator.repository.TimeOutMode;
import defpackage.bkm;
import defpackage.eb50;
import defpackage.ho21;
import defpackage.ip11;
import defpackage.j700;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.q850;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import defpackage.ynn;
import defpackage.yvf0;
import defpackage.zb00;
import defpackage.zmh;

/* loaded from: classes12.dex */
public final class i extends pgd {
    public final Context F;
    public final w030 G;
    public final zb00 H;
    public final yvf0 I;
    public final com.yandex.go.navigator.a J;
    public final com.yandex.go.navigator.driving.f K;
    public final com.yandex.go.navigator.repository.o L;
    public final com.yandex.go.navigator.domain.e M;
    public final bkm N;
    public final q850 O;
    public final eb50 P;
    public boolean Q;
    public final Typeface R;
    public final mu5 S;

    public i(l lVar, k kVar, Context context, w030 w030Var, zb00 zb00Var, yvf0 yvf0Var, com.yandex.go.navigator.a aVar, com.yandex.go.navigator.driving.f fVar, com.yandex.go.navigator.repository.o oVar, com.yandex.go.navigator.domain.e eVar, bkm bkmVar, q850 q850Var, eb50 eb50Var, ip11 ip11Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = zb00Var;
        this.I = yvf0Var;
        this.J = aVar;
        this.K = fVar;
        this.L = oVar;
        this.M = eVar;
        this.N = bkmVar;
        this.O = q850Var;
        this.P = eb50Var;
        this.R = ((zmh) ip11Var).f(context);
        this.S = new mu5(new ynn(24, this, lVar, kVar));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        j700 j700Var = (j700) obj;
        super.G(j700Var);
        if (j700Var.a) {
            tje.N(o(), null, null, new MainModalRouter$onAttach$1(this, null), 3);
        }
        TimeOutMode timeOutMode = TimeOutMode.SHORT_TIMEOUT;
        com.yandex.go.navigator.repository.o oVar = this.L;
        oVar.b = timeOutMode;
        tje.N(o(), null, null, new MainModalRouter$listenCurrentSpeed$$inlined$safeCollectIn$1(this.O.a(), null, this), 3);
        this.M.a(FocusMode.FREE);
        oVar.a.a = true;
        oVar.a();
        this.P.a = Screen.Main;
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((j700) obj);
        TimeOutMode timeOutMode = TimeOutMode.SHORT_TIMEOUT;
        com.yandex.go.navigator.repository.o oVar = this.L;
        oVar.b = timeOutMode;
        ho21 ho21Var = oVar.a;
        ho21Var.a = false;
        ho21Var.b.b();
        oVar.c = false;
        this.K.b();
        this.P.a = null;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        com.yandex.go.navigator.repository.o oVar = this.L;
        ho21 ho21Var = oVar.a;
        ho21Var.a = false;
        ho21Var.b.b();
        oVar.c = false;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.L.a.a = true;
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.S;
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
