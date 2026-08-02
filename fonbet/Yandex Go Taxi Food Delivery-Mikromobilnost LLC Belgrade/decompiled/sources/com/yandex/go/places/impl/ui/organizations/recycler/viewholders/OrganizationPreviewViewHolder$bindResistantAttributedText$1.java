package com.yandex.go.places.impl.ui.organizations.recycler.viewholders;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.ui.organizations.recycler.viewholders.OrganizationPreviewViewHolder", f = "OrganizationPreviewViewHolder.kt", l = {HProv.PP_INFO}, m = "bindResistantAttributedText", v = 2)
/* loaded from: classes13.dex */
final class OrganizationPreviewViewHolder$bindResistantAttributedText$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationPreviewViewHolder$bindResistantAttributedText$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.c0(this.this$0, null, null, this);
    }
}
