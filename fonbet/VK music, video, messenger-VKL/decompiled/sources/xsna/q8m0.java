package xsna;

import com.vk.dto.polls.Poll;

/* compiled from: StoryPollInfo.kt */
/* loaded from: classes5.dex */
public final class q8m0 {
    public final Poll a;
    public final boolean b;
    public final s8m0 c;

    public q8m0(Poll poll, boolean z, s8m0 s8m0Var) {
        this.a = poll;
        this.b = z;
        this.c = s8m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8m0)) {
            return false;
        }
        q8m0 q8m0Var = (q8m0) obj;
        return epx.f(this.a, q8m0Var.a) && this.b == q8m0Var.b && epx.f(this.c, q8m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "StoryPollInfo(poll=" + this.a + ", isShare=" + this.b + ", config=" + this.c + ')';
    }
}
