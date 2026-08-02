package xsna;

import android.content.Context;
import androidx.health.connect.client.aggregate.AggregateMetric;
import com.vk.superapp.vksteps.utils.enums.VkStepsSyncDurationStrategy;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.czu;

/* compiled from: HealthConnectDataSource.kt */
@b6l(c = "com.vk.superapp.vksteps.data.datasource.HealthConnectDataSource$getAggregatedStepsFromHealthConnect$2", f = "HealthConnectDataSource.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class b0v extends SuspendLambda implements wzs<yvj, spj<? super List<? extends lb1>>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ZonedDateTime $endTime;
    final /* synthetic */ ZonedDateTime $startTime;
    final /* synthetic */ VkStepsSyncDurationStrategy $syncDurationStrategy;
    int label;

    /* compiled from: HealthConnectDataSource.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkStepsSyncDurationStrategy.values().length];
            try {
                iArr[VkStepsSyncDurationStrategy.ONE_MINUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkStepsSyncDurationStrategy.TEN_MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkStepsSyncDurationStrategy.ONE_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0v(Context context, VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, spj<? super b0v> spjVar) {
        super(2, spjVar);
        this.$context = context;
        this.$syncDurationStrategy = vkStepsSyncDurationStrategy;
        this.$startTime = zonedDateTime;
        this.$endTime = zonedDateTime2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new b0v(this.$context, this.$syncDurationStrategy, this.$startTime, this.$endTime, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super List<? extends lb1>> spjVar) {
        return ((b0v) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.time.LocalDateTime, java.time.chrono.ChronoLocalDateTime] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Duration ofMinutes;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            czu b = czu.b.b(czu.a, this.$context);
            int i2 = a.$EnumSwitchMapping$0[this.$syncDurationStrategy.ordinal()];
            if (i2 == 1) {
                ofMinutes = Duration.ofMinutes(1L);
            } else if (i2 == 2) {
                ofMinutes = Duration.ofMinutes(10L);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ofMinutes = Duration.ofDays(1L);
            }
            xgx0 xgx0Var = xgx0.a;
            String str = "HealthConnectDataSource request params: { timeRangeSlicer =  " + ofMinutes + ", startTime = " + this.$startTime + ", endTime = " + this.$endTime + '}';
            xgx0Var.getClass();
            xgx0.a(str);
            Set y0 = rl3.y0(new AggregateMetric[]{x0l0.g, bhn.h});
            ?? localDateTime = this.$startTime.toLocalDateTime();
            ?? localDateTime2 = this.$endTime.toLocalDateTime();
            if (!localDateTime.isBefore(localDateTime2)) {
                throw new IllegalArgumentException("end time needs be after start time");
            }
            o71 o71Var = new o71(y0, new dvo0(null, null, localDateTime, localDateTime2), ofMinutes, EmptySet.b);
            this.label = 1;
            obj = b.a(o71Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        List list = (List) obj;
        xgx0.a.getClass();
        xgx0.a("HealthConnectDataSource aggregated records = " + list);
        return list;
    }
}
