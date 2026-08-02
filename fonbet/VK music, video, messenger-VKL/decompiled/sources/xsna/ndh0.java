package xsna;

import com.vk.voip.dto.call_member.CallMemberId;

/* compiled from: ScreencastAccessibilityDelegate.kt */
/* loaded from: classes7.dex */
public final class ndh0 {
    public final CallMemberId a;
    public final boolean b;

    public ndh0(CallMemberId callMemberId, boolean z) {
        this.a = callMemberId;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndh0)) {
            return false;
        }
        ndh0 ndh0Var = (ndh0) obj;
        return epx.f(this.a, ndh0Var.a) && this.b == ndh0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreencastEvent(callMemberId=");
        sb.append(this.a);
        sb.append(", isStart=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
