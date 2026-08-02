package com.yandex.messaging.internal.authorized.chat.refresher;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s9;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.refresher.AbstractReducedLoadScheduler$messages$1", f = "AbstractReducedLoadScheduler.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AbstractReducedLoadScheduler$messages$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ s9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractReducedLoadScheduler$messages$1(s9 s9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AbstractReducedLoadScheduler$messages$1 abstractReducedLoadScheduler$messages$1 = new AbstractReducedLoadScheduler$messages$1(this.this$0, continuation);
        abstractReducedLoadScheduler$messages$1.L$0 = obj;
        return abstractReducedLoadScheduler$messages$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractReducedLoadScheduler$messages$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            s9 s9Var = this.this$0;
            this.label = 1;
            s9Var.getClass();
            Object n = bvf0.n(new AbstractReducedLoadScheduler$startCollectingIfNeeded$2(s9Var, vprVar, null), this);
            if (n != coroutineSingletons) {
                n = zy11Var;
            }
            if (n == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
