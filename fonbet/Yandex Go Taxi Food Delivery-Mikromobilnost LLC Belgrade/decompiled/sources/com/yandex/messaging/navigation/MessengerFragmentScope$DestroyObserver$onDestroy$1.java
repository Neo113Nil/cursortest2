package com.yandex.messaging.navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.navigation.MessengerFragmentScope$DestroyObserver$onDestroy$1", f = "MessengerFragmentScope.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MessengerFragmentScope$DestroyObserver$onDestroy$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerFragmentScope$DestroyObserver$onDestroy$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessengerFragmentScope$DestroyObserver$onDestroy$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessengerFragmentScope$DestroyObserver$onDestroy$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            it = this.this$0.w.iterator();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$0;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            tls tlsVar = (tls) it.next();
            this.L$0 = it;
            this.label = 1;
            if (tlsVar.invoke(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.this$0.w.clear();
        return zy11.a;
    }
}
