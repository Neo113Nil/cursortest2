package xsna;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.m0d0;

/* compiled from: Prefetchers.kt */
/* loaded from: classes12.dex */
public final class svv extends m0d0 {
    public final sio e;
    public final long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svv() {
        super(xvv.a);
        sio sioVar = sio.a;
        this.e = sioVar;
        this.f = (long) (TimeUnit.SECONDS.toNanos(1L) / 60.0d);
    }

    @Override // xsna.m0d0
    public final void b() {
        this.e.getClass();
        sio.c.postFrameCallback(sio.d);
    }

    @Override // xsna.m0d0
    public final void c() {
        this.e.getClass();
        sio.c.removeFrameCallback(sio.d);
    }

    @Override // xsna.m0d0
    public final long d(PriorityBlockingQueue priorityBlockingQueue) {
        sio sioVar = this.e;
        sioVar.getClass();
        long j = sio.b;
        long j2 = this.f;
        if (j == 0) {
            return j2;
        }
        if (e() < j2 / 2) {
            return e();
        }
        Object poll = priorityBlockingQueue.poll();
        while (poll != null) {
            j0d0 j0d0Var = (j0d0) poll;
            int i = j0d0Var.c;
            m0d0.a aVar = j0d0Var.b;
            if (aVar.a(j0d0Var)) {
                int i2 = j0d0Var.c;
                sioVar.getClass();
                long nanoTime = System.nanoTime();
                sioVar.getClass();
                if (aVar.c(i2, nanoTime, sio.b + j2)) {
                    sioVar.getClass();
                    long nanoTime2 = System.nanoTime();
                    aVar.i(aVar.b(i));
                    sioVar.getClass();
                    long nanoTime3 = System.nanoTime() - nanoTime2;
                    aVar.g(i, nanoTime3);
                    aVar.e(j0d0Var, efz.b(nanoTime3 / 1000000, UcumUtils.UCUM_MILLISECODS, new StringBuilder("create ")));
                    return e() + j2;
                }
                aVar.e(j0d0Var, efz.b(e() / 1000000, "ms, skip", new StringBuilder("will not create in time, ")));
                poll = priorityBlockingQueue.poll();
            } else {
                aVar.e(j0d0Var, "ignore");
                poll = priorityBlockingQueue.poll();
            }
        }
        return e();
    }

    public final long e() {
        sio sioVar = this.e;
        sioVar.getClass();
        long nanoTime = System.nanoTime();
        sioVar.getClass();
        return Math.max(this.f - (nanoTime - sio.b), 0L);
    }
}
