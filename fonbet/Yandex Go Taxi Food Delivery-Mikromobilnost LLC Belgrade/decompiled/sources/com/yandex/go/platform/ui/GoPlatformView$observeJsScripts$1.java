package com.yandex.go.platform.ui;

import android.webkit.WebView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pme;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.ui.GoPlatformView$observeJsScripts$1", f = "GoPlatformView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class GoPlatformView$observeJsScripts$1 extends SuspendLambda implements wls {
    final /* synthetic */ WebView $webView;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoPlatformView$observeJsScripts$1(WebView webView, Continuation continuation) {
        super(2, continuation);
        this.$webView = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GoPlatformView$observeJsScripts$1 goPlatformView$observeJsScripts$1 = new GoPlatformView$observeJsScripts$1(this.$webView, continuation);
        goPlatformView$observeJsScripts$1.L$0 = obj;
        return goPlatformView$observeJsScripts$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GoPlatformView$observeJsScripts$1 goPlatformView$observeJsScripts$1 = (GoPlatformView$observeJsScripts$1) create((String) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        goPlatformView$observeJsScripts$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.$webView.evaluateJavascript((String) this.L$0, new pme(2));
        return zy11.a;
    }
}
