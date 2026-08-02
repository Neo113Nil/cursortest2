package xsna;

import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AudienceResearchInMemoryLocalRepository.kt */
/* loaded from: classes.dex */
public final class ha4 {
    public final AtomicLong a = new AtomicLong(1);
    public final ConcurrentHashMap<Long, x94> b = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, x94> c = new ConcurrentHashMap<>();
    public final io.reactivex.rxjava3.processors.c<x94> d = new io.reactivex.rxjava3.processors.c<>();

    public final io.reactivex.rxjava3.core.a a() {
        if (this.b.isEmpty()) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        return io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.z94
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                ha4 ha4Var = ha4.this;
                Iterator<Map.Entry<Long, x94>> it = ha4Var.b.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Long, x94> next = it.next();
                    if (next.getValue().b() < elapsedRealtime || next.getValue().a() >= 0) {
                        it.remove();
                        ha4Var.c.remove(next.getValue().d());
                    }
                }
            }
        });
    }

    public final io.reactivex.rxjava3.internal.operators.completable.l b(long j) {
        return io.reactivex.rxjava3.core.a.l(new fa4(this, j, 0));
    }
}
