package com.yandex.go.quark.soul.router;

import defpackage.g9t0;
import defpackage.h55;
import defpackage.n9t0;
import defpackage.npe0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.vgg0;
import defpackage.yvf0;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.activity.MainActivity;

/* loaded from: classes13.dex */
public final class c extends h55 {
    public final MainActivity D;
    public final vgg0 E;
    public final yvf0 F;
    public final g9t0 G;
    public pzt0 H;

    public c(MainActivity mainActivity, vgg0 vgg0Var, npe0 npe0Var, g9t0 g9t0Var) {
        super(null);
        this.D = mainActivity;
        this.E = vgg0Var;
        this.F = npe0Var;
        this.G = g9t0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new SoulAiAssistantWarmUpRouterImpl$onLaunch$1(this, (n9t0) obj, null), 1);
    }
}
