package com.yandex.go.places.organization.card.impl.data.repositories;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.organization.card.impl.data.repositories.OrganizationCardsSliderRepository", f = "OrganizationCardsSliderRepository.kt", l = {38, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 154, 67, 167}, m = "loadOrganizationsList", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardsSliderRepository$loadOrganizationsList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardsSliderRepository$loadOrganizationsList$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, false, this);
    }
}
