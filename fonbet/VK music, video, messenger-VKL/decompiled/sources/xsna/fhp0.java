package xsna;

import com.vk.im.external.AudioTrack;

/* compiled from: MessagesListAudioPlayer.kt */
/* loaded from: classes16.dex */
public final class fhp0 {
    public final AudioTrack a;

    public fhp0(AudioTrack audioTrack) {
        this.a = audioTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhp0) && epx.f(this.a, ((fhp0) obj).a);
    }

    public final int hashCode() {
        AudioTrack audioTrack = this.a;
        if (audioTrack == null) {
            return 0;
        }
        return audioTrack.hashCode();
    }

    public final String toString() {
        return "TrackUpdate(track=" + this.a + ')';
    }
}
