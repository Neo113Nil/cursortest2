package com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain;

import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutErrorReason;
import defpackage.akb;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.enb;
import defpackage.fnb;
import defpackage.jlb;
import defpackage.jo2;
import defpackage.klb;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.plb;
import defpackage.sjb;
import defpackage.tse;
import defpackage.w1e0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.CheckoutDataInteractor$startPollingCheckoutStatus$1", f = "CheckoutDataInteractor.kt", l = {210, 238}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CheckoutDataInteractor$startPollingCheckoutStatus$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ String $tripId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutDataInteractor$startPollingCheckoutStatus$1(k kVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$orderId = str;
        this.$tripId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CheckoutDataInteractor$startPollingCheckoutStatus$1 checkoutDataInteractor$startPollingCheckoutStatus$1 = new CheckoutDataInteractor$startPollingCheckoutStatus$1(this.this$0, this.$orderId, this.$tripId, continuation);
        checkoutDataInteractor$startPollingCheckoutStatus$1.L$0 = obj;
        return checkoutDataInteractor$startPollingCheckoutStatus$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutDataInteractor$startPollingCheckoutStatus$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0032, code lost:
    
        r13.b(r2);
        defpackage.bvf0.j(r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008c -> B:6:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0096 -> B:7:0x0032). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00aa -> B:7:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CheckoutErrorReason checkoutErrorReason;
        StringBuilder v;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!bvf0.D(tseVar)) {
            }
        } else if (i == 1) {
            kotlin.b.b(obj);
            jo2 jo2Var = (jo2) obj;
            k kVar = this.this$0;
            String str = this.$tripId;
            String str2 = this.$orderId;
            Object obj2 = jo2Var.a;
            Throwable a = Result.a(obj2);
            String str3 = jo2Var.b;
            if (a == null) {
                w1e0 w1e0Var = (w1e0) obj2;
                int i2 = sjb.a[w1e0Var.a.ordinal()];
                if (i2 == 1) {
                    kVar.a.b(enb.b(str, str2, str3));
                    bvf0.j(tseVar, null);
                } else if (i2 == 2) {
                    kVar.a.b(klb.a);
                    kVar.a.e(enb.d(str, str2, str3));
                    bvf0.j(tseVar, null);
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    long j = w1e0Var.b;
                    this.L$0 = tseVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 2;
                    obj = kotlinx.coroutines.a.j(j, this);
                }
            } else {
                fnb fnbVar = kVar.a;
                plb a2 = enb.a(str, str3, str2, a);
                if (a2 == null) {
                    checkoutErrorReason = CheckoutErrorReason.CheckoutStatusFailure;
                    v = b64.v("checkout_status:", str, ":", str2, ":");
                    v.append(str3);
                }
                fnbVar.b(new jlb(str, str2, str3, new akb(checkoutErrorReason, str3, str, str2, v.toString())));
                bvf0.j(tseVar, null);
            }
            if (!bvf0.D(tseVar)) {
            }
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (!bvf0.D(tseVar)) {
                return zy11.a;
            }
            com.yandex.go.masstransit.sdk.client_api.a aVar = this.this$0.e;
            String str4 = this.$orderId;
            this.L$0 = tseVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 1;
            obj = aVar.a(str4, this);
        }
    }
}
