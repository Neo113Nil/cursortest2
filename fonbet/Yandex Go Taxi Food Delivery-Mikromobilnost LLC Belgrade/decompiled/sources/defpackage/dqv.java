package defpackage;

import com.yandex.messaging.miniapps.js.messages.MiniAppMessageError;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class dqv {
    public final String a;
    public final MiniAppMessageError b;
    public final JSONObject c;
    public final String d;
    public final String e;
    public final String f;

    public dqv(JSONObject jSONObject) {
        String string = jSONObject.getString("channelId");
        JSONObject jSONObject2 = jSONObject.has("error") ? jSONObject.getJSONObject("error") : null;
        MiniAppMessageError miniAppMessageError = jSONObject2 == null ? null : new MiniAppMessageError(jSONObject2);
        JSONObject jSONObject3 = jSONObject.has(Constants.KEY_DATA) ? jSONObject.getJSONObject(Constants.KEY_DATA) : null;
        String string2 = jSONObject.getString("id");
        String a = gbb1.a("refId", jSONObject);
        String string3 = jSONObject.getString("type");
        this.a = string;
        this.b = miniAppMessageError;
        this.c = jSONObject3;
        this.d = string2;
        this.e = a;
        this.f = string3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqv)) {
            return false;
        }
        dqv dqvVar = (dqv) obj;
        return jl40.l(this.a, dqvVar.a) && jl40.l(this.b, dqvVar.b) && jl40.l(this.c, dqvVar.c) && jl40.l(this.d, dqvVar.d) && jl40.l(this.e, dqvVar.e) && jl40.l(this.f, dqvVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MiniAppMessageError miniAppMessageError = this.b;
        int hashCode2 = (hashCode + (miniAppMessageError == null ? 0 : miniAppMessageError.hashCode())) * 31;
        JSONObject jSONObject = this.c;
        int b = unr0.b((hashCode2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((b + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncomingMiniAppMessage(channelId=");
        sb.append(this.a);
        sb.append(", error=");
        sb.append(this.b);
        sb.append(", data=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", refId=");
        return g8e.r(sb, this.e, ", type=", this.f, Extension.C_BRAKE);
    }
}
