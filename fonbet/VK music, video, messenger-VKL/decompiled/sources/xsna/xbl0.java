package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StickersQueueEvent.kt */
/* loaded from: classes5.dex */
public final class xbl0 implements dre0<String> {
    public final UserId a;

    public xbl0(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.dre0
    public final String a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null) {
            return "";
        }
        try {
            return optJSONObject.getString("owner_global_id");
        } catch (JSONException unused) {
            return "";
        }
    }

    @Override // xsna.dre0
    public final String b() {
        return "stickers_" + this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xbl0) && epx.f(this.a, ((xbl0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("StickersQueueEvent(userId="), this.a, ')');
    }
}
