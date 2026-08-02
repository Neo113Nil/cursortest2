package com.yandex.messaging.auth.passport;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.internal.impl.f;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jjo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wl3;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/api/f;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.auth.passport.PassportAuthApi$getToken$1", f = "PassportAuthApi.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PassportAuthApi$getToken$1 extends SuspendLambda implements wls {
    final /* synthetic */ wl3 $uid;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportAuthApi$getToken$1(b bVar, wl3 wl3Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$uid = wl3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportAuthApi$getToken$1(this.this$0, this.$uid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassportAuthApi$getToken$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0.b;
            PassportUidImpl f = jjo.f(this.$uid);
            this.label = 1;
            b = fVar.b(f, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
