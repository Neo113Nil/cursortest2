package sg.bigo.ads.dd;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.bh.c;
import xsna.h5s;

/* loaded from: classes9.dex */
public final class a {
    private static ExecutorService b = Executors.newFixedThreadPool(1, new c("Stat-Worker"));
    public static Handler a = new Handler(h5s.a("BGAd-Stat-Handler").getLooper());

    /* renamed from: sg.bigo.ads.dd.a$a, reason: collision with other inner class name */
    public static class C2477a extends b {
        private Future c;

        public C2477a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.dd.a.b
        public final void a() {
            Runnable runnable = this.a;
            if (runnable != null) {
                this.c = a.a(runnable);
            }
        }
    }

    public static abstract class b implements Runnable {
        final Runnable a;
        final AtomicBoolean b = new AtomicBoolean(false);

        public b(Runnable runnable) {
            this.a = runnable;
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.get()) {
                return;
            }
            a();
        }
    }

    public static Future a(final Runnable runnable) {
        return b.submit(new Runnable() { // from class: sg.bigo.ads.dd.a.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb;
                try {
                    runnable.run();
                } catch (Exception e) {
                    e = e;
                    sb = new StringBuilder("stat thread get exception:");
                    sb.append(e.getLocalizedMessage());
                    sg.bigo.ads.bn.a.a(0, "Stats", sb.toString());
                } catch (Throwable th) {
                    e = th;
                    sb = new StringBuilder("stat thread get throwable:");
                    sb.append(e.getLocalizedMessage());
                    sg.bigo.ads.bn.a.a(0, "Stats", sb.toString());
                }
            }
        });
    }

    public static b a(Runnable runnable, long j) {
        C2477a c2477a = new C2477a(runnable);
        a.postDelayed(c2477a, j);
        return c2477a;
    }

    public static void a(b bVar) {
        Future future;
        if (bVar != null) {
            bVar.b.set(true);
            if (bVar instanceof C2477a) {
                C2477a c2477a = (C2477a) bVar;
                if (c2477a.c != null && (future = c2477a.c) != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                }
            }
            a.removeCallbacks(bVar);
        }
    }
}
