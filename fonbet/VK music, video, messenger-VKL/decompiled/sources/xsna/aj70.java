package xsna;

import com.vk.api.generated.notifications.dto.NotificationsEntityCommentEntityDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.video.dto.VideoVideoDto;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import java.util.Map;
import kotlin.Pair;
import xsna.ha70;

/* compiled from: NotificationsCommentEntityActionMapper.kt */
/* loaded from: classes4.dex */
public final class aj70 {
    public static ha70 a(NotificationsEntityCommentEntityDto notificationsEntityCommentEntityDto, int i, x970 x970Var) {
        Map<Pair<Integer, UserId>, VideoVideoDto> map = x970Var.e;
        if (notificationsEntityCommentEntityDto instanceof NotificationsEntityCommentEntityDto.NotificationsEntityPostDto) {
            NotificationsEntityCommentEntityDto.NotificationsEntityPostDto notificationsEntityPostDto = (NotificationsEntityCommentEntityDto.NotificationsEntityPostDto) notificationsEntityCommentEntityDto;
            return new ha70.r(notificationsEntityPostDto.d(), Integer.valueOf(i), notificationsEntityPostDto.q());
        }
        if (notificationsEntityCommentEntityDto instanceof NotificationsEntityCommentEntityDto.NotificationsEntityPhotoDto) {
            NotificationsEntityCommentEntityDto.NotificationsEntityPhotoDto notificationsEntityPhotoDto = (NotificationsEntityCommentEntityDto.NotificationsEntityPhotoDto) notificationsEntityCommentEntityDto;
            PhotosPhotoDto photosPhotoDto = x970Var.d.get(new Pair(Integer.valueOf(notificationsEntityPhotoDto.d()), notificationsEntityPhotoDto.q()));
            if (photosPhotoDto != null) {
                return new ha70.o(xfa0.a(photosPhotoDto), Integer.valueOf(i));
            }
        } else if (notificationsEntityCommentEntityDto instanceof NotificationsEntityCommentEntityDto.NotificationsEntityVideoDto) {
            NotificationsEntityCommentEntityDto.NotificationsEntityVideoDto notificationsEntityVideoDto = (NotificationsEntityCommentEntityDto.NotificationsEntityVideoDto) notificationsEntityCommentEntityDto;
            VideoVideoDto videoVideoDto = map.get(new Pair(Integer.valueOf(notificationsEntityVideoDto.d()), notificationsEntityVideoDto.q()));
            if (videoVideoDto != null) {
                return b(videoVideoDto, i);
            }
        } else if (notificationsEntityCommentEntityDto instanceof NotificationsEntityCommentEntityDto.NotificationsEntityLiveDto) {
            NotificationsEntityCommentEntityDto.NotificationsEntityLiveDto notificationsEntityLiveDto = (NotificationsEntityCommentEntityDto.NotificationsEntityLiveDto) notificationsEntityCommentEntityDto;
            VideoVideoDto videoVideoDto2 = map.get(new Pair(Integer.valueOf(notificationsEntityLiveDto.d()), notificationsEntityLiveDto.q()));
            if (videoVideoDto2 != null) {
                return b(videoVideoDto2, i);
            }
        } else {
            if (!(notificationsEntityCommentEntityDto instanceof NotificationsEntityCommentEntityDto.NotificationsEntityShortVideoDto)) {
                return notificationsEntityCommentEntityDto instanceof NotificationsEntityCommentEntityDto.NotificationsEntityTopicDto ? new ha70.l(((NotificationsEntityCommentEntityDto.NotificationsEntityTopicDto) notificationsEntityCommentEntityDto).getUrl(), null) : notificationsEntityCommentEntityDto instanceof NotificationsEntityCommentEntityDto.NotificationsEntityStoryDto ? new ha70.l(((NotificationsEntityCommentEntityDto.NotificationsEntityStoryDto) notificationsEntityCommentEntityDto).getUrl(), null) : notificationsEntityCommentEntityDto instanceof NotificationsEntityCommentEntityDto.NotificationsEntityBugreportDto ? new ha70.l(((NotificationsEntityCommentEntityDto.NotificationsEntityBugreportDto) notificationsEntityCommentEntityDto).getUrl(), null) : notificationsEntityCommentEntityDto instanceof NotificationsEntityCommentEntityDto.NotificationsEntityMarketItemDto ? new ha70.l(((NotificationsEntityCommentEntityDto.NotificationsEntityMarketItemDto) notificationsEntityCommentEntityDto).getUrl(), null) : ha70.y.a;
            }
            NotificationsEntityCommentEntityDto.NotificationsEntityShortVideoDto notificationsEntityShortVideoDto = (NotificationsEntityCommentEntityDto.NotificationsEntityShortVideoDto) notificationsEntityCommentEntityDto;
            VideoVideoDto videoVideoDto3 = map.get(new Pair(Integer.valueOf(notificationsEntityShortVideoDto.d()), notificationsEntityShortVideoDto.q()));
            if (videoVideoDto3 != null) {
                return b(videoVideoDto3, i);
            }
        }
        return null;
    }

    public static ha70 b(VideoVideoDto videoVideoDto, int i) {
        VideoFileOld a = okt0.a(videoVideoDto);
        return g620.f().d(a) ? new ha70.t(a, Integer.valueOf(i)) : new ha70.u(a, Integer.valueOf(i));
    }
}
