package com.yandex.go.scooters.ignition.controlling.permission_info;

import defpackage.bsn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vkn0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Ldsn0;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.permission_info.ScootersIgnitionPermissionInfoRouter$content$1$1", f = "ScootersIgnitionPermissionInfoRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionPermissionInfoRouter$content$1$1 extends SuspendLambda implements zls {
    int label;
    final /* synthetic */ bsn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionPermissionInfoRouter$content$1$1(bsn0 bsn0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bsn0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersIgnitionPermissionInfoRouter$content$1$1 scootersIgnitionPermissionInfoRouter$content$1$1 = new ScootersIgnitionPermissionInfoRouter$content$1$1(this.this$0, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        scootersIgnitionPermissionInfoRouter$content$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.r(new vkn0(12));
        return zy11.a;
    }
}
