package com.yandex.go.platform.permissions;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sza0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsza0;", "it", "", "<anonymous>", "(Lsza0;)Z"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.permissions.PermissionsController$awaitResult$2", f = "PermissionsController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PermissionsController$awaitResult$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $requestCode;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsController$awaitResult$2(int i, Continuation continuation) {
        super(2, continuation);
        this.$requestCode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PermissionsController$awaitResult$2 permissionsController$awaitResult$2 = new PermissionsController$awaitResult$2(this.$requestCode, continuation);
        permissionsController$awaitResult$2.L$0 = obj;
        return permissionsController$awaitResult$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PermissionsController$awaitResult$2) create((sza0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(((sza0) this.L$0).b == this.$requestCode);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
