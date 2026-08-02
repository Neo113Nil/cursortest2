package com.yandex.go.superapp.order.multi.old.provider;

import androidx.lifecycle.Lifecycle;
import defpackage.a2f0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes8.dex */
public final class h implements a2f0 {
    public final g a;
    public final Lifecycle b;
    public final tse c;

    public h(g gVar, Lifecycle lifecycle, tse tseVar) {
        this.a = gVar;
        this.b = lifecycle;
        this.c = tseVar;
    }

    @Override // defpackage.a2f0
    public final void c() {
        tje.N(this.c, null, null, new MultiOrderProviderStarter$onActivityCreate$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "MultiOrderProviderStarter";
    }
}
