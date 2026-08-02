package com.yandex.messaging.ui.calllist;

import defpackage.g92;
import defpackage.gvg0;
import defpackage.i4t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8b;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.ui7;
import defpackage.vh7;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.calllist.CallListViewModel$special$$inlined$flatMapLatest$1", f = "CallListViewModel.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class CallListViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallListViewModel$special$$inlined$flatMapLatest$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CallListViewModel$special$$inlined$flatMapLatest$1 callListViewModel$special$$inlined$flatMapLatest$1 = new CallListViewModel$special$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        callListViewModel$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        callListViewModel$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return callListViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr ui7Var;
        tpr g92Var;
        tpr g92Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            Pair pair = (Pair) this.L$1;
            List list = (List) pair.getFirst();
            List list2 = (List) pair.getSecond();
            if (list == null) {
                ui7Var = new g92(2, null);
            } else if (list.isEmpty()) {
                ui7Var = new g92(2, EmptyList.a);
            } else {
                List<vh7> list3 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                for (vh7 vh7Var : list3) {
                    d dVar = this.this$0;
                    dVar.getClass();
                    String str = (String) vh7Var.d.getValue();
                    String str2 = (String) vh7Var.e.getValue();
                    if (vh7Var.a == null && list2.contains(vh7Var.c.getId()) && str != null) {
                        tpr a = dVar.w.a(new i4t(p8b.a(str), gvg0.avatar_size_108));
                        if (str2 == null || (g92Var2 = dVar.x.a(str2)) == null) {
                            g92Var2 = new g92(2, null);
                        }
                        g92Var = new m0(a, g92Var2, new CallListViewModel$createItemDataFlow$1(vh7Var, null));
                    } else {
                        g92Var = new g92(2, vh7Var);
                    }
                    arrayList.add(g92Var);
                }
                ui7Var = new ui7((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]), 0);
            }
            this.label = 1;
            if (e.u(ui7Var, vprVar, this) == coroutineSingletons) {
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
