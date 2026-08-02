package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDto;
import defpackage.hwa;
import defpackage.iya;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vva;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lswa;", "<anonymous>", "(Ltse;)Lswa;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareChargersOfferContent$2$tariff$1$1", f = "ChargersOfferUiStateMapper.kt", l = {274, 274}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareChargersOfferContent$2$tariff$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ noh $surge;
    final /* synthetic */ ChargersTariffDto $tariffDto;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareChargersOfferContent$2$tariff$1$1(b bVar, ChargersTariffDto chargersTariffDto, noh nohVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$tariffDto = chargersTariffDto;
        this.$surge = nohVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$tariff$1$1(this.this$0, this.$tariffDto, this.$surge, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareChargersOfferContent$2$tariff$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        iya iyaVar;
        ChargersTariffDto chargersTariffDto;
        iya iyaVar2;
        hwa hwaVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            iyaVar = this.this$0.i;
            chargersTariffDto = this.$tariffDto;
            noh nohVar = this.$surge;
            if (nohVar != null) {
                this.L$0 = iyaVar;
                this.L$1 = chargersTariffDto;
                this.label = 1;
                Object k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    iyaVar2 = iyaVar;
                    obj = k;
                }
            }
            iyaVar2 = iyaVar;
            hwaVar = null;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            Object b = ((com.yandex.go.chargers.tariff_item_info.b) iyaVar2).b(chargersTariffDto, hwaVar, null, this);
            return b == coroutineSingletons ? coroutineSingletons : b;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        chargersTariffDto = (ChargersTariffDto) this.L$1;
        iyaVar2 = (iya) this.L$0;
        kotlin.b.b(obj);
        vva vvaVar = (vva) obj;
        if (vvaVar != null) {
            hwaVar = vvaVar.d;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            Object b2 = ((com.yandex.go.chargers.tariff_item_info.b) iyaVar2).b(chargersTariffDto, hwaVar, null, this);
            if (b2 == coroutineSingletons) {
            }
        } else {
            iyaVar = iyaVar2;
            iyaVar2 = iyaVar;
            hwaVar = null;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            Object b22 = ((com.yandex.go.chargers.tariff_item_info.b) iyaVar2).b(chargersTariffDto, hwaVar, null, this);
            if (b22 == coroutineSingletons) {
            }
        }
    }
}
