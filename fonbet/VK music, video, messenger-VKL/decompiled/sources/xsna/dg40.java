package xsna;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: MusicDeviceRestrictedEventResponse.kt */
/* loaded from: classes3.dex */
public final class dg40 {
    public final long a;
    public final ArrayList b;

    /* compiled from: MusicDeviceRestrictedEventResponse.kt */
    public static final class a implements k7r0<dg40> {
        public static ArrayList b(JSONObject jSONObject) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("events");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    if (epx.f(jSONObject2.optString("entity_type"), "audio")) {
                        arrayList.add(new n450(jSONObject2.getJSONObject("data")));
                    }
                }
            }
            return arrayList;
        }

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                return new dg40(jSONObject.getLong("ts"), b(jSONObject));
            } catch (JSONException e) {
                String jSONObject2 = jSONObject.toString();
                StringBuilder sb = new StringBuilder("Failed to parse response \"");
                int length = jSONObject2.length();
                if (length > 500) {
                    length = 500;
                }
                sb.append(jSONObject2.substring(0, length));
                sb.append('\"');
                throw new RuntimeException(sb.toString(), e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public dg40(long j, ArrayList arrayList) {
        this.a = j;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg40)) {
            return false;
        }
        dg40 dg40Var = (dg40) obj;
        return this.a == dg40Var.a && this.b.equals(dg40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicDeviceRestrictedEventResponse(ts=");
        sb.append(this.a);
        sb.append(", events=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
