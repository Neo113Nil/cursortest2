package com.yandex.go.taxi.order.network;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.g6y0;
import defpackage.i6y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pu70;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/taxi/order/models/api/response/OrderCommitResponse;", "<anonymous>", "(Ltse;)Lcom/yandex/go/taxi/order/models/api/response/OrderCommitResponse;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.network.TaxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1", f = "TaxiOrderEagerProvisioningInteractorImpl.kt", l = {71, 72}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ Preorder $preorder;
    final /* synthetic */ String $zoneName;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1(e eVar, Preorder preorder, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$preorder = preorder;
        this.$zoneName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1(this.this$0, this.$preorder, this.$zoneName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1 taxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean a = ((i6y0) ((g6y0) this.this$0.e.get())).a();
            d dVar = (d) this.this$0.c.get();
            Preorder preorder = this.$preorder;
            String str = this.$zoneName;
            this.Z$0 = a;
            this.label = 1;
            taxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1 = this;
            obj = dVar.a(preorder, str, null, a, taxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1);
            if (obj != coroutineSingletons) {
                z = a;
            }
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        z = this.Z$0;
        kotlin.b.b(obj);
        taxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1 = this;
        c cVar = (c) taxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1.this$0.f.get();
        String str2 = ((pu70) obj).a;
        taxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1.L$0 = null;
        taxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1.Z$0 = z;
        taxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1.label = 2;
        Object a2 = cVar.a(str2, taxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1, z);
        return a2 == coroutineSingletons ? coroutineSingletons : a2;
    }
}
