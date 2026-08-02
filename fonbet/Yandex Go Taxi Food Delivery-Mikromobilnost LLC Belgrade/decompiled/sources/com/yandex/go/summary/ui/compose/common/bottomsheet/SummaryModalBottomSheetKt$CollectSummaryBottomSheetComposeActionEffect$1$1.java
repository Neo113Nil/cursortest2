package com.yandex.go.summary.ui.compose.common.bottomsheet;

import defpackage.lx40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9g0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.common.bottomsheet.SummaryModalBottomSheetKt$CollectSummaryBottomSheetComposeActionEffect$1$1", f = "SummaryModalBottomSheet.kt", l = {514}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryModalBottomSheetKt$CollectSummaryBottomSheetComposeActionEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wg6 $bottomSheetState;
    final /* synthetic */ lx40 $mutableAnchor;
    final /* synthetic */ tpr $summaryBottomSheetComposeActionFlow;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryModalBottomSheetKt$CollectSummaryBottomSheetComposeActionEffect$1$1(tpr tprVar, wg6 wg6Var, lx40 lx40Var, Continuation continuation) {
        super(2, continuation);
        this.$summaryBottomSheetComposeActionFlow = tprVar;
        this.$bottomSheetState = wg6Var;
        this.$mutableAnchor = lx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryModalBottomSheetKt$CollectSummaryBottomSheetComposeActionEffect$1$1(this.$summaryBottomSheetComposeActionFlow, this.$bottomSheetState, this.$mutableAnchor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryModalBottomSheetKt$CollectSummaryBottomSheetComposeActionEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$summaryBottomSheetComposeActionFlow;
            wg6 wg6Var = this.$bottomSheetState;
            lx40 lx40Var = this.$mutableAnchor;
            o oVar = new o(tprVar, new SummaryModalBottomSheetKt$CollectSummaryBottomSheetComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            p9g0 p9g0Var = new p9g0(19, wg6Var, lx40Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(p9g0Var, this) == coroutineSingletons) {
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
