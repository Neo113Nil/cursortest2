package xsna;

import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: ErrorProcessorConfig.kt */
/* loaded from: classes8.dex */
public final class mwp {
    public static final mwp g;
    public final int a;
    public final int b;
    public final long c;
    public final boolean d;
    public final int e;
    public final long f;

    static {
        zno.a aVar = zno.c;
        g = new mwp(eoo.e(5, DurationUnit.SECONDS), 500L, 3, 3, 3, false);
    }

    public mwp(long j, long j2, int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = z;
        this.e = i3;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwp)) {
            return false;
        }
        mwp mwpVar = (mwp) obj;
        return this.a == mwpVar.a && this.b == mwpVar.b && zno.d(this.c, mwpVar.c) && this.d == mwpVar.d && this.e == mwpVar.e && this.f == mwpVar.f;
    }

    public final int hashCode() {
        int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        zno.a aVar = zno.c;
        return Long.hashCode(this.f) + shy.a(this.e, qoy.b(bh10.a(a, 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        String m = zno.m(this.c);
        StringBuilder a = odj.a(this.a, this.b, "ErrorProcessorConfig(networkErrorRetryCount=", ", playlistStuckRetryCount=", ", playlistStuckDelay=");
        a.append(m);
        a.append(", processIoUnspecifiedExplicitly=");
        a.append(this.d);
        a.append(", offlineSeekCount=");
        a.append(this.e);
        a.append(", offlineSeekBaseMs=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }
}
