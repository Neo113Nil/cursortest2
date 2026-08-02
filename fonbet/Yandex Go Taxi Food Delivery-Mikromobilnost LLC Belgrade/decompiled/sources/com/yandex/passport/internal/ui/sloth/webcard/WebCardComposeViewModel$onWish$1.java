package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardComposeViewModel$onWish$1", f = "WebCardComposeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebCardComposeViewModel$onWish$1 extends SuspendLambda implements wls {
    final /* synthetic */ f0 $wish;
    int label;
    final /* synthetic */ g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCardComposeViewModel$onWish$1(g0 g0Var, f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = g0Var;
        this.$wish = f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebCardComposeViewModel$onWish$1(this.this$0, this.$wish, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebCardComposeViewModel$onWish$1 webCardComposeViewModel$onWish$1 = (WebCardComposeViewModel$onWish$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webCardComposeViewModel$onWish$1.invokeSuspend(zy11Var);
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
        this.this$0.b.a(this.$wish);
        return zy11.a;
    }
}
