package com.ybsdk.feature.webview.internal.presentation;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import defpackage.gv41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wi51;
import defpackage.wls;
import defpackage.zch;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.webview.internal.presentation.WebViewFragment$webViewClient$1$onInterceptRequest$1", f = "WebViewFragment.kt", l = {673}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class WebViewFragment$webViewClient$1$onInterceptRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ wi51 $request;
    int label;
    final /* synthetic */ WebViewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewFragment$webViewClient$1$onInterceptRequest$1(WebViewFragment webViewFragment, wi51 wi51Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = webViewFragment;
        this.$request = wi51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewFragment$webViewClient$1$onInterceptRequest$1(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewFragment$webViewClient$1$onInterceptRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gv41 viewModel;
        Set<String> keySet;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            viewModel = this.this$0.getViewModel();
            Uri url = ((WebResourceRequest) ((zch) this.$request).a).getUrl();
            Map<String, String> requestHeaders = ((WebResourceRequest) ((zch) this.$request).a).getRequestHeaders();
            List J0 = (requestHeaders == null || (keySet = requestHeaders.keySet()) == null) ? EmptyList.a : kotlin.collections.a.J0(keySet);
            this.label = 1;
            if (viewModel.s0(url, J0, this) == coroutineSingletons) {
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
