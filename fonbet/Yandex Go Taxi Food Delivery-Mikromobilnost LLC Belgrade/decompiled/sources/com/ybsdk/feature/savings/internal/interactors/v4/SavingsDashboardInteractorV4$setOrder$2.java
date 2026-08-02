package com.ybsdk.feature.savings.internal.interactors.v4;

import defpackage.ldm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.v4.SavingsDashboardInteractorV4$setOrder$2", f = "SavingsDashboardInteractorV4.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsDashboardInteractorV4$setOrder$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<ldm0> $shelvesList;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsDashboardInteractorV4$setOrder$2(b bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$shelvesList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavingsDashboardInteractorV4$setOrder$2 savingsDashboardInteractorV4$setOrder$2 = new SavingsDashboardInteractorV4$setOrder$2(this.this$0, this.$shelvesList, continuation);
        savingsDashboardInteractorV4$setOrder$2.L$0 = obj;
        return savingsDashboardInteractorV4$setOrder$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsDashboardInteractorV4$setOrder$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.savings.internal.data.b bVar = this.this$0.e;
            List<ldm0> list = this.$shelvesList;
            this.label = 1;
            l = bVar.l(str, list, this);
            if (l == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            l = ((Result) obj).getValue();
        }
        return new Result(l);
    }
}
