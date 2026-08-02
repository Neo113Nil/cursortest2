package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import com.ybsdk.core.utils.text.Text;
import defpackage.dzh0;
import defpackage.ldm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardViewModelV4$setFinalOrder$1", f = "SavingsDashboardViewModelV4.kt", l = {243}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsDashboardViewModelV4$setFinalOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<ldm0> $shelvesList;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsDashboardViewModelV4$setFinalOrder$1(c cVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$shelvesList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsDashboardViewModelV4$setFinalOrder$1(this.this$0, this.$shelvesList, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsDashboardViewModelV4$setFinalOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.ybsdk.feature.savings.internal.interactors.v4.b bVar = this.this$0.N;
            List<ldm0> list = this.$shelvesList;
            this.label = 1;
            c = bVar.c("SetSavingsAccountOrderV2", list, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        c cVar = this.this$0;
        if (!(c instanceof Result.Failure)) {
            pzt0 pzt0Var = cVar.I;
            if (pzt0Var != null && pzt0Var.isCancelled()) {
                cVar.d0(false);
            }
        }
        c cVar2 = this.this$0;
        if (Result.a(c) != null) {
            cVar2.G.c(new Text.Resource(dzh0.ybsdk_savings_savings_drag_and_drop_snackbar_error_title), new Text.Resource(dzh0.ybsdk_savings_savings_drag_and_drop_snackbar_error_description));
        }
        return zy11.a;
    }
}
