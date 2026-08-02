package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: BoardDeleteTopic.java */
/* loaded from: classes14.dex */
public final class zh7 extends xsg0 {
    public final /* synthetic */ int s = 1;

    public zh7(UserId userId, int i) {
        super("board.deleteTopic");
        F(userId, "group_id");
        C(i, "topic_id");
    }

    @Override // xsna.xsg0
    /* renamed from: F0 */
    public Boolean a(JSONObject jSONObject) {
        switch (this.s) {
            case 1:
                return Boolean.TRUE;
            default:
                return super.a(jSONObject);
        }
    }

    @Override // xsna.xsg0, xsna.oer0, xsna.k7r0
    public /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 1:
                return Boolean.TRUE;
            default:
                return super.a(jSONObject);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zh7(int i, int i2, int i3, UserId userId, String str, String str2, String str3) {
        super(r0);
        String str4 = "wall.deleteComment";
        if (i3 != 0) {
            if (i3 == 1) {
                str4 = "photos.deleteComment";
            } else if (i3 == 2 || i3 == 6) {
                str4 = "video.deleteComment";
            }
        }
        F(userId, "owner_id");
        C(i2, "comment_id");
        if (i3 == 1) {
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
