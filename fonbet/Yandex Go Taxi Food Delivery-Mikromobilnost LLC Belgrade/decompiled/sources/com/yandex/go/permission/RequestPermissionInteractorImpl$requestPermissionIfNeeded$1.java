package com.yandex.go.permission;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.RequestPermissionInteractorImpl$requestPermissionIfNeeded$1", f = "RequestPermissionInteractorImpl.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RequestPermissionInteractorImpl$requestPermissionIfNeeded$1 extends SuspendLambda implements wls {
    final /* synthetic */ Consumer<Boolean> $onResult;
    final /* synthetic */ int $permission;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPermissionInteractorImpl$requestPermissionIfNeeded$1(Consumer consumer, b bVar, int i, Continuation continuation) {
        super(2, continuation);
        this.$onResult = consumer;
        this.this$0 = bVar;
        this.$permission = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequestPermissionInteractorImpl$requestPermissionIfNeeded$1(this.$onResult, this.this$0, this.$permission, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequestPermissionInteractorImpl$requestPermissionIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Consumer consumer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Consumer<Boolean> consumer2 = this.$onResult;
            b bVar = this.this$0;
            int i2 = this.$permission;
            this.L$0 = consumer2;
            this.label = 1;
            Object d = bVar.d(i2, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = d;
            consumer = consumer2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            consumer = (Consumer) this.L$0;
            kotlin.b.b(obj);
        }
        consumer.accept(obj);
        return zy11.a;
    }
}
