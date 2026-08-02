package com.yandex.go.navigation;

import com.yandex.go.experiment.h;
import defpackage.e5g;
import defpackage.fr21;
import defpackage.g92;
import defpackage.gtq0;
import defpackage.h55;
import defpackage.hr21;
import defpackage.iw8;
import defpackage.m950;
import defpackage.nr21;
import defpackage.pkf;
import defpackage.tje;
import defpackage.wq21;
import defpackage.yq21;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class b extends h55 implements m950 {
    public final e5g D;
    public final wq21 E;
    public final fr21 F;
    public volatile iw8 G;

    public b(e5g e5gVar, wq21 wq21Var, fr21 fr21Var) {
        super(null);
        this.D = e5gVar;
        this.E = wq21Var;
        this.F = fr21Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.G = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        hr21 hr21Var = (hr21) obj;
        if (!hr21Var.a()) {
            P(hr21Var);
        } else {
            tje.N(o(), null, null, new UserPhotoUploadingRouterImpl$onLaunch$$inlined$safeCollectIn$1(e.T(new m0(com.yandex.go.coroutines.b.k(e.T(new h(this.E.a().a()), 1), 30000L, new g92(2, Boolean.FALSE)), new g92(2, hr21Var), new UserPhotoUploadingRouterImpl$onLaunch$1()), 1), null, this), 3);
        }
    }

    public final void P(hr21 hr21Var) {
        iw8 iw8Var = this.G;
        if (iw8Var == null) {
            iw8Var = pkf.e(this.D, hr21Var.b());
            this.G = iw8Var;
        }
        if (gtq0.u(iw8Var.a())) {
            return;
        }
        A(iw8Var.a(), new yq21(hr21Var.c(), hr21Var.b()), new nr21(this));
    }
}
