package xsna;

import android.content.Context;
import java.time.ZonedDateTime;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.czu;

/* compiled from: HealthConnectDataProvider.kt */
@b6l(c = "com.vk.superapp.vkworkout.data.datasource.HealthConnectDataProvider$getWorkouts$2", f = "HealthConnectDataProvider.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class zzu extends SuspendLambda implements wzs<yvj, spj<? super k7f0<n4q>>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ZonedDateTime $endTime;
    final /* synthetic */ ZonedDateTime $startTime;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(Context context, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, spj<? super zzu> spjVar) {
        super(2, spjVar);
        this.$context = context;
        this.$startTime = zonedDateTime;
        this.$endTime = zonedDateTime2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zzu(this.$context, this.$startTime, this.$endTime, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super k7f0<n4q>> spjVar) {
        return ((zzu) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.time.LocalDateTime, java.time.chrono.ChronoLocalDateTime] */
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
        rfc a = fpf0.a(n4q.class);
        ?? localDateTime = this.$startTime.toLocalDateTime();
        ?? localDateTime2 = this.$endTime.toLocalDateTime();
        if (!localDateTime.isBefore(localDateTime2)) {
            throw new IllegalArgumentException("end time needs be after start time");
        }
        j7f0 j7f0Var = new j7f0(a, new dvo0(null, null, localDateTime, localDateTime2), null, 60);
        this.label = 1;
        Object b2 = b.b(j7f0Var, this);
        return b2 == coroutineSingletons ? coroutineSingletons : b2;
    }
}
