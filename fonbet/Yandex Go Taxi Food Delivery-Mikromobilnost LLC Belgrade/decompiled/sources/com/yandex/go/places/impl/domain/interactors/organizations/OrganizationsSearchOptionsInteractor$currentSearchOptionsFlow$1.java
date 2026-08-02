package com.yandex.go.places.impl.domain.interactors.organizations;

import com.yandex.go.places.impl.data.mappers.organizations.h;
import defpackage.bms;
import defpackage.gvp0;
import defpackage.ivp0;
import defpackage.mvg;
import defpackage.np80;
import defpackage.ny61;
import defpackage.op80;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.s95;
import defpackage.t95;
import defpackage.tcc;
import defpackage.u95;
import defpackage.v95;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lv95;", "currentOptions", "Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/q;", "chipsDto", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lpp80;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Lru/yandex/taxi/theme/ThemeType;)Lpp80;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.domain.interactors.organizations.OrganizationsSearchOptionsInteractor$currentSearchOptionsFlow$1", f = "OrganizationsSearchOptionsInteractor.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsSearchOptionsInteractor$currentSearchOptionsFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsSearchOptionsInteractor$currentSearchOptionsFlow$1(g gVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        OrganizationsSearchOptionsInteractor$currentSearchOptionsFlow$1 organizationsSearchOptionsInteractor$currentSearchOptionsFlow$1 = new OrganizationsSearchOptionsInteractor$currentSearchOptionsFlow$1(this.this$0, (Continuation) obj4);
        organizationsSearchOptionsInteractor$currentSearchOptionsFlow$1.L$0 = (List) obj;
        organizationsSearchOptionsInteractor$currentSearchOptionsFlow$1.L$1 = (List) obj2;
        return organizationsSearchOptionsInteractor$currentSearchOptionsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<v95> list = (List) this.L$0;
        List list2 = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (list == null) {
                return op80.a;
            }
            this.this$0.getClass();
            ListBuilder a = rcc.a();
            for (v95 v95Var : list) {
                if (v95Var instanceof u95) {
                    gvp0 gvp0Var = ((u95) v95Var).b;
                    a.add(new gvp0(gvp0Var.a, gvp0Var.b, gvp0Var.c));
                } else if (v95Var instanceof s95) {
                    ArrayList<gvp0> arrayList = ((s95) v95Var).b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    for (gvp0 gvp0Var2 : arrayList) {
                        arrayList2.add(new gvp0(gvp0Var2.a, gvp0Var2.b, gvp0Var2.c));
                    }
                    a.addAll(arrayList2);
                } else {
                    if (!(v95Var instanceof t95)) {
                        w511.b();
                        return null;
                    }
                    List<gvp0> list3 = ((t95) v95Var).b;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                    for (gvp0 gvp0Var3 : list3) {
                        arrayList3.add(new gvp0(gvp0Var3.a, gvp0Var3.b, gvp0Var3.c));
                    }
                    a.addAll(arrayList3);
                }
            }
            ListBuilder j = a.j();
            ArrayList arrayList4 = new ArrayList();
            ListIterator listIterator = j.listIterator(0);
            while (true) {
                qqy qqyVar = (qqy) listIterator;
                if (!qqyVar.hasNext()) {
                    break;
                }
                Object next = qqyVar.next();
                if (((gvp0) next).b) {
                    arrayList4.add(next);
                }
            }
            ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList5.add(((gvp0) it.next()).a);
            }
            h hVar = this.this$0.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = hVar.b(arrayList5, list2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        List list4 = (List) obj;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : list4) {
            if (obj2 instanceof ivp0) {
                arrayList6.add(obj2);
            }
        }
        ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, 10));
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList7.add(((ivp0) it2.next()).b);
        }
        return new np80(arrayList7, list4);
    }
}
