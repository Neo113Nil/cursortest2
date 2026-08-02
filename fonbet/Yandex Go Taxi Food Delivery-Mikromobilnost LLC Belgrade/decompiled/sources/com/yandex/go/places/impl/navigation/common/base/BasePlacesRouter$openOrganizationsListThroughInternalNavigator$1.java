package com.yandex.go.places.impl.navigation.common.base;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter", f = "BasePlacesRouter.kt", l = {243}, m = "openOrganizationsListThroughInternalNavigator", v = 2)
/* loaded from: classes13.dex */
final class BasePlacesRouter$openOrganizationsListThroughInternalNavigator$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlacesRouter$openOrganizationsListThroughInternalNavigator$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f0(null, false, null, this);
    }
}
