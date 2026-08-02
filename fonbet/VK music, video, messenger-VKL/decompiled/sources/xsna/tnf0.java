package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.reefton.dto.ReefLocationSource;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ReefLocation.kt */
/* loaded from: classes5.dex */
public final class tnf0 {
    public static final tnf0 i = new tnf0(ReefLocationSource.UNKNOWN, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0, Float.MAX_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null);
    public final ReefLocationSource a;
    public final double b;
    public final double c;
    public final long d;
    public final float e;
    public final float f;
    public final boolean g;
    public final Float h;

    public tnf0(ReefLocationSource reefLocationSource, double d, double d2, long j, float f, float f2, boolean z, Float f3) {
        this.a = reefLocationSource;
        this.b = d;
        this.c = d2;
        this.d = j;
        this.e = f;
        this.f = f2;
        this.g = z;
        this.h = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnf0)) {
            return false;
        }
        tnf0 tnf0Var = (tnf0) obj;
        return this.a == tnf0Var.a && Double.compare(this.b, tnf0Var.b) == 0 && Double.compare(this.c, tnf0Var.c) == 0 && this.d == tnf0Var.d && Float.compare(this.e, tnf0Var.e) == 0 && Float.compare(this.f, tnf0Var.f) == 0 && this.g == tnf0Var.g && epx.f(this.h, tnf0Var.h);
    }

    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, bh10.a(zjh0.b(this.c, zjh0.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31), 31), 31, this.g);
        Float f = this.h;
        return b + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReefLocation(source=");
        sb.append(this.a);
        sb.append(", longitude=");
        sb.append(this.b);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(sb, ", latitude=", this.c, ", elapsedRealtimeNanos=");
        sb.append(this.d);
        sb.append(", accuracy=");
        sb.append(this.e);
        sb.append(", speed=");
        sb.append(this.f);
        sb.append(", hasAltitude=");
        sb.append(this.g);
        sb.append(", altitude=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
