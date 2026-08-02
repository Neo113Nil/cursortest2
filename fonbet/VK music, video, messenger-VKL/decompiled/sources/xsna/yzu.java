package xsna;

import android.content.Context;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.czu;

/* compiled from: HealthConnectDataProvider.kt */
@b6l(c = "com.vk.superapp.vkworkout.data.datasource.HealthConnectDataProvider$getWorkoutDetails$2", f = "HealthConnectDataProvider.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class yzu extends SuspendLambda implements wzs<yvj, spj<? super androidx.health.connect.client.aggregate.c>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ n4q $exerciseRecord;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzu(Context context, n4q n4qVar, spj<? super yzu> spjVar) {
        super(2, spjVar);
        this.$context = context;
        this.$exerciseRecord = n4qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new yzu(this.$context, this.$exerciseRecord, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super androidx.health.connect.client.aggregate.c> spjVar) {
        return ((yzu) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        czu b = czu.b.b(czu.a, this.$context);
        Set y0 = rl3.y0(new AggregateMetric[]{x0l0.g, bhn.h, zcp0.h});
        n4q n4qVar = this.$exerciseRecord;
        Instant instant = n4qVar.a;
        Instant instant2 = n4qVar.c;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("end time needs be after start time");
        }
        t71 t71Var = new t71(y0, new dvo0(instant, instant2, 12), EmptySet.b);
        this.label = 1;
        Object d = b.d(t71Var, this);
        return d == coroutineSingletons ? coroutineSingletons : d;
    }
}
