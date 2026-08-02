package com.yandex.go.masstransit.sdk.trains.impl.datepicker;

import defpackage.b611;
import defpackage.cx41;
import defpackage.dx41;
import defpackage.ex41;
import defpackage.fx41;
import defpackage.gx41;
import defpackage.hx41;
import defpackage.ii8;
import defpackage.ji41;
import defpackage.jx41;
import defpackage.mj31;
import defpackage.mvg;
import defpackage.nr41;
import defpackage.ny61;
import defpackage.ox41;
import defpackage.px41;
import defpackage.qu;
import defpackage.rx41;
import defpackage.sx41;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleCalendarButtonTypeV2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.trains.impl.datepicker.WheelDatePickerRouterImpl$content$1$1$1", f = "WheelDatePickerRouterImpl.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class WheelDatePickerRouterImpl$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ gx41 $action;
    int label;
    final /* synthetic */ px41 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WheelDatePickerRouterImpl$content$1$1$1(px41 px41Var, gx41 gx41Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = px41Var;
        this.$action = gx41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WheelDatePickerRouterImpl$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WheelDatePickerRouterImpl$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        px41 px41Var = this.this$0;
        nr41 nr41Var = px41Var.J;
        gx41 gx41Var = this.$action;
        sx41 sx41Var = px41Var.I;
        ji41 ji41Var = px41Var.K;
        ox41 ox41Var = (ox41) px41Var.x;
        hx41 hx41Var = ox41Var != null ? ox41Var.b : hx41.f;
        String str3 = hx41Var.c;
        String str4 = hx41Var.b;
        String str5 = hx41Var.a;
        this.label = 1;
        mj31 mj31Var = (mj31) nr41Var.b;
        if (gx41Var instanceof cx41) {
            ((b611) mj31Var.b).j((TransportRouteAnalytics$FlowOrigin) mj31Var.w, TransportRouteAnalytics$ScheduleCalendarButtonTypeV2.Exit, str5, str5, str4, str3, hx41Var.d, null, hx41Var.e);
            ((px41) ji41Var.b).r(new qu(9));
        } else if (gx41Var instanceof dx41) {
            rx41 rx41Var = (rx41) sx41Var.a.getValue();
            jx41 jx41Var = (jx41) kotlin.collections.a.S(rx41Var.b, rx41Var.a.a);
            ((b611) mj31Var.b).j((TransportRouteAnalytics$FlowOrigin) mj31Var.w, TransportRouteAnalytics$ScheduleCalendarButtonTypeV2.Apply, (jx41Var == null || (str2 = jx41Var.b) == null) ? "" : str2, str5, str4, str3, hx41Var.d, null, hx41Var.e);
            ((px41) ji41Var.b).r(new ii8(((rx41) sx41Var.a.getValue()).b, 25));
        } else if (gx41Var instanceof fx41) {
            int i2 = ((fx41) gx41Var).a;
            r0 r0Var = sx41Var.a;
            do {
                value2 = r0Var.getValue();
            } while (!r0Var.k(value2, rx41.a((rx41) value2, null, i2, false, 5)));
            rx41 rx41Var2 = (rx41) sx41Var.a.getValue();
            jx41 jx41Var2 = (jx41) kotlin.collections.a.S(rx41Var2.b, rx41Var2.a.a);
            ((b611) mj31Var.b).j((TransportRouteAnalytics$FlowOrigin) mj31Var.w, TransportRouteAnalytics$ScheduleCalendarButtonTypeV2.ChangeDate, (jx41Var2 == null || (str = jx41Var2.b) == null) ? "" : str, str5, str4, str3, hx41Var.d, null, hx41Var.e);
        } else {
            if (!(gx41Var instanceof ex41)) {
                w511.b();
                return null;
            }
            boolean z = ((ex41) gx41Var).a;
            r0 r0Var2 = sx41Var.a;
            do {
                value = r0Var2.getValue();
            } while (!r0Var2.k(value, rx41.a((rx41) value, null, 0, z, 3)));
        }
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
