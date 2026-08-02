package xsna;

import com.vk.metrics.eventtracking.Event;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: LongPollLiveReporterImpl.kt */
/* loaded from: classes5.dex */
public final class n400 implements m400 {
    public static final n400 a = new n400();
    public static final Set<Class<? extends e900>> b = rl3.y0(new Class[]{fxf.class, mxf.class, sxf.class});
    public static long c;
    public static long d;

    @Override // xsna.m400
    public final void a() {
        c = System.currentTimeMillis();
    }

    @Override // xsna.m400
    public final void b(List<? extends e900> list) {
        d = System.currentTimeMillis();
        List<? extends e900> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (b.contains(((e900) it.next()).getClass())) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a b2 = h5s.b("vkm_long_poll_processed");
                b2.b("time", Long.valueOf(d - c));
                b2.i("StatlogTracker");
                bVar.k(b2.e());
                return;
            }
        }
    }
}
