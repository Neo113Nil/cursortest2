package com.yandex.go.chargers.dvizh_subscription.web.js;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.dvizh_subscription.web.js.ChargersDvizhSubscriptionJsApi$disableSwipe$1", f = "ChargersDvizhSubscriptionJsApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class ChargersDvizhSubscriptionJsApi$disableSwipe$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ ChargersDvizhSubscriptionJsApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDvizhSubscriptionJsApi$disableSwipe$1(ChargersDvizhSubscriptionJsApi chargersDvizhSubscriptionJsApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chargersDvizhSubscriptionJsApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersDvizhSubscriptionJsApi$disableSwipe$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersDvizhSubscriptionJsApi$disableSwipe$1 chargersDvizhSubscriptionJsApi$disableSwipe$1 = (ChargersDvizhSubscriptionJsApi$disableSwipe$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersDvizhSubscriptionJsApi$disableSwipe$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sls slsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        slsVar = this.this$0.onDisableSwipe;
        slsVar.invoke();
        this.this$0.callbackResult(this.$promiseId);
        return zy11.a;
    }
}
