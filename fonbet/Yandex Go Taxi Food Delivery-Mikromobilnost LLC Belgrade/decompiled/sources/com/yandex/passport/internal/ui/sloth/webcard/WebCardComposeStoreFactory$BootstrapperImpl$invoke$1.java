package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/internal/sloth/performers/webcard/f;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/internal/sloth/performers/webcard/f;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardComposeStoreFactory$BootstrapperImpl$invoke$1", f = "WebCardComposeStoreFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebCardComposeStoreFactory$BootstrapperImpl$invoke$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCardComposeStoreFactory$BootstrapperImpl$invoke$1(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebCardComposeStoreFactory$BootstrapperImpl$invoke$1 webCardComposeStoreFactory$BootstrapperImpl$invoke$1 = new WebCardComposeStoreFactory$BootstrapperImpl$invoke$1(this.this$0, continuation);
        webCardComposeStoreFactory$BootstrapperImpl$invoke$1.L$0 = obj;
        return webCardComposeStoreFactory$BootstrapperImpl$invoke$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebCardComposeStoreFactory$BootstrapperImpl$invoke$1 webCardComposeStoreFactory$BootstrapperImpl$invoke$1 = (WebCardComposeStoreFactory$BootstrapperImpl$invoke$1) create((com.yandex.passport.internal.sloth.performers.webcard.f) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webCardComposeStoreFactory$BootstrapperImpl$invoke$1.invokeSuspend(zy11Var);
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
        this.this$0.a(new m((com.yandex.passport.internal.sloth.performers.webcard.f) this.L$0));
        return zy11.a;
    }
}
