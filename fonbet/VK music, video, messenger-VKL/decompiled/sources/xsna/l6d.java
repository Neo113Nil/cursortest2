package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class l6d implements ClipItemViewEvent {
    public final qzb0 b;

    public l6d(qzb0 qzb0Var) {
        this.b = qzb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6d) && epx.f(this.b, ((l6d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OnPositionUpdate(positionPointsState=" + this.b + ')';
    }
}
