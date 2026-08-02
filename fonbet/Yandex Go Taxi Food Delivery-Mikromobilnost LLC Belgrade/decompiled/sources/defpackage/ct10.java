package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ct10 {
    public final String a;
    public final String b;

    public ct10(JSONObject jSONObject) {
        String string = jSONObject.getString(Constants.KEY_MESSAGE);
        String string2 = jSONObject.getString("serializeId");
        this.a = string;
        this.b = string2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct10)) {
            return false;
        }
        ct10 ct10Var = (ct10) obj;
        return jl40.l(this.a, ct10Var.a) && jl40.l(this.b, ct10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("MessageError(message=", this.a, ", serializeId=", this.b, Extension.C_BRAKE);
    }
}
