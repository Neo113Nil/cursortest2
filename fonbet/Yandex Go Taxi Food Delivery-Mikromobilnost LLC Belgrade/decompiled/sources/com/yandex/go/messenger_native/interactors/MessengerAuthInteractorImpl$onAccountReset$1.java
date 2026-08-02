package com.yandex.go.messenger_native.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.messenger_native.interactors.MessengerAuthInteractorImpl", f = "MessengerAuthInteractorImpl.kt", l = {53, 56, 59, 64}, m = "onAccountReset", v = 2)
/* loaded from: classes15.dex */
final class MessengerAuthInteractorImpl$onAccountReset$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerAuthInteractorImpl$onAccountReset$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
