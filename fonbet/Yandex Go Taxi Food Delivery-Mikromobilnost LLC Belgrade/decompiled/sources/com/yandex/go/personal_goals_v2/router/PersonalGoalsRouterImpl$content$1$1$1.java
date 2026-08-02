package com.yandex.go.personal_goals_v2.router;

import com.yandex.go.personal_goals_v2.analytics.PersonalGoalsClickType;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.a60;
import defpackage.agd;
import defpackage.e4b0;
import defpackage.g4b0;
import defpackage.h4b0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4b0;
import defpackage.p4b0;
import defpackage.q4b0;
import defpackage.qu;
import defpackage.r4b0;
import defpackage.s4b0;
import defpackage.t4b0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.u4b0;
import defpackage.v770;
import defpackage.w511;
import defpackage.w7b0;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.personal_goals_v2.router.PersonalGoalsRouterImpl$content$1$1$1", f = "PersonalGoalsRouterImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PersonalGoalsRouterImpl$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ t4b0 $it;
    final /* synthetic */ b $navigator;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalGoalsRouterImpl$content$1$1$1(c cVar, t4b0 t4b0Var, yfd yfdVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$it = t4b0Var;
        this.$this_buildContent = yfdVar;
        this.$navigator = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalGoalsRouterImpl$content$1$1$1(this.this$0, this.$it, this.$this_buildContent, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalGoalsRouterImpl$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0144 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        u4b0 u4b0Var = this.this$0.M;
        t4b0 t4b0Var = this.$it;
        h4b0 h4b0Var = (h4b0) ((agd) this.$this_buildContent).a;
        b bVar = this.$navigator;
        this.label = 1;
        e4b0 e4b0Var = u4b0Var.a;
        if (t4b0Var instanceof q4b0) {
            ((a60) bVar.c.H).c(((q4b0) t4b0Var).a, v770.b);
        } else if (t4b0Var instanceof p4b0) {
            ArrayList arrayList = h4b0Var.e;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((g4b0) it.next()).a);
            }
            e4b0Var.a(PersonalGoalsClickType.BACK.getType(), h4b0Var.b, ((p4b0) t4b0Var).a, arrayList2);
            bVar.c.r(new qu(9));
        } else {
            if (t4b0Var instanceof o4b0) {
                ArrayList arrayList3 = h4b0Var.e;
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((g4b0) it2.next()).a);
                }
                String type = PersonalGoalsClickType.ACCEPT.getType();
                String str = h4b0Var.b;
                w7b0 w7b0Var = ((o4b0) t4b0Var).a;
                e4b0Var.a(type, str, w7b0Var.a, arrayList4);
                a = bVar.a(w7b0Var, this);
                return a != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            if (t4b0Var instanceof r4b0) {
                ArrayList arrayList5 = h4b0Var.e;
                ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(((g4b0) it3.next()).a);
                }
                e4b0Var.a(PersonalGoalsClickType.GOAL.getType(), h4b0Var.b, ((r4b0) t4b0Var).a, arrayList6);
            } else {
                if (!jl40.l(t4b0Var, s4b0.a)) {
                    w511.b();
                    return null;
                }
                ArrayList arrayList7 = h4b0Var.e;
                ArrayList arrayList8 = new ArrayList(tcc.n(arrayList7, 10));
                Iterator it4 = arrayList7.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(((g4b0) it4.next()).a);
                }
                String str2 = h4b0Var.b;
                e4b0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("goals", arrayList8);
                hashMap.put("open_source", str2);
                e4b0Var.a.a("PersonalGoals.Selector.Shown", hashMap, 1, new HashMap());
            }
        }
        a = zy11Var;
        if (a != coroutineSingletons) {
        }
    }
}
