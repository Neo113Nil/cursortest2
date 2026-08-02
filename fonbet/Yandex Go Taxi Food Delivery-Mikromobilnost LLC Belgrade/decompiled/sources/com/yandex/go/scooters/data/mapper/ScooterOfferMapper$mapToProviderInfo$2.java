package com.yandex.go.scooters.data.mapper;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.stn0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.u4w;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lstn0;", "<anonymous>", "(Ltse;)Lstn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScooterOfferMapper$mapToProviderInfo$2", f = "ScooterOfferMapper.kt", l = {560, 561}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScooterOfferMapper$mapToProviderInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ u4w.b $providerInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScooterOfferMapper$mapToProviderInfo$2(u4w.b bVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$providerInfo = bVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScooterOfferMapper$mapToProviderInfo$2 scooterOfferMapper$mapToProviderInfo$2 = new ScooterOfferMapper$mapToProviderInfo$2(this.$providerInfo, this.this$0, continuation);
        scooterOfferMapper$mapToProviderInfo$2.L$0 = obj;
        return scooterOfferMapper$mapToProviderInfo$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScooterOfferMapper$mapToProviderInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        CharSequence charSequence;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list2 = this.$providerInfo.b;
            a aVar = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new ScooterOfferMapper$mapToProviderInfo$2$itemsAsync$1$1(aVar, (FormattedText) it.next(), null), 3));
            }
            qoh h = tje.h(tseVar, null, null, new ScooterOfferMapper$mapToProviderInfo$2$titleAsync$1(this.$providerInfo, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = arrayList;
            this.L$2 = null;
            this.label = 1;
            obj = h.s(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj != coroutineSingletons) {
                list = arrayList;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charSequence = (CharSequence) this.L$3;
            kotlin.b.b(obj);
            return new stn0(charSequence, (List) obj);
        }
        list = (List) this.L$1;
        kotlin.b.b(obj);
        CharSequence charSequence2 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = charSequence2;
        this.label = 2;
        Object b = kotlinx.coroutines.a.b(list, this);
        if (b != coroutineSingletons) {
            charSequence = charSequence2;
            obj = b;
            return new stn0(charSequence, (List) obj);
        }
        return coroutineSingletons;
    }
}
