package com.yandex.go.places.impl.ui.organizations.v2;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2Presenter$requestParametersBuilder$1", f = "OrganizationsListV2Presenter.kt", l = {235, 236}, m = "createBodyParams", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
