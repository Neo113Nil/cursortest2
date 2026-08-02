package com.yandex.go.taxi.order.details.v2.state.elements.cost_center;

import android.text.SpannableString;
import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Ellipsize;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.cost_center.CostCenterParam;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CostCenter;
import defpackage.ass0;
import defpackage.bdc;
import defpackage.bms;
import defpackage.bss0;
import defpackage.css0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.jve;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ofk0;
import defpackage.wik0;
import defpackage.xng0;
import defpackage.xss0;
import defpackage.yjk0;
import defpackage.zjk0;
import defpackage.zrs0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.utils.AbsoluteSizeSpanFix;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "holder", "", "Ljve;", "accounts", "Lzjk0;", "generic", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Ljava/util/List;Lzjk0;)Lzjk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.cost_center.RideCardCostCenterDataSource$stateFlow$3", f = "RideCardCostCenterDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCostCenterDataSource$stateFlow$3 extends SuspendLambda implements bms {
    final /* synthetic */ RideCardItemDto$CostCenter $item;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCostCenterDataSource$stateFlow$3(c cVar, RideCardItemDto$CostCenter rideCardItemDto$CostCenter, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
        this.$item = rideCardItemDto$CostCenter;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RideCardCostCenterDataSource$stateFlow$3 rideCardCostCenterDataSource$stateFlow$3 = new RideCardCostCenterDataSource$stateFlow$3(this.this$0, this.$item, (Continuation) obj4);
        rideCardCostCenterDataSource$stateFlow$3.L$0 = (TaxiOrder) obj;
        rideCardCostCenterDataSource$stateFlow$3.L$1 = (List) obj2;
        rideCardCostCenterDataSource$stateFlow$3.L$2 = (zjk0) obj3;
        return rideCardCostCenterDataSource$stateFlow$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        List list = (List) this.L$1;
        zjk0 zjk0Var = (zjk0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = this.this$0.a.b().q().b;
        if (str == null) {
            return new yjk0(this.$item.a);
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((jve) obj2).a, str)) {
                break;
            }
        }
        jve jveVar = (jve) obj2;
        if (jveVar == null) {
            return new yjk0(this.$item.a);
        }
        wik0 wik0Var = zjk0Var instanceof wik0 ? (wik0) zjk0Var : null;
        if (wik0Var == null) {
            return new yjk0(this.$item.a);
        }
        css0 css0Var = wik0Var.c.b;
        zrs0 zrs0Var = css0Var instanceof zrs0 ? (zrs0) css0Var : null;
        if (zrs0Var == null) {
            return new yjk0(this.$item.a);
        }
        c cVar = this.this$0;
        List h = taxiOrder.h();
        cVar.getClass();
        List list2 = h;
        ?? r1 = "";
        if (list2 != null && !list2.isEmpty()) {
            Iterator it2 = kotlin.collections.a.x0(jveVar.e, new ofk0()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                CostCenterField costCenterField = (CostCenterField) it2.next();
                Iterator it3 = h.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (jl40.l(((CostCenterParam) obj3).a, costCenterField.a)) {
                        break;
                    }
                }
                CostCenterParam costCenterParam = (CostCenterParam) obj3;
                String str2 = costCenterParam != null ? costCenterParam.c : null;
                if (str2 != null && !evu0.J(str2)) {
                    r1 = SpannableString.valueOf(str2);
                    r1.setSpan(new AbsoluteSizeSpanFix(13, true), 0, str2.length(), 17);
                    break;
                }
            }
        }
        CharSequence charSequence = r1;
        if (!evu0.J(charSequence)) {
            bss0 bss0Var = zrs0Var.a;
            ass0 ass0Var = bss0Var.g;
            zrs0Var = new zrs0(new bss0(bss0Var.a, bss0Var.b, bss0Var.c, charSequence, new bdc(xng0.textMinor), bss0Var.f, new ass0(ass0Var.a, ass0Var.b, 1, ass0Var.d, SlotItemUiState$Body$Ellipsize.END)));
        }
        return wik0.c(wik0Var, xss0.a(wik0Var.c, null, zrs0Var, null, null, null, 29));
    }
}
