package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.ImageScreenSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: ClipsPlaylistMapper.kt */
/* loaded from: classes16.dex */
public final class lqe {
    public static final Object a = msy.a(LazyThreadSafetyMode.NONE, new uz(7));

    public static ClipsPlaylist a(ShortVideoPlaylistFullDto shortVideoPlaylistFullDto, boolean z) {
        return new ClipsPlaylist(shortVideoPlaylistFullDto.getId(), shortVideoPlaylistFullDto.getTitle(), b(shortVideoPlaylistFullDto.e()), shortVideoPlaylistFullDto.getCount(), shortVideoPlaylistFullDto.q(), z, null, 64, null);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public static List b(List list) {
        ArrayList arrayList = null;
        if (list != null) {
            List<List> list2 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            for (List list3 : list2) {
                ((ne6) a.getValue()).getClass();
                ImageSize Cb = ne6.a(list3).Cb(ImageScreenSize.VERY_SMALL.h(), true, false);
                String str = Cb != null ? Cb.d.d : null;
                if (str == null) {
                    str = "";
                }
                arrayList2.add(str);
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? EmptyList.b : arrayList;
    }
}
