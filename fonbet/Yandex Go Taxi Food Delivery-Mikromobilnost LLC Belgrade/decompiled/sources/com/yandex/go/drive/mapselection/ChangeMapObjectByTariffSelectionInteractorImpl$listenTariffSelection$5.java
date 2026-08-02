package com.yandex.go.drive.mapselection;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rfu0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lnm00;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.mapselection.ChangeMapObjectByTariffSelectionInteractorImpl$listenTariffSelection$5", f = "ChangeMapObjectByTariffSelectionInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChangeMapObjectByTariffSelectionInteractorImpl$listenTariffSelection$5 extends SuspendLambda implements zls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeMapObjectByTariffSelectionInteractorImpl$listenTariffSelection$5(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChangeMapObjectByTariffSelectionInteractorImpl$listenTariffSelection$5 changeMapObjectByTariffSelectionInteractorImpl$listenTariffSelection$5 = new ChangeMapObjectByTariffSelectionInteractorImpl$listenTariffSelection$5(this.this$0, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        changeMapObjectByTariffSelectionInteractorImpl$listenTariffSelection$5.invokeSuspend(zy11Var);
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
        this.this$0.c.c(rfu0.i);
        return zy11.a;
    }
}
