package com.yandex.go.permission;

import defpackage.k40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o0b0;
import defpackage.tse;
import defpackage.w7j0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.RequestPermissionInteractorImpl$requestPermissionIfNeeded$3$permissionResult$1", f = "RequestPermissionInteractorImpl.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RequestPermissionInteractorImpl$requestPermissionIfNeeded$3$permissionResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $permission;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPermissionInteractorImpl$requestPermissionIfNeeded$3$permissionResult$1(b bVar, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$permission = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequestPermissionInteractorImpl$requestPermissionIfNeeded$3$permissionResult$1(this.this$0, this.$permission, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequestPermissionInteractorImpl$requestPermissionIfNeeded$3$permissionResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            w7j0 w7j0Var = this.this$0.c;
            int i2 = this.$permission;
            this.label = 1;
            obj = e.x(w7j0Var.a, new RequestPermissionResultRepositoryImpl$waitForResult$2(i2, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        k40 k40Var = this.this$0.b;
        return k40Var.a.d(((o0b0) obj).c);
    }
}
