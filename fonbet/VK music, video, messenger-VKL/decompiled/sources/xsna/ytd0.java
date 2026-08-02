package xsna;

import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.gs90;

/* compiled from: ProfileButton.kt */
/* loaded from: classes7.dex */
public final class ytd0 {
    public final String a;
    public final String b;
    public final String c;
    public final gs90 d;
    public final WebImage e;
    public final WebImage f;
    public final Integer g;

    /* compiled from: ProfileButton.kt */
    public static final class a {
        public static ytd0 a(JSONObject jSONObject) {
            gs90.a aVar;
            WebImage webImage;
            WebImage webImage2;
            JSONObject jSONObject2 = jSONObject.getJSONObject("action");
            String string = jSONObject2.getString("type");
            JSONArray optJSONArray = jSONObject.optJSONArray("icons");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("icons_additional");
            String string2 = jSONObject.getString("uid");
            if (epx.f(string, "open_app")) {
                Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
                aVar = new gs90.a(WebApiApplication.a.c(jSONObject2.getJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP)));
            } else {
                aVar = null;
            }
            String optString = jSONObject.optString("text");
            if (optJSONArray != null) {
                WebImage.CREATOR.getClass();
                webImage = WebImage.a.a(optJSONArray);
            } else {
                webImage = null;
            }
            if (optJSONArray2 != null) {
                WebImage.CREATOR.getClass();
                webImage2 = WebImage.a.a(optJSONArray2);
            } else {
                webImage2 = null;
            }
            Object opt = jSONObject.opt("badge_counter");
            return new ytd0(string2, string, optString, aVar, webImage, webImage2, opt instanceof Integer ? (Integer) opt : null);
        }
    }

    public ytd0(String str, String str2, String str3, gs90 gs90Var, WebImage webImage, WebImage webImage2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gs90Var;
        this.e = webImage;
        this.f = webImage2;
        this.g = num;
    }

    public static ytd0 a(ytd0 ytd0Var) {
        return new ytd0(ytd0Var.a, ytd0Var.b, ytd0Var.c, ytd0Var.d, ytd0Var.e, ytd0Var.f, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytd0)) {
            return false;
        }
        ytd0 ytd0Var = (ytd0) obj;
        return epx.f(this.a, ytd0Var.a) && epx.f(this.b, ytd0Var.b) && epx.f(this.c, ytd0Var.c) && epx.f(this.d, ytd0Var.d) && epx.f(this.e, ytd0Var.e) && epx.f(this.f, ytd0Var.f) && epx.f(this.g, ytd0Var.g);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        gs90 gs90Var = this.d;
        int hashCode2 = (hashCode + (gs90Var == null ? 0 : gs90Var.hashCode())) * 31;
        WebImage webImage = this.e;
        int hashCode3 = (hashCode2 + (webImage == null ? 0 : webImage.b.hashCode())) * 31;
        WebImage webImage2 = this.f;
        int hashCode4 = (hashCode3 + (webImage2 == null ? 0 : webImage2.b.hashCode())) * 31;
        Integer num = this.g;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileButton(uid=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", payload=");
        sb.append(this.d);
        sb.append(", image=");
        sb.append(this.e);
        sb.append(", imageAdditional=");
        sb.append(this.f);
        sb.append(", badgeCounter=");
        return uqi.b(sb, this.g, ')');
    }
}
