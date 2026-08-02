package xsna;

import com.vk.api.generated.healthCommon.dto.HealthCommonVkstartWidgetSyncBackgroundConfigDto;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.random.Random;

/* compiled from: GetNextVkWorkoutWidgetUpdateDelayUseCase.kt */
/* loaded from: classes6.dex */
public final class ctt {
    public final i3w0 a;

    public ctt(i3w0 i3w0Var) {
        this.a = i3w0Var;
    }

    public static long b(String str, boolean z) {
        Calendar calendar = Calendar.getInstance();
        int i = z ? calendar.get(5) + 1 : calendar.get(5);
        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US).parse(calendar.get(1) + '-' + (calendar.get(2) + 1) + '-' + i + ' ' + str);
        return (parse != null ? Long.valueOf(parse.getTime()) : null).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        btt bttVar;
        int i;
        List<String> d;
        long millis;
        Object obj;
        if (continuationImpl instanceof btt) {
            bttVar = (btt) continuationImpl;
            int i2 = bttVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bttVar.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bttVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bttVar.label;
                Long l = null;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    bttVar.label = 1;
                    obj2 = myc0.k(hqu0.b(), new f3w0(this.a, null), bttVar);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj2);
                }
                d = ((HealthCommonVkstartWidgetSyncBackgroundConfigDto) obj2).d();
                if (d != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : d) {
                        if (!drm0.N((String) obj3)) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Long.valueOf(b((String) it.next(), false)));
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it2.next();
                                if (((Number) obj).longValue() > System.currentTimeMillis()) {
                                    break;
                                }
                            }
                            Long l2 = (Long) obj;
                            if (l2 == null) {
                                l2 = Long.valueOf(b((String) j5g.Y(arrayList), true));
                            }
                            long longValue = l2.longValue() - currentTimeMillis;
                            xgx0.a.getClass();
                            xgx0.a("VkWorkoutWidgetGetNextWidgetUpdateDelayUseCase.getDelayFromSchedule() -> schedule: " + arrayList + ", delay: " + longValue);
                            l = Long.valueOf(longValue);
                        } catch (Exception e) {
                            xgx0.a.getClass();
                            xgx0.c("VkWorkoutWidgetGetNextWidgetUpdateDelayUseCase.getDelayFromSchedule() ->", e);
                        }
                        if (l != null) {
                            millis = l.longValue();
                            return new Long(millis);
                        }
                    }
                }
                Duration ofMinutes = Duration.ofMinutes(240L);
                Duration ofMinutes2 = Duration.ofMinutes(15L);
                Random.Default r1 = Random.b;
                long j = -ofMinutes2.toMillis();
                long millis2 = ofMinutes2.toMillis();
                r1.getClass();
                millis = ofMinutes.plus(Duration.ofMillis(Random.c.o(j, millis2))).toMillis();
                xgx0.a.getClass();
                xgx0.a("VkWorkoutWidgetGetNextWidgetUpdateDelayUseCase.getDelayLocally() -> delay: " + millis);
                return new Long(millis);
            }
        }
        bttVar = new btt(this, continuationImpl);
        Object obj22 = bttVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bttVar.label;
        Long l3 = null;
        if (i != 0) {
        }
        d = ((HealthCommonVkstartWidgetSyncBackgroundConfigDto) obj22).d();
        if (d != null) {
        }
        Duration ofMinutes3 = Duration.ofMinutes(240L);
        Duration ofMinutes22 = Duration.ofMinutes(15L);
        Random.Default r12 = Random.b;
        long j2 = -ofMinutes22.toMillis();
        long millis22 = ofMinutes22.toMillis();
        r12.getClass();
        millis = ofMinutes3.plus(Duration.ofMillis(Random.c.o(j2, millis22))).toMillis();
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetGetNextWidgetUpdateDelayUseCase.getDelayLocally() -> delay: " + millis);
        return new Long(millis);
    }
}
