package com.yandex.passport.internal.network;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/data/models/r;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/data/models/r;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.network.BaseUrlDispatcherImpl$getUrlTemplateConfig$1", f = "BaseUrlDispatcherImpl.kt", l = {413}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BaseUrlDispatcherImpl$getUrlTemplateConfig$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseUrlDispatcherImpl$getUrlTemplateConfig$1(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseUrlDispatcherImpl$getUrlTemplateConfig$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseUrlDispatcherImpl$getUrlTemplateConfig$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        com.yandex.passport.internal.config.template.g gVar = this.this$0.e;
        this.label = 1;
        Object a = gVar.a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
