package defpackage;

import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class cib0 extends abo {
    public final JSONObject a;
    public final String b;

    public cib0(JSONObject jSONObject, String str) {
        this.a = jSONObject;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cib0)) {
            return false;
        }
        cib0 cib0Var = (cib0) obj;
        return this.a.equals(cib0Var.a) && this.b.equals(cib0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadPreInstructionEvent(customizationData=" + this.a + ", preInstructionText=" + this.b + Extension.C_BRAKE;
    }
}
