package com.yandex.go.places.impl.ui.organizations.v2;

import com.adjust.sdk.Constants;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2Presenter", f = "OrganizationsListV2Presenter.kt", l = {Constants.MINIMAL_ERROR_STATUS_CODE, 398}, m = "getSearchbarMode", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsListV2Presenter$getSearchbarMode$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsListV2Presenter$getSearchbarMode$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f.Lg(this.this$0, null, this);
    }
}
