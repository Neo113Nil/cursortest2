package com.yandex.plus.home.internal.di;

import defpackage.dtt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qax0;
import defpackage.tls;
import defpackage.wog;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqax0;", "<anonymous>", "()Lqax0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.internal.di.DataModule$targetingInputFactory$2$3", f = "DataModule.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class DataModule$targetingInputFactory$2$3 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ wog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataModule$targetingInputFactory$2$3(wog wogVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = wogVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataModule$targetingInputFactory$2$3(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DataModule$targetingInputFactory$2$3) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.plus.home.payment.google.a aVar = (com.yandex.plus.home.payment.google.a) this.this$0.A.getValue();
            this.label = 1;
            obj = aVar.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        dtt dttVar = (dtt) obj;
        return new qax0(dttVar.a, dttVar.b);
    }
}
