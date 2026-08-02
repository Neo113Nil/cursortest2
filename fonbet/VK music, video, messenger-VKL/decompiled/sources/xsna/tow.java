package xsna;

import org.json.JSONObject;

/* compiled from: ImmutableJSONObject.kt */
/* loaded from: classes17.dex */
public final class tow {
    public final String a;

    public tow(JSONObject jSONObject) {
        this.a = jSONObject.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !tow.class.equals(obj.getClass())) {
            return false;
        }
        tow towVar = obj instanceof tow ? (tow) obj : null;
        if (towVar == null) {
            return false;
        }
        return epx.f(this.a, towVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
