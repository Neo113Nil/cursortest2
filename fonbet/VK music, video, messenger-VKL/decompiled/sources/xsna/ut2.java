package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AnonymCallsQueueEvent.kt */
/* loaded from: classes7.dex */
public final class ut2 extends dd9 {
    public final UserId g;
    public final int h;

    public ut2(UserId userId, int i) {
        super(userId, i, 0);
        this.g = userId;
        this.h = i;
    }

    @Override // xsna.dd9, xsna.dre0
    public final String b() {
        return "calls_anonym_queue_id";
    }

    @Override // xsna.dd9
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut2)) {
            return false;
        }
        ut2 ut2Var = (ut2) obj;
        return epx.f(this.g, ut2Var.g) && this.h == ut2Var.h;
    }

    @Override // xsna.dd9
    public final int hashCode() {
        return Integer.hashCode(0) + shy.a(this.h, Long.hashCode(this.g.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnonymCallsQueueEvent(anonymUserId=");
        sb.append(this.g);
        sb.append(", anonymAppId=");
        return h5s.c(this.h, ", anonVersion=0)", sb);
    }
}
