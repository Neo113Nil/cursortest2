package com.yandex.go.payments.paymentlist.ui;

import com.yandex.go.payments.paymentlist.details.d;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.k9a0;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lk9a0;", "<anonymous>", "(Ltse;)Lk9a0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.ui.PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$1", f = "PaymentMethodsBannerFactoryImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 60}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ lea0 $paymentModel;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$1(b bVar, lea0 lea0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$paymentModel = lea0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$1(this.this$0, this.$paymentModel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        if (r7 == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        k9a0 k9a0Var;
        k9a0 k9a0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.this$0.g == null) {
                bVar = this.this$0;
                lea0 lea0Var = this.$paymentModel;
                this.L$0 = bVar;
                this.label = 1;
                obj = b.a(bVar, lea0Var, this);
            }
            k9a0Var = this.this$0.g;
            if (k9a0Var != null) {
                d dVar = this.this$0.c;
                String str = k9a0Var.a;
                this.L$0 = k9a0Var;
                this.label = 2;
                Object e = dVar.e(str, this);
                if (e != coroutineSingletons) {
                    obj = e;
                    k9a0Var2 = k9a0Var;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return coroutineSingletons;
            }
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k9a0Var2 = (k9a0) this.L$0;
            kotlin.b.b(obj);
            if (((Boolean) obj).booleanValue()) {
                return k9a0Var2;
            }
            return null;
        }
        bVar = (b) this.L$0;
        kotlin.b.b(obj);
        bVar.g = (k9a0) obj;
        k9a0Var = this.this$0.g;
        if (k9a0Var != null) {
        }
        return null;
    }
}
