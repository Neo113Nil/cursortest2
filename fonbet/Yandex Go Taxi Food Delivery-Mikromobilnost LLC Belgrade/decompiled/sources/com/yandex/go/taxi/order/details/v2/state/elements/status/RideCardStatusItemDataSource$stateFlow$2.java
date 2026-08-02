package com.yandex.go.taxi.order.details.v2.state.elements.status;

import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Status;
import com.yandex.go.taxi.order.models.api.response.status.RideCardStatusProperties;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import defpackage.bdc;
import defpackage.css0;
import defpackage.fef;
import defpackage.gss0;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.qoh;
import defpackage.rnk0;
import defpackage.snk0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tss0;
import defpackage.ufu;
import defpackage.vfk0;
import defpackage.wls;
import defpackage.xng0;
import defpackage.xss0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ltpr;", "Lsnk0;", "<anonymous>", "(Ltse;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.status.RideCardStatusItemDataSource$stateFlow$2", f = "RideCardStatusItemDataSource.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardStatusItemDataSource$stateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ RideCardItemDto$Status $item;
    final /* synthetic */ SlotItemDto $slotItemDto;
    final /* synthetic */ vfk0 $sourceType;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrnk0;", "bodyDescriptionState", "Lsnk0;", "<anonymous>", "(Lrnk0;)Lsnk0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.status.RideCardStatusItemDataSource$stateFlow$2$1", f = "RideCardStatusItemDataSource.kt", l = {71, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.state.elements.status.RideCardStatusItemDataSource$stateFlow$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ kdc $backgroundColor;
        final /* synthetic */ boolean $isShimmering;
        final /* synthetic */ RideCardItemDto$Status $item;
        final /* synthetic */ noh $lead;
        final /* synthetic */ SlotItemDto $slotItemDto;
        final /* synthetic */ vfk0 $sourceType;
        final /* synthetic */ noh $trail;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RideCardItemDto$Status rideCardItemDto$Status, noh nohVar, noh nohVar2, a aVar, SlotItemDto slotItemDto, kdc kdcVar, boolean z, vfk0 vfk0Var, Continuation continuation) {
            super(2, continuation);
            this.$item = rideCardItemDto$Status;
            this.$lead = nohVar;
            this.$trail = nohVar2;
            this.this$0 = aVar;
            this.$slotItemDto = slotItemDto;
            this.$backgroundColor = kdcVar;
            this.$isShimmering = z;
            this.$sourceType = vfk0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$item, this.$lead, this.$trail, this.this$0, this.$slotItemDto, this.$backgroundColor, this.$isShimmering, this.$sourceType, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((rnk0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            gss0 gss0Var;
            css0 css0Var;
            rnk0 rnk0Var = (rnk0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                String str3 = this.$item.a;
                noh nohVar = this.$lead;
                this.L$0 = rnk0Var;
                this.L$1 = str3;
                this.label = 1;
                Object k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    str = str3;
                    obj = k;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                css0 css0Var2 = (css0) this.L$3;
                gss0Var = (gss0) this.L$2;
                String str4 = (String) this.L$1;
                b.b(obj);
                str2 = str4;
                css0Var = css0Var2;
                xss0 xss0Var = new xss0(gss0Var, css0Var, (tss0) obj, this.this$0.b.a(this.$slotItemDto.a), SlotItemUiState$Size.L);
                return new snk0(str2, this.$item.c, xss0Var, this.$backgroundColor, this.$isShimmering, rnk0Var.b, this.$sourceType);
            }
            str = (String) this.L$1;
            b.b(obj);
            gss0 gss0Var2 = (gss0) obj;
            css0 css0Var3 = rnk0Var.a;
            noh nohVar2 = this.$trail;
            this.L$0 = rnk0Var;
            this.L$1 = str;
            this.L$2 = gss0Var2;
            this.L$3 = css0Var3;
            this.label = 2;
            Object k2 = nohVar2.k(this);
            if (k2 != coroutineSingletons) {
                str2 = str;
                gss0Var = gss0Var2;
                obj = k2;
                css0Var = css0Var3;
                xss0 xss0Var2 = new xss0(gss0Var, css0Var, (tss0) obj, this.this$0.b.a(this.$slotItemDto.a), SlotItemUiState$Size.L);
                return new snk0(str2, this.$item.c, xss0Var2, this.$backgroundColor, this.$isShimmering, rnk0Var.b, this.$sourceType);
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardStatusItemDataSource$stateFlow$2(a aVar, RideCardItemDto$Status rideCardItemDto$Status, SlotItemDto slotItemDto, fef fefVar, vfk0 vfk0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = rideCardItemDto$Status;
        this.$slotItemDto = slotItemDto;
        this.$currencyRules = fefVar;
        this.$sourceType = vfk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardStatusItemDataSource$stateFlow$2 rideCardStatusItemDataSource$stateFlow$2 = new RideCardStatusItemDataSource$stateFlow$2(this.this$0, this.$item, this.$slotItemDto, this.$currencyRules, this.$sourceType, continuation);
        rideCardStatusItemDataSource$stateFlow$2.L$0 = obj;
        return rideCardStatusItemDataSource$stateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardStatusItemDataSource$stateFlow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [noh] */
    /* JADX WARN: Type inference failed for: r6v5, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        qoh qohVar;
        int i;
        qoh qohVar2;
        kdc kdcVar;
        RideCardStatusProperties.Effect effect;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            qoh h = tje.h(tseVar, null, null, new RideCardStatusItemDataSource$stateFlow$2$trail$1(this.this$0, this.$slotItemDto, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new RideCardStatusItemDataSource$stateFlow$2$lead$1(this.this$0, this.$slotItemDto, null), 3);
            pdc pdcVar = this.this$0.e;
            RideCardStatusProperties rideCardStatusProperties = this.$item.d;
            kdc a2 = ((ufu) pdcVar).a(new bdc(xng0.bgMain), rideCardStatusProperties != null ? rideCardStatusProperties.a : null);
            RideCardItemDto$Status rideCardItemDto$Status = this.$item;
            RideCardStatusProperties rideCardStatusProperties2 = rideCardItemDto$Status.d;
            int i3 = ((rideCardStatusProperties2 == null || (effect = rideCardStatusProperties2.b) == null) ? null : effect.a) == RideCardStatusProperties.Effect.Type.SHIMMERING ? 1 : 0;
            a aVar = this.this$0;
            List list = this.$slotItemDto.d;
            RideCardTimerDto rideCardTimerDto = rideCardItemDto$Status.e;
            fef fefVar = this.$currencyRules;
            this.L$0 = null;
            this.L$1 = h;
            this.L$2 = h2;
            this.L$3 = a2;
            this.I$0 = i3;
            this.label = 1;
            a = a.a(aVar, list, rideCardTimerDto, fefVar, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            int i4 = i3;
            qohVar = h2;
            i = i4;
            qohVar2 = h;
            kdcVar = a2;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            kdc kdcVar2 = (kdc) this.L$3;
            ?? r3 = (noh) this.L$2;
            ?? r6 = (noh) this.L$1;
            b.b(obj);
            kdcVar = kdcVar2;
            qohVar = r3;
            qohVar2 = r6;
            a = obj;
        }
        return e.I((tpr) a, new AnonymousClass1(this.$item, qohVar, qohVar2, this.this$0, this.$slotItemDto, kdcVar, i != 0, this.$sourceType, null));
    }
}
