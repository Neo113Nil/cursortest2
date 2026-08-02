package xsna;

import java.util.HashMap;
import kotlin.Pair;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: StuckTypeMapper.kt */
/* loaded from: classes8.dex */
public final class tsm0 {
    public static final HashMap<Integer, OneVideoPlaybackException.StuckType> a = pn00.i(new Pair(0, OneVideoPlaybackException.StuckType.BUFFERING_NOT_LOADING), new Pair(1, OneVideoPlaybackException.StuckType.BUFFERING_NO_PROGRESS), new Pair(2, OneVideoPlaybackException.StuckType.PLAYING_NO_PROGRESS), new Pair(3, OneVideoPlaybackException.StuckType.PLAYING_NOT_ENDING), new Pair(4, OneVideoPlaybackException.StuckType.SUPPRESSED));
}
