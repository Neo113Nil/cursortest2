package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class yq1 extends SuspendLambda implements wzs {
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq1(List list, com.monetization.ads.mediation.base.initialize.a aVar, Context context, spj spjVar) {
        super(2, spjVar);
        this.c = list;
        this.d = aVar;
        this.e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        yq1 yq1Var = new yq1(this.c, this.d, this.e, spjVar);
        yq1Var.b = obj;
        return yq1Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((yq1) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        yvj yvjVar = (yvj) this.b;
        List list = this.c;
        com.monetization.ads.mediation.base.initialize.a aVar = this.d;
        Context context = this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            myc0.h(yvjVar, null, null, new xq1(aVar, context, (rr1) it.next(), null), 3);
        }
        return s3q0.a;
    }
}
