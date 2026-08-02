package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.internal.report.reporters.WebAmReporter$Companion$EventPlace;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/sloth/i0;", "request", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/sloth/i0;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity$bind$2", f = "WebCardSlothActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WebCardSlothActivity$bind$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WebCardSlothActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCardSlothActivity$bind$2(WebCardSlothActivity webCardSlothActivity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = webCardSlothActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebCardSlothActivity$bind$2 webCardSlothActivity$bind$2 = new WebCardSlothActivity$bind$2(this.this$0, continuation);
        webCardSlothActivity$bind$2.L$0 = obj;
        return webCardSlothActivity$bind$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebCardSlothActivity$bind$2 webCardSlothActivity$bind$2 = (WebCardSlothActivity$bind$2) create((com.yandex.passport.sloth.i0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webCardSlothActivity$bind$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s0 component;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.sloth.i0 i0Var = (com.yandex.passport.sloth.i0) this.L$0;
        boolean l = jl40.l(i0Var, com.yandex.passport.sloth.x.a);
        WebCardSlothActivity webCardSlothActivity = this.this$0;
        if (l) {
            com.yandex.passport.internal.ui.c.k(webCardSlothActivity, com.yandex.passport.internal.ui.sloth.e.p(l0.a));
        } else if (i0Var instanceof com.yandex.passport.sloth.c0) {
            com.yandex.passport.internal.ui.c.k(webCardSlothActivity, com.yandex.passport.internal.ui.sloth.e.p(new p0(((com.yandex.passport.sloth.c0) i0Var).a)));
        } else {
            component = webCardSlothActivity.getComponent();
            component.getWebAmReporter().j(i0Var.toString(), WebAmReporter$Companion$EventPlace.WEB_CARD);
        }
        return zy11.a;
    }
}
