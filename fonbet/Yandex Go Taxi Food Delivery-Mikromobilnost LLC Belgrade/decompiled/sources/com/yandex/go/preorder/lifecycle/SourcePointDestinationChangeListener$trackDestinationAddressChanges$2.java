package com.yandex.go.preorder.lifecycle;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pv0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpv0;", "it", "Lzy11;", "<anonymous>", "(Lpv0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.lifecycle.SourcePointDestinationChangeListener$trackDestinationAddressChanges$2", f = "SourcePointDestinationChangeListener.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SourcePointDestinationChangeListener$trackDestinationAddressChanges$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointDestinationChangeListener$trackDestinationAddressChanges$2(m mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourcePointDestinationChangeListener$trackDestinationAddressChanges$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointDestinationChangeListener$trackDestinationAddressChanges$2) create((pv0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            m mVar = this.this$0;
            this.label = 1;
            mVar.b.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(o400.a, new SourcePointDestinationChangeListener$handleNewDestinationAddress$2(mVar, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 == coroutineSingletons) {
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
