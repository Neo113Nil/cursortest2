package com.yandex.passport.internal.push;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/common/value/a;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/common/value/a;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.push.PushIntentProvider$getDeviceId$1", f = "PushIntentProvider.kt", l = {211}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PushIntentProvider$getDeviceId$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushIntentProvider$getDeviceId$1(c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PushIntentProvider$getDeviceId$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PushIntentProvider$getDeviceId$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.common.analytics.d dVar = this.this$0.c;
            long c = com.yandex.passport.common.time.a.c(0, 5, 0, 11);
            this.label = 1;
            obj = dVar.a(c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        String str = ((com.yandex.passport.common.analytics.b) obj).a;
        if (str != null) {
            return new com.yandex.passport.common.value.a(str);
        }
        return null;
    }
}
