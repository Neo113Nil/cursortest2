package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.ui.domik.BaseTrack;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.ui.RequestSmsUseCase", f = "RequestSmsUseCase.kt", l = {48, 59, 71}, m = "request")
/* loaded from: classes2.dex */
final class RequestSmsUseCase$request$1<T extends BaseTrack> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestSmsUseCase$request$1(i0 i0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
