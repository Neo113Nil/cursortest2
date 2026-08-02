package com.yandex.passport.internal.provider.communication;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.provider.communication.IPCImpl$getPushToken$2$3", f = "IPCImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class IPCImpl$getPushToken$2$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $token;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IPCImpl$getPushToken$2$3(String str, Continuation continuation) {
        super(2, continuation);
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IPCImpl$getPushToken$2$3(this.$token, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IPCImpl$getPushToken$2$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.$token;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
