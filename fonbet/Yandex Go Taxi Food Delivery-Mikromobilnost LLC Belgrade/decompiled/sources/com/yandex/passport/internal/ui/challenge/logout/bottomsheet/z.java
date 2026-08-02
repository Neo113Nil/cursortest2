package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.i1k;
import defpackage.pey;

/* loaded from: classes2.dex */
public final class z implements i1k {
    public final /* synthetic */ pey a;
    public final /* synthetic */ v b;

    public z(pey peyVar, v vVar) {
        this.a = peyVar;
        this.b = vVar;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
    }
}
