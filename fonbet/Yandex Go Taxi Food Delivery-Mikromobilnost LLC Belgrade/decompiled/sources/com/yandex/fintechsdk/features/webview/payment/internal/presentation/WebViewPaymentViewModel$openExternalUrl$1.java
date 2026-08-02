package com.yandex.fintechsdk.features.webview.payment.internal.presentation;

import android.content.Context;
import defpackage.cs41;
import defpackage.ds31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.r7x;
import defpackage.ta70;
import defpackage.tje;
import defpackage.tse;
import defpackage.v7w;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv7w;", "Lis41;", "Les41;", "Lzy11;", "<anonymous>", "(Lv7w;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentViewModel$openExternalUrl$1", f = "WebViewPaymentViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class WebViewPaymentViewModel$openExternalUrl$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ r7x $message;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentViewModel$openExternalUrl$1$1", f = "WebViewPaymentViewModel.kt", l = {264}, m = "invokeSuspend")
    /* renamed from: com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentViewModel$openExternalUrl$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ v7w $$this$intent;
        final /* synthetic */ Context $context;
        final /* synthetic */ r7x $message;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, r7x r7xVar, Context context, v7w v7wVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$message = r7xVar;
            this.$context = context;
            this.$$this$intent = v7wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$message, this.$context, this.$$this$intent, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String X;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.this$0.c).a(ta70.c);
                String uri = this.$message.c.toString();
                if (this.$message.a && (X = b.X(this.this$0, this.$context, uri)) != null) {
                    uri = X;
                }
                v7w v7wVar = this.$$this$intent;
                cs41 cs41Var = new cs41(uri);
                this.label = 1;
                if (com.yandex.fintechsdk.core.architecture.api.mvi.b.d(v7wVar, cs41Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            if (this.$message.b) {
                this.this$0.G.b.a();
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewPaymentViewModel$openExternalUrl$1(b bVar, r7x r7xVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$message = r7xVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebViewPaymentViewModel$openExternalUrl$1 webViewPaymentViewModel$openExternalUrl$1 = new WebViewPaymentViewModel$openExternalUrl$1(this.this$0, this.$message, this.$context, continuation);
        webViewPaymentViewModel$openExternalUrl$1.L$0 = obj;
        return webViewPaymentViewModel$openExternalUrl$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebViewPaymentViewModel$openExternalUrl$1 webViewPaymentViewModel$openExternalUrl$1 = (WebViewPaymentViewModel$openExternalUrl$1) create((v7w) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webViewPaymentViewModel$openExternalUrl$1.invokeSuspend(zy11Var);
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
        pzt0 pzt0Var = this.this$0.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        b bVar = this.this$0;
        bVar.K = tje.N(ds31.a(bVar), null, null, new AnonymousClass1(this.this$0, this.$message, this.$context, v7wVar, null), 3);
        return zy11.a;
    }
}
