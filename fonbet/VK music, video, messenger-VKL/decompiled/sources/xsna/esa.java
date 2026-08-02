package xsna;

import com.vk.voip.api.id.CallId;

/* compiled from: ChangeNameCallParams.kt */
/* loaded from: classes7.dex */
public final class esa {
    public final String a;
    public final CallId b;

    public esa(CallId callId, String str) {
        this.a = str;
        this.b = callId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esa)) {
            return false;
        }
        esa esaVar = (esa) obj;
        return epx.f(this.a, esaVar.a) && epx.f(this.b, esaVar.b);
    }

    public final int hashCode() {
        return this.b.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChangeNameCallParams(changedName=" + this.a + ", callId=" + this.b + ')';
    }
}
