package xsna;

import com.ironsource.X3;
import org.webrtc.IceCandidate;

/* loaded from: classes8.dex */
public final class j1z0 {
    public final IceCandidate a;
    public final IceCandidate b;

    public j1z0(IceCandidate iceCandidate, IceCandidate iceCandidate2) {
        this.a = iceCandidate;
        this.b = iceCandidate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1z0)) {
            return false;
        }
        j1z0 j1z0Var = (j1z0) obj;
        return epx.f(this.a, j1z0Var.a) && epx.f(this.b, j1z0Var.b);
    }

    public final int hashCode() {
        IceCandidate iceCandidate = this.a;
        int hashCode = (iceCandidate == null ? 0 : iceCandidate.hashCode()) * 31;
        IceCandidate iceCandidate2 = this.b;
        return hashCode + (iceCandidate2 != null ? iceCandidate2.hashCode() : 0);
    }

    public final String toString() {
        return "[local=" + this.a + ",remote=" + this.b + X3.j.e;
    }
}
