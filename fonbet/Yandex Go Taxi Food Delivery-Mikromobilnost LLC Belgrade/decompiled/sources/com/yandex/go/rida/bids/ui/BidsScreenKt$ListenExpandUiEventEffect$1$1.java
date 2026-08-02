package com.yandex.go.rida.bids.ui;

import defpackage.er5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.ui.BidsScreenKt$ListenExpandUiEventEffect$1$1", f = "BidsScreen.kt", l = {228}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsScreenKt$ListenExpandUiEventEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wg6 $bottomSheetState;
    final /* synthetic */ int $expandAnchor;
    final /* synthetic */ tpr $uiEventsFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsScreenKt$ListenExpandUiEventEffect$1$1(tpr tprVar, wg6 wg6Var, int i, Continuation continuation) {
        super(2, continuation);
        this.$uiEventsFlow = tprVar;
        this.$bottomSheetState = wg6Var;
        this.$expandAnchor = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BidsScreenKt$ListenExpandUiEventEffect$1$1(this.$uiEventsFlow, this.$bottomSheetState, this.$expandAnchor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BidsScreenKt$ListenExpandUiEventEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = new i(this.$uiEventsFlow);
            er5 er5Var = new er5(this.$bottomSheetState, this.$expandAnchor, 1);
            this.label = 1;
            if (iVar.collect(er5Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
