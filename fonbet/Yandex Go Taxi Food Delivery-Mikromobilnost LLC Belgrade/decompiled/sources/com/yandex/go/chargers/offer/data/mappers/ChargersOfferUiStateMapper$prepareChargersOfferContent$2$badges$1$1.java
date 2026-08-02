package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import com.yandex.go.chargers.offer.data.api.PopupDto;
import defpackage.hwa;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oma;
import defpackage.tcc;
import defpackage.tse;
import defpackage.vva;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lqo9;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareChargersOfferContent$2$badges$1$1", f = "ChargersOfferUiStateMapper.kt", l = {284, HProv.ALG_SID_SHA_224, 282}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareChargersOfferContent$2$badges$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersOfferResponseDto $response;
    final /* synthetic */ noh $surge;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareChargersOfferContent$2$badges$1$1(b bVar, ChargersOfferResponseDto chargersOfferResponseDto, noh nohVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$response = chargersOfferResponseDto;
        this.$surge = nohVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$badges$1$1(this.this$0, this.$response, this.$surge, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareChargersOfferContent$2$badges$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d3 -> B:12:0x00d9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.go.chargers.domain.mapper.b bVar;
        List list;
        Object k;
        com.yandex.go.chargers.domain.mapper.b bVar2;
        List list2;
        hwa hwaVar;
        List list3;
        List list4;
        b bVar3;
        Iterator it;
        com.yandex.go.chargers.domain.mapper.b bVar4;
        List list5;
        Collection collection;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            bVar = this.this$0.g;
            list = this.$response.k;
            noh nohVar = this.$surge;
            if (nohVar != null) {
                this.L$0 = bVar;
                this.L$1 = list;
                this.label = 1;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    bVar2 = bVar;
                    list2 = list;
                }
                return coroutineSingletons;
            }
            List list6 = list;
            bVar2 = bVar;
            list2 = list6;
            hwaVar = null;
            list3 = this.$response.p;
            if (list3 != null) {
                List list7 = list3;
                b bVar5 = this.this$0;
                ArrayList arrayList = new ArrayList(tcc.n(list7, 10));
                bVar3 = bVar5;
                it = list7.iterator();
                bVar4 = bVar2;
                list5 = list2;
                collection = arrayList;
                if (it.hasNext()) {
                }
            } else {
                list4 = null;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.label = 3;
                List list8 = list2;
                a = bVar2.a(list8, hwaVar, null, list4, this);
                if (a != coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            list2 = (List) this.L$1;
            com.yandex.go.chargers.domain.mapper.b bVar6 = (com.yandex.go.chargers.domain.mapper.b) this.L$0;
            kotlin.b.b(obj);
            bVar2 = bVar6;
            k = obj;
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            collection = (Collection) this.L$10;
            hwa hwaVar2 = (hwa) this.L$9;
            List list9 = (List) this.L$8;
            com.yandex.go.chargers.domain.mapper.b bVar7 = (com.yandex.go.chargers.domain.mapper.b) this.L$7;
            Iterator it2 = (Iterator) this.L$4;
            Collection collection2 = (Collection) this.L$3;
            b bVar8 = (b) this.L$1;
            kotlin.b.b(obj);
            b bVar9 = bVar8;
            Iterator it3 = it2;
            com.yandex.go.chargers.domain.mapper.b bVar10 = bVar7;
            List list10 = list9;
            hwa hwaVar3 = hwaVar2;
            Collection collection3 = collection2;
            Object e = obj;
            collection.add((oma) e);
            collection = collection3;
            hwaVar = hwaVar3;
            list5 = list10;
            bVar4 = bVar10;
            it = it3;
            bVar3 = bVar9;
            if (it.hasNext()) {
                PopupDto popupDto = (PopupDto) it.next();
                this.L$0 = null;
                this.L$1 = bVar3;
                this.L$2 = null;
                this.L$3 = collection;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = bVar4;
                this.L$8 = list5;
                this.L$9 = hwaVar;
                this.L$10 = collection;
                this.label = 2;
                e = bVar3.e(popupDto, this);
                if (e != coroutineSingletons) {
                    bVar9 = bVar3;
                    it3 = it;
                    bVar10 = bVar4;
                    list10 = list5;
                    hwaVar3 = hwaVar;
                    collection3 = collection;
                    collection.add((oma) e);
                    collection = collection3;
                    hwaVar = hwaVar3;
                    list5 = list10;
                    bVar4 = bVar10;
                    it = it3;
                    bVar3 = bVar9;
                    if (it.hasNext()) {
                        list4 = (List) collection;
                        list2 = list5;
                        bVar2 = bVar4;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.L$10 = null;
                        this.label = 3;
                        List list82 = list2;
                        a = bVar2.a(list82, hwaVar, null, list4, this);
                        if (a != coroutineSingletons) {
                            return a;
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        vva vvaVar = (vva) k;
        if (vvaVar != null) {
            hwaVar = vvaVar.d;
            list3 = this.$response.p;
            if (list3 != null) {
            }
        } else {
            com.yandex.go.chargers.domain.mapper.b bVar11 = bVar2;
            list = list2;
            bVar = bVar11;
            List list62 = list;
            bVar2 = bVar;
            list2 = list62;
            hwaVar = null;
            list3 = this.$response.p;
            if (list3 != null) {
            }
        }
    }
}
