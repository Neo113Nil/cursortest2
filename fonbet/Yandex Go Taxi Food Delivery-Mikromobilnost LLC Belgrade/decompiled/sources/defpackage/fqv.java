package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class fqv {
    public final String a;
    public final ct10 b;
    public final JSONObject c;
    public final String d;
    public final String e;
    public final String f;

    public fqv(JSONObject jSONObject) {
        String string = jSONObject.getString("channelId");
        JSONObject f = hbb1.f("error", jSONObject);
        ct10 ct10Var = f == null ? null : new ct10(f);
        JSONObject f2 = hbb1.f(Constants.KEY_DATA, jSONObject);
        String string2 = jSONObject.getString("id");
        String g = hbb1.g("refId", jSONObject);
        String string3 = jSONObject.getString("type");
        this.a = string;
        this.b = ct10Var;
        this.c = f2;
        this.d = string2;
        this.e = g;
        this.f = string3;
    }

    public final JSONObject a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqv)) {
            return false;
        }
        fqv fqvVar = (fqv) obj;
        return jl40.l(this.a, fqvVar.a) && jl40.l(this.b, fqvVar.b) && jl40.l(this.c, fqvVar.c) && jl40.l(this.d, fqvVar.d) && jl40.l(this.e, fqvVar.e) && jl40.l(this.f, fqvVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ct10 ct10Var = this.b;
        int hashCode2 = (hashCode + (ct10Var == null ? 0 : ct10Var.hashCode())) * 31;
        JSONObject jSONObject = this.c;
        int b = unr0.b((hashCode2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((b + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncomingWebMessage(channelId=");
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
