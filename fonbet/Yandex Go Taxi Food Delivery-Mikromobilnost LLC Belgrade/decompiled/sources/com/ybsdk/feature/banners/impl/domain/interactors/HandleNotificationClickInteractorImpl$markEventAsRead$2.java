package com.ybsdk.feature.banners.impl.domain.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.banners.impl.domain.interactors.HandleNotificationClickInteractorImpl$markEventAsRead$2", f = "HandleNotificationClickInteractorImpl.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class HandleNotificationClickInteractorImpl$markEventAsRead$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $eventId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleNotificationClickInteractorImpl$markEventAsRead$2(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$eventId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HandleNotificationClickInteractorImpl$markEventAsRead$2 handleNotificationClickInteractorImpl$markEventAsRead$2 = new HandleNotificationClickInteractorImpl$markEventAsRead$2(this.this$0, this.$eventId, continuation);
        handleNotificationClickInteractorImpl$markEventAsRead$2.L$0 = obj;
        return handleNotificationClickInteractorImpl$markEventAsRead$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HandleNotificationClickInteractorImpl$markEventAsRead$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.banners.impl.data.a aVar = this.this$0.a;
            String str2 = this.$eventId;
            this.label = 1;
            a = aVar.a(str2, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
