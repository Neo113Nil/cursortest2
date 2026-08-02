package com.yandex.messaging.input.quote;

import defpackage.d2b;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rlg0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld2b;", "it", "Lzy11;", "<anonymous>", "(Ld2b;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.quote.QuotePresenter$subscribeManyMessageInfo$1", f = "QuotePresenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class QuotePresenter$subscribeManyMessageInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $forwards;
    final /* synthetic */ boolean $needInputFocusRequest;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuotePresenter$subscribeManyMessageInfo$1(a aVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$forwards = str;
        this.$needInputFocusRequest = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QuotePresenter$subscribeManyMessageInfo$1 quotePresenter$subscribeManyMessageInfo$1 = new QuotePresenter$subscribeManyMessageInfo$1(this.this$0, this.$forwards, this.$needInputFocusRequest, continuation);
        quotePresenter$subscribeManyMessageInfo$1.L$0 = obj;
        return quotePresenter$subscribeManyMessageInfo$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        QuotePresenter$subscribeManyMessageInfo$1 quotePresenter$subscribeManyMessageInfo$1 = (QuotePresenter$subscribeManyMessageInfo$1) create((d2b) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        quotePresenter$subscribeManyMessageInfo$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        d2b d2bVar = (d2b) this.L$0;
        a aVar = this.this$0;
        rlg0 rlg0Var = new rlg0(d2bVar.a, this.$forwards, false);
        boolean z = this.$needInputFocusRequest;
        kgx[] kgxVarArr = a.I;
        aVar.g(rlg0Var, z);
        return zy11.a;
    }
}
