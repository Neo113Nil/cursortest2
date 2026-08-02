package xsna;

import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.notifications.dto.NotificationsEntityDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.video.dto.VideoVideoDto;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.ha70;

/* compiled from: NotificationsEntityActionMapper.kt */
/* loaded from: classes4.dex */
public final class gj70 {
    public static ha70 b(VideoVideoDto videoVideoDto) {
        VideoFileOld a = okt0.a(videoVideoDto);
        return g620.f().d(a) ? new ha70.t(a, null) : new ha70.u(a, null);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    public final ha70 a(NotificationsEntityDto notificationsEntityDto, x970 x970Var) {
        Map<Pair<Integer, UserId>, VideoVideoDto> map = x970Var.e;
        if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityUserDto) {
            return new ha70.s(((NotificationsEntityDto.NotificationsEntityUserDto) notificationsEntityDto).getUserId());
        }
        if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityGroupDto) {
            NotificationsEntityDto.NotificationsEntityGroupDto notificationsEntityGroupDto = (NotificationsEntityDto.NotificationsEntityGroupDto) notificationsEntityDto;
            UserId d = notificationsEntityGroupDto.d();
            UserId userId = fkq0.b(d) ? d : null;
            if (userId == null) {
                userId = fkq0.e(notificationsEntityGroupDto.d());
            }
            return new ha70.s(userId);
        }
        if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityPostDto) {
            NotificationsEntityDto.NotificationsEntityPostDto notificationsEntityPostDto = (NotificationsEntityDto.NotificationsEntityPostDto) notificationsEntityDto;
            return new ha70.r(notificationsEntityPostDto.e(), null, notificationsEntityPostDto.q());
        }
        if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityPhotoDto) {
            NotificationsEntityDto.NotificationsEntityPhotoDto notificationsEntityPhotoDto = (NotificationsEntityDto.NotificationsEntityPhotoDto) notificationsEntityDto;
            PhotosPhotoDto photosPhotoDto = x970Var.d.get(new Pair(Integer.valueOf(notificationsEntityPhotoDto.d()), notificationsEntityPhotoDto.q()));
            if (photosPhotoDto != null) {
                return new ha70.o(xfa0.a(photosPhotoDto), null);
            }
        } else if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityVideoDto) {
            NotificationsEntityDto.NotificationsEntityVideoDto notificationsEntityVideoDto = (NotificationsEntityDto.NotificationsEntityVideoDto) notificationsEntityDto;
            VideoVideoDto videoVideoDto = map.get(new Pair(Integer.valueOf(notificationsEntityVideoDto.d()), notificationsEntityVideoDto.q()));
            if (videoVideoDto != null) {
                return b(videoVideoDto);
            }
        } else if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityLiveDto) {
            NotificationsEntityDto.NotificationsEntityLiveDto notificationsEntityLiveDto = (NotificationsEntityDto.NotificationsEntityLiveDto) notificationsEntityDto;
            VideoVideoDto videoVideoDto2 = map.get(new Pair(Integer.valueOf(notificationsEntityLiveDto.d()), notificationsEntityLiveDto.q()));
            if (videoVideoDto2 != null) {
                return b(videoVideoDto2);
            }
        } else if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityShortVideoDto) {
            NotificationsEntityDto.NotificationsEntityShortVideoDto notificationsEntityShortVideoDto = (NotificationsEntityDto.NotificationsEntityShortVideoDto) notificationsEntityDto;
            VideoVideoDto videoVideoDto3 = map.get(new Pair(Integer.valueOf(notificationsEntityShortVideoDto.d()), notificationsEntityShortVideoDto.q()));
            if (videoVideoDto3 != null) {
                return b(videoVideoDto3);
            }
        } else {
            if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityStoryDto) {
                return new ha70.l(((NotificationsEntityDto.NotificationsEntityStoryDto) notificationsEntityDto).getUrl(), null);
            }
            if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityAppDto) {
                AppsAppDto appsAppDto = (AppsAppDto) x970Var.g.get(Integer.valueOf(((NotificationsEntityDto.NotificationsEntityAppDto) notificationsEntityDto).d()));
                if (appsAppDto != null) {
                    new re3();
                    return new ha70.v(re3.b(appsAppDto));
                }
            } else if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityPollDto) {
                PollsPollDto pollsPollDto = (PollsPollDto) x970Var.h.get(Integer.valueOf(((NotificationsEntityDto.NotificationsEntityPollDto) notificationsEntityDto).d()));
                if (pollsPollDto != null) {
                    return new ha70.q(pollsPollDto.getId(), pollsPollDto.q());
                }
            } else if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityMarketItemDto) {
                NotificationsEntityDto.NotificationsEntityMarketItemDto notificationsEntityMarketItemDto = (NotificationsEntityDto.NotificationsEntityMarketItemDto) notificationsEntityDto;
                MarketMarketItemDto marketMarketItemDto = x970Var.i.get(new Pair(Integer.valueOf(notificationsEntityMarketItemDto.d()), notificationsEntityMarketItemDto.q()));
                if (marketMarketItemDto != null) {
                    return new ha70.m(new rz00(b210.c(marketMarketItemDto), CommonMarketStat$TypeRefSource.NOTIFICATIONS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532));
                }
            } else {
                if (!(notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityPodcastDto)) {
                    if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityCommentDto) {
                        NotificationsEntityDto.NotificationsEntityCommentDto notificationsEntityCommentDto = (NotificationsEntityDto.NotificationsEntityCommentDto) notificationsEntityDto;
                        return aj70.a(notificationsEntityCommentDto.e(), notificationsEntityCommentDto.d(), x970Var);
                    }
                    if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityMessageDto) {
                        return new ha70.l(((NotificationsEntityDto.NotificationsEntityMessageDto) notificationsEntityDto).getUrl(), null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                NotificationsEntityDto.NotificationsEntityPodcastDto notificationsEntityPodcastDto = (NotificationsEntityDto.NotificationsEntityPodcastDto) notificationsEntityDto;
                AudioAudioDto audioAudioDto = x970Var.j.get(new Pair(Integer.valueOf(notificationsEntityPodcastDto.d()), notificationsEntityPodcastDto.q()));
                if (audioAudioDto != null) {
                    return new ha70.p(oc4.d(audioAudioDto));
                }
            }
        }
        return null;
    }
}
