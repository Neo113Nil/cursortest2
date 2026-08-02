package com.yandex.taxi.go_platform.switcher;

import defpackage.pzt0;
import defpackage.tje;
import defpackage.tqt;
import defpackage.tse;
import defpackage.yw60;

/* loaded from: classes8.dex */
public final class a implements yw60 {
    public final tse a;
    public final tqt b;
    public pzt0 c;

    public a(tse tseVar, tqt tqtVar) {
        this.a = tseVar;
        this.b = tqtVar;
    }

    @Override // defpackage.yw60
    public final void e() {
        this.c = tje.N(this.a, null, null, new GoPlatformLifecycleListener$onAppCreated$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "GoPlatformLifecycleListener";
    }

    @Override // defpackage.yw60
    public final void l() {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }
}
