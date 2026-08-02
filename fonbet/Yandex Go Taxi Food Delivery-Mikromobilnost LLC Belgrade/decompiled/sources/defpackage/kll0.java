package defpackage;

import io.appmetrica.analytics.RtmErrorEvent;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class kll0 {
    public final RtmErrorEvent a;
    public final JSONObject b;
    public final JSONObject c;

    public kll0(RtmErrorEvent rtmErrorEvent, JSONObject jSONObject, JSONObject jSONObject2) {
        this.a = rtmErrorEvent;
        this.b = jSONObject;
        this.c = jSONObject2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kll0)) {
            return false;
        }
        kll0 kll0Var = (kll0) obj;
        return this.a.equals(kll0Var.a) && this.b.equals(kll0Var.b) && this.c.equals(kll0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SDKRtmToEventResult(errorEvent=" + this.a + ", additionalJson=" + this.b + ", filteredAdditionalJson=" + this.c + Extension.C_BRAKE;
    }
}
