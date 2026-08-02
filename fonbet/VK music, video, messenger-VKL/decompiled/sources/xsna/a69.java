package xsna;

import com.vk.voip.dto.call_member.CallMemberId;

/* compiled from: CallMemberFeedback.kt */
/* loaded from: classes7.dex */
public final class a69 {
    public final String a;
    public final CallMemberId b;

    public a69(String str, CallMemberId callMemberId) {
        this.a = str;
        this.b = callMemberId;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a69)) {
            return false;
        }
        return epx.f(this.b, ((a69) obj).b);
    }

    public final int hashCode() {
        CallMemberId callMemberId = this.b;
        if (callMemberId != null) {
            return callMemberId.hashCode();
        }
        return 0;
    }
}
