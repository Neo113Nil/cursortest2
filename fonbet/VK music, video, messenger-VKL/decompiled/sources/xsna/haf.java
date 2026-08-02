package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ClipsTopbarTabsConfig.kt */
/* loaded from: classes16.dex */
public final class haf {
    public static final haf c = new haf(null, false);
    public final boolean a;
    public final List<String> b;

    /* compiled from: ClipsTopbarTabsConfig.kt */
    public static final class a {
        public static haf a(JSONObject jSONObject, boolean z) {
            ArrayList arrayList = null;
            if (jSONObject == null) {
                return new haf(null, z);
            }
            boolean z2 = z || jSONObject.optBoolean("enabled", false);
            JSONArray optJSONArray = jSONObject.optJSONArray("tabs");
            if (optJSONArray != null) {
                k9x q = swe0.q(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList(c5g.u(q, 10));
                j9x it = q.iterator();
                while (it.d) {
                    arrayList2.add(optJSONArray.optString(it.nextInt(), ""));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!drm0.N((String) next)) {
                        arrayList3.add(next);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                }
            }
            return new haf(arrayList, z2);
        }
    }

    public haf(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haf)) {
            return false;
        }
        haf hafVar = (haf) obj;
        return this.a == hafVar.a && epx.f(this.b, hafVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        List<String> list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsTopbarTabsConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", tabKeys=");
        return ms9.a(')', sb, this.b);
    }
}
