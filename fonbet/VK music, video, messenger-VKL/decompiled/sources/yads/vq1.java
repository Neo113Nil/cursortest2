package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.g5g;
import xsna.s3q0;
import xsna.spj;
import xsna.whn0;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class vq1 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ hp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, hp hpVar, spj spjVar) {
        super(2, spjVar);
        this.c = aVar;
        this.d = context;
        this.e = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new vq1(this.c, this.d, this.e, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((vq1) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
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
            if (com.monetization.ads.mediation.base.initialize.a.h.getAndSet(false)) {
                aVar.b.getClass();
                List list = hpVar.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    g5g.y(((gb) it.next()).c, arrayList);
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
