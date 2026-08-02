package com.yandex.passport.internal.social.esia;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.social.esia.EsiaBindViewModel$special$$inlined$mapStateful$2$2", f = "EsiaBindViewModel.kt", l = {50}, m = "emit")
/* loaded from: classes15.dex */
public final class EsiaBindViewModel$special$$inlined$mapStateful$2$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EsiaBindViewModel$special$$inlined$mapStateful$2$2$1(g0 g0Var, Continuation continuation) {
        super(continuation);
        this.this$0 = g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
