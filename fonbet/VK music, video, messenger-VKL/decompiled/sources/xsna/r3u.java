package xsna;

import com.vk.onetimedonut.api.events.OneTimeDonutEventStatus;

/* compiled from: GoalDonutEvent.kt */
/* loaded from: classes4.dex */
public final class r3u extends czi {
    public final OneTimeDonutEventStatus c;

    public r3u(OneTimeDonutEventStatus oneTimeDonutEventStatus) {
        super(oneTimeDonutEventStatus);
        this.c = oneTimeDonutEventStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3u) && this.c == ((r3u) obj).c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // xsna.czi
    public final String toString() {
        return "GoalDonutEvent(status=" + this.c + ')';
    }
}
