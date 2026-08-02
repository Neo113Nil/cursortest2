package xsna;

import androidx.annotation.Nullable;
import com.vk.dto.common.id.UserId;

/* compiled from: WallRestoreComment.java */
/* loaded from: classes4.dex */
public final class hax0 extends xsg0 {
    public hax0(int i, int i2, int i3, UserId userId, String str, String str2, @Nullable String str3) {
        super(i3 != 1 ? (i3 == 2 || i3 == 6) ? "video.restoreComment" : "wall.restoreComment" : "photos.restoreComment");
        if (i3 == 0 || i3 == 2 || i3 == 6) {
            F(userId, "owner_id");
            C(i2, "comment_id");
        }
        if (i3 == 1) {
            F(userId, "owner_id");
            C(i2, "comment_id");
            C(i, "photo_id");
        }
        if (str != null) {
            K("access_key", str);
        }
        if (str2 != null && (i3 == 2 || i3 == 6)) {
            K("ref", str2);
        }
        if (str3 == null || i3 != 2) {
            return;
        }
        K("screen_mode", str3);
    }
}
