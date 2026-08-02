package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketSettingsDto;
import com.vk.api.generated.stickers.dto.StickersBonusHistoryRecordDto;
import com.vk.api.generated.store.dto.StoreGetStickersBonusHistoryRecordsResponseDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.stickers.bonus.StickersBonusHistoryRecord;
import com.vk.dto.stickers.bonus.StickersBonusHistoryRecords;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stickers.settings.j;
import com.vk.voip.miniapps.impl.picture_in_picture.overlay.MiniAppCallPiPOverlayService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hyu implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ hyu(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "mvi_catalog_header_action_btn_test_tag");
                return s3q0.a;
            case 1:
                return Boolean.valueOf(!((Map) obj).isEmpty());
            case 2:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 3:
                Random random = txz.c;
                return txz.c("2");
            case 4:
                MarketSettingsDto marketSettingsDto = (MarketSettingsDto) obj;
                return new be10(marketSettingsDto.d(), marketSettingsDto.e());
            case 5:
                int i = MiniAppCallPiPOverlayService.e;
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 6:
                qgi0.r((tgi0) obj, "vk_top_bar_title");
                return s3q0.a;
            case 7:
                List list = (List) obj;
                Iterator it = list.iterator();
                long j = 0;
                while (it.hasNext()) {
                    long j2 = 0;
                    while (((Playlist) it.next()).y.iterator().hasNext()) {
                        j2 += ((MusicTrack) r5.next()).f;
                    }
                    j += j2;
                }
                return new tt70(4, j, rli0.A(rli0.y(rli0.t(new i5g(list), new d220(6)), 2)));
            case 8:
                return ((cf50) obj).d;
            case 9:
                return new tvf0((NewsEntriesContainer) obj, null);
            case 10:
                return s3q0.a;
            case 11:
                Regex regex = com.vk.common.links.c.a;
                return "";
            case 12:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 13:
                AlbumsRepository.a aVar = (AlbumsRepository.a) obj;
                return new AlbumsRepository.a(aVar.a, aVar.b);
            case 14:
                qgi0.r((tgi0) obj, "product_card_community_description");
                return s3q0.a;
            case 15:
                qgi0.r((tgi0) obj, "product_card_restriction_info_block");
                return s3q0.a;
            case 16:
                return new bxd0((ViewGroup) obj);
            case 17:
                return Boolean.valueOf(brm0.B((String) obj, "Etc/", false));
            case 18:
                return s3q0.a;
            case 19:
                return j.b.a;
            case 20:
                StoreGetStickersBonusHistoryRecordsResponseDto storeGetStickersBonusHistoryRecordsResponseDto = (StoreGetStickersBonusHistoryRecordsResponseDto) obj;
                List<StickersBonusHistoryRecordDto> d = storeGetStickersBonusHistoryRecordsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (StickersBonusHistoryRecordDto stickersBonusHistoryRecordDto : d) {
                    arrayList.add(new StickersBonusHistoryRecord(stickersBonusHistoryRecordDto.getId(), stickersBonusHistoryRecordDto.f().i(), stickersBonusHistoryRecordDto.e() * 1000, stickersBonusHistoryRecordDto.g(), stickersBonusHistoryRecordDto.getTitle(), stickersBonusHistoryRecordDto.getDescription(), u8l0.a(stickersBonusHistoryRecordDto.d())));
                }
                return new StickersBonusHistoryRecords(arrayList, storeGetStickersBonusHistoryRecordsResponseDto.e());
            case 21:
                return ((StoryUserProfile) obj).c;
            case 22:
                return gpt0.e(gpt0.a, (VideoFile) obj, -1, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), false, false, null, null, false, 480);
            case 23:
                return Boolean.valueOf(((hxr0) obj).b);
            case 24:
                List<AudioAudioDto> d2 = ((AudioGetResponseDto) obj).d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d2, 10));
                Iterator<T> it2 = d2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(oc4.d((AudioAudioDto) it2.next()));
                }
                return arrayList2;
            case 25:
                qgi0.r((tgi0) obj, "ToolbarTags.ICON_BACK");
                return s3q0.a;
            case 26:
                vq2 vq2Var = (vq2) obj;
                return new zhf0(vq2Var.a, vq2Var.b, vq2Var.c, vq2Var.d);
            case 27:
                qgi0.r((tgi0) obj, "Video2ClipsModalTags.ICON_CANCEL");
                return s3q0.a;
            case 28:
                List<GroupsGroupFullDto> d3 = ((GroupsGetByIdObjectResponseDto) obj).d();
                return d3 == null ? EmptyList.b : d3;
            default:
                return b1s0.a((VideoVideoAlbumFullDto) obj);
        }
    }

    public /* synthetic */ hyu(Object obj, int i) {
        this.b = i;
    }
}
