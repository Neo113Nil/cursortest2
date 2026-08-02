package com.yandex.go.captcha;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.captcha.WebCaptchaActivityListener$handleCaptchaWebRequest$1", f = "WebCaptchaActivityListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class WebCaptchaActivityListener$handleCaptchaWebRequest$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCaptchaActivityListener$handleCaptchaWebRequest$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebCaptchaActivityListener$handleCaptchaWebRequest$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebCaptchaActivityListener$handleCaptchaWebRequest$1 webCaptchaActivityListener$handleCaptchaWebRequest$1 = (WebCaptchaActivityListener$handleCaptchaWebRequest$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webCaptchaActivityListener$handleCaptchaWebRequest$1.invokeSuspend(zy11Var);
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
        i iVar = this.this$0;
        iVar.h = false;
        f fVar = iVar.j;
        if (fVar != null) {
            fVar.i();
        }
        return zy11.a;
    }
}
