package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class w3d implements ClipItemViewEvent {
    public final mih0 b;

    public w3d(mih0 mih0Var) {
        this.b = mih0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3d) && epx.f(this.b, ((w3d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "HighlightHashTagClicked(hashtagBadge=" + this.b + ')';
    }
}
