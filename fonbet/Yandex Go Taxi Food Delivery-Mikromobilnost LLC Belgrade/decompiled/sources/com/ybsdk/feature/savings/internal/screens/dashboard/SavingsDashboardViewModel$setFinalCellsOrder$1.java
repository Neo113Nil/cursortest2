package com.ybsdk.feature.savings.internal.screens.dashboard;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.interactors.f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardViewModel$setFinalCellsOrder$1", f = "SavingsDashboardViewModel.kt", l = {344}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsDashboardViewModel$setFinalCellsOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $agreementsList;
    final /* synthetic */ Text.Resource $snackbarDescription;
    final /* synthetic */ Text.Resource $snackbarTitle;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsDashboardViewModel$setFinalCellsOrder$1(a aVar, List list, Text.Resource resource, Text.Resource resource2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$agreementsList = list;
        this.$snackbarTitle = resource;
        this.$snackbarDescription = resource2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsDashboardViewModel$setFinalCellsOrder$1(this.this$0, this.$agreementsList, this.$snackbarTitle, this.$snackbarDescription, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsDashboardViewModel$setFinalCellsOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            f fVar = this.this$0.M;
            List<String> list = this.$agreementsList;
            this.label = 1;
            c = fVar.c("SetSavingsAccountOrder", list, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            c = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        if (!(c instanceof Result.Failure)) {
            if (aVar.N) {
                aVar.e0(false);
            }
        }
        a aVar2 = this.this$0;
        Text.Resource resource = this.$snackbarTitle;
        Text.Resource resource2 = this.$snackbarDescription;
        if (Result.a(c) != null) {
            aVar2.H.c(resource, resource2);
        }
        return zy11.a;
    }
}
