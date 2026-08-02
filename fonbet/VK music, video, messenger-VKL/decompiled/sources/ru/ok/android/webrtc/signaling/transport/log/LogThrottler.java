package ru.ok.android.webrtc.signaling.transport.log;

import android.os.Handler;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.bh10;
import xsna.efz;
import xsna.izs;
import xsna.jr;
import xsna.myy0;
import xsna.s3q0;
import xsna.tj0;
import xsna.zz9;

/* loaded from: classes9.dex */
public final class LogThrottler {
    public final TimeProvider a;
    public final izs b;
    public final myy0 c;
    public long d;
    public long e;
    public int f;
    public long g;
    public long h;

    public static final class ThrottleInfo {
        public final int a;
        public final long b;
        public final long c;
        public final long d;

        public ThrottleInfo(int i, long j, long j2, long j3) {
            this.a = i;
            this.b = j;
            this.c = j2;
            this.d = j3;
        }

        public static /* synthetic */ ThrottleInfo copy$default(ThrottleInfo throttleInfo, int i, long j, long j2, long j3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = throttleInfo.a;
            }
            if ((i2 & 2) != 0) {
                j = throttleInfo.b;
            }
            if ((i2 & 4) != 0) {
                j2 = throttleInfo.c;
            }
            if ((i2 & 8) != 0) {
                j3 = throttleInfo.d;
            }
            long j4 = j3;
            return throttleInfo.copy(i, j, j2, j4);
        }

        public final int component1() {
            return this.a;
        }

        public final long component2() {
            return this.b;
        }

        public final long component3() {
            return this.c;
        }

        public final long component4() {
            return this.d;
        }

        public final ThrottleInfo copy(int i, long j, long j2, long j3) {
            return new ThrottleInfo(i, j, j2, j3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThrottleInfo)) {
                return false;
            }
            ThrottleInfo throttleInfo = (ThrottleInfo) obj;
            return this.a == throttleInfo.a && this.b == throttleInfo.b && this.c == throttleInfo.c && this.d == throttleInfo.d;
        }

        public final int getCount() {
            return this.a;
        }

        public final long getIntervalMaxMs() {
            return this.d;
        }

        public final long getIntervalMinMs() {
            return this.c;
        }

        public final long getTotalIntervalMs() {
            return this.b;
        }

        public int hashCode() {
            return Long.hashCode(this.d) + bh10.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public String toString() {
            int i = this.a;
            long j = this.b;
            long j2 = this.c;
            long j3 = this.d;
            StringBuilder b = jr.b(i, "ThrottleInfo(count=", ", totalIntervalMs=", j);
            tj0.d(b, ", intervalMinMs=", j2, ", intervalMaxMs=");
            return efz.b(j3, ")", b);
        }
    }

    public LogThrottler(Handler handler, TimeProvider timeProvider, izs<? super ThrottleInfo, s3q0> izsVar) {
        myy0 myy0Var;
        this.a = timeProvider;
        this.b = izsVar;
        if (handler != null) {
            Object obj = new Object();
            myy0Var = new myy0(handler, obj, new zz9(2, obj, this));
        } else {
            myy0Var = null;
        }
        this.c = myy0Var;
    }

    public static final void a(Object obj, LogThrottler logThrottler) {
        synchronized (obj) {
            try {
                long msSinceBoot = logThrottler.a.getMsSinceBoot();
                if (logThrottler.e + ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS < msSinceBoot) {
                    long j = msSinceBoot - logThrottler.d;
                    logThrottler.d = msSinceBoot;
                    logThrottler.b.invoke(new ThrottleInfo(logThrottler.f, j, logThrottler.g, logThrottler.h));
                    logThrottler.f = 0;
                    logThrottler.g = Long.MAX_VALUE;
                    logThrottler.h = Long.MIN_VALUE;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onEvent() {
        myy0 myy0Var = this.c;
        if (myy0Var == null) {
            a();
            return;
        }
        synchronized (myy0Var.b) {
            a();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void a() {
        myy0 myy0Var;
        myy0 myy0Var2 = this.c;
        if (myy0Var2 != null) {
            myy0Var2.a.removeCallbacks(myy0Var2.c);
        }
        long msSinceBoot = this.a.getMsSinceBoot();
        this.f++;
        long j = msSinceBoot - this.e;
        this.g = Math.min(this.g, j);
        long max = Math.max(this.h, j);
        this.h = max;
        this.e = msSinceBoot;
        long j2 = this.d;
        long j3 = j2 + ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS;
        if (j3 >= msSinceBoot) {
            if (j3 >= msSinceBoot + ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS || (myy0Var = this.c) == null) {
                return;
            }
            myy0Var.a.postDelayed(myy0Var.c, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
            return;
        }
        this.d = msSinceBoot;
        this.b.invoke(new ThrottleInfo(this.f, msSinceBoot - j2, this.g, max));
        this.f = 0;
        this.g = Long.MAX_VALUE;
        this.h = Long.MIN_VALUE;
    }
}
