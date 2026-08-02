package com.ybsdk.feature.partnerselection.internal.data.helpers;

import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderPartnersByCountryDto;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderPartnersByCountryItemDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.tcc;
import defpackage.ti90;
import defpackage.wls;
import defpackage.zi90;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderPartnersByCountryDto;", "dto", "Lzi90;", "<anonymous>", "(Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderPartnersByCountryDto;)Lzi90;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerselection.internal.data.helpers.PartnerSelectionHelper$getPartnersByCountry$3$1", f = "PartnerSelectionHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerSelectionHelper$getPartnersByCountry$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PartnerSelectionHelper$getPartnersByCountry$3$1 partnerSelectionHelper$getPartnersByCountry$3$1 = new PartnerSelectionHelper$getPartnersByCountry$3$1(2, continuation);
        partnerSelectionHelper$getPartnersByCountry$3$1.L$0 = obj;
        return partnerSelectionHelper$getPartnersByCountry$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PartnerSelectionHelper$getPartnersByCountry$3$1) create((CrossBorderPartnersByCountryDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<CrossBorderPartnersByCountryItemDto> partners = ((CrossBorderPartnersByCountryDto) this.L$0).getPartners();
        ArrayList arrayList = new ArrayList(tcc.n(partners, 10));
        for (CrossBorderPartnersByCountryItemDto crossBorderPartnersByCountryItemDto : partners) {
            arrayList.add(new ti90(crossBorderPartnersByCountryItemDto.getTitle(), null, qxy0.c(crossBorderPartnersByCountryItemDto.getImage(), null), crossBorderPartnersByCountryItemDto.getAction()));
        }
        return new zi90(arrayList, null);
    }
}
