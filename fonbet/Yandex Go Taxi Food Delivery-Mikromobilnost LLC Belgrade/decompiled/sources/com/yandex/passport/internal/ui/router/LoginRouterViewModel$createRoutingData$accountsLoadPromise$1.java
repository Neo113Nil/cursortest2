package com.yandex.passport.internal.ui.router;

import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.usecase.ui.b0;
import com.yandex.passport.internal.usecase.ui.c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/internal/usecase/ui/a0;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/internal/usecase/ui/a0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.router.LoginRouterViewModel$createRoutingData$accountsLoadPromise$1", f = "LoginRouterViewModel.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LoginRouterViewModel$createRoutingData$accountsLoadPromise$1 extends SuspendLambda implements wls {
    final /* synthetic */ LoginProperties $loginProperties;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginRouterViewModel$createRoutingData$accountsLoadPromise$1(r rVar, LoginProperties loginProperties, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
        this.$loginProperties = loginProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginRouterViewModel$createRoutingData$accountsLoadPromise$1(this.this$0, this.$loginProperties, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginRouterViewModel$createRoutingData$accountsLoadPromise$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        c0 c0Var = this.this$0.c;
        b0 b0Var = new b0(this.$loginProperties.getFilter());
        this.label = 1;
        Object a = c0Var.a(b0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
