package xsna;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WorkoutTimeUtils.kt */
@b6l(c = "com.vk.superapp.vkworkout.domain.utils.WorkoutTimeUtilsKt$divideTimeAtIntervals$2", f = "WorkoutTimeUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class jzx0 extends SuspendLambda implements wzs<yvj, spj<? super List<Pair<? extends ZonedDateTime, ? extends ZonedDateTime>>>, Object> {
    final /* synthetic */ bvo0 $timeRange;
    final /* synthetic */ ZoneId $zoneId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzx0(bvo0 bvo0Var, ZoneId zoneId, spj<? super jzx0> spjVar) {
        super(2, spjVar);
        this.$timeRange = bvo0Var;
        this.$zoneId = zoneId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jzx0(this.$timeRange, this.$zoneId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super List<Pair<? extends ZonedDateTime, ? extends ZonedDateTime>>> spjVar) {
        return ((jzx0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$timeRange.getClass();
        qvo0.a.getClass();
        long d = qvo0.d();
        this.$timeRange.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        ZonedDateTime ofInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(d), this.$zoneId);
        ZonedDateTime ofInstant2 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(currentTimeMillis), this.$zoneId);
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (!ofInstant.isBefore(ofInstant2) && !ofInstant.isEqual(ofInstant2)) {
                return arrayList;
            }
            ZonedDateTime withSecond = ofInstant.plusDays(4L).withHour(23).withMinute(59).withSecond(59);
            if (withSecond.isAfter(ofInstant2) || ofInstant.isEqual(ofInstant2)) {
                break;
            }
            arrayList.add(new Pair(ofInstant, withSecond));
            ofInstant = withSecond.plusSeconds(1L);
        }
        arrayList.add(new Pair(ofInstant, ofInstant2));
        return arrayList;
    }
}
