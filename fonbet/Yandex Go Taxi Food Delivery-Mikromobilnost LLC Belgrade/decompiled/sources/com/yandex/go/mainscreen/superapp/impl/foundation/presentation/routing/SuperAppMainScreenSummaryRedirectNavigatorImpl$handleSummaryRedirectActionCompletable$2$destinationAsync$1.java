package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import com.yandex.go.models.SummaryRedirectActionModel;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yyr0;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/address/models/Address;", "<anonymous>", "(Ltse;)Lcom/yandex/go/address/models/Address;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2$destinationAsync$1", f = "SuperAppMainScreenSummaryRedirectNavigatorImpl.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2$destinationAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ SummaryRedirectActionModel $action;
    final /* synthetic */ yyr0 $model;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2$destinationAsync$1(c cVar, SummaryRedirectActionModel summaryRedirectActionModel, yyr0 yyr0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$action = summaryRedirectActionModel;
        this.$model = yyr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2$destinationAsync$1(this.this$0, this.$action, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2$destinationAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        c cVar = this.this$0;
        SummaryRedirectActionModel summaryRedirectActionModel = this.$action;
        yyr0 yyr0Var = this.$model;
        this.label = 1;
        Serializable b = c.b(cVar, summaryRedirectActionModel, yyr0Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
