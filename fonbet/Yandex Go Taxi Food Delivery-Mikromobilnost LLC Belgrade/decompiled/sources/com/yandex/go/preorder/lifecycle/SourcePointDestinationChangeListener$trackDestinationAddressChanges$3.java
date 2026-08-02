package com.yandex.go.preorder.lifecycle;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.vng;
import defpackage.wls;
import defpackage.x8t0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpv0;", "addressInfo", "<anonymous>", "(Lpv0;)Lpv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.lifecycle.SourcePointDestinationChangeListener$trackDestinationAddressChanges$3", f = "SourcePointDestinationChangeListener.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SourcePointDestinationChangeListener$trackDestinationAddressChanges$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointDestinationChangeListener$trackDestinationAddressChanges$3(m mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SourcePointDestinationChangeListener$trackDestinationAddressChanges$3 sourcePointDestinationChangeListener$trackDestinationAddressChanges$3 = new SourcePointDestinationChangeListener$trackDestinationAddressChanges$3(this.this$0, continuation);
        sourcePointDestinationChangeListener$trackDestinationAddressChanges$3.L$0 = obj;
        return sourcePointDestinationChangeListener$trackDestinationAddressChanges$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointDestinationChangeListener$trackDestinationAddressChanges$3) create((pv0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pv0 pv0Var = (pv0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        h hVar = new h(vng.l(this.this$0.e.k(), new x8t0(5), vng.c), pv0Var);
        this.L$0 = null;
        this.label = 1;
        Object y = kotlinx.coroutines.flow.e.y(hVar, this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
