package com.ybsdk.rconfig.retriever;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.rconfig.retriever.RemoteConfigRetrieverControllerImpl$awaitFirstFetchingResult-gIAlu-s$$inlined$map$1$2", f = "RemoteConfigRetrieverControllerImpl.kt", l = {52, 50}, m = "emit")
/* renamed from: com.ybsdk.rconfig.retriever.RemoteConfigRetrieverControllerImpl$awaitFirstFetchingResult-gIAlu-s$$inlined$map$1$2$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class RemoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
