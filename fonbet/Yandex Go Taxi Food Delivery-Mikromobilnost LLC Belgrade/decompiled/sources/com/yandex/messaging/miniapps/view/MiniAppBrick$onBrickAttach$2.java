package com.yandex.messaging.miniapps.view;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.miniapps.view.MiniAppBrick$onBrickAttach$2", f = "MiniAppBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MiniAppBrick$onBrickAttach$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppBrick$onBrickAttach$2(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MiniAppBrick$onBrickAttach$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MiniAppBrick$onBrickAttach$2 miniAppBrick$onBrickAttach$2 = (MiniAppBrick$onBrickAttach$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        miniAppBrick$onBrickAttach$2.invokeSuspend(zy11Var);
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
        this.this$0.z.c("csat_cancel", CRLReasonCodeExtension.REASON, "user tap");
        this.this$0.c.b();
        return zy11.a;
    }
}
