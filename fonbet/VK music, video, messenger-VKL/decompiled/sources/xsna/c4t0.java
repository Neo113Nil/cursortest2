package xsna;

import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: VideoPlayerErrorProcessorConfig.kt */
/* loaded from: classes11.dex */
public final class c4t0 {
    public static final a d = new a();
    public static final c4t0 e;
    public final int a;
    public final int b;
    public final long c;

    /* compiled from: VideoPlayerErrorProcessorConfig.kt */
    public static final class a {
    }

    static {
        zno.a aVar = zno.c;
        e = new c4t0(3, 3, eoo.e(5, DurationUnit.SECONDS));
    }

    public c4t0(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4t0)) {
            return false;
        }
        c4t0 c4t0Var = (c4t0) obj;
        return this.a == c4t0Var.a && this.b == c4t0Var.b && zno.d(this.c, c4t0Var.c);
    }

    public final int hashCode() {
        int a2 = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        zno.a aVar = zno.c;
        return Long.hashCode(this.c) + a2;
    }

    public final String toString() {
        return "VideoPlayerErrorProcessorConfig(networkErrorRetryCount=" + this.a + ", playlistStuckRetryCount=" + this.b + ", playlistStuckDelay=" + ((Object) zno.m(this.c)) + ')';
    }
}
