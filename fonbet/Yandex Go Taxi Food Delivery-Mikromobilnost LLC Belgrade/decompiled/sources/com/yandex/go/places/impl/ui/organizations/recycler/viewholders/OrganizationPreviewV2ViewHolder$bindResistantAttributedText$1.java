package com.yandex.go.places.impl.ui.organizations.recycler.viewholders;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.ui.organizations.recycler.viewholders.OrganizationPreviewV2ViewHolder", f = "OrganizationPreviewV2ViewHolder.kt", l = {332}, m = "bindResistantAttributedText", v = 2)
/* loaded from: classes13.dex */
final class OrganizationPreviewV2ViewHolder$bindResistantAttributedText$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationPreviewV2ViewHolder$bindResistantAttributedText$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.c0(this.this$0, null, null, this);
    }
}
