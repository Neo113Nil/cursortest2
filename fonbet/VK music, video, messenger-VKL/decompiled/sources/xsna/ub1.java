package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AgreeDisclaimer.kt */
/* loaded from: classes15.dex */
public final class ub1 extends rsg0<a> {

    /* compiled from: AgreeDisclaimer.kt */
    public static final class a {
        public final ArrayList a;
        public final long b;

        public a(ArrayList arrayList, long j) {
            this.a = arrayList;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AgreeDisclaimerResponse(disclaimerTypes=");
            sb.append(this.a);
            sb.append(", expirationTime=");
            return vu5.a(')', this.b, sb);
        }
    }

    public ub1(UserId userId, int i) {
        super("video.agreeDisclaimer");
        F(userId, "owner_id");
        C(i, "video_id");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject2.getJSONArray("disclaimer_types");
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            }
        }
        return new a(arrayList, jSONObject2.has("expiration_time") ? jSONObject2.getLong("expiration_time") : 0L);
    }
}
