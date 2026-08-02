package com.yandex.go.multimodal_route.service;

import com.yandex.go.superapp.tracking.data.e;
import defpackage.bw40;
import defpackage.hyn0;
import defpackage.lz60;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import ru.yandex.taxi.superapp.knownOrder.u;

/* loaded from: classes8.dex */
public final class c implements lz60 {
    public final tse a;
    public final tt2 b;
    public final e c;
    public final u d;
    public final com.yandex.go.multimodal_route.store.a e;
    public final hyn0 f;
    public final com.yandex.go.multimodal_route.interactors.a g;
    public final com.yandex.go.multimodal_route.repositories.b h;
    public final bw40 i;

    public c(tse tseVar, tt2 tt2Var, e eVar, u uVar, com.yandex.go.multimodal_route.store.a aVar, hyn0 hyn0Var, com.yandex.go.multimodal_route.interactors.a aVar2, com.yandex.go.multimodal_route.repositories.b bVar, bw40 bw40Var) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = eVar;
        this.d = uVar;
        this.e = aVar;
        this.f = hyn0Var;
        this.g = aVar2;
        this.h = bVar;
        this.i = bw40Var;
    }

    @Override // defpackage.lz60
    public final void g() {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.a, mdh.b, null, new MultimodalOrderLcpListener$onLargestContentfulPaint$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "MultimodalOrderLcpListener";
    }
}
