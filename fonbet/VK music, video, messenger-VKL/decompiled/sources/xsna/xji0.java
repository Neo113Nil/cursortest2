package xsna;

import android.content.Context;
import com.vk.libdelayedjobs.WorkPolicy;
import com.vk.superapp.vkworkout.di.VkWorkoutComponent;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.random.Random;

/* compiled from: SendWorkoutsDelayedJob.kt */
/* loaded from: classes6.dex */
public final class xji0 extends tsl implements w8i {
    public static final a e = new a();
    public final VkWorkoutComponent c;
    public final String d;

    /* compiled from: SendWorkoutsDelayedJob.kt */
    public static final class a {
        public final String a() {
            return "xji0";
        }

        public final void b(String str) {
            Long l;
            Object obj;
            Object failure;
            xgx0.a.getClass();
            xgx0.a("SendWorkoutsDelayedJob.setupSyncJob() -> schedule: " + str + ' ');
            DateTimeFormatter dateTimeFormatter = lzx0.a;
            List c0 = drm0.c0(str, new String[]{";"}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = c0.iterator();
            while (true) {
                l = null;
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                try {
                    failure = LocalTime.parse((String) it.next(), lzx0.a);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    xgx0 xgx0Var = xgx0.a;
                    String concat = "WorkoutsSyncHelper.parseTimes() -> Invalid time format: ".concat(str);
                    xgx0Var.getClass();
                    xgx0.c(concat, a);
                }
                LocalTime localTime = (LocalTime) (failure instanceof Result.Failure ? null : failure);
                if (localTime != null) {
                    arrayList.add(localTime);
                }
            }
            if (!arrayList.isEmpty()) {
                LocalDateTime now = LocalDateTime.now();
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(LocalDateTime.of(now.toLocalDate(), (LocalTime) it2.next()));
                }
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (((LocalDateTime) next).isAfter(now)) {
                        obj = next;
                        break;
                    }
                }
                LocalDateTime localDateTime = (LocalDateTime) obj;
                if (localDateTime == null) {
                    localDateTime = LocalDateTime.of(LocalDate.now().plusDays(1L), (LocalTime) j5g.Y(arrayList));
                }
                long millis = Duration.between(LocalDateTime.now(), localDateTime).toMillis();
                Random.Default r2 = Random.b;
                long j = lzx0.b;
                r2.getClass();
                long o = Random.c.o(-j, j) + millis;
                if (o < 0) {
                    o = 0;
                }
                l = Long.valueOf(o);
            }
            if (l != null) {
                wsl b = uh.b.b();
                fyx fyxVar = new fyx();
                fyxVar.a.put("KEY_SCHEDULE", str);
                s3q0 s3q0Var = s3q0.a;
                ((xsl) b).a("xji0", new xji0(fyxVar), new usl(WorkPolicy.REPLACE, l.longValue(), 248));
            }
        }
    }

    public xji0(fyx fyxVar) {
        super(fyxVar);
        this.c = (VkWorkoutComponent) ((k7m) m7m.f(this)).a(fpf0.a(VkWorkoutComponent.class));
        this.d = fyxVar.a.getString("KEY_SCHEDULE");
    }

    @Override // xsna.tsl
    public final void a(Context context) {
        this.c.Te().b(context, new l22(29, this, context));
        e.b(this.d);
    }
}
