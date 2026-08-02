package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.audio.c;

/* loaded from: classes10.dex */
public final class i6h {
    public Exception a;
    public long b = -9223372036854775807L;
    public long c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
        }
        if (this.b == -9223372036854775807L) {
            synchronized (c.k0) {
                z = c.m0 > 0;
            }
            if (!z) {
                this.b = 200 + elapsedRealtime;
            }
        }
        long j = this.b;
        if (j == -9223372036854775807L || elapsedRealtime < j) {
            this.c = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.a;
        this.a = null;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
        throw exc3;
    }
}
