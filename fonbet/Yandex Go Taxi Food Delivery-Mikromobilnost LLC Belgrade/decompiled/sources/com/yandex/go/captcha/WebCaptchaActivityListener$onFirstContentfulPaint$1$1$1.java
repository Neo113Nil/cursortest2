package com.yandex.go.captcha;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.m0;
import defpackage.g6u;
import defpackage.hxx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pep0;
import defpackage.sjh;
import defpackage.tse;
import defpackage.u6s0;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.captcha.WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1", f = "WebCaptchaActivityListener.kt", l = {209}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ UiWebViewConfig $config;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1(i iVar, UiWebViewConfig uiWebViewConfig, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$config = uiWebViewConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1(this.this$0, this.$config, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.this$0;
            Lifecycle lifecycle = iVar.g;
            UiWebViewConfig uiWebViewConfig = this.$config;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a.x;
            boolean G = g6uVar.G(get_context());
            if (!G) {
                if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                }
                if (lifecycle.b().compareTo(state) >= 0) {
                    f fVar = new f(iVar.a.a().b(), new WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1$1$wrapper$1(iVar), new WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1$1$wrapper$2(iVar), new WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1$1$wrapper$3(iVar), new u6s0(6, iVar));
                    iVar.j = fVar;
                    ((pep0) iVar.e).f(fVar, uiWebViewConfig, hxx.a);
                }
            }
            h hVar = new h(iVar, uiWebViewConfig);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.Z$0 = G;
            this.label = 1;
            if (m0.a(lifecycle, state, G, g6uVar, hVar, this) == coroutineSingletons) {
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
