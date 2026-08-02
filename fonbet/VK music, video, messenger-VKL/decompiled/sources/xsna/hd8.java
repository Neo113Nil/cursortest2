package xsna;

import com.vk.voip.dto.RecordType;
import com.vk.voip.dto.call_member.CallMemberId;

/* compiled from: Broadcast.kt */
/* loaded from: classes7.dex */
public final class hd8 {
    public final String a;
    public final String b;
    public final String c;
    public final CallMemberId d;
    public final long e;
    public final RecordType f;

    public hd8(String str, String str2, String str3, CallMemberId callMemberId, long j, RecordType recordType) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = callMemberId;
        this.e = j;
        this.f = recordType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd8)) {
            return false;
        }
        hd8 hd8Var = (hd8) obj;
        return epx.f(this.a, hd8Var.a) && epx.f(this.b, hd8Var.b) && epx.f(this.c, hd8Var.c) && epx.f(this.d, hd8Var.d) && this.e == hd8Var.e && this.f == hd8Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + bh10.a((this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        return "Broadcast(id=" + this.a + ", ownerId=" + this.b + ", streamId=" + this.c + ", initiatorId=" + this.d + ", startTimeMs=" + this.e + ", recordType=" + this.f + ')';
    }
}
