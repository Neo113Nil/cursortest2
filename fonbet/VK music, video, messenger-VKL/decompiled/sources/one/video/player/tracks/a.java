package one.video.player.tracks;

import one.video.player.tracks.Track;
import xsna.so4;

/* compiled from: AudioTrack.kt */
/* loaded from: classes8.dex */
public class a extends Track {
    public a(String str, so4 so4Var) {
        super(Track.Type.AUDIO, str, so4Var);
    }

    public final String toString() {
        return "AudioTrack(format: " + ((so4) this.c) + ")";
    }
}
