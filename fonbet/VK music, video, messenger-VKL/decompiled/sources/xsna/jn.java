package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: AccountBan.kt */
/* loaded from: classes14.dex */
public final class jn extends xsg0 {
    public jn(UserId userId, boolean z) {
        super(z ? "account.ban" : "account.unban");
        F(userId, "owner_id");
    }

    @Override // xsna.xsg0, xsna.oer0, xsna.k7r0
    /* renamed from: F0 */
    public final Boolean a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optInt("response") == 1);
    }
}
