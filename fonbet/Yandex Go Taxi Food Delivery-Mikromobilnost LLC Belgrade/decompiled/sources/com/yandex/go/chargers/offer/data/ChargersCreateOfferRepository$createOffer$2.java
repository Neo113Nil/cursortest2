package com.yandex.go.chargers.offer.data;

import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.data.model.ChargersStationDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersSelectedDiscountDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferParams;
import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferToggleRequestDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferV2Params;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.cmt;
import defpackage.ejb1;
import defpackage.fmt;
import defpackage.hfa0;
import defpackage.lpa;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.n9a;
import defpackage.ny61;
import defpackage.ow9;
import defpackage.tsa;
import defpackage.tse;
import defpackage.wls;
import defpackage.x8a;
import defpackage.zy11;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lx8a;", "<anonymous>", "(Ltse;)Lx8a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.ChargersCreateOfferRepository$createOffer$2", f = "ChargersCreateOfferRepository.kt", l = {56, 66, CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersCreateOfferRepository$createOffer$2 extends SuspendLambda implements wls {
    final /* synthetic */ n9a $chargersOfferToggle;
    final /* synthetic */ ow9 $discount;
    final /* synthetic */ hfa0 $paymentOptions;
    final /* synthetic */ tsa $stationNumber;
    final /* synthetic */ boolean $useMultiOffer;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersCreateOfferRepository$createOffer$2(hfa0 hfa0Var, a aVar, ow9 ow9Var, tsa tsaVar, n9a n9aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$paymentOptions = hfa0Var;
        this.this$0 = aVar;
        this.$discount = ow9Var;
        this.$stationNumber = tsaVar;
        this.$chargersOfferToggle = n9aVar;
        this.$useMultiOffer = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersCreateOfferRepository$createOffer$2(this.$paymentOptions, this.this$0, this.$discount, this.$stationNumber, this.$chargersOfferToggle, this.$useMultiOffer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersCreateOfferRepository$createOffer$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f3, code lost:
    
        if (r12 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0114, code lost:
    
        if (r12 == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        ChargersSelectedDiscountDto a;
        ChargersOfferToggleRequestDto chargersOfferToggleRequestDto;
        Serializable c;
        ChargersStationDto chargersStationDto;
        fmt fmtVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m6a0 d = this.$paymentOptions.d();
            List c2 = d != null ? ejb1.c(d) : null;
            if (c2 == null) {
                c2 = EmptyList.a;
            }
            list = c2;
            a aVar = this.this$0;
            lpa lpaVar = aVar.d;
            ow9 ow9Var = this.$discount;
            Date b = aVar.e.b();
            lpaVar.getClass();
            a = lpa.a(ow9Var, b);
            tsa tsaVar = this.$stationNumber;
            ChargersStationDto chargersStationDto2 = new ChargersStationDto(tsaVar.a, tsaVar.b, tsaVar.c);
            n9a n9aVar = this.$chargersOfferToggle;
            if (n9aVar != null) {
                String str = n9aVar.a;
                if (!n9aVar.b) {
                    str = null;
                }
                if (str != null) {
                    chargersOfferToggleRequestDto = new ChargersOfferToggleRequestDto(str);
                    f fVar = this.this$0.c;
                    this.L$0 = list;
                    this.L$1 = a;
                    this.L$2 = chargersStationDto2;
                    this.L$3 = chargersOfferToggleRequestDto;
                    this.label = 1;
                    c = fVar.c(this);
                    if (c != coroutineSingletons) {
                        chargersStationDto = chargersStationDto2;
                        obj = c;
                    }
                    return coroutineSingletons;
                }
            }
            chargersOfferToggleRequestDto = null;
            f fVar2 = this.this$0.c;
            this.L$0 = list;
            this.L$1 = a;
            this.L$2 = chargersStationDto2;
            this.L$3 = chargersOfferToggleRequestDto;
            this.label = 1;
            c = fVar2.c(this);
            if (c != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                fmtVar = (fmt) obj;
                return new x8a((ChargersOfferResponseDto) fmtVar.a, fmtVar.e.a("X-YaTraceId"), this.$useMultiOffer);
            }
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            fmtVar = (fmt) obj;
            return new x8a((ChargersOfferResponseDto) fmtVar.a, fmtVar.e.a("X-YaTraceId"), this.$useMultiOffer);
        }
        chargersOfferToggleRequestDto = (ChargersOfferToggleRequestDto) this.L$3;
        chargersStationDto = (ChargersStationDto) this.L$2;
        a = (ChargersSelectedDiscountDto) this.L$1;
        list = (List) this.L$0;
        kotlin.b.b(obj);
        Map<String, String> map = (Map) obj;
        ChargersOfferApi chargersOfferApi = (ChargersOfferApi) this.this$0.b.get();
        if (this.$useMultiOffer) {
            cmt<ChargersOfferResponseDto> a2 = chargersOfferApi.a(map, new ChargersOfferV2Params(a, chargersStationDto, list));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 2;
            obj = a2.a(this);
        } else {
            cmt<ChargersOfferResponseDto> c3 = chargersOfferApi.c(map, new ChargersOfferParams(a, chargersStationDto, list, chargersOfferToggleRequestDto));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 3;
            obj = c3.a(this);
        }
        return coroutineSingletons;
    }
}
