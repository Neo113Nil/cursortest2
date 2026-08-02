package com.yandex.go.payments.porttech.navigation;

import com.yandex.go.payments.porttech.domain.PorttechJsNativeApi;
import com.yandex.go.payments.porttech.domain.SelectPaymentMethodRequest;
import defpackage.cce0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.porttech.navigation.PorttechWebViewRouter$onLaunch$1$porttechApi$1$onGetSelectedPaymentMethod$1", f = "PorttechWebViewRouter.kt", l = {HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PorttechWebViewRouter$onLaunch$1$porttechApi$1$onGetSelectedPaymentMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ cce0 $payload;
    final /* synthetic */ PorttechJsNativeApi $porttechJsNativeApi;
    final /* synthetic */ String $promiseId;
    final /* synthetic */ SelectPaymentMethodRequest $request;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PorttechWebViewRouter$onLaunch$1$porttechApi$1$onGetSelectedPaymentMethod$1(d dVar, String str, SelectPaymentMethodRequest selectPaymentMethodRequest, PorttechJsNativeApi porttechJsNativeApi, cce0 cce0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$promiseId = str;
        this.$request = selectPaymentMethodRequest;
        this.$porttechJsNativeApi = porttechJsNativeApi;
        this.$payload = cce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PorttechWebViewRouter$onLaunch$1$porttechApi$1$onGetSelectedPaymentMethod$1(this.this$0, this.$promiseId, this.$request, this.$porttechJsNativeApi, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PorttechWebViewRouter$onLaunch$1$porttechApi$1$onGetSelectedPaymentMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            String str = this.$promiseId;
            SelectPaymentMethodRequest selectPaymentMethodRequest = this.$request;
            PorttechJsNativeApi porttechJsNativeApi = this.$porttechJsNativeApi;
            cce0 cce0Var = this.$payload;
            this.label = 1;
            if (d.P(dVar, str, selectPaymentMethodRequest, porttechJsNativeApi, cce0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
