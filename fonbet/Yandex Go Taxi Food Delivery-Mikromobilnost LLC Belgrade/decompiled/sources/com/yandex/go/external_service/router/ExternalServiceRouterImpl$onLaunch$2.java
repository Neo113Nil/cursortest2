package com.yandex.go.external_service.router;

import defpackage.h1p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p3p;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.external_service.router.ExternalServiceRouterImpl$onLaunch$2", f = "ExternalServiceRouterImpl.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExternalServiceRouterImpl$onLaunch$2 extends SuspendLambda implements wls {
    final /* synthetic */ p3p $payload;
    final /* synthetic */ h1p $service;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalServiceRouterImpl$onLaunch$2(b bVar, h1p h1pVar, p3p p3pVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$service = h1pVar;
        this.$payload = p3pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExternalServiceRouterImpl$onLaunch$2(this.this$0, this.$service, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExternalServiceRouterImpl$onLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            h1p h1pVar = this.$service;
            p3p p3pVar = this.$payload;
            this.label = 1;
            if (b.P(bVar, h1pVar, p3pVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
