package xsna;

import com.vk.api.generated.audio.dto.AudioGetAudioPreviewUrlPreviewTypeDto;
import com.vk.api.generated.audio.dto.AudioGetIdsBySourceSourceDto;
import com.vk.api.generated.audio.dto.AudioGetPlaylistByIdExtendedExtraFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: AudioService.kt */
/* loaded from: classes.dex */
public interface hx4 {
    static /* synthetic */ xy2 C(hx4 hx4Var, UserId userId, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            num3 = null;
        }
        if ((i & 256) != 0) {
            bool = null;
        }
        if ((i & 1024) != 0) {
            str = null;
        }
        return hx4Var.g(userId, num, num2, num3, num4, bool, str, (i & 2048) != 0 ? null : str2);
    }

    static /* synthetic */ xy2 o(hx4 hx4Var, List list, String str, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        return hx4Var.A(str, list);
    }

    static /* synthetic */ xy2 r(hx4 hx4Var, UserId userId, Integer num, Integer num2, Integer num3, String str, String str2, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            num2 = null;
        }
        if ((i & 128) != 0) {
            num3 = null;
        }
        if ((i & 256) != 0) {
            bool = null;
        }
        if ((i & 1024) != 0) {
            str = null;
        }
        return hx4Var.q(userId, num, num2, num3, bool, str, (i & 2048) != 0 ? null : str2);
    }

    static xy2 t(ix4 ix4Var, UserId userId, Integer num, Integer num2, String str, int i) {
        Boolean bool = Boolean.TRUE;
        Integer num3 = (i & 8) != 0 ? null : num2;
        String str2 = (i & 16) != 0 ? null : str;
        if ((i & 32) != 0) {
            bool = null;
        }
        ix4Var.getClass();
        tfx tfxVar = new tfx("audio.getPlaylists", new k73(3), new pm0(4));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfxVar.f(num.intValue(), 0, 200, "count");
        if (num3 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 0, 8);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "start_from", str2, 0, 0, 12);
        }
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 v(hx4 hx4Var, UserId userId, String str, String str2, List list, Boolean bool, int i) {
        String str3;
        Boolean bool2;
        List list2;
        String str4;
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            list2 = list;
            str4 = str2;
            str3 = str;
            bool2 = null;
        } else {
            String str5 = str2;
            str3 = str;
            bool2 = bool;
            list2 = list;
            str4 = str5;
        }
        return hx4Var.u(userId, bool2, str3, str4, list2);
    }

    static /* synthetic */ xy2 x(hx4 hx4Var, UserId userId, int i, String str, Integer num, String str2, int i2) {
        Boolean bool = Boolean.TRUE;
        if ((i2 & 4) != 0) {
            bool = null;
        }
        if ((i2 & 16) != 0) {
            str = null;
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        return hx4Var.a(userId, i, bool, str, num, (i2 & 64) != 0 ? null : str2);
    }

    default tfx A(String str, List list) {
        tfx tfxVar = new tfx("audio.getById", new kq(6), new lq(5));
        tfxVar.i("audios", list);
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx B(String str) {
        tfx tfxVar = new tfx("audio.followCurator", new mq(5), new l4(4));
        tfx.o(tfxVar, "curator_id", str, 0, 0, 12);
        return tfxVar;
    }

    default tfx a(UserId userId, int i, Boolean bool, String str, Integer num, String str2) {
        tfx tfxVar = new tfx("audio.getPlaylistById", new dq(3), new com.vk.movika.sdk.base.model.n(3));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "playlist_id", i, 0, 0, 12);
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        if (str != null) {
            tfx.o(tfxVar, "access_key", str, 0, 0, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "track_count", num.intValue(), 0, 30, 4);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx b(String str) {
        tfx tfxVar = new tfx("audio.getLyrics", new wp(3), new cq(3));
        if (str != null) {
            tfx.o(tfxVar, "audio_id", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx c(String str) {
        tfx tfxVar = new tfx("audio.unfollowCurator", new com.vk.movika.sdk.android.defaultplayer.interactive.c(4), new ar(3));
        tfx.o(tfxVar, "curator_id", str, 0, 0, 12);
        return tfxVar;
    }

    default tfx d(String str, String str2) {
        tfx tfxVar = new tfx("audio.followArtist", new qq(2), new rq(2));
        tfx.o(tfxVar, "artist_id", str, 0, 0, 12);
        tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        return tfxVar;
    }

    default tfx e(AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto, String str, String str2) {
        tfx tfxVar = new tfx("audio.getIdsBySource", new tf3(1), new uf3(1));
        if (audioGetIdsBySourceSourceDto != null) {
            tfx.o(tfxVar, "source", audioGetIdsBySourceSourceDto.j(), 0, 0, 12);
        }
        if (str != null) {
            tfx.o(tfxVar, "entity_id", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx f(UserId userId) {
        tfx tfxVar = new tfx("audio.followOwner", new uq(2), new vq(3));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        return tfxVar;
    }

    default tfx g(UserId userId, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, String str, String str2) {
        tfx tfxVar = new tfx("audio.get", new dr(4), new com.vk.movika.sdk.android.defaultplayer.view.a(5));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "playlist_id", num.intValue(), 0, 0, 12);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "shuffle_seed", num2.intValue(), 0, 0, 12);
        }
        if (num3 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 0, 8);
        }
        tfx.l(tfxVar, "count", num4.intValue(), 0, 0, 8);
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        if (str != null) {
            tfx.o(tfxVar, "access_key", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx h(String str, String str2) {
        tfx tfxVar = new tfx("audio.unfollowArtist", new br(6), new cr(4));
        tfx.o(tfxVar, "artist_id", str, 0, 0, 12);
        tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        return tfxVar;
    }

    default tfx i(UserId userId, int i, List list) {
        tfx tfxVar = new tfx("audio.addToPlaylist", new rr(4), new zn(4));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "playlist_id", i, 0, 0, 8);
        tfxVar.i("audio_ids", list);
        return tfxVar;
    }

    default tfx j(String str, AudioGetAudioPreviewUrlPreviewTypeDto audioGetAudioPreviewUrlPreviewTypeDto) {
        tfx tfxVar = new tfx("audio.getAudioPreviewUrl", new sf3(2), new s11(2));
        tfx.o(tfxVar, "audio_id", str, 0, 0, 12);
        if (audioGetAudioPreviewUrlPreviewTypeDto != null) {
            tfx.o(tfxVar, "preview_type", audioGetAudioPreviewUrlPreviewTypeDto.j(), 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx k(int i, UserId userId) {
        tfx tfxVar = new tfx("audio.restore", new ir(3), new to(4));
        tfx.l(tfxVar, "audio_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        return tfxVar;
    }

    default tfx l(int i, String str, String str2, ArrayList arrayList) {
        tfx tfxVar = new tfx("audio.getAutoflowMixParams", new j8(4), new jh(3));
        tfx.l(tfxVar, "count", i, 0, 0, 8);
        tfx.o(tfxVar, "queue_type", str, 0, 0, 12);
        tfxVar.i("audio_ids", arrayList);
        if (str2 != null) {
            tfx.o(tfxVar, "queue_entity_id", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx m(UserId userId) {
        tfx tfxVar = new tfx("audio.unfollowOwner", new xq(3), new yq(3));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        return tfxVar;
    }

    default tfx n(Boolean bool, String str) {
        tfx tfxVar = new tfx("audio.getRecommendations", new sq(3), new tq(4));
        if (str != null) {
            tfx.o(tfxVar, "target_audio", str, 0, 0, 12);
        }
        tfxVar.f(100, 0, 1000, "count");
        tfxVar.j("is_child", bool.booleanValue());
        return tfxVar;
    }

    default tfx p(UserId userId, int i, List list, String str, Integer num, String str2) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("audio.getPlaylistById", new sn(8), new nr(4));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "playlist_id", i, 0, 0, 12);
        tfxVar.j("extended", true);
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AudioGetPlaylistByIdExtendedExtraFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("extra_fields", arrayList);
        }
        if (str != null) {
            tfx.o(tfxVar, "access_key", str, 0, 0, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "track_count", num.intValue(), 0, 30, 4);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx q(UserId userId, Integer num, Integer num2, Integer num3, Boolean bool, String str, String str2) {
        tfx tfxVar = new tfx("getAudios", new ct(3), new dt(4));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "playlist_id", num.intValue(), 0, 0, 12);
        }
        if (num2 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 0, 8);
        }
        if (num3 != null) {
            tfx.l(tfxVar, "count", num3.intValue(), 0, 0, 8);
        }
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        if (str != null) {
            tfx.o(tfxVar, "access_key", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx s(UserId userId, String str) {
        tfx tfxVar = new tfx("audio.createPlaylistByFilter", new pr(4), new qr(6));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "filter", str, 0, 256, 4);
        }
        return tfxVar;
    }

    default tfx u(UserId userId, Boolean bool, String str, String str2, List list) {
        tfx tfxVar = new tfx("audio.createPlaylist", new iq(2), new jq(5));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, "title", str, 0, 1024, 4);
        if (str2 != null) {
            tfx.o(tfxVar, "description", str2, 0, 1024, 4);
        }
        if (list != null) {
            tfxVar.i("audio_ids", list);
        }
        if (bool != null) {
            tfxVar.j("no_discover", bool.booleanValue());
        }
        return tfxVar;
    }

    default tfx w(ArrayList arrayList) {
        tfx tfxVar = new tfx("audio.radioGetById", new io.reactivex.rxjava3.internal.operators.mixed.j(4), new io.reactivex.rxjava3.internal.operators.mixed.k(4));
        tfxVar.i("station_ids", arrayList);
        return tfxVar;
    }

    default tfx y(int i, UserId userId, String str, String str2, String str3) {
        tfx tfxVar = new tfx("audio.add", new eq0(3), new eq(2));
        tfx.l(tfxVar, "audio_id", i, 0, 0, 8);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "access_key", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "track_code", str3, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx z(boolean z) {
        tfx tfxVar = new tfx("audio.setKidsMode", new en(5), new io.reactivex.rxjava3.internal.operators.observable.q1(5));
        tfxVar.j("state", z);
        return tfxVar;
    }
}
