package xsna;

import com.vk.dto.polls.Poll;

/* compiled from: StickersListItem.kt */
/* loaded from: classes6.dex */
public final class ual0 implements hfz {
    public final Poll b;

    public ual0(Poll poll) {
        this.b = poll;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ual0) && epx.f(this.b, ((ual0) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PollItem(poll=" + this.b + ')';
    }
}
