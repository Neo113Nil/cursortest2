package com.yandex.go.suggest.impl.data.flex.document;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.suggest.impl.data.flex.document.SuperappSuggestDocumentInteractor", f = "SuperappSuggestDocumentInteractor.kt", l = {181, 184}, m = "requestSectionsAfterDelay-myKFqkg", v = 2)
/* loaded from: classes14.dex */
final class SuperappSuggestDocumentInteractor$requestSectionsAfterDelay$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestDocumentInteractor$requestSectionsAfterDelay$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.c(this.this$0, null, null, null, null, 0L, this);
    }
}
