package com.yandex.plus.home.feature.webviews.internal.stories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.xk41;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", Constants.KEY_MESSAGE, "Lzy11;", "<anonymous>", "(Ltse;Ljava/lang/String;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesPresenter$subscribeOnWebViewReceiverMessages$2", f = "WebStoriesPresenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebStoriesPresenter$subscribeOnWebViewReceiverMessages$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebStoriesPresenter$subscribeOnWebViewReceiverMessages$2(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WebStoriesPresenter$subscribeOnWebViewReceiverMessages$2 webStoriesPresenter$subscribeOnWebViewReceiverMessages$2 = new WebStoriesPresenter$subscribeOnWebViewReceiverMessages$2(this.this$0, (Continuation) obj3);
        webStoriesPresenter$subscribeOnWebViewReceiverMessages$2.L$0 = (String) obj2;
        zy11 zy11Var = zy11.a;
        webStoriesPresenter$subscribeOnWebViewReceiverMessages$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((xk41) this.this$0.b).sendMessage(str);
        return zy11.a;
    }
}
