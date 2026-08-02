package xsna;

import ru.ok.android.webrtc.mediaadaptation.MediaAdaptation;

/* loaded from: classes8.dex */
public final class ebz0 {
    public final MediaAdaptation.NetworkCondition a;
    public final MediaAdaptation.NetworkState b;
    public final boolean c;

    public ebz0(MediaAdaptation.NetworkCondition networkCondition, MediaAdaptation.NetworkState networkState, boolean z) {
        this.a = networkCondition;
        this.b = networkState;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebz0)) {
            return false;
        }
        ebz0 ebz0Var = (ebz0) obj;
        return this.a == ebz0Var.a && epx.f(this.b, ebz0Var.b) && this.c == ebz0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkParameters(condition=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", preferHardwareVPX=");
        return n23.b(sb, this.c, ")");
    }
}
