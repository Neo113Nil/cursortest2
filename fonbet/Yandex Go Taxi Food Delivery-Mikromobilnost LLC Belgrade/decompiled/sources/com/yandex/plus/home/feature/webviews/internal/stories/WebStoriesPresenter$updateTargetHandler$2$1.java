package com.yandex.plus.home.feature.webviews.internal.stories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.szg;
import defpackage.tls;
import defpackage.xk41;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesPresenter$updateTargetHandler$2$1", f = "WebStoriesPresenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebStoriesPresenter$updateTargetHandler$2$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebStoriesPresenter$updateTargetHandler$2$1(e eVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WebStoriesPresenter$updateTargetHandler$2$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        WebStoriesPresenter$updateTargetHandler$2$1 webStoriesPresenter$updateTargetHandler$2$1 = (WebStoriesPresenter$updateTargetHandler$2$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        webStoriesPresenter$updateTargetHandler$2$1.invokeSuspend(zy11Var);
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
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f k = this.this$0.k();
        pzt0 pzt0Var = k.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        k.i = null;
        ((xk41) this.this$0.b).hideNativePayButton();
        e eVar = this.this$0;
        szg szgVar = eVar.f;
        String str = szgVar.b;
        if (str != null) {
            eVar.k().j(str, szgVar.c, eVar.F);
        }
        return zy11.a;
    }
}
