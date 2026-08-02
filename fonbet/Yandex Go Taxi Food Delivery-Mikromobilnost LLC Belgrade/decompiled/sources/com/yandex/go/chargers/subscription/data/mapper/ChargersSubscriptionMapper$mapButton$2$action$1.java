package com.yandex.go.chargers.subscription.data.mapper;

import com.yandex.go.chargers.subscription.data.model.ChargersPlusAnalyticsParams;
import com.yandex.go.chargers.subscription.data.model.ChargersPlusFilters;
import com.yandex.go.chargers.subscription.data.model.ChargersPlusLoadedFilters;
import com.yandex.go.chargers.subscription.data.model.ChargersPlusOfferParametersDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionActionDto$OpenPlusPay;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionButtonDto;
import com.yandex.go.chargers.subscription.data.model.g;
import com.yandex.go.chargers.subscription.data.model.h;
import defpackage.ata;
import defpackage.bta;
import defpackage.eed0;
import defpackage.lad0;
import defpackage.m5d0;
import defpackage.mvg;
import defpackage.n2d0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.udd0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcta;", "<anonymous>", "(Ltse;)Lcta;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.subscription.data.mapper.ChargersSubscriptionMapper$mapButton$2$action$1", f = "ChargersSubscriptionMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSubscriptionMapper$mapButton$2$action$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersSubscriptionButtonDto $dto;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersSubscriptionMapper$mapButton$2$action$1(a aVar, ChargersSubscriptionButtonDto chargersSubscriptionButtonDto, Continuation continuation) {
        super(2, continuation);
        this.$dto = chargersSubscriptionButtonDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersSubscriptionMapper$mapButton$2$action$1(this.this$0, this.$dto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersSubscriptionMapper$mapButton$2$action$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        h hVar = this.$dto.b;
        if (hVar != null) {
            this.this$0.getClass();
            if (hVar instanceof ChargersSubscriptionActionDto$OpenPlusPay) {
                ChargersPlusOfferParametersDto chargersPlusOfferParametersDto = ((ChargersSubscriptionActionDto$OpenPlusPay) hVar).a;
                String str = chargersPlusOfferParametersDto.a;
                String str2 = chargersPlusOfferParametersDto.e;
                String str3 = chargersPlusOfferParametersDto.b;
                String str4 = chargersPlusOfferParametersDto.c;
                ChargersPlusAnalyticsParams chargersPlusAnalyticsParams = chargersPlusOfferParametersDto.d;
                lad0 lad0Var = new lad0(chargersPlusAnalyticsParams != null ? chargersPlusAnalyticsParams.a : null, chargersPlusAnalyticsParams != null ? chargersPlusAnalyticsParams.b : null, chargersPlusAnalyticsParams != null ? chargersPlusAnalyticsParams.c : null);
                boolean z = chargersPlusOfferParametersDto.f;
                ChargersPlusFilters chargersPlusFilters = chargersPlusOfferParametersDto.g;
                n2d0 n2d0Var = new n2d0(chargersPlusFilters != null ? chargersPlusFilters.c : null, chargersPlusFilters != null ? chargersPlusFilters.a : null, chargersPlusFilters != null ? chargersPlusFilters.b : null);
                ChargersPlusLoadedFilters chargersPlusLoadedFilters = chargersPlusOfferParametersDto.h;
                return new ata(new eed0(str, str2, new udd0(str3, str4, lad0Var, str2, z, n2d0Var, new m5d0(chargersPlusLoadedFilters != null ? chargersPlusLoadedFilters.a : null))));
            }
            if (!hVar.equals(g.INSTANCE)) {
                w511.b();
                return null;
            }
        }
        return bta.a;
    }
}
