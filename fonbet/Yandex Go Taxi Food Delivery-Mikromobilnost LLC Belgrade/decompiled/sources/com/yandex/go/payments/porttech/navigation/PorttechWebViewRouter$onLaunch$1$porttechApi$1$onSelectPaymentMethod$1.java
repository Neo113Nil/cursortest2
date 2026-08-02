package com.yandex.go.payments.porttech.navigation;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.porttech.domain.PorttechJsNativeApi;
import com.yandex.go.payments.porttech.domain.SelectPaymentMethodRequest;
import defpackage.azz;
import defpackage.cce0;
import defpackage.dce0;
import defpackage.h0a0;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.porttech.navigation.PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSelectPaymentMethod$1", f = "PorttechWebViewRouter.kt", l = {128}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSelectPaymentMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ cce0 $payload;
    final /* synthetic */ PorttechJsNativeApi $porttechJsNativeApi;
    final /* synthetic */ String $promiseId;
    final /* synthetic */ SelectPaymentMethodRequest $request;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSelectPaymentMethod$1(d dVar, String str, SelectPaymentMethodRequest selectPaymentMethodRequest, PorttechJsNativeApi porttechJsNativeApi, cce0 cce0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$promiseId = str;
        this.$request = selectPaymentMethodRequest;
        this.$porttechJsNativeApi = porttechJsNativeApi;
        this.$payload = cce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSelectPaymentMethod$1(this.this$0, this.$promiseId, this.$request, this.$porttechJsNativeApi, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSelectPaymentMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        String str = this.$promiseId;
        SelectPaymentMethodRequest selectPaymentMethodRequest = this.$request;
        PorttechJsNativeApi porttechJsNativeApi = this.$porttechJsNativeApi;
        cce0 cce0Var = this.$payload;
        this.label = 1;
        dVar.getClass();
        h0a0 h0a0Var = new h0a0(selectPaymentMethodRequest.a.size() >= 2 ? new zzs(((Number) selectPaymentMethodRequest.a.get(1)).doubleValue(), ((Number) selectPaymentMethodRequest.a.get(0)).doubleValue(), 0, null, null, 28) : cce0Var.b, null);
        com.yandex.go.payments.lpm.navigation.d a = dVar.R().a();
        PaymentsScreen paymentsScreen = PaymentsScreen.PORTTECH;
        dce0 dce0Var = dVar.O;
        dVar.A(a, new azz(paymentsScreen, "no_feature", h0a0Var, dce0Var == null ? null : new m6a0(dce0Var.b, dce0Var.a, null), false, false, null, false, false, null, null, null, null, null, null, null, null, null, 524160), new b(dVar, porttechJsNativeApi, str));
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
