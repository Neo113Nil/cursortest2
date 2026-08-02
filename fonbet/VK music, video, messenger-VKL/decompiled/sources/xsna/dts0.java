package xsna;

import android.support.v4.media.session.MediaSessionCompat;

/* compiled from: VideoMediaSessionToken.kt */
/* loaded from: classes3.dex */
public final class dts0 {
    public final String a;
    public final MediaSessionCompat.Token b;

    public dts0(String str, MediaSessionCompat.Token token) {
        this.a = str;
        this.b = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dts0)) {
            return false;
        }
        dts0 dts0Var = (dts0) obj;
        return epx.f(this.a, dts0Var.a) && epx.f(this.b, dts0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoMediaSessionToken(id=" + this.a + ", token=" + this.b + ')';
    }
}
