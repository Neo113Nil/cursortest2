package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.c5g;
import xsna.g5g;
import xsna.s3q0;
import xsna.spj;
import xsna.whn0;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class uq1 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ hp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, hp hpVar, spj spjVar) {
        super(2, spjVar);
        this.c = aVar;
        this.d = context;
        this.e = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new uq1(this.c, this.d, this.e, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((uq1) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List<dt1> list;
        List list2;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.c;
            Context context = this.d;
            hp hpVar = this.e;
            this.b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.g;
            aVar.getClass();
            if (com.monetization.ads.mediation.base.initialize.a.g.getAndSet(false)) {
                aVar.b.getClass();
                ht1 ht1Var = hpVar.c;
                if (ht1Var == null || (list2 = ht1Var.c) == null) {
                    list = EmptyList.b;
                } else {
                    list = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        g5g.y(((ys1) it.next()).c, list);
                    }
                }
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (dt1 dt1Var : list) {
                    aVar.c.getClass();
                    arrayList.add(new rr1(dt1Var.b, dt1Var.c, null, null, null, null, null));
                }
                obj2 = whn0.c(new yq1(aVar.e.a(arrayList), aVar, context, null), this);
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 != obj4) {
                    obj2 = s3q0.a;
                }
                if (obj2 != obj4) {
                    obj2 = s3q0.a;
                }
            } else {
                obj2 = s3q0.a;
            }
            if (obj2 == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
