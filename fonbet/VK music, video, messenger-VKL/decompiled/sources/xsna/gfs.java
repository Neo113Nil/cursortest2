package xsna;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* compiled from: FrameFreezeTracker.kt */
/* loaded from: classes3.dex */
public final class gfs {
    public static final long j = TimeUnit.SECONDS.toMillis(1) / 25;
    public final Choreographer a;
    public final ffs b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long g;
    public boolean h;
    public final a i = new a();

    /* compiled from: FrameFreezeTracker.kt */
    public static final class a implements Choreographer.FrameCallback {
        public a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            gfs gfsVar = gfs.this;
            long j2 = gfsVar.d;
            if (j2 == 0) {
                gfsVar.d = j;
            } else {
                long j3 = (j - j2) / 1000000;
                if (j3 > gfs.j) {
                    gfsVar.g += j3;
                    gfsVar.f++;
                }
                gfsVar.e++;
                gfsVar.d = j;
            }
            if (gfsVar.h) {
                gfsVar.a.postFrameCallback(this);
            }
        }
    }

    public gfs(Choreographer choreographer, ffs ffsVar) {
        this.a = choreographer;
        this.b = ffsVar;
    }

    public final void a() {
        this.c = 0L;
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.g = 0L;
        this.h = true;
        this.c = SystemClock.uptimeMillis();
        this.a.postFrameCallback(this.i);
    }

    public final void b() {
        this.h = false;
        long uptimeMillis = SystemClock.uptimeMillis() - this.c;
        this.a.removeFrameCallback(this.i);
        int i = this.e + 1;
        long j2 = this.g;
        this.b.a(i, this.f, uptimeMillis, j2);
        this.c = 0L;
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.g = 0L;
        this.h = false;
    }
}
