package com.yandex.go.permission;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o0b0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0b0;", "it", "", "<anonymous>", "(Lo0b0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.RequestPermissionResultRepositoryImpl$waitForResult$2", f = "RequestPermissionResultRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RequestPermissionResultRepositoryImpl$waitForResult$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $requestCode;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPermissionResultRepositoryImpl$waitForResult$2(int i, Continuation continuation) {
        super(2, continuation);
        this.$requestCode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RequestPermissionResultRepositoryImpl$waitForResult$2 requestPermissionResultRepositoryImpl$waitForResult$2 = new RequestPermissionResultRepositoryImpl$waitForResult$2(this.$requestCode, continuation);
        requestPermissionResultRepositoryImpl$waitForResult$2.L$0 = obj;
        return requestPermissionResultRepositoryImpl$waitForResult$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequestPermissionResultRepositoryImpl$waitForResult$2) create((o0b0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        o0b0 o0b0Var = (o0b0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(o0b0Var.a == this.$requestCode);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
