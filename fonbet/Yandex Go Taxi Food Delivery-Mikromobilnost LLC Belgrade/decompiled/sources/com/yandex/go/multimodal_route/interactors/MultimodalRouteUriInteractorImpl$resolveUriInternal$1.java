package com.yandex.go.multimodal_route.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.multimodal_route.interactors.MultimodalRouteUriInteractorImpl", f = "MultimodalRouteUriInteractorImpl.kt", l = {39, HProv.PP_RESERVED1}, m = "resolveUriInternal", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRouteUriInteractorImpl$resolveUriInternal$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRouteUriInteractorImpl$resolveUriInternal$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(this.this$0, null, this);
    }
}
