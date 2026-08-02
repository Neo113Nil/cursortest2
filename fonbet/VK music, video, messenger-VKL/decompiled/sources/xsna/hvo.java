package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: EasterEggsQueueEvent.kt */
/* loaded from: classes5.dex */
public final class hvo implements dre0<a> {
    public final UserId a;

    /* compiled from: EasterEggsQueueEvent.kt */
    public static final class a {
    }

    public hvo(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.dre0
    public final a a(JSONObject jSONObject) {
        return new a();
    }

    @Override // xsna.dre0
    public final String b() {
        return "eastereggs_" + this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvo) && epx.f(this.a, ((hvo) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("EasterEggsQueueEvent(userId="), this.a, ')');
    }
}
