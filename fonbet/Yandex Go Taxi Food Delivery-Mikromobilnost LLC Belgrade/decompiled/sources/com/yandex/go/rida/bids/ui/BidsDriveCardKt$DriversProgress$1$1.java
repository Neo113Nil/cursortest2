package com.yandex.go.rida.bids.ui;

import defpackage.eq5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tx40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.ui.BidsDriveCardKt$DriversProgress$1$1", f = "BidsDriveCard.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsDriveCardKt$DriversProgress$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tx40 $progressState;
    final /* synthetic */ eq5 $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsDriveCardKt$DriversProgress$1$1(eq5 eq5Var, tx40 tx40Var, Continuation continuation) {
        super(2, continuation);
        this.$uiState = eq5Var;
        this.$progressState = tx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BidsDriveCardKt$DriversProgress$1$1(this.$uiState, this.$progressState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BidsDriveCardKt$DriversProgress$1$1 bidsDriveCardKt$DriversProgress$1$1 = (BidsDriveCardKt$DriversProgress$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        bidsDriveCardKt$DriversProgress$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Float f = this.$uiState.a;
        if (f != null) {
            this.$progressState.setFloatValue(f.floatValue());
        }
        return zy11.a;
    }
}
