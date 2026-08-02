package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsFavoritesContentResponseMapper.kt */
/* loaded from: classes16.dex */
public final class c4e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public static u2e a(ShortVideoPlaylistFullDto shortVideoPlaylistFullDto) {
        List list;
        String d = shortVideoPlaylistFullDto.d();
        FavoriteFolderId.Alias.AllClips allClips = FavoriteFolderId.Alias.AllClips.c;
        boolean f = epx.f(d, allClips.b);
        FavoriteFolderId favoriteFolderId = allClips;
        if (!f) {
            favoriteFolderId = new FavoriteFolderId.Id(shortVideoPlaylistFullDto.getId());
        }
        FavoriteFolderId favoriteFolderId2 = favoriteFolderId;
        UserId q = shortVideoPlaylistFullDto.q();
        List<List<BaseImageDto>> e = shortVideoPlaylistFullDto.e();
        if (e != null) {
            List<List<BaseImageDto>> list2 = e;
            new ne6();
            list = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(ne6.a((List) it.next()));
            }
        } else {
            list = EmptyList.b;
        }
        return new u2e(favoriteFolderId2, q, list, shortVideoPlaylistFullDto.getTitle(), shortVideoPlaylistFullDto.getCount());
    }
}
