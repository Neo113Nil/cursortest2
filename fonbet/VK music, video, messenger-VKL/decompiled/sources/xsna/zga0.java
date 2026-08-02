package xsna;

import com.ironsource.Hb;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: PhotosService.kt */
/* loaded from: classes2.dex */
public interface zga0 {
    static xy2 b(aha0 aha0Var, UserId userId, String str, Boolean bool, Integer num, Integer num2, String str2, int i) {
        Boolean bool2 = Boolean.TRUE;
        Boolean bool3 = (i & 32) != 0 ? null : bool2;
        Boolean bool4 = (i & 256) != 0 ? null : bool2;
        Integer num3 = (i & 512) != 0 ? null : num;
        String str3 = (i & 4096) != 0 ? null : str2;
        if ((i & 8192) != 0) {
            bool2 = null;
        }
        aha0Var.getClass();
        tfx tfxVar = new tfx("photos.get", new r11(25), new sf3(22));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (str != null) {
            tfx.o(tfxVar, "album_id", str, 0, 0, 12);
        }
        tfxVar.j("rev", bool.booleanValue());
        if (bool3 != null) {
            tfxVar.j("extended", bool3.booleanValue());
        }
        if (bool4 != null) {
            tfxVar.j("photo_sizes", bool4.booleanValue());
        }
        if (num3 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 0, 8);
        }
        tfxVar.f(num2.intValue(), 0, 1000, "count");
        if (str3 != null) {
            tfx.o(tfxVar, "start_from", str3, 0, 0, 12);
        }
        if (bool2 != null) {
            tfxVar.j("cursor_pagination", bool2.booleanValue());
        }
        return tfxVar;
    }

    static xy2 c(aha0 aha0Var, UserId userId, List list, Integer num, Integer num2, Boolean bool, int i) {
        Boolean bool2 = Boolean.TRUE;
        UserId userId2 = (i & 1) != 0 ? null : userId;
        List list2 = (i & 4) != 0 ? null : list;
        Integer num3 = (i & 8) != 0 ? null : num;
        Integer num4 = (i & 16) != 0 ? null : num2;
        Boolean bool3 = (i & 32) != 0 ? null : bool;
        Boolean bool4 = (i & 64) != 0 ? null : bool2;
        if ((i & 128) != 0) {
            bool2 = null;
        }
        aha0Var.getClass();
        tfx tfxVar = new tfx("photos.getAlbums", new vr(26), new ky80(1));
        if (userId2 != null) {
            tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
        }
        if (list2 != null) {
            tfxVar.i("album_ids", list2);
        }
        if (num3 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 0, 8);
        }
        if (num4 != null) {
            tfx.l(tfxVar, "count", num4.intValue(), 0, 0, 8);
        }
        if (bool3 != null) {
            tfxVar.j("need_system", bool3.booleanValue());
        }
        if (bool4 != null) {
            tfxVar.j("need_covers", bool4.booleanValue());
        }
        if (bool2 != null) {
            tfxVar.j("photo_sizes", bool2.booleanValue());
        }
        return tfxVar;
    }

    static xy2 e(aha0 aha0Var, Integer num, UserId userId, String str) {
        aha0Var.getClass();
        tfx tfxVar = new tfx("photos.save", new vq(26), new wq(26));
        tfx.l(tfxVar, "album_id", num.intValue(), 0, 0, 12);
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 12);
        }
        if (str != null) {
            tfx.o(tfxVar, "photos_list", str, 0, 0, 12);
        }
        tfxVar.j("upload_v2", true);
        return tfxVar;
    }

    static xy2 g(aha0 aha0Var, String str, UserId userId, String str2, String str3, Boolean bool, String str4, String str5) {
        aha0Var.getClass();
        tfx tfxVar = new tfx("photos.saveOwnerPhoto", new iq(22), new jq(28));
        if (str != null) {
            tfx.o(tfxVar, "photo", str, 0, 0, 12);
        }
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "full_crop", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "square_crop", str3, 0, 0, 12);
        }
        tfxVar.j("upload_v2", true);
        tfxVar.j("skip_post", bool.booleanValue());
        if (str4 != null) {
            tfx.o(tfxVar, "source", str4, 0, 0, 12);
        }
        if (str5 != null) {
            tfx.o(tfxVar, "screen", str5, 0, 0, 12);
        }
        return tfxVar;
    }

    static xy2 i(aha0 aha0Var, Integer num, Integer num2, String str, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        aha0Var.getClass();
        tfx tfxVar = new tfx("photos.getRecognitionTags", new tr(21), new ur(28));
        if (num != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        }
        if (num2 != null) {
            tfxVar.f(num2.intValue(), 0, 100, "count");
        }
        if (bool != null) {
            tfxVar.j("real_tags", bool.booleanValue());
        }
        tfxVar.j("extended", true);
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        return tfxVar;
    }

    static xy2 j(aha0 aha0Var, Integer num, Integer num2, Integer num3, Integer num4, String str) {
        aha0Var.getClass();
        tfx tfxVar = new tfx("photos.saveOwnerCoverPhoto", new qq(19), new rq(22));
        if (num != null) {
            tfx.l(tfxVar, "crop_x", num.intValue(), 0, 0, 8);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "crop_height", num2.intValue(), 0, 0, 8);
        }
        if (num3 != null) {
            tfx.l(tfxVar, "crop_y", num3.intValue(), 0, 0, 8);
        }
        if (num4 != null) {
            tfx.l(tfxVar, "crop_width", num4.intValue(), 0, 0, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "response_json", str, 0, 0, 12);
        }
        tfxVar.j("upload_v2", true);
        tfx.o(tfxVar, "hash", "", 0, 0, 12);
        tfx.o(tfxVar, "photo", "", 0, 0, 12);
        return tfxVar;
    }

    static xy2 k(aha0 aha0Var, String str, UserId userId, UserId userId2, Integer num, String str2, Boolean bool, int i) {
        UserId userId3 = (i & 2) != 0 ? null : userId;
        UserId userId4 = (i & 4) != 0 ? null : userId2;
        Integer num2 = (i & 16) != 0 ? null : num;
        String str3 = (i & 32) == 0 ? str2 : null;
        aha0Var.getClass();
        tfx tfxVar = new tfx("photos.saveWallPhoto", new l4(27), new nq(20));
        tfx.o(tfxVar, "photo", str, 0, 0, 12);
        if (userId3 != null) {
            tfx.n(tfxVar, "user_id", userId3, 0L, 0L, 8);
        }
        if (userId4 != null) {
            tfx.n(tfxVar, "group_id", userId4, 0L, 0L, 8);
        }
        if (num2 != null) {
            tfx.l(tfxVar, Hb.a, num2.intValue(), 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "hash", str3, 0, 0, 12);
        }
        tfxVar.j("upload_v2", bool.booleanValue());
        return tfxVar;
    }

    static /* synthetic */ xy2 l(zga0 zga0Var, List list, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 2) != 0) {
            bool = null;
        }
        return zga0Var.f(list, bool);
    }

    static xy2 m(aha0 aha0Var) {
        aha0Var.getClass();
        tfx tfxVar = new tfx("photos.getOwnerCoverPhotoUploadServer", new kq(27), new sq(19));
        tfxVar.j("upload_v2", true);
        return tfxVar;
    }

    static xy2 p(aha0 aha0Var, UserId userId, Integer num, List list, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        aha0Var.getClass();
        tfx tfxVar = new tfx("photos.delete", new ao(27), new wga0(0));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "photo_id", num.intValue(), 0, 0, 8);
        }
        if (list != null) {
            tfxVar.i("photos", list);
        }
        return tfxVar;
    }

    default tfx d(UserId userId, Boolean bool) {
        tfx tfxVar = new tfx("photos.getWallUploadServer", new ct(22), new wp(26));
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 12);
        }
        tfxVar.j("upload_v2", bool.booleanValue());
        return tfxVar;
    }

    default tfx f(List list, Boolean bool) {
        tfx tfxVar = new tfx("photos.getById", new dt(23), new et(27));
        tfxVar.i("photos", list);
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        return tfxVar;
    }

    default tfx h(int i, UserId userId) {
        tfx tfxVar = new tfx("photos.agreeBlurRestriction", new xr(27), new io.reactivex.rxjava3.processors.b(27));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "photo_id", i, 0, 0, 8);
        return tfxVar;
    }

    default tfx n(UserId userId) {
        tfx tfxVar = new tfx("photos.removeOwnerCoverPhoto", new v11(24), new yga0(0));
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 12);
        }
        return tfxVar;
    }

    default tfx o(ArrayList arrayList, Boolean bool) {
        tfx tfxVar = new tfx("photos.confirmTags", new lq(25), new mq(25));
        tfxVar.i("tags", arrayList);
        tfxVar.j("is_real", bool.booleanValue());
        return tfxVar;
    }
}
