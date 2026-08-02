package xsna;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import xsna.kh;

/* compiled from: DelegatingScheduledFuture.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes13.dex */
public final class hul<V> extends kh<V> implements ScheduledFuture<V> {
    public final ScheduledFuture<?> i;

    /* compiled from: DelegatingScheduledFuture.java */
    public class a {
        public a() {
        }

        public final void a(V v) {
            hul.this.j(v);
        }

        public final void b(Exception exc) {
            hul.this.k(exc);
        }
    }

    /* compiled from: DelegatingScheduledFuture.java */
    public interface b<T> {
        ScheduledFuture a(a aVar);
    }

    public hul(b<V> bVar) {
        this.i = bVar.a(new a());
    }

    @Override // xsna.kh
    public final void c() {
        ScheduledFuture<?> scheduledFuture = this.i;
        Object obj = this.b;
        scheduledFuture.cancel((obj instanceof kh.b) && ((kh.b) obj).a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.i.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.i.getDelay(timeUnit);
    }
}
