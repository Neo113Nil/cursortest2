package defpackage;

import androidx.camera.core.impl.utils.executor.b;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class hq6 implements ih3 {
    public final int A;
    public final int B;
    public final int C;
    public final AtomicBoolean D;
    public int E;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final b w;
    public final Object x;
    public gq6 y;
    public final jh3 z;

    public hq6(jh3 jh3Var, m34 m34Var) {
        pf3 pf3Var;
        if (pf3.b != null) {
            pf3Var = pf3.b;
        } else {
            synchronized (pf3.class) {
                try {
                    if (pf3.b == null) {
                        pf3.b = new pf3();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pf3Var = pf3.b;
        }
        this.w = new b(pf3Var);
        this.x = new Object();
        this.y = null;
        this.D = new AtomicBoolean(false);
        this.z = jh3Var;
        int a = m34Var.a();
        this.A = a;
        int i = m34Var.b;
        this.B = i;
        d6z.m("mBytesPerFrame must be greater than 0.", ((long) a) > 0);
        d6z.m("mSampleRate must be greater than 0.", ((long) i) > 0);
        this.C = 500;
        this.E = a * 1024;
    }

    public final void a() {
        d6z.y("AudioStream has been released.", !this.b.get());
    }

    public final void b() {
        if (this.D.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.E);
            gq6 gq6Var = new gq6(allocateDirect, this.z.read(allocateDirect), this.A, this.B);
            int i = this.C;
            synchronized (this.x) {
                try {
                    this.c.offer(gq6Var);
                    while (this.c.size() > i) {
                        this.c.poll();
                        sgb1.g(5, "BufferedAudioStream");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.D.get()) {
                this.w.execute(new fq6(this, 2));
            }
        }
    }

    public final void c() {
        a();
        AtomicBoolean atomicBoolean = this.a;
        int i = 1;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new fq6(this, i), null);
        this.w.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            atomicBoolean.set(false);
            throw new AudioStream$AudioStreamException(e);
        }
    }

    @Override // defpackage.ih3
    public final p34 read(ByteBuffer byteBuffer) {
        boolean z;
        a();
        d6z.y("AudioStream has not been started.", this.a.get());
        this.w.execute(new xm2(this, byteBuffer.remaining(), 1));
        p34 p34Var = new p34(0, 0L);
        do {
            synchronized (this.x) {
                try {
                    gq6 gq6Var = this.y;
                    this.y = null;
                    if (gq6Var == null) {
                        gq6Var = (gq6) this.c.poll();
                    }
                    if (gq6Var != null) {
                        p34Var = gq6Var.a(byteBuffer);
                        if (gq6Var.c.remaining() > 0) {
                            this.y = gq6Var;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = p34Var.a <= 0 && this.a.get() && !this.b.get();
            if (z) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                    sgb1.g(5, "BufferedAudioStream");
                    return p34Var;
                }
            }
        } while (z);
        return p34Var;
    }
}
