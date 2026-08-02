package com.yandex.go.payments.porttech.navigation;

import com.yandex.go.payments.porttech.domain.PorttechJsNativeApi;
import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.ag41;
import defpackage.cce0;
import defpackage.dce0;
import defpackage.dg41;
import defpackage.ff41;
import defpackage.gg41;
import defpackage.h0a0;
import defpackage.lea0;
import defpackage.mo30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.scg;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.wnt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.porttech.navigation.PorttechWebViewRouter$onLaunch$1", f = "PorttechWebViewRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PorttechWebViewRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ cce0 $payload;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.porttech.navigation.PorttechWebViewRouter$onLaunch$1$2", f = "PorttechWebViewRouter.kt", l = {152, BlendingGradientView.BASE_ALPHA, 154}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.porttech.navigation.PorttechWebViewRouter$onLaunch$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements tls {
        final /* synthetic */ cce0 $payload;
        final /* synthetic */ PorttechJsNativeApi $porttechApi;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cce0 cce0Var, d dVar, PorttechJsNativeApi porttechJsNativeApi, Continuation continuation) {
            super(1, continuation);
            this.$payload = cce0Var;
            this.this$0 = dVar;
            this.$porttechApi = porttechJsNativeApi;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass2(this.$payload, this.this$0, this.$porttechApi, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass2) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
        
            if (r7 == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
        
            if (r7 == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        
            if (r7 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            d dVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                h0a0 h0a0Var = new h0a0(this.$payload.b, null);
                d dVar2 = this.this$0;
                this.L$0 = null;
                this.label = 1;
                obj = dVar2.S(h0a0Var, this);
            } else if (i == 1) {
                kotlin.b.b(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((ag41) ((scg) ((ff41) this.this$0.Q.getValue())).a()).a((UiWebViewConfig) obj);
                    return zy11.a;
                }
                dVar = (d) this.L$2;
                kotlin.b.b(obj);
                dVar.O = (dce0) obj;
                com.yandex.go.payments.porttech.data.a aVar = this.this$0.K;
                WebViewFromDeeplinkExperiment.a aVar2 = this.$payload.a;
                PorttechJsNativeApi porttechJsNativeApi = this.$porttechApi;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                obj = aVar.a(aVar2, porttechJsNativeApi, this);
            }
            lea0 lea0Var = ((oea0) obj).c;
            dVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = dVar;
            this.label = 2;
            obj = dVar.Q(lea0Var, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PorttechWebViewRouter$onLaunch$1(d dVar, cce0 cce0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = cce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PorttechWebViewRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PorttechWebViewRouter$onLaunch$1 porttechWebViewRouter$onLaunch$1 = (PorttechWebViewRouter$onLaunch$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        porttechWebViewRouter$onLaunch$1.invokeSuspend(zy11Var);
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
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(null, null, false, false, false, false, null, false, true, null, false, false, null, null, null, 0, 0, true, false, null, false, false, 4062971, null);
        d dVar = this.this$0;
        dVar.A((gg41) dVar.R.getValue(), new dg41(uiWebViewConfig, null, null, null, null, null, null, 254), new mo30(16, this.this$0));
        d dVar2 = this.this$0;
        PorttechJsNativeApi porttechJsNativeApi = new PorttechJsNativeApi(new c(dVar2, this.$payload), (wnt) dVar2.H.a.a.get());
        d dVar3 = this.this$0;
        tje.N(dVar3.o(), null, null, new PorttechWebViewRouter$safeTryWithSpinner$1(dVar3, new AnonymousClass2(this.$payload, dVar3, porttechJsNativeApi, null), null), 3);
        return zy11.a;
    }
}
