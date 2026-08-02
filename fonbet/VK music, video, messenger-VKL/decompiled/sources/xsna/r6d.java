package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class r6d implements ClipItemViewEvent {
    public final rlh0 b;

    public r6d(rlh0 rlh0Var) {
        this.b = rlh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6d) && epx.f(this.b, ((r6d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OnVideoSizeChanged(videoSize=" + this.b + ')';
    }
}
