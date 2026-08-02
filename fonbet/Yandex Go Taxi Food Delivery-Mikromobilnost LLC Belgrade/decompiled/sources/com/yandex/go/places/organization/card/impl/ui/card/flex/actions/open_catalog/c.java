package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_catalog;

import com.yandex.go.places.models.data.entities.network.actions.OpenCatalogFlexAction;
import defpackage.dac0;
import defpackage.dw;
import defpackage.ht10;
import defpackage.jsj;
import defpackage.kr;
import defpackage.n6u;
import defpackage.oe80;
import defpackage.tse;
import defpackage.wbc0;
import defpackage.zg80;

/* loaded from: classes13.dex */
public final class c implements dw {
    public final ht10 A;
    public final dac0 a;
    public final com.yandex.go.places.experiments.flex.b b;
    public final zg80 c;
    public final tse w;
    public final wbc0 x;
    public final jsj y;
    public final oe80 z;

    public c(dac0 dac0Var, com.yandex.go.places.experiments.flex.b bVar, zg80 zg80Var, tse tseVar, wbc0 wbc0Var, jsj jsjVar, oe80 oe80Var, ht10 ht10Var) {
        this.a = dac0Var;
        this.b = bVar;
        this.c = zg80Var;
        this.w = tseVar;
        this.x = wbc0Var;
        this.y = jsjVar;
        this.z = oe80Var;
        this.A = ht10Var;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        com.yandex.go.coroutines.b.g(this.w, null, null, new OpenCatalogActionHandler$handle$1(this, (OpenCatalogFlexAction) krVar, null), 3);
    }
}
