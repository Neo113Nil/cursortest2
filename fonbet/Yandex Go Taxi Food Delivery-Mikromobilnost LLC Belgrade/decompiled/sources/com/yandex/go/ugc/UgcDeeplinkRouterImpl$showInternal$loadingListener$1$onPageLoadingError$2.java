package com.yandex.go.ugc;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ugc.UgcDeeplinkRouterImpl$showInternal$loadingListener$1$onPageLoadingError$2", f = "UgcDeeplinkRouterImpl.kt", l = {173}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UgcDeeplinkRouterImpl$showInternal$loadingListener$1$onPageLoadingError$2 extends SuspendLambda implements wls {
    final /* synthetic */ WebViewFromDeeplinkExperiment.a $url;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcDeeplinkRouterImpl$showInternal$loadingListener$1$onPageLoadingError$2(f fVar, WebViewFromDeeplinkExperiment.a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$url = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UgcDeeplinkRouterImpl$showInternal$loadingListener$1$onPageLoadingError$2(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UgcDeeplinkRouterImpl$showInternal$loadingListener$1$onPageLoadingError$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            WebViewFromDeeplinkExperiment.a aVar = this.$url;
            this.label = 1;
            if (f.P(fVar, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
