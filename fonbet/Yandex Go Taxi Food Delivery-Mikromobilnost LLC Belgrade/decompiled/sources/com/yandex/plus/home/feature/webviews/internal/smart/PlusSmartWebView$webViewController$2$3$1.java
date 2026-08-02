package com.yandex.plus.home.feature.webviews.internal.smart;

import android.webkit.WebResourceRequest;
import defpackage.j6a1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yld0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/webkit/WebResourceResponse;", "<anonymous>", "(Ltse;)Landroid/webkit/WebResourceResponse;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.smart.PlusSmartWebView$webViewController$2$3$1", f = "PlusSmartWebView.kt", l = {149}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PlusSmartWebView$webViewController$2$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ WebResourceRequest $it;
    int label;
    final /* synthetic */ PlusSmartWebView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusSmartWebView$webViewController$2$3$1(PlusSmartWebView plusSmartWebView, WebResourceRequest webResourceRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = plusSmartWebView;
        this.$it = webResourceRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusSmartWebView$webViewController$2$3$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusSmartWebView$webViewController$2$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yld0 yld0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        yld0Var = this.this$0.presenter;
        WebResourceRequest webResourceRequest = this.$it;
        this.label = 1;
        Object c = yld0Var.C.d() ? j6a1.c() : yld0Var.x.g(webResourceRequest.getUrl().toString(), this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
