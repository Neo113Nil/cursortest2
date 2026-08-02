package com.yandex.go.shortcuts.impl.ui.interactors;

import defpackage.a8k0;
import defpackage.avj0;
import defpackage.b8k0;
import defpackage.d4s0;
import defpackage.ik31;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tcc;
import defpackage.wls;
import defpackage.ybo;
import defpackage.ycc;
import defpackage.za31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lik31;", "verticalsSnapshot", "Ld4s0;", "<anonymous>", "(Lik31;)Ld4s0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.ui.interactors.RidaLocalShortcutsViewSource$start$1", f = "RidaLocalShortcutsViewSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RidaLocalShortcutsViewSource$start$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RidaLocalShortcutsViewSource$start$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RidaLocalShortcutsViewSource$start$1 ridaLocalShortcutsViewSource$start$1 = new RidaLocalShortcutsViewSource$start$1(this.this$0, continuation);
        ridaLocalShortcutsViewSource$start$1.L$0 = obj;
        return ridaLocalShortcutsViewSource$start$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RidaLocalShortcutsViewSource$start$1) create((ik31) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        String str;
        ik31 ik31Var = (ik31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = ik31Var.a.a;
        mi31 mi31Var = ik31Var.b;
        this.this$0.getClass();
        List<za31> list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((za31) next).a.c()) {
                obj2 = next;
                break;
            }
        }
        za31 za31Var = (za31) obj2;
        if (za31Var == null || (arrayList = za31Var.b) == null) {
            arrayList = new ArrayList();
            for (za31 za31Var2 : list2) {
                ycc.r(jl40.l(za31Var2.d, "") ? za31Var2.b : EmptyList.a, arrayList);
            }
        }
        if (arrayList.size() == 1) {
            return new d4s0(null, null, null, null, null, null, null, null, null, false, 4095);
        }
        List<mi31> list3 = arrayList;
        a aVar = this.this$0;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        for (mi31 mi31Var2 : list3) {
            String str2 = mi31Var2.f;
            pex0 pex0Var = mi31Var2.a;
            String str3 = pex0Var.l;
            ybo yboVar = pex0Var.h;
            if (str3 == null) {
                str3 = "";
            }
            boolean l = jl40.l(mi31Var.a.b, pex0Var.b);
            String str4 = yboVar.b;
            if (str4.length() == 0) {
                int i = yboVar.a;
                if (i < 1) {
                    aVar.getClass();
                    str = "—";
                } else {
                    str = i + " " + ((avj0) aVar.a).h(kyh0.date_format_min);
                }
                str4 = str;
            }
            arrayList2.add(new a8k0(str2, str3, str4, pex0Var.j, l, !pex0Var.u, ik31Var.c == PriceUpdate$PriceLoadingState.LOADING));
        }
        return new d4s0(null, null, null, Collections.singletonList(new b8k0(arrayList2)), null, null, null, null, null, false, 4087);
    }
}
