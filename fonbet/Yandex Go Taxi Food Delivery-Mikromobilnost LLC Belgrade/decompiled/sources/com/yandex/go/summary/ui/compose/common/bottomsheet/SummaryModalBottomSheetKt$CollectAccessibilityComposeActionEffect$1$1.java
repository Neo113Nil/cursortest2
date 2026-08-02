package com.yandex.go.summary.ui.compose.common.bottomsheet;

import android.view.View;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qit0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.common.bottomsheet.SummaryModalBottomSheetKt$CollectAccessibilityComposeActionEffect$1$1", f = "SummaryModalBottomSheet.kt", l = {514}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryModalBottomSheetKt$CollectAccessibilityComposeActionEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $accessibilityComposeActionFlow;
    final /* synthetic */ View $view;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryModalBottomSheetKt$CollectAccessibilityComposeActionEffect$1$1(tpr tprVar, View view, Continuation continuation) {
        super(2, continuation);
        this.$accessibilityComposeActionFlow = tprVar;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryModalBottomSheetKt$CollectAccessibilityComposeActionEffect$1$1(this.$accessibilityComposeActionFlow, this.$view, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryModalBottomSheetKt$CollectAccessibilityComposeActionEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$accessibilityComposeActionFlow;
            View view = this.$view;
            o oVar = new o(tprVar, new SummaryModalBottomSheetKt$CollectAccessibilityComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            qit0 qit0Var = new qit0(11, view);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(qit0Var, this) == coroutineSingletons) {
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
