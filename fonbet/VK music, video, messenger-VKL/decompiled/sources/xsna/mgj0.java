package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoAddPlaylistTypeDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAddToPlaylistPlaylistAliasDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsPlaylistAliasesDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsTypeDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetUserSettingsSettingsIdsDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoRemoveFromPlaylistPlaylistAliasDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSendRecommendedFeedbackTypeDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSetCoOwnerStatusStatusDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ShortVideoService.kt */
/* loaded from: classes2.dex */
public interface mgj0 extends lgj0 {
    static xy2 a(ngj0 ngj0Var, String str, String str2, Integer num, String str3, int i) {
        String str4 = (i & 2) != 0 ? null : str2;
        if ((i & 32) != 0) {
            str3 = null;
        }
        ngj0Var.getClass();
        tfx tfxVar = new tfx("shortVideo.feedClipsBlockItems", new ct(24), new wp(29));
        tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        if (str4 != null) {
            tfx.o(tfxVar, "start_from", str4, 0, 0, 12);
            tfxVar = tfxVar;
        }
        tfxVar.f(num.intValue(), 1, 15, "count");
        if (str3 != null) {
            tfx.o(tfxVar, "similar_short_video_track_code", str3, 0, 0, 12);
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 h(mgj0 mgj0Var, List list, UserId userId, int i) {
        if ((i & 2) != 0) {
            userId = null;
        }
        return mgj0Var.l(userId, list);
    }

    static /* synthetic */ xy2 n(mgj0 mgj0Var, UserId userId, ShortVideoGetPlaylistsTypeDto shortVideoGetPlaylistsTypeDto, List list, List list2, ArrayList arrayList, String str, Integer num, String str2, int i) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            shortVideoGetPlaylistsTypeDto = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        if ((i & 16) != 0) {
            arrayList = null;
        }
        if ((i & 32) != 0) {
            str = null;
        }
        if ((i & 64) != 0) {
            num = null;
        }
        if ((i & 128) != 0) {
            str2 = null;
        }
        return mgj0Var.z(userId, shortVideoGetPlaylistsTypeDto, list, list2, arrayList, str, num, str2);
    }

    static /* synthetic */ xy2 y(mgj0 mgj0Var, UserId userId, Integer num, ShortVideoAddToPlaylistPlaylistAliasDto shortVideoAddToPlaylistPlaylistAliasDto, List list, String str, int i) {
        if ((i & 4) != 0) {
            shortVideoAddToPlaylistPlaylistAliasDto = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        return mgj0Var.g(userId, num, shortVideoAddToPlaylistPlaylistAliasDto, list, str, (i & 32) == 0 ? "last" : null);
    }

    default tfx A(String str) {
        tfx tfxVar = new tfx("shortVideo.getPopularHashtags", new tf3(27), new uf3(26));
        if (str != null) {
            tfx.o(tfxVar, "prefix", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx B(int i, UserId userId, String str) {
        tfx tfxVar = new tfx("shortVideo.editPlaylist", new hgj0(0), new bt(26));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "playlist_id", i, 1, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "title", str, 0, 255, 4);
        }
        return tfxVar;
    }

    default tfx b(List list) {
        tfx tfxVar = new tfx("shortVideo.getStatics", new mq(29), new fbj0(1));
        tfxVar.i("sections", list);
        return tfxVar;
    }

    default tfx e(List list) {
        tfx tfxVar = new tfx("shortVideo.addFavoriteAudio", new r11(26), new sf3(24));
        tfxVar.i("audio_ids", list);
        return tfxVar;
    }

    default tfx g(UserId userId, Integer num, ShortVideoAddToPlaylistPlaylistAliasDto shortVideoAddToPlaylistPlaylistAliasDto, List list, String str, String str2) {
        tfx tfxVar = new tfx("shortVideo.addToPlaylist", new t3j0(1), new eq0(27));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (num != null) {
            tfx.l(tfxVar, "playlist_id", num.intValue(), 0, 0, 12);
        }
        if (shortVideoAddToPlaylistPlaylistAliasDto != null) {
            tfx.o(tfxVar, "playlist_alias", shortVideoAddToPlaylistPlaylistAliasDto.i(), 0, 0, 12);
        }
        tfxVar.i("video_ids", list);
        if (str != null) {
            tfx.o(tfxVar, "before", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "after", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx i(UserId userId, String str) {
        tfx tfxVar = new tfx("shortVideo.setNotInterestedOwner", new com.vk.movika.sdk.base.model.n(26), new eq(29));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx j(UserId userId, Integer num, ShortVideoRemoveFromPlaylistPlaylistAliasDto shortVideoRemoveFromPlaylistPlaylistAliasDto, List list) {
        tfx tfxVar = new tfx("shortVideo.removeFromPlaylist", new igj0(0), new b690(4));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (num != null) {
            tfx.l(tfxVar, "playlist_id", num.intValue(), 0, 0, 12);
        }
        if (shortVideoRemoveFromPlaylistPlaylistAliasDto != null) {
            tfx.o(tfxVar, "playlist_alias", shortVideoRemoveFromPlaylistPlaylistAliasDto.i(), 0, 0, 12);
        }
        tfxVar.i("video_ids", list);
        return tfxVar;
    }

    default tfx k(UserId userId, List list) {
        tfx tfxVar = new tfx("shortVideo.deletePlaylists", new dt(26), new s3j0(1));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfxVar.i("playlist_ids", list);
        return tfxVar;
    }

    default tfx l(UserId userId, List list) {
        tfx tfxVar = new tfx("shortVideo.getUserSettings", new gsi0(1), new hsi0(1));
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ShortVideoGetUserSettingsSettingsIdsDto) it.next()).i());
        }
        tfxVar.i("settings_ids", arrayList);
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 12);
        }
        return tfxVar;
    }

    default tfx p(UserId userId, int i, ShortVideoSendRecommendedFeedbackTypeDto shortVideoSendRecommendedFeedbackTypeDto, String str) {
        tfx tfxVar = new tfx("shortVideo.sendRecommendedFeedback", new vr(29), new ky80(5));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 1, 0, 8);
        tfx.l(tfxVar, "type", shortVideoSendRecommendedFeedbackTypeDto.i(), 0, 0, 12);
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx r(UserId userId, int i, ShortVideoSetCoOwnerStatusStatusDto shortVideoSetCoOwnerStatusStatusDto, UserId userId2) {
        tfx tfxVar = new tfx("shortVideo.setCoOwnerStatus", new com.vk.movika.sdk.base.model.history.b(27), new fq(27));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 1, 0, 8);
        tfx.o(tfxVar, "status", shortVideoSetCoOwnerStatusStatusDto.i(), 0, 0, 12);
        if (userId2 != null) {
            tfx.n(tfxVar, "co_owner_id", userId2, 0L, 0L, 12);
        }
        return tfxVar;
    }

