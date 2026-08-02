package xsna;

import android.net.Uri;

/* compiled from: VideoData.kt */
/* loaded from: classes3.dex */
public final class wds0 {
    public final Uri a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;

    public wds0(Uri uri, long j, long j2, long j3, boolean z) {
        this.a = uri;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wds0)) {
            return false;
        }
        wds0 wds0Var = (wds0) obj;
        return epx.f(this.a, wds0Var.a) && this.c == wds0Var.c && this.d == wds0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + bh10.a(this.a.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoData(uri=");
        sb.append(this.a);
        sb.append(", originalDurationMs=");
        sb.append(this.b);
        sb.append(", startTimeMs=");
        sb.append(this.c);
        sb.append(", endTimeMs=");
        sb.append(this.d);
        sb.append(", mirror=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
