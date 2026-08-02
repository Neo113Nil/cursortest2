package com.yandex.go.promocodes.base.impl.promo_codes.data.repositories;

import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.list.PromoCodeListResponseDto;
import defpackage.imf0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.knf0;
import defpackage.lnf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rmf0;
import defpackage.tse;
import defpackage.wlf0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lrmf0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.PromoCodesRepositoryImpl$promoCodesList$2$1", f = "PromoCodesRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PromoCodesRepositoryImpl$promoCodesList$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ PromoCodeListResponseDto $response;
    final /* synthetic */ List<String> $services;
    final /* synthetic */ String $zoneName;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodesRepositoryImpl$promoCodesList$2$1(c cVar, PromoCodeListResponseDto promoCodeListResponseDto, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$response = promoCodeListResponseDto;
        this.$zoneName = str;
        this.$services = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromoCodesRepositoryImpl$promoCodesList$2$1(this.this$0, this.$response, this.$zoneName, this.$services, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromoCodesRepositoryImpl$promoCodesList$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        PromoCodeListResponseDto promoCodeListResponseDto = this.$response;
        String str = this.$zoneName;
        List<String> list = this.$services;
        cVar.getClass();
        List list2 = promoCodeListResponseDto.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            wlf0 a = ((imf0) cVar.f.get()).a((PromoCodeDto) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (!jl40.l(list, Collections.singletonList(TariffOrderFlow.ORDER_FLOW_TAXI_KEY))) {
            return cVar.n(str, arrayList, list);
        }
        knf0 knf0Var = (knf0) cVar.l.getValue();
        long i = cVar.i();
        EmptyList emptyList = EmptyList.a;
        lnf0 a2 = knf0Var.a(i, str, emptyList);
        if (a2 != null) {
            ArrayList arrayList2 = a2.c;
            if (arrayList2.size() == 1) {
                List list3 = ((rmf0) kotlin.collections.a.P(arrayList2)).b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list3) {
                    wlf0 wlf0Var = (wlf0) obj2;
                    String str2 = wlf0Var.e;
                    if (str2 != null && str2.length() != 0 && !jl40.l(wlf0Var.e, TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList = kotlin.collections.a.m0(arrayList3, arrayList);
            } else {
                jst.e.q("Only one section is supported, if you add multiple section support you should change this method too");
            }
        }
        return cVar.n(str, arrayList, emptyList);
    }
}
