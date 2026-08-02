package xsna;

import com.vk.reefton.dto.ReefRequestReason;
import java.util.LinkedHashSet;

/* compiled from: ReefSnapshot.kt */
/* loaded from: classes5.dex */
public final class vof0 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final ReefRequestReason h;
    public final Object i;
    public final LinkedHashSet j;

    public vof0(int i, int i2, long j, long j2, int i3, long j3, long j4, ReefRequestReason reefRequestReason, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = i3;
        this.f = j3;
        this.g = j4;
        this.h = reefRequestReason;
        this.i = obj;
        this.j = new LinkedHashSet();
    }

    public final void a(wof0 wof0Var) {
        this.j.add(wof0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vof0)) {
            return false;
        }
        vof0 vof0Var = (vof0) obj;
        return this.a == vof0Var.a && this.b == vof0Var.b && this.c == vof0Var.c && this.d == vof0Var.d && this.e == vof0Var.e && this.f == vof0Var.f && this.g == vof0Var.g && this.h == vof0Var.h && epx.f(this.i, vof0Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + bh10.a(bh10.a(shy.a(this.e, bh10.a(bh10.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g)) * 31;
        Object obj = this.i;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder a = odj.a(this.a, this.b, "ReefSnapshot(instanceId=", ", sequenceNumber=", ", timestamp=");
        a.append(this.c);
        tj0.d(a, ", timestamp2=", this.d, ", timezone=");
        a.append(this.e);
        a.append(", millisecondsSinceBoot=");
        a.append(this.f);
        tj0.d(a, ", applicationStartTime=", this.g, ", reason=");
        a.append(this.h);
        a.append(", caller=");
        a.append(this.i);
        a.append(")");
        return a.toString();
    }

    public vof0() {
        this(0, 0, 0L, 0L, 0, 0L, 0L, ReefRequestReason.HEARTBEAT_PLAYER, null);
    }
}
