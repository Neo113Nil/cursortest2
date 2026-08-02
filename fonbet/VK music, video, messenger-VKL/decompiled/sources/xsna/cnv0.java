package xsna;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkStepsTimeUtils.kt */
@b6l(c = "com.vk.superapp.vksteps.utils.VkStepsTimeUtils$divideTimeAtIntervals$2", f = "VkStepsTimeUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class cnv0 extends SuspendLambda implements wzs<yvj, spj<? super List<Pair<? extends ZonedDateTime, ? extends ZonedDateTime>>>, Object> {
    final /* synthetic */ ZonedDateTime $endTime;
    final /* synthetic */ ZonedDateTime $startTime;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnv0(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, spj<? super cnv0> spjVar) {
        super(2, spjVar);
        this.$startTime = zonedDateTime;
        this.$endTime = zonedDateTime2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cnv0(this.$startTime, this.$endTime, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super List<Pair<? extends ZonedDateTime, ? extends ZonedDateTime>>> spjVar) {
        return ((cnv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r5.add(new kotlin.Pair(r0, r4.$endTime));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        return r5;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ArrayList arrayList = new ArrayList();
        ZonedDateTime zonedDateTime = this.$startTime;
        while (true) {
            if (!zonedDateTime.isBefore(this.$endTime) && !zonedDateTime.isEqual(this.$endTime)) {
                return arrayList;
            }
            ZonedDateTime withSecond = zonedDateTime.plusDays(0L).withHour(23).withMinute(59).withSecond(59);
            if (withSecond.isAfter(this.$endTime) || zonedDateTime.isEqual(this.$endTime)) {
                break;
            }
            arrayList.add(new Pair(zonedDateTime, withSecond));
            zonedDateTime = withSecond.plusSeconds(1L);
        }
    }
}
