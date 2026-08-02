package xsna;

import org.json.JSONObject;

/* compiled from: AppLaunchParams.kt */
/* loaded from: classes6.dex */
public final class z53 {
    public final JSONObject a;

    public z53(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z53) && epx.f(this.a, ((z53) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AppLaunchParams(json=" + this.a + ')';
    }
}
