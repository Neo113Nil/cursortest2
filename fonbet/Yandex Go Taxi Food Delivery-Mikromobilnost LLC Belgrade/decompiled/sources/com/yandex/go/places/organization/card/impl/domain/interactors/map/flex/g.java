package com.yandex.go.places.organization.card.impl.domain.interactors.map.flex;

import defpackage.iaq0;
import defpackage.pwy0;
import defpackage.qf80;
import defpackage.ti80;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u55;
import defpackage.uyj;
import defpackage.yac0;

/* loaded from: classes13.dex */
public final class g extends u55 {
    public final qf80 h;
    public final yac0 i;

    public g(qf80 qf80Var, yac0 yac0Var, boolean z, com.yandex.go.places.map.data.mappers.a aVar, com.yandex.go.places.map.data.repositories.h hVar, com.yandex.go.places.map.domain.layer.c cVar, tt2 tt2Var, iaq0 iaq0Var, pwy0 pwy0Var) {
        super(aVar, hVar, cVar, tt2Var, iaq0Var, z, pwy0Var);
        this.h = qf80Var;
        this.i = yac0Var;
    }

    @Override // defpackage.u55
    public final tpr b(ti80 ti80Var) {
        com.yandex.go.places.organization.card.impl.domain.interactors.map.common.b bVar = new com.yandex.go.places.organization.card.impl.domain.interactors.map.common.b(kotlinx.coroutines.flow.e.I(new b(this.h.b, ti80Var), new OrganizationCardFlexMapInteractor$getSelectedMapObjectIdFlow$2(this, null)), this);
        this.d.getClass();
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.F(bVar, uyj.a));
    }

    @Override // defpackage.u55
    public final tpr c(ti80 ti80Var) {
        return kotlinx.coroutines.flow.e.t(new f(new d(this.h.b, ti80Var)));
    }
}
