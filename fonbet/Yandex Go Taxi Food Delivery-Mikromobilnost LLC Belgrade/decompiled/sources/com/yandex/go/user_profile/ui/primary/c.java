package com.yandex.go.user_profile.ui.primary;

import android.app.Activity;
import android.content.Context;
import defpackage.adf0;
import defpackage.cff0;
import defpackage.el90;
import defpackage.fhf0;
import defpackage.g970;
import defpackage.gky;
import defpackage.jj3;
import defpackage.jqr;
import defpackage.m230;
import defpackage.mff0;
import defpackage.oo2;
import defpackage.pav;
import defpackage.tgf0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u45;
import defpackage.ul;
import defpackage.w030;
import defpackage.xcf0;
import defpackage.xvf0;
import defpackage.y50;
import defpackage.yvf0;
import defpackage.zy11;
import ru.yandex.taxi.am.b0;
import ru.yandex.taxi.settings.profile.UserInfoProfileView;

/* loaded from: classes14.dex */
public final class c extends m230 {
    public final w030 E;
    public final Activity F;
    public final y50 G;
    public final cff0 H;
    public final yvf0 I;
    public final b0 J;
    public final jj3 K;
    public final el90 L;
    public final com.yandex.go.navigation.b M;
    public final ul N;
    public final tgf0 O;
    public final com.yandex.go.user_profile.ui.a P;
    public final boolean Q;

    public c(w030 w030Var, Activity activity, y50 y50Var, cff0 cff0Var, yvf0 yvf0Var, b0 b0Var, jj3 jj3Var, el90 el90Var, com.yandex.go.navigation.b bVar, ul ulVar, tgf0 tgf0Var, com.yandex.go.user_profile.ui.a aVar) {
        super(null);
        this.E = w030Var;
        this.F = activity;
        this.G = y50Var;
        this.H = cff0Var;
        this.I = yvf0Var;
        this.J = b0Var;
        this.K = jj3Var;
        this.L = el90Var;
        this.M = bVar;
        this.N = ulVar;
        this.O = tgf0Var;
        this.P = aVar;
        this.Q = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.Q;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        final b bVar = new b(this);
        tls tlsVar = new tls() { // from class: com.yandex.go.user_profile.ui.primary.a
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                c cVar = c.this;
                com.yandex.go.coroutines.b.g(cVar.o(), null, null, new ProfileRouter$provideModalView$handleAction$1$1(cVar, (adf0) obj2, bVar, null), 3);
                return zy11.a;
            }
        };
        tlsVar.invoke(xcf0.a);
        oo2 oo2Var = this.H.a;
        ProfileModalView profileModalView = new ProfileModalView((Context) ((xvf0) oo2Var.a).get(), tlsVar, (pav) ((xvf0) oo2Var.b).get(), (UserInfoProfileView) ((xvf0) oo2Var.c).get(), (gky) ((xvf0) oo2Var.w).get(), (fhf0) ((g970) oo2Var.x).get());
        tje.N(o(), null, null, new ProfileRouter$provideModalView$$inlined$collectIn$1(new jqr(this.O.a(((mff0) obj).a), new ProfileRouter$provideModalView$1(this, tlsVar, null), 3), null, profileModalView), 3);
        return profileModalView;
    }
}
