package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.data.model.ChargersOfferButtonDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Luo9;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareOfferButtons$2", f = "ChargersOfferUiStateMapper.kt", l = {460}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareOfferButtons$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<ChargersOfferButtonDto> $buttons;
    final /* synthetic */ boolean $isMainButtonLoading;
    final /* synthetic */ String $offerId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareOfferButtons$2(List list, b bVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$buttons = list;
        this.this$0 = bVar;
        this.$offerId = str;
        this.$isMainButtonLoading = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersOfferUiStateMapper$prepareOfferButtons$2 chargersOfferUiStateMapper$prepareOfferButtons$2 = new ChargersOfferUiStateMapper$prepareOfferButtons$2(this.$buttons, this.this$0, this.$offerId, this.$isMainButtonLoading, continuation);
        chargersOfferUiStateMapper$prepareOfferButtons$2.L$0 = obj;
        return chargersOfferUiStateMapper$prepareOfferButtons$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareOfferButtons$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<ChargersOfferButtonDto> list = this.$buttons;
        b bVar = this.this$0;
        String str = this.$offerId;
        boolean z = this.$isMainButtonLoading;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareOfferButtons$2$1$1(bVar, (ChargersOfferButtonDto) it.next(), str, z, null), 3));
        }
        this.L$0 = null;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
