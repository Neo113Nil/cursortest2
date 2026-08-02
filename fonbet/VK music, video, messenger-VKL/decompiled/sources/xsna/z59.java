package xsna;

import com.vk.voip.api.id.CallId;

/* compiled from: CallMemberCustomNames.kt */
/* loaded from: classes7.dex */
public final class z59 {
    public final CallId a;
    public final String b;

    public z59(CallId callId, String str) {
        this.a = callId;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z59)) {
            return false;
        }
        z59 z59Var = (z59) obj;
        return epx.f(this.a, z59Var.a) && epx.f(this.b, z59Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.b.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallMemberCustomNames(callId=");
        sb.append(this.a);
        sb.append(", name=");
        return ho8.a(sb, this.b, ')');
    }
}
