package xsna;

import android.text.TextUtils;
import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* compiled from: UsersGetOne.java */
/* loaded from: classes15.dex */
public final class e1r0 extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1r0(String str, int i) {
        super(str);
        this.s = i;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return new UserProfile(jSONObject.getJSONArray("response").getJSONObject(0));
            default:
                return Integer.valueOf(jSONObject.getInt("response"));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e1r0(UserId userId) {
        this(userId, new String[]{"photo_base", X3.j.D, "verified", "trending", "is_verified", "emoji_status", "image_status", "is_nft"});
        this.s = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1r0(UserId userId, String[] strArr) {
        super("users.get");
        this.s = 0;
        F(userId, "user_ids");
        K("fields", TextUtils.join(StringUtils.COMMA, strArr));
    }
}
