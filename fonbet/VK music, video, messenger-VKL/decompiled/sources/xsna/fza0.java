package xsna;

import android.os.SystemClock;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.concurrent.TimeUnit;

/* compiled from: PlaybackTimings.kt */
/* loaded from: classes3.dex */
public final class fza0 {
    public long a = 1000;
    public long b = Long.MAX_VALUE;
    public final long[] c;
    public int d;
    public final TimeUnit e;

    public fza0() {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            jArr[i] = Long.MAX_VALUE;
        }
        this.c = jArr;
        this.e = TimeUnit.MILLISECONDS;
    }

    public final synchronized void a(long j) {
        try {
            if (this.b == Long.MAX_VALUE) {
                this.b = this.e.toMillis(SystemClock.elapsedRealtime()) - j;
            }
            if (this.d != -1 && this.a <= j) {
                long millis = this.e.toMillis(SystemClock.elapsedRealtime());
                long[] jArr = this.c;
                int i = this.d;
                jArr[i] = millis - j;
                this.d = i < jArr.length + (-1) ? i + 1 : -1;
                this.a = j + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
