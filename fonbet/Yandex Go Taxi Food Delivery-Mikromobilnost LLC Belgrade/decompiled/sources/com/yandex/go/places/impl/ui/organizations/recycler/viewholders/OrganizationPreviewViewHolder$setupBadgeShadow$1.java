package com.yandex.go.places.impl.ui.organizations.recycler.viewholders;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.ui.organizations.recycler.viewholders.OrganizationPreviewViewHolder", f = "OrganizationPreviewViewHolder.kt", l = {157}, m = "setupBadgeShadow", v = 2)
/* loaded from: classes13.dex */
final class OrganizationPreviewViewHolder$setupBadgeShadow$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationPreviewViewHolder$setupBadgeShadow$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.d0(this.this$0, null, this);
    }
}
