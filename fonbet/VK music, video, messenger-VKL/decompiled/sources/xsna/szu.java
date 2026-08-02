package xsna;

import android.health.connect.AggregateRecordsRequest;
import android.health.connect.AggregateRecordsResponse;
import android.health.connect.HealthConnectManager;
import android.health.connect.datatypes.DataOrigin;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HealthConnectClientUpsideDownImpl.kt */
@b6l(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1", f = "HealthConnectClientUpsideDownImpl.kt", l = {634}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class szu extends SuspendLambda implements izs<spj<? super AggregateRecordsResponse<Object>>, Object> {
    final /* synthetic */ t71 $request;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ qzu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szu(qzu qzuVar, t71 t71Var, spj<? super szu> spjVar) {
        super(1, spjVar);
        this.this$0 = qzuVar;
        this.$request = t71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new szu(this.this$0, this.$request, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super AggregateRecordsResponse<Object>> spjVar) {
        return ((szu) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AggregateRecordsRequest build;
        DataOrigin build2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        qzu qzuVar = this.this$0;
        t71 t71Var = this.$request;
        this.L$0 = qzuVar;
        this.L$1 = t71Var;
        this.label = 1;
        lq9 lq9Var = new lq9(1, s7s0.c(this));
        lq9Var.o();
        HealthConnectManager healthConnectManager = qzuVar.d;
        x81.l();
        AggregateRecordsRequest.Builder c = w81.c(l7g0.b(t71Var.b));
        for (luk lukVar : t71Var.c) {
            DataOrigin.Builder e = l91.e();
            e.setPackageName(lukVar.a);
            build2 = e.build();
            c.addDataOriginsFilter(build2);
        }
        Set<AggregateMetric<?>> set = t71Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (y71.a((AggregateMetric) obj2)) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c.addAggregationType(l7g0.a((AggregateMetric) it.next()));
        }
        build = c.build();
        healthConnectManager.aggregate(build, qzuVar.b, new vpj(lq9Var));
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
