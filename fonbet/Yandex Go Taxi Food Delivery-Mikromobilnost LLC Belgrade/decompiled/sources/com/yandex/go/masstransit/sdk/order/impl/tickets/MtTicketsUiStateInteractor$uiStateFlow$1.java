package com.yandex.go.masstransit.sdk.order.impl.tickets;

import defpackage.dms;
import defpackage.j940;
import defpackage.m940;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o740;
import defpackage.p740;
import defpackage.t740;
import defpackage.tcc;
import defpackage.u510;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lm940;", ClidProvider.STATE, "", "", "", "expirationRemainingMs", "", "consumedAnimations", "seenActiveTicketIds", "<anonymous>", "(Lm940;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)Lm940;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.tickets.MtTicketsUiStateInteractor$uiStateFlow$1", f = "MtTicketsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtTicketsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketsUiStateInteractor$uiStateFlow$1(l lVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = lVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        MtTicketsUiStateInteractor$uiStateFlow$1 mtTicketsUiStateInteractor$uiStateFlow$1 = new MtTicketsUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj5);
        mtTicketsUiStateInteractor$uiStateFlow$1.L$0 = (m940) obj;
        mtTicketsUiStateInteractor$uiStateFlow$1.L$1 = (Map) obj2;
        mtTicketsUiStateInteractor$uiStateFlow$1.L$2 = (Set) obj3;
        mtTicketsUiStateInteractor$uiStateFlow$1.L$3 = (Set) obj4;
        return mtTicketsUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        Object obj2 = (m940) this.L$0;
        Map map = (Map) this.L$1;
        Set set = (Set) this.L$2;
        Set set2 = (Set) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        if (!map.isEmpty()) {
            j940 j940Var = obj2 instanceof j940 ? (j940) obj2 : null;
            if (j940Var != null && (list2 = j940Var.e) != null) {
                List<u510> list3 = list2;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                for (u510 u510Var : list3) {
                    Long l = (Long) map.get(u510Var.b);
                    if (l != null) {
                        long longValue = l.longValue();
                        t740 t740Var = u510Var.a;
                        o740 o740Var = t740Var instanceof o740 ? (o740) t740Var : null;
                        if (o740Var != null) {
                            u510Var = longValue <= 0 ? u510.a(u510Var, new p740(o740Var.a, o740Var.b, o740Var.c, o740Var.f), 0L, true, 510) : u510.a(u510Var, null, l, false, 1535);
                        }
                    }
                    arrayList.add(u510Var);
                }
                obj2 = j940.a(j940Var, arrayList);
            }
        }
        j940 j940Var2 = obj2 instanceof j940 ? (j940) obj2 : null;
        if (j940Var2 == null || (list = j940Var2.e) == null) {
            return obj2;
        }
        List<u510> list4 = list;
        ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
        for (u510 u510Var2 : list4) {
            String str = u510Var2.b;
            boolean z = u510Var2.k;
            if (str != null) {
                if (set.contains(str) && z) {
                    u510Var2 = u510.a(u510Var2, null, null, false, 1023);
                } else if ((u510Var2.a instanceof p740) && set2.contains(str) && !set.contains(str) && !z) {
                    u510Var2 = u510.a(u510Var2, null, null, true, 1023);
                }
            }
            arrayList2.add(u510Var2);
        }
        return j940.a(j940Var2, arrayList2);
    }
}
