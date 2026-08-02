package xsna;

import java.util.HashMap;
import kotlin.Pair;
import one.video.player.OneVideoPlayer;

/* compiled from: DataTypeMapper.kt */
/* loaded from: classes8.dex */
public final class xvk {
    public static final HashMap a = pn00.i(new Pair(0, OneVideoPlayer.DataType.UNKNOWN), new Pair(1, OneVideoPlayer.DataType.MEDIA), new Pair(2, OneVideoPlayer.DataType.MEDIA_INITIALIZATION), new Pair(3, OneVideoPlayer.DataType.DRM), new Pair(4, OneVideoPlayer.DataType.MANIFEST), new Pair(5, OneVideoPlayer.DataType.TIME_SYNCHRONIZATION), new Pair(6, OneVideoPlayer.DataType.AD), new Pair(7, OneVideoPlayer.DataType.MEDIA_PROGRESSIVE_LIVE));

    public static OneVideoPlayer.DataType a(int i) {
        OneVideoPlayer.DataType dataType = (OneVideoPlayer.DataType) a.get(Integer.valueOf(i));
        return dataType == null ? OneVideoPlayer.DataType.UNRESOLVED : dataType;
    }
}
