package xsna;

import android.os.Bundle;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;

/* compiled from: UtilsResolveExternalPartnerLink.kt */
/* loaded from: classes15.dex */
public final class a4r0 extends rsg0<a> {

    /* compiled from: UtilsResolveExternalPartnerLink.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final Bundle c;

        public a(String str, String str2, Bundle bundle) {
            this.a = str;
            this.b = str2;
            this.c = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            Bundle bundle = this.c;
            return a + (bundle == null ? 0 : bundle.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(url=");
            sb.append(this.a);
            sb.append(", target=");
            sb.append(this.b);
            sb.append(", awayParams=");
            return uf3.c(sb, this.c, ')');
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("action") : null;
        if (optJSONObject2 == null) {
            return null;
        }
        String optString = optJSONObject2.optString("url");
        String optString2 = optJSONObject2.optString("target");
        Serializer.c<AwayLink> cVar = AwayLink.CREATOR;
        return new a(optString, optString2, AwayLink.a.a(optJSONObject2));
    }
}
