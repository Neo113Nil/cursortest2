package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;

/* compiled from: Dispatchers.kt */
/* loaded from: classes11.dex */
public final class adn {
    public static final bpn0 a = new bpn0(c.i);
    public static final bpn0 b = new bpn0(d.i);
    public static final bpn0 c = new bpn0(b.i);
    public static final bpn0 d = new bpn0(a.i);

    /* compiled from: Dispatchers.kt */
    public static final class a extends Lambda implements gzs<ycn> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final ycn invoke() {
            return new ycn();
        }
    }

    /* compiled from: Dispatchers.kt */
    public static final class b extends Lambda implements gzs<zcn> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final zcn invoke() {
            return new zcn(new Handler(Looper.getMainLooper()));
        }
    }

    /* compiled from: Dispatchers.kt */
    public static final class c extends Lambda implements gzs<ScheduledThreadPoolExecutor> {
        public static final c i = new c(0);

        @Override // xsna.gzs
        public final ScheduledThreadPoolExecutor invoke() {
            return new ScheduledThreadPoolExecutor(1);
        }
    }

    /* compiled from: Dispatchers.kt */
    public static final class d extends Lambda implements gzs<ThreadPoolExecutor> {
        public static final d i = new d(0);

        @Override // xsna.gzs
        public final ThreadPoolExecutor invoke() {
            return new ThreadPoolExecutor(3, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue());
        }
    }

    static {
        int i = sip0.a;
    }

    public static pcn a() {
        synchronized (cdn.b) {
        }
        return (pcn) d.getValue();
    }
}
