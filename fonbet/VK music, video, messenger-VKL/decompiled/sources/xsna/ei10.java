package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MasksRemoveEffectFromFavorite.kt */
/* loaded from: classes15.dex */
public final class ei10 extends xsg0 {
    public ei10(int i, UserId userId, String str, String str2) {
        super("photos.editAlbum");
        C(i, "album_id");
        F(userId, "owner_id");
        K("title", str);
        K("description", str2);
    }

    public ei10(String str, String str2, String str3, int i, UserId userId, String str4) {
        this(i, userId, str, str2);
        K("privacy_view", str3);
        K("privacy_comment", str4);
    }

    public ei10(int i, String str, String str2, boolean z, boolean z2, UserId userId) {
        this(i, userId, str, str2);
        K("upload_by_admins_only", z ? "1" : "0");
        K("comments_disabled", z2 ? "1" : "0");
    }
}
