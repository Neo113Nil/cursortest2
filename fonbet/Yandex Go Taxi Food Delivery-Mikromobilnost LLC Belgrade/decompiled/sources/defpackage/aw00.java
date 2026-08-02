package defpackage;

import com.yandex.go.feed_video.domain.MediaItem$StreamType;
import java.util.ArrayList;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.list_player_manager.model.Stream;
import ru.yandex.video.m3.list_player_manager.model.StreamType;

/* loaded from: classes7.dex */
public abstract class aw00 {
    public static final MediaData a(ee10 ee10Var) {
        ArrayList<ce10> arrayList = ee10Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (ce10 ce10Var : arrayList) {
            MediaItem$StreamType mediaItem$StreamType = ce10Var.a;
            int i = mediaItem$StreamType == null ? -1 : zv00.a[mediaItem$StreamType.ordinal()];
            StreamType streamType = null;
            if (i != -1) {
                if (i == 1) {
                    streamType = StreamType.DASH;
                } else if (i == 2) {
                    streamType = StreamType.DASH_MB;
                } else {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    streamType = StreamType.HLS;
                }
            }
            arrayList2.add(new Stream(streamType, ce10Var.b));
        }
        MediaData.Builder builder = new MediaData.Builder(arrayList2);
        builder.setFirstFrameHash(ee10Var.c);
        builder.setFirstFrameUrl(ee10Var.d);
        builder.setVideoContentId(ee10Var.a);
        builder.setShowFirstFrameUntilPlay(jl40.l(ee10Var.e, Boolean.TRUE));
        return builder.build();
    }
}
