package xsna;

import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ProxyCertContent.kt */
/* loaded from: classes.dex */
public final class t9e0 {
    public final String a;

    /* compiled from: ProxyCertContent.kt */
    public static final class a {
        public static List a(String str) {
            if (str == null || drm0.N(str)) {
                return EmptyList.b;
            }
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("certs");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(new t9e0(((JSONObject) jSONArray.get(i)).get("cert").toString()));
                }
                return arrayList;
            } catch (Throwable th) {
                L.i(th);
                return arrayList;
            }
        }
    }

    public t9e0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9e0) && epx.f(this.a, ((t9e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ProxyCertContent(value="), this.a, ')');
    }
}
