package com.yandex.fintechsdk.features.webview.internal.presentation;

import defpackage.hp41;
import defpackage.ip41;
import defpackage.jp41;
import defpackage.js41;
import defpackage.kp41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.v7w;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv7w;", "Ldu41;", "Lot41;", "Lzy11;", "<anonymous>", "(Lv7w;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.webview.internal.presentation.WebViewViewModel$observeFacadeStates$1$1$1", f = "WebViewViewModel.kt", l = {102, 103, 104}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class WebViewViewModel$observeFacadeStates$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ kp41 $loadState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewViewModel$observeFacadeStates$1$1$1(kp41 kp41Var, Continuation continuation) {
        super(2, continuation);
        this.$loadState = kp41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebViewViewModel$observeFacadeStates$1$1$1 webViewViewModel$observeFacadeStates$1$1$1 = new WebViewViewModel$observeFacadeStates$1$1$1(this.$loadState, continuation);
        webViewViewModel$observeFacadeStates$1$1$1.L$0 = obj;
        return webViewViewModel$observeFacadeStates$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewViewModel$observeFacadeStates$1$1$1) create((v7w) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (com.yandex.fintechsdk.core.architecture.api.mvi.b.c(r7, r1, r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (com.yandex.fintechsdk.core.architecture.api.mvi.b.c(r7, r1, r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (com.yandex.fintechsdk.core.architecture.api.mvi.b.c(r7, r1, r6) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v7w v7wVar = (v7w) this.L$0;
            kp41 kp41Var = this.$loadState;
            if (kp41Var instanceof hp41) {
                js41 js41Var = new js41(3);
                this.label = 1;
            } else if (kp41Var instanceof jp41) {
                js41 js41Var2 = new js41(4);
                this.label = 2;
            } else if (kp41Var instanceof ip41) {
                js41 js41Var3 = new js41(5);
                this.label = 3;
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
