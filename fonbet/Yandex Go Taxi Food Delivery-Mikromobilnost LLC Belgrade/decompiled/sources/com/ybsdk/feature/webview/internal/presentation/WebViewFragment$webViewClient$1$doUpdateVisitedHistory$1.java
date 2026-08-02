package com.ybsdk.feature.webview.internal.presentation;

import defpackage.cd0;
import defpackage.gv41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ov41;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.webview.internal.presentation.WebViewFragment$webViewClient$1$doUpdateVisitedHistory$1", f = "WebViewFragment.kt", l = {718}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class WebViewFragment$webViewClient$1$doUpdateVisitedHistory$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ WebViewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewFragment$webViewClient$1$doUpdateVisitedHistory$1(WebViewFragment webViewFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = webViewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewFragment$webViewClient$1$doUpdateVisitedHistory$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewFragment$webViewClient$1$doUpdateVisitedHistory$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gv41 viewModel;
        WebViewFragment webViewFragment;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            WebViewFragment webViewFragment2 = this.this$0;
            viewModel = webViewFragment2.getViewModel();
            cd0 cd0Var = viewModel.y;
            this.L$0 = webViewFragment2;
            this.label = 1;
            Object y = e.y(cd0Var, this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = y;
            webViewFragment = webViewFragment2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            webViewFragment = (WebViewFragment) this.L$0;
            kotlin.b.b(obj);
        }
        webViewFragment.updateControls((ov41) obj);
        return zy11.a;
    }
}
