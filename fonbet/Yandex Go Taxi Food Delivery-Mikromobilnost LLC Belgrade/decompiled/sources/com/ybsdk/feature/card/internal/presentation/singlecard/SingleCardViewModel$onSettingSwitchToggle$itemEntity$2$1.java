package com.ybsdk.feature.card.internal.presentation.singlecard;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardViewModel$onSettingSwitchToggle$itemEntity$2$1", f = "SingleCardViewModel.kt", l = {326}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SingleCardViewModel$onSettingSwitchToggle$itemEntity$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ o8r0 $item;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCardViewModel$onSettingSwitchToggle$itemEntity$2$1(a aVar, o8r0 o8r0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = o8r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SingleCardViewModel$onSettingSwitchToggle$itemEntity$2$1(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleCardViewModel$onSettingSwitchToggle$itemEntity$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            o8r0 o8r0Var = this.$item;
            this.label = 1;
            if (a.b0(aVar, o8r0Var, null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
