package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class m6d implements ClipItemViewEvent {
    public final j4b0 b;

    public m6d(j4b0 j4b0Var) {
        this.b = j4b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6d) && epx.f(this.b, ((m6d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return br.c(new StringBuilder("OnReady(playerState="), this.b, ')');
    }
}
