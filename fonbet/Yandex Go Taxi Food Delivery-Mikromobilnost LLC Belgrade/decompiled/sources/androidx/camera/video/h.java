package androidx.camera.video;

import android.os.Build;
import androidx.camera.video.g;
import defpackage.b84;
import defpackage.c29;
import defpackage.d6z;
import defpackage.fii0;
import defpackage.ny61;
import defpackage.r0r;
import defpackage.r501;
import defpackage.sgb1;
import defpackage.y4c;
import defpackage.z4c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class h implements AutoCloseable {
    public final AtomicBoolean a;
    public final g b;
    public final long c;
    public final r0r w;
    public final c29 x;

    public h(g gVar, long j, r0r r0rVar, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a = atomicBoolean;
        c29 c29Var = Build.VERSION.SDK_INT >= 30 ? new c29(24, new y4c()) : new c29(24, new r501(13));
        this.x = c29Var;
        this.b = gVar;
        this.c = j;
        this.w = r0rVar;
        if (z) {
            atomicBoolean.set(true);
        } else {
            ((z4c) c29Var.b).c("stop");
        }
    }

    public final void a() {
        if (this.a.get()) {
            ny61.r("The recording has been stopped.");
            return;
        }
        g gVar = this.b;
        synchronized (gVar.h) {
            try {
                if (!g.p(this, gVar.p) && !g.p(this, gVar.o)) {
                    Objects.toString(this.w);
                    sgb1.g(3, "Recorder");
                    return;
                }
                int ordinal = gVar.l.ordinal();
                if (ordinal != 0) {
                    int i = 1;
                    if (ordinal == 1) {
                        gVar.C(Recorder$State.PENDING_PAUSED);
                    } else if (ordinal != 3) {
                        if (ordinal == 4) {
                            gVar.C(Recorder$State.PAUSED);
                            gVar.d.execute(new fii0(gVar, gVar.o, i));
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Called pause() from invalid state: " + gVar.l);
            } finally {
            }
        }
    }

    public final void c() {
        if (this.a.get()) {
            ny61.r("The recording has been stopped.");
            return;
        }
        g gVar = this.b;
        synchronized (gVar.h) {
            try {
                if (!g.p(this, gVar.p) && !g.p(this, gVar.o)) {
                    Objects.toString(this.w);
                    sgb1.g(3, "Recorder");
                    return;
                }
                int ordinal = gVar.l.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 5) {
                        gVar.C(Recorder$State.RECORDING);
                        gVar.d.execute(new fii0(gVar, gVar.o, 0));
                    } else if (ordinal == 2) {
                        gVar.C(Recorder$State.PENDING_RECORDING);
                    } else if (ordinal != 3) {
                    }
                    return;
                }
                throw new IllegalStateException("Called resume() from invalid state: " + gVar.l);
            } finally {
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        d(0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, RuntimeException runtimeException) {
        final int i2;
        final RuntimeException runtimeException2;
        ((z4c) this.x.b).close();
        if (this.a.getAndSet(true)) {
            return;
        }
        final g gVar = this.b;
        synchronized (gVar.h) {
            try {
                if (!g.p(this, gVar.p) && !g.p(this, gVar.o)) {
                    Objects.toString(this.w);
                    sgb1.g(3, "Recorder");
                    return;
                }
                b84 b84Var = null;
                switch (gVar.l.ordinal()) {
                    case 0:
                    case 3:
                        throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                    case 1:
                    case 2:
                        i2 = i;
                        runtimeException2 = runtimeException;
                        d6z.y(null, g.p(this, gVar.p));
                        b84 b84Var2 = gVar.p;
                        gVar.p = null;
                        gVar.y();
                        b84Var = b84Var2;
                        if (b84Var != null) {
                            if (i2 == 10) {
                                sgb1.d("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                            }
                            gVar.j(b84Var, 8, new RuntimeException("Recording was stopped before any data could be produced.", runtimeException2));
                            return;
                        }
                        return;
                    case 4:
                    case 5:
                        gVar.C(Recorder$State.STOPPING);
                        final long nanoTime = System.nanoTime() / 1000;
                        final b84 b84Var3 = gVar.o;
                        i2 = i;
                        runtimeException2 = runtimeException;
                        gVar.d.execute(new Runnable() { // from class: iii0
                            @Override // java.lang.Runnable
                            public final void run() {
                                g.this.H(b84Var3, nanoTime, i2, runtimeException2);
                            }
                        });
                        if (b84Var != null) {
                        }
                        break;
                    case 6:
                    case 7:
                        d6z.y(null, g.p(this, gVar.o));
                    default:
                        i2 = i;
                        runtimeException2 = runtimeException;
                        if (b84Var != null) {
                        }
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() {
        try {
            ((z4c) this.x.b).e();
            d(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
