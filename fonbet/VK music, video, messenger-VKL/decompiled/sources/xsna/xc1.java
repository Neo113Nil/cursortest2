package xsna;

import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONObject;

/* compiled from: Album.kt */
/* loaded from: classes18.dex */
public final class xc1 {
    public final String a;
    public final String b;

    public xc1(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "collection");
        this.a = optString;
        this.b = optString2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc1)) {
            return false;
        }
        xc1 xc1Var = (xc1) obj;
        return epx.f(this.a, xc1Var.a) && epx.f(this.b, xc1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Album(type=");
        sb.append(this.a);
        sb.append(", view=");
        return ho8.a(sb, this.b, ')');
    }
}
