package com.yandex.go.places.impl.domain.interactors.organizations;

import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.impl.data.mappers.organizations.h;
import defpackage.cn80;
import defpackage.e2t;
import defpackage.go80;
import defpackage.mdh;
import defpackage.mg80;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wbc0;
import defpackage.wnt;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class b {
    public final cn80 a;
    public final tt2 b;
    public final wnt c;
    public final e2t d;
    public final wbc0 e;
    public final mg80 f;
    public final com.yandex.go.places.impl.data.repositories.organizations.b g;
    public final h h;
    public final go80 i;
    public final j j;

    public b(cn80 cn80Var, tt2 tt2Var, wnt wntVar, e2t e2tVar, wbc0 wbc0Var, mg80 mg80Var, com.yandex.go.places.impl.data.repositories.organizations.b bVar, h hVar, go80 go80Var, j jVar) {
        this.a = cn80Var;
        this.b = tt2Var;
        this.c = wntVar;
        this.d = e2tVar;
        this.e = wbc0Var;
        this.f = mg80Var;
        this.g = bVar;
        this.h = hVar;
        this.i = go80Var;
        this.j = jVar;
    }

    public final Object a(Long l, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new OrganizationsListV2FlexInteractor$createRequestParams$2(this, l, null), continuation);
    }
}
