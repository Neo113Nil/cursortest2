package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BasePrivacyDto;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import com.vk.api.generated.media.dto.MediaRestrictionDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VideoAlbumFullToVideoAlbumMapper.kt */
/* loaded from: classes.dex */
public final class b1s0 {
    public static VideoAlbum a(VideoVideoAlbumFullDto videoVideoAlbumFullDto) {
        boolean z;
        List list;
        boolean z2;
        List list2;
        boolean z3;
        int id = videoVideoAlbumFullDto.getId();
        UserId q = videoVideoAlbumFullDto.q();
        String title = videoVideoAlbumFullDto.getTitle();
        int count = videoVideoAlbumFullDto.getCount();
        int l = videoVideoAlbumFullDto.l();
        List<VideoVideoImageDto> g = videoVideoAlbumFullDto.g();
        Image i = g != null ? q7o.i(g) : new Image(EmptyList.b);
        BasePropertyExistsDto i2 = videoVideoAlbumFullDto.i();
        BasePropertyExistsDto basePropertyExistsDto = BasePropertyExistsDto.PROPERTY_EXISTS;
        boolean z4 = true;
        if (i2 == basePropertyExistsDto) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        BasePrivacyDto j = videoVideoAlbumFullDto.j();
        if (j != null) {
            ums0.a.getClass();
            list = ums0.b(j);
        } else {
            list = EmptyList.b;
        }
        if (videoVideoAlbumFullDto.o() == basePropertyExistsDto) {
            z2 = false;
            list2 = list;
            z3 = z;
        } else {
            z2 = false;
            list2 = list;
            z3 = false;
        }
        Boolean n = videoVideoAlbumFullDto.n();
        boolean booleanValue = n != null ? n.booleanValue() : z2;
        Integer f = videoVideoAlbumFullDto.f();
        int intValue = f != null ? f.intValue() : z2;
        String r = videoVideoAlbumFullDto.r();
        MediaRestrictionDto e = videoVideoAlbumFullDto.e();
        return new VideoAlbum(id, q, title, null, count, l, i, z4, list2, z3, booleanValue, intValue, r, e != null ? sd9.n(e) : null, videoVideoAlbumFullDto.d() == BaseBoolIntDto.YES ? true : z2, null, null, null, 229384, null);
    }
}
