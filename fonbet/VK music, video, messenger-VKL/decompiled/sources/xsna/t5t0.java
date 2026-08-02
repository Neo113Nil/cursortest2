package xsna;

import android.annotation.SuppressLint;
import com.vk.libvideo.storage.CachedVideoPosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* compiled from: VideoPositionStorage.kt */
@SuppressLint({"CheckResult"})
/* loaded from: classes.dex */
public final class t5t0 {
    public static final bpn0 e = new bpn0(new r63(15));
    public static final long f = System.currentTimeMillis() - 2592000000L;
    public ScheduledFuture<?> a;
    public final eaj b = new eaj(this, 2);
    public final ConcurrentHashMap<String, Pair<Long, Long>> c = new ConcurrentHashMap<>();
    public final io.reactivex.rxjava3.subjects.d<Boolean> d = io.reactivex.rxjava3.subjects.d.N0();

    /* compiled from: VideoPositionStorage.kt */
    public static final class a {
        public static t5t0 a() {
            return (t5t0) t5t0.e.getValue();
        }
    }

    public t5t0() {
        wmi0.a.f("video_position", io.reactivex.rxjava3.schedulers.a.b()).subscribe(new gaj(new faj(this, 3), 1), new iaj(new i45(this, 2), 1));
    }

    public final void a() {
        wmi0 wmi0Var = wmi0.a;
        Set<Map.Entry<String, Pair<Long, Long>>> entrySet = this.c.entrySet();
        ArrayList arrayList = new ArrayList(c5g.u(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new CachedVideoPosition((String) entry.getKey(), ((Number) ((Pair) entry.getValue()).i()).longValue(), ((Number) ((Pair) entry.getValue()).j()).longValue()));
        }
        wmi0Var.m("video_position", arrayList);
    }

    public final void b(long j, String str) {
        this.c.put(str, new Pair<>(Long.valueOf(j), Long.valueOf(System.currentTimeMillis())));
        ScheduledFuture<?> scheduledFuture = this.a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        asu0.a.getClass();
        this.a = asu0.o().schedule(this.b, 1000L, TimeUnit.MILLISECONDS);
    }
}
