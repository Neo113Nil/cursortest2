package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class g6d implements ClipItemViewEvent {
    public final j4b0 b;

    public g6d(j4b0 j4b0Var) {
        this.b = j4b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6d) && epx.f(this.b, ((g6d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return br.c(new StringBuilder("OnFirstFrameRendered(playerState="), this.b, ')');
    }
}
