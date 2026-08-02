package com.yandex.messaging.internal.urlpreview;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.internal.urlpreview.GetUrlPreviewUseCase", f = "GetUrlPreviewUseCase.kt", l = {60, 62}, m = "getUrlPreviewInternal")
/* loaded from: classes15.dex */
final class GetUrlPreviewUseCase$getUrlPreviewInternal$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUrlPreviewUseCase$getUrlPreviewInternal$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.c(this.this$0, null, this);
    }
}
