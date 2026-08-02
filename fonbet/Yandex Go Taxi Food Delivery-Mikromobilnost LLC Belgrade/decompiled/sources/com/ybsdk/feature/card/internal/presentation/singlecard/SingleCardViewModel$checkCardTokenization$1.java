package com.ybsdk.feature.card.internal.presentation.singlecard;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.rgs0;
import defpackage.tse;
import defpackage.vm7;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardViewModel$checkCardTokenization$1", f = "SingleCardViewModel.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SingleCardViewModel$checkCardTokenization$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCardViewModel$checkCardTokenization$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SingleCardViewModel$checkCardTokenization$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleCardViewModel$checkCardTokenization$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (this.this$0.B.getCardId() != null) {
            a aVar = this.this$0;
            vm7 vm7Var = aVar.C;
            aVar.B.getCardId();
            vm7Var.getClass();
            Boolean bool = Boolean.FALSE;
            this.label = 1;
            boolean booleanValue = bool.booleanValue();
            pz40 Y = aVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, rgs0.a((rgs0) value, null, booleanValue, null, false, null, null, false, 1021)));
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
