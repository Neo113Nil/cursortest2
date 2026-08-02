package com.yandex.go.splash.dynamic;

import com.yandex.go.splash.data.dto.DynamicSplash;
import defpackage.cne0;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.splash.dynamic.DynamicSplashInteractor$increaseShowCount$2", f = "DynamicSplashInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DynamicSplashInteractor$increaseShowCount$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicSplashInteractor$increaseShowCount$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicSplashInteractor$increaseShowCount$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DynamicSplashInteractor$increaseShowCount$2 dynamicSplashInteractor$increaseShowCount$2 = (DynamicSplashInteractor$increaseShowCount$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dynamicSplashInteractor$increaseShowCount$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0.a;
        cne0 cne0Var = cVar.l;
        DynamicSplash c = cVar.c();
        if (c != null) {
            String str = c.a;
            cne0Var.p(qv10.d("show_count/", str, cne0Var, 0) + 1, g8e.o("show_count/", str));
        }
        return zy11.a;
    }
}
