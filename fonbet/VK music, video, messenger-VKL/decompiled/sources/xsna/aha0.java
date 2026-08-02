package xsna;

import com.ironsource.Hb;
import com.vk.dto.common.id.UserId;

/* compiled from: PhotosService.kt */
/* loaded from: classes2.dex */
public final class aha0 implements zga0 {
    public final tfx q() {
        return new tfx("photos.getCommunityReviewsUploadServer", new gr(26), new dn(28));
    }

    public final tfx r() {
        return new tfx("photos.getItemsReviewsUploadServer", new zy60(1), new wd10(6));
    }

    public final tfx s(UserId userId) {
        tfx tfxVar = new tfx("photos.getMarketAlbumUploadServer", new com.vk.movika.sdk.android.defaultplayer.interactive.c(23), new ar(26));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        return tfxVar;
    }

    public final tfx t(UserId userId, Integer num) {
        tfx tfxVar = new tfx("photos.getUploadServer", new hr(26), new az60(1));
        tfxVar.j("upload_v2", true);
        tfx.l(tfxVar, "album_id", num.intValue(), 0, 0, 12);
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 12);
        }
        return tfxVar;
    }

    public final tfx u(UserId userId, String str) {
        tfx tfxVar = new tfx("photos.saveCommunityReviewsPhotos", new tq(21), new uq(22));
        tfx.o(tfxVar, "response_json", str, 0, 0, 12);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        return tfxVar;
    }

    public final tfx v(UserId userId, String str) {
        tfx tfxVar = new tfx("photos.saveItemsReviewsPhotos", new oq(25), new pq(16));
        tfx.o(tfxVar, "response_json", str, 0, 0, 12);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        return tfxVar;
    }

    public final tfx w(int i, UserId userId, String str, String str2) {
        tfx tfxVar = new tfx("photos.saveMarketAlbumPhoto", new gq(28), new hq(25));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.o(tfxVar, "photo", str, 0, 0, 12);
        tfx.l(tfxVar, Hb.a, i, 0, 0, 8);
        tfx.o(tfxVar, "hash", str2, 0, 0, 12);
        return tfxVar;
    }
}
