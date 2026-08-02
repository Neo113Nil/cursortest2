package sg.bigo.ads.ct;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.bh.c;
import xsna.h5s;

/* loaded from: classes9.dex */
public final class b {
    private static final ExecutorService b = Executors.newFixedThreadPool(1, new c("Callback-Worker"));
    public static Handler a = new Handler(h5s.a("BGAd-Callback-Handler").getLooper());

    public static class a extends AbstractRunnableC2471b {
        private Future c;

        public a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.ct.b.AbstractRunnableC2471b
        public final void a() {
            Runnable runnable = this.a;
            if (runnable != null) {
                this.c = b.a(runnable);
            }
        }
    }

    /* renamed from: sg.bigo.ads.ct.b$b, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC2471b implements Runnable {
        final Runnable a;
        final AtomicBoolean b = new AtomicBoolean(false);

        public AbstractRunnableC2471b(Runnable runnable) {
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

    public static Future<?> a(final Runnable runnable) {
        return b.submit(new Runnable() { // from class: sg.bigo.ads.ct.b.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb;
                try {
                    runnable.run();
                } catch (Exception e) {
                    e = e;
                    sb = new StringBuilder("callback thread get exception:");
                    sb.append(e.getLocalizedMessage());
                    sg.bigo.ads.ct.a.a(sb.toString());
                } catch (Throwable th) {
                    e = th;
                    sb = new StringBuilder("callback thread get throwable:");
                    sb.append(e.getLocalizedMessage());
                    sg.bigo.ads.ct.a.a(sb.toString());
                }
            }
        });
    }

    public static AbstractRunnableC2471b a(Runnable runnable, long j) {
        a aVar = new a(runnable);
        a.postDelayed(aVar, j);
        return aVar;
    }

    public static void a(AbstractRunnableC2471b abstractRunnableC2471b) {
        Future future;
        if (abstractRunnableC2471b != null) {
            abstractRunnableC2471b.b.set(true);
            if (abstractRunnableC2471b instanceof a) {
                a aVar = (a) abstractRunnableC2471b;
                if (aVar.c != null && (future = aVar.c) != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                }
            }
            a.removeCallbacks(abstractRunnableC2471b);
        }
    }
}
