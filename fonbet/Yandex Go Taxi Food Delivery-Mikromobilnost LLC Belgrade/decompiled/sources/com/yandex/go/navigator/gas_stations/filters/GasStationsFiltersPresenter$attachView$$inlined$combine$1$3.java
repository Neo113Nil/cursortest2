package com.yandex.go.navigator.gas_stations.filters;

import defpackage.evu0;
import defpackage.jcb1;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.rts;
import defpackage.rus;
import defpackage.tcc;
import defpackage.ux6;
import defpackage.vpr;
import defpackage.vts;
import defpackage.wts;
import defpackage.xts;
import defpackage.yts;
import defpackage.zls;
import defpackage.zus;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersPresenter$attachView$$inlined$combine$1$3", f = "GasStationsFiltersPresenter.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class GasStationsFiltersPresenter$attachView$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ rus this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsFiltersPresenter$attachView$$inlined$combine$1$3(Continuation continuation, rus rusVar) {
        super(3, continuation);
        this.this$0 = rusVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GasStationsFiltersPresenter$attachView$$inlined$combine$1$3 gasStationsFiltersPresenter$attachView$$inlined$combine$1$3 = new GasStationsFiltersPresenter$attachView$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        gasStationsFiltersPresenter$attachView$$inlined$combine$1$3.L$0 = (vpr) obj;
        gasStationsFiltersPresenter$attachView$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return gasStationsFiltersPresenter$attachView$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        vts vtsVar;
        Iterable iterable;
        List list;
        ListBuilder listBuilder;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            char c = 3;
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            boolean booleanValue = ((Boolean) obj6).booleanValue();
            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
            Map map = (Map) obj4;
            List list2 = (List) obj3;
            this.this$0.C.getClass();
            Collection collection = (Collection) obj2;
            ArrayList arrayList = new ArrayList();
            for (Object obj7 : collection) {
                vts vtsVar2 = (vts) obj7;
                if (vtsVar2.c.isEmpty() && !evu0.y(vtsVar2.a, "open_", false)) {
                    arrayList.add(obj7);
                }
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                vts vtsVar3 = (vts) it2.next();
                String str = vtsVar3.a;
                arrayList2.add(new xts(str, jcb1.d(vtsVar3), list2.contains(str)));
                c = c;
            }
            rus rusVar = this.this$0;
            ux6 ux6Var = rusVar.B;
            HashMap hashMap = rusVar.J;
            ux6Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj8 : collection) {
                if (!((vts) obj8).c.isEmpty()) {
                    arrayList3.add(obj8);
                }
            }
            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                vts vtsVar4 = (vts) it3.next();
                String str2 = vtsVar4.a;
                Collection values = vtsVar4.c.values();
                List list3 = (List) map.get(str2);
                EmptyList emptyList = EmptyList.a;
                List list4 = list3 == null ? emptyList : list3;
                if (values != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj9 : values) {
                        Iterator it4 = it3;
                        vts vtsVar5 = vtsVar4;
                        if (!jl40.l(((rts) obj9).a, "1")) {
                            arrayList5.add(obj9);
                        }
                        it3 = it4;
                        vtsVar4 = vtsVar5;
                    }
                    it = it3;
                    vtsVar = vtsVar4;
                    iterable = new ArrayList(tcc.n(arrayList5, 10));
                    for (Iterator it5 = arrayList5.iterator(); it5.hasNext(); it5 = it5) {
                        rts rtsVar = (rts) it5.next();
                        iterable.add(new wts(rtsVar.a, rtsVar.b, list4.contains(rtsVar.a)));
                    }
                } else {
                    it = it3;
                    vtsVar = vtsVar4;
                    iterable = emptyList;
                }
                List list5 = (List) hashMap.get(str2);
                if (list5 != null) {
                    List<wts> list6 = list5;
                    ?? arrayList6 = new ArrayList(tcc.n(list6, 10));
                    for (wts wtsVar : list6) {
                        arrayList6.add(wts.a(wtsVar, list4.contains(wtsVar.a)));
                    }
                    list = list2;
                    listBuilder = arrayList6;
                } else {
                    ListBuilder a = rcc.a();
                    Iterable iterable2 = iterable;
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj10 : iterable2) {
                        Iterable iterable3 = iterable2;
                        if (((wts) obj10).c) {
                            arrayList7.add(obj10);
                        }
                        iterable2 = iterable3;
                    }
                    Iterable iterable4 = iterable2;
                    a.addAll(arrayList7);
                    int size = 3 - a.size();
                    if (size < 0) {
                        size = 0;
                    }
                    if (size > 0) {
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj11 : iterable4) {
                            List list7 = list2;
                            if (!((wts) obj11).c) {
                                arrayList8.add(obj11);
                            }
                            list2 = list7;
                        }
                        list = list2;
                        a.addAll(kotlin.collections.a.A0(arrayList8, size));
                    } else {
                        list = list2;
                    }
                    listBuilder = a.j();
                }
                hashMap.put(str2, listBuilder);
                String d = jcb1.d(vtsVar);
                List list8 = (List) hashMap.get(str2);
                if (list8 == null) {
                    list8 = iterable;
                }
                arrayList4.add(new yts(str2, d, list8, iterable));
                list2 = list;
                it3 = it;
            }
            zus zusVar = new zus(arrayList2, arrayList4, (list2.isEmpty() && map.isEmpty() && booleanValue2) ? false : true, booleanValue2, ((Boolean) this.this$0.D.h()).booleanValue(), booleanValue, this.this$0.z.getThemeType());
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(zusVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
