package com.ybsdk.feature.webview.internal.presentation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.webview.internal.presentation.WebViewViewModelImpl$onDownloadStarted$1", f = "WebViewViewModelImpl.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WebViewViewModelImpl$onDownloadStarted$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $sameAsOpenedUrl;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewViewModelImpl$onDownloadStarted$1(boolean z, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$sameAsOpenedUrl = z;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewViewModelImpl$onDownloadStarted$1(this.$sameAsOpenedUrl, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewViewModelImpl$onDownloadStarted$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$sameAsOpenedUrl) {
                this.label = 1;
                if (kotlinx.coroutines.a.i(1500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.D.e();
        return zy11.a;
    }
}
