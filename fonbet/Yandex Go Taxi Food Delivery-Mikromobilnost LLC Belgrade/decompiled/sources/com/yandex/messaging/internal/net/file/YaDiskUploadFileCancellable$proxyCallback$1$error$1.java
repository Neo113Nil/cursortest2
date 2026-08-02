package com.yandex.messaging.internal.net.file;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.gk51;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.net.file.YaDiskUploadFileCancellable$proxyCallback$1$error$1", f = "YaDiskUploadFileCancellable.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class YaDiskUploadFileCancellable$proxyCallback$1$error$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ gk51 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YaDiskUploadFileCancellable$proxyCallback$1$error$1(gk51 gk51Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gk51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YaDiskUploadFileCancellable$proxyCallback$1$error$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YaDiskUploadFileCancellable$proxyCallback$1$error$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            gk51 gk51Var = this.this$0;
            long a = gk51Var.y.a(gk51Var.D);
            this.label = 1;
            if (kotlinx.coroutines.a.i(a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        gk51 gk51Var2 = this.this$0;
        kgx[] kgxVarArr = gk51.K;
        gk51Var2.c();
        return zy11.a;
    }
}
