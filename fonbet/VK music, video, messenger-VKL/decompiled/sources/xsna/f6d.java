package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class f6d implements ClipItemViewEvent {
    public final j4b0 b;
    public final int c;
    public final OneVideoPlaybackException.ErrorCode d;

    public f6d(j4b0 j4b0Var, int i, OneVideoPlaybackException.ErrorCode errorCode) {
        this.b = j4b0Var;
        this.c = i;
        this.d = errorCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6d)) {
            return false;
        }
        f6d f6dVar = (f6d) obj;
        return this.b.equals(f6dVar.b) && this.c == f6dVar.c && this.d == f6dVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "OnError(playerState=" + this.b + ", errorTitleRes=" + this.c + ", errorCode=" + this.d + ')';
    }
}
