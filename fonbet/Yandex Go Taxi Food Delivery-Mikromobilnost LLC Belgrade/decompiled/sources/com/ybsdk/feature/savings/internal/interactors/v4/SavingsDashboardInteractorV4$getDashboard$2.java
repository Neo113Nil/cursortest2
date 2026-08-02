package com.ybsdk.feature.savings.internal.interactors.v4;

import defpackage.iyd0;
import defpackage.jl40;
import defpackage.kam0;
import defpackage.lam0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tq11;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Result;", "Liyd0;", "Llam0;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.v4.SavingsDashboardInteractorV4$getDashboard$2", f = "SavingsDashboardInteractorV4.kt", l = {37, 45, 46}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsDashboardInteractorV4$getDashboard$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $additionalData;
    final /* synthetic */ tq11 $attemptNumber;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsDashboardInteractorV4$getDashboard$2(b bVar, tq11 tq11Var, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$attemptNumber = tq11Var;
        this.$additionalData = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsDashboardInteractorV4$getDashboard$2(this.this$0, this.$attemptNumber, this.$additionalData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsDashboardInteractorV4$getDashboard$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        Object obj2;
        b bVar;
        Collection linkedHashSet;
        iyd0 iyd0Var;
        lam0 lam0Var;
        Object k;
        Set set;
        lam0 lam0Var2;
        iyd0 iyd0Var2;
        b bVar2;
        Set set2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar3 = this.this$0;
            qoh h = tje.h(bVar3.a.b, null, null, new SavingsDashboardInteractorV4$getDashboard$2$savedExpandedDeferred$1(bVar3, null), 3);
            com.ybsdk.feature.savings.internal.data.b bVar4 = this.this$0.e;
            tq11 tq11Var = this.$attemptNumber;
            Map<String, String> map = this.$additionalData;
            this.L$0 = h;
            this.label = 1;
            Object e = bVar4.e(tq11Var, map, this);
            if (e != coroutineSingletons) {
                nohVar = h;
                obj2 = e;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                set = (Set) this.L$4;
                set2 = (Set) this.L$3;
                lam0Var2 = (lam0) this.L$2;
                iyd0Var2 = (iyd0) this.L$1;
                bVar2 = (b) this.L$0;
                kotlin.b.b(obj);
                if (!jl40.l(set, obj)) {
                    bVar2.d.b(set2);
                }
                lam0Var2.getClass();
                if (!set2.isEmpty()) {
                    List<kam0> list = lam0Var2.e;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (kam0 kam0Var : list) {
                        if (set2.contains(kam0Var.a) && !kam0Var.g.isEmpty()) {
                            kam0Var = kam0.a(kam0Var, null, true, 255);
                        }
                        arrayList.add(kam0Var);
                    }
                    lam0Var2 = lam0.a(lam0Var2, arrayList);
                }
                obj2 = new iyd0(iyd0Var2.b, lam0Var2);
                return new Result(obj2);
            }
            Collection collection = (Set) this.L$4;
            lam0Var = (lam0) this.L$3;
            iyd0Var = (iyd0) this.L$2;
            b bVar5 = (b) this.L$1;
            nohVar = (noh) this.L$0;
            kotlin.b.b(obj);
            linkedHashSet = collection;
            bVar = bVar5;
            LinkedHashSet U = kotlin.collections.a.U((Iterable) obj, linkedHashSet);
            this.L$0 = bVar;
            this.L$1 = iyd0Var;
            this.L$2 = lam0Var;
            this.L$3 = U;
            this.L$4 = U;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
                set = U;
                lam0Var2 = lam0Var;
                iyd0Var2 = iyd0Var;
                obj = k;
                bVar2 = bVar;
                set2 = set;
                if (!jl40.l(set, obj)) {
                }
                lam0Var2.getClass();
                if (!set2.isEmpty()) {
                }
                obj2 = new iyd0(iyd0Var2.b, lam0Var2);
                return new Result(obj2);
            }
            return coroutineSingletons;
        }
        noh nohVar2 = (noh) this.L$0;
        kotlin.b.b(obj);
        obj2 = ((Result) obj).getValue();
        nohVar = nohVar2;
        bVar = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            iyd0 iyd0Var3 = (iyd0) obj2;
            lam0 lam0Var3 = (lam0) iyd0Var3.a;
            List list2 = lam0Var3.e;
            linkedHashSet = new LinkedHashSet();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((kam0) it.next()).a);
            }
            this.L$0 = nohVar;
            this.L$1 = bVar;
            this.L$2 = iyd0Var3;
            this.L$3 = lam0Var3;
            this.L$4 = linkedHashSet;
            this.label = 2;
            Object k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
                iyd0Var = iyd0Var3;
                obj = k2;
                lam0Var = lam0Var3;
                LinkedHashSet U2 = kotlin.collections.a.U((Iterable) obj, linkedHashSet);
                this.L$0 = bVar;
                this.L$1 = iyd0Var;
                this.L$2 = lam0Var;
                this.L$3 = U2;
                this.L$4 = U2;
                this.label = 3;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        return new Result(obj2);
    }
}
