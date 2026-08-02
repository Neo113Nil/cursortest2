package com.yandex.go.order.tariffs_suggest.router;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$DefaultItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$RobotaxiItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$ShareOrderItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$StepsInstructionsItem;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.u0;
import defpackage.bkx0;
import defpackage.eox0;
import defpackage.fox0;
import defpackage.jl40;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.tr70;
import defpackage.tse;
import defpackage.usc;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$ModalType;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$RideOpenReason;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.router.TariffSuggestModalHandlerRouter$onLaunch$1", f = "TariffSuggestModalHandlerRouter.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffSuggestModalHandlerRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ fox0 $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffSuggestModalHandlerRouter$onLaunch$1(a aVar, fox0 fox0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = fox0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffSuggestModalHandlerRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffSuggestModalHandlerRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        u0 u0Var;
        List<OrderStatusInfo.Modal> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            p2y0 p2y0Var = this.this$0.E;
            this.label = 1;
            obj = ((e0) p2y0Var).y(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        o2y0 o2y0Var = (o2y0) obj;
        TaxiOrder b = o2y0Var != null ? o2y0Var.b() : null;
        OrderStatusInfo V = b != null ? b.V() : null;
        int i2 = 12;
        zy11 zy11Var = zy11.a;
        if (V == null) {
            this.this$0.r(new bkx0(i2));
            return zy11Var;
        }
        OrderStatusInfo.ModalsContent modalsContent = V.s0;
        if (modalsContent != null && (list = modalsContent.a) != null) {
            fox0 fox0Var = this.$payload;
            for (OrderStatusInfo.Modal modal : list) {
                if (jl40.l(modal.a.getA(), fox0Var.a)) {
                    u0Var = modal.a;
                }
            }
            w511.i("Collection contains no element matching the predicate.");
            return null;
        }
        u0Var = null;
        a aVar = this.this$0;
        if (u0Var == null) {
            aVar.r(new bkx0(i2));
            return zy11Var;
        }
        if (aVar.F.a.i("pref_usage_count".concat(this.$payload.a), 0) >= u0Var.getD().b) {
            this.this$0.r(new bkx0(i2));
            return zy11Var;
        }
        if (u0Var instanceof ModalItemDto$DefaultItem) {
            a aVar2 = this.this$0;
            ModalItemDto$DefaultItem modalItemDto$DefaultItem = (ModalItemDto$DefaultItem) u0Var;
            aVar2.A((m950) aVar2.D.get(), new tr70(modalItemDto$DefaultItem, new usc(modalItemDto$DefaultItem.a, CommunicationModalAnalyticsData$ModalType.DEFAULT, b.a, CommunicationModalAnalyticsData$RideOpenReason.TARIFF_SUGGEST)), new eox0(this.this$0, this.$payload));
            return zy11Var;
        }
        if ((u0Var instanceof ModalItemDto$ShareOrderItem) || (u0Var instanceof ModalItemDto$RobotaxiItem) || (u0Var instanceof ModalItemDto$StepsInstructionsItem)) {
            return zy11Var;
        }
        w511.b();
        return null;
    }
}
