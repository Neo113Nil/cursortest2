package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.SuperAppMainScreenAddressInteractorImpl", f = "SuperAppMainScreenAddressInteractorImpl.kt", l = {209}, m = "handlePointA", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenAddressInteractorImpl$handlePointA$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenAddressInteractorImpl$handlePointA$1(v vVar, Continuation continuation) {
        super(continuation);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return v.a(this.this$0, null, this);
    }
}
