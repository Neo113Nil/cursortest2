package one.video.player.tracks;

import one.video.player.tracks.Track;
import xsna.cms0;

/* compiled from: VideoTrack.kt */
/* loaded from: classes8.dex */
public class c extends Track {
    public final boolean d;

    public c(String str, cms0 cms0Var, boolean z) {
        super(Track.Type.VIDEO, str, cms0Var);
        this.d = z;
    }

    public final String toString() {
        return "VideoTrack(format: " + ((cms0) this.c) + ")";
    }
}
