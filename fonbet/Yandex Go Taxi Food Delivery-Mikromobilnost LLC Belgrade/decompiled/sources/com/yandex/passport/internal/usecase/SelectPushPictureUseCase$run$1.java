package com.yandex.passport.internal.usecase;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.SelectPushPictureUseCase", f = "SelectPushPictureUseCase.kt", l = {27}, m = "run-gIAlu-s")
/* loaded from: classes15.dex */
final class SelectPushPictureUseCase$run$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPushPictureUseCase$run$1(i1 i1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = i1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
