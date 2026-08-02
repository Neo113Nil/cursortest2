package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import org.json.JSONObject;

/* compiled from: FriendsOnlineChangeQueueEvent.kt */
/* loaded from: classes5.dex */
public final class mrs implements dre0<a> {
    public final UserId a;

    /* compiled from: FriendsOnlineChangeQueueEvent.kt */
    public static final class a {
        public final UserId a;
        public final VisibleStatus b;

        public a(UserId userId, VisibleStatus visibleStatus) {
            this.a = userId;
            this.b = visibleStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            return "Info(userId=" + this.a + ", status=" + this.b + ')';
        }
    }

    public mrs(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.dre0
    public final a a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        return new a(new UserId(jSONObject2.getLong("user_id")), new VisibleStatus(1000 * jSONObject2.getLong("last_seen"), jSONObject2.getBoolean(eok.ONLINE_EXTRAS_KEY), jSONObject2.optInt("app_id", 0), jSONObject2.optInt("platform", 0) == 7 ? Platform.WEB : Platform.MOBILE));
    }

    @Override // xsna.dre0
    public final String b() {
        return "onlfriends_" + this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mrs) && epx.f(this.a, ((mrs) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("FriendsOnlineChangeQueueEvent(userId="), this.a, ')');
    }
}
