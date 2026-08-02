package com.yandex.fintechsdk.features.webview.payment.internal.presentation;

import defpackage.ai5;
import defpackage.ds31;
import defpackage.mp41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.v7w;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv7w;", "Lis41;", "Les41;", "Lzy11;", "<anonymous>", "(Lv7w;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentViewModel$observeFacadeStates$1", f = "WebViewPaymentViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class WebViewPaymentViewModel$observeFacadeStates$1 extends SuspendLambda implements wls {
    final /* synthetic */ mp41 $facade;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentViewModel$observeFacadeStates$1$1", f = "WebViewPaymentViewModel.kt", l = {204}, m = "invokeSuspend")
    /* renamed from: com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentViewModel$observeFacadeStates$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ v7w $$this$intent;
        final /* synthetic */ mp41 $facade;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(mp41 mp41Var, v7w v7wVar, Continuation continuation) {
            super(2, continuation);
            this.$facade = mp41Var;
            this.$$this$intent = v7wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$facade, this.$$this$intent, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                r0 r0Var = this.$facade.c;
                ai5 ai5Var = new ai5(this.$$this$intent, 1);
                this.label = 1;
                if (r0Var.collect(ai5Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            ny61.A();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewPaymentViewModel$observeFacadeStates$1(b bVar, mp41 mp41Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$facade = mp41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebViewPaymentViewModel$observeFacadeStates$1 webViewPaymentViewModel$observeFacadeStates$1 = new WebViewPaymentViewModel$observeFacadeStates$1(this.this$0, this.$facade, continuation);
        webViewPaymentViewModel$observeFacadeStates$1.L$0 = obj;
        return webViewPaymentViewModel$observeFacadeStates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebViewPaymentViewModel$observeFacadeStates$1 webViewPaymentViewModel$observeFacadeStates$1 = (WebViewPaymentViewModel$observeFacadeStates$1) create((v7w) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webViewPaymentViewModel$observeFacadeStates$1.invokeSuspend(zy11Var);
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
        v7w v7wVar = (v7w) this.L$0;
        pzt0 pzt0Var = this.this$0.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        b bVar = this.this$0;
        bVar.L = tje.N(ds31.a(bVar), null, null, new AnonymousClass1(this.$facade, v7wVar, null), 3);
        return zy11.a;
    }
}
