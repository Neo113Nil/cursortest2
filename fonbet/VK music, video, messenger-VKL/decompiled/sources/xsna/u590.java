package xsna;

import org.json.JSONObject;

/* compiled from: OwnerState.kt */
/* loaded from: classes18.dex */
public final class u590 {
    public final int a;
    public final String b;
    public final String c;

    public u590(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u590)) {
            return false;
        }
        u590 u590Var = (u590) obj;
        return this.a == u590Var.a && epx.f(this.b, u590Var.b) && epx.f(this.c, u590Var.c);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnerState(state=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", photo=");
        return ho8.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u590(JSONObject jSONObject, String str) {
        this(r0, r1, r5 != null ? r5 : str);
        int optInt = jSONObject.optInt("state");
        String optString = jSONObject.optString("description");
        JSONObject optJSONObject = jSONObject.optJSONObject("photos");
        String optString2 = optJSONObject != null ? optJSONObject.optString("photo_base", optJSONObject.optString("photo_200", optJSONObject.optString("photo_100", optJSONObject.optString("photo_50")))) : null;
    }
}
