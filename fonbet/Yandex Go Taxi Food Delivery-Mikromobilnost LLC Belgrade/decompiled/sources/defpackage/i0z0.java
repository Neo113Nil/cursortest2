package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.squareup.wire.internal.MathMethodsKt;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public final class i0z0 {
    public long b;
    public final ReentrantLock e;
    public final Condition f;
    public long a = System.nanoTime();
    public long c = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
    public long d = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    public i0z0() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.e = reentrantLock;
        this.f = reentrantLock.newCondition();
    }

    public final long a(long j, long j2) {
        if (this.b == 0) {
            return j2;
        }
        long max = Math.max(this.a - j, 0L);
        long j3 = this.d;
        long j4 = this.b;
        long j5 = j3 - ((max * j4) / MathMethodsKt.NANOS_PER_SECOND);
        if (j5 >= j2) {
            this.a = ((j2 * MathMethodsKt.NANOS_PER_SECOND) / j4) + j + max;
            return j2;
        }
        long j6 = this.c;
        if (j5 >= j6) {
            this.a = ((j3 * MathMethodsKt.NANOS_PER_SECOND) / j4) + j;
            return j5;
        }
        long min = Math.min(j6, j2);
        long j7 = this.d;
        long j8 = (min - j7) * MathMethodsKt.NANOS_PER_SECOND;
        long j9 = this.b;
        long j10 = (j8 / j9) + max;
        if (j10 != 0) {
            return -j10;
        }
        this.a = ((j7 * MathMethodsKt.NANOS_PER_SECOND) / j9) + j;
        return min;
    }
}
