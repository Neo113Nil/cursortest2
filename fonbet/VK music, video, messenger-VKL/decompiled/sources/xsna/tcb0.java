package xsna;

import com.vk.video.playlist.playlistscreen.PlaylistScreenArgs;

/* compiled from: PlaylistScreenFragmentInternalComponent.kt */
/* loaded from: classes6.dex */
public final class tcb0 extends uaj0 {
    public final PlaylistScreenArgs a;

    public tcb0(PlaylistScreenArgs playlistScreenArgs) {
        this.a = playlistScreenArgs;
    }

    @Override // xsna.pwj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tcb0) && epx.f(this.a, ((tcb0) obj).a);
    }

    @Override // xsna.pwj0
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlaylistScreenFragmentScopeKey(arguments=" + this.a + ')';
    }
}
