package com.yandex.mob.domain;

import com.yandex.mob.reporting.MobTrigger;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.domain.NotificationsPollingUseCase$invoke$2", f = "NotificationsPollingUseCase.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NotificationsPollingUseCase$invoke$2 extends SuspendLambda implements tls {
    final /* synthetic */ MobTrigger $trigger;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsPollingUseCase$invoke$2(q qVar, MobTrigger mobTrigger, Continuation continuation) {
        super(1, continuation);
        this.this$0 = qVar;
        this.$trigger = mobTrigger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new NotificationsPollingUseCase$invoke$2(this.this$0, this.$trigger, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((NotificationsPollingUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        q qVar = this.this$0;
        MobTrigger mobTrigger = this.$trigger;
        this.label = 1;
        Object a = q.a(qVar, mobTrigger, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
