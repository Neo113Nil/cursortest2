package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/address/models/ZoneAddress;", "<anonymous>", "(Ltse;)Lcom/yandex/go/address/models/ZoneAddress;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2$sourceAsync$1", f = "SuperAppMainScreenSummaryRedirectNavigatorImpl.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2$sourceAsync$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2$sourceAsync$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2$sourceAsync$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2$sourceAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        this.label = 1;
        Object c = c.c(cVar, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
