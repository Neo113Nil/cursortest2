package com.yandex.messaging.phonecontacts;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.dqb1;
import defpackage.evu0;
import defpackage.gvu0;
import defpackage.hae;
import defpackage.iae;
import defpackage.jl40;
import defpackage.kae;
import defpackage.kce;
import defpackage.lce;
import defpackage.mce;
import defpackage.mvg;
import defpackage.nbt;
import defpackage.ny61;
import defpackage.obt;
import defpackage.pbe;
import defpackage.pbt;
import defpackage.qbt;
import defpackage.qv10;
import defpackage.tcc;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqbt;", ContactsFragment.WEBVIEW_NAME, "Llae;", "<anonymous>", "(Lqbt;)Llae;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.phonecontacts.ContactListViewModel$contentFlow$1$1", f = "ContactListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactListViewModel$contentFlow$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $q;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactListViewModel$contentFlow$1$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$q = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ContactListViewModel$contentFlow$1$1 contactListViewModel$contentFlow$1$1 = new ContactListViewModel$contentFlow$1$1(this.this$0, this.$q, continuation);
        contactListViewModel$contentFlow$1$1.L$0 = obj;
        return contactListViewModel$contentFlow$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactListViewModel$contentFlow$1$1) create((qbt) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dqb1 lceVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        qbt qbtVar = (qbt) this.L$0;
        a aVar = this.this$0;
        String str = this.$q;
        aVar.getClass();
        if (jl40.l(qbtVar, obt.a) || jl40.l(qbtVar, obt.b) || jl40.l(qbtVar, obt.c)) {
            return iae.a;
        }
        if (jl40.l(qbtVar, obt.d)) {
            return kae.a;
        }
        if (!(qbtVar instanceof pbt)) {
            w511.b();
            return null;
        }
        List list = ((pbt) qbtVar).a;
        if (evu0.J(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                String str2 = ShimmerDivHandler.NUMBER_SING;
                if (!hasNext) {
                    break;
                }
                Object next = it.next();
                char u0 = gvu0.u0(((nbt) next).c);
                if (Character.isLetter(u0)) {
                    str2 = String.valueOf(u0).toUpperCase(Locale.ROOT);
                }
                Object obj3 = linkedHashMap.get(str2);
                if (obj3 == null) {
                    obj3 = qv10.w(str2, linkedHashMap);
                }
                ((List) obj3).add(next);
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                List list2 = (List) entry.getValue();
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(a.Y((nbt) it2.next()));
                }
                arrayList.add(new pbe(str3, arrayList2));
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (jl40.l(((pbe) next2).a, ShimmerDivHandler.NUMBER_SING)) {
                    obj2 = next2;
                    break;
                }
            }
            pbe pbeVar = (pbe) obj2;
            if (pbeVar != null) {
                arrayList = kotlin.collections.a.o0(kotlin.collections.a.j0(arrayList, pbeVar), pbeVar);
            }
            lceVar = new mce(arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list) {
                if (evu0.y(((nbt) obj4).c, str, true)) {
                    arrayList3.add(obj4);
                }
            }
            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(a.Y((nbt) it4.next()));
            }
            lceVar = !arrayList4.isEmpty() ? new lce(arrayList4) : kce.a;
        }
        return new hae(str, lceVar);
    }
}
