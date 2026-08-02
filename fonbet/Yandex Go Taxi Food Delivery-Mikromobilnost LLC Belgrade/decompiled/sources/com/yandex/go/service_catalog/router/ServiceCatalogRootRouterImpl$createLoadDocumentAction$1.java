package com.yandex.go.service_catalog.router;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.service_catalog.router.ServiceCatalogRootRouterImpl", f = "ServiceCatalogRootRouterImpl.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "createLoadDocumentAction", v = 2)
/* loaded from: classes13.dex */
final class ServiceCatalogRootRouterImpl$createLoadDocumentAction$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceCatalogRootRouterImpl$createLoadDocumentAction$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.Q(this.this$0, this);
    }
}
