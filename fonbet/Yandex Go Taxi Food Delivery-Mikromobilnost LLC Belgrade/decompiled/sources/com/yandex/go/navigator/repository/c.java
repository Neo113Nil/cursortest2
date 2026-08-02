package com.yandex.go.navigator.repository;

import defpackage.jqr;
import defpackage.mg50;
import defpackage.mth;
import defpackage.uyd;
import defpackage.vff;
import defpackage.zuj0;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* loaded from: classes12.dex */
public final class c {
    public final mg50 a;
    public final zuj0 b;
    public boolean c;
    public final jqr d;

    public c(mg50 mg50Var, zuj0 zuj0Var, com.yandex.go.navigator.domain.o oVar, uyd uydVar, com.yandex.go.navigator.domain.traffic_line.a aVar, vff vffVar) {
        this.a = mg50Var;
        this.b = zuj0Var;
        this.d = new jqr(new m0(new b(new kotlinx.coroutines.flow.n(oVar.f, new GuidanceProgressContentRepository$routeDataFlow$1(oVar, null))), new jqr(kotlinx.coroutines.flow.e.I(com.yandex.go.coroutines.b.d(new mth(new m0(vffVar.c, com.yandex.go.coroutines.b.d(uydVar.b, new GuidanceProgressContentRepository$special$$inlined$start$1(2, null)), new GuidanceProgressContentRepository$trafficLineContentFlow$2(3, null)), 6), new GuidanceProgressContentRepository$special$$inlined$start$2(EmptyList.a, null)), new GuidanceProgressContentRepository$trafficLineContentFlow$3(2, aVar, com.yandex.go.navigator.domain.traffic_line.a.class, PolicyMappingsExtension.MAP, "map(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)), new GuidanceProgressContentRepository$trafficLineContentFlow$4(this, null), 3), new GuidanceProgressContentRepository$contentFlow$1(this, null)), new GuidanceProgressContentRepository$contentFlow$2(this, null), 3);
    }
}
