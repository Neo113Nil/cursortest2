package com.yandex.go.chargers.feedback.domain;

import com.yandex.go.chargers.feedback.data.ChargersOrderDetailsDto;
import com.yandex.go.chargers.feedback.data.x;
import defpackage.hwa;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "Lnoh;", "Ly0a;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.feedback.domain.ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1", f = "ChargersFeedbackScreenInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersOrderDetailsDto $detailsDto;
    final /* synthetic */ hwa $surgeModal;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1(ChargersOrderDetailsDto chargersOrderDetailsDto, a aVar, hwa hwaVar, Continuation continuation) {
        super(2, continuation);
        this.$detailsDto = chargersOrderDetailsDto;
        this.this$0 = aVar;
        this.$surgeModal = hwaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1 chargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1 = new ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1(this.$detailsDto, this.this$0, this.$surgeModal, continuation);
        chargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1.L$0 = obj;
        return chargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = this.$detailsDto.c;
        a aVar = this.this$0;
        hwa hwaVar = this.$surgeModal;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1$1$1(aVar, (x) it.next(), hwaVar, null), 3));
        }
        return arrayList;
    }
}
