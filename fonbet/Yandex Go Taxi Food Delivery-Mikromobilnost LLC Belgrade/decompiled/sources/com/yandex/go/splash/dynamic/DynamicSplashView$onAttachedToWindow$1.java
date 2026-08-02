package com.yandex.go.splash.dynamic;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.splash.dynamic.DynamicSplashView$onAttachedToWindow$1", f = "DynamicSplashView.kt", l = {Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class DynamicSplashView$onAttachedToWindow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ DynamicSplashView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicSplashView$onAttachedToWindow$1(DynamicSplashView dynamicSplashView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dynamicSplashView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicSplashView$onAttachedToWindow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicSplashView$onAttachedToWindow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            aVar = this.this$0.dynamicSplashInteractor;
            this.label = 1;
            aVar.b.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(mdh.b, new DynamicSplashInteractor$increaseShowCount$2(aVar, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
