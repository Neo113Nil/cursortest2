package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: UpdateCountersQueueEvent.kt */
/* loaded from: classes5.dex */
public final class b8q0 implements dre0<a> {
    public final UserId a;

    /* compiled from: UpdateCountersQueueEvent.kt */
    public static final class a {
        public final String a;
        public final int b;

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Info(type=");
            sb.append(this.a);
            sb.append(", count=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public b8q0(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.dre0
    public final a a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        return new a(jSONObject2.getString("type"), jSONObject2.optInt("count"));
    }

    @Override // xsna.dre0
    public final String b() {
        return "accountcounters_" + this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8q0) && epx.f(this.a, ((b8q0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("UpdateCountersQueueEvent(userId="), this.a, ')');
    }
}
