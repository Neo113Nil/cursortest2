package com.yandex.go.splash.v2;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.trt0;
import defpackage.tse;
import defpackage.urt0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lurt0;", "<anonymous>", "(Ltse;)Lurt0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.splash.v2.SplashScreenV2Interactor$splashScreenV2Config$2", f = "SplashScreenV2Interactor.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SplashScreenV2Interactor$splashScreenV2Config$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenV2Interactor$splashScreenV2Config$2(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SplashScreenV2Interactor$splashScreenV2Config$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashScreenV2Interactor$splashScreenV2Config$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0.a;
            this.label = 1;
            obj = dVar.d(this);
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
        urt0 urt0Var = (urt0) obj;
        if (!urt0Var.a) {
            return null;
        }
        trt0 trt0Var = this.this$0.e;
        String str = (String) trt0Var.a.getValue(trt0Var, trt0.b[0]);
        if (str == null) {
            str = "";
        }
        boolean z = urt0Var.a;
        String str2 = urt0Var.b;
        String str3 = urt0Var.c;
        return new urt0(str2, urt0Var.e, str3, str, z);
    }
}
