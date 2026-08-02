package com.yandex.go.taxi.order;

import defpackage.a20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.ActiveOrderRemoteSettingsSender$Worker$makeRequest$2$1$1", f = "ActiveOrderRemoteSettingsSender.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ActiveOrderRemoteSettingsSender$Worker$makeRequest$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $value;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveOrderRemoteSettingsSender$Worker$makeRequest$2$1$1(a aVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$value = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActiveOrderRemoteSettingsSender$Worker$makeRequest$2$1$1(this.this$0, this.$value, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActiveOrderRemoteSettingsSender$Worker$makeRequest$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            a20 a20Var = aVar.b;
            String str = aVar.a;
            Object obj2 = this.$value;
            this.label = 1;
            if (a20Var.d(str, obj2, this) == coroutineSingletons) {
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
