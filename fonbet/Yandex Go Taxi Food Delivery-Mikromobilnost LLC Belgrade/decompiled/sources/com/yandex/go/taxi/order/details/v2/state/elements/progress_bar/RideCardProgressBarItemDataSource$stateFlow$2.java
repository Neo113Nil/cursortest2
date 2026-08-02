package com.yandex.go.taxi.order.details.v2.state.elements.progress_bar;

import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.b2;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ProgressBarItem;
import com.yandex.go.taxi.order.models.api.response.progress_bar.ProgressBarDto;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.amk0;
import defpackage.bdc;
import defpackage.fef;
import defpackage.g92;
import defpackage.ibk0;
import defpackage.irs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.sqs0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.xng0;
import defpackage.xss0;
import defpackage.yjk0;
import defpackage.zlk0;
import defpackage.zy11;
import java.util.Date;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ltpr;", "Lzjk0;", "<anonymous>", "(Ltse;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.progress_bar.RideCardProgressBarItemDataSource$stateFlow$2", f = "RideCardProgressBarItemDataSource.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardProgressBarItemDataSource$stateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ RideCardItemDto$ProgressBarItem $item;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxss0;", "slotItemState", "Lamk0;", "<anonymous>", "(Lxss0;)Lamk0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.progress_bar.RideCardProgressBarItemDataSource$stateFlow$2$1", f = "RideCardProgressBarItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.state.elements.progress_bar.RideCardProgressBarItemDataSource$stateFlow$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ RideCardItemDto$ProgressBarItem $item;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RideCardItemDto$ProgressBarItem rideCardItemDto$ProgressBarItem, a aVar, Continuation continuation) {
            super(2, continuation);
            this.$item = rideCardItemDto$ProgressBarItem;
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$item, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((xss0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            xss0 xss0Var = (xss0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            zlk0 zlk0Var = null;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            RideCardItemDto$ProgressBarItem rideCardItemDto$ProgressBarItem = this.$item;
            String str = rideCardItemDto$ProgressBarItem.a;
            String str2 = rideCardItemDto$ProgressBarItem.b;
            a aVar = this.this$0;
            ProgressBarDto progressBarDto = rideCardItemDto$ProgressBarItem.f;
            Date c = aVar.g.c(rideCardItemDto$ProgressBarItem.e.b);
            if (c != null) {
                long time = c.getTime();
                int i = progressBarDto.a;
                pdc pdcVar = aVar.e;
                ufu ufuVar = (ufu) pdcVar;
                zlk0Var = new zlk0(i, ufuVar.a(new bdc(xng0.bgMain), progressBarDto.b), progressBarDto.c, time);
            }
            return new amk0(str, str2, xss0Var, zlk0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardProgressBarItemDataSource$stateFlow$2(RideCardItemDto$ProgressBarItem rideCardItemDto$ProgressBarItem, a aVar, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.$item = rideCardItemDto$ProgressBarItem;
        this.this$0 = aVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardProgressBarItemDataSource$stateFlow$2(this.$item, this.this$0, this.$currencyRules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardProgressBarItemDataSource$stateFlow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RideCardProgressBarItemDataSource$stateFlow$2 rideCardProgressBarItemDataSource$stateFlow$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            RideCardItemDto$ProgressBarItem rideCardItemDto$ProgressBarItem = this.$item;
            SlotItemDto slotItemDto = rideCardItemDto$ProgressBarItem.d;
            if (slotItemDto == null) {
                return new g92(2, new yjk0(rideCardItemDto$ProgressBarItem.a));
            }
            a aVar = this.this$0;
            irs0 irs0Var = aVar.a;
            sqs0 sqs0Var = aVar.f;
            b2 b2Var = slotItemDto.a;
            irs0Var.getClass();
            ibk0 ibk0Var = (ibk0) sqs0Var.a(b2Var);
            SlotItemUiState$Size o = ((com.yandex.go.slot.mapper.a) this.this$0.a).o(slotItemDto.b);
            a aVar2 = this.this$0;
            RideCardTimerDto rideCardTimerDto = this.$item.e;
            fef fefVar = this.$currencyRules;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            rideCardProgressBarItemDataSource$stateFlow$2 = this;
            obj = a.a(aVar2, slotItemDto, ibk0Var, o, rideCardTimerDto, fefVar, rideCardProgressBarItemDataSource$stateFlow$2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            rideCardProgressBarItemDataSource$stateFlow$2 = this;
        }
        return e.I((tpr) obj, new AnonymousClass1(rideCardProgressBarItemDataSource$stateFlow$2.$item, rideCardProgressBarItemDataSource$stateFlow$2.this$0, null));
    }
}
