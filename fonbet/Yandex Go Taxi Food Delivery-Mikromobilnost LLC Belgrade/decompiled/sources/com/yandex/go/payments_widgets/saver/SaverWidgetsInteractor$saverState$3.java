package com.yandex.go.payments_widgets.saver;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2m0;
import defpackage.pu51;
import defpackage.ru51;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru51;", "saverState", "Lzy11;", "<anonymous>", "(Lru51;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments_widgets.saver.SaverWidgetsInteractor$saverState$3", f = "SaverWidgetsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SaverWidgetsInteractor$saverState$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o2m0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaverWidgetsInteractor$saverState$3(o2m0 o2m0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = o2m0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SaverWidgetsInteractor$saverState$3 saverWidgetsInteractor$saverState$3 = new SaverWidgetsInteractor$saverState$3(this.this$0, continuation);
        saverWidgetsInteractor$saverState$3.L$0 = obj;
        return saverWidgetsInteractor$saverState$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SaverWidgetsInteractor$saverState$3 saverWidgetsInteractor$saverState$3 = (SaverWidgetsInteractor$saverState$3) create((ru51) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        saverWidgetsInteractor$saverState$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ru51 ru51Var = (ru51) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = ru51Var instanceof pu51;
        o2m0 o2m0Var = this.this$0;
        if (z) {
            o2m0Var.c.a = ((pu51) ru51Var).c;
        } else {
            o2m0Var.c.a = "";
        }
        return zy11.a;
    }
}