    default tfx t(String str) {
        tfx tfxVar = new tfx("shortVideo.getAudioMeta", new xr(28), new io.reactivex.rxjava3.processors.b(29));
        tfx.o(tfxVar, "audio", str, 0, 0, 12);
        return tfxVar;
    }

    default tfx u(List list) {
        tfx tfxVar = new tfx("shortVideo.removeFavoriteAudio", new s11(27), new to(29));
        tfxVar.i("audio_ids", list);
        return tfxVar;
    }

    default tfx v() {
        return new tfx("shortVideo.getDeviceBlacklists", new iq(28), new koi0(1));
    }

    default tfx x(UserId userId, ShortVideoAddPlaylistTypeDto shortVideoAddPlaylistTypeDto, String str) {
        tfx tfxVar = new tfx("shortVideo.addPlaylist", new sni0(2), new a690(5));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, "type", shortVideoAddPlaylistTypeDto.i(), 0, 0, 12);
        tfx.o(tfxVar, "title", str, 0, 255, 4);
        return tfxVar;
    }

    default tfx z(UserId userId, ShortVideoGetPlaylistsTypeDto shortVideoGetPlaylistsTypeDto, List list, List list2, List list3, String str, Integer num, String str2) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("shortVideo.getPlaylists", new tr(23), new ggj0(0));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (shortVideoGetPlaylistsTypeDto != null) {
            tfx.o(tfxVar, "type", shortVideoGetPlaylistsTypeDto.i(), 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("playlist_ids", list);
        }
        if (list2 != null) {
            List list4 = list2;
            arrayList = new ArrayList(c5g.u(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(((ShortVideoGetPlaylistsPlaylistAliasesDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("playlist_aliases", arrayList);
        }
        if (list3 != null) {
            tfxVar.i("playlist_raw_ids", list3);
        }
        if (str != null) {
            tfx.o(tfxVar, "video_id", str, 0, 0, 12);
        }
        if (num != null) {
            tfxVar.f(num.intValue(), 0, 200, "count");
        }
        if (str2 != null) {
            tfx.o(tfxVar, "start_from", str2, 0, 0, 12);
        }
        return tfxVar;
    }
}
