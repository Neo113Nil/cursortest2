package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import com.ybsdk.feature.savings.internal.entities.SavingsDashboardPollStatus;
import com.ybsdk.feature.savings.internal.entities.SavingsDivEntity$ProductType;
import defpackage.ds31;
import defpackage.fbm0;
import defpackage.iyd0;
import defpackage.kam0;
import defpackage.lam0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.obm0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.scm0;
import defpackage.ssa1;
import defpackage.sya1;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardViewModelV4$loadDashboard$2", f = "SavingsDashboardViewModelV4.kt", l = {271}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsDashboardViewModelV4$loadDashboard$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $withLoadIndication;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsDashboardViewModelV4$loadDashboard$2(c cVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$withLoadIndication = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsDashboardViewModelV4$loadDashboard$2(this.this$0, this.$withLoadIndication, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsDashboardViewModelV4$loadDashboard$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        Iterable iterable;
        r0 r0Var;
        Object value;
        pzt0 pzt0Var;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            com.ybsdk.feature.savings.internal.interactors.v4.b bVar = cVar.N;
            Map<String, String> additionalData = cVar.B.getAdditionalData();
            this.label = 1;
            a = bVar.a(null, additionalData, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        c cVar2 = this.this$0;
        cVar2.getClass();
        boolean z = a instanceof Result.Failure;
        iyd0 iyd0Var = (iyd0) (z ? null : a);
        lam0 lam0Var = iyd0Var != null ? (lam0) iyd0Var.a : null;
        if (lam0Var == null || (list = lam0Var.e) == null) {
            iterable = EmptySet.a;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List list2 = ((kam0) it.next()).g;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof scm0) {
                        arrayList2.add(obj2);
                    }
                }
                ycc.r(arrayList2, arrayList);
            }
            iterable = kotlin.collections.a.N0(arrayList);
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList3 = new ArrayList(tcc.n(iterable2, 10));
        Iterator it2 = iterable2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((scm0) it2.next()).j);
        }
        o8g0 o8g0Var = cVar2.H;
        boolean contains = arrayList3.contains(SavingsDivEntity$ProductType.SAVINGS);
        boolean contains2 = arrayList3.contains(SavingsDivEntity$ProductType.DEPOSIT);
        boolean contains3 = arrayList3.contains(SavingsDivEntity$ProductType.INVESTMENT);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = iterable2.iterator();
        while (it3.hasNext()) {
            String str = ((scm0) it3.next()).e;
            String b = str != null ? ssa1.b(str) : null;
            if (b != null) {
                arrayList4.add(b);
            }
        }
        o8g0Var.p(z, (lam0Var != null ? lam0Var.d : null) == SavingsDashboardPollStatus.OPENING_ACCOUNT_POLLING, contains2, contains, contains3, arrayList4.isEmpty() ? null : arrayList4);
        c cVar3 = this.this$0;
        boolean z2 = this.$withLoadIndication;
        Throwable a2 = Result.a(a);
        obm0 obm0Var = obm0.a;
        if (a2 == null) {
            iyd0 iyd0Var2 = (iyd0) a;
            cVar3.c0((lam0) iyd0Var2.a);
            cVar3.Z(obm0Var);
            if (!sya1.c(((lam0) iyd0Var2.a).d) && ((pzt0Var = cVar3.J) == null || !pzt0Var.isActive())) {
                cVar3.J = tje.N(ds31.a(cVar3), null, null, new SavingsDashboardViewModelV4$loadDashboard$2$2$1(cVar3, iyd0Var2, null), 3);
            }
        } else {
            if (z2) {
                pz40 Y = cVar3.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, fbm0.a((fbm0) value, SavingsDashboardStateV4$Status.Error, null, a2, 6)));
            } else {
                cVar3.getClass();
                c.k0(null, "Background loading has error", a2);
            }
            cVar3.Z(obm0Var);
        }
        return zy11.a;
    }
}
