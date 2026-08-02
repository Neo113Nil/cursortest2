package com.yandex.go.rida.bids.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.avj0;
import defpackage.bms;
import defpackage.bq5;
import defpackage.cq5;
import defpackage.cwh0;
import defpackage.dq5;
import defpackage.eq5;
import defpackage.fq5;
import defpackage.gq5;
import defpackage.gyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "taxiOrder", "", "isAutoAcceptEnabled", "", "subtitle", "Lgq5;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;ZLjava/lang/String;)Lgq5;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.BidsDriveCardUiStateInteractor$uiStateFlow$1", f = "BidsDriveCardUiStateInteractor.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsDriveCardUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsDriveCardUiStateInteractor$uiStateFlow$1(e eVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        BidsDriveCardUiStateInteractor$uiStateFlow$1 bidsDriveCardUiStateInteractor$uiStateFlow$1 = new BidsDriveCardUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj4);
        bidsDriveCardUiStateInteractor$uiStateFlow$1.L$0 = (TaxiOrder) obj;
        bidsDriveCardUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        bidsDriveCardUiStateInteractor$uiStateFlow$1.L$1 = (String) obj3;
        return bidsDriveCardUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        eq5 eq5Var;
        Object a;
        bq5 bq5Var;
        cq5 cq5Var;
        dq5 dq5Var;
        eq5 eq5Var2;
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        boolean z = this.Z$0;
        String str = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            OrderStatusInfo V = taxiOrder.V();
            long j = taxiOrder.c;
            OrderStatusInfo.RidaSearchInfo ridaSearchInfo = V.u0;
            e eVar = this.this$0;
            zuj0 zuj0Var = eVar.a;
            OrderStatusInfo.RidaSearchInfo.ViewInfo viewInfo = ridaSearchInfo != null ? ridaSearchInfo.e : null;
            if (viewInfo == null) {
                String str2 = (String) eVar.g.getValue();
                String str3 = (String) eVar.h.getValue();
                Long l = taxiOrder.k;
                if (l != null) {
                    j = l.longValue();
                }
                eq5Var = new eq5(null, 0, str2, null, str3, j);
            } else {
                float f = viewInfo.b / 100.0f;
                int i2 = viewInfo.a;
                avj0 avj0Var = (avj0) zuj0Var;
                String f2 = avj0Var.f(cwh0.rida_bids_drivers, i2);
                String f3 = avj0Var.f(cwh0.rida_bids_have_seen_your_offer, viewInfo.a);
                Long l2 = taxiOrder.k;
                if (l2 != null) {
                    j = l2.longValue();
                }
                eq5Var = new eq5(Float.valueOf(f), i2, f2, f3, null, j);
            }
            avj0 avj0Var2 = (avj0) this.this$0.a;
            String h = avj0Var2.h(gyh0.rida_bids_source_address_title);
            Address u = taxiOrder.u();
            String d = u != null ? u.d() : null;
            String h2 = avj0Var2.h(gyh0.rida_bids_destination_address_title);
            Address l3 = taxiOrder.l();
            bq5 bq5Var2 = new bq5(h, d, h2, l3 != null ? l3.d() : null);
            cq5 cq5Var2 = new cq5(((avj0) this.this$0.a).h(gyh0.rida_summary_auto_accept_switch_title), z);
            dq5 dq5Var2 = new dq5(((avj0) this.this$0.a).h(gyh0.rida_bids_cancel_button));
            e eVar2 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = eq5Var;
            this.L$4 = bq5Var2;
            this.L$5 = cq5Var2;
            this.L$6 = dq5Var2;
            this.Z$0 = z;
            this.label = 1;
            a = e.a(eVar2, taxiOrder, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            bq5Var = bq5Var2;
            cq5Var = cq5Var2;
            dq5Var = dq5Var2;
            eq5Var2 = eq5Var;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq5 dq5Var3 = (dq5) this.L$6;
            cq5 cq5Var3 = (cq5) this.L$5;
            bq5Var = (bq5) this.L$4;
            eq5 eq5Var3 = (eq5) this.L$3;
            kotlin.b.b(obj);
            cq5Var = cq5Var3;
            eq5Var2 = eq5Var3;
            a = obj;
            dq5Var = dq5Var3;
        }
        return new gq5(eq5Var2, bq5Var, cq5Var, dq5Var, (fq5) a);
    }
}
