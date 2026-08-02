package xsna;

import com.vk.voip.userid.CallsUserId;

/* compiled from: ScheduledCallsPatch.kt */
/* loaded from: classes7.dex */
public final class j7h0 implements b59 {
    public final CallsUserId b;
    public final boolean c;

    public j7h0(CallsUserId callsUserId, boolean z) {
        this.b = callsUserId;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7h0)) {
            return false;
        }
        j7h0 j7h0Var = (j7h0) obj;
        return epx.f(this.b, j7h0Var.b) && this.c == j7h0Var.c;
    }

    public final int hashCode() {
        CallsUserId callsUserId = this.b;
        return Boolean.hashCode(this.c) + ((callsUserId == null ? 0 : callsUserId.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterForUser(userId=");
        sb.append(this.b);
        sb.append(", forceUpdate=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
