package xsna;

import android.net.Uri;

/* compiled from: LoadAudioEventInfo.kt */
/* loaded from: classes3.dex */
public final class soz {
    public final Uri a;
    public final long b;

    public soz(long j, Uri uri) {
        this.a = uri;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soz)) {
            return false;
        }
        soz sozVar = (soz) obj;
        return epx.f(this.a, sozVar.a) && this.b == sozVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadAudioEventInfo(uri=");
        sb.append(this.a);
        sb.append(", elapsedRealtimeMs=");
        return vu5.a(')', this.b, sb);
    }
}
