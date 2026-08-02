package com.yandex.go.scooters.misc.support;

import defpackage.fva0;
import defpackage.tje;
import defpackage.zw60;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes13.dex */
public final class a extends zw60 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.zw60, defpackage.s45
    public final void a(int i) {
        b bVar = this.a;
        fva0.b(bVar.G, "ScootersSupport", PerformanceAnalytics$Type.Loading, null, 4);
        tje.N(bVar.o(), null, null, new ScootersDefaultSupportRouter$provideModalView$2$1$onModalViewAppear$1(bVar, null), 3);
    }
}
