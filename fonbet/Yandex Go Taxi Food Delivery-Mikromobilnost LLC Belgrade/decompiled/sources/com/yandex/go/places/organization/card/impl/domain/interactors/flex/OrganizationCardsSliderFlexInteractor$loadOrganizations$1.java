package com.yandex.go.places.organization.card.impl.domain.interactors.flex;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.organization.card.impl.domain.interactors.flex.OrganizationCardsSliderFlexInteractor", f = "OrganizationCardsSliderFlexInteractor.kt", l = {99}, m = "loadOrganizations", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardsSliderFlexInteractor$loadOrganizations$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardsSliderFlexInteractor$loadOrganizations$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, false, this);
    }
}
