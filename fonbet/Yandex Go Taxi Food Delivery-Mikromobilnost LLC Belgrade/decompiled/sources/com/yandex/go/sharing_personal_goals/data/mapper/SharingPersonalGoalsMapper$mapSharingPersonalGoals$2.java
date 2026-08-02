package com.yandex.go.sharing_personal_goals.data.mapper;

import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalButtonDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsDto;
import com.yandex.go.sharing_personal_goals.data.model.h;
import defpackage.krr0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkrr0;", "<anonymous>", "(Ltse;)Lkrr0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sharing_personal_goals.data.mapper.SharingPersonalGoalsMapper$mapSharingPersonalGoals$2", f = "SharingPersonalGoalsMapper.kt", l = {45, 46, 47, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharingPersonalGoalsMapper$mapSharingPersonalGoals$2 extends SuspendLambda implements wls {
    final /* synthetic */ SharingPersonalGoalsDto $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharingPersonalGoalsMapper$mapSharingPersonalGoals$2(a aVar, SharingPersonalGoalsDto sharingPersonalGoalsDto, Continuation continuation) {
        super(2, continuation);
        this.$response = sharingPersonalGoalsDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SharingPersonalGoalsMapper$mapSharingPersonalGoals$2 sharingPersonalGoalsMapper$mapSharingPersonalGoals$2 = new SharingPersonalGoalsMapper$mapSharingPersonalGoals$2(this.this$0, this.$response, continuation);
        sharingPersonalGoalsMapper$mapSharingPersonalGoals$2.L$0 = obj;
        return sharingPersonalGoalsMapper$mapSharingPersonalGoals$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharingPersonalGoalsMapper$mapSharingPersonalGoals$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0155  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        List list;
        List list2;
        CharSequence charSequence;
        List list3;
        noh nohVar2;
        Object b;
        List list4;
        CharSequence charSequence2;
        noh nohVar3;
        Object k;
        List list5;
        List list6;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoals$2$titleAsync$1(this.this$0, this.$response, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoals$2$userAgreementAsync$1(this.this$0, this.$response, null), 3);
            List list7 = this.$response.b;
            a aVar = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list7, 10));
            Iterator it = list7.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoals$2$missionsAsync$1$1(aVar, (h) it.next(), null), 3));
            }
            List list8 = this.$response.c;
            a aVar2 = this.this$0;
            ArrayList arrayList2 = new ArrayList(tcc.n(list8, 10));
            Iterator it2 = list8.iterator();
            while (it2.hasNext()) {
                arrayList2.add(tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoals$2$buttonsAsync$1$1(aVar2, (SharingPersonalGoalButtonDto) it2.next(), null), 3));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = arrayList;
            this.L$4 = arrayList2;
            this.label = 1;
            obj = h.s(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj != coroutineSingletons) {
                nohVar = h2;
                list = arrayList;
                list2 = arrayList2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                charSequence = (CharSequence) this.L$5;
                list3 = (List) this.L$4;
                nohVar2 = (noh) this.L$2;
                b.b(obj);
                List list9 = (List) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = nohVar2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = charSequence;
                this.L$6 = list9;
                this.label = 3;
                b = kotlinx.coroutines.a.b(list3, this);
                if (b != coroutineSingletons) {
                    CharSequence charSequence3 = charSequence;
                    list4 = list9;
                    obj = b;
                    charSequence2 = charSequence3;
                    nohVar3 = nohVar2;
                    List list10 = (List) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = charSequence2;
                    this.L$6 = list4;
                    this.L$7 = list10;
                    this.label = 4;
                    k = nohVar3.k(this);
                    if (k != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list6 = (List) this.L$7;
                list5 = (List) this.L$6;
                charSequence2 = (CharSequence) this.L$5;
                b.b(obj);
                return new krr0(charSequence2, list5, list6, (CharSequence) obj);
            }
            list4 = (List) this.L$6;
            charSequence2 = (CharSequence) this.L$5;
            nohVar3 = (noh) this.L$2;
            b.b(obj);
            List list102 = (List) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = charSequence2;
            this.L$6 = list4;
            this.L$7 = list102;
            this.label = 4;
            k = nohVar3.k(this);
            if (k != coroutineSingletons) {
                list5 = list4;
                list6 = list102;
                obj = k;
                return new krr0(charSequence2, list5, list6, (CharSequence) obj);
            }
            return coroutineSingletons;
        }
        list2 = (List) this.L$4;
        list = (List) this.L$3;
        nohVar = (noh) this.L$2;
        b.b(obj);
        CharSequence charSequence4 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = nohVar;
        this.L$3 = null;
        this.L$4 = list2;
        this.L$5 = charSequence4;
        this.label = 2;
        Object b2 = kotlinx.coroutines.a.b(list, this);
        if (b2 != coroutineSingletons) {
            List list11 = list2;
            charSequence = charSequence4;
            obj = b2;
            list3 = list11;
            nohVar2 = nohVar;
            List list92 = (List) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = nohVar2;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = charSequence;
            this.L$6 = list92;
            this.label = 3;
            b = kotlinx.coroutines.a.b(list3, this);
            if (b != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
