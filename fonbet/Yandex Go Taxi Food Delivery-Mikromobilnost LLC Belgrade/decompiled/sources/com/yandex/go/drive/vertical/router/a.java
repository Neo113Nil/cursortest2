package com.yandex.go.drive.vertical.router;

import com.yandex.go.preorder.navigation.g;
import com.yandex.go.route.interactor.b;
import defpackage.c0g;
import defpackage.gyc;
import defpackage.gzf;
import defpackage.h55;
import defpackage.hxx;
import defpackage.i6r;
import defpackage.iz1;
import defpackage.jhm;
import defpackage.mhm;
import defpackage.q5z;
import defpackage.qhm;
import defpackage.tje;
import defpackage.yvf0;

/* loaded from: classes12.dex */
public final class a extends h55 {
    public final yvf0 D;
    public final i6r E;
    public final b F;
    public gzf G;

    public a(yvf0 yvf0Var, i6r i6rVar, b bVar) {
        super(null);
        this.D = yvf0Var;
        this.E = i6rVar;
        this.F = bVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.G = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        mhm mhmVar = (mhm) obj;
        String str = mhmVar.a;
        str.getClass();
        i6r i6rVar = this.E;
        i6rVar.getClass();
        gzf gzfVar = new gzf(i6rVar, str);
        this.G = gzfVar;
        tje.N(o(), null, null, new DriveVerticalRootRouterImpl$onLaunch$1(gzfVar, null), 3);
        com.yandex.go.coroutines.b.g(o(), null, null, new DriveVerticalRootRouterImpl$onLaunch$2(gzfVar, this, null), 3);
        P(mhmVar);
    }

    public final void P(mhm mhmVar) {
        gzf gzfVar = this.G;
        if (gzfVar == null) {
            return;
        }
        gyc gycVar = new gyc(gzfVar.c);
        c0g c0gVar = (c0g) gzfVar.a;
        com.yandex.go.mainscreen.superapp.impl.fragment.a aVar = (com.yandex.go.mainscreen.superapp.impl.fragment.a) c0gVar.Ng.get();
        q5z.h(aVar);
        g gVar = (g) c0gVar.G.get();
        q5z.h(gVar);
        E(new iz1(gycVar, aVar, gVar, c0gVar.A.a.R()), new jhm(mhmVar.b), new qhm(this, mhmVar), hxx.a);
    }
}
