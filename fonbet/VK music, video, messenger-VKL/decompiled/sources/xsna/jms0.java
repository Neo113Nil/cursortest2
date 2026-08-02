package xsna;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: VideoFrameProcessingTaskExecutor.java */
/* loaded from: classes12.dex */
public final class jms0 {
    public final boolean a;
    public final ExecutorService b;
    public final Future<Thread> c;
    public final a d;
    public final Object e = new Object();
    public final ArrayDeque f = new ArrayDeque();
    public boolean g;

    /* compiled from: VideoFrameProcessingTaskExecutor.java */
    public interface a {
        void a(VideoFrameProcessingException videoFrameProcessingException);
    }

    /* compiled from: VideoFrameProcessingTaskExecutor.java */
    public interface b {
        void run() throws VideoFrameProcessingException, GlUtil.GlException;
    }

    public jms0(ExecutorService executorService, boolean z, a aVar) {
        this.b = executorService;
        this.c = executorService.submit(new aef(2));
        this.a = z;
        this.d = aVar;
    }

    public final void a() throws InterruptedException {
        synchronized (this.e) {
            this.g = true;
            this.f.clear();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.b.submit(new hms0(this, false, new uql(1, this, countDownLatch)));
        countDownLatch.await();
    }

    public final void b(Exception exc) {
        synchronized (this.e) {
            try {
                if (this.g) {
                    return;
                }
                this.g = true;
                this.d.a(VideoFrameProcessingException.a(C.TIME_UNSET, exc));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(b bVar) throws InterruptedException {
        if (d()) {
            try {
                bVar.run();
                return;
            } catch (Exception e) {
                b(e);
                return;
            }
        }
        try {
            this.b.submit(new e50(9, this, bVar)).get(500L, TimeUnit.MILLISECONDS);
        } catch (RuntimeException | ExecutionException | TimeoutException e2) {
            b(e2);
        }
    }

    public final boolean d() throws InterruptedException {
        try {
            return Thread.currentThread() == this.c.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            b(e2);
            return false;
        }
    }

    public final void e(b bVar) throws InterruptedException {
        fxc0.z(!d());
        synchronized (this.e) {
            this.g = true;
            this.f.clear();
        }
        this.b.submit(new hms0(this, false, bVar));
        if (this.a) {
            this.b.shutdown();
            if (this.b.awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.d.a(new VideoFrameProcessingException("Release timed out. OpenGL resources may not be cleaned up properly."));
        }
    }

    public final void f(b bVar, boolean z) {
        synchronized (this.e) {
            if (this.g && z) {
                return;
            }
            try {
                this.b.submit(new hms0(this, z, bVar));
                e = null;
            } catch (RejectedExecutionException e) {
                e = e;
            }
            if (e != null) {
                b(e);
            }
        }
    }

    public final void g(b bVar) {
        synchronized (this.e) {
            try {
                if (this.g) {
                    return;
                }
                this.f.add(bVar);
                f(new ims0(), true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        try {
            fxc0.z(d());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            b(e);
        }
    }
}
