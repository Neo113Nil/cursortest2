package yads;

import org.json.JSONObject;
import xsna.epx;

/* loaded from: classes10.dex */
public final class bg {
    public final String a;
    public final String b;

    public bg(cg cgVar, JSONObject jSONObject) {
        this.a = cgVar.a();
        this.b = jSONObject.toString();
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return epx.f(bgVar.a, this.a) && epx.f(bgVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
