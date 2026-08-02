package com.yandex.fintechsdk.features.webview.internal.presentation;

import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.v7w;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv7w;", "Ldu41;", "Lot41;", "Lzy11;", "<anonymous>", "(Lv7w;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.webview.internal.presentation.WebViewViewModel$onBackPressed$1", f = "WebViewViewModel.kt", l = {36, 40}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class WebViewViewModel$onBackPressed$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewViewModel$onBackPressed$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebViewViewModel$onBackPressed$1 webViewViewModel$onBackPressed$1 = new WebViewViewModel$onBackPressed$1(this.this$0, continuation);
        webViewViewModel$onBackPressed$1.L$0 = obj;
        return webViewViewModel$onBackPressed$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewViewModel$onBackPressed$1) create((v7w) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (com.yandex.fintechsdk.core.architecture.api.mvi.b.d(r1, defpackage.lt41.a, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r8 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v7w v7wVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v7wVar = (v7w) this.L$0;
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            WebViewViewModel$onBackPressed$1$isHandled$1 webViewViewModel$onBackPressed$1$isHandled$1 = new WebViewViewModel$onBackPressed$1$isHandled$1(this.this$0, null);
            this.L$0 = v7wVar;
            this.label = 1;
            obj = tje.k0(g6uVar, webViewViewModel$onBackPressed$1$isHandled$1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v7wVar = (v7w) this.L$0;
            kotlin.b.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
