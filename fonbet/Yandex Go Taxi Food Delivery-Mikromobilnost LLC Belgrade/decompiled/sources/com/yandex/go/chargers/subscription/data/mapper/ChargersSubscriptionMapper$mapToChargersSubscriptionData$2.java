package com.yandex.go.chargers.subscription.data.mapper;

import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionButtonDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionResponseDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionTermItemDto;
import defpackage.bvf0;
import defpackage.gta;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ovi0;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgta;", "<anonymous>", "(Ltse;)Lgta;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.subscription.data.mapper.ChargersSubscriptionMapper$mapToChargersSubscriptionData$2", f = "ChargersSubscriptionMapper.kt", l = {36, 38, 40, 42, 43, 44}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSubscriptionMapper$mapToChargersSubscriptionData$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersSubscriptionResponseDto $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersSubscriptionMapper$mapToChargersSubscriptionData$2(a aVar, ChargersSubscriptionResponseDto chargersSubscriptionResponseDto, Continuation continuation) {
        super(2, continuation);
        this.$response = chargersSubscriptionResponseDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersSubscriptionMapper$mapToChargersSubscriptionData$2 chargersSubscriptionMapper$mapToChargersSubscriptionData$2 = new ChargersSubscriptionMapper$mapToChargersSubscriptionData$2(this.this$0, this.$response, continuation);
        chargersSubscriptionMapper$mapToChargersSubscriptionData$2.L$0 = obj;
        return chargersSubscriptionMapper$mapToChargersSubscriptionData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersSubscriptionMapper$mapToChargersSubscriptionData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0147  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x01a4 -> B:27:0x01a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0140 -> B:40:0x0141). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        noh nohVar;
        a aVar;
        Iterator it;
        Collection collection;
        a aVar2;
        Iterator it2;
        noh nohVar2;
        List list;
        Collection collection2;
        List list2;
        List list3;
        noh nohVar3;
        List list4;
        noh nohVar4;
        CharSequence charSequence;
        Object b;
        ovi0 ovi0Var;
        List list5;
        Object k;
        List list6;
        List list7;
        CharSequence charSequence2;
        ovi0 ovi0Var2;
        Object b2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        List list8;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                b.b(obj);
                qoh h = tje.h(tseVar, null, null, new ChargersSubscriptionMapper$mapToChargersSubscriptionData$2$title$1(this.this$0, this.$response, null), 3);
                List list9 = this.$response.c;
                a aVar3 = this.this$0;
                arrayList = new ArrayList(tcc.n(list9, 10));
                nohVar = h;
                aVar = aVar3;
                it = list9.iterator();
                collection = arrayList;
                if (it.hasNext()) {
                    ChargersSubscriptionTermItemDto chargersSubscriptionTermItemDto = (ChargersSubscriptionTermItemDto) it.next();
                    this.L$0 = tseVar;
                    this.L$1 = nohVar;
                    this.L$2 = null;
                    this.L$3 = aVar;
                    this.L$4 = null;
                    this.L$5 = collection;
                    this.L$6 = it;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = collection;
                    this.label = 1;
                    aVar.getClass();
                    obj = bvf0.n(new ChargersSubscriptionMapper$mapTermItem$2(aVar, chargersSubscriptionTermItemDto, null), this);
                    if (obj != coroutineSingletons) {
                        arrayList = collection;
                        collection.add((noh) obj);
                        collection = arrayList;
                        if (it.hasNext()) {
                            qoh h2 = tje.h(tseVar, null, null, new ChargersSubscriptionMapper$mapToChargersSubscriptionData$2$description$1(this.this$0, this.$response, null), 3);
                            List list10 = this.$response.e;
                            aVar2 = this.this$0;
                            ArrayList arrayList2 = new ArrayList();
                            it2 = list10.iterator();
                            nohVar2 = h2;
                            list = (List) collection;
                            collection2 = arrayList2;
                            if (it2.hasNext()) {
                                ChargersSubscriptionButtonDto chargersSubscriptionButtonDto = (ChargersSubscriptionButtonDto) it2.next();
                                this.L$0 = null;
                                this.L$1 = nohVar;
                                this.L$2 = list;
                                this.L$3 = nohVar2;
                                this.L$4 = null;
                                this.L$5 = aVar2;
                                this.L$6 = null;
                                this.L$7 = collection2;
                                this.L$8 = null;
                                this.L$9 = it2;
                                this.L$10 = null;
                                this.L$11 = null;
                                this.L$12 = null;
                                this.label = 2;
                                aVar2.getClass();
                                Object n = bvf0.n(new ChargersSubscriptionMapper$mapButton$2(aVar2, chargersSubscriptionButtonDto, null), this);
                                if (n != coroutineSingletons) {
                                    list4 = list;
                                    obj = n;
                                    nohVar4 = (noh) obj;
                                    if (nohVar4 != null) {
                                        collection2.add(nohVar4);
                                    }
                                    list = list4;
                                    if (it2.hasNext()) {
                                        list2 = (List) collection2;
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = list;
                                        this.L$3 = nohVar2;
                                        this.L$4 = list2;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.L$7 = null;
                                        this.L$8 = null;
                                        this.L$9 = null;
                                        this.L$10 = null;
                                        this.L$11 = null;
                                        this.L$12 = null;
                                        this.label = 3;
                                        Object k2 = nohVar.k(this);
                                        if (k2 != coroutineSingletons) {
                                            list3 = list;
                                            obj = k2;
                                            nohVar3 = nohVar2;
                                            charSequence = (CharSequence) obj;
                                            String str = this.$response.b;
                                            ovi0 a = str == null ? mja1.a(str, null, 6) : null;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = nohVar3;
                                            this.L$4 = list2;
                                            this.L$5 = charSequence;
                                            this.L$6 = a;
                                            this.label = 4;
                                            b = kotlinx.coroutines.a.b(list3, this);
                                            if (b != coroutineSingletons) {
                                                List list11 = list2;
                                                ovi0Var = a;
                                                obj = b;
                                                list5 = list11;
                                                List list12 = (List) obj;
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.L$4 = list5;
                                                this.L$5 = charSequence;
                                                this.L$6 = ovi0Var;
                                                this.L$7 = list12;
                                                this.label = 5;
                                                k = nohVar3.k(this);
                                                if (k != coroutineSingletons) {
                                                    ovi0 ovi0Var3 = ovi0Var;
                                                    list6 = list12;
                                                    obj = k;
                                                    list7 = list5;
                                                    charSequence2 = charSequence;
                                                    ovi0Var2 = ovi0Var3;
                                                    CharSequence charSequence5 = (CharSequence) obj;
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.L$2 = null;
                                                    this.L$3 = null;
                                                    this.L$4 = null;
                                                    this.L$5 = charSequence2;
                                                    this.L$6 = ovi0Var2;
                                                    this.L$7 = list6;
                                                    this.L$8 = charSequence5;
                                                    this.label = 6;
                                                    b2 = kotlinx.coroutines.a.b(list7, this);
                                                    if (b2 != coroutineSingletons) {
                                                        charSequence3 = charSequence5;
                                                        charSequence4 = charSequence2;
                                                        obj = b2;
                                                        list8 = list6;
                                                        return new gta(charSequence4, ovi0Var2, list8, charSequence3, (List) obj);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
            case 1:
                collection = (Collection) this.L$9;
                it = (Iterator) this.L$6;
                arrayList = (Collection) this.L$5;
                aVar = (a) this.L$3;
                nohVar = (noh) this.L$1;
                b.b(obj);
                collection.add((noh) obj);
                collection = arrayList;
                if (it.hasNext()) {
                }
                break;
            case 2:
                it2 = (Iterator) this.L$9;
                collection2 = (Collection) this.L$7;
                aVar2 = (a) this.L$5;
                nohVar2 = (noh) this.L$3;
                list4 = (List) this.L$2;
                nohVar = (noh) this.L$1;
                b.b(obj);
                nohVar4 = (noh) obj;
                if (nohVar4 != null) {
                }
                list = list4;
                if (it2.hasNext()) {
                }
                return coroutineSingletons;
            case 3:
                list2 = (List) this.L$4;
                noh nohVar5 = (noh) this.L$3;
                list3 = (List) this.L$2;
                b.b(obj);
                nohVar3 = nohVar5;
                charSequence = (CharSequence) obj;
                String str2 = this.$response.b;
                if (str2 == null) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar3;
                this.L$4 = list2;
                this.L$5 = charSequence;
                this.L$6 = a;
                this.label = 4;
                b = kotlinx.coroutines.a.b(list3, this);
                if (b != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                ovi0Var = (ovi0) this.L$6;
                charSequence = (CharSequence) this.L$5;
                list5 = (List) this.L$4;
                nohVar3 = (noh) this.L$3;
                b.b(obj);
                List list122 = (List) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = list5;
                this.L$5 = charSequence;
                this.L$6 = ovi0Var;
                this.L$7 = list122;
                this.label = 5;
                k = nohVar3.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                list6 = (List) this.L$7;
                ovi0Var2 = (ovi0) this.L$6;
                charSequence2 = (CharSequence) this.L$5;
                list7 = (List) this.L$4;
                b.b(obj);
                CharSequence charSequence52 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = charSequence2;
                this.L$6 = ovi0Var2;
                this.L$7 = list6;
                this.L$8 = charSequence52;
                this.label = 6;
                b2 = kotlinx.coroutines.a.b(list7, this);
                if (b2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                CharSequence charSequence6 = (CharSequence) this.L$8;
                List list13 = (List) this.L$7;
                ovi0Var2 = (ovi0) this.L$6;
                CharSequence charSequence7 = (CharSequence) this.L$5;
                b.b(obj);
                list8 = list13;
                charSequence4 = charSequence7;
                charSequence3 = charSequence6;
                return new gta(charSequence4, ovi0Var2, list8, charSequence3, (List) obj);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
