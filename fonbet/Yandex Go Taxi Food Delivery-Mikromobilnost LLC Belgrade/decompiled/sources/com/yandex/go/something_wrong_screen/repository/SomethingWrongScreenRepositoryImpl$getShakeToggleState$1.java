package com.yandex.go.something_wrong_screen.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.something_wrong_screen.repository.SomethingWrongScreenRepositoryImpl", f = "SomethingWrongScreenRepositoryImpl.kt", l = {119}, m = "getShakeToggleState", v = 2)
/* loaded from: classes13.dex */
final class SomethingWrongScreenRepositoryImpl$getShakeToggleState$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SomethingWrongScreenRepositoryImpl$getShakeToggleState$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
