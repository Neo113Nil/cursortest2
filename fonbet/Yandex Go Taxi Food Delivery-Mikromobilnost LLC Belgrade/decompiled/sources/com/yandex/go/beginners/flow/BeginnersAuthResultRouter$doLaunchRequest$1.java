package com.yandex.go.beginners.flow;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.beginners.flow.BeginnersAuthResultRouter", f = "BeginnersAuthResultRouter.kt", l = {40}, m = "doLaunchRequest", v = 2)
/* loaded from: classes12.dex */
final class BeginnersAuthResultRouter$doLaunchRequest$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnersAuthResultRouter$doLaunchRequest$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.P(this.this$0, null, this);
    }
}
