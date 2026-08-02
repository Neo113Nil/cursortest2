package xsna;

import com.vk.dto.polls.Poll;

/* compiled from: PollsDeleteVote.kt */
/* loaded from: classes18.dex */
public final class onb0 {
    public final Poll a;
    public final boolean b;

    public onb0(Poll poll, boolean z) {
        this.a = poll;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onb0)) {
            return false;
        }
        onb0 onb0Var = (onb0) obj;
        return epx.f(this.a, onb0Var.a) && this.b == onb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollDeleteVoteResult(poll=");
        sb.append(this.a);
        sb.append(", deleteVoteSuccess=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
