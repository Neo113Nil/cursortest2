package com.yandex.go.user_profile.fullscreen.router;

import defpackage.bs21;
import defpackage.h3y;
import defpackage.h55;
import defpackage.mff0;
import defpackage.tje;
import defpackage.yvf0;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes14.dex */
public final class a extends h55 {
    public final h3y D;
    public final bs21 E;
    public final yvf0 F;

    public a(h3y h3yVar, bs21 bs21Var, yvf0 yvf0Var) {
        super(null);
        this.D = h3yVar;
        this.E = bs21Var;
        this.F = yvf0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new UserProfileFeatureRouter$onLaunch$1(this, (mff0) obj, null), 1);
    }
}
