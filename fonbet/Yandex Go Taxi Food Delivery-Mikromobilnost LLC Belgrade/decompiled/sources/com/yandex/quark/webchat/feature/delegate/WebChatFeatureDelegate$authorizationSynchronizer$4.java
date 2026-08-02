package com.yandex.quark.webchat.feature.delegate;

import android.net.Uri;
import android.webkit.CookieManager;
import defpackage.le41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.z3x0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lle41;", "webChatUrl", "Lzy11;", "<anonymous>", "(Lle41;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.feature.delegate.WebChatFeatureDelegate$authorizationSynchronizer$4", f = "WebChatFeatureDelegate.kt", l = {221}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class WebChatFeatureDelegate$authorizationSynchronizer$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatFeatureDelegate$authorizationSynchronizer$4(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebChatFeatureDelegate$authorizationSynchronizer$4 webChatFeatureDelegate$authorizationSynchronizer$4 = new WebChatFeatureDelegate$authorizationSynchronizer$4(this.this$0, continuation);
        webChatFeatureDelegate$authorizationSynchronizer$4.L$0 = obj;
        return webChatFeatureDelegate$authorizationSynchronizer$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebChatFeatureDelegate$authorizationSynchronizer$4 webChatFeatureDelegate$authorizationSynchronizer$4 = (WebChatFeatureDelegate$authorizationSynchronizer$4) create(new le41(((le41) obj).a), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webChatFeatureDelegate$authorizationSynchronizer$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            Uri uri = ((le41) this.L$0).a;
            this.this$0.c.q.getClass();
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Uri uri2 = (Uri) this.L$0;
        kotlin.b.b(obj);
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b bVar = this.this$0;
        if (booleanValue) {
            ((CookieManager) ((z3x0) bVar.j).b.getValue()).flush();
            return zy11Var;
        }
        bVar.b.e("WebChatFeatureDelegate", "Failed to set iCookie for " + uri2);
        return zy11Var;
    }
}
