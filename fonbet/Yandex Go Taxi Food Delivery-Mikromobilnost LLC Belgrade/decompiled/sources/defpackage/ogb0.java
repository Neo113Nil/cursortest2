package defpackage;

import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ogb0 extends cj91 {
    public final JSONObject b;

    public ogb0(JSONObject jSONObject) {
        this.b = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogb0) && this.b.equals(((ogb0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LoadPreInstructionState(preInstructionJSON=" + this.b + Extension.C_BRAKE;
    }
}
