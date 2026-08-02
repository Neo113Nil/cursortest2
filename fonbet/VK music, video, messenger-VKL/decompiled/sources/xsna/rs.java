package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.ls;

/* compiled from: AccountSettingsUpdateQueueEvent.kt */
/* loaded from: classes5.dex */
public final class rs implements dre0<List<? extends ls>> {
    public final UserId a;

    public rs(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.dre0
    public final List<? extends ls> a(JSONObject jSONObject) {
        Boolean q;
        ArrayList arrayList = new ArrayList();
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("privacy") : null;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                String A = f370.A("key", jSONObject2);
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("value");
                ls.a aVar = (A == null || optJSONObject2 == null || !A.equals("closed_profile") || (q = f370.q(optJSONObject2, "is_enabled")) == null) ? null : new ls.a(q.booleanValue());
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    @Override // xsna.dre0
    public final String b() {
        return "accountsettings_" + this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rs) && epx.f(this.a, ((rs) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("AccountSettingsUpdateQueueEvent(uid="), this.a, ')');
    }
}
