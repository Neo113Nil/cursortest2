package xsna;

import com.vk.voip.dto.call_member.CallMemberId;

/* compiled from: VoipAsrOnlineChunk.kt */
/* loaded from: classes7.dex */
public final class eew0 {
    public final CallMemberId a;
    public final String b;
    public final String c;

    public eew0(CallMemberId callMemberId, String str, String str2) {
        this.a = callMemberId;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eew0)) {
            return false;
        }
        eew0 eew0Var = (eew0) obj;
        return epx.f(this.a, eew0Var.a) && epx.f(this.b, eew0Var.b) && epx.f(this.c, eew0Var.c);
    }

    public final int hashCode() {
        CallMemberId callMemberId = this.a;
        return this.c.hashCode() + urd0.a((callMemberId == null ? 0 : callMemberId.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipAsrOnlineChunk(memberId=");
        sb.append(this.a);
        sb.append(", memberName=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }
}
