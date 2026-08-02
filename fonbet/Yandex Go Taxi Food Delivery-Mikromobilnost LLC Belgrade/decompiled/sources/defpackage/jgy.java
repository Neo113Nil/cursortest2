package defpackage;

import com.yandex.mapkit.transport.masstransit.LineAtStop;
import com.yandex.mapkit.transport.masstransit.Periodical;
import com.yandex.mapkit.transport.masstransit.Schedule;
import com.yandex.mapkit.transport.masstransit.Scheduled;
import com.yandex.mapkit.transport.masstransit.ThreadAtStop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public abstract class jgy {
    public static final Periodical a(LineAtStop lineAtStop) {
        ArrayList b = b(lineAtStop);
        ArrayList arrayList = new ArrayList(tcc.n(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(((Schedule.ScheduleEntry) it.next()).getPeriodical());
        }
        return (Periodical) a.R(arrayList);
    }

    public static final ArrayList b(LineAtStop lineAtStop) {
        List<ThreadAtStop> threadsAtStop = lineAtStop.getThreadsAtStop();
        ArrayList arrayList = new ArrayList(tcc.n(threadsAtStop, 10));
        Iterator<T> it = threadsAtStop.iterator();
        while (it.hasNext()) {
            arrayList.add(((ThreadAtStop) it.next()).getSchedule());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ycc.r(((Schedule) it2.next()).getScheduleEntries(), arrayList2);
        }
        return arrayList2;
    }

    public static final Scheduled c(LineAtStop lineAtStop) {
        ArrayList b = b(lineAtStop);
        ArrayList arrayList = new ArrayList(tcc.n(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(((Schedule.ScheduleEntry) it.next()).getScheduled());
        }
        return (Scheduled) a.R(arrayList);
    }

    public static final String d(wy30 wy30Var) {
        if (wy30Var instanceof ty30) {
            return ((ty30) wy30Var).d;
        }
        if (wy30Var instanceof sy30) {
            return ((sy30) wy30Var).e;
        }
        if ((wy30Var instanceof uy30) || (wy30Var instanceof vy30)) {
            return "";
        }
        w511.b();
        return null;
    }
}
