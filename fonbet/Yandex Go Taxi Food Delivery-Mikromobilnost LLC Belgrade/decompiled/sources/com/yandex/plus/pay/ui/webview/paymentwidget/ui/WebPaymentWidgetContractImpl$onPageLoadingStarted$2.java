package com.yandex.plus.pay.ui.webview.paymentwidget.ui;

import com.yandex.plus.log.api.LogPriority;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.webview.paymentwidget.ui.WebPaymentWidgetContractImpl$onPageLoadingStarted$2", f = "WebPaymentWidgetContractImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebPaymentWidgetContractImpl$onPageLoadingStarted$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.pay.ui.webview.paymentwidget.ui.WebPaymentWidgetContractImpl$onPageLoadingStarted$2$1", f = "WebPaymentWidgetContractImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.pay.ui.webview.paymentwidget.ui.WebPaymentWidgetContractImpl$onPageLoadingStarted$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$url, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
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
            a aVar = this.this$0;
            aVar.k.a(aVar.g, this.$url, "init-started");
            this.this$0.j.l("Started message timeout!");
            pgz pgzVar = this.this$0.i;
            LogPriority logPriority = LogPriority.ERROR;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "WebPaymentWidgetContractImpl", "Started message timeout!");
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebPaymentWidgetContractImpl$onPageLoadingStarted$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebPaymentWidgetContractImpl$onPageLoadingStarted$2 webPaymentWidgetContractImpl$onPageLoadingStarted$2 = new WebPaymentWidgetContractImpl$onPageLoadingStarted$2(this.this$0, this.$url, continuation);
        webPaymentWidgetContractImpl$onPageLoadingStarted$2.L$0 = obj;
        return webPaymentWidgetContractImpl$onPageLoadingStarted$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebPaymentWidgetContractImpl$onPageLoadingStarted$2 webPaymentWidgetContractImpl$onPageLoadingStarted$2 = (WebPaymentWidgetContractImpl$onPageLoadingStarted$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webPaymentWidgetContractImpl$onPageLoadingStarted$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        com.yandex.plus.home.common.utils.a.g(tseVar, aVar.g, new AnonymousClass1(aVar, this.$url, null));
        return zy11.a;
    }
}
