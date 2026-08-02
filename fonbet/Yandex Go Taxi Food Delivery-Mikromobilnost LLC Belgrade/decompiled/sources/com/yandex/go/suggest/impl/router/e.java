package com.yandex.go.suggest.impl.router;

import android.net.Uri;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.suggest.impl.data.experiments.j;
import defpackage.fwx0;
import defpackage.i6r;
import defpackage.kgw0;
import defpackage.mgw0;
import defpackage.mjv0;
import defpackage.ngw0;
import defpackage.ogw0;
import defpackage.qoi0;
import defpackage.swp0;
import defpackage.tje;
import defpackage.u7r;
import defpackage.y9y0;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class e extends BaseRootNavigationRouter implements ngw0 {
    public final u7r D;
    public final fwx0 E;
    public final y9y0 F;
    public final mjv0 G;
    public final j H;
    public final i6r I;
    public Uri J;
    public final BaseRootNavigationRouter.a K = new BaseRootNavigationRouter.a(Screen.SUPERAPP_SUGGEST, BaseRootNavigationRouter.Background.NONE, null, 12);
    public swp0 L;

    public e(u7r u7rVar, fwx0 fwx0Var, y9y0 y9y0Var, mjv0 mjv0Var, j jVar, i6r i6rVar) {
        this.D = u7rVar;
        this.E = fwx0Var;
        this.F = y9y0Var;
        this.G = mjv0Var;
        this.H = jVar;
        this.I = i6rVar;
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        swp0 swp0Var = this.L;
        if (swp0Var != null) {
            swp0Var.b = false;
        }
        this.J = null;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.G.a.remove(qoi0.a(e.class));
        swp0 swp0Var = this.L;
        String a = swp0Var != null ? swp0Var.a() : null;
        u7r u7rVar = this.D;
        u7rVar.getClass();
        HashMap hashMap = new HashMap();
        if (a != null) {
            hashMap.put("search_session_id", a);
        }
        u7rVar.a.a("FindInGoSearch.Closed", hashMap, 2, new HashMap());
        this.L = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        mgw0 mgw0Var = (mgw0) obj;
        this.G.a.add(qoi0.a(e.class));
        kgw0 kgw0Var = mgw0Var instanceof kgw0 ? (kgw0) mgw0Var : null;
        this.J = kgw0Var != null ? kgw0Var.a() : null;
        tje.N(o(), null, null, new SuperappSuggestRouterImpl$onLaunch$1(this, new ogw0(this), null), 3);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.K;
    }
}
