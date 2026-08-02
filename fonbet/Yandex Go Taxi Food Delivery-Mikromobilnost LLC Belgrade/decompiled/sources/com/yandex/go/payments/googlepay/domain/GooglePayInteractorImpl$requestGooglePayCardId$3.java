package com.yandex.go.payments.googlepay.domain;

import android.util.Base64;
import com.adjust.sdk.Constants;
import com.yandex.go.payments.data.BillingApi;
import com.yandex.go.payments.data.model.BindGooglePayBillingRequest;
import com.yandex.go.payments.data.model.BindGooglePayParams;
import com.yandex.go.payments.data.model.BindGooglePayResponse;
import defpackage.ac20;
import defpackage.cmt;
import defpackage.fw4;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uut;
import defpackage.uza;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zut;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/payments/data/model/BindGooglePayResponse;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.googlepay.domain.GooglePayInteractorImpl$requestGooglePayCardId$3", f = "GooglePayInteractorImpl.kt", l = {398, 399, Constants.MINIMAL_ERROR_STATUS_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class GooglePayInteractorImpl$requestGooglePayCardId$3 extends SuspendLambda implements wls {
    final /* synthetic */ zut $params;
    final /* synthetic */ uut $tokenInfo;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayInteractorImpl$requestGooglePayCardId$3(zut zutVar, e eVar, uut uutVar, Continuation continuation) {
        super(2, continuation);
        this.$params = zutVar;
        this.this$0 = eVar;
        this.$tokenInfo = uutVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GooglePayInteractorImpl$requestGooglePayCardId$3 googlePayInteractorImpl$requestGooglePayCardId$3 = new GooglePayInteractorImpl$requestGooglePayCardId$3(this.$params, this.this$0, this.$tokenInfo, continuation);
        googlePayInteractorImpl$requestGooglePayCardId$3.L$0 = obj;
        return googlePayInteractorImpl$requestGooglePayCardId$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GooglePayInteractorImpl$requestGooglePayCardId$3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c4, code lost:
    
        if (r0.emit((com.yandex.go.payments.data.model.BindGooglePayResponse) r15, r14) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        if (r15 == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            int i3 = this.$params.a;
            ((q) ((ac20) this.this$0.p.get())).h("GooglePay.Bind.Started", g8e.z("identifier", this.this$0.u));
            e eVar = this.this$0;
            this.L$0 = vprVar;
            this.I$0 = i3;
            this.label = 1;
            Object a = e.a(eVar, i3, this);
            if (a != coroutineSingletons) {
                i = i3;
                obj = a;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            i = this.I$0;
            kotlin.b.b(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            i = this.I$0;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = i;
            this.label = 3;
        }
        BillingApi billingApi = (BillingApi) obj;
        zut zutVar = this.$params;
        String str = zutVar.b;
        e eVar2 = this.this$0;
        uut uutVar = this.$tokenInfo;
        String valueOf = String.valueOf(zutVar.a);
        fw4 fw4Var = eVar2.i;
        String str2 = uutVar.a;
        fw4Var.getClass();
        String encodeToString = Base64.encodeToString(str2.getBytes(uza.a), 2);
        BindGooglePayParams.TokenizationType tokenizationType = uutVar.c ? BindGooglePayParams.TokenizationType.DIRECT : BindGooglePayParams.TokenizationType.GATEWAY;
        eVar2.j.getClass();
        cmt<BindGooglePayResponse> a2 = billingApi.a(str, new BindGooglePayBillingRequest(new BindGooglePayParams(encodeToString, UUID.randomUUID().toString(), valueOf, tokenizationType)));
        this.L$0 = vprVar;
        this.I$0 = i;
        this.label = 2;
        obj = ru.yandex.taxi.network.api.a.a(a2, null, this);
    }
}
