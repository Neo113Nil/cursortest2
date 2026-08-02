package xsna;

import org.json.JSONObject;

/* compiled from: AccessToken.kt */
/* loaded from: classes6.dex */
public final class vj {
    public final String a;
    public final int b;
    public final long c;

    public vj(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public static vj a(int i, long j, String str) {
        return new vj(str, i, j);
    }

    public static vj b(vj vjVar, String str) {
        return new vj(str, vjVar.b, vjVar.c);
    }

    public final long c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj)) {
            return false;
        }
        vj vjVar = (vj) obj;
        return epx.f(this.a, vjVar.a) && this.b == vjVar.b && this.c == vjVar.c;
    }

    public final JSONObject f() {
        return new JSONObject().put("value", this.a).put("expiresInSec", this.b).put("createdMs", this.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessToken(value=");
        sb.append(this.a);
        sb.append(", expiresInSec=");
        sb.append(this.b);
        sb.append(", createdMs=");
        return vu5.a(')', this.c, sb);
    }

    public vj(JSONObject jSONObject) {
        this(jSONObject.optString("value"), jSONObject.optInt("expiresInSec"), jSONObject.optLong("createdMs"));
    }
}
