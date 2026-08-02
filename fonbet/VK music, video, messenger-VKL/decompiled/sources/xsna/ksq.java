package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: FaveTrackPageInteraction.kt */
/* loaded from: classes4.dex */
public final class ksq extends rsg0<Boolean> {
    public ksq(UserId userId, boolean z) {
        super("fave.trackPageInteraction");
        F(fkq0.a(userId), z ? "group_id" : "user_id");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.getInt("response") == 1);
    }
}
