package com.yandex.go.chargers.discovery.shortcuts;

import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.chargers.discounts.api.data.model.ChargersSelectedDiscountDto;
import com.yandex.go.chargers.payments.api.data.ChargersPaymentMethod;
import com.yandex.mapkit.geometry.Point;
import defpackage.bms;
import defpackage.eaf0;
import defpackage.ejb1;
import defpackage.fl3;
import defpackage.gwk0;
import defpackage.hfa0;
import defpackage.hl3;
import defpackage.lpa;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ow9;
import defpackage.p53;
import defpackage.sbx;
import defpackage.vmx;
import defpackage.wpa;
import defpackage.zgc0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhl3;", "authStatus", "Lcom/yandex/mapkit/geometry/Point;", "geo", "Lhfa0;", "paymentOptions", "Leaf0;", "<anonymous>", "(Lhl3;Lcom/yandex/mapkit/geometry/Point;Lhfa0;)Leaf0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discovery.shortcuts.ChargersShortcutsRequestTriggerRepository$triggerListenerFlow$1", f = "ChargersShortcutsRequestTriggerRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersShortcutsRequestTriggerRepository$triggerListenerFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ wpa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersShortcutsRequestTriggerRepository$triggerListenerFlow$1(wpa wpaVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = wpaVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ChargersShortcutsRequestTriggerRepository$triggerListenerFlow$1 chargersShortcutsRequestTriggerRepository$triggerListenerFlow$1 = new ChargersShortcutsRequestTriggerRepository$triggerListenerFlow$1(this.this$0, (Continuation) obj4);
        chargersShortcutsRequestTriggerRepository$triggerListenerFlow$1.L$0 = (hl3) obj;
        chargersShortcutsRequestTriggerRepository$triggerListenerFlow$1.L$1 = (Point) obj2;
        chargersShortcutsRequestTriggerRepository$triggerListenerFlow$1.L$2 = (hfa0) obj3;
        return chargersShortcutsRequestTriggerRepository$triggerListenerFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.serialization.json.b J;
        ChargersSelectedDiscountDto a;
        hl3 hl3Var = (hl3) this.L$0;
        Point point = (Point) this.L$1;
        hfa0 hfa0Var = (hfa0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlinx.serialization.json.b bVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zzs E = ru.yandex.taxi.map.utils.a.E(point, null);
        List c = ejb1.c(hfa0Var.d());
        PlainAddress.Companion.getClass();
        PlainAddress a2 = zgc0.a(E);
        Long l = hl3Var instanceof fl3 ? new Long(((fl3) hl3Var).a) : null;
        this.this$0.getClass();
        if (c.isEmpty()) {
            J = null;
        } else {
            sbx a3 = vmx.a.a();
            p53 p53Var = new p53(ChargersPaymentMethod.Companion.serializer(), 0);
            a3.getClass();
            J = gwk0.J(a3, c, p53Var);
        }
        ow9 ow9Var = (ow9) kotlinx.coroutines.flow.e.d(this.this$0.c.y).a.getValue();
        if (ow9Var != null && (a = lpa.a(ow9Var, this.this$0.d.b())) != null) {
            sbx a4 = vmx.a.a();
            KSerializer serializer = ChargersSelectedDiscountDto.Companion.serializer();
            a4.getClass();
            bVar = gwk0.J(a4, a, serializer);
        }
        return new eaf0(E, a2, EmptyList.a, true, null, l, J, bVar, 16);
    }
}
