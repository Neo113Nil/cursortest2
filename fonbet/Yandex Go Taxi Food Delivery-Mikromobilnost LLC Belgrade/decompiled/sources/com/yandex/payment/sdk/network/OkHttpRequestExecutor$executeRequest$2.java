package com.yandex.payment.sdk.network;

import defpackage.d5j0;
import defpackage.mvg;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkvj0;", "<anonymous>", "(Ltse;)Lkvj0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.network.OkHttpRequestExecutor$executeRequest$2", f = "OkHttpRequestExecutor.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class OkHttpRequestExecutor$executeRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ d5j0 $okHttpRequest;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpRequestExecutor$executeRequest$2(a aVar, d5j0 d5j0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$okHttpRequest = d5j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OkHttpRequestExecutor$executeRequest$2(this.this$0, this.$okHttpRequest, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OkHttpRequestExecutor$executeRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return ((nci0) this.this$0.a.newCall(this.$okHttpRequest)).execute();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
