package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.copter.experiment.CopterInfoExperiment;
import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.bms;
import defpackage.d6z;
import defpackage.e430;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.n380;
import defpackage.ny61;
import defpackage.ooe;
import defpackage.p0c0;
import defpackage.r380;
import defpackage.roe;
import defpackage.sq00;
import defpackage.uoe;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln380;", ClidProvider.STATE, "Le430;", "pinStyles", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lr380;", "<anonymous>", "(Ln380;Le430;Lru/yandex/taxi/theme/ThemeType;)Lr380;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.interactor.OrderSourcePinWithStyleInteractor$pinV2StateWithStyleFlow$1", f = "OrderSourcePinWithStyleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderSourcePinWithStyleInteractor$pinV2StateWithStyleFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSourcePinWithStyleInteractor$pinV2StateWithStyleFlow$1(a0 a0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = a0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        OrderSourcePinWithStyleInteractor$pinV2StateWithStyleFlow$1 orderSourcePinWithStyleInteractor$pinV2StateWithStyleFlow$1 = new OrderSourcePinWithStyleInteractor$pinV2StateWithStyleFlow$1(this.this$0, (Continuation) obj4);
        orderSourcePinWithStyleInteractor$pinV2StateWithStyleFlow$1.L$0 = (n380) obj;
        orderSourcePinWithStyleInteractor$pinV2StateWithStyleFlow$1.L$1 = (e430) obj2;
        return orderSourcePinWithStyleInteractor$pinV2StateWithStyleFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Object obj2;
        String str;
        String Y;
        String str2;
        CopterOrderFlowExperiment.RoutePointSettings.RoutePoint routePoint;
        n380 n380Var = (n380) this.L$0;
        e430 e430Var = (e430) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        sq00 sq00Var = null;
        String Y2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        p0c0 p0c0Var = ((ru.yandex.taxi.styling.f) this.this$0.d).c(e430Var.c).a;
        a0 a0Var = this.this$0;
        TaxiOrder b = a0Var.b.b();
        if (((ooe) a0Var.g).c(b)) {
            roe roeVar = ((uoe) a0Var.h).a;
            String x = b.x();
            OrderStatusInfo V = b.V();
            CopterInfoExperiment copterInfoExperiment = V != null ? (CopterInfoExperiment) V.b(CopterInfoExperiment.class) : null;
            if (copterInfoExperiment == null || (list = copterInfoExperiment.e) == null) {
                list = roeVar.a().e;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((CopterOrderFlowExperiment.RoutePointSettings) obj2).a, x)) {
                    break;
                }
            }
            CopterOrderFlowExperiment.RoutePointSettings routePointSettings = (CopterOrderFlowExperiment.RoutePointSettings) obj2;
            CopterOrderFlowExperiment.RoutePointSettings.RoutePoint.Pin pin = (routePointSettings == null || (routePoint = routePointSettings.d) == null) ? null : routePoint.a;
            if (pin == null || (str2 = pin.c) == null) {
                str = null;
            } else {
                if (str2.length() == 0) {
                    str2 = null;
                }
                str = str2;
            }
            if (copterInfoExperiment != null) {
                if ((pin != null ? pin.a : null) != null) {
                    Y = d6z.Y(copterInfoExperiment, pin.a);
                    String str3 = Y != null ? "" : Y;
                    if (copterInfoExperiment != null) {
                        if ((pin != null ? pin.b : null) != null) {
                            Y2 = d6z.Y(copterInfoExperiment, pin.b);
                            sq00Var = new sq00(p0c0Var, null, true, null, str, str3, Y2 == null ? "" : Y2, false, false, null, null, 0.0f, 8074);
                        }
                    }
                    if ((pin == null ? pin.b : null) != null) {
                        Y2 = d6z.Y(roeVar.a(), pin.b);
                    }
                    sq00Var = new sq00(p0c0Var, null, true, null, str, str3, Y2 == null ? "" : Y2, false, false, null, null, 0.0f, 8074);
                }
            }
            Y = (pin != null ? pin.a : null) != null ? d6z.Y(roeVar.a(), pin.a) : null;
            if (Y != null) {
            }
            if (copterInfoExperiment != null) {
            }
            if ((pin == null ? pin.b : null) != null) {
            }
            sq00Var = new sq00(p0c0Var, null, true, null, str, str3, Y2 == null ? "" : Y2, false, false, null, null, 0.0f, 8074);
        }
        return new r380(n380Var, sq00Var, p0c0Var);
    }
}
