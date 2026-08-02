package one.video.player.tracks;

import one.video.player.tracks.Track;
import xsna.drm0;
import xsna.who0;

/* compiled from: TextTrack.kt */
/* loaded from: classes8.dex */
public class b extends Track {
    public final boolean d;

    public b(String str, who0 who0Var) {
        super(Track.Type.TEXT, str, who0Var);
        String str2 = who0Var.a;
        boolean z = false;
        if (str2 != null && drm0.K(0, 6, str2, "auto", false) == -1) {
            z = true;
        }
        this.d = !z;
    }

    public final String toString() {
        return "TextTrack(format: " + ((who0) this.c) + ")";
    }
}
