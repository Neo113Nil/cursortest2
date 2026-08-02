package defpackage;

import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.entities.models.VideoResolutionRestrictions;

/* loaded from: classes4.dex */
public final class kn31 extends abo {
    public final aj31 a;
    public final JSONObject b;
    public final VideoResolutionRestrictions c;

    public kn31(aj31 aj31Var, JSONObject jSONObject, VideoResolutionRestrictions videoResolutionRestrictions) {
        this.a = aj31Var;
        this.b = jSONObject;
        this.c = videoResolutionRestrictions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kn31) {
            kn31 kn31Var = (kn31) obj;
            if (this.a == kn31Var.a && this.b.equals(kn31Var.b) && jl40.l(this.c, kn31Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InitEvent(provider=" + this.a + ", customizationData=" + this.b + ", videoResolutionRestrictions=" + this.c + Extension.C_BRAKE;
    }
}
