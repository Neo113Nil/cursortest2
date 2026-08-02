package xsna;

import java.util.EnumSet;
import one.video.player.OneVideoPlayer;

/* compiled from: PlayerInfo.kt */
/* loaded from: classes8.dex */
public final class h2b0 {
    public static final EnumSet<OneVideoPlayer.State> a = EnumSet.of(OneVideoPlayer.State.BUFFERING, OneVideoPlayer.State.PLAYING, OneVideoPlayer.State.PAUSED, OneVideoPlayer.State.ENDED);

    public static final boolean a(g2b0 g2b0Var) {
        return a.contains(g2b0Var != null ? g2b0Var.a : null);
    }
}
