package com.yandex.go.splash.preload;

import defpackage.epe0;
import defpackage.hpe0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o61;
import defpackage.owx;
import defpackage.s8o;
import defpackage.tse;
import defpackage.tse0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.startup.launch.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.splash.preload.PreloadSplashPresenter$startLoading$1", f = "PreloadSplashPresenter.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreloadSplashPresenter$startLoading$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadSplashPresenter$startLoading$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreloadSplashPresenter$startLoading$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreloadSplashPresenter$startLoading$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PreloadSplashPresenter$startLoading$1 preloadSplashPresenter$startLoading$1;
        Object b;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.x.b.c(PreloadSplashAnalytics$MarkedEvents.HttpRequest);
            ((hpe0) this.this$0.Dg()).showLoading();
            i iVar = this.this$0.y;
            this.label = 1;
            preloadSplashPresenter$startLoading$1 = this;
            b = i.b(iVar, "Preload", null, false, preloadSplashPresenter$startLoading$1, 14);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
            preloadSplashPresenter$startLoading$1 = this;
        }
        owx owxVar = (owx) (b instanceof Result.Failure ? null : b);
        a aVar = preloadSplashPresenter$startLoading$1.this$0;
        if (owxVar == null) {
            boolean E = s8o.E(Result.a(b));
            epe0 epe0Var = aVar.x;
            o61 o61Var = epe0Var.a;
            Double valueOf = epe0Var.b.b(PreloadSplashAnalytics$MarkedEvents.HttpRequest) != null ? Double.valueOf(r11.floatValue()) : null;
            if (E) {
                str = "serverError";
            } else {
                if (E) {
                    w511.b();
                    return null;
                }
                str = "clientError";
            }
            o61Var.getClass();
            HashMap hashMap = new HashMap();
            if (valueOf != null) {
                hashMap.put("duration", valueOf);
            }
            o61Var.a.a("BlockingLaunch.requestError", hashMap, 1, tse0.r("type", hashMap, str));
            ((hpe0) preloadSplashPresenter$startLoading$1.this$0.Dg()).D9(E);
        } else {
            epe0 epe0Var2 = aVar.x;
            o61 o61Var2 = epe0Var2.a;
            Double valueOf2 = epe0Var2.b.b(PreloadSplashAnalytics$MarkedEvents.HttpRequest) != null ? Double.valueOf(r10.floatValue()) : null;
            o61Var2.getClass();
            HashMap hashMap2 = new HashMap();
            if (valueOf2 != null) {
                hashMap2.put("duration", valueOf2);
            }
            o61Var2.a.a("BlockingLaunch.requestSuccess", hashMap2, 1, new HashMap());
            ((hpe0) preloadSplashPresenter$startLoading$1.this$0.Dg()).close();
        }
        return zy11.a;
    }
}
