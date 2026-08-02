package com.yandex.passport.internal.usecase;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.MakeAllTokenMasterRelatedUseCase", f = "MakeAllTokenMasterRelatedUseCase.kt", l = {33, 36}, m = "execute")
/* loaded from: classes8.dex */
final class MakeAllTokenMasterRelatedUseCase$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeAllTokenMasterRelatedUseCase$execute$1(w0 w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
