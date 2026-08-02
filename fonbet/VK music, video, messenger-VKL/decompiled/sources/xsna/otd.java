package xsna;

import org.json.JSONObject;

/* compiled from: ClipsDraftSdk.kt */
/* loaded from: classes17.dex */
public final class otd {
    public final ptd a;
    public final JSONObject b;

    public otd(ptd ptdVar, JSONObject jSONObject) {
        this.a = ptdVar;
        this.b = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otd)) {
            return false;
        }
        otd otdVar = (otd) obj;
        return epx.f(this.a, otdVar.a) && epx.f(this.b, otdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClipsDraftSdk(sdkData=" + this.a + ", extraData=" + this.b + ')';
    }
}
